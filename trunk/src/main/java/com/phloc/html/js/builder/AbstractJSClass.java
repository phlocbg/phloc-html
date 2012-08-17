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

import java.util.Iterator;

import javax.annotation.Nullable;

/**
 * Represents a Java reference type, such as a class, an interface, an enum, an
 * array type, a parameterized type.
 * <p>
 * To be exact, this object represents an "use" of a reference type, not
 * necessarily a declaration of it, which is modeled as {@link JSDefinedClass}.
 */
public abstract class AbstractJSClass extends AbstractJSType
{
  private final JSCodeModel m_aOwner;

  protected AbstractJSClass (final JSCodeModel _owner)
  {
    m_aOwner = _owner;
  }

  /**
   * Gets the name of this class.
   * 
   * @return name of this class, without any qualification. For example, this
   *         method returns "String" for <code>java.lang.String</code>.
   */

  @Override
  public abstract String name ();

  /**
   * Gets the package to which this class belongs. TODO: shall we move move this
   * down?
   */
  public abstract JSPackage _package ();

  /**
   * Returns the class in which this class is nested, or <tt>null</tt> if this
   * is a top-level class.
   */
  @Nullable
  public AbstractJSClass outer ()
  {
    return null;
  }

  /** Gets the JCodeModel object to which this object belongs. */

  public final JSCodeModel owner ()
  {
    return m_aOwner;
  }

  /**
   * Gets the super class of this class.
   * 
   * @return Returns the JClass representing the superclass of the entity (class
   *         or interface) represented by this {@link AbstractJSClass}. Even if
   *         no super class is given explicitly or this {@link AbstractJSClass}
   *         is not a class, this method still returns {@link AbstractJSClass}
   *         for {@link Object}. If this JClass represents {@link Object},
   *         return null.
   */
  public abstract AbstractJSClass _extends ();

  /**
   * Iterates all super interfaces directly implemented by this class/interface.
   * 
   * @return A non-null valid iterator that iterates all {@link AbstractJSClass}
   *         objects that represents those interfaces implemented by this
   *         object.
   */
  public abstract Iterator <AbstractJSClass> _implements ();

  /**
   * Checks the relationship between two classes.
   * <p>
   * This method works in the same way as {@link Class#isAssignableFrom(Class)}
   * works. For example, baseClass.isAssignableFrom(derivedClass)==true.
   */
  public final boolean isAssignableFrom (final AbstractJSClass derived)
  {
    // to avoid the confusion, always use "this" explicitly in this method.

    if (this == derived)
      return true;

    final AbstractJSClass b = derived._extends ();
    if (b != null && this.isAssignableFrom (b))
      return true;

    return false;
  }

  /**
   * Gets the parameterization of the given base type.
   * <p>
   * For example, given the following
   * 
   * <pre>
   * <xmp>
   * interface Foo<T> extends List<List<T>> {}
   * interface Bar extends Foo<String> {}
   * </xmp>
   * </pre>
   * 
   * This method works like this:
   * 
   * <pre>
   * <xmp>
   * getBaseClass( Bar, List ) = List<List<String>
   * getBaseClass( Bar, Foo  ) = Foo<String>
   * getBaseClass( Foo<? extends Number>, Collection ) = Collection<List<? extends Number>>
   * getBaseClass( ArrayList<? extends BigInteger>, List ) = List<? extends BigInteger>
   * </xmp>
   * </pre>
   * 
   * @param baseType
   *        The class whose parameterization we are interested in.
   * @return The use of {@code baseType} in {@code this} type. or null if the
   *         type is not assignable to the base type.
   */
  public final AbstractJSClass getBaseClass (final AbstractJSClass baseType)
  {
    if (this.equals (baseType))
      return this;

    final AbstractJSClass b = _extends ();
    if (b != null)
    {
      final AbstractJSClass bc = b.getBaseClass (baseType);
      if (bc != null)
        return bc;
    }

    final Iterator <AbstractJSClass> itfs = _implements ();
    while (itfs.hasNext ())
    {
      final AbstractJSClass bc = itfs.next ().getBaseClass (baseType);
      if (bc != null)
        return bc;
    }

    return null;
  }

  @Override
  public String toString ()
  {
    return this.getClass ().getName () + '(' + name () + ')';
  }

  /** Generates a static method invocation. */
  public final JSInvocation staticInvoke (final JSMethod method)
  {
    return new JSInvocation (this, method);
  }

  /** Generates a static method invocation. */
  public final JSInvocation staticInvoke (final String method)
  {
    return new JSInvocation (this, method);
  }

  /** Static field reference. */
  public final JSFieldRef staticRef (final String field)
  {
    return new JSFieldRef (this, field);
  }

  /** Static field reference. */
  public final JSFieldRef staticRef (final JSVar field)
  {
    return new JSFieldRef (this, field);
  }

  public void generate (final JSFormatter f)
  {
    f.type (this);
  }

  /**
   * Prints the class name in javadoc @link format.
   */
  void printLink (final JSFormatter f)
  {
    f.plain ("{@link ").generatable (this).plain ('}');
  }
}
