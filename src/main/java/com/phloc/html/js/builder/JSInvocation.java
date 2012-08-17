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
 * JMethod invocation
 */
public final class JSInvocation extends AbstractJSExpressionImpl implements IJSStatement
{
  /**
   * Object expression upon which this method will be invoked, or null if this
   * is a constructor invocation
   */
  private IJSGeneratable m_aObject;

  /**
   * Name of the method to be invoked. Either this field is set, or
   * {@link #m_aCallee}, or {@link #m_aType} (in which case it's a constructor
   * invocation.) This allows {@link JSMethod#name(String) the name of the
   * method to be changed later}.
   */
  private String m_sName;

  private Object m_aCallee;

  /**
   * If {@link m_bIsConstructor} == <code>true</code>, this field keeps the type
   * to be created.
   */
  private AbstractJSType m_aType;

  private boolean m_bIsConstructor = false;

  /**
   * List of argument expressions for this method invocation
   */
  private final List <IJSExpression> m_aArgs = new ArrayList <IJSExpression> ();

  /**
   * Invoke a function
   * 
   * @param function
   */
  JSInvocation (@Nonnull final JSFunction function)
  {
    m_aObject = null;
    m_aCallee = function;
  }

  /**
   * Invoke an anonymous function
   * 
   * @param anonfunc
   *        The function to be invoked
   */
  JSInvocation (@Nonnull final JSAnonymousFunction anonfunc)
  {
    m_aObject = null;
    m_aCallee = anonfunc;
  }

  /**
   * Invokes a method on an object.
   * 
   * @param object
   *        JExpression for the object upon which the named method will be
   *        invoked, or null if none
   * @param name
   *        Name of method to invoke
   */
  JSInvocation (@Nullable final IJSExpression object, @Nonnull final String name)
  {
    this ((IJSGeneratable) object, name);
  }

  JSInvocation (@Nullable final IJSExpression object, @Nonnull final JSMethod method)
  {
    this ((IJSGeneratable) object, method);
  }

  /**
   * Invokes a static method on a class.
   */
  JSInvocation (@Nullable final AbstractJSClass type, @Nonnull final String name)
  {
    this ((IJSGeneratable) type, name);
  }

  JSInvocation (@Nullable final AbstractJSClass type, @Nonnull final JSMethod method)
  {
    this ((IJSGeneratable) type, method);
  }

  private JSInvocation (@Nullable final IJSGeneratable object, @Nonnull final String name)
  {
    m_aObject = object;
    if (name.indexOf ('.') >= 0)
      throw new IllegalArgumentException ("method name contains '.': " + name);
    m_sName = name;
  }

  private JSInvocation (@Nullable final IJSGeneratable object, @Nonnull final JSMethod method)
  {
    m_aObject = object;
    m_aCallee = method;
  }

  /**
   * Invokes a constructor of an object (i.e., creates a new object.)
   * 
   * @param aType
   *        Type of the object to be created. If this type is an array type,
   *        added arguments are treated as array initializer. Thus you can
   *        create an expression like <code>new int[]{1,2,3,4,5}</code>.
   */
  JSInvocation (@Nonnull final AbstractJSType aType)
  {
    if (aType == null)
      throw new NullPointerException ("constructorType");
    m_bIsConstructor = true;
    m_aType = aType;
  }

  /**
   * Add an expression to this invocation's argument list
   * 
   * @param arg
   *        Argument to add to argument list
   */
  @Nonnull
  public JSInvocation arg (@Nonnull final IJSExpression arg)
  {
    if (arg == null)
      throw new IllegalArgumentException ();
    m_aArgs.add (arg);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  public JSInvocation arg (final boolean v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  public JSInvocation arg (final float v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  public JSInvocation arg (final double v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  public JSInvocation arg (final int v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  public JSInvocation arg (final long v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  public JSInvocation arg (final String v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Returns all arguments of the invocation.
   * 
   * @return If there's no arguments, an empty array will be returned.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <IJSExpression> listArgs ()
  {
    return ContainerHelper.newList (m_aArgs);
  }

  public void generate (final JSFormatter f)
  {
    if (m_bIsConstructor)
    {
      if (m_aType.isArray ())
      {
        // [RESULT] new T[]{arg1,arg2,arg3,...};
        f.plain ("new ").generatable (m_aType).plain ('{');
      }
      else
      {
        f.plain ("new ").generatable (m_aType).plain ('(');
      }
    }
    else
    {
      // Find name
      String name = m_sName;
      if (name == null && m_aCallee instanceof IJSDeclaration)
        name = ((IJSDeclaration) m_aCallee).name ();

      if (m_aObject != null)
      {
        // Regular object method invocation
        if (name == null)
          throw new IllegalStateException ();
        f.generatable (m_aObject).plain ('.').plain (name).plain ('(');
      }
      else
        if (name != null)
        {
          // E.g. global function
          f.id (name).plain ('(');
        }
        else
        {
          // anonymouse function
          f.plain ('(');
        }
    }

    f.generatable (m_aArgs);

    if (m_bIsConstructor && m_aType.isArray ())
      f.plain ('}');
    else
      f.plain (')');
  }

  public void state (final JSFormatter f)
  {
    f.generatable (this).plain (';').nl ();
  }
}
