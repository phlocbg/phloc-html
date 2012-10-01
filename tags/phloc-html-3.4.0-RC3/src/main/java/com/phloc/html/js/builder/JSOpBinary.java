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

public class JSOpBinary extends AbstractJSExpression
{
  private final IJSExpression m_aLeft;
  private final String m_sOp;
  private final IJSGeneratable m_aRight;

  public JSOpBinary (@Nonnull final IJSExpression aLeft,
                     @Nonnull @Nonempty final String sOp,
                     @Nonnull final IJSGeneratable aRight)
  {
    if (aLeft == null)
      throw new NullPointerException ("left");
    if (StringHelper.hasNoText (sOp))
      throw new IllegalArgumentException ("empty operator");
    if (aRight == null)
      throw new NullPointerException ("right");
    m_aLeft = aLeft;
    m_sOp = sOp;
    m_aRight = aRight;
  }

  @Nonnull
  public IJSExpression left ()
  {
    return m_aLeft;
  }

  @Nonnull
  @Nonempty
  public String operator ()
  {
    return m_sOp;
  }

  @Nonnull
  public IJSGeneratable right ()
  {
    return m_aRight;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain ('(').generatable (m_aLeft).plain (m_sOp).generatable (m_aRight).plain (')');
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("lhs", m_aLeft)
                                       .append ("op", m_sOp)
                                       .append ("rhs", m_aRight)
                                       .toString ();
  }
}