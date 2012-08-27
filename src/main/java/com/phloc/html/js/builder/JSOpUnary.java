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

class JSOpUnary extends AbstractJSExpression
{
  final String m_sOp;
  final IJSExpression m_aExpr;
  final boolean m_bOpFirst;

  JSOpUnary (@Nonnull @Nonempty final String op, @Nonnull final IJSExpression e)
  {
    this (op, e, true);
  }

  JSOpUnary (@Nonnull final IJSExpression e, @Nonnull @Nonempty final String op)
  {
    this (op, e, false);
  }

  private JSOpUnary (@Nonnull final String op, @Nonnull final IJSExpression e, final boolean bOpFirst)
  {
    if (StringHelper.hasNoText (op))
      throw new IllegalArgumentException ("empty operator");
    if (e == null)
      throw new NullPointerException ("expr");
    m_sOp = op;
    m_aExpr = e;
    m_bOpFirst = bOpFirst;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    if (m_bOpFirst)
      f.plain (m_sOp).generatable (m_aExpr);
    else
      f.generatable (m_aExpr).plain (m_sOp);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("op", m_sOp)
                                       .append ("expr", m_aExpr)
                                       .append ("opFirst", m_bOpFirst)
                                       .toString ();
  }
}
