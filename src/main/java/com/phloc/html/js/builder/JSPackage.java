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

import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.io.streams.NonBlockingStringWriter;

/**
 * A JS package.
 */
public final class JSPackage implements IJSDeclaration, IJSGeneratable, IJSClassContainer, IJSFunctionContainer
{
  private final JSCodeModel m_aOwner;

  /**
   * Name of the package. May be the empty string for the root package.
   */
  private final String m_sName;

  /**
   * List of classes contained within this package keyed by their name.
   */
  private final Map <String, IJSDeclaration> m_aDecls = new TreeMap <String, IJSDeclaration> ();

  /**
   * JPackage constructor
   * 
   * @param cw
   *        The code writer being used to create this package
   * @param name
   *        Name of package
   * @throws IllegalArgumentException
   *         If each part of the package name is not a valid identifier
   */
  JSPackage (@Nonnull final JSCodeModel cw, @Nonnull final String name)
  {
    m_aOwner = cw;
    if (name.equals ("."))
      throw new IllegalArgumentException ("Package name . is not allowed");

    m_sName = name;
  }

  /**
   * Return the code model root object being used to create this package.
   */
  public final JSCodeModel owner ()
  {
    return m_aOwner;
  }

  /**
   * Checks if this package is the root, unnamed package.
   */
  public final boolean isUnnamed ()
  {
    return m_sName.length () == 0;
  }

  /**
   * Get the name of this package
   * 
   * @return The name of this package, or the empty string if this is the null
   *         package. For example, this method returns strings like
   *         <code>"java.lang"</code>
   */
  public String name ()
  {
    return m_sName;
  }

  @Nullable
  public IJSClassContainer parentClassContainer ()
  {
    return parent ();
  }

  /**
   * Gets the parent package, or null if this class is the root package.
   */
  @Nullable
  public JSPackage parent ()
  {
    final int idx = m_sName.lastIndexOf ('.');
    if (idx == -1)
      return null;

    return m_aOwner._package (m_sName.substring (0, idx));
  }

  @Nonnull
  public JSPackage getPackage ()
  {
    return this;
  }

  /**
   * Gets a reference to a sub package of this package.
   */
  public JSPackage subPackage (final String pkg)
  {
    if (isUnnamed ())
      return owner ()._package (pkg);
    return owner ()._package (m_sName + '.' + pkg);
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
    if (m_aDecls.containsKey (name))
      throw new JSNameAlreadyExistsException (m_aDecls.get (name));
    // XXX problems caught in the NC constructor
    final JSDefinedClass c = new JSDefinedClass (this, name);
    m_aDecls.put (name, c);
    return c;
  }

  /**
   * Gets a reference to the already created {@link JSDefinedClass}.
   * 
   * @return null If the class is not yet created.
   */
  public JSDefinedClass getClass (final String name)
  {
    return (JSDefinedClass) m_aDecls.get (name);
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

  /**
   * Gets a reference to the already created {@link JSFunction}.
   * 
   * @return null If the class is not yet created.
   */
  public JSFunction getFunction (final String name)
  {
    return (JSFunction) m_aDecls.get (name);
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
   * Gets a reference to the already created {@link JSFunction}.
   * 
   * @return null If the class is not yet created.
   */
  public JSVar getVar (final String name)
  {
    return (JSVar) m_aDecls.get (name);
  }

  /**
   * Removes a class from this package.
   */
  public void remove (final AbstractJSClass c)
  {
    if (c._package () != this)
      throw new IllegalArgumentException ("the specified class is not a member of this package,"
                                          + " or it is a referenced class");

    // note that c may not be a member of classes.
    // this happens when someone is trying to remove a non generated class
    m_aDecls.remove (c.name ());
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
  public boolean isDefined (final String declLocalName)
  {
    return getDeclaration (declLocalName) != null;
  }

  public void declare (final JSFormatter f)
  {}

  public void generate (final JSFormatter f)
  {
    f.plain (m_sName);
  }

  int countArtifacts ()
  {
    return m_aDecls.size ();
  }

  public void write (@Nonnull final Writer w)
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
      f.close ();
    }
  }

  @Nonnull
  public String getJSCode ()
  {
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    write (aSW);
    return aSW.getAsString ();
  }
}
