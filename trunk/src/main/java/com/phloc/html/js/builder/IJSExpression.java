/**
 * Copyright (C); 2006-2012 phloc systems
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

import com.phloc.json.IJSON;

/**
 * A JS expression.
 * 
 * @author philip
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
   * @deprecated Use {@link #incrPostfix()} instead
   */
  @Deprecated
  @Nonnull
  IJSExpression incr ();

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
   * @deprecated Use {@link #decrPostfix()} instead
   */
  @Deprecated
  @Nonnull
  IJSExpression decr ();

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
  IJSExpression plus (char v);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (double v);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (float v);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (int v);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (long v);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull String v);

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull IJSExpression right);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (double v);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (float v);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (int v);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (long v);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (@Nonnull IJSExpression right);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (double v);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (float v);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (int v);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (long v);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (@Nonnull IJSExpression right);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (double v);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (float v);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (int v);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (long v);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression mod (int v);

  @Nonnull
  IJSExpression mod (long v);

  /**
   * @return "[this]%[right]"
   */
  @Nonnull
  IJSExpression mod (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression shl (int v);

  @Nonnull
  IJSExpression shl (long v);

  /**
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression shr (int v);

  @Nonnull
  IJSExpression shr (long v);

  /**
   * @return "[this]>>[right]"
   */
  @Nonnull
  IJSExpression shr (@Nonnull IJSExpression right);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (int v);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (long v);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (@Nonnull IJSExpression right);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (int v);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (long v);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (@Nonnull IJSExpression right);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (int v);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (long v);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (@Nonnull IJSExpression right);

  /** Logical AND '&amp;&amp;'. */
  @Nonnull
  IJSExpression cand (@Nonnull IJSExpression right);

  /** Logical OR '||'. */
  @Nonnull
  IJSExpression cor (@Nonnull IJSExpression right);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (int v);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (long v);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression lt (double v);

  @Nonnull
  IJSExpression lt (float v);

  @Nonnull
  IJSExpression lt (int v);

  @Nonnull
  IJSExpression lt (long v);

  /** Lower than '&lt;'. */
  @Nonnull
  IJSExpression lt (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression lte (double v);

  @Nonnull
  IJSExpression lte (float v);

  @Nonnull
  IJSExpression lte (int v);

  @Nonnull
  IJSExpression lte (long v);

  /** Lower than or equal '&lt;='. */
  @Nonnull
  IJSExpression lte (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression gt (double v);

  @Nonnull
  IJSExpression gt (float v);

  @Nonnull
  IJSExpression gt (int v);

  @Nonnull
  IJSExpression gt (long v);

  /** Greater than '>'. */
  @Nonnull
  IJSExpression gt (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression gte (double v);

  @Nonnull
  IJSExpression gte (float v);

  @Nonnull
  IJSExpression gte (int v);

  @Nonnull
  IJSExpression gte (long v);

  /** Greater than or equal '>='. */
  @Nonnull
  IJSExpression gte (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression eq (boolean v);

  @Nonnull
  IJSExpression eq (char v);

  @Nonnull
  IJSExpression eq (float v);

  @Nonnull
  IJSExpression eq (double v);

  @Nonnull
  IJSExpression eq (int v);

  @Nonnull
  IJSExpression eq (long v);

  @Nonnull
  IJSExpression eq (@Nonnull String v);

  @Nonnull
  IJSExpression eq (@Nonnull IJSON v);

  /** Equals '=='. */
  @Nonnull
  IJSExpression eq (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression eeq (boolean v);

  @Nonnull
  IJSExpression eeq (char v);

  @Nonnull
  IJSExpression eeq (float v);

  @Nonnull
  IJSExpression eeq (double v);

  @Nonnull
  IJSExpression eeq (int v);

  @Nonnull
  IJSExpression eeq (long v);

  @Nonnull
  IJSExpression eeq (@Nonnull String v);

  @Nonnull
  IJSExpression eeq (@Nonnull IJSON v);

  /** Exactly equals '==='. */
  @Nonnull
  IJSExpression eeq (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression ne (boolean v);

  @Nonnull
  IJSExpression ne (char v);

  @Nonnull
  IJSExpression ne (float v);

  @Nonnull
  IJSExpression ne (double v);

  @Nonnull
  IJSExpression ne (int v);

  @Nonnull
  IJSExpression ne (long v);

  @Nonnull
  IJSExpression ne (@Nonnull String v);

  @Nonnull
  IJSExpression ne (@Nonnull IJSON v);

  /** Not equals '!='. */
  @Nonnull
  IJSExpression ne (@Nonnull IJSExpression right);

  @Nonnull
  IJSExpression ene (boolean v);

  @Nonnull
  IJSExpression ene (char v);

  @Nonnull
  IJSExpression ene (float v);

  @Nonnull
  IJSExpression ene (double v);

  @Nonnull
  IJSExpression ene (int v);

  @Nonnull
  IJSExpression ene (long v);

  @Nonnull
  IJSExpression ene (@Nonnull String v);

  @Nonnull
  IJSExpression ene (@Nonnull IJSON v);

  /** Exactly not equals '!=='. */
  @Nonnull
  IJSExpression ene (@Nonnull IJSExpression right);

  /** instanceof */
  @Nonnull
  IJSExpression _instanceof (@Nonnull AbstractJSType right);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (@Nonnull JSMethod method);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (@Nonnull String method);

  @Nonnull
  JSFieldRef ref (@Nonnull JSVar field);

  @Nonnull
  JSFieldRef ref (@Nonnull String field);

  @Nonnull
  JSArrayCompRef component (char cIndex);

  @Nonnull
  JSArrayCompRef component (int nIndex);

  @Nonnull
  JSArrayCompRef component (long nIndex);

  @Nonnull
  JSArrayCompRef component (@Nonnull String sIndex);

  @Nonnull
  JSArrayCompRef component (@Nonnull IJSExpression index);
}
