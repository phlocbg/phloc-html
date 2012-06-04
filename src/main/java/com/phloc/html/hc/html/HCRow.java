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

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithInternalChildren;
import com.phloc.html.hc.impl.HCNodeList;

/**
 * Represents an HTML &lt;tr&gt; element
 * 
 * @author philip
 */
public final class HCRow extends AbstractHCElementWithInternalChildren <HCRow, AbstractHCCell>
{
  private final boolean m_bHeader;

  public HCRow (final boolean bHeader)
  {
    super (EHTMLElement.TR);
    m_bHeader = bHeader;
  }

  /**
   * Add an empty cell.
   * 
   * @return The created cell. Never <code>null</code>.
   */
  @Nonnull
  public AbstractHCCell addCell ()
  {
    final AbstractHCCell ret = m_bHeader ? new HCHeaderCell () : new HCCell ();
    ret.setParentRow (this);
    addChild (ret);
    return ret;
  }

  /**
   * Add an empty cell at the specified index.
   * 
   * @return The created cell. Never <code>null</code>.
   */
  @Nonnull
  public AbstractHCCell addCell (@Nonnegative final int nIndex)
  {
    final AbstractHCCell ret = m_bHeader ? new HCHeaderCell () : new HCCell ();
    ret.setParentRow (this);
    addChild (nIndex, ret);
    return ret;
  }

  /**
   * Add a single new cell and add the passed element.
   * 
   * @param aCellChild
   *        The element to add. May be <code>null</code>.
   * @return The created cell. Never <code>null</code>.
   */
  @Nonnull
  @CheckReturnValue
  public AbstractHCCell addAndReturnCell (@Nullable final IHCNode aCellChild)
  {
    return addCell ().addChild (aCellChild);
  }

  /**
   * Add a single new cell and add the passed elements.
   * 
   * @param aCellChildren
   *        The list of elements to add. May be <code>null</code>.
   * @return The created cell. Never <code>null</code>.
   */
  @Nonnull
  @CheckReturnValue
  public AbstractHCCell addAndReturnCell (@Nullable final IHCNode... aCellChildren)
  {
    return addCell ().addChildren (aCellChildren);
  }

  /**
   * Add a single new cell and add the passed elements.
   * 
   * @param aCellChildren
   *        The list of elements to add. May be <code>null</code>.
   * @return The created cell. Never <code>null</code>.
   */
  @Nonnull
  @CheckReturnValue
  public AbstractHCCell addAndReturnCell (@Nullable final Iterable <? extends IHCNode> aCellChildren)
  {
    return addCell ().addChildren (aCellChildren);
  }

  /**
   * Add a single cell with the given text element.
   * 
   * @param aCellText
   *        The text to be set into the cell. May not be <code>null</code>.
   * @return the created table cell
   */
  @Nonnull
  @CheckReturnValue
  public AbstractHCCell addAndReturnCell (@Nonnull final IPredefinedLocaleTextProvider aCellText)
  {
    return addAndReturnCell (aCellText.getText ());
  }

  /**
   * Add a single cell with the given text element.
   * 
   * @param sCellText
   *        The text to be set into the cell. May be <code>null</code>.
   * @return the created table cell
   */
  @Nonnull
  @CheckReturnValue
  public AbstractHCCell addAndReturnCell (@Nullable final String sCellText)
  {
    return addCell ().addChild (sCellText);
  }

  /**
   * Add a single cell with the given text elements.
   * 
   * @param aCellTexts
   *        The text to be set into the cell. May be <code>null</code>.
   * @return the created table cell
   */
  @Nonnull
  @CheckReturnValue
  public AbstractHCCell addAndReturnCell (@Nullable final String... aCellTexts)
  {
    return addCell ().addChildren (aCellTexts);
  }

  /**
   * Add a single new cell and add the passed element.
   * 
   * @param aChild
   *        The element to add. May be <code>null</code>.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCell (@Nullable final IHCNode aChild)
  {
    addCell ().addChild (aChild);
    return this;
  }

  /**
   * Add a single new cell and add the passed elements.
   * 
   * @param aCellChildren
   *        The list of elements to add. May be <code>null</code>.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCell (@Nullable final IHCNode... aCellChildren)
  {
    addCell ().addChildren (aCellChildren);
    return this;
  }

  /**
   * Add a single new cell and add the passed elements.
   * 
   * @param aCellChildren
   *        The list of elements to add. May be <code>null</code>.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCell (@Nullable final Iterable <? extends IHCNode> aCellChildren)
  {
    addCell ().addChildren (aCellChildren);
    return this;
  }

  /**
   * Add a single cell with the given text element.
   * 
   * @param aCellText
   *        The text to be set into the cell.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCell (@Nonnull final IPredefinedLocaleTextProvider aCellText)
  {
    return addCell (aCellText.getText ());
  }

  /**
   * Add a single cell with the given text element.
   * 
   * @param sCellText
   *        The text to be set into the cell. May be <code>null</code>.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCell (@Nullable final String sCellText)
  {
    addCell ().addChild (sCellText);
    return this;
  }

  /**
   * Add multiple cells, one for each passed string.
   * 
   * @param aCellTextProviders
   *        The list of text providers for which a table cell should be created.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCells (@Nullable final IPredefinedLocaleTextProvider... aCellTextProviders)
  {
    if (aCellTextProviders != null)
      for (final IPredefinedLocaleTextProvider aCellTextProvider : aCellTextProviders)
        addCell (aCellTextProvider.getText ());
    return this;
  }

  /**
   * Add multiple cells, one for each passed string.
   * 
   * @param aCellTexts
   *        The list of strings for which a table cell should be created.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCells (@Nullable final String... aCellTexts)
  {
    if (aCellTexts != null)
      for (final String sCellText : aCellTexts)
        addCell (sCellText);
    return this;
  }

  @Deprecated
  @DevelopersNote ("Use either addCell or add parameters :)")
  @Nonnull
  public HCRow addCells (@Nullable final String sCellChild)
  {
    return addCell (sCellChild);
  }

  @Deprecated
  @DevelopersNote ("Use either addCell or add parameters :)")
  @Nonnull
  public HCRow addCells (@Nullable final IHCNode aCellChild)
  {
    return addCell (aCellChild);
  }

  /**
   * Add multiple cells, one for each passed element.
   * 
   * @param aCellChildren
   *        The list of elements for which new cells should be created. May be
   *        <code>null</code>.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCells (@Nullable final IHCNode... aCellChildren)
  {
    if (aCellChildren != null)
      for (final IHCNode aCellChild : aCellChildren)
        addCell (aCellChild);
    return this;
  }

  /**
   * Add multiple cells, one for each passed element.
   * 
   * @param aCellChildren
   *        The list of elements for which new cells should be created. May be
   *        <code>null</code>.
   * @return this (the table row)
   */
  @Nonnull
  public HCRow addCells (@Nullable final Iterable <? extends IHCNode> aCellChildren)
  {
    if (aCellChildren != null)
      for (final IHCNode aCellChild : aCellChildren)
        addCell (aCellChild);
    return this;
  }

  @Nonnull
  public HCRow addNonEmptyCell (@Nullable final String sCellText)
  {
    return addCell (StringHelper.hasNoText (sCellText) ? " " : sCellText);
  }

  /**
   * Get the cell at the specified index in this row. This method does NOT
   * consider colspans!!!!
   * 
   * @param nIndex
   *        The index of the cell
   * @return <code>null</code> if no such cell is present
   */
  @Nullable
  public AbstractHCCell getCellAtIndex (final int nIndex)
  {
    return getChildAtIndex (nIndex);
  }

  /**
   * Get the cell at the specified index in this row. This method does consider
   * colspans!!!!
   * 
   * @param nIndex
   *        The index of the cell
   * @return <code>null</code> if no such cell is present
   */
  @Nullable
  public AbstractHCCell getCellAtEffectiveIndex (final int nIndex)
  {
    int i = 0;
    if (hasChildren ())
      for (final AbstractHCCell aCell : directGetChildren ())
      {
        if (i >= nIndex)
          return aCell;
        i += aCell.getColspan ();
      }
    return null;
  }

  /**
   * Note: this method only counts the effective cells and does NOT include
   * eventually contained "colspans"!
   * 
   * @return The number of contained cells.
   */
  @Nonnegative
  public int getCellCount ()
  {
    return getChildCount ();
  }

  /**
   * Count the number of effective cells - including "colspans" - of this row.
   * 
   * @return The number of effectively contained cells.
   */
  @Nonnegative
  public int getEffectiveCellCount ()
  {
    int ret = 0;
    if (hasChildren ())
      for (final AbstractHCCell aCell : directGetChildren ())
        ret += aCell.getColspan ();
    return ret;
  }

  @Nonnull
  public HCNodeList getCellsAsNodeList ()
  {
    final HCNodeList ret = new HCNodeList ();
    if (hasChildren ())
      for (final AbstractHCCell aCell : directGetChildren ())
        ret.addChild (aCell);
    return ret;
  }

  @Override
  protected boolean canConvertToNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    // Avoid rows without cells!
    return hasChildren ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("header", m_bHeader).toString ();
  }
}
