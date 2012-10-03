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
import com.phloc.commons.string.ToStringGenerator;

public class JSOpBinary extends AbstractJSExpression
{
  private final IJSExpression m_aLeft;
  private final String m_sOp;
  private final IJSGeneratable m_aRight;
  private boolean m_bUseBraces;

  private static boolean _useBraces (@Nonnull final IJSExpression aLeft,
                                     @Nonnull final String sOp,
                                     @Nonnull final IJSGeneratable aRight)
  {
    if (aLeft instanceof JSOpBinary)
    {
      final JSOpBinary r = (JSOpBinary) aLeft;
      if (sOp.equals (r.m_sOp))
        r.m_bUseBraces = false;
    }
    if (aRight instanceof JSOpBinary)
    {
      final JSOpBinary r = (JSOpBinary) aRight;
      if (sOp.equals (r.m_sOp))
        r.m_bUseBraces = false;
    }
    return true;
  }

  /**
   * Constructor
   * 
   * @param aLeft
   *        Left side. May not be <code>null</code>.
   * @param sOp
   *        Operator. May be empty string in very rare cases (e.g. JQuery
   *        selector chaining). May not be <code>null</code>.
   * @param aRight
   *        Right side. May not be <code>null</code>.
   */
  public JSOpBinary (@Nonnull final IJSExpression aLeft, @Nonnull final String sOp, @Nonnull final IJSGeneratable aRight)
  {
    this (aLeft, sOp, aRight, _useBraces (aLeft, sOp, aRight));
  }

  /**
   * Constructor
   * 
   * @param aLeft
   *        Left side. May not be <code>null</code>.
   * @param sOp
   *        Operator. May be empty string in very rare cases (e.g. JQuery
   *        selector chaining). May not be <code>null</code>.
   * @param aRight
   *        Right side. May not be <code>null</code>.
   * @param bUseBraces
   *        <code>true</code> to indicate usage of braces, <code>false</code> to
   *        disable it
   */
  public JSOpBinary (@Nonnull final IJSExpression aLeft,
                     @Nonnull final String sOp,
                     @Nonnull final IJSGeneratable aRight,
                     final boolean bUseBraces)
  {
    if (aLeft == null)
      throw new NullPointerException ("left");
    if (sOp == null)
      throw new NullPointerException ("empty operator");
    if (aRight == null)
      throw new NullPointerException ("right");
    m_aLeft = aLeft;
    m_sOp = sOp;
    m_aRight = aRight;
    m_bUseBraces = bUseBraces;
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
    final boolean bUseBraces = m_bUseBraces;

    if (bUseBraces)
      f.plain ('(');
    f.generatable (m_aLeft).plain (m_sOp).generatable (m_aRight);
    if (bUseBraces)
      f.plain (')');
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
