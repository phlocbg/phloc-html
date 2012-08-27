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


/**
 * Class for generating expressions containing operators
 * 
 * @author philip
 */
@Immutable
public final class JSOp
{
  private JSOp ()
  {}

  /**
   * Determine whether the top level of an expression involves an operator.
   */
  static boolean hasTopOp (@Nullable final IJSExpression e)
  {
    return (e instanceof JSOpUnary) || (e instanceof JSOpBinary) || (e instanceof JSOpTernary);
  }

  /* -- Unary operators -- */

  @Nonnull
  public static AbstractJSExpression minus (@Nonnull final IJSExpression e)
  {
    return new JSOpUnaryWithParanthesis ("-", e);
  }

  @Nonnull
  public static AbstractJSExpression inParantheses (@Nonnull final IJSExpression e)
  {
    return new JSExprParanthesis (e);
  }

  /**
   * Logical not <tt>'!x'</tt>.
   */
  @Nonnull
  public static AbstractJSExpression not (@Nonnull final IJSExpression e)
  {
    if (e == JSExpr.TRUE)
      return JSExpr.FALSE;
    if (e == JSExpr.FALSE)
      return JSExpr.TRUE;
    return new JSOpUnaryWithParanthesis ("!", e);
  }

  @Nonnull
  public static AbstractJSExpression complement (@Nonnull final IJSExpression e)
  {
    return new JSOpUnaryWithParanthesis ("~", e);
  }

  @Nonnull
  public static AbstractJSExpression incr (@Nonnull final IJSExpression e)
  {
    return new JSOpUnary (e, "++");
  }

  @Nonnull
  public static AbstractJSExpression decr (@Nonnull final IJSExpression e)
  {
    return new JSOpUnary (e, "--");
  }

  @Nonnull
  public static AbstractJSExpression typeof (@Nonnull final IJSExpression e)
  {
    return new JSOpUnary ("typeof ", e);
  }

  /* -- Binary operators -- */

  @Nonnull
  public static AbstractJSExpression plus (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "+", right);
  }

  @Nonnull
  public static AbstractJSExpression minus (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "-", right);
  }

  @Nonnull
  public static AbstractJSExpression mul (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "*", right);
  }

  @Nonnull
  public static AbstractJSExpression div (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "/", right);
  }

  @Nonnull
  public static AbstractJSExpression mod (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "%", right);
  }

  @Nonnull
  public static AbstractJSExpression shl (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "<<", right);
  }

  @Nonnull
  public static AbstractJSExpression shr (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, ">>", right);
  }

  @Nonnull
  public static AbstractJSExpression shrz (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, ">>>", right);
  }

  @Nonnull
  public static AbstractJSExpression band (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "&", right);
  }

  @Nonnull
  public static AbstractJSExpression bor (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "|", right);
  }

  @Nonnull
  public static IJSExpression cand (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    if (left == JSExpr.TRUE)
      return right;
    if (right == JSExpr.TRUE)
      return left;
    if (left == JSExpr.FALSE)
      return left; // JExpr.FALSE
    if (right == JSExpr.FALSE)
      return right; // JExpr.FALSE
    return new JSOpBinary (left, "&&", right);
  }

  @Nonnull
  public static IJSExpression cor (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    if (left == JSExpr.TRUE)
      return left; // JExpr.TRUE
    if (right == JSExpr.TRUE)
      return right; // JExpr.FALSE
    if (left == JSExpr.FALSE)
      return right;
    if (right == JSExpr.FALSE)
      return left;
    return new JSOpBinary (left, "||", right);
  }

  @Nonnull
  public static AbstractJSExpression xor (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "^", right);
  }

  @Nonnull
  public static AbstractJSExpression lt (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "<", right);
  }

  @Nonnull
  public static AbstractJSExpression lte (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "<=", right);
  }

  @Nonnull
  public static AbstractJSExpression gt (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, ">", right);
  }

  @Nonnull
  public static AbstractJSExpression gte (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, ">=", right);
  }

  // equals
  @Nonnull
  public static AbstractJSExpression eq (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "==", right);
  }

  // exactly equals
  @Nonnull
  public static AbstractJSExpression eeq (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "===", right);
  }

  // not equal
  @Nonnull
  public static AbstractJSExpression ne (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "!=", right);
  }

  // exactly not equal
  @Nonnull
  public static AbstractJSExpression ene (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSOpBinary (left, "!==", right);
  }

  @Nonnull
  public static AbstractJSExpression _instanceof (@Nonnull final IJSExpression left, @Nonnull final AbstractJSType right)
  {
    return new JSOpBinary (left, "instanceof", right);
  }

  /* -- Ternary operators -- */

  @Nonnull
  public static AbstractJSExpression cond (@Nonnull final IJSExpression cond,
                                           @Nonnull final IJSExpression ifTrue,
                                           @Nonnull final IJSExpression ifFalse)
  {
    return new JSOpTernary (cond, "?", ifTrue, ":", ifFalse);
  }
}
