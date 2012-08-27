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
   * JSdoc comments for this JFieldVar
   */
  private JSCommentMultiLine m_aJSDoc;

  /**
   * JFieldVar constructor
   * 
   * @param type
   *        data type of this variable
   * @param name
   *        Name of this variable
   * @param init
   *        Value to initialize this variable to
   */
  JSFieldVar (@Nonnull final JSDefinedClass owner,
              @Nullable final AbstractJSType type,
              @Nonnull final String name,
              @Nullable final IJSExpression init)
  {
    super (type, name, init);
    m_aOwner = owner;
  }

  @Nonnull
  @Override
  public JSFieldVar name (final String name)
  {
    // make sure that the new name is available
    if (m_aOwner.m_aFields.containsKey (name))
      throw new IllegalArgumentException ("name " + name + " is already in use");
    final String sOldName = name ();
    super.name (name);
    m_aOwner.m_aFields.remove (sOldName);
    m_aOwner.m_aFields.put (name, this);
    return this;
  }

  /**
   * Creates, if necessary, and returns the class javadoc for this JDefinedClass
   * 
   * @return JDocComment containing javadocs for this class
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
