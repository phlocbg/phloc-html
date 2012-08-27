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
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.json.IJSON;

/**
 * Factory methods that generate various {@link IJSExpression}s.
 * 
 * @author philip
 */
@Immutable
public final class JSExpr
{
  /**
   * This class is not instancable.
   */
  private JSExpr ()
  {}

  @Nonnull
  public static JSAssignment assign (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final String v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

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
  public static JSInvocation invoke (@Nonnull @Nonempty final String method)
  {
    return new JSInvocation ((IJSExpression) null, method);
  }

  @Nonnull
  public static JSInvocation invoke (@Nonnull final JSMethod method)
  {
    return new JSInvocation ((IJSExpression) null, method);
  }

  @Nonnull
  public static JSInvocation invoke (@Nullable final IJSExpression lhs, @Nonnull @Nonempty final String method)
  {
    return new JSInvocation (lhs, method);
  }

  @Nonnull
  public static JSInvocation invoke (@Nullable final IJSExpression lhs, @Nonnull final JSMethod method)
  {
    return new JSInvocation (lhs, method);
  }

  @Nonnull
  public static JSInvocation invokeThis (@Nonnull @Nonempty final String method)
  {
    return invoke (THIS, method);
  }

  @Nonnull
  public static JSInvocation invokeThis (@Nonnull final JSMethod method)
  {
    return invoke (THIS, method);
  }

  @Nonnull
  public static JSInvocation invoke (@Nonnull final JSFunction function)
  {
    return new JSInvocation (function);
  }

  @Nonnull
  public static JSFieldRef ref (@Nonnull final String field)
  {
    return new JSFieldRef ((IJSExpression) null, field);
  }

  @Nonnull
  public static JSFieldRef ref (@Nullable final IJSExpression lhs, @Nonnull final JSVar field)
  {
    return new JSFieldRef (lhs, field);
  }

  @Nonnull
  public static JSFieldRef ref (@Nullable final IJSExpression lhs, @Nonnull final String field)
  {
    return new JSFieldRef (lhs, field);
  }

  @Nonnull
  public static JSFieldRef ref (@Nullable final IJSExpression lhs, @Nonnull final String... fields)
  {
    if (ArrayHelper.isEmpty (fields))
      throw new IllegalArgumentException ("fields may not be empty");
    JSFieldRef ret = new JSFieldRef (lhs, fields[0]);
    for (int i = 1; i < fields.length; ++i)
      ret = new JSFieldRef (ret, fields[i]);
    return ret;
  }

  @Nonnull
  public static JSFieldRef refThis (@Nonnull final JSVar field)
  {
    return ref (THIS, field);
  }

  @Nonnull
  public static JSFieldRef refThis (@Nonnull final String field)
  {
    return ref (THIS, field);
  }

  @Nonnull
  public static JSFieldRef refThis (@Nonnull final String... fields)
  {
    return ref (THIS, fields);
  }

  @Nonnull
  public static JSArrayCompRef component (@Nonnull final IJSExpression lhs, @Nonnull final IJSExpression index)
  {
    return new JSArrayCompRef (lhs, index);
  }

  @Nonnull
  public static JSCast cast (@Nonnull final AbstractJSType type, @Nonnull final IJSExpression expr)
  {
    return new JSCast (type, expr);
  }

  @Nonnull
  public static JSArray newArray ()
  {
    return new JSArray ();
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

  public static final IJSExpression NULL = new JSAtom ("null");

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
  public static AbstractJSExpression lit (final float f)
  {
    if (Float.isNaN (f))
      return JSPrimitiveType.NUMBER.nan ();
    return new JSAtom (Float.toString (f));
  }

  @Nonnull
  public static AbstractJSExpression lit (final double d)
  {
    if (Double.isNaN (d))
      return JSPrimitiveType.NUMBER.nan ();
    return new JSAtom (Double.toString (d));
  }

  @Nonnull
  public static JSStringLiteral lit (final char c)
  {
    return new JSStringLiteral (Character.toString (c));
  }

  @Nonnull
  public static JSStringLiteral lit (@Nonnull final String s)
  {
    return new JSStringLiteral (s);
  }

  @Nonnull
  public static JSRegExLiteral regex (@Nonnull final String s)
  {
    return new JSRegExLiteral (s);
  }

  @Nonnull
  public static AbstractJSExpression json (@Nonnull final IJSON aJSON)
  {
    return direct (aJSON.getJSONString (JSPrinter.isIdentAndAlign ()));
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
  @Nonnull
  public static AbstractJSExpression direct (@Nonnull final String source)
  {
    return new AbstractJSExpression ()
    {
      public void generate (final JSFormatter f)
      {
        f.plain (source);
      }
    };
  }
}
