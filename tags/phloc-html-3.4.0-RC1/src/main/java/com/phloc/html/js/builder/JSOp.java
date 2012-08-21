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
import com.phloc.commons.string.StringHelper;

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
    return (e instanceof JSUnaryOp) || (e instanceof JSBinaryOp) || (e instanceof JSTernaryOp);
  }

  /* -- Unary operators -- */

  private static final class ParanthesisExpr extends AbstractJSExpressionImpl
  {
    private final IJSExpression m_aExpr;

    ParanthesisExpr (@Nonnull final IJSExpression aExpr)
    {
      m_aExpr = aExpr;
    }

    public void generate (@Nonnull final JSFormatter f)
    {
      f.plain ('(').generatable (m_aExpr).plain (')');
    }
  }

  private static class JSUnaryOp extends AbstractJSExpressionImpl
  {
    final String m_sOp;
    final IJSExpression m_aExpr;
    final boolean m_bOpFirst;

    JSUnaryOp (@Nonnull @Nonempty final String op, @Nonnull final IJSExpression e)
    {
      this (op, e, true);
    }

    JSUnaryOp (@Nonnull final IJSExpression e, @Nonnull @Nonempty final String op)
    {
      this (op, e, false);
    }

    private JSUnaryOp (@Nonnull final String op, @Nonnull final IJSExpression e, final boolean bOpFirst)
    {
      if (StringHelper.hasNoText (op))
        throw new IllegalArgumentException ("empty operator");
      if (e == null)
        throw new NullPointerException ("expr");
      m_sOp = op;
      m_aExpr = e;
      m_bOpFirst = bOpFirst;
    }

    public void generate (@Nonnull final JSFormatter f)
    {
      if (m_bOpFirst)
        f.plain (m_sOp).generatable (m_aExpr);
      else
        f.generatable (m_aExpr).plain (m_sOp);
    }
  }

  private static class JSUnaryOpWithParanthesis extends JSUnaryOp
  {
    JSUnaryOpWithParanthesis (@Nonnull @Nonempty final String op, @Nonnull final IJSExpression e)
    {
      super (op, e);
    }

    JSUnaryOpWithParanthesis (@Nonnull final IJSExpression e, @Nonnull @Nonempty final String op)
    {
      super (e, op);
    }

    @Override
    public void generate (@Nonnull final JSFormatter f)
    {
      f.plain ('(');
      super.generate (f);
      f.plain (')');
    }
  }

  @Nonnull
  public static IJSExpression minus (@Nonnull final IJSExpression e)
  {
    return new JSUnaryOpWithParanthesis ("-", e);
  }

  @Nonnull
  public static IJSExpression inParantheses (@Nonnull final IJSExpression e)
  {
    return new ParanthesisExpr (e);
  }

  /**
   * Logical not <tt>'!x'</tt>.
   */
  @Nonnull
  public static IJSExpression not (@Nonnull final IJSExpression e)
  {
    if (e == JSExpr.TRUE)
      return JSExpr.FALSE;
    if (e == JSExpr.FALSE)
      return JSExpr.TRUE;
    return new JSUnaryOpWithParanthesis ("!", e);
  }

  @Nonnull
  public static IJSExpression complement (@Nonnull final IJSExpression e)
  {
    return new JSUnaryOpWithParanthesis ("~", e);
  }

  @Nonnull
  public static IJSExpression incr (@Nonnull final IJSExpression e)
  {
    return new JSUnaryOp (e, "++");
  }

  @Nonnull
  public static IJSExpression decr (@Nonnull final IJSExpression e)
  {
    return new JSUnaryOp (e, "--");
  }

  @Nonnull
  public static IJSExpression typeof (@Nonnull final IJSExpression e)
  {
    return new JSUnaryOp ("typeof ", e);
  }

  /* -- Binary operators -- */

  private static class JSBinaryOp extends AbstractJSExpressionImpl
  {
    private final IJSExpression m_aLeft;
    private final String m_sOp;
    private final IJSGeneratable m_aRight;

    JSBinaryOp (@Nonnull final IJSExpression left,
                @Nonnull @Nonempty final String op,
                @Nonnull final IJSGeneratable right)
    {
      if (left == null)
        throw new NullPointerException ("left");
      if (StringHelper.hasNoText (op))
        throw new IllegalArgumentException ("empty operator");
      if (right == null)
        throw new NullPointerException ("right");
      m_aLeft = left;
      m_sOp = op;
      m_aRight = right;
    }

    public void generate (@Nonnull final JSFormatter f)
    {
      f.plain ('(').generatable (m_aLeft).plain (m_sOp).generatable (m_aRight).plain (')');
    }
  }

  @Nonnull
  public static IJSExpression plus (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "+", right);
  }

  @Nonnull
  public static IJSExpression minus (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "-", right);
  }

  @Nonnull
  public static IJSExpression mul (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "*", right);
  }

  @Nonnull
  public static IJSExpression div (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "/", right);
  }

  @Nonnull
  public static IJSExpression mod (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "%", right);
  }

  @Nonnull
  public static IJSExpression shl (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "<<", right);
  }

  @Nonnull
  public static IJSExpression shr (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, ">>", right);
  }

  @Nonnull
  public static IJSExpression shrz (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, ">>>", right);
  }

  @Nonnull
  public static IJSExpression band (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "&", right);
  }

  @Nonnull
  public static IJSExpression bor (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "|", right);
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
    return new JSBinaryOp (left, "&&", right);
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
    return new JSBinaryOp (left, "||", right);
  }

  @Nonnull
  public static IJSExpression xor (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "^", right);
  }

  @Nonnull
  public static IJSExpression lt (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "<", right);
  }

  @Nonnull
  public static IJSExpression lte (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "<=", right);
  }

  @Nonnull
  public static IJSExpression gt (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, ">", right);
  }

  @Nonnull
  public static IJSExpression gte (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, ">=", right);
  }

  // equals
  @Nonnull
  public static IJSExpression eq (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "==", right);
  }

  // exactly equals
  @Nonnull
  public static IJSExpression eeq (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "===", right);
  }

  // not equal
  @Nonnull
  public static IJSExpression ne (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "!=", right);
  }

  // exactly not equal
  @Nonnull
  public static IJSExpression ene (@Nonnull final IJSExpression left, @Nonnull final IJSExpression right)
  {
    return new JSBinaryOp (left, "!==", right);
  }

  @Nonnull
  public static IJSExpression _instanceof (@Nonnull final IJSExpression left, @Nonnull final AbstractJSType right)
  {
    return new JSBinaryOp (left, "instanceof", right);
  }

  /* -- Ternary operators -- */

  private static class JSTernaryOp extends AbstractJSExpressionImpl
  {
    private final IJSExpression m_aExpr1;
    private final String m_sOp1;
    private final IJSExpression m_aExpr2;
    private final String m_sOp2;
    private final IJSExpression m_aExpr3;

    JSTernaryOp (@Nonnull final IJSExpression e1,
                 @Nonnull @Nonempty final String op1,
                 @Nonnull final IJSExpression e2,
                 @Nonnull @Nonempty final String op2,
                 @Nonnull final IJSExpression e3)
    {
      if (e1 == null)
        throw new NullPointerException ("expr1");
      if (StringHelper.hasNoText (op1))
        throw new IllegalArgumentException ("empty operator1");
      if (e2 == null)
        throw new NullPointerException ("expr2");
      if (StringHelper.hasNoText (op2))
        throw new IllegalArgumentException ("empty operator1");
      if (e3 == null)
        throw new NullPointerException ("expr3");

      m_aExpr1 = e1;
      m_sOp1 = op1;
      m_aExpr2 = e2;
      m_sOp2 = op2;
      m_aExpr3 = e3;
    }

    public void generate (@Nonnull final JSFormatter f)
    {
      f.plain ('(')
       .generatable (m_aExpr1)
       .plain (m_sOp1)
       .generatable (m_aExpr2)
       .plain (m_sOp2)
       .generatable (m_aExpr3)
       .plain (')');
    }
  }

  @Nonnull
  public static IJSExpression cond (@Nonnull final IJSExpression cond,
                                    @Nonnull final IJSExpression ifTrue,
                                    @Nonnull final IJSExpression ifFalse)
  {
    return new JSTernaryOp (cond, "?", ifTrue, ":", ifFalse);
  }
}
