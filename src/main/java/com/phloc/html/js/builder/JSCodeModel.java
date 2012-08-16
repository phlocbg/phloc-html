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

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * Root of the code DOM.
 * <p>
 * Here's your typical CodeModel application.
 * 
 * <pre>
 * JCodeModel cm = new JCodeModel();
 * 
 * // generate source code by populating the 'cm' tree.
 * cm._class(...);
 * ...
 * 
 * // write them out
 * cm.build(new File("."));
 * </pre>
 * <p>
 * Every CodeModel node is always owned by one {@link JSCodeModel} object at any
 * given time (which can be often accesesd by the <tt>owner()</tt> method.) As
 * such, when you generate Java code, most of the operation works in a top-down
 * fashion. For example, you create a class from {@link JSCodeModel}, which
 * gives you a {@link JSDefinedClass}. Then you invoke a method on it to
 * generate a new method, which gives you {@link JSMethod}, and so on. There are
 * a few exceptions to this, most notably building {@link IJSExpression}s, but
 * generally you work with CodeModel in a top-down fashion. Because of this
 * design, most of the CodeModel classes aren't directly instanciable.
 * <h2>Where to go from here?</h2>
 * <p>
 * Most of the time you'd want to populate new type definitions in a
 * {@link JSCodeModel}. See {@link #_class(String)}.
 */
public final class JSCodeModel
{
  public final JSPrimitiveType ARRAY = new JSPrimitiveType (this, "Array");
  public final JSPrimitiveType BOOLEAN = new JSPrimitiveType (this, "Boolean");
  public final JSPrimitiveType DATE = new JSPrimitiveType (this, "Date");
  public final JSPrimitiveType ERROR = new JSPrimitiveType (this, "Error");
  public final JSPrimitiveType MATH = new JSPrimitiveType (this, "Math");
  public final JSPrimitiveType NUMBER = new JSPrimitiveType (this, "number");
  public final JSPrimitiveType STRING = new JSPrimitiveType (this, "string");

  /** The packages that this JCodeWriter contains. */
  private final HashMap <String, JSPackage> m_aPackages = new HashMap <String, JSPackage> ();

  public JSCodeModel ()
  {}

  /**
   * Add a package to the list of packages to be generated
   * 
   * @param name
   *        Name of the package. Use "" to indicate the root package.
   * @return Newly generated package
   */
  JSPackage _package (final String name)
  {
    JSPackage p = m_aPackages.get (name);
    if (p == null)
    {
      p = new JSPackage (this, name);
      m_aPackages.put (name, p);
    }
    return p;
  }

  public JSPackage rootPackage ()
  {
    return _package ("");
  }

  @Nonnull
  @ReturnsMutableCopy
  public Collection <JSPackage> packages ()
  {
    return ContainerHelper.newList (m_aPackages.values ());
  }

  /**
   * Creates a new generated class.
   * 
   * @exception JSNameAlreadyExistsException
   *            When the specified class/interface was already created.
   */
  public JSDefinedClass _class (final String fullyqualifiedName) throws JSNameAlreadyExistsException
  {
    final int idx = fullyqualifiedName.lastIndexOf ('.');
    if (idx < 0)
      return rootPackage ()._class (fullyqualifiedName);
    return _package (fullyqualifiedName.substring (0, idx))._class (fullyqualifiedName.substring (idx + 1));
  }

  /**
   * Gets a reference to the already created generated class.
   * 
   * @return null If the class is not yet created.
   * @see JSPackage#getClass(String)
   */
  public JSDefinedClass _getClass (final String fullyQualifiedName)
  {
    final int idx = fullyQualifiedName.lastIndexOf ('.');
    if (idx < 0)
      return rootPackage ().getClass (fullyQualifiedName);
    return _package (fullyQualifiedName.substring (0, idx)).getClass (fullyQualifiedName.substring (idx + 1));
  }

  /**
   * Returns the number of files to be generated
   */
  public int countArtifacts ()
  {
    int r = 0;
    for (final JSPackage pkg : packages ())
      r += pkg.countArtifacts ();
    return r;
  }
}
