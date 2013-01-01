/**
 * Copyright (C) 2006-2013 phloc systems
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
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

@Immutable
public final class JSExprDirect extends AbstractJSExpression
{
  private final String m_sSource;

  public JSExprDirect (@Nonnull final String sSource)
  {
    if (sSource == null)
      throw new NullPointerException ("source");
    m_sSource = sSource;
  }

  public void generate (final JSFormatter f)
  {
    f.plain (m_sSource);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSExprDirect rhs = (JSExprDirect) o;
    return m_sSource.equals (rhs.m_sSource);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_sSource).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("source", m_sSource).toString ();
  }
}
