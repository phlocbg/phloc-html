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

/**
 * A field of a class
 * 
 * @author philip
 */
public class JSFieldVar extends JSVar implements IJSDocCommentable
{
  private final JSDefinedClass m_aOwner;

  /**
   * JSdoc comments for this field
   */
  private JSCommentMultiLine m_aJSDoc;

  /**
   * Field constructor
   * 
   * @param aType
   *        data type of this variable
   * @param sName
   *        Name of this variable
   * @param aInit
   *        Value to initialize this variable to
   */
  public JSFieldVar (@Nonnull final JSDefinedClass aOwner,
                     @Nullable final AbstractJSType aType,
                     @Nonnull final String sName,
                     @Nullable final IJSExpression aInit)
  {
    super (aType, sName, aInit);
    if (aOwner == null)
      throw new NullPointerException ("owner");
    m_aOwner = aOwner;
  }

  @Nonnull
  @Override
  public JSFieldVar name (@Nonnull @Nonempty final String sNewName)
  {
    final String sOldName = name ();
    if (!sOldName.equals (sNewName))
    {
      // make sure that the new name is available
      if (m_aOwner.containsField (sNewName))
        throw new IllegalArgumentException ("name " + sNewName + " is already in use");
      m_aOwner.removeField (this);
      super.name (sNewName);
      m_aOwner.addField (this);
    }
    return this;
  }

  /**
   * Creates, if necessary, and returns the class JSDoc for this field
   * 
   * @return {@link JSCommentMultiLine} containing JSDoc for this field
   */
  @Nonnull
  public JSCommentMultiLine jsDoc ()
  {
    if (m_aJSDoc == null)
      m_aJSDoc = new JSCommentMultiLine ();
    return m_aJSDoc;
  }

  @Override
  public void declare (@Nonnull final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.generatable (m_aJSDoc);
    super.declare (f);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("owner", m_aOwner)
                            .append ("jsDoc", m_aJSDoc)
                            .toString ();
  }
}
