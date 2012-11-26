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
import javax.annotation.Nullable;

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;
import com.phloc.json.IJSON;

/**
 * array creation and initialization.
 * 
 * @author philip
 */
public class JSAssocArray extends AbstractJSExpression
{
  private Map <IJSExpression, IJSExpression> m_aExprs;

  public JSAssocArray ()
  {}

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, final boolean aValue)
  {
    return add (sKey, JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, final char aValue)
  {
    return add (sKey, JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, final double aValue)
  {
    return add (sKey, JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, final float aValue)
  {
    return add (sKey, JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, final int aValue)
  {
    return add (sKey, JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, final long aValue)
  {
    return add (sKey, JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, @Nullable final String aValue)
  {
    return add (sKey, aValue == null ? JSExpr.NULL : JSExpr.lit (aValue));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, @Nullable final IJSON aValue)
  {
    return add (sKey, aValue == null ? JSExpr.NULL : JSExpr.json (aValue));
  }

  @Nonnull
  public JSAssocArray addAllStrings (@Nullable final Map <String, String> aValues)
  {
    if (aValues != null)
      for (final Map.Entry <String, String> aEntry : aValues.entrySet ())
        add (aEntry.getKey (), JSExpr.lit (aEntry.getValue ()));
    return this;
  }

  @Nonnull
  public JSAssocArray addAll (@Nullable final Map <String, IJSExpression> aValues)
  {
    if (aValues != null)
      for (final Map.Entry <String, IJSExpression> aEntry : aValues.entrySet ())
        add (aEntry.getKey (), aEntry.getValue ());
    return this;
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String sKey, @Nonnull final IJSExpression aValue)
  {
    // Don't quote value identifiers
    if (JSMarshaller.isJSIdentifier (sKey))
      return add (new JSAtom (sKey), aValue);

    return add (JSExpr.lit (sKey), aValue);
  }

  /**
   * Add an element to the array initializer
   */
  @Nonnull
  public JSAssocArray add (@Nonnull final IJSExpression sKey, @Nonnull final IJSExpression aValue)
  {
    if (sKey == null)
      throw new NullPointerException ("key");
    if (aValue == null)
      throw new NullPointerException ("value");
    if (m_aExprs == null)
      m_aExprs = new LinkedHashMap <IJSExpression, IJSExpression> ();
    m_aExprs.put (sKey, aValue);
    return this;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain ('{').nl ().indent ();
    if (m_aExprs != null)
    {
      boolean bFirst = true;
      for (final Map.Entry <IJSExpression, IJSExpression> aEntry : m_aExprs.entrySet ())
      {
        if (bFirst)
          bFirst = false;
        else
          f.plain (',').nl ();
        f.generatable (aEntry.getKey ()).plain (':').generatable (aEntry.getValue ());
      }
    }
    f.nl ().outdent ().plain ('}');
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("exprs", m_aExprs).toString ();
  }
}
