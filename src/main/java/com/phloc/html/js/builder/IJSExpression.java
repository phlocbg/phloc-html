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
   * @return "([this])" from "[this]".
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
  IJSExpression incr ();

  /**
   * @return "[this]--" from "[this]".
   */
  @Nonnull
  IJSExpression decr ();

  /**
   * @return "typeof [this]" from "[this]"
   */
  @Nonnull
  IJSExpression typeof ();

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull IJSExpression right);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (@Nonnull IJSExpression right);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (@Nonnull IJSExpression right);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (@Nonnull IJSExpression right);

  /**
   * @return "[this]%[right]"
   */
  @Nonnull
  IJSExpression mod (@Nonnull IJSExpression right);

  /**
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (@Nonnull IJSExpression right);

  /**
   * @return "[this]>>[right]"
   */
  @Nonnull
  IJSExpression shr (@Nonnull IJSExpression right);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (@Nonnull IJSExpression right);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (@Nonnull IJSExpression right);

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
  IJSExpression xor (@Nonnull IJSExpression right);

  /** Lower than '&lt;'. */
  @Nonnull
  IJSExpression lt (@Nonnull IJSExpression right);

  /** Lower than or equal '&lt;='. */
  @Nonnull
  IJSExpression lte (@Nonnull IJSExpression right);

  /** Greater than '>'. */
  @Nonnull
  IJSExpression gt (@Nonnull IJSExpression right);

  /** Greater than or equal '>='. */
  @Nonnull
  IJSExpression gte (@Nonnull IJSExpression right);

  /** Equals '=='. */
  @Nonnull
  IJSExpression eq (@Nonnull IJSExpression right);

  /** Exactly equals '==='. */
  @Nonnull
  IJSExpression eeq (@Nonnull IJSExpression right);

  /** Not equals '!='. */
  @Nonnull
  IJSExpression ne (@Nonnull IJSExpression right);

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
  JSArrayCompRef component (@Nonnull IJSExpression index);
}
