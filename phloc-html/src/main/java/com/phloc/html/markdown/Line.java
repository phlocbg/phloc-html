/**
 * Copyright (C) 2006-2014 phloc systems
 * http://www.phloc.com
 * office[at]phloc[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.markdown;

import java.util.LinkedList;

import javax.annotation.Nonnull;

/**
 * This class represents a text line.
 * <p>
 * It also provides methods for processing and analyzing a line.
 * </p>
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
final class Line
{
  /** Current cursor position. */
  public int m_nPos;
  /** Leading spaces. */
  public int m_nLeading = 0;
  /** Trailing spaces. */
  public int m_nTrailing = 0;
  /** Is this line empty? */
  public boolean m_bIsEmpty = true;
  /** This line's value. */
  public String m_sValue = null;
  /** Previous line. */
  public Line m_aPrevious = null;
  /** Next line. */
  public Line m_aNext = null;
  /** Is previous line empty? */
  public boolean m_bPrevEmpty;
  /** Final line of a XML block. */
  public Line m_aXmlEndLine;

  /** Constructor. */
  public Line ()
  {}

  /**
   * Calculates leading and trailing spaces. Also sets empty if needed.
   */
  public void init ()
  {
    m_nLeading = 0;
    while (m_nLeading < m_sValue.length () && m_sValue.charAt (m_nLeading) == ' ')
      m_nLeading++;

    if (m_nLeading == m_sValue.length ())
    {
      setEmpty ();
    }
    else
    {
      m_bIsEmpty = false;
      m_nTrailing = 0;
      while (m_sValue.charAt (m_sValue.length () - m_nTrailing - 1) == ' ')
        m_nTrailing++;
    }
  }

  /**
   * Recalculate leading spaces.
   */
  public void initLeading ()
  {
    m_nLeading = 0;
    while (m_nLeading < m_sValue.length () && m_sValue.charAt (m_nLeading) == ' ')
      m_nLeading++;

    if (m_nLeading == m_sValue.length ())
      setEmpty ();
  }

  /**
   * Skips spaces.
   * 
   * @return <code>false</code> if end of line is reached
   */
  public boolean skipSpaces ()
  {
    while (m_nPos < m_sValue.length () && m_sValue.charAt (m_nPos) == ' ')
      m_nPos++;
    return m_nPos < m_sValue.length ();
  }

  /**
   * Reads chars from this line until any 'end' char is reached.
   * 
   * @param end
   *        Delimiting character(s)
   * @return The read String or <code>null</code> if no 'end' char was reached.
   */
  public String readUntil (final char... end)
  {
    final StringBuilder sb = new StringBuilder ();
    int pos = m_nPos;
    while (pos < m_sValue.length ())
    {
      final char ch = m_sValue.charAt (pos);
      if (ch == '\\' && pos + 1 < m_sValue.length ())
      {
        final char c = m_sValue.charAt (pos + 1);
        if (Utils.isEscapeChar (c))
        {
          sb.append (c);
          pos++;
        }
        else
          sb.append (ch);
      }
      else
      {
        boolean endReached = false;
        for (final char element : end)
          if (ch == element)
          {
            endReached = true;
            break;
          }
        if (endReached)
          break;
        sb.append (ch);
      }
      pos++;
    }

    final char ch = pos < m_sValue.length () ? m_sValue.charAt (pos) : '\n';
    for (final char element : end)
      if (ch == element)
      {
        m_nPos = pos;
        return sb.toString ();
      }
    return null;
  }

  /**
   * Marks this line empty. Also sets previous/next line's empty attributes.
   */
  public void setEmpty ()
  {
    m_sValue = "";
    m_nLeading = 0;
    m_nTrailing = 0;
    m_bIsEmpty = true;
    if (m_aNext != null)
      m_aNext.m_bPrevEmpty = true;
  }

  /**
   * Counts the amount of 'ch' in this line.
   * 
   * @param ch
   *        The char to count.
   * @return A value > 0 if this line only consists of 'ch' end spaces.
   */
  private int _countConsecutiveChars (final char ch)
  {
    int count = 0;
    for (int i = 0; i < m_sValue.length (); i++)
    {
      final char c = m_sValue.charAt (i);
      if (c == ' ')
        continue;
      if (c == ch)
      {
        count++;
        continue;
      }
      count = 0;
      break;
    }
    return count;
  }

  /**
   * Counts the amount of 'ch' at the start of this line ignoring spaces.
   * 
   * @param ch
   *        The char to count.
   * @return Number of characters found.
   * @since 0.7
   */
  private int _countCharsStart (final char ch)
  {
    int count = 0;
    for (int i = 0; i < m_sValue.length (); i++)
    {
      final char c = m_sValue.charAt (i);
      if (c == ' ')
        continue;
      if (c != ch)
        break;
      count++;
    }
    return count;
  }

  /**
   * Gets this line's type.
   * 
   * @param bExtendedMode
   *        Whether extended profile is enabled or not
   * @return The LineType.
   */
  @Nonnull
  public ELineType getLineType (final boolean bExtendedMode)
  {
    if (m_bIsEmpty)
      return ELineType.EMPTY;

    if (m_nLeading > 3)
      return ELineType.CODE;

    if (m_sValue.charAt (m_nLeading) == '#')
      return ELineType.HEADLINE;

    if (m_sValue.charAt (m_nLeading) == '>')
      return ELineType.BQUOTE;

    if (bExtendedMode)
    {
      if (m_sValue.length () - m_nLeading - m_nTrailing > 2 &&
          (m_sValue.charAt (m_nLeading) == '`' || m_sValue.charAt (m_nLeading) == '~' || m_sValue.charAt (m_nLeading) == '%'))
      {
        if (_countCharsStart ('`') >= 3)
          return ELineType.FENCED_CODE;

        if (_countCharsStart ('~') >= 3)
          return ELineType.FENCED_CODE;

        if (_countCharsStart ('%') >= 3)
          return ELineType.PLUGIN;
      }
    }

    if (m_sValue.length () - m_nLeading - m_nTrailing > 2 &&
        (m_sValue.charAt (m_nLeading) == '*' || m_sValue.charAt (m_nLeading) == '-' || m_sValue.charAt (m_nLeading) == '_'))
    {
      if (_countConsecutiveChars (m_sValue.charAt (m_nLeading)) >= 3)
        return ELineType.HR;
    }

    if (m_sValue.length () - m_nLeading >= 2 && m_sValue.charAt (m_nLeading + 1) == ' ')
    {
      switch (m_sValue.charAt (m_nLeading))
      {
        case '*':
        case '-':
        case '+':
          return ELineType.ULIST;
      }
    }

    if (m_sValue.length () - m_nLeading >= 3 && Character.isDigit (m_sValue.charAt (m_nLeading)))
    {
      int i = m_nLeading + 1;
      while (i < m_sValue.length () && Character.isDigit (m_sValue.charAt (i)))
        i++;
      if (i + 1 < m_sValue.length () && m_sValue.charAt (i) == '.' && m_sValue.charAt (i + 1) == ' ')
        return ELineType.OLIST;
    }

    if (m_sValue.charAt (m_nLeading) == '<')
    {
      final EHTMLElementType eType = _checkHTML ();
      if (eType == EHTMLElementType.TAG)
        return ELineType.XML;
      if (eType == EHTMLElementType.COMMENT)
        return ELineType.XML_COMMENT;
    }

    if (m_aNext != null && !m_aNext.m_bIsEmpty)
    {
      if (m_aNext.m_sValue.charAt (0) == '-' && m_aNext._countConsecutiveChars ('-') > 0)
        return ELineType.HEADLINE2;
      if (m_aNext.m_sValue.charAt (0) == '=' && m_aNext._countConsecutiveChars ('=') > 0)
        return ELineType.HEADLINE1;
    }

    return ELineType.OTHER;
  }

  /**
   * Reads an XML comment. Sets <code>xmlEndLine</code>.
   * 
   * @param firstLine
   *        The Line to start reading from.
   * @param start
   *        The starting position.
   * @return The new position or -1 if it is no valid comment.
   */
  private int _readXMLComment (final Line firstLine, final int start)
  {
    Line line = firstLine;
    if (start + 3 < line.m_sValue.length ())
    {
      if (line.m_sValue.charAt (2) == '-' && line.m_sValue.charAt (3) == '-')
      {
        int pos = start + 4;
        while (line != null)
        {
          while (pos < line.m_sValue.length () && line.m_sValue.charAt (pos) != '-')
          {
            pos++;
          }
          if (pos == line.m_sValue.length ())
          {
            line = line.m_aNext;
            pos = 0;
          }
          else
          {
            if (pos + 2 < line.m_sValue.length ())
            {
              if (line.m_sValue.charAt (pos + 1) == '-' && line.m_sValue.charAt (pos + 2) == '>')
              {
                m_aXmlEndLine = line;
                return pos + 3;
              }
            }
            pos++;
          }
        }
      }
    }
    return -1;
  }

  /**
   * Checks if this line contains an ID at it's end and removes it from the
   * line.
   * 
   * @return The ID or <code>null</code> if no valid ID exists.
   */
  // FIXME ... hack
  public String stripID ()
  {
    if (m_bIsEmpty || m_sValue.charAt (m_sValue.length () - m_nTrailing - 1) != '}')
      return null;
    int p = m_nLeading;
    boolean found = false;
    while (p < m_sValue.length () && !found)
    {
      switch (m_sValue.charAt (p))
      {
        case '\\':
          if (p + 1 < m_sValue.length ())
          {
            if (m_sValue.charAt (p + 1) == '{')
              p++;
          }
          p++;
          break;
        case '{':
          found = true;
          break;
        default:
          p++;
          break;
      }
    }

    if (found)
    {
      if (p + 1 < m_sValue.length () && m_sValue.charAt (p + 1) == '#')
      {
        final int start = p + 2;
        p = start;
        found = false;
        while (p < m_sValue.length () && !found)
        {
          switch (m_sValue.charAt (p))
          {
            case '\\':
              if (p + 1 < m_sValue.length ())
              {
                switch (m_sValue.charAt (p + 1))
                {
                  case '}':
                    p++;
                    break;
                }
              }
              p++;
              break;
            case '}':
              found = true;
              break;
            default:
              p++;
              break;
          }
        }
        if (found)
        {
          final String id = m_sValue.substring (start, p).trim ();
          if (m_nLeading != 0)
          {
            m_sValue = m_sValue.substring (0, m_nLeading) + m_sValue.substring (m_nLeading, start - 2).trim ();
          }
          else
          {
            m_sValue = m_sValue.substring (m_nLeading, start - 2).trim ();
          }
          m_nTrailing = 0;
          return id.length () > 0 ? id : null;
        }
      }
    }
    return null;
  }

  private static enum EHTMLElementType
  {
    NONE,
    TAG,
    COMMENT;
  }

  /**
   * Checks for a valid HTML block. Sets <code>xmlEndLine</code>.
   * 
   * @return <code>EHTMLType.TAG</code> or <code>EHTMLType.COMMENT</code> if it
   *         is a valid block.
   */
  @Nonnull
  private EHTMLElementType _checkHTML ()
  {
    final LinkedList <String> tags = new LinkedList <String> ();
    final StringBuilder temp = new StringBuilder ();
    int pos = m_nLeading;
    if (m_sValue.charAt (m_nLeading + 1) == '!')
    {
      if (_readXMLComment (this, m_nLeading) > 0)
        return EHTMLElementType.COMMENT;
    }
    pos = Utils.readXMLElement (temp, m_sValue, m_nLeading, false);
    if (pos > -1)
    {
      String element = temp.toString ();
      String tag = Utils.getXMLTag (element);
      if (!HTML.isHtmlBlockElement (tag))
        return EHTMLElementType.NONE;
      if (tag.equals ("hr"))
      {
        m_aXmlEndLine = this;
        return EHTMLElementType.TAG;
      }
      tags.add (tag);
      Line line = this;
      while (line != null)
      {
        while (pos < line.m_sValue.length () && line.m_sValue.charAt (pos) != '<')
          pos++;

        if (pos >= line.m_sValue.length ())
        {
          line = line.m_aNext;
          pos = 0;
        }
        else
        {
          temp.setLength (0);
          final int newPos = Utils.readXMLElement (temp, line.m_sValue, pos, false);
          if (newPos > 0)
          {
            element = temp.toString ();
            tag = Utils.getXMLTag (element);
            if (HTML.isHtmlBlockElement (tag) && !tag.equals ("hr"))
            {
              if (element.charAt (1) == '/')
              {
                if (!tags.getLast ().equals (tag))
                  return EHTMLElementType.NONE;
                tags.removeLast ();
              }
              else
              {
                tags.addLast (tag);
              }
            }
            if (tags.isEmpty ())
            {
              m_aXmlEndLine = line;
              break;
            }
            pos = newPos;
          }
          else
          {
            pos++;
          }
        }
      }
      if (tags.isEmpty ())
        return EHTMLElementType.TAG;
    }
    return EHTMLElementType.NONE;
  }
}
