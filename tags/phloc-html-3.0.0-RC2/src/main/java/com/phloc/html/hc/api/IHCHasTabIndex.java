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
package com.phloc.html.hc.api;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 * Base interface for objects having a tab-index
 * 
 * @author philip
 * @param <THISTYPE>
 */
public interface IHCHasTabIndex <THISTYPE extends IHCHasTabIndex <THISTYPE>>
{
  /**
   * Set the tab index of this object.
   * 
   * @param nTabIndex
   *        The tab-index of this object. May not be negative!
   * @return this
   */
  @Nonnull
  THISTYPE setTabIndex (@Nonnegative int nTabIndex);

  /**
   * @return The tab index of this object or
   *         {@link com.phloc.commons.CGlobal#ILLEGAL_UINT} if no tab index is
   *         set
   */
  @CheckForSigned
  int getTabIndex ();
}
