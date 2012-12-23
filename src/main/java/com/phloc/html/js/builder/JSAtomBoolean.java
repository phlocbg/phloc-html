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

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * An atom for boolean values
 * 
 * @author philip
 */
public class JSAtomBoolean extends AbstractJSExpression
{
  private final boolean m_bValue;

  public JSAtomBoolean (final boolean bValue)
  {
    m_bValue = bValue;
  }

  public boolean getContainedValue ()
  {
    return m_bValue;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (Boolean.toString (m_bValue));
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSAtomBoolean rhs = (JSAtomBoolean) o;
    return m_bValue == rhs.m_bValue;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_bValue).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("value", m_bValue).toString ();
  }
}
