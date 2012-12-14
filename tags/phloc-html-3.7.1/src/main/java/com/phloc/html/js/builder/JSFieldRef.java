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
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * Field Reference
 * 
 * @author philip
 */
public class JSFieldRef extends AbstractJSAssignmentTarget
{
  /**
   * Object expression upon which this field will be accessed, or null for the
   * implicit 'this'.
   */
  private final IJSGeneratable m_aObject;

  /**
   * Name of the field to be accessed. Either this or {@link #m_aVar} is set.
   */
  private String m_sName;

  /**
   * Variable to be accessed.
   */
  private JSVar m_aVar;

  public JSFieldRef (@Nullable final IJSGeneratable aObject, @Nonnull @Nonempty final String sName)
  {
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("Name '" + sName + "' is not a valid JSIdentifier!");
    m_aObject = aObject;
    m_sName = sName;
  }

  public JSFieldRef (@Nullable final IJSGeneratable aObject, @Nonnull final JSVar aVar)
  {
    if (aVar == null)
      throw new NullPointerException ("var");
    m_aObject = aObject;
    m_aVar = aVar;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    String name = m_sName;
    if (name == null)
      name = m_aVar.name ();

    if (m_aObject != null)
      f.generatable (m_aObject).plain ('.').plain (name);
    else
      f.plain (name);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).appendIfNotNull ("object", m_aObject)
                                       .append ("name", m_sName)
                                       .appendIfNotNull ("var", m_aVar)
                                       .toString ();
  }
}
