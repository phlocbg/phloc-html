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
 * Throw statement
 * 
 * @author philip
 */
final class JSThrow implements IJSStatement
{
  /**
   * Expression to throw
   */
  private final IJSExpression m_aExpr;

  /**
   * constructor
   * 
   * @param expr
   *        JExpression which evaluates to JThrow value
   */
  JSThrow (@Nonnull final IJSExpression expr)
  {
    m_aExpr = expr;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    f.plain ("throw ");
    f.generatable (m_aExpr);
    f.plain (';').nl ();
  }
}
