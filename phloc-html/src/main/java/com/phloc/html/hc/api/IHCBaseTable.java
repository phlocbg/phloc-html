package com.phloc.html.hc.api;

import java.util.Comparator;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.html.HCCol;
import com.phloc.html.hc.html.HCColGroup;
import com.phloc.html.hc.html.HCRow;

/**
 * Base interface for HTML tables
 * 
 * @author Philip Helger
 * @param <THISTYPE>
 */
public interface IHCBaseTable <THISTYPE extends IHCBaseTable <THISTYPE>> extends IHCHasChildren
{
  int getCellSpacing ();

  @Nonnull
  THISTYPE setCellSpacing (int nCellSpacing);

  int getCellPadding ();

  @Nonnull
  THISTYPE setCellPadding (int nCellPadding);

  // Column handling

  @Nullable
  HCColGroup getColGroup ();

  @Nonnull
  THISTYPE addColumn (@Nullable HCCol aCol);

  @Nonnull
  THISTYPE addColumn (@Nonnegative int nIndex, @Nullable HCCol aCol);

  @Nonnull
  THISTYPE addColumns (@Nullable HCCol aCol);

  @Nonnull
  THISTYPE addColumns (@Nullable HCCol... aCols);

  @Nonnull
  THISTYPE addColumns (@Nullable Iterable <? extends HCCol> aCols);

  /**
   * Remove the column definition at the specified index. This does not affect
   * any row contents.
   * 
   * @param nColumnIndex
   *        The index of the column to remove
   * @return this
   */
  @Nonnull
  THISTYPE removeColumnAtIndex (@Nonnegative int nColumnIndex);

  /**
   * Remove all column definitions. This does not affect any row contents.
   * 
   * @return this
   */
  @Nonnull
  THISTYPE removeAllColumns ();

  /**
   * @return The number of columns as specified in the column group. If no
   *         column group is defined, 0 is returned.
   */
  @Nonnegative
  int getColumnCount ();

  // Header rows

  @Nullable
  String getHeaderID ();

  @Nonnull
  THISTYPE setHeaderID (@Nullable String sID);

  /**
   * @return <code>true</code> if a Header ID is present, <code>false</code>
   *         otherwise
   */
  boolean hasHeaderID ();

  @Nonnull
  @ReturnsMutableCopy
  List <ICSSClassProvider> getAllHeaderClasses ();

  @Nonnull
  String getAllHeaderClassesAsString ();

  @Nonnull
  THISTYPE addHeaderClass (@Nonnull ICSSClassProvider aCSSClassProvider);

  @Nonnull
  THISTYPE removeHeaderClass (@Nonnull ICSSClassProvider aCSSClassProvider);

  boolean hasHeaderClasses ();

  boolean hasHeaderRows ();

  @Nonnegative
  int getHeaderRowCount ();

  @Nullable
  HCRow getFirstHeaderRow ();

  @Nullable
  HCRow getHeaderRowAtIndex (@Nonnegative int nIndex);

  @Nullable
  HCRow getLastHeaderRow ();

  @Nonnull
  @ReturnsMutableCopy
  List <HCRow> getAllHeaderRows ();

  @Nonnull
  HCRow addHeaderRow ();

  @Nonnull
  HCRow addHeaderRow (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE addHeaderRow (@Nullable HCRow aRow);

  @Nonnull
  THISTYPE addHeaderRow (@Nonnegative int nIndex, @Nullable HCRow aRow);

  @Nonnull
  THISTYPE removeHeaderRowAtIndex (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE removeAllHeaderRows ();

  @Nonnull
  THISTYPE sortAllHeaderRows (@Nonnull Comparator <? super HCRow> aComparator);

  // Footer rows

  @Nullable
  String getFooterID ();

  @Nonnull
  THISTYPE setFooterID (@Nullable String sID);

  /**
   * @return <code>true</code> if a Footer ID is present, <code>false</code>
   *         otherwise
   */
  boolean hasFooterID ();

  @Nonnull
  @ReturnsMutableCopy
  List <ICSSClassProvider> getAllFooterClasses ();

  @Nonnull
  String getAllFooterClassesAsString ();

  @Nonnull
  THISTYPE addFooterClass (@Nonnull ICSSClassProvider aCSSClassProvider);

  @Nonnull
  THISTYPE removeFooterClass (@Nonnull ICSSClassProvider aCSSClassProvider);

  boolean hasFooterClasses ();

  boolean hasFooterRows ();

  @Nonnegative
  int getFooterRowCount ();

  @Nullable
  HCRow getFirstFooterRow ();

  @Nullable
  HCRow getFooterRowAtIndex (@Nonnegative int nIndex);

  @Nullable
  HCRow getLastFooterRow ();

  @Nonnull
  @ReturnsMutableCopy
  List <HCRow> getAllFooterRows ();

  @Nonnull
  HCRow addFooterRow ();

  @Nonnull
  HCRow addFooterRow (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE addFooterRow (@Nullable HCRow aRow);

  @Nonnull
  THISTYPE addFooterRow (@Nonnegative int nIndex, @Nullable HCRow aRow);

  @Nonnull
  THISTYPE removeFooterRowAtIndex (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE removeAllFooterRows ();

  @Nonnull
  THISTYPE sortAllFooterRows (@Nonnull Comparator <? super HCRow> aComparator);

  // Body rows

  @Nullable
  String getBodyID ();

  @Nonnull
  THISTYPE setBodyID (@Nullable String sID);

  /**
   * @return <code>true</code> if a body ID is present, <code>false</code>
   *         otherwise
   */
  boolean hasBodyID ();

  @Nonnull
  @ReturnsMutableCopy
  List <ICSSClassProvider> getAllBodyClasses ();

  @Nonnull
  String getAllBodyClassesAsString ();

  @Nonnull
  THISTYPE addBodyClass (@Nonnull ICSSClassProvider aCSSClassProvider);

  @Nonnull
  THISTYPE removeBodyClass (@Nonnull ICSSClassProvider aCSSClassProvider);

  boolean hasBodyClasses ();

  boolean hasBodyRows ();

  @Nonnegative
  int getBodyRowCount ();

  @Nullable
  HCRow getFirstBodyRow ();

  @Nullable
  HCRow getBodyRowAtIndex (@Nonnegative int nIndex);

  @Nullable
  HCRow getLastBodyRow ();

  @Nonnull
  @ReturnsMutableCopy
  List <HCRow> getAllBodyRows ();

  @Nonnull
  HCRow addBodyRow ();

  @Nonnull
  HCRow addBodyRow (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE addBodyRow (@Nullable HCRow aRow);

  @Nonnull
  THISTYPE addBodyRow (@Nonnegative int nIndex, @Nullable HCRow aRow);

  @Nonnull
  THISTYPE removeBodyRowAtIndex (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE removeAllBodyRows ();

  @Nonnull
  THISTYPE sortAllBodyRows (@Nonnull Comparator <? super HCRow> aComparator);

  @Nonnull
  THISTYPE setSpanningHeaderContent (@Nullable String sText);

  @Nonnull
  THISTYPE setSpanningHeaderContent (@Nullable IHCNode aNode);

  @Nonnull
  THISTYPE addSpanningHeaderContent (@Nullable String sText);

  @Nonnull
  THISTYPE addSpanningHeaderContent (@Nullable IHCNode aNode);

  @Nonnull
  THISTYPE addSpanningBodyContent (@Nullable String sText);

  @Nonnull
  THISTYPE addSpanningBodyContent (@Nullable IHCNode aNode);

  @Nonnull
  THISTYPE setSpanningFooterContent (@Nullable String sText);

  @Nonnull
  THISTYPE setSpanningFooterContent (@Nullable IHCNode aNode);

  @Nonnull
  THISTYPE addSpanningFooterContent (@Nullable String sText);

  @Nonnull
  THISTYPE addSpanningFooterContent (@Nullable IHCNode aNode);
}
