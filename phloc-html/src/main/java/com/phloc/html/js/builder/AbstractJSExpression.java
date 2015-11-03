/**
 * Copyright (C) 2006-2015 phloc systems
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

import com.phloc.commons.annotations.CodingStyleguideUnaware;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.json.IJSON;

/**
 * Provides default implementations for {@link IJSExpression}.
 * 
 * @author Philip Helger
 */
public abstract class AbstractJSExpression implements IJSExpression
{
  @Override
  @Nonnull
  public final AbstractJSExpression minus ()
  {
    return JSOp.minus (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression inParantheses ()
  {
    return JSOp.inParantheses (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression not ()
  {
    return JSOp.not (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression complement ()
  {
    return JSOp.complement (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression incrPostfix ()
  {
    return JSOp.incrPostfix (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression incrPrefix ()
  {
    return JSOp.incrPrefix (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression decrPostfix ()
  {
    return JSOp.decrPostfix (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression decrPrefix ()
  {
    return JSOp.decrPrefix (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (final char cValue)
  {
    return plus (JSExpr.lit (cValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (final double dValue)
  {
    return plus (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (final float fValue)
  {
    return plus (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (final int nValue)
  {
    return plus (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (final long nValue)
  {
    return plus (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (@Nonnull final String sValue)
  {
    return plus (JSExpr.lit (sValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression plus (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.plus (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression minus (final double dValue)
  {
    return minus (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression minus (final float fValue)
  {
    return minus (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression minus (final int nValue)
  {
    return minus (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression minus (final long nValue)
  {
    return minus (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression minus (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.minus (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mul (final double dValue)
  {
    return mul (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mul (final float fValue)
  {
    return mul (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mul (final int nValue)
  {
    return mul (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mul (final long nValue)
  {
    return mul (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mul (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.mul (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression div (final double dValue)
  {
    return div (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression div (final float fValue)
  {
    return div (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression div (final int nValue)
  {
    return div (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression div (final long nValue)
  {
    return div (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression div (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.div (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mod (final int nValue)
  {
    return mod (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mod (final long nValue)
  {
    return mod (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression mod (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.mod (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shl (final int nValue)
  {
    return shl (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shl (final long nValue)
  {
    return shl (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shl (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.shl (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shr (final int nValue)
  {
    return shr (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shr (final long nValue)
  {
    return shr (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shr (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.shr (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shrz (final int nValue)
  {
    return shrz (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shrz (final long nValue)
  {
    return shrz (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression shrz (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.shrz (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression band (final int nValue)
  {
    return band (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression band (final long nValue)
  {
    return band (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression band (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.band (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression bor (final int nValue)
  {
    return bor (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression bor (final long nValue)
  {
    return bor (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression bor (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.bor (this, aExpr);
  }

  @Override
  @Nonnull
  public final IJSExpression cand (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.cand (this, aExpr);
  }

  @Override
  @Nonnull
  public final IJSExpression cor (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.cor (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression xor (final int nValue)
  {
    return xor (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression xor (final long nValue)
  {
    return xor (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression xor (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.xor (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lt (final double dValue)
  {
    return lt (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lt (final float fValue)
  {
    return lt (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lt (final int nValue)
  {
    return lt (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lt (final long nValue)
  {
    return lt (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lt (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.lt (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lte (final double dValue)
  {
    return lte (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lte (final float fValue)
  {
    return lte (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lte (final int nValue)
  {
    return lte (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lte (final long nValue)
  {
    return lte (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression lte (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.lte (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gt (final double dValue)
  {
    return gt (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gt (final float fValue)
  {
    return gt (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gt (final int nValue)
  {
    return gt (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gt (final long nValue)
  {
    return gt (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gt (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.gt (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gte (final double dValue)
  {
    return gte (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gte (final float fValue)
  {
    return gte (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gte (final int nValue)
  {
    return gte (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gte (final long nValue)
  {
    return gte (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression gte (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.gte (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (final boolean bValue)
  {
    return eq (JSExpr.lit (bValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (final char cValue)
  {
    return eq (JSExpr.lit (cValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (final float fValue)
  {
    return eq (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (final double dValue)
  {
    return eq (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (final int nValue)
  {
    return eq (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (final long nValue)
  {
    return eq (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (@Nonnull final String sValue)
  {
    return eq (JSExpr.lit (sValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (@Nonnull final IJSON aValue)
  {
    return eq (JSExpr.json (aValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eq (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.eq (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (final boolean bValue)
  {
    return eeq (JSExpr.lit (bValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (final char cValue)
  {
    return eeq (JSExpr.lit (cValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (final float fValue)
  {
    return eeq (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (final double dValue)
  {
    return eeq (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (final int nValue)
  {
    return eeq (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (final long nValue)
  {
    return eeq (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (@Nonnull final String sValue)
  {
    return eeq (JSExpr.lit (sValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (@Nonnull final IJSON aValue)
  {
    return eeq (JSExpr.json (aValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression eeq (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.eeq (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (final boolean bValue)
  {
    return ne (JSExpr.lit (bValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (final char cValue)
  {
    return ne (JSExpr.lit (cValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (final float fValue)
  {
    return ne (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (final double dValue)
  {
    return ne (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (final int nValue)
  {
    return ne (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (final long nValue)
  {
    return ne (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (@Nonnull final String sValue)
  {
    return ne (JSExpr.lit (sValue));

  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (@Nonnull final IJSON aValue)
  {
    return ne (JSExpr.json (aValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ne (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.ne (this, aExpr);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (final boolean bValue)
  {
    return ene (JSExpr.lit (bValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (final char cValue)
  {
    return ene (JSExpr.lit (cValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (final double dValue)
  {
    return ene (JSExpr.lit (dValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (final float fValue)
  {
    return ene (JSExpr.lit (fValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (final int nValue)
  {
    return ene (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (final long nValue)
  {
    return ene (JSExpr.lit (nValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (@Nonnull final String sValue)
  {
    return ene (JSExpr.lit (sValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (@Nonnull final IJSON aValue)
  {
    return ene (JSExpr.json (aValue));
  }

  @Override
  @Nonnull
  public final AbstractJSExpression ene (@Nonnull final IJSExpression aExpr)
  {
    return JSOp.ene (this, aExpr);
  }

  @Override
  @Nonnull
  @CodingStyleguideUnaware
  public final AbstractJSExpression _instanceof (@Nonnull final AbstractJSType aType)
  {
    return JSOp._instanceof (this, aType);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression typeof ()
  {
    return JSOp.typeof (this);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression isTypeof (@Nonnull final AbstractJSType aType)
  {
    return typeof ().eeq (aType.typeName ());
  }

  @Override
  @Nonnull
  public final AbstractJSExpression isNotTypeof (@Nonnull final AbstractJSType aType)
  {
    return typeof ().ene (aType.typeName ());
  }

  @Override
  @Nonnull
  public final AbstractJSExpression isUndefined ()
  {
    if (this instanceof JSArrayCompRef)
      return eeq (JSExpr.UNDEFINED);
    return typeof ().eeq (JSExpr.UNDEFINED);
  }

  @Override
  @Nonnull
  public final AbstractJSExpression isNotUndefined ()
  {
    if (this instanceof JSArrayCompRef)
      return ene (JSExpr.UNDEFINED);
    return typeof ().ene (JSExpr.UNDEFINED);
  }

  @Override
  @Nonnull
  public final JSInvocation invoke (@Nonnull final JSMethod aMethod)
  {
    return JSExpr.invoke (this, aMethod);
  }

  @Override
  @Nonnull
  public final JSInvocation invoke (@Nonnull @Nonempty final String sMethod)
  {
    return JSExpr.invoke (this, sMethod);
  }

  @Override
  @Nonnull
  public final JSFieldRef ref (@Nonnull final JSVar aField)
  {
    return JSExpr.ref (this, aField);
  }

  @Override
  @Nonnull
  public final JSFieldRef ref (@Nonnull final String sField)
  {
    return JSExpr.ref (this, sField);
  }

  @Override
  @Nonnull
  public final JSArrayCompRef component (final char cIndex)
  {
    return component (JSExpr.lit (cIndex));
  }

  @Override
  @Nonnull
  public final JSArrayCompRef component (final int nIndex)
  {
    return component (JSExpr.lit (nIndex));
  }

  @Override
  @Nonnull
  public final JSArrayCompRef component (final long nIndex)
  {
    return component (JSExpr.lit (nIndex));
  }

  @Override
  @Nonnull
  public final JSArrayCompRef component (@Nonnull final String sIndex)
  {
    return component (JSExpr.lit (sIndex));
  }

  @Override
  @Nonnull
  public final JSArrayCompRef component (@Nonnull final IJSExpression aExpr)
  {
    return JSExpr.component (this, aExpr);
  }

  @Nonnull
  public final JSArrayCompRef component0 ()
  {
    return component (JSExpr.lit (0));
  }

  @Override
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
