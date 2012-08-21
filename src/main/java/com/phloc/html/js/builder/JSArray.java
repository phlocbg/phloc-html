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

import javax.annotation.Nonnull;

/**
 * array creation and initialization.
 * 
 * @author philip
 */
public final class JSArray extends AbstractJSExpressionImpl
{
  private List <IJSExpression> m_aExprs;

  JSArray ()
  {}

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
  public JSArray add (@Nonnull final String v)
  {
    return add (JSExpr.lit (v));
  }

  /**
   * Add an element to the array initializer
   */
  @Nonnull
  public JSArray add (@Nonnull final IJSExpression e)
  {
    if (e == null)
      throw new NullPointerException ("expr");
    if (m_aExprs == null)
      m_aExprs = new ArrayList <IJSExpression> ();
    m_aExprs.add (e);
    return this;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ('[');
    if (m_aExprs != null)
      f.generatable (m_aExprs);
    f.plain (']');
  }
}
