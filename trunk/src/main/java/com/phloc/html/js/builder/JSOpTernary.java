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
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

class JSOpTernary extends AbstractJSExpression
{
  private final IJSExpression m_aExpr1;
  private final String m_sOp1;
  private final IJSExpression m_aExpr2;
  private final String m_sOp2;
  private final IJSExpression m_aExpr3;

  JSOpTernary (@Nonnull final IJSExpression e1,
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