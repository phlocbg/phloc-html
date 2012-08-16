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

import com.phloc.html.js.marshal.JSMarshaller;

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

  public static IJSExpression assign (final IJSAssignmentTarget lhs, final IJSExpression rhs)
  {
    return new JSAssignment (lhs, rhs);
  }

  public static IJSExpression assignPlus (final IJSAssignmentTarget lhs, final IJSExpression rhs)
  {
    return new JSAssignment (lhs, rhs, "+");
  }

  public static JSInvocation _new (final AbstractJSClass c)
  {
    return new JSInvocation (c);
  }

  public static JSInvocation _new (final AbstractJSType t)
  {
    return new JSInvocation (t);
  }

  public static JSInvocation invoke (final String method)
  {
    return new JSInvocation ((IJSExpression) null, method);
  }

  public static JSInvocation invoke (final JSMethod method)
  {
    return new JSInvocation ((IJSExpression) null, method);
  }

  public static JSInvocation invoke (final IJSExpression lhs, final JSMethod method)
  {
    return new JSInvocation (lhs, method);
  }

  public static JSInvocation invoke (final IJSExpression lhs, final String method)
  {
    return new JSInvocation (lhs, method);
  }

  public static JSFieldRef ref (final String field)
  {
    return new JSFieldRef ((IJSExpression) null, field);
  }

  public static JSFieldRef ref (final IJSExpression lhs, final JSVar field)
  {
    return new JSFieldRef (lhs, field);
  }

  public static JSFieldRef ref (final IJSExpression lhs, final String field)
  {
    return new JSFieldRef (lhs, field);
  }

  public static JSFieldRef refthis (final String field)
  {
    return new JSFieldRef (null, field, true);
  }

  public static JSArrayCompRef component (final IJSExpression lhs, final IJSExpression index)
  {
    return new JSArrayCompRef (lhs, index);
  }

  public static JSCast cast (final AbstractJSType type, final IJSExpression expr)
  {
    return new JSCast (type, expr);
  }

  public static JSArray newArray (final AbstractJSType type)
  {
    return newArray (type, null);
  }

  /**
   * Generates {@code new T[size]}.
   * 
   * @param type
   *        The type of the array component. 'T' or {@code new T[size]}.
   */
  public static JSArray newArray (final AbstractJSType type, final IJSExpression size)
  {
    // you cannot create an array whose component type is a generic
    return new JSArray (type.erasure (), size);
  }

  /**
   * Generates {@code new T[size]}.
   * 
   * @param type
   *        The type of the array component. 'T' or {@code new T[size]}.
   */
  public static JSArray newArray (final AbstractJSType type, final int size)
  {
    return newArray (type, lit (size));
  }

  private static final IJSExpression __this = new JSAtom ("this");

  /**
   * Returns a reference to "this", an implicit reference to the current object.
   */
  public static IJSExpression _this ()
  {
    return __this;
  }

  private static final IJSExpression __super = new JSAtom ("super");

  /**
   * Returns a reference to "super", an implicit reference to the super class.
   */
  public static IJSExpression _super ()
  {
    return __super;
  }

  /* -- Literals -- */

  private static final IJSExpression __null = new JSAtom ("null");

  public static IJSExpression _null ()
  {
    return __null;
  }

  /**
   * Boolean constant that represents <code>true</code>
   */
  public static final IJSExpression TRUE = new JSAtom ("true");

  /**
   * Boolean constant that represents <code>false</code>
   */
  public static final IJSExpression FALSE = new JSAtom ("false");

  /**
   * Boolean constant that represents <code>undefined</code>
   */
  public static final IJSExpression UNDEFINED = new JSAtom ("undefined");

  public static IJSExpression lit (final boolean b)
  {
    return b ? TRUE : FALSE;
  }

  public static IJSExpression lit (final int n)
  {
    return new JSAtom (Integer.toString (n));
  }

  public static IJSExpression lit (final long n)
  {
    return new JSAtom (Long.toString (n));
  }

  public static IJSExpression lit (final float f)
  {
    if (Float.isNaN (f))
      return new JSAtom ("Number.NaN");
    return new JSAtom (Float.toString (f));
  }

  public static IJSExpression lit (final double d)
  {
    if (Double.isNaN (d))
      return new JSAtom ("Number.NaN");
    return new JSAtom (Double.toString (d));
  }

  static final String charEscape = "\b\t\n\f\r\"\'\\";
  static final String charMacro = "btnfr\"'\\";

  /**
   * Escapes the given string, then surrounds it by the specified quotation
   * mark.
   */
  public static String quotify (final char quote, final String s)
  {
    return quote + JSMarshaller.javaScriptEscape (s) + quote;
  }

  public static IJSExpression lit (final char c)
  {
    return new JSAtom (quotify ('\'', Character.toString (c)));
  }

  public static IJSExpression lit (final String s)
  {
    return new JSStringLiteral (s);
  }

  /**
   * Creates an expression directly from a source code fragment.
   * <p>
   * This method can be used as a short-cut to create a JExpression. For
   * example, instead of <code>_a.gt(_b)</code>, you can write it as:
   * <code>JExpr.direct("a>b")</code>.
   * <p>
   * Be warned that there is a danger in using this method, as it obfuscates the
   * object model.
   */
  public static IJSExpression direct (final String source)
  {
    return new AbstractJSExpressionImpl ()
    {
      public void generate (final JSFormatter f)
      {
        f.p ('(').p (source).p (')');
      }
    };
  }
}
