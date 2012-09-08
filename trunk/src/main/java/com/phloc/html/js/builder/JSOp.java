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
  public static boolean hasOperator (@Nullable final IJSExpression aExpr)
  {
    return aExpr instanceof JSOpUnary || aExpr instanceof JSOpBinary || aExpr instanceof JSOpTernary;
  }

  /* -- Unary operators -- */

  @Nonnull
  public static AbstractJSExpression minus (@Nonnull final IJSExpression aExpr)
  {
    return new JSOpUnaryWithParanthesis ("-", aExpr);
  }

  @Nonnull
  public static AbstractJSExpression inParantheses (@Nonnull final IJSExpression aExpr)
  {
    return new JSExprParanthesis (aExpr);
  }

  /**
   * Logical not <tt>'!x'</tt>.
   */
  @Nonnull
  public static AbstractJSExpression not (@Nonnull final IJSExpression aExpr)
  {
    if (aExpr == JSExpr.TRUE)
      return JSExpr.FALSE;
    if (aExpr == JSExpr.FALSE)
      return JSExpr.TRUE;
    return new JSOpUnaryWithParanthesis ("!", aExpr);
  }

  @Nonnull
  public static AbstractJSExpression complement (@Nonnull final IJSExpression aExpr)
  {
    return new JSOpUnaryWithParanthesis ("~", aExpr);
  }

  @Nonnull
  public static AbstractJSExpression incr (@Nonnull final IJSExpression aExpr)
  {
    return new JSOpUnary (aExpr, "++");
  }

  @Nonnull
  public static AbstractJSExpression decr (@Nonnull final IJSExpression aExpr)
  {
    return new JSOpUnary (aExpr, "--");
  }

  @Nonnull
  public static AbstractJSExpression typeof (@Nonnull final IJSExpression aExpr)
  {
    return new JSOpUnary ("typeof ", aExpr);
  }

  /* -- Binary operators -- */

  @Nonnull
  public static AbstractJSExpression plus (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "+", aRight);
  }

  @Nonnull
  public static AbstractJSExpression minus (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "-", aRight);
  }

  @Nonnull
  public static AbstractJSExpression mul (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "*", aRight);
  }

  @Nonnull
  public static AbstractJSExpression div (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "/", aRight);
  }

  @Nonnull
  public static AbstractJSExpression mod (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "%", aRight);
  }

  @Nonnull
  public static AbstractJSExpression shl (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "<<", aRight);
  }

  @Nonnull
  public static AbstractJSExpression shr (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, ">>", aRight);
  }

  @Nonnull
  public static AbstractJSExpression shrz (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, ">>>", aRight);
  }

  @Nonnull
  public static AbstractJSExpression band (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "&", aRight);
  }

  @Nonnull
  public static AbstractJSExpression bor (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "|", aRight);
  }

  @Nonnull
  public static IJSExpression cand (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    if (aLeft == JSExpr.TRUE)
      return aRight;
    if (aRight == JSExpr.TRUE)
      return aLeft;
    if (aLeft == JSExpr.FALSE || aRight == JSExpr.FALSE)
      return JSExpr.FALSE;
    return new JSOpBinary (aLeft, "&&", aRight);
  }

  @Nonnull
  public static IJSExpression cor (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    if (aLeft == JSExpr.TRUE || aRight == JSExpr.TRUE)
      return JSExpr.TRUE;
    if (aLeft == JSExpr.FALSE)
      return aRight;
    if (aRight == JSExpr.FALSE)
      return aLeft;
    return new JSOpBinary (aLeft, "||", aRight);
  }

  @Nonnull
  public static AbstractJSExpression xor (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "^", aRight);
  }

  @Nonnull
  public static AbstractJSExpression lt (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "<", aRight);
  }

  @Nonnull
  public static AbstractJSExpression lte (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "<=", aRight);
  }

  @Nonnull
  public static AbstractJSExpression gt (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, ">", aRight);
  }

  @Nonnull
  public static AbstractJSExpression gte (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, ">=", aRight);
  }

  // equals
  @Nonnull
  public static AbstractJSExpression eq (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "==", aRight);
  }

  // exactly equals
  @Nonnull
  public static AbstractJSExpression eeq (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "===", aRight);
  }

  // not equal
  @Nonnull
  public static AbstractJSExpression ne (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "!=", aRight);
  }

  // exactly not equal
  @Nonnull
  public static AbstractJSExpression ene (@Nonnull final IJSExpression aLeft, @Nonnull final IJSExpression aRight)
  {
    return new JSOpBinary (aLeft, "!==", aRight);
  }

  @Nonnull
  public static AbstractJSExpression _instanceof (@Nonnull final IJSExpression aLeft,
                                                  @Nonnull final AbstractJSType aRight)
  {
    return new JSOpBinary (aLeft, "instanceof", aRight);
  }

  /* -- Ternary operators -- */

  @Nonnull
  public static AbstractJSExpression cond (@Nonnull final IJSExpression aCond,
                                           @Nonnull final IJSExpression aIfTrue,
                                           @Nonnull final IJSExpression aIfFalse)
  {
    return new JSOpTernary (aCond, "?", aIfTrue, ":", aIfFalse);
  }
}
