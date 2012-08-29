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
package com.phloc.html.js.marshal;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Specific JavaScript array type.
 * 
 * @author philip
 */
@Immutable
public final class JSArrayType extends JSType implements IHasChildJSType
{
  /**
   * The type of the list elements
   */
  private final JSType m_aChildType;

  public JSArrayType (@Nonnull final JSType aChildType)
  {
    super (EJSType.ARRAY);
    if (aChildType == null)
      throw new NullPointerException ("childType");
    m_aChildType = aChildType;
  }

  @Nonnull
  public JSType getChildType ()
  {
    return m_aChildType;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSArrayType rhs = (JSArrayType) o;
    return m_aChildType.equals (rhs.m_aChildType);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aChildType).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("childType", m_aChildType).toString ();
  }
}
