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
 * JS function
 */
public class JSFunction implements IJSDocCommentable, IJSDeclaration
{
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
   * JBlock of statements that makes up the body this method
   */
  private JSBlock m_aBody;

  /**
   * javadoc comments for this JMethod
   */
  private JSDocComment m_aJSDoc;

  /**
   * JMethod constructor
   * 
   * @param name
   *        Name of this method
   */
  JSFunction (@Nullable final AbstractJSType aType, @Nonnull final String name)
  {
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
  public void type (@Nullable final AbstractJSType t)
  {
    m_aType = t;
  }

  @Nonnull
  public String name ()
  {
    return m_sName;
  }

  /**
   * Changes the name of the method.
   */
  public void name (@Nonnull final String n)
  {
    m_sName = n;
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
   * @return JDocComment containing javadocs for this class
   */
  @Nonnull
  public JSDocComment jsDoc ()
  {
    if (m_aJSDoc == null)
      m_aJSDoc = new JSDocComment ();
    return m_aJSDoc;
  }

  @Override
  public void declare (@Nonnull final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.generatable (m_aJSDoc);

    f.plain ("function ");
    if (m_aType != null)
      f.plain ("/*").generatable (m_aType).plain ("*/");
    f.id (m_sName).plain ('(').indent ();
    // when parameters are printed in new lines, we want them to be indented.
    // there's a good chance no newlines happen, too, but just in case it does.
    boolean first = true;
    for (final JSVar aParam : m_aParams)
    {
      if (!first)
        f.plain (',');
      f.var (aParam);
      first = false;
    }

    f.outdent ().plain (')');

    if (m_aBody != null)
      f.stmt (m_aBody);
    else
      f.stmt (new JSBlock ());
  }
}
