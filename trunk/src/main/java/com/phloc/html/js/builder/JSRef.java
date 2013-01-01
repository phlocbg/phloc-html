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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * Global Reference
 * 
 * @author philip
 */
public class JSRef extends AbstractJSAssignmentTarget
{
  /**
   * Name of the field to be accessed. Either this or {@link #m_aVar} is set.
   */
  private String m_sName;

  /**
   * Variable to be accessed.
   */
  private JSVar m_aVar;

  public JSRef (@Nonnull @Nonempty final String sName)
  {
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("Name '" + sName + "' is not a valid JSIdentifier!");
    m_sName = sName;
  }

  public JSRef (@Nonnull final JSVar aVar)
  {
    if (aVar == null)
      throw new NullPointerException ("var");
    m_aVar = aVar;
  }

  @Nonnull
  @Nonempty
  public final String name ()
  {
    return m_sName != null ? m_sName : m_aVar.name ();
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (name ());
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSRef rhs = (JSRef) o;
    return EqualsUtils.equals (m_sName, rhs.m_sName) && EqualsUtils.equals (m_aVar, rhs.m_aVar);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_sName).append (m_aVar).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("name", m_sName)
                            .appendIfNotNull ("var", m_aVar)
                            .toString ();
  }
}
