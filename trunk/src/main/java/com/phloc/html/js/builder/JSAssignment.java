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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Assignment statements, which are also expressions.
 * 
 * @author philip
 */
public class JSAssignment extends AbstractJSExpression implements IJSStatement
{
  private final IJSAssignmentTarget m_aLhs;
  private final String m_sOp;
  private final IJSExpression m_aRhs;

  public JSAssignment (@Nonnull final IJSAssignmentTarget lhs,
                       @Nonnull @Nonempty final String op,
                       @Nonnull final IJSExpression rhs)
  {
    if (lhs == null)
      throw new NullPointerException ("lhs");
    if (StringHelper.hasNoText (op))
      throw new IllegalArgumentException ("operator is empty");
    if (rhs == null)
      throw new NullPointerException ("rhs");

    m_aLhs = lhs;
    m_sOp = op;
    m_aRhs = rhs;
  }

  public void generate (final JSFormatter f)
  {
    f.generatable (m_aLhs).plain (m_sOp).generatable (m_aRhs);
  }

  public void state (final JSFormatter f)
  {
    f.generatable (this).plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString ((IJSStatement) this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("lhs", m_aLhs).append ("op", m_sOp).append ("rhs", m_aRhs).toString ();
  }
}
