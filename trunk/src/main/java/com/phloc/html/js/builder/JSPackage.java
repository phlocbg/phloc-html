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

import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.io.streams.NonBlockingStringWriter;
import com.phloc.commons.io.streams.StreamUtils;
import com.phloc.html.js.IJSCodeProvider;

/**
 * A JS package. This is the entry point for all functions, declarations etc.
 * 
 * @author philip
 */
public final class JSPackage implements IJSFunctionContainer, IJSCodeProvider
{
  /**
   * List of classes contained within this package keyed by their name.
   */
  private final Map <String, IJSDeclaration> m_aDecls = new TreeMap <String, IJSDeclaration> ();

  /**
   * JPackage constructor
   */
  public JSPackage ()
  {}

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
    if (m_aDecls.containsKey (name))
      throw new JSNameAlreadyExistsException (m_aDecls.get (name));
    final JSDefinedClass c = new JSDefinedClass (this, name);
    m_aDecls.put (name, c);
    return c;
  }

  @Nonnull
  public JSFunction function (final String name) throws JSNameAlreadyExistsException
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
  public JSFunction function (final AbstractJSType aType, final String name) throws JSNameAlreadyExistsException
  {
    if (m_aDecls.containsKey (name))
      throw new JSNameAlreadyExistsException (m_aDecls.get (name));
    final JSFunction c = new JSFunction (aType, name);
    m_aDecls.put (name, c);
    return c;
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
    if (m_aDecls.containsKey (name))
      throw new JSNameAlreadyExistsException (m_aDecls.get (name));
    final JSVar c = new JSVar (aType, name, initExpression);
    m_aDecls.put (name, c);
    return c;
  }

  /**
   * Removes a declaration from this package.
   */
  public void remove (final String name)
  {
    m_aDecls.remove (name);
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
  public IJSDeclaration getDeclaration (final String name)
  {
    return m_aDecls.get (name);
  }

  /**
   * Checks if a given name is already defined as a class/interface
   */
  public boolean isDeclared (final String declLocalName)
  {
    return getDeclaration (declLocalName) != null;
  }

  public void writePackage (@Nonnull final Writer w)
  {
    // Write a file
    final JSFormatter f = new JSFormatter (w);
    try
    {
      // for all declarations in the current package
      for (final IJSDeclaration aDecl : declarations ())
        f.decl (aDecl);
    }
    finally
    {
      StreamUtils.close (f);
    }
  }

  @Nullable
  public String getJSCode ()
  {
    if (m_aDecls.isEmpty ())
      return null;

    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writePackage (aSW);
    return aSW.getAsString ();
  }
}
