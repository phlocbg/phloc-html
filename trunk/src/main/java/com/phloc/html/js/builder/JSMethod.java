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
 * JS method.
 * 
 * @author philip
 */
public class JSMethod implements IJSDocCommentable, IJSDeclaration
{
  private final JSDefinedClass m_aClass;

  /**
   * comments for this method
   */
  private JSCommentMultiLine m_aJSDoc;

  /**
   * Return type for this method
   */
  private AbstractJSType m_aType;

  /**
   * Name of this method
   */
  private String m_sName;

  /**
   * List of parameters for this method's declaration
   */
  private final List <JSVar> m_aParams = new ArrayList <JSVar> ();

  /**
   * block of statements that makes up the body this method
   */
  private JSBlock m_aBody;

  /**
   * Constructor
   * 
   * @param aClass
   *        Owning class
   * @param type
   *        Return type for the method
   * @param name
   *        Name of this method
   */
  JSMethod (@Nonnull final JSDefinedClass aClass, @Nullable final AbstractJSType type, @Nonnull final String name)
  {
    if (aClass == null)
      throw new NullPointerException ("class");
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Illegal method name: " + name);
    m_aClass = aClass;
    m_aType = type;
    m_sName = name;
  }

  /**
   * Constructor constructor
   * 
   * @param aClass
   *        JClass containing this constructor
   */
  JSMethod (@Nonnull final JSDefinedClass aClass)
  {
    if (aClass == null)
      throw new NullPointerException ("class");
    m_aClass = aClass;
    m_aType = null;
    m_sName = aClass.name ();
  }

  @Nonnull
  public JSDefinedClass parentClass ()
  {
    return m_aClass;
  }

  /**
   * Returns the list of variable of this method.
   * 
   * @return List of parameters of this method. This list is not modifiable.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <JSVar> params ()
  {
    return ContainerHelper.newList (m_aParams);
  }

  /**
   * Add the specified variable to the list of parameters for this method
   * signature.
   * 
   * @param type
   *        JType of the parameter being added
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

  public String name ()
  {
    return m_sName;
  }

  /**
   * Changes the name of the method.
   */
  public void name (@Nonnull @Nonempty final String name)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Illegal method name: " + name);
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
  public void type (@Nullable final AbstractJSType t)
  {
    m_aType = t;
  }

  /**
   * Get the block that makes up body of this method
   * 
   * @return Body of method
   */
  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ();
    return m_aBody;
  }

  /**
   * Creates, if necessary, and returns the class javadoc for this JDefinedClass
   * 
   * @return {@link JSCommentMultiLine} containing javadocs for this class
   */
  @Nonnull
  public JSCommentMultiLine jsDoc ()
  {
    if (m_aJSDoc == null)
      m_aJSDoc = new JSCommentMultiLine ();
    return m_aJSDoc;
  }

  @Override
  public void declare (final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.generatable (m_aJSDoc);

    if (m_aType != null)
      f.plain ("/* ").generatable (m_aType).plain (" */");

    f.plain (m_sName).plain ('(');
    boolean first = true;
    for (final JSVar var : m_aParams)
    {
      if (first)
        first = false;
      else
        f.plain (',');
      f.var (var);
    }
    f.plain (')').stmt (body ());
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("class", m_aClass.name ())
                                       .append ("jsDoc", m_aJSDoc)
                                       .append ("type", m_aType)
                                       .append ("name", m_sName)
                                       .append ("params", m_aParams)
                                       .append ("body", m_aBody)
                                       .toString ();
  }
}
