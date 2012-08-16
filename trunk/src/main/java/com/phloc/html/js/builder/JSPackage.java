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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * A Java package.
 */
public final class JSPackage implements
                            IJSDeclaration,
                            IJSGenerable,
                            IJSClassContainer,
                            Comparable <JSPackage>,
                            IJSDocCommentable
{

  /**
   * Name of the package. May be the empty string for the root package.
   */
  private final String m_sName;

  private final JSCodeModel owner;

  /**
   * List of classes contained within this package keyed by their name.
   */
  private final Map <String, JSDefinedClass> classes = new TreeMap <String, JSDefinedClass> ();

  /**
   * All {@link AbstractJSClass}s in this package keyed the upper case class
   * name. This field is non-null only on Windows, to detect "Foo" and "foo" as
   * a collision.
   */
  private final Map <String, JSDefinedClass> upperCaseClassMap;

  /**
   * package javadoc.
   */
  private JSDocComment jdoc = null;

  /**
   * JPackage constructor
   * 
   * @param name
   *        Name of package
   * @param cw
   *        The code writer being used to create this package
   * @throws IllegalArgumentException
   *         If each part of the package name is not a valid identifier
   */
  JSPackage (final String name, final JSCodeModel cw)
  {
    this.owner = cw;
    if (name.equals ("."))
    {
      final String msg = "Package name . is not allowed";
      throw new IllegalArgumentException (msg);
    }

    if (JSBuilderSettings.isCaseSensitiveFileSystem)
      upperCaseClassMap = null;
    else
      upperCaseClassMap = new HashMap <String, JSDefinedClass> ();

    this.m_sName = name;
  }

  public IJSClassContainer parentContainer ()
  {
    return parent ();
  }

  /**
   * Gets the parent package, or null if this class is the root package.
   */
  public JSPackage parent ()
  {
    if (m_sName.length () == 0)
      return null;

    final int idx = m_sName.lastIndexOf ('.');
    return owner._package (m_sName.substring (0, idx));
  }

  public boolean isClass ()
  {
    return false;
  }

  public boolean isPackage ()
  {
    return true;
  }

  public JSPackage getPackage ()
  {
    return this;
  }

  /**
   * Add a class to this package.
   * 
   * @param name
   *        Name of class to be added to this package
   * @return Newly generated class
   * @exception JSClassAlreadyExistsException
   *            When the specified class/interface was already created.
   */
  public JSDefinedClass _class (final String name) throws JSClassAlreadyExistsException
  {
    if (classes.containsKey (name))
      throw new JSClassAlreadyExistsException (classes.get (name));
    // XXX problems caught in the NC constructor
    final JSDefinedClass c = new JSDefinedClass (this, name);

    if (upperCaseClassMap != null)
    {
      final JSDefinedClass dc = upperCaseClassMap.get (name.toUpperCase ());
      if (dc != null)
        throw new JSClassAlreadyExistsException (dc);
      upperCaseClassMap.put (name.toUpperCase (), c);
    }
    classes.put (name, c);
    return c;
  }

  /**
   * Gets a reference to the already created {@link JSDefinedClass}.
   * 
   * @return null If the class is not yet created.
   */
  public JSDefinedClass _getClass (final String name)
  {
    return classes.get (name);
  }

  /**
   * Order is based on the lexicological order of the package name.
   */
  public int compareTo (final JSPackage that)
  {
    return this.m_sName.compareTo (that.m_sName);
  }

  /**
   * Creates, if necessary, and returns the package javadoc for this
   * JDefinedClass.
   * 
   * @return JDocComment containing javadocs for this class
   */
  public JSDocComment javadoc ()
  {
    if (jdoc == null)
      jdoc = new JSDocComment (owner ());
    return jdoc;
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
    classes.remove (c.name ());
    if (upperCaseClassMap != null)
      upperCaseClassMap.remove (c.name ().toUpperCase ());
  }

  /**
   * Reference a class within this package.
   */
  public AbstractJSClass ref (final String name) throws ClassNotFoundException
  {
    if (name.indexOf ('.') >= 0)
      throw new IllegalArgumentException ("JClass name contains '.': " + name);

    String n = "";
    if (!isUnnamed ())
      n = this.m_sName + '.';
    n += name;

    return owner.ref (Class.forName (n));
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
   * Returns an iterator that walks the top-level classes defined in this
   * package.
   */
  public Iterator <JSDefinedClass> classes ()
  {
    return classes.values ().iterator ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public Collection <JSDefinedClass> getAllClasses ()
  {
    return ContainerHelper.newList (classes.values ());
  }

  /**
   * Checks if a given name is already defined as a class/interface
   */
  public boolean isDefined (final String classLocalName)
  {
    final Iterator <JSDefinedClass> itr = classes ();
    while (itr.hasNext ())
    {
      if ((itr.next ()).name ().equals (classLocalName))
        return true;
    }

    return false;
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

  /**
   * Return the code model root object being used to create this package.
   */
  public final JSCodeModel owner ()
  {
    return owner;
  }

  public void declare (final JSFormatter f)
  {}

  public void generate (final JSFormatter f)
  {
    f.p (m_sName);
  }

  int countArtifacts ()
  {
    int r = classes.size ();
    if (jdoc != null)
      r++;
    return r;
  }
}
