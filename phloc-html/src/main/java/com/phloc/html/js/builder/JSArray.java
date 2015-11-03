/**
 * Copyright (C) 2006-2015 phloc systems
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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.json.IJSON;

/**
 * array creation and initialization.
 *
 * @author Philip Helger
 */
public class JSArray extends AbstractJSExpression
{
  private List <IJSExpression> m_aExprs;

  public JSArray ()
  {}

  public boolean isEmpty ()
  {
    return this.m_aExprs == null || this.m_aExprs.isEmpty ();
  }

  @Nonnegative
  public int size ()
  {
    return this.m_aExprs == null ? 0 : this.m_aExprs.size ();
  }

  @Nonnull
  public JSArray add (final boolean bValue)
  {
    return add (JSExpr.lit (bValue));
  }

  @Nonnull
  public JSArray add (final char cValue)
  {
    return add (JSExpr.lit (cValue));
  }

  @Nonnull
  public JSArray add (final double dValue)
  {
    return add (JSExpr.lit (dValue));
  }

  @Nonnull
  public JSArray add (final float fValue)
  {
    return add (JSExpr.lit (fValue));
  }

  @Nonnull
  public JSArray add (final int nValue)
  {
    return add (JSExpr.lit (nValue));
  }

  @Nonnull
  public JSArray add (final long nValue)
  {
    return add (JSExpr.lit (nValue));
  }

  @Nonnull
  public JSArray add (@Nullable final BigDecimal aValue)
  {
    return add (aValue == null ? JSExpr.NULL : JSExpr.lit (aValue));
  }

  @Nonnull
  public JSArray add (@Nullable final BigInteger aValue)
  {
    return add (aValue == null ? JSExpr.NULL : JSExpr.lit (aValue));
  }

  @Nonnull
  public JSArray add (@Nullable final String sValue)
  {
    return add (sValue == null ? JSExpr.NULL : JSExpr.lit (sValue));
  }

  @Nonnull
  public JSArray add (@Nullable final IJSON aValue)
  {
    return add (aValue == null ? JSExpr.NULL : JSExpr.json (aValue));
  }

  @Nonnull
  public JSArray add (@Nullable final IHCNode aValue)
  {
    return add (aValue == null ? null : HCSettings.getAsHTMLStringWithoutNamespaces (aValue));
  }

  @Nonnull
  public JSArray addAll (@Nonnull final boolean... aCont)
  {
    for (final boolean bValue : aCont)
      add (bValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final char... aCont)
  {
    for (final char cValue : aCont)
      add (cValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final double... aCont)
  {
    for (final double dValue : aCont)
      add (dValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final float... aCont)
  {
    for (final float fValue : aCont)
      add (fValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final int... aCont)
  {
    for (final int nValue : aCont)
      add (nValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final long... aCont)
  {
    for (final long nValue : aCont)
      add (nValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final BigDecimal... aCont)
  {
    for (final BigDecimal aValue : aCont)
      add (aValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final BigInteger... aCont)
  {
    for (final BigInteger aValue : aCont)
      add (aValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final String... aCont)
  {
    for (final String sValue : aCont)
      add (sValue);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final Iterable <String> aCont)
  {
    for (final String sValue : aCont)
      add (sValue);
    return this;
  }

  @Nonnull
  public JSArray addAllExpr (@Nonnull final IJSExpression... aCont)
  {
    for (final IJSExpression aExpr : aCont)
      add (aExpr);
    return this;
  }

  @Nonnull
  public JSArray addAllExpr (@Nonnull final Iterable <? extends IJSExpression> aCont)
  {
    for (final IJSExpression aExpr : aCont)
      add (aExpr);
    return this;
  }

  /**
   * Add an element to the array initializer
   *
   * @param aExpr
   *        Expression to add. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public JSArray add (@Nonnull final IJSExpression aExpr)
  {
    ValueEnforcer.notNull (aExpr, "Expr");

    if (this.m_aExprs == null)
      this.m_aExprs = new ArrayList <IJSExpression> ();
    this.m_aExprs.add (aExpr);
    return this;
  }

  @Nonnull
  public JSArray remove (@Nonnegative final int nIndex)
  {
    if (this.m_aExprs != null)
      this.m_aExprs.remove (nIndex);
    return this;
  }

  @Override
  public void generate (@Nonnull final JSFormatter aFormatter)
  {
    aFormatter.plain ('[');
    if (this.m_aExprs != null)
      aFormatter.generatable (this.m_aExprs);
    aFormatter.plain (']');
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSArray rhs = (JSArray) o;
    return EqualsUtils.equals (this.m_aExprs, rhs.m_aExprs);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (this.m_aExprs).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("exprs", this.m_aExprs).toString ();
  }
}
