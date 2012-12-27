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

import javax.annotation.Nonnull;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * RegEx literal.
 * 
 * @author philip
 */
public class JSRegExLiteral extends AbstractJSExpression
{
  private final String m_sRegEx;
  private boolean m_bGlobal = false;
  private boolean m_bCaseInsensitive = false;
  private boolean m_bMultiLine = false;

  public JSRegExLiteral (@Nonnull final String sRegEx)
  {
    if (sRegEx == null)
      throw new NullPointerException ("regex");
    m_sRegEx = sRegEx;
  }

  public boolean global ()
  {
    return m_bGlobal;
  }

  @Nonnull
  public JSRegExLiteral global (final boolean bGlobal)
  {
    m_bGlobal = bGlobal;
    return this;
  }

  public boolean caseInsensitive ()
  {
    return m_bCaseInsensitive;
  }

  @Nonnull
  public JSRegExLiteral caseInsensitive (final boolean bCaseInsensitive)
  {
    m_bCaseInsensitive = bCaseInsensitive;
    return this;
  }

  public boolean multiLine ()
  {
    return m_bMultiLine;
  }

  @Nonnull
  public JSRegExLiteral multiLine (final boolean bMultiLine)
  {
    m_bMultiLine = bMultiLine;
    return this;
  }

  @Nonnull
  public JSRegExLiteral gim (final boolean bGlobal, final boolean bCaseInsensitive, final boolean bMultiLine)
  {
    global (bGlobal);
    caseInsensitive (bCaseInsensitive);
    multiLine (bMultiLine);
    return this;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ('/').plain (m_sRegEx).plain ('/');
    if (m_bGlobal)
      f.plain ('g');
    if (m_bCaseInsensitive)
      f.plain ('i');
    if (m_bMultiLine)
      f.plain ('m');
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSRegExLiteral rhs = (JSRegExLiteral) o;
    return m_sRegEx.equals (rhs.m_sRegEx) &&
           m_bGlobal == rhs.m_bGlobal &&
           m_bCaseInsensitive == rhs.m_bCaseInsensitive &&
           m_bMultiLine == rhs.m_bMultiLine;
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ())
                            .append (m_sRegEx)
                            .append (m_bGlobal)
                            .append (m_bCaseInsensitive)
                            .append (m_bMultiLine)
                            .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("regex", m_sRegEx)
                            .append ("global", m_bGlobal)
                            .append ("caseInsensitive", m_bCaseInsensitive)
                            .append ("multiLine", m_bMultiLine)
                            .toString ();
  }
}
