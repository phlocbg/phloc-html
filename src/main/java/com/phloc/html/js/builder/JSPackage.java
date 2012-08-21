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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.state.EChange;
import com.phloc.html.js.IJSCodeProvider;

/**
 * A JS package. This is the entry point for all functions, declarations etc.
 * 
 * @author philip
 */
public final class JSPackage implements IJSFunctionContainer, IJSCodeProvider
{
  private final List <Object> m_aObjs = new ArrayList <Object> ();

  /**
   * List of declarations contained within this package keyed by their name.
   */
  private final Map <String, IJSDeclaration> m_aDecls = new HashMap <String, IJSDeclaration> ();

  /**
   * JPackage constructor
   */
  public JSPackage ()
  {}

  private void _add (@Nonnull final IJSDeclaration aDeclaration) throws JSNameAlreadyExistsException
  {
    final String sName = aDeclaration.name ();
    if (m_aDecls.containsKey (sName))
      throw new JSNameAlreadyExistsException (m_aDecls.get (sName));
    m_aObjs.add (aDeclaration);
    m_aDecls.put (sName, aDeclaration);
  }

  private void _add (@Nonnull final IJSStatement aStatement)
  {
    m_aObjs.add (aStatement);
  }

  /**
   * Add a class to this package.
   * 
   * @param name
   *        Name of class to be added to this package
   * @return Newly generated class
   * @exception JSNameAlreadyExistsException
   *            When the specified class/interface was already created.
   */
  @Nonnull
  public JSDefinedClass _class (final String name) throws JSNameAlreadyExistsException
  {
    final JSDefinedClass c = new JSDefinedClass (this, name);
    _add (c);
    return c;
  }

  @Nonnull
  public JSFunction function (@Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return function (null, name);
  }

  /**
   * Add a function to this package.
   * 
   * @param name
   *        Name of function to be added to this package
   * @return Newly generated function
   * @exception JSNameAlreadyExistsException
   *            When the specified function was already created.
   */
  @Nonnull
  public JSFunction function (@Nullable final AbstractJSType aType, @Nonnull @Nonempty final String name) throws JSNameAlreadyExistsException
  {
    final JSFunction c = new JSFunction (aType, name);
    _add (c);
    return c;
  }

  @Nonnull
  public static JSFunction functionRef (@Nonnull @Nonempty final String name)
  {
    return functionRef (null, name);
  }

  @Nonnull
  public static JSFunction functionRef (@Nullable final AbstractJSType aType, @Nonnull @Nonempty final String name)
  {
    return new JSFunction (aType, name);
  }

  @Nonnull
  public JSVar var (@Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return var (null, name, null);
  }

  @Nonnull
  public JSVar var (@Nonnull final String name, @Nullable final IJSExpression initExpression) throws JSNameAlreadyExistsException
  {
    return var (null, name, initExpression);
  }

  @Nonnull
  public JSVar var (@Nullable final AbstractJSType aType, @Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return var (aType, name, null);
  }

  /**
   * Add a var to this package.
   * 
   * @param aType
   *        optional type to use
   * @param name
   *        Name of variable to be added to this package
   * @param initExpression
   *        the initial expression. May be <code>null</code>
   * @return Newly generated function
   * @exception JSNameAlreadyExistsException
   *            When the specified var was already created.
   */
  @Nonnull
  public JSVar var (@Nullable final AbstractJSType aType,
                    @Nonnull final String name,
                    @Nullable final IJSExpression initExpression) throws JSNameAlreadyExistsException
  {
    final JSVar c = new JSVar (aType, name, initExpression);
    _add (c);
    return c;
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull final JSAnonymousFunction aAnonFunction)
  {
    final JSInvocation aInvocation = aAnonFunction.invoke ();
    _add (aInvocation);
    return aInvocation;
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull final JSFunction aFunction)
  {
    final JSInvocation aInvocation = aFunction.invoke ();
    _add (aInvocation);
    return aInvocation;
  }

  /**
   * Removes a declaration from this package.
   */
  @Nonnull
  public EChange removeByName (final String name)
  {
    final IJSDeclaration aDecl = m_aDecls.remove (name);
    if (aDecl == null)
      return EChange.UNCHANGED;
    m_aObjs.remove (aDecl);
    return EChange.CHANGED;
  }

  @Nonnull
  @ReturnsMutableCopy
  public Collection <IJSDeclaration> declarations ()
  {
    return ContainerHelper.newList (m_aDecls.values ());
  }

  /**
   * Gets a reference to the already created {@link JSDefinedClass}.
   * 
   * @return null If the object is not yet created.
   */
  @Nullable
  public IJSDeclaration getDeclaration (@Nullable final String name)
  {
    return m_aDecls.get (name);
  }

  /**
   * Checks if a given name is already defined as a class/interface
   */
  public boolean isDeclared (@Nullable final String declLocalName)
  {
    return getDeclaration (declLocalName) != null;
  }

  @Nonnegative
  public int memberCount ()
  {
    return m_aObjs.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <Object> members ()
  {
    return ContainerHelper.newList (m_aObjs);
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }
}
