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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Factory methods that generate various {@link IJSExpression}s.
 */
public final class JSExpr
{
  /**
   * This class is not instanciable.
   */
  private JSExpr ()
  {}

  @Nonnull
  public static JSAssignment assign (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (lhs, "=", rhs);
  }

  @Nonnull
  public static JSAssignment assignPlus (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (lhs, "+=", rhs);
  }

  @Nonnull
  public static JSAssignment assignMinus (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (lhs, "-=", rhs);
  }

  @Nonnull
  public static JSAssignment assignMultiply (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (lhs, "*=", rhs);
  }

  @Nonnull
  public static JSAssignment assignDivide (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (lhs, "/=", rhs);
  }

  @Nonnull
  public static JSAssignment assignModulo (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (lhs, "%=", rhs);
  }

  @Nonnull
  public static JSInvocation _new (@Nonnull final AbstractJSType t)
  {
    return new JSInvocation (t);
  }

  @Nonnull
  public static JSInvocation invoke (@Nonnull final String method)
  {
    return new JSInvocation ((IJSExpression) null, method);
  }

  @Nonnull
  public static JSInvocation invoke (final JSMethod method)
  {
    return new JSInvocation ((IJSExpression) null, method);
  }

  @Nonnull
  public static JSInvocation invoke (@Nullable final IJSExpression lhs, final String method)
  {
    return new JSInvocation (lhs, method);
  }

  @Nonnull
  public static JSInvocation invoke (@Nullable final IJSExpression lhs, final JSMethod method)
  {
    return new JSInvocation (lhs, method);
  }

  @Nonnull
  public static JSInvocation invoke (final JSFunction function)
  {
    return new JSInvocation (function);
  }

  @Nonnull
  public static JSFieldRef ref (final String field)
  {
    return new JSFieldRef ((IJSExpression) null, field);
  }

  @Nonnull
  public static JSFieldRef ref (final IJSExpression lhs, final JSVar field)
  {
    return new JSFieldRef (lhs, field);
  }

  @Nonnull
  public static JSFieldRef ref (final IJSExpression lhs, final String field)
  {
    return new JSFieldRef (lhs, field);
  }

  @Nonnull
  public static JSArrayCompRef component (final IJSExpression lhs, final IJSExpression index)
  {
    return new JSArrayCompRef (lhs, index);
  }

  @Nonnull
  public static JSCast cast (final AbstractJSType type, final IJSExpression expr)
  {
    return new JSCast (type, expr);
  }

  @Nonnull
  public static JSArray newArray ()
  {
    return newArray (null);
  }

  @Nonnull
  public static JSArray newArray (@Nullable final AbstractJSType type)
  {
    return new JSArray (type);
  }

  @Nonnull
  public static JSAssocArray newAssocArray ()
  {
    return new JSAssocArray ();
  }

  @Nonnull
  public static JSAnonymousFunction anonymousFunction ()
  {
    return anonymousFunction (null);
  }

  @Nonnull
  public static JSAnonymousFunction anonymousFunction (@Nullable final AbstractJSType type)
  {
    return new JSAnonymousFunction (type);
  }

  public static final IJSExpression THIS = new JSAtom ("this");

  /**
   * Returns a reference to "this", an implicit reference to the current object.
   */
  @Nonnull
  public static IJSExpression _this ()
  {
    return THIS;
  }

  /* -- Literals -- */

  public static final IJSExpression NULL = new JSAtom ("null");

  @Nonnull
  public static IJSExpression _null ()
  {
    return NULL;
  }

  /**
   * Boolean constant that represents <code>true</code>
   */
  public static final JSAtom TRUE = new JSAtom ("true");

  /**
   * Boolean constant that represents <code>false</code>
   */
  public static final JSAtom FALSE = new JSAtom ("false");

  /**
   * Boolean constant that represents <code>undefined</code>
   */
  public static final JSAtom UNDEFINED = new JSAtom ("undefined");

  @Nonnull
  public static JSAtom lit (final boolean b)
  {
    return b ? TRUE : FALSE;
  }

  @Nonnull
  public static JSAtom lit (final int n)
  {
    return new JSAtom (Integer.toString (n));
  }

  @Nonnull
  public static JSAtom lit (final long n)
  {
    return new JSAtom (Long.toString (n));
  }

  @Nonnull
  public static JSAtom lit (final float f)
  {
    if (Float.isNaN (f))
      return new JSAtom ("Number.NaN");
    return new JSAtom (Float.toString (f));
  }

  @Nonnull
  public static JSAtom lit (final double d)
  {
    if (Double.isNaN (d))
      return new JSAtom ("Number.NaN");
    return new JSAtom (Double.toString (d));
  }

  @Nonnull
  public static JSStringLiteral lit (final char c)
  {
    return new JSStringLiteral (Character.toString (c));
  }

  @Nonnull
  public static JSStringLiteral lit (final String s)
  {
    return new JSStringLiteral (s);
  }

  @Nonnull
  public static JSRegExLiteral regex (final String s)
  {
    return new JSRegExLiteral (s);
  }

  /**
   * Creates an expression directly from a source code fragment.
   * <p>
   * This method can be used as a short-cut to create a {@link IJSExpression}.
   * For example, instead of <code>_a.gt(_b)</code>, you can write it as:
   * <code>JSExpr.direct("a>b")</code>.
   * <p>
   * Be warned that there is a danger in using this method, as it obfuscates the
   * object model.
   */
  @Deprecated
  public static IJSExpression direct (final String source)
  {
    return new AbstractJSExpressionImpl ()
    {
      public void generate (final JSFormatter f)
      {
        f.plain ('(').plain (source).plain (')');
      }
    };
  }
}
