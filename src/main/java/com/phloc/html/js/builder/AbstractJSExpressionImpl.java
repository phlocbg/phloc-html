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

/**
 * Provides default implementations for {@link IJSExpression}.
 */
public abstract class AbstractJSExpressionImpl implements IJSExpression
{
  @Nonnull
  public final IJSExpression minus ()
  {
    return JSOp.minus (this);
  }

  @Nonnull
  public final IJSExpression inParantheses ()
  {
    return JSOp.inParantheses (this);
  }

  @Nonnull
  public final IJSExpression not ()
  {
    return JSOp.not (this);
  }

  @Nonnull
  public final IJSExpression complement ()
  {
    return JSOp.complement (this);
  }

  @Nonnull
  public final IJSExpression incr ()
  {
    return JSOp.incr (this);
  }

  @Nonnull
  public final IJSExpression decr ()
  {
    return JSOp.decr (this);
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final char v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final double v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final float v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final int v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final long v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final String v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (@Nonnull final IJSExpression right)
  {
    return JSOp.plus (this, right);
  }

  @Nonnull
  public final IJSExpression minus (@Nonnull final double v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (@Nonnull final float v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (@Nonnull final int v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (@Nonnull final long v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (@Nonnull final IJSExpression right)
  {
    return JSOp.minus (this, right);
  }

  @Nonnull
  public final IJSExpression mul (@Nonnull final double v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (@Nonnull final float v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (@Nonnull final int v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (@Nonnull final long v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (@Nonnull final IJSExpression right)
  {
    return JSOp.mul (this, right);
  }

  @Nonnull
  public final IJSExpression div (@Nonnull final double v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (@Nonnull final float v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (@Nonnull final int v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (@Nonnull final long v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (@Nonnull final IJSExpression right)
  {
    return JSOp.div (this, right);
  }

  @Nonnull
  public final IJSExpression mod (@Nonnull final int v)
  {
    return mod (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mod (@Nonnull final long v)
  {
    return mod (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mod (@Nonnull final IJSExpression right)
  {
    return JSOp.mod (this, right);
  }

  @Nonnull
  public final IJSExpression shl (@Nonnull final int v)
  {
    return shl (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shl (@Nonnull final long v)
  {
    return shl (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shl (@Nonnull final IJSExpression right)
  {
    return JSOp.shl (this, right);
  }

  @Nonnull
  public final IJSExpression shr (@Nonnull final int v)
  {
    return shr (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shr (@Nonnull final long v)
  {
    return shr (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shr (@Nonnull final IJSExpression right)
  {
    return JSOp.shr (this, right);
  }

  @Nonnull
  public final IJSExpression shrz (@Nonnull final int v)
  {
    return shrz (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shrz (@Nonnull final long v)
  {
    return shrz (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shrz (@Nonnull final IJSExpression right)
  {
    return JSOp.shrz (this, right);
  }

  @Nonnull
  public final IJSExpression band (@Nonnull final IJSExpression right)
  {
    return JSOp.band (this, right);
  }

  @Nonnull
  public final IJSExpression bor (@Nonnull final IJSExpression right)
  {
    return JSOp.bor (this, right);
  }

  @Nonnull
  public final IJSExpression cand (@Nonnull final IJSExpression right)
  {
    return JSOp.cand (this, right);
  }

  @Nonnull
  public final IJSExpression cor (@Nonnull final IJSExpression right)
  {
    return JSOp.cor (this, right);
  }

  @Nonnull
  public final IJSExpression xor (@Nonnull final IJSExpression right)
  {
    return JSOp.xor (this, right);
  }

  @Nonnull
  public final IJSExpression lt (@Nonnull final IJSExpression right)
  {
    return JSOp.lt (this, right);
  }

  @Nonnull
  public final IJSExpression lte (@Nonnull final IJSExpression right)
  {
    return JSOp.lte (this, right);
  }

  @Nonnull
  public final IJSExpression gt (@Nonnull final IJSExpression right)
  {
    return JSOp.gt (this, right);
  }

  @Nonnull
  public final IJSExpression gte (@Nonnull final IJSExpression right)
  {
    return JSOp.gte (this, right);
  }

  @Nonnull
  public final IJSExpression eq (@Nonnull final IJSExpression right)
  {
    return JSOp.eq (this, right);
  }

  @Nonnull
  public final IJSExpression eeq (@Nonnull final IJSExpression right)
  {
    return JSOp.eeq (this, right);
  }

  @Nonnull
  public final IJSExpression ne (@Nonnull final IJSExpression right)
  {
    return JSOp.ne (this, right);
  }

  @Nonnull
  public final IJSExpression ene (@Nonnull final IJSExpression right)
  {
    return JSOp.ene (this, right);
  }

  @Nonnull
  public final IJSExpression _instanceof (@Nonnull final AbstractJSType right)
  {
    return JSOp._instanceof (this, right);
  }

  @Nonnull
  public final IJSExpression typeof ()
  {
    return JSOp.typeof (this);
  }

  @Nonnull
  public final JSInvocation invoke (@Nonnull final JSMethod method)
  {
    return JSExpr.invoke (this, method);
  }

  @Nonnull
  public final JSInvocation invoke (@Nonnull final String method)
  {
    return JSExpr.invoke (this, method);
  }

  @Nonnull
  public final JSFieldRef ref (@Nonnull final JSVar field)
  {
    return JSExpr.ref (this, field);
  }

  @Nonnull
  public final JSFieldRef ref (@Nonnull final String field)
  {
    return JSExpr.ref (this, field);
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final char index)
  {
    return component (JSExpr.lit (index));
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final int index)
  {
    return component (JSExpr.lit (index));
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final long index)
  {
    return component (JSExpr.lit (index));
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final String index)
  {
    return component (JSExpr.lit (index));
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final IJSExpression index)
  {
    return JSExpr.component (this, index);
  }
}
