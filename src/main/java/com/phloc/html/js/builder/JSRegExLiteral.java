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

/**
 * RegEx literal.
 * 
 * @author philip
 */
public class JSRegExLiteral extends AbstractJSExpressionImpl
{
  private final String m_sRegEx;
  private boolean m_bGlobal = false;
  private boolean m_bCaseInsensitive = false;
  private boolean m_bMultiLine = false;

  JSRegExLiteral (@Nonnull final String sRegEx)
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
}
