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
 * delete statement
 * 
 * @author philip
 */
final class JSDelete implements IJSStatement
{
  private final IJSExpression m_aExpr;

  /**
   * constructor
   * 
   * @param expr
   *        expression to delete. May not be <code>null</code>.
   */
  JSDelete (@Nonnull final IJSExpression expr)
  {
    if (expr == null)
      throw new NullPointerException ("expr");
    m_aExpr = expr;
  }

  public void state (final JSFormatter f)
  {
    f.plain ("delete ").generatable (m_aExpr).plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }
}
