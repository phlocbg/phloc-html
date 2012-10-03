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

import com.phloc.commons.string.ToStringGenerator;

/**
 * An atomic decimal number
 * 
 * @author philip
 */
public class JSAtomDecimal extends AbstractJSAtomNumeric
{
  private final double m_dValue;

  public JSAtomDecimal (final float fValue)
  {
    m_dValue = fValue;
  }

  public JSAtomDecimal (final double dValue)
  {
    m_dValue = dValue;
  }

  @Override
  public boolean isDecimalValue ()
  {
    return true;
  }

  @Override
  public double doubleValue ()
  {
    return m_dValue;
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericMinus ()
  {
    return new JSAtomDecimal (-m_dValue);
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericIncr ()
  {
    return new JSAtomDecimal (m_dValue + 1);
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericDecr ()
  {
    return new JSAtomDecimal (m_dValue - 1);
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericPlus (@Nonnull final AbstractJSAtomNumeric rhs)
  {
    return new JSAtomDecimal (m_dValue + rhs.doubleValue ());
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericMinus (@Nonnull final AbstractJSAtomNumeric rhs)
  {
    return new JSAtomDecimal (m_dValue - rhs.doubleValue ());
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericMul (@Nonnull final AbstractJSAtomNumeric rhs)
  {
    return new JSAtomDecimal (m_dValue * rhs.doubleValue ());
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericDiv (@Nonnull final AbstractJSAtomNumeric rhs)
  {
    return new JSAtomDecimal (m_dValue / rhs.doubleValue ());
  }

  @Override
  @Nonnull
  public AbstractJSAtomNumeric numericMod (@Nonnull final AbstractJSAtomNumeric rhs)
  {
    return new JSAtomDecimal (m_dValue % rhs.doubleValue ());
  }

  public double getContainedValue ()
  {
    return m_dValue;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (Double.toString (m_dValue));
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("value", m_dValue).toString ();
  }
}
