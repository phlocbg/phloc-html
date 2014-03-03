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

import java.io.IOException;
import java.io.Reader;
import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.WillClose;

import com.phloc.commons.io.streams.NonBlockingStringReader;
import com.phloc.commons.io.streams.StreamUtils;
import com.phloc.commons.string.StringHelper;

/**
 * Markdown processor class.
 * <p>
 * Example usage:
 * </p>
 * 
 * <pre>
 * <code>String result = Processor.process("This is ***TXTMARK***");
 * </code>
 * </pre>
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
public class MarkdownProcessor
{
  /** The emitter. */
  private final Emitter m_aEmitter;
  /** The Configuration. */
  final MarkdownConfiguration m_aConfig;
  /** Extension flag. */
  private boolean m_bUseExtensions;

  public MarkdownProcessor ()
  {
    this (MarkdownConfiguration.DEFAULT);
  }

  /**
   * Constructor.
   * 
   * @param aConfig
   *        The configuration to use. May not be <code>null</code>.
   */
  public MarkdownProcessor (@Nonnull final MarkdownConfiguration aConfig)
  {
    if (aConfig == null)
      throw new NullPointerException ("Config");
    m_aConfig = aConfig;
    m_bUseExtensions = aConfig.isExtendedProfile ();
    m_aEmitter = new Emitter (m_aConfig);
  }

  /**
   * Reads all lines from our reader.
   * <p>
   * Takes care of markdown link references.
   * </p>
   * 
   * @return A Block containing all lines.
   * @throws IOException
   *         If an IO error occurred.
   */
  @Nonnull
  private Block _readLines (@Nonnull final Reader aReader) throws IOException
  {
    final Block block = new Block ();
    final StringBuilder sb = new StringBuilder (80);
    int c = aReader.read ();
    LinkRef lastLinkRef = null;
    while (c != -1)
    {
      sb.setLength (0);
      int pos = 0;
      boolean eol = false;
      while (!eol)
      {
        switch (c)
        {
          case -1:
            eol = true;
            break;
          case '\n':
            c = aReader.read ();
            if (c == '\r')
              c = aReader.read ();
            eol = true;
            break;
          case '\r':
            c = aReader.read ();
            if (c == '\n')
              c = aReader.read ();
            eol = true;
            break;
          case '\t':
          {
            final int np = pos + (4 - (pos & 3));
            while (pos < np)
            {
              sb.append (' ');
              pos++;
            }
            c = aReader.read ();
            break;
          }
          default:
            pos++;
            sb.append ((char) c);
            c = aReader.read ();
            break;
        }
      }

      final Line line = new Line ();
      line.m_sValue = sb.toString ();
      line.init ();

      // Check for link definitions
      boolean isLinkRef = false;
      String id = null, link = null, comment = null;
      if (!line.m_bIsEmpty && line.m_nLeading < 4 && line.m_sValue.charAt (line.m_nLeading) == '[')
      {
        line.m_nPos = line.m_nLeading + 1;
        // Read ID up to ']'
        id = line.readUntil (']');
        // Is ID valid and are there any more characters?
        if (id != null && line.m_nPos + 2 < line.m_sValue.length ())
        {
          // Check for ':' ([...]:...)
          if (line.m_sValue.charAt (line.m_nPos + 1) == ':')
          {
            line.m_nPos += 2;
            line.skipSpaces ();
            // Check for link syntax
            if (line.m_sValue.charAt (line.m_nPos) == '<')
            {
              line.m_nPos++;
              link = line.readUntil ('>');
              line.m_nPos++;
            }
            else
              link = line.readUntil (' ', '\n');

            // Is link valid?
            if (link != null)
            {
              // Any non-whitespace characters following?
              if (line.skipSpaces ())
              {
                final char ch = line.m_sValue.charAt (line.m_nPos);
                // Read comment
                if (ch == '\"' || ch == '\'' || ch == '(')
                {
                  line.m_nPos++;
                  comment = line.readUntil (ch == '(' ? ')' : ch);
                  // Valid linkRef only if comment is valid
                  if (comment != null)
                    isLinkRef = true;
                }
              }
              else
                isLinkRef = true;
            }
          }
        }
      }

      // To make compiler happy: add != null checks
      if (isLinkRef && id != null && link != null)
      {
        if (id.toLowerCase (Locale.US).equals ("$profile$"))
        {
          m_aEmitter.m_bUseExtensions = m_bUseExtensions = link.toLowerCase (Locale.US).equals ("extended");
          lastLinkRef = null;
        }
        else
        {
          // Store linkRef and skip line
          final LinkRef lr = new LinkRef (link, comment, comment != null &&
                                                         (link.length () == 1 && link.charAt (0) == '*'));
          m_aEmitter.addLinkRef (id, lr);
          if (comment == null)
            lastLinkRef = lr;
        }
      }
      else
      {
        comment = null;
        // Check for multi-line linkRef
        if (!line.m_bIsEmpty && lastLinkRef != null)
        {
          line.m_nPos = line.m_nLeading;
          final char ch = line.m_sValue.charAt (line.m_nPos);
          if (ch == '\"' || ch == '\'' || ch == '(')
          {
            line.m_nPos++;
            comment = line.readUntil (ch == '(' ? ')' : ch);
          }
          if (comment != null)
            lastLinkRef.setTitle (comment);

          lastLinkRef = null;
        }

        // No multi-line linkRef, store line
        if (comment == null)
        {
          line.m_nPos = 0;
          block.appendLine (line);
        }
      }
    }

    return block;
  }

  /**
   * Initializes a list block by separating it into list item blocks.
   * 
   * @param aRoot
   *        The Block to process.
   */
  private void _initListBlock (@Nonnull final Block aRoot)
  {
    Line aLine = aRoot.m_aLines;
    aLine = aLine.m_aNext;
    while (aLine != null)
    {
      final ELineType t = aLine.getLineType (m_bUseExtensions);
      if (t == ELineType.OLIST ||
          t == ELineType.ULIST ||
          (!aLine.m_bIsEmpty && aLine.m_bPrevEmpty && aLine.m_nLeading == 0 && !(t == ELineType.OLIST || t == ELineType.ULIST)))
      {
        aRoot.split (aLine.m_aPrevious).m_eType = EBlockType.LIST_ITEM;
      }
      aLine = aLine.m_aNext;
    }
    aRoot.split (aRoot.m_aLineTail).m_eType = EBlockType.LIST_ITEM;
  }

  /**
   * Recursively process the given Block.
   * 
   * @param aRoot
   *        The Block to process.
   * @param listMode
   *        Flag indicating that we're in a list item block.
   */
  private void _recurse (@Nonnull final Block aRoot, final boolean listMode)
  {
    Block block, list;
    Line aLine = aRoot.m_aLines;

    if (listMode)
    {
      aRoot.removeListIndent (m_bUseExtensions);
      if (m_bUseExtensions && aRoot.m_aLines != null && aRoot.m_aLines.getLineType (m_bUseExtensions) != ELineType.CODE)
      {
        aRoot.m_sId = aRoot.m_aLines.stripID ();
      }
    }

    while (aLine != null && aLine.m_bIsEmpty)
      aLine = aLine.m_aNext;
    if (aLine == null)
      return;

    while (aLine != null)
    {
      final ELineType type = aLine.getLineType (m_bUseExtensions);
      switch (type)
      {
        case OTHER:
        {
          final boolean wasEmpty = aLine.m_bPrevEmpty;
          while (aLine != null && !aLine.m_bIsEmpty)
          {
            final ELineType t = aLine.getLineType (m_bUseExtensions);
            if ((listMode || m_bUseExtensions) && (t == ELineType.OLIST || t == ELineType.ULIST))
              break;
            if (m_bUseExtensions && (t == ELineType.CODE || t == ELineType.FENCED_CODE || t == ELineType.PLUGIN))
              break;
            if (t == ELineType.HEADLINE ||
                t == ELineType.HEADLINE1 ||
                t == ELineType.HEADLINE2 ||
                t == ELineType.HR ||
                t == ELineType.BQUOTE ||
                t == ELineType.XML ||
                t == ELineType.XML_COMMENT)
              break;
            aLine = aLine.m_aNext;
          }
          final EBlockType bt;
          if (aLine != null && !aLine.m_bIsEmpty)
          {
            bt = (listMode && !wasEmpty) ? EBlockType.NONE : EBlockType.PARAGRAPH;
            aRoot.split (aLine.m_aPrevious).m_eType = bt;
            aRoot.removeLeadingEmptyLines ();
          }
          else
          {
            bt = (listMode && (aLine == null || !aLine.m_bIsEmpty) && !wasEmpty) ? EBlockType.NONE
                                                                                : EBlockType.PARAGRAPH;
            aRoot.split (aLine == null ? aRoot.m_aLineTail : aLine).m_eType = bt;
            aRoot.removeLeadingEmptyLines ();
          }
          aLine = aRoot.m_aLines;
          break;
        }
        case CODE:
          while (aLine != null && (aLine.m_bIsEmpty || aLine.m_nLeading > 3))
          {
            aLine = aLine.m_aNext;
          }
          block = aRoot.split (aLine != null ? aLine.m_aPrevious : aRoot.m_aLineTail);
          block.m_eType = EBlockType.CODE;
          block.removeSurroundingEmptyLines ();
          break;
        case XML:
        case XML_COMMENT:
          if (aLine.m_aPrevious != null)
          {
            // FIXME ... this looks wrong
            aRoot.split (aLine.m_aPrevious);
          }
          aRoot.split (aLine.m_aXmlEndLine).m_eType = type == ELineType.XML ? EBlockType.XML : EBlockType.XML_COMMENT;
          aRoot.removeLeadingEmptyLines ();
          aLine = aRoot.m_aLines;
          break;
        case BQUOTE:
          while (aLine != null)
          {
            if (!aLine.m_bIsEmpty &&
                aLine.m_bPrevEmpty &&
                aLine.m_nLeading == 0 &&
                aLine.getLineType (m_bUseExtensions) != ELineType.BQUOTE)
              break;
            aLine = aLine.m_aNext;
          }
          block = aRoot.split (aLine != null ? aLine.m_aPrevious : aRoot.m_aLineTail);
          block.m_eType = EBlockType.BLOCKQUOTE;
          block.removeSurroundingEmptyLines ();
          block.removeBlockQuotePrefix ();
          _recurse (block, false);
          aLine = aRoot.m_aLines;
          break;
        case HR:
          if (aLine.m_aPrevious != null)
          {
            // FIXME ... this looks wrong
            aRoot.split (aLine.m_aPrevious);
          }
          aRoot.split (aLine).m_eType = EBlockType.RULER;
          aRoot.removeLeadingEmptyLines ();
          aLine = aRoot.m_aLines;
          break;
        case FENCED_CODE:
          aLine = aLine.m_aNext;
          while (aLine != null)
          {
            if (aLine.getLineType (m_bUseExtensions) == ELineType.FENCED_CODE)
              break;
            // TODO ... is this really necessary? Maybe add a special
            // flag?
            aLine = aLine.m_aNext;
          }
          if (aLine != null)
            aLine = aLine.m_aNext;
          block = aRoot.split (aLine != null ? aLine.m_aPrevious : aRoot.m_aLineTail);
          block.m_eType = EBlockType.FENCED_CODE;
          block.m_sMeta = Utils.getMetaFromFence (block.m_aLines.m_sValue);
          block.m_aLines.setEmpty ();
          if (block.m_aLineTail.getLineType (m_bUseExtensions) == ELineType.FENCED_CODE)
            block.m_aLineTail.setEmpty ();
          block.removeSurroundingEmptyLines ();
          break;
        case PLUGIN:
          aLine = aLine.m_aNext;
          while (aLine != null)
          {
            if (aLine.getLineType (m_bUseExtensions) == ELineType.PLUGIN)
              break;
            // TODO ... is this really necessary? Maybe add a special
            // flag?
            aLine = aLine.m_aNext;
          }
          if (aLine != null)
            aLine = aLine.m_aNext;
          block = aRoot.split (aLine != null ? aLine.m_aPrevious : aRoot.m_aLineTail);
          block.m_eType = EBlockType.PLUGIN;
          block.m_sMeta = Utils.getMetaFromFence (block.m_aLines.m_sValue);
          block.m_aLines.setEmpty ();
          if (block.m_aLineTail.getLineType (m_bUseExtensions) == ELineType.PLUGIN)
            block.m_aLineTail.setEmpty ();
          block.removeSurroundingEmptyLines ();
          break;
        case HEADLINE:
        case HEADLINE1:
        case HEADLINE2:
          if (aLine.m_aPrevious != null)
          {
            aRoot.split (aLine.m_aPrevious);
          }
          if (type != ELineType.HEADLINE)
          {
            aLine.m_aNext.setEmpty ();
          }
          block = aRoot.split (aLine);
          block.m_eType = EBlockType.HEADLINE;
          if (type != ELineType.HEADLINE)
            block.m_nHlDepth = type == ELineType.HEADLINE1 ? 1 : 2;
          if (m_bUseExtensions)
            block.m_sId = block.m_aLines.stripID ();
          block.transfromHeadline ();
          aRoot.removeLeadingEmptyLines ();
          aLine = aRoot.m_aLines;
          break;
        case OLIST:
        case ULIST:
          while (aLine != null)
          {
            final ELineType t = aLine.getLineType (m_bUseExtensions);
            if (!aLine.m_bIsEmpty &&
                (aLine.m_bPrevEmpty && aLine.m_nLeading == 0 && !(t == ELineType.OLIST || t == ELineType.ULIST)))
              break;
            aLine = aLine.m_aNext;
          }
          list = aRoot.split (aLine != null ? aLine.m_aPrevious : aRoot.m_aLineTail);
          list.m_eType = type == ELineType.OLIST ? EBlockType.ORDERED_LIST : EBlockType.UNORDERED_LIST;
          list.m_aLines.m_bPrevEmpty = false;
          list.removeSurroundingEmptyLines ();
          list.m_aLines.m_bPrevEmpty = false;
          _initListBlock (list);
          block = list.m_aBlocks;
          while (block != null)
          {
            _recurse (block, true);
            block = block.m_aNext;
          }
          list.expandListParagraphs ();
          break;
        default:
          aLine = aLine.m_aNext;
          break;
      }
    }
  }

  @Nonnull
  public MarkdownProcessingResult process (@Nullable final String sText) throws IOException
  {
    return process (new NonBlockingStringReader (StringHelper.getNotNull (sText)));
  }

  /**
   * Does all the processing.
   * 
   * @return The processing result.
   * @throws IOException
   *         If an IO error occurred.
   */
  @Nonnull
  public MarkdownProcessingResult process (@Nonnull @WillClose final Reader aReader) throws IOException
  {
    try
    {
      final Block aParent = _readLines (aReader);
      aParent.removeSurroundingEmptyLines ();
      _recurse (aParent, false);

      final HCStack aOut = new HCStack ();
      Block aBlock = aParent.m_aBlocks;
      while (aBlock != null)
      {
        m_aEmitter.emit (aOut, aBlock);
        aBlock = aBlock.m_aNext;
      }
      return new MarkdownProcessingResult (aOut);
    }
    finally
    {
      StreamUtils.close (aReader);
    }
  }
}
