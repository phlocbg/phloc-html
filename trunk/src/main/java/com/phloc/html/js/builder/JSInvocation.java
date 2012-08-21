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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.marshal.JSMarshaller;
import com.phloc.json.IJSON;

/**
 * Object invocation
 * 
 * @author philip
 */
public class JSInvocation extends AbstractJSExpressionImpl implements IJSStatement
{
  private final boolean m_bIsAnonnymousFunction;
  private final boolean m_bIsConstructor;

  /**
   * Object expression upon which this method will be invoked, or null if this
   * is a constructor invocation
   */
  private final IJSGeneratable m_aObject;

  /**
   * Name of the method to be invoked. Either this field is set, or
   * {@link #m_aCallee}, or {@link #m_aType} (in which case it's a constructor
   * invocation.) This allows {@link JSMethod#name(String) the name of the
   * method to be changed later}.
   */
  private final String m_sName;

  private final Object m_aCallee;

  /**
   * If {@link m_bIsConstructor} == <code>true</code>, this field keeps the type
   * to be created.
   */
  private final AbstractJSType m_aType;

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
    if (function == null)
      throw new NullPointerException ("function");
    m_bIsAnonnymousFunction = false;
    m_bIsConstructor = false;
    m_aObject = null;
    m_sName = null;
    m_aCallee = function;
    m_aType = null;
  }

  /**
   * Invoke a function
   * 
   * @param sFunctionName
   */
  public JSInvocation (@Nonnull final String sFunctionName)
  {
    if (sFunctionName == null)
      throw new NullPointerException ("function");
    m_bIsAnonnymousFunction = false;
    m_bIsConstructor = false;
    m_aObject = null;
    m_sName = sFunctionName;
    m_aCallee = null;
    m_aType = null;
  }

  /**
   * Invoke an anonymous function
   * 
   * @param aAnonymousFunction
   *        The function to be invoked
   */
  JSInvocation (@Nonnull final JSAnonymousFunction aAnonymousFunction)
  {
    if (aAnonymousFunction == null)
      throw new NullPointerException ("anonymousFunction");
    m_bIsAnonnymousFunction = true;
    m_bIsConstructor = false;
    m_aObject = null;
    m_sName = null;
    m_aCallee = aAnonymousFunction;
    m_aType = null;
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
  JSInvocation (@Nullable final IJSExpression object, @Nonnull @Nonempty final String name)
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
  JSInvocation (@Nullable final AbstractJSClass type, @Nonnull @Nonempty final String name)
  {
    this ((IJSGeneratable) type, name);
  }

  JSInvocation (@Nullable final AbstractJSClass type, @Nonnull final JSMethod method)
  {
    this ((IJSGeneratable) type, method);
  }

  private JSInvocation (@Nullable final IJSGeneratable object, @Nonnull @Nonempty final String name)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("name");
    if (name.indexOf ('.') >= 0)
      throw new IllegalArgumentException ("method name contains '.': " + name);
    m_bIsAnonnymousFunction = false;
    m_bIsConstructor = false;
    m_aObject = object;
    m_sName = name;
    m_aCallee = null;
    m_aType = null;
  }

  private JSInvocation (@Nullable final IJSGeneratable object, @Nonnull final JSMethod aMethod)
  {
    if (aMethod == null)
      throw new NullPointerException ("method");
    m_bIsAnonnymousFunction = false;
    m_bIsConstructor = false;
    m_aObject = object;
    m_sName = null;
    m_aCallee = aMethod;
    m_aType = null;
  }

  /**
   * Invokes a constructor of an object (i.e., creates a new object.)
   * 
   * @param aType
   *        Type of the object to be created. May not be <code>null</code>.
   */
  JSInvocation (@Nonnull final AbstractJSType aType)
  {
    if (aType == null)
      throw new NullPointerException ("constructorType");
    m_bIsAnonnymousFunction = false;
    m_bIsConstructor = true;
    m_aObject = null;
    m_sName = null;
    m_aCallee = null;
    m_aType = aType;
  }

  /**
   * Add an expression to this invocation's argument list
   * 
   * @param aArgument
   *        Argument to add to argument list
   */
  @Nonnull
  public JSInvocation arg (@Nonnull final IJSExpression aArgument)
  {
    if (aArgument == null)
      throw new IllegalArgumentException ("argument");
    m_aArgs.add (aArgument);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (final boolean v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (final char v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (final double v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (final float v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (final int v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (final long v)
  {
    return arg (JSExpr.lit (v));
  }

  @Nonnull
  public JSInvocation arg (@Nullable final Integer v)
  {
    return v == null ? argNull () : arg (v.intValue ());
  }

  @Nonnull
  public JSInvocation arg (@Nullable final Long v)
  {
    return v == null ? argNull () : arg (v.longValue ());
  }

  @Nonnull
  public JSInvocation arg (@Nullable final String v)
  {
    return v == null ? argNull () : arg (JSExpr.lit (v));
  }

  @Nonnull
  public JSInvocation arg (@Nullable final IJSON v)
  {
    return v == null ? argNull () : arg (JSExpr.json (v));
  }

  @Nonnull
  @Deprecated
  public JSInvocation arg (@Nullable final IJSCodeProvider v)
  {
    return v == null ? argNull () : arg (JSExpr.direct (v.getJSCode ()));
  }

  /**
   * Adds a null argument. Short for {@code arg(JSExpr.NULL)}
   */
  @Nonnull
  public JSInvocation argNull ()
  {
    return arg (JSExpr.NULL);
  }

  /**
   * Adds a null argument. Short for {@code arg(JSExpr.THIS)}
   */
  @Nonnull
  public JSInvocation argThis ()
  {
    return arg (JSExpr.THIS);
  }

  /**
   * Add an expression to this invocation's argument list
   * 
   * @param aArgument
   *        Argument to add to argument list
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, @Nonnull final IJSExpression aArgument)
  {
    if (aArgument == null)
      throw new IllegalArgumentException ("argument");
    m_aArgs.add (nIndex, aArgument);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, final boolean v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, final char v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, final double v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, final float v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, final int v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, final long v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, @Nullable final Integer v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, v.intValue ());
  }

  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, @Nullable final Long v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, v.longValue ());
  }

  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, @Nullable final String v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, JSExpr.lit (v));
  }

  @Nonnull
  public JSInvocation arg (@Nonnegative final int nIndex, @Nullable final IJSON v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, JSExpr.json (v));
  }

  /**
   * Adds a null argument. Short for {@code arg(nIndex, JSExpr.NULL)}
   */
  @Nonnull
  public JSInvocation argNull (@Nonnegative final int nIndex)
  {
    return arg (nIndex, JSExpr.NULL);
  }

  /**
   * Adds a null argument. Short for {@code arg(nIndex, JSExpr.THIS)}
   */
  @Nonnull
  public JSInvocation argThis (@Nonnegative final int nIndex)
  {
    return arg (nIndex, JSExpr.THIS);
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
            f.plain (name).plain ('(');
          }
      }

    // Add the arguments
    f.generatable (m_aArgs).plain (')');
  }

  public void state (final JSFormatter f)
  {
    f.generatable (this).plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString ((IJSStatement) this);
  }
}
