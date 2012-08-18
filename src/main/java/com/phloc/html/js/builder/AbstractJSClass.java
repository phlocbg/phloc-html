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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents an abstract JS class.
 * 
 * @author philip
 */
public abstract class AbstractJSClass extends AbstractJSType
{
  protected AbstractJSClass ()
  {}

  /**
   * Gets the package to which this class belongs.
   */
  public abstract JSPackage _package ();

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
  @Nullable
  public abstract AbstractJSClass _extends ();

  /**
   * Checks the relationship between two classes.
   * <p>
   * This method works in the same way as {@link Class#isAssignableFrom(Class)}
   * works. For example, baseClass.isAssignableFrom(derivedClass)==true.
   */
  public final boolean isAssignableFrom (@Nonnull final AbstractJSClass derived)
  {
    // to avoid the confusion, always use "this" explicitly in this method.

    if (this == derived)
      return true;

    final AbstractJSClass b = derived._extends ();
    if (b != null && isAssignableFrom (b))
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
  public final AbstractJSClass getBaseClass (@Nonnull final AbstractJSClass baseType)
  {
    if (equals (baseType))
      return this;

    final AbstractJSClass b = _extends ();
    if (b != null)
    {
      final AbstractJSClass bc = b.getBaseClass (baseType);
      if (bc != null)
        return bc;
    }

    return null;
  }

  @Override
  public String toString ()
  {
    return getClass ().getName () + '(' + name () + ')';
  }

  /** Generates a static method invocation. */
  @Nonnull
  public final JSInvocation staticInvoke (final JSMethod method)
  {
    return new JSInvocation (this, method);
  }

  /** Generates a static method invocation. */
  @Nonnull
  public final JSInvocation staticInvoke (final String method)
  {
    return new JSInvocation (this, method);
  }

  /** Static field reference. */
  @Nonnull
  public final JSFieldRef staticRef (final String field)
  {
    return new JSFieldRef (this, field);
  }

  /** Static field reference. */
  @Nonnull
  public final JSFieldRef staticRef (final JSVar field)
  {
    return new JSFieldRef (this, field);
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.type (this);
  }

  /**
   * Prints the class name in JSDoc @link format.
   */
  void printLink (@Nonnull final JSFormatter f)
  {
    f.plain ("{@link ").generatable (this).plain ('}');
  }
}
