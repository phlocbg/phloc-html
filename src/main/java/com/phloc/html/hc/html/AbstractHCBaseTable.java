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
import java.util.Collections;
import java.util.Comparator;
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
public abstract class AbstractHCBaseTable <THISTYPE extends AbstractHCBaseTable <THISTYPE>> extends AbstractHCElement <THISTYPE> implements IHCHasChildren
{
  protected HCColGroup m_aColGroup;
  private int m_nCellSpacing = CGlobal.ILLEGAL_UINT;
  private int m_nCellPadding = CGlobal.ILLEGAL_UINT;

  private final List <HCRow> m_aHeaderRows = new ArrayList <HCRow> ();
  private String m_sHeaderID;
  private List <ICSSClassProvider> m_aHeaderClasses;

  private final List <HCRow> m_aBodyRows = new ArrayList <HCRow> ();
  private String m_sBodyID;
  private List <ICSSClassProvider> m_aBodyClasses;

  private final List <HCRow> m_aFooterRows = new ArrayList <HCRow> ();
  private String m_sFooterID;
  private List <ICSSClassProvider> m_aFooterClasses;

  /**
   * This constructor is used to create elements with logic like a table but
   * actually not having a top 'table' element
   * 
   * @param aElement
   *        The HTML element to be used to create the table
   */
  protected AbstractHCBaseTable (@Nonnull @Nonempty final EHTMLElement aElement)
  {
    super (aElement);
  }

  public final boolean hasChildren ()
  {
    return !m_aHeaderRows.isEmpty () || !m_aBodyRows.isEmpty () || !m_aFooterRows.isEmpty ();
  }

  @Nonnegative
  public final int getChildCount ()
  {
    return m_aHeaderRows.size () + m_aBodyRows.size () + m_aFooterRows.size ();
  }

  @Nullable
  public final HCRow getFirstChild ()
  {
    HCRow ret = getFirstHeaderRow ();
    if (ret == null)
    {
      ret = getFirstBodyRow ();
      if (ret == null)
        ret = getFirstFooterRow ();
    }
    return ret;
  }

  @Nullable
  public final HCRow getLastChild ()
  {
    HCRow ret = getLastFooterRow ();
    if (ret == null)
    {
      ret = getLastBodyRow ();
      if (ret == null)
        ret = getLastHeaderRow ();
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <IHCNode> getChildren ()
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    ret.addAll (m_aHeaderRows);
    ret.addAll (m_aBodyRows);
    ret.addAll (m_aFooterRows);
    return ret;
  }

  @Nullable
  public final HCRow getChildAtIndex (@Nonnegative final int nIndex)
  {
    int nRealIndex = nIndex;
    if (nRealIndex < getHeaderRowCount ())
      return getHeaderRowAtIndex (nRealIndex);
    nRealIndex -= getHeaderRowCount ();
    if (nRealIndex < getBodyRowCount ())
      return getBodyRowAtIndex (nRealIndex);
    nRealIndex -= getBodyRowCount ();
    if (nRealIndex < getFooterRowCount ())
      return getFooterRowAtIndex (nRealIndex);
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
  public final THISTYPE addColumns (@Nullable final Iterable <? extends HCCol> aCols)
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

  @Nullable
  public final String getHeaderID ()
  {
    return m_sHeaderID;
  }

  @Nonnull
  public final THISTYPE setHeaderID (@Nullable final String sID)
  {
    m_sHeaderID = sID;
    return thisAsT ();
  }

  /**
   * @return <code>true</code> if a Header ID is present, <code>false</code>
   *         otherwise
   */
  public final boolean hasHeaderID ()
  {
    return StringHelper.hasText (m_sHeaderID);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <ICSSClassProvider> getHeaderClasses ()
  {
    return ContainerHelper.newList (m_aHeaderClasses);
  }

  @Nonnull
  public final String getHeaderClassesAsString ()
  {
    if (m_aHeaderClasses == null || m_aHeaderClasses.isEmpty ())
      return "";
    final StringBuilder aSB = new StringBuilder ();
    for (final ICSSClassProvider aCSSClass : m_aHeaderClasses)
    {
      if (aSB.length () > 0)
        aSB.append (' ');
      aSB.append (aCSSClass.getCSSClass ());
    }
    return aSB.toString ();
  }

  @Nonnull
  public final THISTYPE addHeaderClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (aCSSClassProvider == null)
      throw new NullPointerException ("CSSClassProvider");
    if (m_aHeaderClasses == null)
      m_aHeaderClasses = new ArrayList <ICSSClassProvider> ();
    m_aHeaderClasses.add (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeHeaderClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (m_aHeaderClasses != null)
      m_aHeaderClasses.remove (aCSSClassProvider);
    return thisAsT ();
  }

  public final boolean hasHeaderClasses ()
  {
    return ContainerHelper.isNotEmpty (m_aHeaderClasses);
  }

  public final boolean hasHeaderRows ()
  {
    return !m_aHeaderRows.isEmpty ();
  }

  @Nonnegative
  public final int getHeaderRowCount ()
  {
    return m_aHeaderRows.size ();
  }

  /**
   * Get the contained list object that holds all the rows. Handle with care
   * because it alters the internal data structures of this table.
   * 
   * @return The contained list object for external row order handling.
   */
  @Nonnull
  @ReturnsMutableObject (reason = "For performance reasons in derived classes")
  protected final List <HCRow> directGetHeaderRowList ()
  {
    // ESCA-JAVA0259:
    return m_aHeaderRows;
  }

  @Nullable
  public final HCRow getFirstHeaderRow ()
  {
    return ContainerHelper.getFirstElement (m_aHeaderRows);
  }

  @Nullable
  public final HCRow getHeaderRowAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aHeaderRows, nIndex);
  }

  @Nullable
  public final HCRow getLastHeaderRow ()
  {
    return ContainerHelper.getLastElement (m_aHeaderRows);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllHeaderRows ()
  {
    return ContainerHelper.newList (m_aHeaderRows);
  }

  @Nonnull
  public final HCRow addHeaderRow ()
  {
    final HCRow ret = new HCRow (true);
    m_aHeaderRows.add (ret);
    return ret;
  }

  @Nonnull
  public final HCRow addHeaderRow (@Nonnegative final int nIndex)
  {
    final HCRow ret = new HCRow (true);
    m_aHeaderRows.add (nIndex, ret);
    return ret;
  }

  @Nonnull
  public final THISTYPE addHeaderRow (@Nullable final HCRow aRow)
  {
    if (aRow != null)
      m_aHeaderRows.add (aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addHeaderRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    if (aRow != null)
      m_aHeaderRows.add (nIndex, aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeHeaderRowAtIndex (@Nonnegative final int nIndex)
  {
    if (nIndex >= 0 && nIndex < m_aHeaderRows.size ())
      m_aHeaderRows.remove (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllHeaderRows ()
  {
    m_aHeaderRows.clear ();
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE sortAllHeaderRows (@Nonnull final Comparator <HCRow> aComparator)
  {
    if (aComparator == null)
      throw new NullPointerException ("comparator");
    Collections.sort (m_aHeaderRows, aComparator);
    return thisAsT ();
  }

  //
  // footer row handling
  //

  @Nullable
  public final String getFooterID ()
  {
    return m_sFooterID;
  }

  @Nonnull
  public final THISTYPE setFooterID (@Nullable final String sID)
  {
    m_sFooterID = sID;
    return thisAsT ();
  }

  /**
   * @return <code>true</code> if a Footer ID is present, <code>false</code>
   *         otherwise
   */
  public final boolean hasFooterID ()
  {
    return StringHelper.hasText (m_sFooterID);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <ICSSClassProvider> getFooterClasses ()
  {
    return ContainerHelper.newList (m_aFooterClasses);
  }

  @Nonnull
  public final String getFooterClassesAsString ()
  {
    if (m_aFooterClasses == null || m_aFooterClasses.isEmpty ())
      return "";
    final StringBuilder aSB = new StringBuilder ();
    for (final ICSSClassProvider aCSSClass : m_aFooterClasses)
    {
      if (aSB.length () > 0)
        aSB.append (' ');
      aSB.append (aCSSClass.getCSSClass ());
    }
    return aSB.toString ();
  }

  @Nonnull
  public final THISTYPE addFooterClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (aCSSClassProvider == null)
      throw new NullPointerException ("CSSClassProvider");
    if (m_aFooterClasses == null)
      m_aFooterClasses = new ArrayList <ICSSClassProvider> ();
    m_aFooterClasses.add (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeFooterClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (m_aFooterClasses != null)
      m_aFooterClasses.remove (aCSSClassProvider);
    return thisAsT ();
  }

  public final boolean hasFooterClasses ()
  {
    return ContainerHelper.isNotEmpty (m_aFooterClasses);
  }

  public final boolean hasFooterRows ()
  {
    return !m_aFooterRows.isEmpty ();
  }

  @Nonnegative
  public final int getFooterRowCount ()
  {
    return m_aFooterRows.size ();
  }

  /**
   * Get the contained list object that holds all the rows. Handle with care
   * because it alters the internal data structures of this table.
   * 
   * @return The contained list object for external row order handling.
   */
  @Nonnull
  @ReturnsMutableObject (reason = "For performance reasons in derived classes")
  protected final List <HCRow> directGetFooterRowList ()
  {
    return m_aFooterRows;
  }

  @Nullable
  public final HCRow getFirstFooterRow ()
  {
    return ContainerHelper.getFirstElement (m_aFooterRows);
  }

  @Nullable
  public final HCRow getFooterRowAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aFooterRows, nIndex);
  }

  @Nullable
  public final HCRow getLastFooterRow ()
  {
    return ContainerHelper.getLastElement (m_aFooterRows);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllFooterRows ()
  {
    return ContainerHelper.newList (m_aFooterRows);
  }

  @Nonnull
  public final HCRow addFooterRow ()
  {
    final HCRow ret = new HCRow (true);
    m_aFooterRows.add (ret);
    return ret;
  }

  @Nonnull
  public final HCRow addFooterRow (@Nonnegative final int nIndex)
  {
    final HCRow ret = new HCRow (true);
    m_aFooterRows.add (nIndex, ret);
    return ret;
  }

  @Nonnull
  public final THISTYPE addFooterRow (@Nullable final HCRow aRow)
  {
    if (aRow != null)
      m_aFooterRows.add (aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addFooterRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    if (aRow != null)
      m_aFooterRows.add (nIndex, aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeFooterRowAtIndex (@Nonnegative final int nIndex)
  {
    if (nIndex >= 0 && nIndex < m_aFooterRows.size ())
      m_aFooterRows.remove (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllFooterRows ()
  {
    m_aFooterRows.clear ();
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE sortAllFooterRows (@Nonnull final Comparator <HCRow> aComparator)
  {
    if (aComparator == null)
      throw new NullPointerException ("comparator");
    Collections.sort (m_aFooterRows, aComparator);
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

  @Nonnull
  public final THISTYPE sortAllBodyRows (@Nonnull final Comparator <HCRow> aComparator)
  {
    if (aComparator == null)
      throw new NullPointerException ("comparator");
    Collections.sort (m_aBodyRows, aComparator);
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
    return !m_aHeaderRows.isEmpty () ||
           m_sHeaderID != null ||
           !m_aBodyRows.isEmpty () ||
           m_sBodyID != null ||
           !m_aFooterRows.isEmpty () ||
           m_sFooterID != null;
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

  private static void _checkConsistency (@Nonnull final String sContext,
                                         @Nonnull final List <HCRow> aRows,
                                         @Nonnegative final int nCols)
  {
    int nRowIndex = 0;
    boolean bTotalHasRowSpans = false;
    final List <int []> aTotalRowSpans = new ArrayList <int []> (aRows.size ());
    for (final HCRow aBodyRow : aRows)
    {
      // Pass null if no row spans are defined!
      final int nRowCols = _getEffectiveCellCount (aBodyRow, bTotalHasRowSpans ? aTotalRowSpans : null);
      if (nRowCols != nCols)
        HCConsistencyChecker.consistencyWarning (sContext +
                                                 " row #" +
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
  }

  public static void checkInternalConsistency (@Nonnull final AbstractHCBaseTable <?> aBaseTable)
  {
    // Determine number of columns to use
    int nCols = 0;
    if (aBaseTable.m_aColGroup != null)
      nCols = aBaseTable.m_aColGroup.getColumnCount ();
    if (nCols == 0 && !aBaseTable.m_aHeaderRows.isEmpty ())
      nCols = aBaseTable.getFirstHeaderRow ().getEffectiveCellCount ();
    if (nCols == 0 && !aBaseTable.m_aBodyRows.isEmpty ())
      nCols = aBaseTable.getFirstBodyRow ().getEffectiveCellCount ();
    if (nCols == 0 && !aBaseTable.m_aFooterRows.isEmpty ())
      nCols = aBaseTable.getFirstFooterRow ().getEffectiveCellCount ();

    _checkConsistency ("header", aBaseTable.m_aHeaderRows, nCols);
    _checkConsistency ("body", aBaseTable.m_aBodyRows, nCols);
    _checkConsistency ("footer", aBaseTable.m_aFooterRows, nCols);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalApplyCustomization (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                             @Nonnull final IHCNodeWithChildren <?> aParentNode)
  {
    // We need to work on a copy of the children!
    for (final HCRow aHeaderRow : ContainerHelper.newList (m_aHeaderRows))
      aHeaderRow.applyCustomization (aConversionSettings, aParentNode);
    for (final HCRow aBodyRow : ContainerHelper.newList (m_aBodyRows))
      aBodyRow.applyCustomization (aConversionSettings, aParentNode);
    for (final HCRow aFooterRow : ContainerHelper.newList (m_aFooterRows))
      aFooterRow.applyCustomization (aConversionSettings, aParentNode);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final HCRow aHeaderRow : m_aHeaderRows)
      aHeaderRow.beforeConvertToNode (aConversionSettings);
    for (final HCRow aBodyRow : m_aBodyRows)
      aBodyRow.beforeConvertToNode (aConversionSettings);
    for (final HCRow aFooterRow : m_aFooterRows)
      aFooterRow.beforeConvertToNode (aConversionSettings);
  }

  @Override
  @Nonnull
  public final String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    for (final HCRow aHeaderRow : m_aHeaderRows)
      ret.append (aHeaderRow.getPlainText ()).append (' ');
    for (final HCRow aBodyRow : m_aBodyRows)
      ret.append (aBodyRow.getPlainText ()).append (' ');
    for (final HCRow aFooterRow : m_aFooterRows)
      ret.append (aFooterRow.getPlainText ()).append (' ');
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("colGroup", m_aColGroup)
                            .append ("cellSpacing", m_nCellSpacing)
                            .append ("cellPadding", m_nCellPadding)
                            .append ("headerRows", m_aHeaderRows)
                            .appendIfNotNull ("headerID", m_sHeaderID)
                            .appendIfNotNull ("headerClasses", m_aHeaderClasses)
                            .append ("bodyRows", m_aBodyRows)
                            .appendIfNotNull ("bodyID", m_sBodyID)
                            .appendIfNotNull ("bodyClasses", m_aBodyClasses)
                            .append ("footerRows", m_aFooterRows)
                            .appendIfNotNull ("footerID", m_sFooterID)
                            .appendIfNotNull ("footerClasses", m_aFooterClasses)
                            .toString ();
  }

  @Deprecated
  public final boolean hasHeaderRow ()
  {
    return hasHeaderRows ();
  }

  @Deprecated
  @Nullable
  public final HCRow getHeaderRow ()
  {
    return getFirstHeaderRow ();
  }

  @Deprecated
  @Nullable
  public final HCRow getOrAddHeaderRow ()
  {
    return hasHeaderRows () ? getFirstHeaderRow () : addHeaderRow ();
  }

  @Deprecated
  @Nonnull
  public final THISTYPE removeHeaderRow ()
  {
    return removeHeaderRowAtIndex (0);
  }

  @Deprecated
  public final boolean hasFooterRow ()
  {
    return hasFooterRows ();
  }

  @Deprecated
  @Nullable
  public final HCRow getFooterRow ()
  {
    return getFirstFooterRow ();
  }

  @Deprecated
  @Nullable
  public final HCRow getOrAddFooterRow ()
  {
    return hasFooterRows () ? getFirstFooterRow () : addFooterRow ();
  }

  @Deprecated
  @Nonnull
  public final THISTYPE removeFooterRow ()
  {
    return removeFooterRowAtIndex (0);
  }
}
