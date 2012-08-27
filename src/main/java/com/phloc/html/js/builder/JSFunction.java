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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * JS function
 * 
 * @author philip
 */
public class JSFunction implements IJSDocCommentable, IJSDeclaration
{
  /**
   * JS doc comments for this function
   */
  private JSCommentMultiLine m_aJSDoc;

  /**
   * Return type for this function
   */
  private AbstractJSType m_aType;

  /**
   * Name of this function
   */
  private String m_sName;

  /**
   * List of parameters for this function's declaration
   */
  private final List <JSVar> m_aParams = new ArrayList <JSVar> ();

  /**
   * Block of statements that makes up the body this function
   */
  private JSBlock m_aBody;

  /**
   * function constructor
   * 
   * @param name
   *        Name of this function
   */
  public JSFunction (@Nonnull @Nonempty final String name)
  {
    this (null, name);
  }

  /**
   * function constructor
   * 
   * @param name
   *        Name of this function
   */
  public JSFunction (@Nullable final AbstractJSType aType, @Nonnull @Nonempty final String name)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Name must a valid identifier!");
    m_aType = aType;
    m_sName = name;
  }

  /**
   * Returns the return type.
   */
  @Nullable
  public AbstractJSType type ()
  {
    return m_aType;
  }

  /**
   * Overrides the return type.
   */
  @Nonnull
  public JSFunction type (@Nullable final AbstractJSType t)
  {
    m_aType = t;
    return this;
  }

  @Nonnull
  public String name ()
  {
    return m_sName;
  }

  /**
   * Changes the name of the function.
   */
  @Nonnull
  public JSFunction name (@Nonnull final String name)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Name must a valid identifier!");
    m_sName = name;
    return this;
  }

  /**
   * Returns the list of variable of this function.
   * 
   * @return List of parameters of this function. This list is not modifiable.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <JSVar> params ()
  {
    return ContainerHelper.newList (m_aParams);
  }

  /**
   * Add the specified variable to the list of parameters for this function
   * signature.
   * 
   * @param name
   *        Name of the parameter being added
   * @return New parameter variable
   */
  @Nonnull
  public JSVar param (@Nonnull final String name)
  {
    return param (null, name);
  }

  /**
   * Add the specified variable to the list of parameters for this function
   * signature.
   * 
   * @param type
   *        Type of the parameter being added
   * @param name
   *        Name of the parameter being added
   * @return New parameter variable
   */
  @Nonnull
  public JSVar param (@Nullable final AbstractJSType type, @Nonnull final String name)
  {
    final JSVar v = new JSVar (type, name, null);
    m_aParams.add (v);
    return v;
  }

  /**
   * Get the block that makes up body of this function
   * 
   * @return Body of function
   */
  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ();
    return m_aBody;
  }

  /**
   * Creates, if necessary, and returns the class JSDocs for this function
   * 
   * @return {@link JSCommentMultiLine} containing JSDocs for this class
   */
  @Nonnull
  public JSCommentMultiLine jsDoc ()
  {
    if (m_aJSDoc == null)
      m_aJSDoc = new JSCommentMultiLine ();
    return m_aJSDoc;
  }

  @Nonnull
  public JSInvocation invoke ()
  {
    return new JSInvocation (this);
  }

  @Override
  public void declare (@Nonnull final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.generatable (m_aJSDoc);

    f.plain ("function ");
    if (m_aType != null && f.generateTypeNames ())
      f.plain ("/*").generatable (m_aType).plain ("*/");
    f.plain (m_sName).plain ('(');
    boolean first = true;
    for (final JSVar aParam : m_aParams)
    {
      if (first)
        first = false;
      else
        f.plain (',');
      f.var (aParam);
    }
    f.plain (')');

    if (m_aBody != null)
      f.stmt (m_aBody);
    else
      f.stmt (new JSBlock ());
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("jsDoc", m_aJSDoc)
                                       .append ("type", m_aType)
                                       .append ("name", m_sName)
                                       .append ("params", m_aParams)
                                       .append ("body", m_aBody)
                                       .toString ();
  }
}
