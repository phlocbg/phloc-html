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
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.StringHelper;

/**
 * Class for generating expressions containing operators
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

  private static class JSTightUnaryOp extends AbstractJSExpressionImpl
  {
    final String m_sOp;
    final IJSExpression m_aExpr;
    final boolean m_bOpFirst;

    JSTightUnaryOp (@Nonnull @Nonempty final String op, @Nonnull final IJSExpression e)
    {
      this (op, e, true);
    }

    JSTightUnaryOp (@Nonnull final IJSExpression e, @Nonnull @Nonempty final String op)
    {
      this (op, e, false);
    }

    private JSTightUnaryOp (@Nonnull final String op, @Nonnull final IJSExpression e, final boolean bOpFirst)
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

  private static class JSUnaryOp extends JSTightUnaryOp
  {
    JSUnaryOp (@Nonnull @Nonempty final String op, @Nonnull final IJSExpression e)
    {
      super (op, e);
    }

    JSUnaryOp (@Nonnull final IJSExpression e, @Nonnull @Nonempty final String op)
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
    return new JSUnaryOp ("-", e);
  }

  @Nonnull
  public static IJSExpression inParantheses (@Nonnull final IJSExpression e)
  {
    return new AbstractJSExpressionImpl ()
    {
      public void generate (@Nonnull final JSFormatter f)
      {
        f.plain ('(').generatable (e).plain (')');
      }
    };
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
    return new JSUnaryOp ("!", e);
  }

  @Nonnull
  public static IJSExpression complement (@Nonnull final IJSExpression e)
  {
    return new JSUnaryOp ("~", e);
  }

  @Nonnull
  public static IJSExpression incr (@Nonnull final IJSExpression e)
  {
    return new JSTightUnaryOp (e, "++");
  }

  @Nonnull
  public static IJSExpression decr (@Nonnull final IJSExpression e)
  {
    return new JSTightUnaryOp (e, "--");
  }

  @Nonnull
  public static IJSExpression typeof (@Nonnull final IJSExpression e)
  {
    return new JSTightUnaryOp ("typeof ", e);
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
