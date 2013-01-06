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
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Field Reference
 * 
 * @author philip
 */
public class JSFieldRef extends JSRef
{
  /**
   * Object expression upon which this field will be accessed, or null for the
   * implicit 'this'.
   */
  private final IJSGeneratable m_aObject;

  public JSFieldRef (@Nonnull final IJSGeneratable aObject, @Nonnull @Nonempty final String sName)
  {
    super (sName);
    if (aObject == null)
      throw new NullPointerException ("object");
    m_aObject = aObject;
  }

  public JSFieldRef (@Nonnull final IJSGeneratable aObject, @Nonnull final JSVar aVar)
  {
    super (aVar);
    if (aObject == null)
      throw new NullPointerException ("object");
    m_aObject = aObject;
  }

  @Nonnull
  public IJSGeneratable object ()
  {
    return m_aObject;
  }

  @Override
  public void generate (@Nonnull final JSFormatter f)
  {
    f.generatable (m_aObject).plain ('.').plain (name ());
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSFieldRef rhs = (JSFieldRef) o;
    return m_aObject.equals (rhs.m_aObject);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aObject).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("object", m_aObject).toString ();
  }
}
