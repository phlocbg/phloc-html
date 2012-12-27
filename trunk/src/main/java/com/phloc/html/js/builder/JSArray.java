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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.json.IJSON;

/**
 * array creation and initialization.
 * 
 * @author philip
 */
public class JSArray extends AbstractJSExpression
{
  private List <IJSExpression> m_aExprs;

  public JSArray ()
  {}

  public boolean isEmpty ()
  {
    return m_aExprs == null || m_aExprs.isEmpty ();
  }

  @Nonnegative
  public int size ()
  {
    return m_aExprs == null ? 0 : m_aExprs.size ();
  }

  @Nonnull
  public JSArray add (final boolean v)
  {
    return add (JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (final char v)
  {
    return add (JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (final double v)
  {
    return add (JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (final float v)
  {
    return add (JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (final int v)
  {
    return add (JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (final long v)
  {
    return add (JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (@Nullable final String v)
  {
    return add (v == null ? JSExpr.NULL : JSExpr.lit (v));
  }

  @Nonnull
  public JSArray add (@Nullable final IJSON v)
  {
    return add (v == null ? JSExpr.NULL : JSExpr.json (v));
  }

  @Nonnull
  public JSArray addAll (@Nonnull final boolean... aCont)
  {
    for (final boolean v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final char... aCont)
  {
    for (final char v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final double... aCont)
  {
    for (final double v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final float... aCont)
  {
    for (final float v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final int... aCont)
  {
    for (final int v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final long... aCont)
  {
    for (final long v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final String... aCont)
  {
    for (final String v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAll (@Nonnull final Iterable <String> aCont)
  {
    for (final String v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAllExpr (@Nonnull final IJSExpression... aCont)
  {
    for (final IJSExpression v : aCont)
      add (v);
    return this;
  }

  @Nonnull
  public JSArray addAllExpr (@Nonnull final Iterable <? extends IJSExpression> aCont)
  {
    for (final IJSExpression v : aCont)
      add (v);
    return this;
  }

  /**
   * Add an element to the array initializer
   */
  @Nonnull
  public JSArray add (@Nonnull final IJSExpression aExpr)
  {
    if (aExpr == null)
      throw new NullPointerException ("expr");
    if (m_aExprs == null)
      m_aExprs = new ArrayList <IJSExpression> ();
    m_aExprs.add (aExpr);
    return this;
  }

  @Nonnull
  public JSArray remove (@Nonnegative final int nIndex)
  {
    if (m_aExprs != null)
      m_aExprs.remove (nIndex);
    return this;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ('[');
    if (m_aExprs != null)
      f.generatable (m_aExprs);
    f.plain (']');
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSArray rhs = (JSArray) o;
    return EqualsUtils.equals (m_aExprs, rhs.m_aExprs);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aExprs).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("exprs", m_aExprs).toString ();
  }
}
