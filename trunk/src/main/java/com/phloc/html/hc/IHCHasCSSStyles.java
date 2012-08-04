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
package com.phloc.html.hc;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.css.property.ECSSProperty;
import com.phloc.css.propertyvalue.ICSSValue;

public interface IHCHasCSSStyles <THISTYPE extends IHCHasCSSStyles <THISTYPE>> extends IHCNode
{
  /**
   * Add an element specific style.
   * 
   * @param aValue
   *        The value to be added. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyle (@Nullable ICSSValue aValue);

  /**
   * Add element specific styles.
   * 
   * @param aValues
   *        The values to be added. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyles (@Nullable final ICSSValue... aValues);

  /**
   * Remove the specified style from the element
   * 
   * @param eProperty
   *        The style property to remove
   * @return this
   */
  @Nonnull
  THISTYPE removeStyle (@Nonnull ECSSProperty eProperty);

  /**
   * Remove all styles from the element
   * 
   * @return this
   */
  @Nonnull
  THISTYPE removeAllStyles ();

  @Nonnull
  @ReturnsMutableCopy
  Map <ECSSProperty, ICSSValue> getAllStyles ();

  @Nonnull
  @ReturnsMutableCopy
  Collection <ICSSValue> getAllStyleValues ();

  @Nullable
  ICSSValue getStyleValue (@Nullable ECSSProperty eProperty);

  /**
   * @deprecated Use {@link #containsStyle(ECSSProperty)} instead
   */
  @Deprecated
  boolean hasStyle (@Nullable ECSSProperty eProperty);

  boolean containsStyle (@Nullable ECSSProperty eProperty);

  boolean hasStyle (@Nullable ICSSValue aValue);
}
