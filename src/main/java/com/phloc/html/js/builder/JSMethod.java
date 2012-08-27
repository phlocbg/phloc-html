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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
  private static final Logger s_aLogger = LoggerFactory.getLogger (JSMethod.class);

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
    if (name.equals (aClass.name ()))
      throw new IllegalArgumentException ("You cannot name a method like the constructor!");
    if (!Character.isLowerCase (name.charAt (0)))
      s_aLogger.warn ("Method names should always start with a lowercase character: " + name);
    m_aClass = aClass;
    m_aType = type;
    m_sName = name;
  }

  @Nonnull
  public JSDefinedClass parentClass ()
  {
    return m_aClass;
  }

  /**
   * Creates, if necessary, and returns the class JSDoc for this method
   * 
   * @return {@link JSCommentMultiLine} containing JSDoc for this class
   */
  @Nonnull
  public JSCommentMultiLine jsDoc ()
  {
    if (m_aJSDoc == null)
      m_aJSDoc = new JSCommentMultiLine ();
    return m_aJSDoc;
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
  public void type (@Nullable final AbstractJSType type)
  {
    m_aType = type;
  }

  @Nonnull
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
   * Add the specified variable to the list of parameters for this method
   * signature.
   * 
   * @param type
   *        type of the parameter being added
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
   * Get the block that makes up body of this method
   * 
   * @return Body of method
   */
  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ().newlineAtEnd (false);
    return m_aBody;
  }

  @Override
  public void declare (final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.generatable (m_aJSDoc);

    f.plain (m_sName).plain (':');
    if (m_aType != null && f.generateTypeNames ())
      f.plain ("/*").generatable (m_aType).plain ("*/");
    f.plain ("function(");
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
