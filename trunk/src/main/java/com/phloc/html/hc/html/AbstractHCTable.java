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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.CGlobal;
import com.phloc.commons.GlobalDebug;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.annotations.ReturnsMutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.parent.IHasChildrenSorted;
import com.phloc.commons.string.StringHelper;
import com.phloc.css.CCSS;
import com.phloc.css.DefaultCSSClassProvider;
import com.phloc.css.ICSSClassProvider;
import com.phloc.css.property.CCSSProperties;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.hc.impl.HCEntityNode;
import com.phloc.html.hc.impl.HCNodeList;

public abstract class AbstractHCTable <THISTYPE extends AbstractHCTable <THISTYPE>> extends
                                                                                    AbstractHCElement <THISTYPE> implements
                                                                                                                IHasChildrenSorted <IHCNode>
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCTable.class);
  private static final ICSSClassProvider CSS_FORCE_COLSPAN = DefaultCSSClassProvider.create ("force_colspan");
  protected HCColGroup m_aColGroup;
  private int m_nCellSpacing = CGlobal.ILLEGAL_UINT;
  private int m_nCellPadding = CGlobal.ILLEGAL_UINT;

  protected HCRow m_aHeaderRow;
  protected String m_sHeaderID;
  private final List <HCRow> m_aBodyRows = new ArrayList <HCRow> ();
  protected String m_sBodyID;
  protected HCRow m_aFooterRow;
  protected String m_sFooterID;

  public AbstractHCTable ()
  {
    super (EHTMLElement.TABLE);
  }

  /**
   * This constructor is used to create elements with logic like a table but
   * actually not having a top 'table' element
   */
  protected AbstractHCTable (@Nonnull @Nonempty final EHTMLElement aElement)
  {
    super (aElement);
  }

  public AbstractHCTable (@Nullable final HCCol aCol)
  {
    this ();
    addColumn (aCol);
  }

  public AbstractHCTable (@Nullable final HCCol... aCols)
  {
    this ();
    addColumns (aCols);
  }

  public AbstractHCTable (@Nullable final Iterable <HCCol> aCols)
  {
    this ();
    addColumns (aCols);
  }

  public boolean hasChildren ()
  {
    return m_aHeaderRow != null || !m_aBodyRows.isEmpty () || m_aFooterRow != null;
  }

  @Nonnegative
  public int getChildCount ()
  {
    return (m_aHeaderRow != null ? 1 : 0) + m_aBodyRows.size () + (m_aFooterRow != null ? 1 : 0);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getChildren ()
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

  @Nonnull
  public final THISTYPE setCellSpacing (final int nCellSpacing)
  {
    m_nCellSpacing = nCellSpacing;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setCellPadding (final int nCellPadding)
  {
    m_nCellPadding = nCellPadding;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setHeaderID (@Nullable final String sID)
  {
    m_sHeaderID = sID;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setBodyID (@Nullable final String sID)
  {
    m_sBodyID = sID;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setFooterID (@Nullable final String sID)
  {
    m_sFooterID = sID;
    return thisAsT ();
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

  public final HCColGroup getColGroup ()
  {
    return m_aColGroup;
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
   * Remove all column definitions. This does not affect any row contents.
   * 
   * @return this
   */
  @Nonnull
  public final THISTYPE clearColumns ()
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

  @Nonnull
  public final HCRow addHeaderRow ()
  {
    if (m_aHeaderRow != null)
      throw new IllegalStateException ("A header row is already present! You cannot have more than one!");
    m_aHeaderRow = new HCRow (true);
    return m_aHeaderRow;
  }

  @Nonnull
  public final HCRow addFooterRow ()
  {
    if (m_aFooterRow != null)
      throw new IllegalStateException ("A footer row is already present! You cannot have more than one!");
    m_aFooterRow = new HCRow (true);
    return m_aFooterRow;
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

  public final boolean hasHeaderRow ()
  {
    return m_aHeaderRow != null;
  }

  public final boolean hasFooterRow ()
  {
    return m_aFooterRow != null;
  }

  public final boolean hasBodyRows ()
  {
    return !m_aBodyRows.isEmpty ();
  }

  public final int getBodyRowCount ()
  {
    return m_aBodyRows.size ();
  }

  public final int getCellPadding ()
  {
    return m_nCellPadding;
  }

  public final int getCellSpacing ()
  {
    return m_nCellSpacing;
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
  public HCRow getHeaderRow ()
  {
    return m_aHeaderRow;
  }

  @Nullable
  public HCRow getFooterRow ()
  {
    return m_aFooterRow;
  }

  @Nullable
  public HCRow getLastBodyRow ()
  {
    return ContainerHelper.getLastElement (m_aBodyRows);
  }

  protected void applyHeaderRow (final IMicroElement aTHead,
                                 final HCRow aRow,
                                 @Nonnull final HCConversionSettings aConversionSettings)
  {
    aTHead.appendChild (aRow.getAsNode (aConversionSettings));
  }

  protected void applyFooterRow (final IMicroElement aTFoot,
                                 final HCRow aRow,
                                 @Nonnull final HCConversionSettings aConversionSettings)
  {
    aTFoot.appendChild (aRow.getAsNode (aConversionSettings));
  }

  protected void applyBodyRow (final IMicroElement aTBody,
                               final HCRow aRow,
                               @Nonnull final HCConversionSettings aConversionSettings)
  {
    aTBody.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @Override
  protected boolean canConvertToNode ()
  {
    // Avoid creating a table without header, body and footer
    return m_aHeaderRow != null || !m_aBodyRows.isEmpty () || m_sBodyID != null || m_aFooterRow != null;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    applyProperties (aElement, true, false, aConversionSettings);
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

  private static int _getEffectiveCellCount (@Nonnull final HCRow aRow, @Nullable final List <int []> aRowSpans)
  {
    int nCellIndex = 0;
    for (final AbstractHCCell aCell : aRow.getChildren ())
      nCellIndex += _getApplicableRowspan (nCellIndex, aRowSpans) + aCell.getColspan ();
    // Any rowspan after the last cell?
    nCellIndex += _getApplicableRowspan (nCellIndex, aRowSpans);
    return nCellIndex;
  }

  @OverrideOnDemand
  protected void onTableInconsistency (final String sMsg)
  {
    s_aLogger.warn ("Table inconsistency (" + getID () + "): " + sMsg);
  }

  private void _checkInternalConsistency ()
  {
    int nCols = 0;
    if (m_aColGroup != null)
      nCols = m_aColGroup.getColumnCount ();
    if (nCols == 0 && m_aHeaderRow != null)
      nCols = m_aHeaderRow.getEffectiveCellCount ();
    if (nCols == 0 && !m_aBodyRows.isEmpty ())
      nCols = m_aBodyRows.get (0).getEffectiveCellCount ();
    if (nCols == 0 && m_aFooterRow != null)
      nCols = m_aFooterRow.getEffectiveCellCount ();

    if (m_aHeaderRow != null)
    {
      final int nRowCols = m_aHeaderRow.getEffectiveCellCount ();
      if (nRowCols != nCols)
        onTableInconsistency ("header row has " + nRowCols + " cells but was expecting " + nCols + " cells");
    }
    int nRowIndex = 0;
    boolean bTotalHasRowSpans = false;
    final List <int []> aTotalRowSpans = new ArrayList <int []> (m_aBodyRows.size ());
    for (final HCRow aBodyRow : m_aBodyRows)
    {
      // Pass null if no row spans are defined!
      final int nRowCols = _getEffectiveCellCount (aBodyRow, bTotalHasRowSpans ? aTotalRowSpans : null);
      if (nRowCols != nCols)
        onTableInconsistency ("body row #" +
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
    if (m_aFooterRow != null)
    {
      final int nRowCols = m_aFooterRow.getEffectiveCellCount ();
      if (nRowCols != nCols)
        onTableInconsistency ("footer row has " + nRowCols + " cells but was expecting " + nCols + " cells");
    }
  }

  protected void applyProperties (final IMicroElement aElement,
                                  final boolean bApplyStructure,
                                  final boolean bSkipUniqueProperties,
                                  @Nonnull final HCConversionSettings aConversionSettings)
  {
    if (GlobalDebug.isDebugMode ())
      _checkInternalConsistency ();

    super.applyProperties (aElement, bSkipUniqueProperties, aConversionSettings);
    if (bApplyStructure)
    {
      if (m_nCellSpacing >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLSPACING, Integer.toString (m_nCellSpacing));
      if (m_nCellPadding >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLPADDING, Integer.toString (m_nCellPadding));
      if (m_aColGroup != null && m_aColGroup.hasColumns ())
        aElement.appendChild (m_aColGroup.getAsNode (aConversionSettings));
      if (m_aHeaderRow != null)
      {
        final IMicroElement aTHead = aElement.appendElement (EHTMLElement.THEAD.getElementName ());
        if (StringHelper.hasText (m_sHeaderID))
          aTHead.setAttribute (CHTMLAttributes.ID, m_sHeaderID);
        applyHeaderRow (aTHead, m_aHeaderRow, aConversionSettings);
      }
      if (m_aFooterRow != null)
      {
        final IMicroElement aTFoot = aElement.appendElement (EHTMLElement.TFOOT.getElementName ());
        if (StringHelper.hasText (m_sFooterID))
          aTFoot.setAttribute (CHTMLAttributes.ID, m_sFooterID);
        applyFooterRow (aTFoot, m_aFooterRow, aConversionSettings);
      }

      // add the tbody anyway - helpful for JS tables
      // Required by XHTML 1.1
      if (m_aBodyRows.isEmpty ())
        s_aLogger.warn ("Tables without body rows are prohibited by XHTML 1.1!");
      final IMicroElement aTBody = aElement.appendElement (EHTMLElement.TBODY.getElementName ());
      if (StringHelper.hasText (m_sBodyID))
        aTBody.setAttribute (CHTMLAttributes.ID, m_sBodyID);

      // bug fix for IE9 table layout bug
      // (http://msdn.microsoft.com/en-us/library/ms531161%28v=vs.85%29.aspx)
      // IE9 only interprets column widths if the first row does not use colspan
      // (i.e. at least one row does not use colspan)
      if (m_aColGroup != null)
      {
        final HCRow aFirstRow = m_aBodyRows.get (0);
        boolean bFirstRowUsesColSpan = false;
        for (int i = 0; i < aFirstRow.getCellCount (); i++)
        {
          final AbstractHCCell aCell = aFirstRow.getCellAtIndex (i);
          if (aCell.getColspan () > 1)
          {
            bFirstRowUsesColSpan = true;
            break;
          }
        }
        if (bFirstRowUsesColSpan)
        {
          final HCRow aRow = new HCRow (false);
          aRow.addClass (CSS_FORCE_COLSPAN);
          for (final HCCol aCol : m_aColGroup.getColumns ())
          {
            final AbstractHCCell aCell = aRow.addAndReturnCell (HCEntityNode.newNBSP ());
            final int nWidth = StringHelper.parseInt (aCol.getWidth (), -1);
            if (nWidth >= 0)
              aCell.addStyle (CCSSProperties.WIDTH.newValue (CCSS.px (nWidth)));
          }
          applyBodyRow (aTBody, aRow, aConversionSettings);
        }
      }

      for (final HCRow aRow : m_aBodyRows)
        applyBodyRow (aTBody, aRow, aConversionSettings);
    }
  }

  @Nonnull
  public String getPlainText ()
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
  @Nullable
  public IHCBaseNode getOutOfBandNode ()
  {
    final HCNodeList aCont = new HCNodeList ();
    if (m_aHeaderRow != null)
      aCont.addChild (m_aHeaderRow.getOutOfBandNode ());
    for (final HCRow aBodyRow : m_aBodyRows)
      aCont.addChild (aBodyRow.getOutOfBandNode ());
    if (m_aFooterRow != null)
      aCont.addChild (m_aFooterRow.getOutOfBandNode ());
    return aCont.getAsSimpleNode ();
  }
}
