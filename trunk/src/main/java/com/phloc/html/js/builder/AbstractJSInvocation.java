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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;
import com.phloc.json.IJSON;

/**
 * Object invocation
 * 
 * @author philip
 */
public abstract class AbstractJSInvocation <IMPLTYPE extends AbstractJSInvocation <IMPLTYPE>> extends AbstractJSExpression implements IJSStatement
{
  /**
   * Object expression upon which this method will be invoked, or null if this
   * is a constructor invocation
   */
  private final IJSGeneratable m_aObject;

  /**
   * If {@link m_bIsConstructor} == <code>true</code>, this field keeps the type
   * to be created.
   */
  private final AbstractJSType m_aCtorType;

  /**
   * Name of the method to be invoked. Either this field is set, or
   * {@link #m_aCallee}, or {@link #m_aCtorType} (in which case it's a
   * constructor invocation.) This allows {@link JSMethod#name(String) the name
   * of the method to be changed later}.
   */
  private final String m_sName;

  private final Object m_aCallee;

  /**
   * List of argument expressions for this method invocation
   */
  private final List <IJSExpression> m_aArgs = new ArrayList <IJSExpression> ();

  /**
   * Invoke a function
   * 
   * @param aFunction
   */
  protected AbstractJSInvocation (@Nonnull final JSFunction aFunction)
  {
    if (aFunction == null)
      throw new NullPointerException ("function");
    m_aObject = null;
    m_sName = null;
    m_aCallee = aFunction;
    m_aCtorType = null;
  }

  /**
   * Invoke a function
   * 
   * @param sFunctionName
   */
  public AbstractJSInvocation (@Nonnull final String sFunctionName)
  {
    if (sFunctionName == null)
      throw new NullPointerException ("function");
    m_aObject = null;
    m_sName = sFunctionName;
    m_aCallee = null;
    m_aCtorType = null;
  }

  /**
   * Invoke an anonymous function
   * 
   * @param aAnonymousFunction
   *        The function to be invoked
   */
  protected AbstractJSInvocation (@Nonnull final JSAnonymousFunction aAnonymousFunction)
  {
    if (aAnonymousFunction == null)
      throw new NullPointerException ("anonymousFunction");
    m_aObject = null;
    m_sName = null;
    m_aCallee = aAnonymousFunction;
    m_aCtorType = null;
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
  protected AbstractJSInvocation (@Nullable final IJSExpression object, @Nonnull @Nonempty final String name)
  {
    this ((IJSGeneratable) object, name);
  }

  protected AbstractJSInvocation (@Nullable final IJSExpression object, @Nonnull final JSMethod method)
  {
    this ((IJSGeneratable) object, method);
  }

  /**
   * Invokes a static method on a class.
   */
  protected AbstractJSInvocation (@Nullable final AbstractJSClass type, @Nonnull @Nonempty final String name)
  {
    this ((IJSGeneratable) type, name);
  }

  protected AbstractJSInvocation (@Nullable final AbstractJSClass type, @Nonnull final JSMethod method)
  {
    this ((IJSGeneratable) type, method);
  }

  private AbstractJSInvocation (@Nullable final IJSGeneratable object, @Nonnull @Nonempty final String sName)
  {
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("name");
    m_aObject = object;
    m_sName = sName;
    m_aCallee = null;
    m_aCtorType = null;
  }

  private AbstractJSInvocation (@Nullable final IJSGeneratable aObject, @Nonnull final JSMethod aMethod)
  {
    if (aMethod == null)
      throw new NullPointerException ("method");
    m_aObject = aObject;
    m_sName = null;
    m_aCallee = aMethod;
    m_aCtorType = null;
  }

  /**
   * Invokes a constructor of an object (i.e., creates a new object.)
   * 
   * @param aType
   *        Type of the object to be created. May not be <code>null</code>.
   */
  protected AbstractJSInvocation (@Nonnull final AbstractJSType aType)
  {
    if (aType == null)
      throw new NullPointerException ("constructorType");
    m_aObject = null;
    m_sName = null;
    m_aCallee = null;
    m_aCtorType = aType;
  }

  /**
   * Add an expression to this invocation's argument list or "null" if it is
   * <code>null</code>
   * 
   * @param aArgument
   *        Argument to add to argument list
   */
  @Nonnull
  public IMPLTYPE argOrNull (@Nullable final IJSExpression aArgument)
  {
    return aArgument == null ? argNull () : arg (aArgument);
  }

  @SuppressWarnings ("unchecked")
  @Nonnull
  private IMPLTYPE _thisAsT ()
  {
    return (IMPLTYPE) this;
  }

  /**
   * Add an expression to this invocation's argument list
   * 
   * @param aArgument
   *        Argument to add to argument list
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnull final IJSExpression aArgument)
  {
    if (aArgument == null)
      throw new NullPointerException ("argument");
    m_aArgs.add (aArgument);
    return _thisAsT ();
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (final boolean v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (final char v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (final double v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (final float v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (final int v)
  {
    return arg (JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (final long v)
  {
    return arg (JSExpr.lit (v));
  }

  @Nonnull
  public IMPLTYPE argOrNull (@Nullable final Integer v)
  {
    return v == null ? argNull () : arg (v.intValue ());
  }

  @Nonnull
  public IMPLTYPE argOrNull (@Nullable final Long v)
  {
    return v == null ? argNull () : arg (v.longValue ());
  }

  @Nonnull
  public IMPLTYPE arg (@Nullable final String v)
  {
    return v == null ? argNull () : arg (JSExpr.lit (v));
  }

  @Nonnull
  public IMPLTYPE arg (@Nullable final IJSON v)
  {
    return v == null ? argNull () : arg (JSExpr.json (v));
  }

  /**
   * Adds a null argument. Short for {@code arg(JSExpr.NULL)}
   */
  @Nonnull
  public IMPLTYPE argNull ()
  {
    return arg (JSExpr.NULL);
  }

  /**
   * Adds a null argument. Short for {@code arg(JSExpr.THIS)}
   */
  @Nonnull
  public IMPLTYPE argThis ()
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
  public IMPLTYPE argOrNull (@Nonnegative final int nIndex, @Nullable final IJSExpression aArgument)
  {
    return aArgument == null ? argNull (nIndex) : arg (nIndex, aArgument);
  }

  /**
   * Add an expression to this invocation's argument list
   * 
   * @param aArgument
   *        Argument to add to argument list
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, @Nonnull final IJSExpression aArgument)
  {
    if (aArgument == null)
      throw new NullPointerException ("argument");
    m_aArgs.add (nIndex, aArgument);
    return _thisAsT ();
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, final boolean v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, final char v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, final double v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, final float v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, final int v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  /**
   * Adds a literal argument. Short for {@code arg(nIndex, JSExpr.lit(v))}
   */
  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, final long v)
  {
    return arg (nIndex, JSExpr.lit (v));
  }

  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, @Nullable final Integer v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, v.intValue ());
  }

  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, @Nullable final Long v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, v.longValue ());
  }

  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, @Nullable final String v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, JSExpr.lit (v));
  }

  @Nonnull
  public IMPLTYPE arg (@Nonnegative final int nIndex, @Nullable final IJSON v)
  {
    return v == null ? argNull (nIndex) : arg (nIndex, JSExpr.json (v));
  }

  /**
   * Adds a null argument. Short for {@code arg(nIndex, JSExpr.NULL)}
   */
  @Nonnull
  public IMPLTYPE argNull (@Nonnegative final int nIndex)
  {
    return arg (nIndex, JSExpr.NULL);
  }

  /**
   * Adds a null argument. Short for {@code arg(nIndex, JSExpr.THIS)}
   */
  @Nonnull
  public IMPLTYPE argThis (@Nonnegative final int nIndex)
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
  public List <IJSExpression> args ()
  {
    return ContainerHelper.newList (m_aArgs);
  }

  public void generate (final JSFormatter f)
  {
    if (m_aCallee instanceof JSAnonymousFunction)
    {
      // It's an anonymous function
      f.generatable (((JSAnonymousFunction) m_aCallee).inParantheses ()).plain ('(');
    }
    else
      if (m_aCtorType != null)
      {
        // It's a constructor call
        f.plain ("new ").generatable (m_aCtorType).plain ('(');
      }
      else
      {
        // Find name
        String sName = m_sName;
        if (sName == null && m_aCallee instanceof IJSDeclaration)
          sName = ((IJSDeclaration) m_aCallee).name ();

        if (m_aObject != null)
        {
          // Regular object method invocation
          if (sName == null)
            throw new IllegalStateException ("Name is required if an object is present");
          f.generatable (m_aObject).plain ('.').plain (sName).plain ('(');
        }
        else
          if (sName != null)
          {
            // E.g. global function
            f.plain (sName).plain ('(');
          }
      }

    // Add the arguments
    f.generatable (m_aArgs).plain (')');
  }

  public void state (final JSFormatter f)
  {
    f.generatable (this).plain (';').nl ();
  }

  @Override
  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString ((IJSStatement) this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).appendIfNotNull ("object", m_aObject)
                                       .appendIfNotNull ("ctorType", m_aCtorType)
                                       .appendIfNotNull ("callee", m_aCallee)
                                       .appendIfNotNull ("name", m_sName)
                                       .append ("args", m_aArgs)
                                       .toString ();
  }
}
