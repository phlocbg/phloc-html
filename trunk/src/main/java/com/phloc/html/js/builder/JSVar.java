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

import com.phloc.html.js.marshal.JSMarshaller;

/**
 * Variables and fields.
 * 
 * @author philip
 */
public class JSVar extends AbstractJSAssignmentTarget implements IJSDeclaration
{
  /**
   * type of the variable
   */
  private AbstractJSType m_aType;

  /**
   * Name of the variable
   */
  private String m_sName;

  /**
   * Initialization of the variable in its declaration
   */
  private IJSExpression m_aInit;

  /**
   * Constructor
   * 
   * @param type
   *        Datatype of this variable
   * @param name
   *        Name of this variable
   * @param init
   *        Value to initialize this variable to
   */
  public JSVar (@Nullable final AbstractJSType type, @Nonnull final String name, @Nullable final IJSExpression init)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ();
    m_aType = type;
    m_sName = name;
    m_aInit = init;
  }

  /**
   * @return the type of this variable.
   */
  @Nullable
  public AbstractJSType type ()
  {
    return m_aType;
  }

  /**
   * Sets the type of this variable.
   * 
   * @param newType
   *        must not be null.
   * @return the old type value.
   */
  @Nullable
  public AbstractJSType type (@Nullable final AbstractJSType newType)
  {
    final AbstractJSType r = m_aType;
    m_aType = newType;
    return r;
  }

  /**
   * Get the name of this variable
   * 
   * @return Name of the variable
   */
  @Nonnull
  public String name ()
  {
    return m_sName;
  }

  /**
   * Changes the name of this variable.
   */
  @Nonnull
  public JSVar name (@Nonnull final String name)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ();
    m_sName = name;
    return this;
  }

  /**
   * Initialize this variable
   * 
   * @param init
   *        JExpression to be used to initialize this field
   */
  @Nonnull
  public JSVar init (@Nullable final IJSExpression init)
  {
    m_aInit = init;
    return this;
  }

  void bind (@Nonnull final JSFormatter f)
  {
    if (m_aType != null)
      f.plain ("/*").generatable (m_aType).plain ("*/");
    f.plain (m_sName);
    if (m_aInit != null)
      f.plain ('=').generatable (m_aInit);
  }

  public void declare (@Nonnull final JSFormatter f)
  {
    f.plain ("var ");
    bind (f);
    f.plain (';').nl ();
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (m_sName);
  }
}
