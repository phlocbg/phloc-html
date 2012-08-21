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

/**
 * Do loops
 * 
 * @author philip
 */
public class JSDoLoop implements IJSStatement
{
  /**
   * Test part of Do statement for determining exit state
   */
  private final IJSExpression m_aTest;

  /**
   * JBlock of statements which makes up body of this Do statement
   */
  private JSBlock m_aBody;

  /**
   * Constructor
   */
  JSDoLoop (@Nonnull final IJSExpression test)
  {
    m_aTest = test;
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
    f.plain ("do");
    if (m_aBody != null)
      f.generatable (m_aBody);
    else
      f.plain ("{}");

    if (JSOp.hasTopOp (m_aTest))
      f.plain ("while ").generatable (m_aTest);
    else
      f.plain ("while (").generatable (m_aTest).plain (')');
    f.plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }
}
