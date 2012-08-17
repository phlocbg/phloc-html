/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.phloc.html.js.builder;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * JS method.
 */
public class JSMethod implements IJSDocCommentable, IJSDeclaration
{
  private final JSDefinedClass m_aOuter;

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
   * @param outer
   *        Owning class
   * @param type
   *        Return type for the method
   * @param name
   *        Name of this method
   */
  JSMethod (@Nonnull final JSDefinedClass outer, @Nullable final AbstractJSType type, @Nonnull final String name)
  {
    m_aType = type;
    m_sName = name;
    m_aOuter = outer;
  }

  /**
   * Constructor constructor
   * 
   * @param _class
   *        JClass containing this constructor
   */
  JSMethod (@Nonnull final JSDefinedClass _class)
  {
    m_aType = null;
    m_sName = _class.name ();
    m_aOuter = _class;
  }

  @Nonnull
  public JSDefinedClass parentClass ()
  {
    return m_aOuter;
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
  public JSVar param (final AbstractJSType type, final String name)
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
  public void name (final String n)
  {
    m_sName = n;
  }

  /**
   * Returns the return type.
   */
  public AbstractJSType type ()
  {
    return m_aType;
  }

  /**
   * Overrides the return type.
   */
  public void type (final AbstractJSType t)
  {
    m_aType = t;
  }

  /**
   * Get the block that makes up body of this method
   * 
   * @return Body of method
   */
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
    f.id (m_sName).plain ('(');
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
}
