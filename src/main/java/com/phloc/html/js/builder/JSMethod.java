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
import java.util.Collections;
import java.util.List;

/**
 * Java method.
 */
public class JSMethod implements IJSDocCommentable, IJSDeclaration
{
  /**
   * Return type for this method
   */
  private AbstractJSType m_aType = null;

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

  private final JSDefinedClass m_aOuter;

  /**
   * javadoc comments for this JMethod
   */
  private JSDocComment jdoc = null;

  private boolean isConstructor ()
  {
    return m_aType == null;
  }

  /**
   * JMethod constructor
   * 
   * @param type
   *        Return type for the method
   * @param name
   *        Name of this method
   */
  JSMethod (final JSDefinedClass outer, final AbstractJSType type, final String name)
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
  JSMethod (final JSDefinedClass _class)
  {
    m_aType = null;
    m_sName = _class.name ();
    m_aOuter = _class;
  }

  /**
   * Returns the list of variable of this method.
   * 
   * @return List of parameters of this method. This list is not modifiable.
   */
  public List <JSVar> params ()
  {
    return Collections.<JSVar> unmodifiableList (params);
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

  public JSVar param (final Class <?> type, final String name)
  {
    return param (owner ()._ref (type), name);
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
   * Returns all the parameter types in an array.
   * 
   * @return If there's no parameter, an empty array will be returned.
   */
  public AbstractJSType [] listParamTypes ()
  {
    final AbstractJSType [] r = new AbstractJSType [params.size ()];
    for (int i = 0; i < r.length; i++)
      r[i] = params.get (i).type ();
    return r;
  }

  /**
   * Returns all the parameters in an array.
   * 
   * @return If there's no parameter, an empty array will be returned.
   */
  public JSVar [] listParams ()
  {
    return params.toArray (new JSVar [params.size ()]);
  }

  /**
   * Returns true if the method has the specified signature.
   */
  public boolean hasSignature (final AbstractJSType [] argTypes)
  {
    final JSVar [] p = listParams ();
    if (p.length != argTypes.length)
      return false;

    for (int i = 0; i < p.length; i++)
      if (!p[i].type ().equals (argTypes[i]))
        return false;

    return true;
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
      jdoc = new JSDocComment (owner ());
    return jdoc;
  }

  @Override
  public void declare (final JSFormatter f)
  {
    if (jdoc != null)
      f.g (jdoc);

    if (!isConstructor ())
      f.g (m_aType);
    f.id (m_sName).p ('(').i ();
    // when parameters are printed in new lines, we want them to be indented.
    // there's a good chance no newlines happen, too, but just in case it does.
    boolean first = true;
    for (final JSVar var : params)
    {
      if (!first)
        f.p (',');
      f.b (var);
      first = false;
    }

    f.o ().p (')');

    if (body != null)
      f.s (body);
    else
      f.s (new JSSBlock ());
  }

  protected JSCodeModel owner ()
  {
    return m_aOuter.owner ();
  }
}
