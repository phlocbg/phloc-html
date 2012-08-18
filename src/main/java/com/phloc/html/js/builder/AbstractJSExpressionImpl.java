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

/**
 * Provides default implementations for {@link IJSExpression}.
 * 
 * @author philip
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
  public final IJSExpression plus (final char v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (final double v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (final float v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (final int v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression plus (final long v)
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
  public final IJSExpression minus (final double v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (final float v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (final int v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (final long v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression minus (@Nonnull final IJSExpression right)
  {
    return JSOp.minus (this, right);
  }

  @Nonnull
  public final IJSExpression mul (final double v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (final float v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (final int v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (final long v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mul (@Nonnull final IJSExpression right)
  {
    return JSOp.mul (this, right);
  }

  @Nonnull
  public final IJSExpression div (final double v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (final float v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (final int v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (final long v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression div (@Nonnull final IJSExpression right)
  {
    return JSOp.div (this, right);
  }

  @Nonnull
  public final IJSExpression mod (final int v)
  {
    return mod (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mod (final long v)
  {
    return mod (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression mod (@Nonnull final IJSExpression right)
  {
    return JSOp.mod (this, right);
  }

  @Nonnull
  public final IJSExpression shl (final int v)
  {
    return shl (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shl (final long v)
  {
    return shl (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shl (@Nonnull final IJSExpression right)
  {
    return JSOp.shl (this, right);
  }

  @Nonnull
  public final IJSExpression shr (final int v)
  {
    return shr (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shr (final long v)
  {
    return shr (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shr (@Nonnull final IJSExpression right)
  {
    return JSOp.shr (this, right);
  }

  @Nonnull
  public final IJSExpression shrz (final int v)
  {
    return shrz (JSExpr.lit (v));
  }

  @Nonnull
  public final IJSExpression shrz (final long v)
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
  public final JSArrayCompRef component (final char index)
  {
    return component (JSExpr.lit (index));
  }

  @Nonnull
  public final JSArrayCompRef component (final int index)
  {
    return component (JSExpr.lit (index));
  }

  @Nonnull
  public final JSArrayCompRef component (final long index)
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
