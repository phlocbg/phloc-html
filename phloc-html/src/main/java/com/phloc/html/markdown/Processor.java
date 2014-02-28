/*
 * Copyright (C) 2011 René Jeschke <rene_jeschke@yahoo.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.markdown;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import javax.annotation.Nonnull;

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
public class Processor
{
  /** The reader. */
  private final Reader m_aReader;
  /** The emitter. */
  private final Emitter m_aEmitter;
  /** The Configuration. */
  final Configuration m_aConfig;
  /** Extension flag. */
  private boolean m_bUseExtensions = false;

  /**
   * Constructor.
   * 
   * @param reader
   *        The input reader.
   */
  protected Processor (final Reader reader, final Configuration config)
  {
    m_aReader = reader;
    m_aConfig = config;
    m_bUseExtensions = config.m_bForceExtendedProfile;
    m_aEmitter = new Emitter (m_aConfig);
  }

  /**
   * Transforms an input stream into HTML using the given Configuration.
   * 
   * @param reader
   *        The Reader to process.
   * @param configuration
   *        The Configuration.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @since 0.7
   * @see Configuration
   */
  public static final String process (final Reader reader, final Configuration configuration) throws IOException
  {
    final Processor p = new Processor (StreamUtils.getBuffered (reader), configuration);
    return p._process ();
  }

  /**
   * Transforms an input String into HTML using the given Configuration.
   * 
   * @param input
   *        The String to process.
   * @param configuration
   *        The Configuration.
   * @return The processed String.
   * @since 0.7
   * @see Configuration
   */
  public static final String process (final String input, final Configuration configuration)
  {
    try
    {
      return process (new StringReader (input), configuration);
    }
    catch (final IOException e)
    {
      // This _can never_ happen
      return null;
    }
  }

  /**
   * Transforms an input file into HTML using the given Configuration.
   * 
   * @param file
   *        The File to process.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @since 0.7
   * @see Configuration
   */
  public static final String process (final File file, final Configuration configuration) throws IOException
  {
    final FileInputStream input = new FileInputStream (file);
    final String ret = process (input, configuration);
    input.close ();
    return ret;
  }

  /**
   * Transforms an input stream into HTML using the given Configuration.
   * 
   * @param input
   *        The InputStream to process.
   * @param configuration
   *        The Configuration.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @since 0.7
   * @see Configuration
   */
  public static final String process (final InputStream input, final Configuration configuration) throws IOException
  {
    final Processor p = new Processor (new BufferedReader (new InputStreamReader (input, configuration.m_sEncoding)),
                                       configuration);
    return p._process ();
  }

  /**
   * Transforms an input String into HTML using the default Configuration.
   * 
   * @param input
   *        The String to process.
   * @return The processed String.
   * @see Configuration#DEFAULT
   */
  public static final String process (final String input)
  {
    return process (StringHelper.getNotNull (input), Configuration.DEFAULT);
  }

  /**
   * Transforms an input String into HTML.
   * 
   * @param input
   *        The String to process.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @see Configuration#DEFAULT
   */
  public static final String process (final String input, final boolean safeMode)
  {
    return process (input, Configuration.builder ().setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input String into HTML.
   * 
   * @param input
   *        The String to process.
   * @param decorator
   *        The decorator to use.
   * @return The processed String.
   * @see Configuration#DEFAULT
   */
  public static final String process (final String input, final IDecorator decorator)
  {
    return process (input, Configuration.builder ().setDecorator (decorator).build ());
  }

  /**
   * Transforms an input String into HTML.
   * 
   * @param input
   *        The String to process.
   * @param decorator
   *        The decorator to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @see Configuration#DEFAULT
   */
  public static final String process (final String input, final IDecorator decorator, final boolean safeMode)
  {
    return process (input, Configuration.builder ().setDecorator (decorator).setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input file into HTML using the default Configuration.
   * 
   * @param file
   *        The File to process.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file) throws IOException
  {
    return process (file, Configuration.DEFAULT);
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file, final boolean safeMode) throws IOException
  {
    return process (file, Configuration.builder ().setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param decorator
   *        The decorator to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file, final IDecorator decorator) throws IOException
  {
    return process (file, Configuration.builder ().setDecorator (decorator).build ());
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param decorator
   *        The decorator to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file, final IDecorator decorator, final boolean safeMode) throws IOException
  {
    return process (file, Configuration.builder ().setDecorator (decorator).setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param encoding
   *        The encoding to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file, final String encoding) throws IOException
  {
    return process (file, Configuration.builder ().setEncoding (encoding).build ());
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param encoding
   *        The encoding to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file, final String encoding, final boolean safeMode) throws IOException
  {
    return process (file, Configuration.builder ().setEncoding (encoding).setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param encoding
   *        The encoding to use.
   * @param decorator
   *        The decorator to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file, final String encoding, final IDecorator decorator) throws IOException
  {
    return process (file, Configuration.builder ().setEncoding (encoding).setDecorator (decorator).build ());
  }

  /**
   * Transforms an input file into HTML.
   * 
   * @param file
   *        The File to process.
   * @param encoding
   *        The encoding to use.
   * @param decorator
   *        The decorator to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final File file,
                                      final String encoding,
                                      final IDecorator decorator,
                                      final boolean safeMode) throws IOException
  {
    return process (file,
                    Configuration.builder ()
                                 .setEncoding (encoding)
                                 .setSafeMode (safeMode)
                                 .setDecorator (decorator)
                                 .build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input) throws IOException
  {
    return process (input, Configuration.DEFAULT);
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input, final boolean safeMode) throws IOException
  {
    return process (input, Configuration.builder ().setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param decorator
   *        The decorator to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input, final IDecorator decorator) throws IOException
  {
    return process (input, Configuration.builder ().setDecorator (decorator).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param decorator
   *        The decorator to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input, final IDecorator decorator, final boolean safeMode) throws IOException
  {
    return process (input, Configuration.builder ().setDecorator (decorator).setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param encoding
   *        The encoding to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input, final String encoding) throws IOException
  {
    return process (input, Configuration.builder ().setEncoding (encoding).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param encoding
   *        The encoding to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input, final String encoding, final boolean safeMode) throws IOException
  {
    return process (input, Configuration.builder ().setEncoding (encoding).setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param encoding
   *        The encoding to use.
   * @param decorator
   *        The decorator to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input, final String encoding, final IDecorator decorator) throws IOException
  {
    return process (input, Configuration.builder ().setEncoding (encoding).setDecorator (decorator).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param input
   *        The InputStream to process.
   * @param encoding
   *        The encoding to use.
   * @param decorator
   *        The decorator to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final InputStream input,
                                      final String encoding,
                                      final IDecorator decorator,
                                      final boolean safeMode) throws IOException
  {
    return process (input,
                    Configuration.builder ()
                                 .setEncoding (encoding)
                                 .setDecorator (decorator)
                                 .setSafeMode (safeMode)
                                 .build ());
  }

  /**
   * Transforms an input stream into HTML using the default Configuration.
   * 
   * @param reader
   *        The Reader to process.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final Reader reader) throws IOException
  {
    return process (reader, Configuration.DEFAULT);
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param reader
   *        The Reader to process.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final Reader reader, final boolean safeMode) throws IOException
  {
    return process (reader, Configuration.builder ().setSafeMode (safeMode).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param reader
   *        The Reader to process.
   * @param decorator
   *        The decorator to use.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final Reader reader, final IDecorator decorator) throws IOException
  {
    return process (reader, Configuration.builder ().setDecorator (decorator).build ());
  }

  /**
   * Transforms an input stream into HTML.
   * 
   * @param reader
   *        The Reader to process.
   * @param decorator
   *        The decorator to use.
   * @param safeMode
   *        Set to <code>true</code> to escape unsafe HTML tags.
   * @return The processed String.
   * @throws IOException
   *         if an IO error occurs
   * @see Configuration#DEFAULT
   */
  public static final String process (final Reader reader, final IDecorator decorator, final boolean safeMode) throws IOException
  {
    return process (reader, Configuration.builder ().setDecorator (decorator).setSafeMode (safeMode).build ());
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
  private Block _readLines () throws IOException
  {
    final Block block = new Block ();
    final StringBuilder sb = new StringBuilder (80);
    int c = m_aReader.read ();
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
            c = m_aReader.read ();
            if (c == '\r')
              c = m_aReader.read ();
            eol = true;
            break;
          case '\r':
            c = m_aReader.read ();
            if (c == '\n')
              c = m_aReader.read ();
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
            c = m_aReader.read ();
            break;
          }
          default:
            pos++;
            sb.append ((char) c);
            c = m_aReader.read ();
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
        if (id.toLowerCase ().equals ("$profile$"))
        {
          m_aEmitter.m_bUseExtensions = m_bUseExtensions = link.toLowerCase ().equals ("extended");
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
            lastLinkRef.m_sTitle = comment;

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
   * @param root
   *        The Block to process.
   */
  private void _initListBlock (final Block root)
  {
    Line aLine = root.m_aLines;
    aLine = aLine.m_aNext;
    while (aLine != null)
    {
      final ELineType t = aLine.getLineType (m_bUseExtensions);
      if (t == ELineType.OLIST ||
          t == ELineType.ULIST ||
          (!aLine.m_bIsEmpty && (aLine.m_bPrevEmpty && aLine.m_nLeading == 0 && !(t == ELineType.OLIST || t == ELineType.ULIST))))
      {
        root.split (aLine.m_aPrevious).m_eType = EBlockType.LIST_ITEM;
      }
      aLine = aLine.m_aNext;
    }
    root.split (root.m_aLineTail).m_eType = EBlockType.LIST_ITEM;
  }

  /**
   * Recursively process the given Block.
   * 
   * @param aRoot
   *        The Block to process.
   * @param listMode
   *        Flag indicating that we're in a list item block.
   */
  private void _recurse (final Block aRoot, final boolean listMode)
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
                t == ELineType.XML)
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
          if (aLine.m_aPrevious != null)
          {
            // FIXME ... this looks wrong
            aRoot.split (aLine.m_aPrevious);
          }
          aRoot.split (aLine.m_aXmlEndLine).m_eType = EBlockType.XML;
          aRoot.removeLeadingEmptyLines ();
          aLine = aRoot.m_aLines;
          break;
        case BQUOTE:
          while (aLine != null)
          {
            if (!aLine.m_bIsEmpty &&
                (aLine.m_bPrevEmpty && aLine.m_nLeading == 0 && aLine.getLineType (m_bUseExtensions) != ELineType.BQUOTE))
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
          list.m_aLineTail.m_bNextEmpty = false;
          list.removeSurroundingEmptyLines ();
          list.m_aLines.m_bPrevEmpty = list.m_aLineTail.m_bNextEmpty = false;
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

  /**
   * Does all the processing.
   * 
   * @return The processed String.
   * @throws IOException
   *         If an IO error occurred.
   */
  @Nonnull
  private String _process () throws IOException
  {
    final Block parent = _readLines ();
    parent.removeSurroundingEmptyLines ();
    _recurse (parent, false);

    final StringBuilder out = new StringBuilder ();

    Block block = parent.m_aBlocks;
    while (block != null)
    {
      m_aEmitter.emit (out, block);
      block = block.m_aNext;
    }
    return out.toString ();
  }
}
