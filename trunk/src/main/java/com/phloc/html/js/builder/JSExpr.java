/**
 * Copyright (C) 2006-2013 phloc systems
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
import com.phloc.commons.annotations.PresentForCodeCoverage;
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
  @SuppressWarnings ("unused")
  @PresentForCodeCoverage
  private static final JSExpr s_aInstance = new JSExpr ();

  /**
   * This class is not instancable.
   */
  private JSExpr ()
  {}

  @Nonnull
  public static JSAssignment assign (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final String v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public static JSAssignment assign (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (aLhs, "=", rhs);
  }

  @Nonnull
  public static JSAssignment assignPlus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (aLhs, "+=", rhs);
  }

  @Nonnull
  public static JSAssignment assignMinus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (aLhs, "-=", rhs);
  }

  @Nonnull
  public static JSAssignment assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (aLhs, "*=", rhs);
  }

  @Nonnull
  public static JSAssignment assignDivide (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (aLhs, "/=", rhs);
  }

  @Nonnull
  public static JSAssignment assignModulo (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression rhs)
  {
    return new JSAssignment (aLhs, "%=", rhs);
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
  public static JSInvocation invoke (@Nullable final IJSExpression aLhs, @Nonnull @Nonempty final String sMethod)
  {
    return new JSInvocation (aLhs, sMethod);
  }

  @Nonnull
  public static JSInvocation invoke (@Nullable final IJSExpression aLhs, @Nonnull final JSMethod aMethod)
  {
    return new JSInvocation (aLhs, aMethod);
  }

  @Nonnull
  public static JSInvocation invokeThis (@Nonnull @Nonempty final String sMethod)
  {
    return invoke (THIS, sMethod);
  }

  @Nonnull
  public static JSInvocation invokeThis (@Nonnull final JSMethod aMethod)
  {
    return invoke (THIS, aMethod);
  }

  @Nonnull
  public static JSInvocation invoke (@Nonnull final JSFunction aFunction)
  {
    return new JSInvocation (aFunction);
  }

  @Nonnull
  public static JSRef ref (@Nonnull final String sField)
  {
    return new JSRef (sField);
  }

  @Nonnull
  public static JSFieldRef ref (@Nonnull final IJSExpression aLhs, @Nonnull final JSVar aField)
  {
    return new JSFieldRef (aLhs, aField);
  }

  @Nonnull
  public static JSFieldRef ref (@Nonnull final IJSExpression aLhs, @Nonnull final String sField)
  {
    return new JSFieldRef (aLhs, sField);
  }

  @Nonnull
  public static JSFieldRef ref (@Nonnull final IJSExpression aLhs, @Nonnull final String... aFields)
  {
    if (ArrayHelper.isEmpty (aFields))
      throw new IllegalArgumentException ("Fields may not be empty");

    JSFieldRef ret = new JSFieldRef (aLhs, aFields[0]);
    for (int i = 1; i < aFields.length; ++i)
      ret = new JSFieldRef (ret, aFields[i]);
    return ret;
  }

  /**
   * @param aField
   *        Field to reference
   * @return <code>this.<i>aField</i></code>
   */
  @Nonnull
  public static JSFieldRef refThis (@Nonnull final JSVar aField)
  {
    return ref (THIS, aField);
  }

  /**
   * @param sField
   *        Field name to reference
   * @return <code>this.<i>sField</i></code>
   */
  @Nonnull
  public static JSFieldRef refThis (@Nonnull final String sField)
  {
    return ref (THIS, sField);
  }

  /**
   * @param aFields
   *        Field names to reference
   * @return <code>this.<i>aFields[0]</i>.<i>aFields[1]</i>....</code>
   */
  @Nonnull
  public static JSFieldRef refThis (@Nonnull final String... aFields)
  {
    return ref (THIS, aFields);
  }

  @Nonnull
  public static JSArrayCompRef component (@Nonnull final IJSExpression aLhs, @Nonnull final IJSExpression index)
  {
    return new JSArrayCompRef (aLhs, index);
  }

  @Nonnull
  public static JSCast cast (@Nonnull final AbstractJSType type, @Nonnull final IJSExpression expr)
  {
    return new JSCast (type, expr);
  }

  public static final IJSExpression THIS = new JSAtom ("this");

  public static final IJSExpression NULL = new JSAtom ("null");

  /**
   * Boolean constant that represents <code>true</code>
   */
  public static final JSAtomBoolean TRUE = new JSAtomBoolean (true);

  /**
   * Boolean constant that represents <code>false</code>
   */
  public static final JSAtomBoolean FALSE = new JSAtomBoolean (false);

  /**
   * Boolean constant that represents <code>undefined</code>
   */
  public static final JSAtom UNDEFINED = new JSAtom ("undefined");

  @Nonnull
  public static JSAtomBoolean lit (final boolean b)
  {
    return b ? TRUE : FALSE;
  }

  @Nonnull
  public static JSAtomInt lit (final int n)
  {
    return new JSAtomInt (n);
  }

  @Nonnull
  public static JSAtomInt lit (final long n)
  {
    return new JSAtomInt (n);
  }

  @Nonnull
  public static AbstractJSExpression lit (final float f)
  {
    if (Float.isNaN (f))
      return JSPrimitiveType.NUMBER.nan ();
    return new JSAtomDecimal (f);
  }

  @Nonnull
  public static AbstractJSExpression lit (final double d)
  {
    if (Double.isNaN (d))
      return JSPrimitiveType.NUMBER.nan ();
    return new JSAtomDecimal (d);
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
  public static JSExprDirect json (@Nonnull final IJSON aJSON)
  {
    return direct (aJSON.getJSONString (JSPrinter.isIndentAndAlign ()));
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
  public static JSExprDirect direct (@Nonnull final String sSource)
  {
    return new JSExprDirect (sSource);
  }
}
