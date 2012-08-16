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

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * JS function
 */
public class JSFunction implements IJSDocCommentable, IJSDeclaration
{
  /**
   * Name of this method
   */
  private String m_sName = null;

  /**
   * List of parameters for this method's declaration
   */
  private final List <JSVar> params = new ArrayList <JSVar> ();

  /**
   * JBlock of statements that makes up the body this method
   */
  private JSSBlock body = null;

  /**
   * javadoc comments for this JMethod
   */
  private JSDocComment jdoc = null;

  /**
   * JMethod constructor
   * 
   * @param name
   *        Name of this method
   */
  JSFunction (final String name)
  {
    m_sName = name;
  }

  /**
   * Returns the list of variable of this method.
   * 
   * @return List of parameters of this method. This list is not modifiable.
   */
  public List <JSVar> params ()
  {
    return ContainerHelper.newList (params);
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
    params.add (v);
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
   * Returns all the parameters in an array.
   * 
   * @return If there's no parameter, an empty array will be returned.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <JSVar> listParams ()
  {
    return ContainerHelper.newList (params);
  }

  /**
   * Get the block that makes up body of this method
   * 
   * @return Body of method
   */
  public JSSBlock body ()
  {
    if (body == null)
      body = new JSSBlock ();
    return body;
  }

  /**
   * Creates, if necessary, and returns the class javadoc for this JDefinedClass
   * 
   * @return JDocComment containing javadocs for this class
   */
  public JSDocComment javadoc ()
  {
    if (jdoc == null)
      jdoc = new JSDocComment ();
    return jdoc;
  }

  @Override
  public void declare (final JSFormatter f)
  {
    if (jdoc != null)
      f.generable (jdoc);

    f.plain ("function ");
    f.id (m_sName).plain ('(').indent ();
    // when parameters are printed in new lines, we want them to be indented.
    // there's a good chance no newlines happen, too, but just in case it does.
    boolean first = true;
    for (final JSVar var : params)
    {
      if (!first)
        f.plain (',');
      f.var (var);
      first = false;
    }

    f.outdent ().plain (')');

    if (body != null)
      f.stmt (body);
    else
      f.stmt (new JSSBlock ());
  }
}
