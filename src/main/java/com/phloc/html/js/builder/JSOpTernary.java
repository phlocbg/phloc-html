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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

public class JSOpTernary extends AbstractJSExpression
{
  private final IJSExpression m_aExpr1;
  private final String m_sOp1;
  private final IJSExpression m_aExpr2;
  private final String m_sOp2;
  private final IJSExpression m_aExpr3;

  public JSOpTernary (@Nonnull final IJSExpression e1,
                      @Nonnull @Nonempty final String op1,
                      @Nonnull final IJSExpression e2,
                      @Nonnull @Nonempty final String op2,
                      @Nonnull final IJSExpression e3)
  {
    if (e1 == null)
      throw new NullPointerException ("expr1");
    if (StringHelper.hasNoText (op1))
      throw new IllegalArgumentException ("empty operator1");
    if (e2 == null)
      throw new NullPointerException ("expr2");
    if (StringHelper.hasNoText (op2))
      throw new IllegalArgumentException ("empty operator1");
    if (e3 == null)
      throw new NullPointerException ("expr3");

    m_aExpr1 = e1;
    m_sOp1 = op1;
    m_aExpr2 = e2;
    m_sOp2 = op2;
    m_aExpr3 = e3;
  }

  @Nonnull
  public IJSExpression expr1 ()
  {
    return m_aExpr1;
  }

  @Nonnull
  @Nonempty
  public String operator1 ()
  {
    return m_sOp1;
  }

  @Nonnull
  public IJSExpression expr2 ()
  {
    return m_aExpr2;
  }

  @Nonnull
  @Nonempty
  public String operator2 ()
  {
    return m_sOp2;
  }

  @Nonnull
  public IJSExpression expr3 ()
  {
    return m_aExpr3;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain ('(')
     .generatable (m_aExpr1)
     .plain (m_sOp1)
     .generatable (m_aExpr2)
     .plain (m_sOp2)
     .generatable (m_aExpr3)
     .plain (')');
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSOpTernary rhs = (JSOpTernary) o;
    return m_aExpr1.equals (rhs.m_aExpr1) &&
           m_sOp1.equals (rhs.m_sOp1) &&
           m_aExpr2.equals (rhs.m_aExpr2) &&
           m_sOp2.equals (rhs.m_sOp2) &&
           m_aExpr3.equals (rhs.m_aExpr3);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aExpr1)
                                       .append (m_sOp1)
                                       .append (m_aExpr2)
                                       .append (m_sOp2)
                                       .append (m_aExpr3)
                                       .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("expr1", m_aExpr1)
                                       .append ("op1", m_sOp1)
                                       .append ("expr2", m_aExpr2)
                                       .append ("op2", m_sOp2)
                                       .append ("expr3", m_aExpr3)
                                       .toString ();
  }
}
