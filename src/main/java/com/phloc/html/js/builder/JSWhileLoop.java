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
import javax.annotation.Nullable;

import com.phloc.commons.string.ToStringGenerator;

/**
 * While statement
 * 
 * @author philip
 */
public class JSWhileLoop implements IJSStatement
{
  /**
   * Test part of While statement for determining exit state
   */
  private final IJSExpression m_aTest;

  /**
   * JBlock of statements which makes up body of this While statement
   */
  private JSBlock m_aBody;

  /**
   * Construct a While statement
   */
  public JSWhileLoop (@Nonnull final IJSExpression test)
  {
    m_aTest = test;
  }

  @Nonnull
  public IJSExpression test ()
  {
    return m_aTest;
  }

  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ();
    return m_aBody;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    if (JSOp.hasOperator (m_aTest))
      f.plain ("while ").generatable (m_aTest);
    else
      f.plain ("while (").generatable (m_aTest).plain (')');
    if (m_aBody != null)
      f.stmt (m_aBody);
    else
      f.plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("test", m_aTest).append ("body", m_aBody).toString ();
  }
}
