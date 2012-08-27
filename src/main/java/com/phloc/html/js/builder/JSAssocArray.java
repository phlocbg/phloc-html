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

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nonnull;

import com.phloc.commons.string.ToStringGenerator;

/**
 * array creation and initialization.
 * 
 * @author philip
 */
public final class JSAssocArray extends AbstractJSExpression
{
  private Map <IJSExpression, IJSExpression> m_aExprs;

  public JSAssocArray ()
  {}

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final boolean value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final char value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final double value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final float value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final int value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final long value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, @Nonnull final String value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, @Nonnull final IJSExpression value)
  {
    return add (JSExpr.lit (key), value);
  }

  /**
   * Add an element to the array initializer
   */
  @Nonnull
  public JSAssocArray add (@Nonnull final IJSExpression key, @Nonnull final IJSExpression value)
  {
    if (key == null)
      throw new NullPointerException ("key");
    if (value == null)
      throw new NullPointerException ("value");
    if (m_aExprs == null)
      m_aExprs = new LinkedHashMap <IJSExpression, IJSExpression> ();
    m_aExprs.put (key, value);
    return this;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ('{');
    if (m_aExprs != null)
    {
      boolean bFirst = true;
      for (final Map.Entry <IJSExpression, IJSExpression> aEntry : m_aExprs.entrySet ())
      {
        if (bFirst)
          bFirst = false;
        else
          f.plain (',');
        f.generatable (aEntry.getKey ()).plain (':').generatable (aEntry.getValue ());
      }
    }
    f.plain ('}');
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("exprs", m_aExprs).toString ();
  }
}
