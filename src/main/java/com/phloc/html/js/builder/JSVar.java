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

/**
 * Variables and fields.
 */

public class JSVar extends AbstractJSExpressionImpl implements IJSDeclaration, IJSAssignmentTarget
{
  /**
   * JType of the variable
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
   * JVar constructor
   * 
   * @param type
   *        Datatype of this variable
   * @param name
   *        Name of this variable
   * @param init
   *        Value to initialize this variable to
   */
  JSVar (final AbstractJSType type, final String name, final IJSExpression init)
  {
    this.m_aType = type;
    this.m_sName = name;
    this.m_aInit = init;
  }

  /**
   * Initialize this variable
   * 
   * @param init
   *        JExpression to be used to initialize this field
   */
  public JSVar init (final IJSExpression init)
  {
    this.m_aInit = init;
    return this;
  }

  /**
   * Get the name of this variable
   * 
   * @return Name of the variable
   */
  public String name ()
  {
    return m_sName;
  }

  /**
   * Changes the name of this variable.
   */
  public void name (final String name)
  {
    if (!JSNameChecker.isJSIdentifier (name))
      throw new IllegalArgumentException ();
    this.m_sName = name;
  }

  /**
   * Return the type of this variable.
   * 
   * @return always non-null.
   */
  public AbstractJSType type ()
  {
    return m_aType;
  }

  /**
   * Sets the type of this variable.
   * 
   * @param newType
   *        must not be null.
   * @return the old type value. always non-null.
   */
  public AbstractJSType type (final AbstractJSType newType)
  {
    final AbstractJSType r = m_aType;
    if (newType == null)
      throw new IllegalArgumentException ();
    m_aType = newType;
    return r;
  }

  public void bind (final JSFormatter f)
  {
    f.g (m_aType).id (m_sName);
    if (m_aInit != null)
      f.p ('=').g (m_aInit);
  }

  public void declare (final JSFormatter f)
  {
    f.b (this).p (';').nl ();
  }

  public void generate (final JSFormatter f)
  {
    f.id (m_sName);
  }

  public IJSExpression assign (final IJSExpression rhs)
  {
    return JSExpr.assign (this, rhs);
  }

  public IJSExpression assignPlus (final IJSExpression rhs)
  {
    return JSExpr.assignPlus (this, rhs);
  }

}
