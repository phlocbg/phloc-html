/**
 * Copyright (C) 2006-2012 phloc systems
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
package com.phloc.html.js.builder;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collection;

import javax.annotation.Nonnull;

import com.phloc.commons.string.StringHelper;

/**
 * This is a utility class for managing indentation and other basic formatting
 * for {@link PrintWriter}.
 * 
 * @author philip
 */
public class JSFormatter implements Closeable
{
  public static final String DEFAULT_INDENT = "  ";

  /**
   * Current number of indentation strings to print
   */
  private int m_nIndentLevel;

  /**
   * String to be used for each indentation. Defaults to four spaces.
   */
  private final String m_sIndentSpace;

  /**
   * Stream associated with this JFormatter
   */
  private final PrintWriter m_aPW;

  private boolean m_bAtBeginningOfLine = true;

  /**
   * Creates a formatter with default incremental indentations of four spaces.
   */
  public JSFormatter (final Writer w)
  {
    this (new PrintWriter (w));
  }

  /**
   * Creates a formatter with default incremental indentations of four spaces.
   */
  public JSFormatter (final PrintWriter s)
  {
    this (s, DEFAULT_INDENT);
  }

  /**
   * Creates a JFormatter.
   * 
   * @param s
   *        PrintWriter to JFormatter to use.
   * @param space
   *        Incremental indentation string, similar to tab value.
   */
  public JSFormatter (@Nonnull final PrintWriter s, @Nonnull final String space)
  {
    m_aPW = s;
    m_sIndentSpace = space;
  }

  /**
   * Closes this formatter.
   */
  public void close () throws IOException
  {
    m_aPW.close ();
  }

  /**
   * Decrement the indentation level.
   */
  @Nonnull
  public JSFormatter outdent ()
  {
    m_nIndentLevel--;
    return this;
  }

  /**
   * Increment the indentation level.
   */
  @Nonnull
  public JSFormatter indent ()
  {
    m_nIndentLevel++;
    return this;
  }

  private void _spaceIfNeeded ()
  {
    if (m_bAtBeginningOfLine)
    {
      if (m_nIndentLevel > 0)
        m_aPW.print (StringHelper.getRepeated (m_sIndentSpace, m_nIndentLevel));
      m_bAtBeginningOfLine = false;
    }
  }

  /**
   * Print a char into the stream
   * 
   * @param c
   *        the char
   */
  @Nonnull
  public JSFormatter plain (final char c)
  {
    _spaceIfNeeded ();
    m_aPW.print (c);
    return this;
  }

  /**
   * Print a {@link String} into the stream
   * 
   * @param s
   *        the {@link String}
   */
  @Nonnull
  public JSFormatter plain (@Nonnull final String s)
  {
    _spaceIfNeeded ();
    m_aPW.print (s);
    return this;
  }

  /**
   * Print a type name.
   * 
   * @param type
   *        The type whos name is to be printed
   */
  @Nonnull
  public JSFormatter type (@Nonnull final AbstractJSType type)
  {
    plain (type.name ());
    return this;
  }

  /**
   * Print a new line into the stream
   */
  @Nonnull
  public JSFormatter nl ()
  {
    m_aPW.print ('\n');
    m_bAtBeginningOfLine = true;
    return this;
  }

  /**
   * Cause the {@link IJSGeneratable} object to generate source for itself
   * 
   * @param aGeneratable
   *        the {@link IJSGeneratable} object
   */
  @Nonnull
  public JSFormatter generatable (@Nonnull final IJSGeneratable aGeneratable)
  {
    aGeneratable.generate (this);
    return this;
  }

  /**
   * Produces {@link IJSGeneratable}s separated by ','
   */
  @Nonnull
  public JSFormatter generatable (@Nonnull final Collection <? extends IJSGeneratable> aCont)
  {
    boolean first = true;
    for (final IJSGeneratable item : aCont)
    {
      if (first)
        first = false;
      else
        plain (',');
      generatable (item);
    }
    return this;
  }

  /**
   * Cause the {@link IJSDeclaration} to generate source for itself
   * 
   * @param aDeclaration
   *        the {@link IJSDeclaration} object
   */
  @Nonnull
  public JSFormatter decl (@Nonnull final IJSDeclaration aDeclaration)
  {
    aDeclaration.declare (this);
    return this;
  }

  /**
   * Cause the {@link IJSStatement} to generate source for itself
   * 
   * @param aStatement
   *        the {@link IJSStatement} object
   */
  @Nonnull
  public JSFormatter stmt (@Nonnull final IJSStatement aStatement)
  {
    aStatement.state (this);
    return this;
  }

  /**
   * Cause the {@link JSVar} to generate source for itself
   * 
   * @param aVar
   *        the {@link JSVar} object
   */
  @Nonnull
  public JSFormatter var (@Nonnull final JSVar aVar)
  {
    aVar.bind (this);
    return this;
  }
}
