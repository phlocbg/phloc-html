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
import com.phloc.html.hc.IHCTable;
import com.phloc.html.hc.IHCCell;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.hc.impl.HCTextNode;

/**
 * This is the common base class for regular HC tables as well as for more
 * complex constructs (e.g. PUI)
 * 
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCBaseTable <THISTYPE extends AbstractHCBaseTable <THISTYPE>> extends AbstractHCElement <THISTYPE> implements IHCTable <THISTYPE>
{
  private static final class RowSet
  {
    private final boolean m_bHeader;
    private final List <HCRow> m_aRows = new ArrayList <HCRow> ();
    private String m_sID;
    private List <ICSSClassProvider> m_aClasses;

    public RowSet (final boolean bHeader)
    {
      m_bHeader = bHeader;
    }

    @Nullable
    public String getID ()
    {
      return m_sID;
    }

    public void setID (@Nullable final String sID)
    {
      m_sID = sID;
    }

    /**
     * @return <code>true</code> if a ID is present, <code>false</code>
     *         otherwise
     */
    public boolean hasID ()
    {
      return StringHelper.hasText (m_sID);
    }

    @Nonnull
    @ReturnsMutableCopy
    public List <ICSSClassProvider> getAllClasses ()
    {
      return ContainerHelper.newList (m_aClasses);
    }

    @Nonnull
    public String getAllClassesAsString ()
    {
      if (m_aClasses == null || m_aClasses.isEmpty ())
        return "";
      final StringBuilder aSB = new StringBuilder ();
      for (final ICSSClassProvider aCSSClass : m_aClasses)
      {
        if (aSB.length () > 0)
          aSB.append (' ');
        aSB.append (aCSSClass.getCSSClass ());
      }
      return aSB.toString ();
    }

    public void addClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
    {
      if (aCSSClassProvider == null)
        throw new NullPointerException ("CSSClassProvider");

      if (m_aClasses == null)
        m_aClasses = new ArrayList <ICSSClassProvider> ();
      m_aClasses.add (aCSSClassProvider);
    }

    public void removeClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
    {
      if (m_aClasses != null)
        m_aClasses.remove (aCSSClassProvider);
    }

    public boolean hasClasses ()
    {
      return ContainerHelper.isNotEmpty (m_aClasses);
    }

    public boolean hasRows ()
    {
      return !m_aRows.isEmpty ();
    }

    @Nonnegative
    public int getRowCount ()
    {
      return m_aRows.size ();
    }

    /**
     * Get the contained list object that holds all the rows. Handle with care
     * because it alters the internal data structures of this table.
     * 
     * @return The contained list object for external row order handling.
     */
    @Nonnull
    @ReturnsMutableObject (reason = "For performance reasons in derived classes")
    protected List <HCRow> directGetRowList ()
    {
      return m_aRows;
    }

    @Nullable
    public HCRow getFirstRow ()
    {
      return ContainerHelper.getFirstElement (m_aRows);
    }

    @Nullable
    public HCRow getRowAtIndex (@Nonnegative final int nIndex)
    {
      return ContainerHelper.getSafe (m_aRows, nIndex);
    }

    @Nullable
    public HCRow getLastRow ()
    {
      return ContainerHelper.getLastElement (m_aRows);
    }

    @Nonnull
    @ReturnsMutableCopy
    public List <HCRow> getAllRows ()
    {
      return ContainerHelper.newList (m_aRows);
    }

    @Nonnull
    public HCRow addRow ()
    {
      final HCRow ret = new HCRow (m_bHeader);
      m_aRows.add (ret);
      return ret;
    }

    @Nonnull
    public HCRow addRow (@Nonnegative final int nIndex)
    {
      final HCRow ret = new HCRow (m_bHeader);
      m_aRows.add (nIndex, ret);
      return ret;
    }

    public void addRow (@Nullable final HCRow aRow)
    {
      if (aRow != null)
        m_aRows.add (aRow);
    }

    public void addRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
    {
      if (aRow != null)
        m_aRows.add (nIndex, aRow);
    }

    public void removeRowAtIndex (@Nonnegative final int nIndex)
    {
      ContainerHelper.removeElementAtIndex (m_aRows, nIndex);
    }

    public void removeAllRows ()
    {
      m_aRows.clear ();
    }

    public void sortAllRows (@Nonnull final Comparator <? super HCRow> aComparator)
    {
      if (aComparator == null)
        throw new NullPointerException ("comparator");
      Collections.sort (m_aRows, aComparator);
    }

    public boolean canConvertToNode ()
    {
      return hasRows () || hasID () || hasClasses ();
    }

    public StringBuilder getPlainText ()
    {
      final StringBuilder ret = new StringBuilder ();
      for (final HCRow aRow : m_aRows)
        ret.append (aRow.getPlainText ()).append (' ');
      return ret;
    }

    @Override
    public String toString ()
    {
      return new ToStringGenerator (this).append ("rows", m_aRows)
                                         .appendIfNotNull ("ID", m_sID)
                                         .appendIfNotNull ("classes", m_aClasses)
                                         .toString ();
    }
  }

  private HCColGroup m_aColGroup;
  private int m_nCellSpacing = CGlobal.ILLEGAL_UINT;
  private int m_nCellPadding = CGlobal.ILLEGAL_UINT;

  private final RowSet m_aHeader = new RowSet (true);
  private final RowSet m_aBody = new RowSet (false);
  private final RowSet m_aFooter = new RowSet (true);

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
    return m_aHeader.hasRows () || m_aBody.hasRows () || m_aFooter.hasRows ();
  }

  @Nonnegative
  public final int getChildCount ()
  {
    return m_aHeader.getRowCount () + m_aBody.getRowCount () + m_aFooter.getRowCount ();
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
    ret.addAll (m_aHeader.directGetRowList ());
    ret.addAll (m_aBody.directGetRowList ());
    ret.addAll (m_aFooter.directGetRowList ());
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

  @Nonnull
  public final THISTYPE removeColumnAtIndex (@Nonnegative final int nColumnIndex)
  {
    if (m_aColGroup != null)
      m_aColGroup.removeColumnAtIndex (nColumnIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllColumns ()
  {
    m_aColGroup = null;
    return thisAsT ();
  }

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
    return m_aHeader.getID ();
  }

  @Nonnull
  public final THISTYPE setHeaderID (@Nullable final String sID)
  {
    m_aHeader.setID (sID);
    return thisAsT ();
  }

  public final boolean hasHeaderID ()
  {
    return m_aHeader.hasID ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <ICSSClassProvider> getAllHeaderClasses ()
  {
    return m_aHeader.getAllClasses ();
  }

  @Nonnull
  public final String getAllHeaderClassesAsString ()
  {
    return m_aHeader.getAllClassesAsString ();
  }

  @Nonnull
  public final THISTYPE addHeaderClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    m_aHeader.addClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeHeaderClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    m_aHeader.removeClass (aCSSClassProvider);
    return thisAsT ();
  }

  public final boolean hasHeaderClasses ()
  {
    return m_aHeader.hasClasses ();
  }

  public final boolean hasHeaderRows ()
  {
    return m_aHeader.hasRows ();
  }

  @Nonnegative
  public final int getHeaderRowCount ()
  {
    return m_aHeader.getRowCount ();
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
    return m_aHeader.directGetRowList ();
  }

  @Nullable
  public final HCRow getFirstHeaderRow ()
  {
    return m_aHeader.getFirstRow ();
  }

  @Nullable
  public final HCRow getHeaderRowAtIndex (@Nonnegative final int nIndex)
  {
    return m_aHeader.getRowAtIndex (nIndex);
  }

  @Nullable
  public final HCRow getLastHeaderRow ()
  {
    return m_aHeader.getLastRow ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllHeaderRows ()
  {
    return m_aHeader.getAllRows ();
  }

  @Nonnull
  public final HCRow addHeaderRow ()
  {
    return m_aHeader.addRow ();
  }

  @Nonnull
  public final HCRow addHeaderRow (@Nonnegative final int nIndex)
  {
    return m_aHeader.addRow (nIndex);
  }

  @Nonnull
  public final THISTYPE addHeaderRow (@Nullable final HCRow aRow)
  {
    m_aHeader.addRow (aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addHeaderRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    m_aHeader.addRow (nIndex, aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeHeaderRowAtIndex (@Nonnegative final int nIndex)
  {
    m_aHeader.removeRowAtIndex (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllHeaderRows ()
  {
    m_aHeader.removeAllRows ();
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE sortAllHeaderRows (@Nonnull final Comparator <? super HCRow> aComparator)
  {
    m_aHeader.sortAllRows (aComparator);
    return thisAsT ();
  }

  //
  // footer row handling
  //
  @Nullable
  public final String getFooterID ()
  {
    return m_aFooter.getID ();
  }

  @Nonnull
  public final THISTYPE setFooterID (@Nullable final String sID)
  {
    m_aFooter.setID (sID);
    return thisAsT ();
  }

  public final boolean hasFooterID ()
  {
    return m_aFooter.hasID ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <ICSSClassProvider> getAllFooterClasses ()
  {
    return m_aFooter.getAllClasses ();
  }

  @Nonnull
  public final String getAllFooterClassesAsString ()
  {
    return m_aFooter.getAllClassesAsString ();
  }

  @Nonnull
  public final THISTYPE addFooterClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    m_aFooter.addClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeFooterClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    m_aFooter.removeClass (aCSSClassProvider);
    return thisAsT ();
  }

  public final boolean hasFooterClasses ()
  {
    return m_aFooter.hasClasses ();
  }

  public final boolean hasFooterRows ()
  {
    return m_aFooter.hasRows ();
  }

  @Nonnegative
  public final int getFooterRowCount ()
  {
    return m_aFooter.getRowCount ();
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
    return m_aFooter.directGetRowList ();
  }

  @Nullable
  public final HCRow getFirstFooterRow ()
  {
    return m_aFooter.getFirstRow ();
  }

  @Nullable
  public final HCRow getFooterRowAtIndex (@Nonnegative final int nIndex)
  {
    return m_aFooter.getRowAtIndex (nIndex);
  }

  @Nullable
  public final HCRow getLastFooterRow ()
  {
    return m_aFooter.getLastRow ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllFooterRows ()
  {
    return m_aFooter.getAllRows ();
  }

  @Nonnull
  public final HCRow addFooterRow ()
  {
    return m_aFooter.addRow ();
  }

  @Nonnull
  public final HCRow addFooterRow (@Nonnegative final int nIndex)
  {
    return m_aFooter.addRow (nIndex);
  }

  @Nonnull
  public final THISTYPE addFooterRow (@Nullable final HCRow aRow)
  {
    m_aFooter.addRow (aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addFooterRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    m_aFooter.addRow (nIndex, aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeFooterRowAtIndex (@Nonnegative final int nIndex)
  {
    m_aFooter.removeRowAtIndex (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllFooterRows ()
  {
    m_aFooter.removeAllRows ();
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE sortAllFooterRows (@Nonnull final Comparator <? super HCRow> aComparator)
  {
    m_aFooter.sortAllRows (aComparator);
    return thisAsT ();
  }

  //
  // body row handling
  //

  @Nullable
  public final String getBodyID ()
  {
    return m_aBody.getID ();
  }

  @Nonnull
  public final THISTYPE setBodyID (@Nullable final String sID)
  {
    m_aBody.setID (sID);
    return thisAsT ();
  }

  public final boolean hasBodyID ()
  {
    return m_aBody.hasID ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <ICSSClassProvider> getAllBodyClasses ()
  {
    return m_aBody.getAllClasses ();
  }

  @Nonnull
  public final String getAllBodyClassesAsString ()
  {
    return m_aBody.getAllClassesAsString ();
  }

  @Nonnull
  public final THISTYPE addBodyClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    m_aBody.addClass (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeBodyClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    m_aBody.removeClass (aCSSClassProvider);
    return thisAsT ();
  }

  public final boolean hasBodyClasses ()
  {
    return m_aBody.hasClasses ();
  }

  public final boolean hasBodyRows ()
  {
    return m_aBody.hasRows ();
  }

  @Nonnegative
  public final int getBodyRowCount ()
  {
    return m_aBody.getRowCount ();
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
    return m_aBody.directGetRowList ();
  }

  @Nullable
  public final HCRow getFirstBodyRow ()
  {
    return m_aBody.getFirstRow ();
  }

  @Nullable
  public final HCRow getBodyRowAtIndex (@Nonnegative final int nIndex)
  {
    return m_aBody.getRowAtIndex (nIndex);
  }

  @Nullable
  public final HCRow getLastBodyRow ()
  {
    return m_aBody.getLastRow ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCRow> getAllBodyRows ()
  {
    return m_aBody.getAllRows ();
  }

  @Nonnull
  public final HCRow addBodyRow ()
  {
    return m_aBody.addRow ();
  }

  @Nonnull
  public final HCRow addBodyRow (@Nonnegative final int nIndex)
  {
    return m_aBody.addRow (nIndex);
  }

  @Nonnull
  public final THISTYPE addBodyRow (@Nullable final HCRow aRow)
  {
    m_aBody.addRow (aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addBodyRow (@Nonnegative final int nIndex, @Nullable final HCRow aRow)
  {
    m_aBody.addRow (nIndex, aRow);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeBodyRowAtIndex (@Nonnegative final int nIndex)
  {
    m_aBody.removeRowAtIndex (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllBodyRows ()
  {
    m_aBody.removeAllRows ();
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE sortAllBodyRows (@Nonnull final Comparator <? super HCRow> aComparator)
  {
    m_aBody.sortAllRows (aComparator);
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE setSpanningHeaderContent (@Nullable final String sText)
  {
    return setSpanningHeaderContent (new HCTextNode (sText));
  }

  @Nonnull
  public THISTYPE setSpanningHeaderContent (@Nullable final IHCNode aNode)
  {
    removeAllHeaderRows ();
    return addSpanningHeaderContent (aNode);
  }

  @Nonnull
  public THISTYPE addSpanningHeaderContent (@Nullable final String sText)
  {
    return addSpanningHeaderContent (new HCTextNode (sText));
  }

  @Nonnull
  public THISTYPE addSpanningHeaderContent (@Nullable final IHCNode aNode)
  {
    addHeaderRow ().addAndReturnCell (aNode).setColspan (getColumnCount ());
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE addSpanningBodyContent (@Nullable final String sText)
  {
    return addSpanningBodyContent (new HCTextNode (sText));
  }

  @Nonnull
  public THISTYPE addSpanningBodyContent (@Nullable final IHCNode aNode)
  {
    addBodyRow ().addAndReturnCell (aNode).setColspan (getColumnCount ());
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE setSpanningFooterContent (@Nullable final String sText)
  {
    return setSpanningFooterContent (new HCTextNode (sText));
  }

  @Nonnull
  public THISTYPE setSpanningFooterContent (@Nullable final IHCNode aNode)
  {
    removeAllFooterRows ();
    return addSpanningFooterContent (aNode);
  }

  @Nonnull
  public THISTYPE addSpanningFooterContent (@Nullable final String sText)
  {
    return addSpanningFooterContent (new HCTextNode (sText));
  }

  @Nonnull
  public THISTYPE addSpanningFooterContent (@Nullable final IHCNode aNode)
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
    return m_aBody.canConvertToNode () || m_aHeader.canConvertToNode () || m_aFooter.canConvertToNode ();
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
                                         @Nonnull final RowSet aRows,
                                         @Nonnegative final int nCols)
  {
    int nRowIndex = 0;
    boolean bTotalHasRowSpans = false;
    final List <int []> aTotalRowSpans = new ArrayList <int []> (aRows.getRowCount ());
    for (final HCRow aBodyRow : aRows.directGetRowList ())
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
    if (nCols == 0 && aBaseTable.m_aHeader.hasRows ())
      nCols = aBaseTable.m_aHeader.getFirstRow ().getEffectiveCellCount ();
    if (nCols == 0 && aBaseTable.m_aBody.hasRows ())
      nCols = aBaseTable.m_aBody.getFirstRow ().getEffectiveCellCount ();
    if (nCols == 0 && aBaseTable.m_aFooter.hasRows ())
      nCols = aBaseTable.m_aFooter.getFirstRow ().getEffectiveCellCount ();

    String sPrefix = "Table";
    if (StringHelper.hasText (aBaseTable.getID ()))
      sPrefix += " with ID " + aBaseTable.getID ();
    _checkConsistency (sPrefix + " header", aBaseTable.m_aHeader, nCols);
    _checkConsistency (sPrefix + " body", aBaseTable.m_aBody, nCols);
    _checkConsistency (sPrefix + " footer", aBaseTable.m_aFooter, nCols);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final HCRow aHeaderRow : m_aHeader.directGetRowList ())
      aHeaderRow.beforeConvertToNode (aConversionSettings);
    for (final HCRow aBodyRow : m_aBody.directGetRowList ())
      aBodyRow.beforeConvertToNode (aConversionSettings);
    for (final HCRow aFooterRow : m_aFooter.directGetRowList ())
      aFooterRow.beforeConvertToNode (aConversionSettings);
  }

  @Override
  @Nonnull
  public final String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    ret.append (m_aHeader.getPlainText ());
    ret.append (m_aBody.getPlainText ());
    ret.append (m_aFooter.getPlainText ());
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("colGroup", m_aColGroup)
                            .append ("cellSpacing", m_nCellSpacing)
                            .append ("cellPadding", m_nCellPadding)
                            .append ("header", m_aHeader)
                            .append ("body", m_aBody)
                            .append ("footer", m_aFooter)
                            .toString ();
  }
}
