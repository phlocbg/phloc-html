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
package com.phloc.html.hc.html;

import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.impl.AbstractHCElementWithInternalChildren;

/**
 * Represents an HTML &lt;colgroup&gt; element
 * 
 * @author philip
 */
public class HCColGroup extends AbstractHCElementWithInternalChildren <HCColGroup, HCCol>
{
  public HCColGroup ()
  {
    super (EHTMLElement.COLGROUP);
  }

  public HCColGroup (@Nullable final HCCol... aCols)
  {
    this ();
    addColumns (aCols);
  }

  public HCColGroup (@Nullable final Iterable <HCCol> aCols)
  {
    this ();
    addColumns (aCols);
  }

  @Nonnull
  @Deprecated
  public final HCColGroup addColumns (@Nullable final HCCol aCol)
  {
    return addColumn (aCol);
  }

  @Nonnull
  public final HCColGroup addColumns (@Nullable final HCCol... aCols)
  {
    if (aCols != null)
      for (final HCCol aCol : aCols)
        addColumn (aCol);
    return this;
  }

  @Nonnull
  public final HCColGroup addColumns (@Nullable final Iterable <HCCol> aCols)
  {
    if (aCols != null)
      for (final HCCol aCol : aCols)
        addColumn (aCol);
    return this;
  }

  /**
   * Define a new column.
   * 
   * @param aCol
   *        the column to add
   * @return this
   */
  @Nonnull
  public final HCColGroup addColumn (@Nullable final HCCol aCol)
  {
    if (aCol != null)
      addChild (aCol);
    return this;
  }

  /**
   * Define a new column.
   * 
   * @param nIndex
   *        The index where the column should be added
   * @param aCol
   *        the column to add
   * @return this
   */
  @Nonnull
  public final HCColGroup addColumn (@Nonnegative final int nIndex, @Nullable final HCCol aCol)
  {
    if (aCol != null)
      addChild (nIndex, aCol);
    return this;
  }

  public final boolean hasColumns ()
  {
    return hasChildren ();
  }

  public final boolean hasNoColumns ()
  {
    return !hasChildren ();
  }

  @Nonnegative
  public final int getColumnCount ()
  {
    return getChildCount ();
  }

  @ReturnsImmutableObject
  @Nullable
  public final List <HCCol> getAllColumns ()
  {
    return getChildren ();
  }

  @Nullable
  public final HCCol getColumnOfIndex (final int nIndex)
  {
    return getChildAtIndex (nIndex);
  }

  public final void removeColumnAtIndex (final int nIndex)
  {
    removeChild (nIndex);
  }
}
