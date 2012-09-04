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
package com.phloc.html.js.builder.jquery;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.IHasStringRepresentation;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.html.js.builder.IJSExpression;

/**
 * A single jQuery selector
 * 
 * @author philip
 */
public interface IJQuerySelector extends IHasStringRepresentation
{
  /**
   * @return The selector string without an optional expression parameter (e.g.
   *         for <code>:gt(5)</code> "gt" is returned")
   */
  @Nonnull
  @Nonempty
  String getSelector ();

  /**
   * @return The optional expression that was used as the parameter to this
   *         selector. May be <code>null</code>.
   */
  @Nullable
  IJSExpression getExpression ();

  /**
   * Get chained with the passed selector
   * 
   * @param aRhsSelector
   *        Other selector
   * @return <code>this<i>rhs</i></code>
   */
  @Nonnull
  @CheckReturnValue
  IJQuerySelector chain (@Nonnull IJQuerySelector aRhsSelector);

  /**
   * Make a multiple selector
   * 
   * @param aRhsSelector
   *        Other selector
   * @return <code>this, rhs</code>
   */
  @Nonnull
  @CheckReturnValue
  IJQuerySelector multiple (@Nonnull IJQuerySelector aRhsSelector);

  /**
   * Make a child selector
   * 
   * @param aRhsSelector
   *        Other selector
   * @return <code>this > rhs</code>
   */
  @Nonnull
  @CheckReturnValue
  IJQuerySelector child (@Nonnull IJQuerySelector aRhsSelector);

  /**
   * Make a descendant selector
   * 
   * @param aRhsSelector
   *        Other selector
   * @return <code>this rhs</code>
   */
  @Nonnull
  @CheckReturnValue
  IJQuerySelector descendant (@Nonnull IJQuerySelector aRhsSelector);

  /**
   * Make a next adjacent selector
   * 
   * @param aRhsSelector
   *        Other selector
   * @return <code>this + rhs</code>
   */
  @Nonnull
  @CheckReturnValue
  IJQuerySelector nextAdjacent (@Nonnull IJQuerySelector aRhsSelector);

  /**
   * Make a next siblings selector
   * 
   * @param aRhsSelector
   *        Other selector
   * @return <code>this ~ rhs</code>
   */
  @Nonnull
  @CheckReturnValue
  IJQuerySelector nextSiblings (@Nonnull IJQuerySelector aRhsSelector);
}
