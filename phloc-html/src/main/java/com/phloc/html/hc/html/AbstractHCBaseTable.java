/**
 * Copyright (C) 2006-2015 phloc systems
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
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.CGlobal;
import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.annotations.ReturnsMutableObject;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.ECSSUnit;
import com.phloc.css.property.ECSSProperty;
import com.phloc.css.propertyvalue.CCSSValue;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.DefaultCSSClassProvider;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCCell;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCTable;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.hc.impl.HCTextNode;

/**
 * This is the common base class for regular HC tables as well as for more
 * complex constructs (e.g. PUI)
 * 
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
public abstract class AbstractHCBaseTable <IMPLTYPE extends AbstractHCBaseTable <IMPLTYPE>> extends AbstractHCElement <IMPLTYPE> implements IHCTable <IMPLTYPE>
{
  private HCColGroup m_aColGroup;
  private int m_nCellSpacing = CGlobal.ILLEGAL_UINT;
  private int m_nCellPadding = CGlobal.ILLEGAL_UINT;

  private HCTHead m_aHead = new HCTHead ();
  private HCTBody m_aBody = new HCTBody ();
  private HCTFoot m_aFoot = new HCTFoot ();

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

  /**
   * @return The table header. Never <code>null</code>.
   */
  @Nonnull
  public final HCTHead getHead ()
  {
    return this.m_aHead;
  }

  @Nonnull
  public final IMPLTYPE setHead (@Nonnull final HCTHead aHead)
  {
    this.m_aHead = ValueEnforcer.notNull (aHead, "Head");
    return thisAsT ();
  }

  /**
   * @return The table body. Never <code>null</code>.
   */
  @Nonnull
  public final HCTBody getBody ()
  {
    return this.m_aBody;
  }

  @Nonnull
  public final IMPLTYPE setBody (@Nonnull final HCTBody aBody)
  {
    this.m_aBody = ValueEnforcer.notNull (aBody, "Body");
    return thisAsT ();
  }

  /**
   * @return The table footer. Never <code>null</code>.
   */
  @Nonnull
  public final HCTFoot getFoot ()
  {
    return this.m_aFoot;
  }

  @Nonnull
  public final IMPLTYPE setFoot (@Nonnull final HCTFoot aFoot)
  {
    this.m_aFoot = ValueEnforcer.notNull (aFoot, "Foot");
    return thisAsT ();
  }

  @Override
  public final boolean hasChildren ()
  {
    return this.m_aHead.hasChildren () || this.m_aBody.hasChildren () || this.m_aFoot.hasChildren ();
  }

  @Override
  @Nonnegative
  public final int getChildCount ()
  {
    return this.m_aHead.getChildCount () + this.m_aBody.getChildCount () + this.m_aFoot.getChildCount ();
  }

  @Override
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

  @Override
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

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final List <IHCNode> getChildren ()
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    ret.addAll (this.m_aHead.getChildren ());
    ret.addAll (this.m_aBody.getChildren ());
    ret.addAll (this.m_aFoot.getChildren ());
    return ret;
  }

  @Override
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

  @Override
  public final int getCellSpacing ()
  {
    return this.m_nCellSpacing;
  }

  @Override
  @Nonnull
  public final IMPLTYPE setCellSpacing (final int nCellSpacing)
  {
    this.m_nCellSpacing = nCellSpacing;
    return thisAsT ();
  }

  @Override
  public final int getCellPadding ()
  {
    return this.m_nCellPadding;
  }

  @Override
  @Nonnull
  public final IMPLTYPE setCellPadding (final int nCellPadding)
  {
    this.m_nCellPadding = nCellPadding;
    return thisAsT ();
  }

  //
  // column handling
  //

  @Override
  @Nullable
  public final HCColGroup getColGroup ()
  {
    return this.m_aColGroup;
  }

  @Override
  @Nonnull
  public final IMPLTYPE addColumn (@Nullable final HCCol aCol)
  {
    if (aCol != null)
    {
      if (this.m_aColGroup == null)
        this.m_aColGroup = new HCColGroup ();
      this.m_aColGroup.addColumn (aCol);
    }
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addColumn (@Nonnegative final int nIndex, @Nullable final HCCol aCol)
  {
    if (aCol != null)
    {
      if (this.m_aColGroup == null)
        this.m_aColGroup = new HCColGroup ();
      this.m_aColGroup.addColumn (nIndex, aCol);
    }
    return thisAsT ();
  }

  @Override
  @Nonnull
  @Deprecated
  public final IMPLTYPE addColumns (@Nullable final HCCol aCol)
  {
    return addColumn (aCol);
  }

  @Override
  @Nonnull
  public final IMPLTYPE addColumns (@Nullable final HCCol... aCols)
  {
    if (aCols != null)
      for (final HCCol aCol : aCols)
        addColumn (aCol);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addColumns (@Nullable final Iterable <? extends HCCol> aCols)
  {
    if (aCols != null)
      for (final HCCol aCol : aCols)
        addColumn (aCol);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeColumnAtIndex (@Nonnegative final int nColumnIndex)
  {
    if (this.m_aColGroup != null)
      this.m_aColGroup.removeColumnAtIndex (nColumnIndex);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeAllColumns ()
  {
    this.m_aColGroup = null;
    return thisAsT ();
  }

  @Override
  @Nonnegative
  public final int getColumnCount ()
  {
    return this.m_aColGroup == null ? 0 : this.m_aColGroup.getColumnCount ();
  }

  //
  // header row handling
  //

  @Override
  @Nullable
  public final String getHeaderID ()
  {
    return this.m_aHead.getID ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE setHeaderID (@Nullable final String sID)
  {
    this.m_aHead.setID (sID);
    return thisAsT ();
  }

  @Override
  public final boolean hasHeaderID ()
  {
    return this.m_aHead.hasID ();
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final Set <ICSSClassProvider> getAllHeaderClasses ()
  {
    return this.m_aHead.getAllClasses ();
  }

  @Override
  @Nonnull
  public final String getAllHeaderClassesAsString ()
  {
    return this.m_aHead.getAllClassesAsString ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addHeaderClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    this.m_aHead.addClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeHeaderClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    this.m_aHead.removeClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Override
  public final boolean hasHeaderClasses ()
  {
    return this.m_aHead.hasAnyClass ();
  }

  @Override
  public final boolean hasHeaderRows ()
  {
    return this.m_aHead.hasChildren ();
  }

  @Override
  @Nonnegative
  public final int getHeaderRowCount ()
  {
    return this.m_aHead.getChildCount ();
  }

  /**
   * Get the contained list object that holds all the rows. Handle with care
   * because it alters the internal data structures of this table.
   * 
   * @return The contained list object for external row order handling.
   */
  @Nullable
  @ReturnsMutableObject (reason = "For performance reasons in derived classes")
  protected final List <HCRow> directGetHeaderRowList ()
  {
    return this.m_aHead.directGetRowList ();
  }

  @Override
  @Nullable
  public final HCRow getFirstHeaderRow ()
  {
    return this.m_aHead.getFirstChild ();
  }

  @Override
  @Nullable
  public final HCRow getHeaderRowAtIndex (@Nonnegative final int nIndex)
  {
    return this.m_aHead.getChildAtIndex (nIndex);
  }

  @Override
  @Nullable
  public final HCRow getLastHeaderRow ()
  {
    return this.m_aHead.getLastChild ();
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllHeaderRows ()
  {
    return this.m_aHead.getChildren ();
  }

  @Override
  @Nonnull
  public final HCRow addHeaderRow ()
  {
    return this.m_aHead.addRow ();
  }

  @Override
  @Nonnull
  public final HCRow addHeaderRow (@Nonnegative final int nIndex)
  {
    return this.m_aHead.addRow (nIndex);
  }

  @Override
  @Nonnull
  public final IMPLTYPE addHeaderRow (@Nullable final HCRow aRow)
  {
    this.m_aHead.addChild (aRow);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addHeaderRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    this.m_aHead.addChild (nIndex, aRow);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeHeaderRowAtIndex (@Nonnegative final int nIndex)
  {
    this.m_aHead.removeChild (nIndex);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeAllHeaderRows ()
  {
    this.m_aHead.removeAllChildren ();
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE sortAllHeaderRows (@Nonnull final Comparator <? super HCRow> aComparator)
  {
    this.m_aHead.sortAllChildren (aComparator);
    return thisAsT ();
  }

  //
  // footer row handling
  //
  @Override
  @Nullable
  public final String getFooterID ()
  {
    return this.m_aFoot.getID ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE setFooterID (@Nullable final String sID)
  {
    this.m_aFoot.setID (sID);
    return thisAsT ();
  }

  @Override
  public final boolean hasFooterID ()
  {
    return this.m_aFoot.hasID ();
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final Set <ICSSClassProvider> getAllFooterClasses ()
  {
    return this.m_aFoot.getAllClasses ();
  }

  @Override
  @Nonnull
  public final String getAllFooterClassesAsString ()
  {
    return this.m_aFoot.getAllClassesAsString ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addFooterClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    this.m_aFoot.addClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeFooterClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    this.m_aFoot.removeClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Override
  public final boolean hasFooterClasses ()
  {
    return this.m_aFoot.hasAnyClass ();
  }

  @Override
  public final boolean hasFooterRows ()
  {
    return this.m_aFoot.hasChildren ();
  }

  @Override
  @Nonnegative
  public final int getFooterRowCount ()
  {
    return this.m_aFoot.getChildCount ();
  }

  /**
   * Get the contained list object that holds all the rows. Handle with care
   * because it alters the internal data structures of this table.
   * 
   * @return The contained list object for external row order handling.
   */
  @Nullable
  @ReturnsMutableObject (reason = "For performance reasons in derived classes")
  protected final List <HCRow> directGetFooterRowList ()
  {
    return this.m_aFoot.directGetRowList ();
  }

  @Override
  @Nullable
  public final HCRow getFirstFooterRow ()
  {
    return this.m_aFoot.getFirstChild ();
  }

  @Override
  @Nullable
  public final HCRow getFooterRowAtIndex (@Nonnegative final int nIndex)
  {
    return this.m_aFoot.getChildAtIndex (nIndex);
  }

  @Override
  @Nullable
  public final HCRow getLastFooterRow ()
  {
    return this.m_aFoot.getLastChild ();
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllFooterRows ()
  {
    return this.m_aFoot.getChildren ();
  }

  @Override
  @Nonnull
  public final HCRow addFooterRow ()
  {
    return this.m_aFoot.addRow ();
  }

  @Override
  @Nonnull
  public final HCRow addFooterRow (@Nonnegative final int nIndex)
  {
    return this.m_aFoot.addRow (nIndex);
  }

  @Override
  @Nonnull
  public final IMPLTYPE addFooterRow (@Nullable final HCRow aRow)
  {
    this.m_aFoot.addChild (aRow);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addFooterRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    this.m_aFoot.addChild (nIndex, aRow);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeFooterRowAtIndex (@Nonnegative final int nIndex)
  {
    this.m_aFoot.removeChild (nIndex);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeAllFooterRows ()
  {
    this.m_aFoot.removeAllChildren ();
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE sortAllFooterRows (@Nonnull final Comparator <? super HCRow> aComparator)
  {
    this.m_aFoot.sortAllChildren (aComparator);
    return thisAsT ();
  }

  //
  // body row handling
  //

  @Override
  @Nullable
  public final String getBodyID ()
  {
    return this.m_aBody.getID ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE setBodyID (@Nullable final String sID)
  {
    this.m_aBody.setID (sID);
    return thisAsT ();
  }

  @Override
  public final boolean hasBodyID ()
  {
    return this.m_aBody.hasID ();
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final Set <ICSSClassProvider> getAllBodyClasses ()
  {
    return this.m_aBody.getAllClasses ();
  }

  @Override
  @Nonnull
  public final String getAllBodyClassesAsString ()
  {
    return this.m_aBody.getAllClassesAsString ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addBodyClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    this.m_aBody.addClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeBodyClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    this.m_aBody.removeClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Override
  public final boolean hasBodyClasses ()
  {
    return this.m_aBody.hasAnyClass ();
  }

  @Override
  public final boolean hasBodyRows ()
  {
    return this.m_aBody.hasChildren ();
  }

  @Override
  @Nonnegative
  public final int getBodyRowCount ()
  {
    return this.m_aBody.getChildCount ();
  }

  /**
   * Get the contained list object that holds all the rows. Handle with care
   * because it alters the internal data structures of this table.
   * 
   * @return The contained list object for external row order handling.
   */
  @Nullable
  @ReturnsMutableObject (reason = "For performance reasons in derived classes")
  protected final List <HCRow> directGetBodyRowList ()
  {
    return this.m_aBody.directGetRowList ();
  }

  @Override
  @Nullable
  public final HCRow getFirstBodyRow ()
  {
    return this.m_aBody.getFirstChild ();
  }

  @Override
  @Nullable
  public final HCRow getBodyRowAtIndex (@Nonnegative final int nIndex)
  {
    return this.m_aBody.getChildAtIndex (nIndex);
  }

  @Override
  @Nullable
  public final HCRow getLastBodyRow ()
  {
    return this.m_aBody.getLastChild ();
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllBodyRows ()
  {
    return this.m_aBody.getChildren ();
  }

  @Override
  @Nonnull
  public final HCRow addBodyRow ()
  {
    return this.m_aBody.addRow ();
  }

  @Override
  @Nonnull
  public final HCRow addBodyRow (@Nonnegative final int nIndex)
  {
    return this.m_aBody.addRow (nIndex);
  }

  @Override
  @Nonnull
  public final IMPLTYPE addBodyRow (@Nullable final HCRow aRow)
  {
    this.m_aBody.addChild (aRow);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE addBodyRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    this.m_aBody.addChild (nIndex, aRow);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeBodyRowAtIndex (@Nonnegative final int nIndex)
  {
    this.m_aBody.removeChild (nIndex);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE removeAllBodyRows ()
  {
    this.m_aBody.removeAllChildren ();
    return thisAsT ();
  }

  @Override
  @Nonnull
  public final IMPLTYPE sortAllBodyRows (@Nonnull final Comparator <? super HCRow> aComparator)
  {
    this.m_aBody.sortAllChildren (aComparator);
    return thisAsT ();
  }

  @Override
  @Nonnull
  public IMPLTYPE setSpanningHeaderContent (@Nullable final String sText)
  {
    return setSpanningHeaderContent (HCTextNode.createOnDemand (sText));
  }

  @Override
  @Nonnull
  public IMPLTYPE setSpanningHeaderContent (@Nullable final IHCNode aNode)
  {
    removeAllHeaderRows ();
    return addSpanningHeaderContent (aNode);
  }

  @Override
  @Nonnull
  public IMPLTYPE addSpanningHeaderContent (@Nullable final String sText)
  {
    return addSpanningHeaderContent (HCTextNode.createOnDemand (sText));
  }

  @Override
  @Nonnull
  public IMPLTYPE addSpanningHeaderContent (@Nullable final IHCNode aNode)
  {
    addHeaderRow ().addAndReturnCell (aNode).setColspan (getColumnCount ());
    return thisAsT ();
  }

  @Override
  @Nonnull
  public IMPLTYPE addSpanningBodyContent (@Nullable final String sText)
  {
    return addSpanningBodyContent (HCTextNode.createOnDemand (sText));
  }

  @Override
  @Nonnull
  public IMPLTYPE addSpanningBodyContent (@Nullable final IHCNode aNode)
  {
    addBodyRow ().addAndReturnCell (aNode).setColspan (getColumnCount ());
    return thisAsT ();
  }

  @Override
  @Nonnull
  public IMPLTYPE setSpanningFooterContent (@Nullable final String sText)
  {
    return setSpanningFooterContent (HCTextNode.createOnDemand (sText));
  }

  @Override
  @Nonnull
  public IMPLTYPE setSpanningFooterContent (@Nullable final IHCNode aNode)
  {
    removeAllFooterRows ();
    return addSpanningFooterContent (aNode);
  }

  @Override
  @Nonnull
  public IMPLTYPE addSpanningFooterContent (@Nullable final String sText)
  {
    return addSpanningFooterContent (HCTextNode.createOnDemand (sText));
  }

  @Override
  @Nonnull
  public IMPLTYPE addSpanningFooterContent (@Nullable final IHCNode aNode)
  {
    addFooterRow ().addAndReturnCell (aNode).setColspan (getColumnCount ());
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
    return this.m_aBody.canConvertToNode (aConversionSettings) ||
           this.m_aHead.canConvertToNode (aConversionSettings) ||
           this.m_aFoot.canConvertToNode (aConversionSettings);
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
    for (final IHCCell <?> aCell : aRow.getChildren ())
      nCellIndex += _getApplicableRowspan (nCellIndex, aRowSpans) + aCell.getColspan ();
    // Any rowspan after the last cell?
    nCellIndex += _getApplicableRowspan (nCellIndex, aRowSpans);
    return nCellIndex;
  }

  private static void _checkConsistency (@Nonnull final String sContext,
                                         @Nonnull final AbstractHCTablePart <?> aPart,
                                         @Nonnegative final int nCols)
  {
    int nRowIndex = 0;
    boolean bTotalHasRowSpans = false;
    final List <int []> aTotalRowSpans = new ArrayList <int []> (aPart.getChildCount ());
    if (aPart.hasChildren ())
      for (final HCRow aBodyRow : aPart.directGetRowList ())
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
          for (final IHCCell <?> aCell : aBodyRow.getChildren ())
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
    if (nCols == 0 && aBaseTable.m_aHead.hasChildren ())
      nCols = aBaseTable.m_aHead.getFirstChild ().getEffectiveCellCount ();
    if (nCols == 0 && aBaseTable.m_aBody.hasChildren ())
      nCols = aBaseTable.m_aBody.getFirstChild ().getEffectiveCellCount ();
    if (nCols == 0 && aBaseTable.m_aFoot.hasChildren ())
      nCols = aBaseTable.m_aFoot.getFirstChild ().getEffectiveCellCount ();

    String sPrefix = "Table";
    if (StringHelper.hasText (aBaseTable.getID ()))
      sPrefix += " with ID " + aBaseTable.getID ();
    _checkConsistency (sPrefix + " header", aBaseTable.m_aHead, nCols);
    _checkConsistency (sPrefix + " body", aBaseTable.m_aBody, nCols);
    _checkConsistency (sPrefix + " footer", aBaseTable.m_aFoot, nCols);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Propagate to children
    if (this.m_aHead.hasChildren ())
      for (final HCRow aHeaderRow : this.m_aHead.directGetRowList ())
        aHeaderRow.beforeConvertToNode (aConversionSettings);
    if (this.m_aBody.hasChildren ())
      for (final HCRow aBodyRow : this.m_aBody.directGetRowList ())
        aBodyRow.beforeConvertToNode (aConversionSettings);
    if (this.m_aFoot.hasChildren ())
      for (final HCRow aFooterRow : this.m_aFoot.directGetRowList ())
        aFooterRow.beforeConvertToNode (aConversionSettings);

    if (aConversionSettings.getHTMLVersion ().isAtLeastHTML5 ())
    {
      if (getCellSpacing () == 0)
      {
        addStyle (ECSSProperty.BORDER_SPACING, ECSSUnit.px (0));
        addStyle (ECSSProperty.BORDER_COLLAPSE, CCSSValue.COLLAPSE);
      }
      else
        if (getCellSpacing () > 0)
        {
          addStyle (ECSSProperty.BORDER_SPACING, ECSSUnit.px (getCellSpacing ()));
          addStyle (ECSSProperty.BORDER_COLLAPSE, CCSSValue.SEPARATE);
        }
      if (getCellPadding () == 0)
      {
        addClass (DefaultCSSClassProvider.create ("no-cell-padding"));
        addStyle (ECSSProperty.PADDING, ECSSUnit.px (0));
      }
      else
        if (getCellPadding () > 0)
        {
          addStyle (ECSSProperty.PADDING, ECSSUnit.px (getCellPadding ()));
        }
    }

  }

  @Override
  @Nonnull
  public final String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    ret.append (this.m_aHead.getPlainText ());
    ret.append (this.m_aBody.getPlainText ());
    ret.append (this.m_aFoot.getPlainText ());
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("colGroup", this.m_aColGroup)
                            .append ("cellSpacing", this.m_nCellSpacing)
                            .append ("cellPadding", this.m_nCellPadding)
                            .append ("header", this.m_aHead)
                            .append ("body", this.m_aBody)
                            .append ("footer", this.m_aFoot)
                            .toString ();
  }
}
