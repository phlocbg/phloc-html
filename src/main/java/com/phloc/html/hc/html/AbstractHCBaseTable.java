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
package com.phloc.html.hc.html;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.annotations.ReturnsMutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * This is the common base class for regular HC tables as well as for more
 * complex constructs (e.g. PUI)
 * 
 * @author philip
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCBaseTable <THISTYPE extends AbstractHCBaseTable <THISTYPE>> extends
                                                                                            AbstractHCElement <THISTYPE> implements
                                                                                                                        IHCHasChildren
{
  protected HCColGroup m_aColGroup;
  private int m_nCellSpacing = CGlobal.ILLEGAL_UINT;
  private int m_nCellPadding = CGlobal.ILLEGAL_UINT;
  private HCRow m_aHeaderRow;
  private String m_sHeaderID;
  private final List <HCRow> m_aBodyRows = new ArrayList <HCRow> ();
  private String m_sBodyID;
  private List <ICSSClassProvider> m_aBodyClasses;
  private HCRow m_aFooterRow;
  private String m_sFooterID;

  /**
   * This constructor is used to create elements with logic like a table but
   * actually not having a top 'table' element
   */
  protected AbstractHCBaseTable (@Nonnull @Nonempty final EHTMLElement aElement)
  {
    super (aElement);
  }

  public final boolean hasChildren ()
  {
    return m_aHeaderRow != null || !m_aBodyRows.isEmpty () || m_aFooterRow != null;
  }

  @Nonnegative
  public final int getChildCount ()
  {
    return (m_aHeaderRow != null ? 1 : 0) + m_aBodyRows.size () + (m_aFooterRow != null ? 1 : 0);
  }

  @Nullable
  public final IHCNode getFirstChild ()
  {
    IHCNode ret = m_aHeaderRow;
    if (ret == null)
    {
      ret = getFirstBodyRow ();
      if (ret == null)
        ret = m_aFooterRow;
    }
    return ret;
  }

  @Nullable
  public final IHCNode getLastChild ()
  {
    IHCNode ret = m_aFooterRow;
    if (ret == null)
    {
      ret = getLastBodyRow ();
      if (ret == null)
        ret = m_aHeaderRow;
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <IHCNode> getChildren ()
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (m_aHeaderRow != null)
      ret.add (m_aHeaderRow);
    ret.addAll (m_aBodyRows);
    if (m_aFooterRow != null)
      ret.add (m_aFooterRow);
    return ret;
  }

  @Nullable
  public final HCRow getChildAtIndex (@Nonnegative final int nIndex)
  {
    int nRealIndex = 0;
    if (m_aHeaderRow != null)
      if (nRealIndex++ == nIndex)
        return m_aHeaderRow;
    for (final HCRow aBodyRow : m_aBodyRows)
      if (nRealIndex++ == nIndex)
        return aBodyRow;
    if (m_aFooterRow != null)
      if (nRealIndex++ == nIndex)
        return m_aFooterRow;
    return null;
  }

  public final int getCellSpacing ()
  {
    return m_nCellSpacing;
  }

  @Nonnull
  public final THISTYPE setCellSpacing (final int nCellSpacing)
  {
    m_nCellSpacing = nCellSpacing;
    return thisAsT ();
  }

  public final int getCellPadding ()
  {
    return m_nCellPadding;
  }

  @Nonnull
  public final THISTYPE setCellPadding (final int nCellPadding)
  {
    m_nCellPadding = nCellPadding;
    return thisAsT ();
  }

  //
  // column handling
  //

  @Nullable
  public final HCColGroup getColGroup ()
  {
    return m_aColGroup;
  }

  @Nonnull
  public final THISTYPE addColumn (@Nullable final HCCol aCol)
  {
    if (aCol != null)
    {
      if (m_aColGroup == null)
        m_aColGroup = new HCColGroup ();
      m_aColGroup.addColumn (aCol);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addColumn (@Nonnegative final int nIndex, @Nullable final HCCol aCol)
  {
    if (aCol != null)
    {
      if (m_aColGroup == null)
        m_aColGroup = new HCColGroup ();
      m_aColGroup.addColumn (nIndex, aCol);
    }
    return thisAsT ();
  }

  @Nonnull
  @Deprecated
  public final THISTYPE addColumns (@Nullable final HCCol aCol)
  {
    return addColumn (aCol);
  }

  @Nonnull
  public final THISTYPE addColumns (@Nullable final HCCol... aCols)
  {
    if (aCols != null)
      for (final HCCol aCol : aCols)
        addColumn (aCol);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addColumns (@Nullable final Iterable <HCCol> aCols)
  {
    if (aCols != null)
      for (final HCCol aCol : aCols)
        addColumn (aCol);
    return thisAsT ();
  }

  /**
   * Remove the column definition at the specified index. This does not affect
   * any row contents.
   * 
   * @param nColumnIndex
   *        The index of the column to remove
   * @return this
   */
  @Nonnull
  public final THISTYPE removeColumnAtIndex (@Nonnegative final int nColumnIndex)
  {
    if (m_aColGroup != null)
      m_aColGroup.removeColumnAtIndex (nColumnIndex);
    return thisAsT ();
  }

  /**
   * Remove all column definitions. This does not affect any row contents.
   * 
   * @return this
   */
  @Nonnull
  public final THISTYPE removeAllColumns ()
  {
    m_aColGroup = null;
    return thisAsT ();
  }

  /**
   * @return The number of columns as specified in the column group. If no
   *         column group is defined, 0 is returned.
   */
  @Nonnegative
  public final int getColumnCount ()
  {
    return m_aColGroup == null ? 0 : m_aColGroup.getColumnCount ();
  }

  //
  // header row handling
  //

  /**
   * @return The ID of the header row. May be <code>null</code>.
   */
  @Nullable
  public final String getHeaderID ()
  {
    return m_sHeaderID;
  }

  /**
   * Set the table header ID
   * 
   * @param sID
   *        The ID ot be set. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  public final THISTYPE setHeaderID (@Nullable final String sID)
  {
    m_sHeaderID = sID;
    return thisAsT ();
  }

  /**
   * @return <code>true</code> if a header ID is present, <code>false</code>
   *         otherwise
   */
  public final boolean hasHeaderID ()
  {
    return StringHelper.hasText (m_sHeaderID);
  }

  /**
   * @return The current set header row or <code>null</code> if no header row is
   *         present
   */
  @Nullable
  public final HCRow getHeaderRow ()
  {
    return m_aHeaderRow;
  }

  /**
   * @return <code>true</code> if a header row is present, <code>false</code> if
   *         not
   */
  public final boolean hasHeaderRow ()
  {
    return m_aHeaderRow != null;
  }

  /**
   * Add a new header row.
   * 
   * @return The created header row
   * @throws IllegalStateException
   *         if a header row is already present
   */
  @Nonnull
  public final HCRow addHeaderRow ()
  {
    if (m_aHeaderRow != null)
      throw new IllegalStateException ("A header row is already present! You cannot have more than one!");
    m_aHeaderRow = new HCRow (true);
    return m_aHeaderRow;
  }

  /**
   * Create a new header row, or reuse it if it is already existing.
   * 
   * @return The header row and never <code>null</code>.
   */
  @Nonnull
  public final HCRow getOrAddHeaderRow ()
  {
    return m_aHeaderRow != null ? m_aHeaderRow : addHeaderRow ();
  }

  /**
   * Remove the header row, if it is present. The header ID is not modified.
   * 
   * @return this
   */
  @Nonnull
  public final THISTYPE removeHeaderRow ()
  {
    m_aHeaderRow = null;
    return thisAsT ();
  }

  //
  // footer row handling
  //

  /**
   * @return The ID of the footer row. May be <code>null</code>.
   */
  @Nullable
  public final String getFooterID ()
  {
    return m_sFooterID;
  }

  /**
   * @return <code>true</code> if a footer ID is present, <code>false</code>
   *         otherwise
   */
  public final boolean hasFooterID ()
  {
    return StringHelper.hasText (m_sFooterID);
  }

  /**
   * Set the table footer ID
   * 
   * @param sID
   *        The ID ot be set. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  public final THISTYPE setFooterID (@Nullable final String sID)
  {
    m_sFooterID = sID;
    return thisAsT ();
  }

  /**
   * @return The current set footer row or <code>null</code> if no footer row is
   *         present
   */
  @Nullable
  public final HCRow getFooterRow ()
  {
    return m_aFooterRow;
  }

  /**
   * @return <code>true</code> if a footer row is present, <code>false</code> if
   *         not
   */
  public final boolean hasFooterRow ()
  {
    return m_aFooterRow != null;
  }

  /**
   * Add a new footer row.
   * 
   * @return The created footer row
   * @throws IllegalStateException
   *         if a footer row is already present
   */
  @Nonnull
  public final HCRow addFooterRow ()
  {
    if (m_aFooterRow != null)
      throw new IllegalStateException ("A footer row is already present! You cannot have more than one!");
    m_aFooterRow = new HCRow (true);
    return m_aFooterRow;
  }

  /**
   * Create a new footer row, or reuse it if it is already existing.
   * 
   * @return The footer row and never <code>null</code>.
   */
  @Nonnull
  public final HCRow getOrAddFooterRow ()
  {
    return m_aFooterRow != null ? m_aFooterRow : addFooterRow ();
  }

  /**
   * Remove the footer row, if it is present. The footer ID is not modified.
   * 
   * @return this
   */
  @Nonnull
  public final THISTYPE removeFooterRow ()
  {
    m_aFooterRow = null;
    return thisAsT ();
  }

  //
  // body row handling
  //

  @Nullable
  public final String getBodyID ()
  {
    return m_sBodyID;
  }

  @Nonnull
  public final THISTYPE setBodyID (@Nullable final String sID)
  {
    m_sBodyID = sID;
    return thisAsT ();
  }

  /**
   * @return <code>true</code> if a body ID is present, <code>false</code>
   *         otherwise
   */
  public final boolean hasBodyID ()
  {
    return StringHelper.hasText (m_sBodyID);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <ICSSClassProvider> getBodyClasses ()
  {
    return ContainerHelper.newList (m_aBodyClasses);
  }

  @Nonnull
  public final String getBodyClassesAsString ()
  {
    if (m_aBodyClasses == null || m_aBodyClasses.isEmpty ())
      return "";
    final StringBuilder aSB = new StringBuilder ();
    for (final ICSSClassProvider aCSSClass : m_aBodyClasses)
    {
      if (aSB.length () > 0)
        aSB.append (' ');
      aSB.append (aCSSClass.getCSSClass ());
    }
    return aSB.toString ();
  }

  @Nonnull
  public final THISTYPE addBodyClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (aCSSClassProvider == null)
      throw new NullPointerException ("CSSClassProvider");
    if (m_aBodyClasses == null)
      m_aBodyClasses = new ArrayList <ICSSClassProvider> ();
    m_aBodyClasses.add (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeBodyClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (m_aBodyClasses != null)
      m_aBodyClasses.remove (aCSSClassProvider);
    return thisAsT ();
  }

  public final boolean hasBodyClasses ()
  {
    return ContainerHelper.isNotEmpty (m_aBodyClasses);
  }

  public final boolean hasBodyRows ()
  {
    return !m_aBodyRows.isEmpty ();
  }

  @Nonnegative
  public final int getBodyRowCount ()
  {
    return m_aBodyRows.size ();
  }

  /**
   * Get the contained list object that holds all the rows. Handle with care
   * because it alters the internal data structures of this table.
   * 
   * @return The contained list object for external row order handling.
   */
  @Nonnull
  @ReturnsMutableObject (reason = "For performance reasons in derived classes")
  protected final List <HCRow> directGetBodyRowList ()
  {
    return m_aBodyRows;
  }

  @Nullable
  public final HCRow getFirstBodyRow ()
  {
    return ContainerHelper.getFirstElement (m_aBodyRows);
  }

  @Nullable
  public final HCRow getBodyRowAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aBodyRows, nIndex);
  }

  @Nullable
  public final HCRow getLastBodyRow ()
  {
    return ContainerHelper.getLastElement (m_aBodyRows);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllBodyRows ()
  {
    return ContainerHelper.newList (m_aBodyRows);
  }

  @Nonnull
  public final HCRow addBodyRow ()
  {
    final HCRow ret = new HCRow (false);
    m_aBodyRows.add (ret);
    return ret;
  }

  @Nonnull
  public final HCRow addBodyRow (@Nonnegative final int nIndex)
  {
    final HCRow ret = new HCRow (false);
    m_aBodyRows.add (nIndex, ret);
    return ret;
  }

  @Nonnull
  public final THISTYPE addBodyRow (@Nullable final HCRow aRow)
  {
    if (aRow != null)
      m_aBodyRows.add (aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addBodyRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    if (aRow != null)
      m_aBodyRows.add (nIndex, aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeBodyRowAtIndex (@Nonnegative final int nIndex)
  {
    if (nIndex >= 0 && nIndex < m_aBodyRows.size ())
      m_aBodyRows.remove (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllBodyRows ()
  {
    m_aBodyRows.clear ();
    return thisAsT ();
  }

  //
  // code generation
  //

  @Override
  @OverridingMethodsMustInvokeSuper
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Avoid creating a table without header, body and footer
    return m_aHeaderRow != null || !m_aBodyRows.isEmpty () || m_sBodyID != null || m_aFooterRow != null;
  }

  private static int _getApplicableRowspan (final int nCellIndex, @Nullable final List <int []> aRowSpans)
  {
    int nApplicableRowspan = 0;
    if (aRowSpans != null)
    {
      // The table has at least one rowspan defined
      int nDecrease = 1;
      for (final int [] aPrevRowRowspans : aRowSpans)
      {
        if (aPrevRowRowspans != null)
          if (nCellIndex < aPrevRowRowspans.length)
          {
            final int nEffectiveRowspan = aPrevRowRowspans[nCellIndex] - nDecrease;
            if (nEffectiveRowspan > 0)
              nApplicableRowspan++;
          }
        ++nDecrease;
      }
    }
    return nApplicableRowspan;
  }

  @Nonnegative
  private static int _getEffectiveCellCount (@Nonnull final HCRow aRow, @Nullable final List <int []> aRowSpans)
  {
    int nCellIndex = 0;
    for (final AbstractHCCell aCell : aRow.getChildren ())
      nCellIndex += _getApplicableRowspan (nCellIndex, aRowSpans) + aCell.getColspan ();
    // Any rowspan after the last cell?
    nCellIndex += _getApplicableRowspan (nCellIndex, aRowSpans);
    return nCellIndex;
  }

  public static void checkInternalConsistency (@Nonnull final AbstractHCBaseTable <?> aBaseTable)
  {
    // Determine number of columns to use
    int nCols = 0;
    if (aBaseTable.m_aColGroup != null)
      nCols = aBaseTable.m_aColGroup.getColumnCount ();
    if (nCols == 0 && aBaseTable.m_aHeaderRow != null)
      nCols = aBaseTable.m_aHeaderRow.getEffectiveCellCount ();
    if (nCols == 0 && !aBaseTable.m_aBodyRows.isEmpty ())
      nCols = aBaseTable.getFirstBodyRow ().getEffectiveCellCount ();
    if (nCols == 0 && aBaseTable.m_aFooterRow != null)
      nCols = aBaseTable.m_aFooterRow.getEffectiveCellCount ();

    if (aBaseTable.m_aHeaderRow != null)
    {
      final int nRowCols = aBaseTable.m_aHeaderRow.getEffectiveCellCount ();
      if (nRowCols != nCols)
        HCConsistencyChecker.consistencyWarning ("header row has " +
                                                 nRowCols +
                                                 " cells but was expecting " +
                                                 nCols +
                                                 " cells");
    }
    int nRowIndex = 0;
    boolean bTotalHasRowSpans = false;
    final List <int []> aTotalRowSpans = new ArrayList <int []> (aBaseTable.m_aBodyRows.size ());
    for (final HCRow aBodyRow : aBaseTable.m_aBodyRows)
    {
      // Pass null if no row spans are defined!
      final int nRowCols = _getEffectiveCellCount (aBodyRow, bTotalHasRowSpans ? aTotalRowSpans : null);
      if (nRowCols != nCols)
        HCConsistencyChecker.consistencyWarning ("body row #" +
                                                 (nRowIndex + 1) +
                                                 " has " +
                                                 nRowCols +
                                                 " cells but was expecting " +
                                                 nCols +
                                                 " cells");
      // Add row span at the end of the row so that it affects following rows
      {
        final int [] aRowRowSpans = new int [aBodyRow.getCellCount ()];
        int nCellIndex = 0;
        boolean bRowHasRowSpans = false;
        for (final AbstractHCCell aCell : aBodyRow.getChildren ())
        {
          final int nRowSpan = aCell.getRowspan ();
          aRowRowSpans[nCellIndex++] = nRowSpan;
          if (nRowSpan != 1)
            bRowHasRowSpans = true;
        }
        if (bRowHasRowSpans)
        {
          // This row has at least one row span!
          aTotalRowSpans.add (0, aRowRowSpans);
          bTotalHasRowSpans = true;
        }
        else
        {
          // There are no row spans defined in this row
          aTotalRowSpans.add (0, null);
        }
      }
      nRowIndex++;
    }
    if (aBaseTable.m_aFooterRow != null)
    {
      final int nRowCols = aBaseTable.m_aFooterRow.getEffectiveCellCount ();
      if (nRowCols != nCols)
        HCConsistencyChecker.consistencyWarning ("footer row has " +
                                                 nRowCols +
                                                 " cells but was expecting " +
                                                 nCols +
                                                 " cells");
    }
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalApplyCustomization (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                             @Nonnull final IHCNodeWithChildren <?> aParentNode)
  {
    if (m_aHeaderRow != null)
      m_aHeaderRow.applyCustomization (aConversionSettings, aParentNode);
    // We need to work on a copy of the children!
    for (final HCRow aBodyRow : ContainerHelper.newList (m_aBodyRows))
      aBodyRow.applyCustomization (aConversionSettings, aParentNode);
    if (m_aFooterRow != null)
      m_aFooterRow.applyCustomization (aConversionSettings, aParentNode);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (m_aHeaderRow != null)
      m_aHeaderRow.beforeConvertToNode (aConversionSettings);
    for (final HCRow aBodyRow : m_aBodyRows)
      aBodyRow.beforeConvertToNode (aConversionSettings);
    if (m_aFooterRow != null)
      m_aFooterRow.beforeConvertToNode (aConversionSettings);
  }

  @Override
  @Nonnull
  public final String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    if (m_aHeaderRow != null)
      ret.append (m_aHeaderRow.getPlainText ()).append (' ');
    for (final HCRow aBodyRow : m_aBodyRows)
      ret.append (aBodyRow.getPlainText ()).append (' ');
    if (m_aFooterRow != null)
      ret.append (m_aFooterRow.getPlainText ()).append (' ');
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("colGroup", m_aColGroup)
                            .append ("cellSpacing", m_nCellSpacing)
                            .append ("cellPadding", m_nCellPadding)
                            .appendIfNotNull ("headerRow", m_aHeaderRow)
                            .appendIfNotNull ("headerID", m_sHeaderID)
                            .append ("bodyRows", m_aBodyRows)
                            .appendIfNotNull ("bodyID", m_sBodyID)
                            .appendIfNotNull ("footerRow", m_aFooterRow)
                            .appendIfNotNull ("footerID", m_sFooterID)
                            .toString ();
  }
}
