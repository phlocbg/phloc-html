/**
 * Copyright (C) 2006-2014 phloc systems
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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.html.hc.api.EHCCellAlign;
import com.phloc.html.hc.html.HCRow;

/**
 * Base interface for a table cell.
 * 
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCCell <THISTYPE extends IHCCell <THISTYPE>> extends IHCElementWithChildren <THISTYPE>
{
  /**
   * @return The owning parent row.
   */
  @Nullable
  HCRow getParentRow ();

  /**
   * @return Current column spanning. Defaults to 1.
   */
  @Nonnegative
  int getColspan ();

  @Nonnull
  THISTYPE setColspan (@Nonnegative int nColspan);

  /**
   * @return Current row spanning. Defaults to 1.
   */
  @Nonnegative
  int getRowspan ();

  @Nonnull
  THISTYPE setRowspan (@Nonnegative int nRowspan);

  /**
   * @return The cell content alignment. Defaults to <code>null</code>.
   */
  @Nullable
  EHCCellAlign getAlign ();

  @Nonnull
  THISTYPE setAlign (@Nullable EHCCellAlign eAlign);
}
