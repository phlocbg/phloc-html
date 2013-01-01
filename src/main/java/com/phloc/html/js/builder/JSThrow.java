/**
 * Copyright (C) 2006-2013 phloc systems
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

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Throw statement
 * 
 * @author philip
 */
public class JSThrow implements IJSStatement
{
  /**
   * Expression to throw
   */
  private final IJSExpression m_aExpr;

  /**
   * constructor
   * 
   * @param aExpr
   *        JExpression which evaluates to JThrow value
   */
  public JSThrow (@Nonnull final IJSExpression aExpr)
  {
    if (aExpr == null)
      throw new NullPointerException ("expr");
    m_aExpr = aExpr;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    f.plain ("throw ").generatable (m_aExpr).plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSThrow rhs = (JSThrow) o;
    return m_aExpr.equals (rhs.m_aExpr);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aExpr).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("expr", m_aExpr).toString ();
  }
}
