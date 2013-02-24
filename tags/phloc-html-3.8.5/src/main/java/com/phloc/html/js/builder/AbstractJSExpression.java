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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.json.IJSON;

/**
 * Provides default implementations for {@link IJSExpression}.
 * 
 * @author philip
 */
public abstract class AbstractJSExpression implements IJSExpression
{
  @Nonnull
  public final AbstractJSExpression minus ()
  {
    return JSOp.minus (this);
  }

  @Nonnull
  public final AbstractJSExpression inParantheses ()
  {
    return JSOp.inParantheses (this);
  }

  @Nonnull
  public final AbstractJSExpression not ()
  {
    return JSOp.not (this);
  }

  @Nonnull
  public final AbstractJSExpression complement ()
  {
    return JSOp.complement (this);
  }

  /**
   * @deprecated Use {@link #incrPostfix()} instead
   */
  @Deprecated
  @Nonnull
  public final AbstractJSExpression incr ()
  {
    return incrPostfix ();
  }

  @Nonnull
  public final AbstractJSExpression incrPostfix ()
  {
    return JSOp.incrPostfix (this);
  }

  @Nonnull
  public final AbstractJSExpression incrPrefix ()
  {
    return JSOp.incrPrefix (this);
  }

  /**
   * @deprecated Use {@link #decrPostfix()} instead
   */
  @Deprecated
  @Nonnull
  public final AbstractJSExpression decr ()
  {
    return decrPostfix ();
  }

  @Nonnull
  public final AbstractJSExpression decrPostfix ()
  {
    return JSOp.decrPostfix (this);
  }

  @Nonnull
  public final AbstractJSExpression decrPrefix ()
  {
    return JSOp.decrPrefix (this);
  }

  @Nonnull
  public final AbstractJSExpression plus (final char v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression plus (final double v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression plus (final float v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression plus (final int v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression plus (final long v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression plus (@Nonnull final String v)
  {
    return plus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression plus (@Nonnull final IJSExpression right)
  {
    return JSOp.plus (this, right);
  }

  @Nonnull
  public final AbstractJSExpression minus (final double v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression minus (final float v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression minus (final int v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression minus (final long v)
  {
    return minus (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression minus (@Nonnull final IJSExpression right)
  {
    return JSOp.minus (this, right);
  }

  @Nonnull
  public final AbstractJSExpression mul (final double v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression mul (final float v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression mul (final int v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression mul (final long v)
  {
    return mul (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression mul (@Nonnull final IJSExpression right)
  {
    return JSOp.mul (this, right);
  }

  @Nonnull
  public final AbstractJSExpression div (final double v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression div (final float v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression div (final int v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression div (final long v)
  {
    return div (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression div (@Nonnull final IJSExpression right)
  {
    return JSOp.div (this, right);
  }

  @Nonnull
  public final AbstractJSExpression mod (final int v)
  {
    return mod (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression mod (final long v)
  {
    return mod (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression mod (@Nonnull final IJSExpression right)
  {
    return JSOp.mod (this, right);
  }

  @Nonnull
  public final AbstractJSExpression shl (final int v)
  {
    return shl (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression shl (final long v)
  {
    return shl (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression shl (@Nonnull final IJSExpression right)
  {
    return JSOp.shl (this, right);
  }

  @Nonnull
  public final AbstractJSExpression shr (final int v)
  {
    return shr (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression shr (final long v)
  {
    return shr (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression shr (@Nonnull final IJSExpression right)
  {
    return JSOp.shr (this, right);
  }

  @Nonnull
  public final AbstractJSExpression shrz (final int v)
  {
    return shrz (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression shrz (final long v)
  {
    return shrz (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression shrz (@Nonnull final IJSExpression right)
  {
    return JSOp.shrz (this, right);
  }

  @Nonnull
  public final AbstractJSExpression band (final int v)
  {
    return band (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression band (final long v)
  {
    return band (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression band (@Nonnull final IJSExpression right)
  {
    return JSOp.band (this, right);
  }

  @Nonnull
  public final AbstractJSExpression bor (final int v)
  {
    return bor (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression bor (final long v)
  {
    return bor (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression bor (@Nonnull final IJSExpression right)
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
  public final AbstractJSExpression xor (final int v)
  {
    return xor (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression xor (final long v)
  {
    return xor (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression xor (@Nonnull final IJSExpression right)
  {
    return JSOp.xor (this, right);
  }

  @Nonnull
  public final AbstractJSExpression lt (final double v)
  {
    return lt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lt (final float v)
  {
    return lt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lt (final int v)
  {
    return lt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lt (final long v)
  {
    return lt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lt (@Nonnull final IJSExpression right)
  {
    return JSOp.lt (this, right);
  }

  @Nonnull
  public final AbstractJSExpression lte (final double v)
  {
    return lte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lte (final float v)
  {
    return lte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lte (final int v)
  {
    return lte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lte (final long v)
  {
    return lte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression lte (@Nonnull final IJSExpression right)
  {
    return JSOp.lte (this, right);
  }

  @Nonnull
  public final AbstractJSExpression gt (final double v)
  {
    return gt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gt (final float v)
  {
    return gt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gt (final int v)
  {
    return gt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gt (final long v)
  {
    return gt (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gt (@Nonnull final IJSExpression right)
  {
    return JSOp.gt (this, right);
  }

  @Nonnull
  public final AbstractJSExpression gte (final double v)
  {
    return gte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gte (final float v)
  {
    return gte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gte (final int v)
  {
    return gte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gte (final long v)
  {
    return gte (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression gte (@Nonnull final IJSExpression right)
  {
    return JSOp.gte (this, right);
  }

  @Nonnull
  public final AbstractJSExpression eq (final boolean v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (final char v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (final float v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (final double v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (final int v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (final long v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (@Nonnull final String v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (@Nonnull final IJSON v)
  {
    return eq (JSExpr.json (v));
  }

  @Nonnull
  public final AbstractJSExpression eq (@Nonnull final IJSExpression right)
  {
    return JSOp.eq (this, right);
  }

  @Nonnull
  public final AbstractJSExpression eeq (final boolean v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (final char v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (final float v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (final double v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (final int v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (final long v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (@Nonnull final String v)
  {
    return eeq (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (@Nonnull final IJSON v)
  {
    return eeq (JSExpr.json (v));
  }

  @Nonnull
  public final AbstractJSExpression eeq (@Nonnull final IJSExpression right)
  {
    return JSOp.eeq (this, right);
  }

  @Nonnull
  public final AbstractJSExpression ne (final boolean v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (final char v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (final float v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (final double v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (final int v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (final long v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (@Nonnull final String v)
  {
    return ne (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (@Nonnull final IJSON v)
  {
    return ne (JSExpr.json (v));
  }

  @Nonnull
  public final AbstractJSExpression ne (@Nonnull final IJSExpression right)
  {
    return JSOp.ne (this, right);
  }

  @Nonnull
  public final AbstractJSExpression ene (final boolean v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (final char v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (final float v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (final double v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (final int v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (final long v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (@Nonnull final String v)
  {
    return ene (JSExpr.lit (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (@Nonnull final IJSON v)
  {
    return ene (JSExpr.json (v));
  }

  @Nonnull
  public final AbstractJSExpression ene (@Nonnull final IJSExpression right)
  {
    return JSOp.ene (this, right);
  }

  @Nonnull
  public final AbstractJSExpression _instanceof (@Nonnull final AbstractJSType right)
  {
    return JSOp._instanceof (this, right);
  }

  @Nonnull
  public final AbstractJSExpression typeof ()
  {
    return JSOp.typeof (this);
  }

  @Nonnull
  public final AbstractJSExpression isTypeof (@Nonnull final AbstractJSType aType)
  {
    return typeof ().eeq (aType.typeName ());
  }

  @Nonnull
  public final AbstractJSExpression isNotTypeof (@Nonnull final AbstractJSType aType)
  {
    return typeof ().ene (aType.typeName ());
  }

  @Nonnull
  public final AbstractJSExpression isUndefined ()
  {
    if (this instanceof JSArrayCompRef)
      return eeq (JSExpr.UNDEFINED);
    return typeof ().eeq (JSExpr.UNDEFINED);
  }

  @Nonnull
  public final AbstractJSExpression isNotUndefined ()
  {
    if (this instanceof JSArrayCompRef)
      return ene (JSExpr.UNDEFINED);
    return typeof ().ene (JSExpr.UNDEFINED);
  }

  @Nonnull
  public final JSInvocation invoke (@Nonnull final JSMethod aMethod)
  {
    return JSExpr.invoke (this, aMethod);
  }

  @Nonnull
  public final JSInvocation invoke (@Nonnull @Nonempty final String sMethod)
  {
    return JSExpr.invoke (this, sMethod);
  }

  @Nonnull
  public final JSFieldRef ref (@Nonnull final JSVar aField)
  {
    return JSExpr.ref (this, aField);
  }

  @Nonnull
  public final JSFieldRef ref (@Nonnull final String sField)
  {
    return JSExpr.ref (this, sField);
  }

  @Nonnull
  public final JSArrayCompRef component (final char cIndex)
  {
    return component (JSExpr.lit (cIndex));
  }

  @Nonnull
  public final JSArrayCompRef component (final int nIndex)
  {
    return component (JSExpr.lit (nIndex));
  }

  @Nonnull
  public final JSArrayCompRef component (final long nIndex)
  {
    return component (JSExpr.lit (nIndex));
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final String sIndex)
  {
    return component (JSExpr.lit (sIndex));
  }

  @Nonnull
  public final JSArrayCompRef component (@Nonnull final IJSExpression index)
  {
    return JSExpr.component (this, index);
  }

  @Nonnull
  public final JSArrayCompRef component0 ()
  {
    return component (JSExpr.lit (0));
  }

  @Nonnull
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    return true;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).toString ();
  }
}
