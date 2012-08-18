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

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * Object invocation
 * 
 * @author philip
 */
public final class JSInvocation extends AbstractJSExpressionImpl implements IJSStatement
{
  private boolean m_bIsAnonnymousFunction = false;
  private boolean m_bIsConstructor = false;

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
    m_bIsAnonnymousFunction = true;
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
   * Adds a null argument. Short for {@code arg(JSExpr.NULL)}
   */
  public JSInvocation argNull ()
  {
    return arg (JSExpr.NULL);
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
    if (m_bIsAnonnymousFunction)
    {
      f.generatable (((JSAnonymousFunction) m_aCallee).inParantheses ()).plain ('(');
    }
    else
      if (m_bIsConstructor)
      {
        f.plain ("new ").generatable (m_aType).plain ('(');
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
      }

    // Add the arguments
    f.generatable (m_aArgs).plain (')');
  }

  public void state (final JSFormatter f)
  {
    f.generatable (this).plain (';').nl ();
  }
}
