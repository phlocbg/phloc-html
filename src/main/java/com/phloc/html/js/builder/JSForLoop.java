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
import javax.annotation.Nullable;

import com.phloc.commons.string.ToStringGenerator;

/**
 * For statement
 * 
 * @author philip
 */
public class JSForLoop implements IJSStatement
{
  private final List <Object> m_aInits = new ArrayList <Object> ();
  private IJSExpression m_aTest;
  private final List <IJSExpression> m_aUpdates = new ArrayList <IJSExpression> ();
  private JSBlock m_aBody;

  public JSForLoop ()
  {}

  @Nonnull
  public JSVar init (@Nonnull final String var, final int v)
  {
    return init (var, JSExpr.lit (v));
  }

  @Nonnull
  public JSVar init (@Nonnull final String var, final long v)
  {
    return init (var, JSExpr.lit (v));
  }

  @Nonnull
  public JSVar init (@Nonnull final String var, @Nonnull final IJSExpression e)
  {
    return init (null, var, e);
  }

  @Nonnull
  public JSVar init (@Nullable final AbstractJSType type, @Nonnull final String var, @Nonnull final IJSExpression e)
  {
    if (e == null)
      throw new NullPointerException ("initExpression");

    final JSVar v = new JSVar (type, var, e);
    m_aInits.add (v);
    return v;
  }

  public void init (@Nonnull final JSVar v, @Nonnull final IJSExpression e)
  {
    m_aInits.add (JSExpr.assign (v, e));
  }

  public void test (@Nonnull final IJSExpression e)
  {
    m_aTest = e;
  }

  public void update (@Nonnull final IJSExpression e)
  {
    m_aUpdates.add (e);
  }

  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ();
    return m_aBody;
  }

  public void state (final JSFormatter f)
  {
    f.plain ("for(");
    boolean first = true;
    for (final Object o : m_aInits)
    {
      if (first)
        first = false;
      else
        f.plain (',');
      if (o instanceof JSVar)
        f.plain ("var ").var ((JSVar) o);
      else
        f.generatable ((IJSExpression) o);
    }
    f.plain (';').generatable (m_aTest).plain (';').generatable (m_aUpdates).plain (')');
    if (m_aBody != null)
      f.generatable (m_aBody).nl ();
    else
      f.plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("inits", m_aInits)
                                       .append ("test", m_aTest)
                                       .append ("updates", m_aUpdates)
                                       .append ("body", m_aBody)
                                       .toString ();
  }
}
