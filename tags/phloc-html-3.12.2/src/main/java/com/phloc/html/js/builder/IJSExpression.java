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

import com.phloc.commons.annotations.CodingStyleguideUnaware;
import com.phloc.json.IJSON;
import com.phloc.json2.IJson;

/**
 * A JS expression.
 * 
 * @author Philip Helger
 */
public interface IJSExpression extends IJSGeneratable
{
  /**
   * @return "-[this]" from "[this]".
   */
  @Nonnull
  IJSExpression minus ();

  /**
   * @return "([this]);" from "[this]".
   */
  @Nonnull
  IJSExpression inParantheses ();

  /**
   * @return "![this]" from "[this]".
   */
  @Nonnull
  IJSExpression not ();

  /**
   * @return "~[this]" from "[this]".
   */
  @Nonnull
  IJSExpression complement ();

  /**
   * @return "[this]++" from "[this]".
   */
  @Nonnull
  IJSExpression incrPostfix ();

  /**
   * @return "++[this]" from "[this]".
   */
  @Nonnull
  IJSExpression incrPrefix ();

  /**
   * @return "[this]--" from "[this]".
   */
  @Nonnull
  IJSExpression decrPostfix ();

  /**
   * @return "--[this]" from "[this]".
   */
  @Nonnull
  IJSExpression decrPrefix ();

  /**
   * @return "typeof [this]" from "[this]"
   */
  @Nonnull
  IJSExpression typeof ();

  /**
   * @return "typeof [this] === typename" from "[this]"
   */
  @Nonnull
  IJSExpression isTypeof (@Nonnull AbstractJSType aType);

  /**
   * @return "typeof [this] !== typename" from "[this]"
   */
  @Nonnull
  IJSExpression isNotTypeof (@Nonnull AbstractJSType aType);

  /**
   * @return "typeof [this] === undefined" or "[this] === undefined" from
   *         "[this]"
   */
  @Nonnull
  IJSExpression isUndefined ();

  /**
   * @return "typeof [this] !== undefined" or "[this] !== undefined" from
   *         "[this]"
   */
  @Nonnull
  IJSExpression isNotUndefined ();

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (char cValue);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (double dValue);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (float fValue);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (int nValue);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (long nValue);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull String sValue);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull IJSExpression aExpr);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (double dValue);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (float fValue);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (int nValue);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (long nValue);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (@Nonnull IJSExpression aExpr);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (double dValue);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (float fValue);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (int nValue);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (long nValue);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (@Nonnull IJSExpression aExpr);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (double dValue);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (float fValue);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (int nValue);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (long nValue);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression mod (int nValue);

  @Nonnull
  IJSExpression mod (long nValue);

  /**
   * @return "[this]%[right]"
   */
  @Nonnull
  IJSExpression mod (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression shl (int nValue);

  @Nonnull
  IJSExpression shl (long nValue);

  /**
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression shr (int nValue);

  @Nonnull
  IJSExpression shr (long nValue);

  /**
   * @return "[this]>>[right]"
   */
  @Nonnull
  IJSExpression shr (@Nonnull IJSExpression aExpr);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (int nValue);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (long nValue);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (@Nonnull IJSExpression aExpr);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (int nValue);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (long nValue);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (@Nonnull IJSExpression aExpr);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (int nValue);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (long nValue);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (@Nonnull IJSExpression aExpr);

  /** Logical AND '&amp;&amp;'. */
  @Nonnull
  IJSExpression cand (@Nonnull IJSExpression aExpr);

  /** Logical OR '||'. */
  @Nonnull
  IJSExpression cor (@Nonnull IJSExpression aExpr);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (int nValue);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (long nValue);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression lt (double dValue);

  @Nonnull
  IJSExpression lt (float fValue);

  @Nonnull
  IJSExpression lt (int nValue);

  @Nonnull
  IJSExpression lt (long nValue);

  /** Lower than '&lt;'. */
  @Nonnull
  IJSExpression lt (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression lte (double dValue);

  @Nonnull
  IJSExpression lte (float fValue);

  @Nonnull
  IJSExpression lte (int nValue);

  @Nonnull
  IJSExpression lte (long nValue);

  /** Lower than or equal '&lt;='. */
  @Nonnull
  IJSExpression lte (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression gt (double dValue);

  @Nonnull
  IJSExpression gt (float fValue);

  @Nonnull
  IJSExpression gt (int nValue);

  @Nonnull
  IJSExpression gt (long nValue);

  /** Greater than '>'. */
  @Nonnull
  IJSExpression gt (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression gte (double dValue);

  @Nonnull
  IJSExpression gte (float fValue);

  @Nonnull
  IJSExpression gte (int nValue);

  @Nonnull
  IJSExpression gte (long nValue);

  /** Greater than or equal '>='. */
  @Nonnull
  IJSExpression gte (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression eq (boolean bValue);

  @Nonnull
  IJSExpression eq (char cValue);

  @Nonnull
  IJSExpression eq (float fValue);

  @Nonnull
  IJSExpression eq (double dValue);

  @Nonnull
  IJSExpression eq (int nValue);

  @Nonnull
  IJSExpression eq (long nValue);

  @Nonnull
  IJSExpression eq (@Nonnull String sValue);

  @Nonnull
  IJSExpression eq (@Nonnull IJSON aValue);

  @Nonnull
  IJSExpression eq (@Nonnull IJson aValue);

  /** Equals '=='. */
  @Nonnull
  IJSExpression eq (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression eeq (boolean bValue);

  @Nonnull
  IJSExpression eeq (char cValue);

  @Nonnull
  IJSExpression eeq (float fValue);

  @Nonnull
  IJSExpression eeq (double dValue);

  @Nonnull
  IJSExpression eeq (int nValue);

  @Nonnull
  IJSExpression eeq (long nValue);

  @Nonnull
  IJSExpression eeq (@Nonnull String sValue);

  @Nonnull
  IJSExpression eeq (@Nonnull IJSON aValue);

  @Nonnull
  IJSExpression eeq (@Nonnull IJson aValue);

  /** Exactly equals '==='. */
  @Nonnull
  IJSExpression eeq (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression ne (boolean bValue);

  @Nonnull
  IJSExpression ne (char cValue);

  @Nonnull
  IJSExpression ne (float fValue);

  @Nonnull
  IJSExpression ne (double dValue);

  @Nonnull
  IJSExpression ne (int nValue);

  @Nonnull
  IJSExpression ne (long nValue);

  @Nonnull
  IJSExpression ne (@Nonnull String sValue);

  @Nonnull
  IJSExpression ne (@Nonnull IJSON aValue);

  @Nonnull
  IJSExpression ne (@Nonnull IJson aValue);

  /** Not equals '!='. */
  @Nonnull
  IJSExpression ne (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression ene (boolean bValue);

  @Nonnull
  IJSExpression ene (char cValue);

  @Nonnull
  IJSExpression ene (float fValue);

  @Nonnull
  IJSExpression ene (double dValue);

  @Nonnull
  IJSExpression ene (int nValue);

  @Nonnull
  IJSExpression ene (long nValue);

  @Nonnull
  IJSExpression ene (@Nonnull String sValue);

  @Nonnull
  IJSExpression ene (@Nonnull IJSON aValue);

  @Nonnull
  IJSExpression ene (@Nonnull IJson aValue);

  /** Exactly not equals '!=='. */
  @Nonnull
  IJSExpression ene (@Nonnull IJSExpression aExpr);

  /** instanceof */
  @Nonnull
  @CodingStyleguideUnaware
  IJSExpression _instanceof (@Nonnull AbstractJSType aType);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (@Nonnull JSMethod aMethod);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (@Nonnull String sMethod);

  @Nonnull
  JSFieldRef ref (@Nonnull JSVar aField);

  @Nonnull
  JSFieldRef ref (@Nonnull String sField);

  @Nonnull
  JSArrayCompRef component (char cIndex);

  @Nonnull
  JSArrayCompRef component (int nIndex);

  @Nonnull
  JSArrayCompRef component (long nIndex);

  @Nonnull
  JSArrayCompRef component (@Nonnull String sIndex);

  @Nonnull
  JSArrayCompRef component (@Nonnull IJSExpression aExpr);
}
