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

  /** The packages that this JCodeWriter contains. */
  private final HashMap <String, JSPackage> packages = new HashMap <String, JSPackage> ();

  /** All JReferencedClasses are pooled here. */
  private final HashMap <Class <?>, JReferencedClass> refClasses = new HashMap <Class <?>, JReferencedClass> ();

  public JSCodeModel ()
  {}

  /**
   * Add a package to the list of packages to be generated
   * 
   * @param name
   *        Name of the package. Use "" to indicate the root package.
   * @return Newly generated package
   */
  public JSPackage _package (final String name)
  {
    JSPackage p = packages.get (name);
    if (p == null)
    {
      p = new JSPackage (name, this);
      packages.put (name, p);
    }
    return p;
  }

  public JSPackage rootPackage ()
  {
    return _package ("");
  }

  /**
   * Returns an iterator that walks the packages defined using this code writer.
   */
  public Iterator <JSPackage> packages ()
  {
    return packages.values ().iterator ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public Collection <JSPackage> getAllPackages ()
  {
    return ContainerHelper.newList (packages.values ());
  }

  /**
   * Creates a new generated class.
   * 
   * @exception JSClassAlreadyExistsException
   *            When the specified class/interface was already created.
   */
  public JSDefinedClass _class (final String fullyqualifiedName) throws JSClassAlreadyExistsException
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
   * @see JSPackage#_getClass(String)
   */
  public JSDefinedClass _getClass (final String fullyQualifiedName)
  {
    final int idx = fullyQualifiedName.lastIndexOf ('.');
    if (idx < 0)
      return rootPackage ()._getClass (fullyQualifiedName);
    return _package (fullyQualifiedName.substring (0, idx))._getClass (fullyQualifiedName.substring (idx + 1));
  }

  /**
   * Returns the number of files to be generated if {@link #build} is invoked
   * now.
   */
  public int countArtifacts ()
  {
    int r = 0;
    final JSPackage [] pkgs = packages.values ().toArray (new JSPackage [packages.size ()]);
    // avoid concurrent modification exception
    for (final JSPackage pkg : pkgs)
      r += pkg.countArtifacts ();
    return r;
  }

  /**
   * Obtains a reference to an existing class from its Class object.
   * <p>
   * The parameter may not be primitive.
   * 
   * @see #_ref(Class) for the version that handles more cases.
   */
  public AbstractJSClass ref (final Class <?> clazz)
  {
    JReferencedClass jrc = refClasses.get (clazz);
    if (jrc == null)
    {
      if (clazz.isPrimitive ())
        throw new IllegalArgumentException (clazz + " is a primitive");
      if (clazz.isArray ())
      {
        return new JSArrayClass (this, _ref (clazz.getComponentType ()));
      }
      jrc = new JReferencedClass (clazz);
      refClasses.put (clazz, jrc);
    }
    return jrc;
  }

  public AbstractJSType _ref (final Class <?> c)
  {
    return ref (c);
  }

  /**
   * References to existing classes.
   * <p>
   * JReferencedClass is kept in a pool so that they are shared. There is one
   * pool for each JCodeModel object.
   * <p>
   * It is impossible to cache JReferencedClass globally only because there is
   * the _package() method, which obtains the owner JPackage object, which is
   * scoped to JCodeModel.
   */
  private class JReferencedClass extends AbstractJSClass implements IJSDeclaration
  {
    private final Class <?> _class;

    JReferencedClass (final Class <?> _clazz)
    {
      super (JSCodeModel.this);
      this._class = _clazz;
      assert !_class.isArray ();
    }

    @Override
    public String name ()
    {
      return _class.getSimpleName ().replace ('$', '.');
    }

    @Override
    public String fullName ()
    {
      return _class.getName ().replace ('$', '.');
    }

    @Override
    public String binaryName ()
    {
      return _class.getName ();
    }

    @Override
    public AbstractJSClass outer ()
    {
      final Class <?> p = _class.getDeclaringClass ();
      if (p == null)
        return null;
      return ref (p);
    }

    @Override
    public JSPackage _package ()
    {
      final String name = fullName ();

      // this type is array
      if (name.indexOf ('[') != -1)
        return JSCodeModel.this._package ("");

      // other normal case
      final int idx = name.lastIndexOf ('.');
      if (idx < 0)
        return JSCodeModel.this._package ("");
      return JSCodeModel.this._package (name.substring (0, idx));
    }

    @Override
    public AbstractJSClass _extends ()
    {
      final Class <?> sp = _class.getSuperclass ();
      if (sp == null)
        return null;
      return ref (sp);
    }

    @Override
    public Iterator <AbstractJSClass> _implements ()
    {
      final Class <?> [] interfaces = _class.getInterfaces ();
      return new Iterator <AbstractJSClass> ()
      {
        private int idx = 0;

        public boolean hasNext ()
        {
          return idx < interfaces.length;
        }

        public AbstractJSClass next ()
        {
          return JSCodeModel.this.ref (interfaces[idx++]);
        }

        public void remove ()
        {
          throw new UnsupportedOperationException ();
        }
      };
    }

    @Override
    public boolean isArray ()
    {
      return false;
    }

    public void declare (final JSFormatter f)
    {}
  }
}
