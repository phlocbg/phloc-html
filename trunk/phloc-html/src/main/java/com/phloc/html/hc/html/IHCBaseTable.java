package com.phloc.html.hc.html;

import java.util.Comparator;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;

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

  @Nullable
  HCColGroup getColGroup ();

  @Nonnull
  THISTYPE addColumn (@Nullable HCCol aCol);

  @Nonnull
  THISTYPE addColumn (int nIndex, @Nullable HCCol aCol);

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
  THISTYPE removeColumnAtIndex (int nColumnIndex);

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
  List <ICSSClassProvider> getHeaderClasses ();

  @Nonnull
  String getHeaderClassesAsString ();

  @Nonnull
  THISTYPE addHeaderClass (ICSSClassProvider aCSSClassProvider);

  @Nonnull
  THISTYPE removeHeaderClass (ICSSClassProvider aCSSClassProvider);

  boolean hasHeaderClasses ();

  boolean hasHeaderRows ();

  @Nonnegative
  int getHeaderRowCount ();

  @Nullable
  HCRow getFirstHeaderRow ();

  @Nullable
  HCRow getHeaderRowAtIndex (int nIndex);

  @Nullable
  HCRow getLastHeaderRow ();

  @Nonnull
  @ReturnsMutableCopy
  List <HCRow> getAllHeaderRows ();

  @Nonnull
  HCRow addHeaderRow ();

  @Nonnull
  HCRow addHeaderRow (int nIndex);

  @Nonnull
  THISTYPE addHeaderRow (@Nullable HCRow aRow);

  @Nonnull
  THISTYPE addHeaderRow (int nIndex, @Nullable HCRow aRow);

  @Nonnull
  THISTYPE removeHeaderRowAtIndex (int nIndex);

  @Nonnull
  THISTYPE removeAllHeaderRows ();

  @Nonnull
  THISTYPE sortAllHeaderRows (Comparator <HCRow> aComparator);

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
  List <ICSSClassProvider> getFooterClasses ();

  @Nonnull
  String getFooterClassesAsString ();

  @Nonnull
  THISTYPE addFooterClass (ICSSClassProvider aCSSClassProvider);

  @Nonnull
  THISTYPE removeFooterClass (ICSSClassProvider aCSSClassProvider);

  boolean hasFooterClasses ();

  boolean hasFooterRows ();

  @Nonnegative
  int getFooterRowCount ();

  @Nullable
  HCRow getFirstFooterRow ();

  @Nullable
  HCRow getFooterRowAtIndex (int nIndex);

  @Nullable
  HCRow getLastFooterRow ();

  @Nonnull
  @ReturnsMutableCopy
  List <HCRow> getAllFooterRows ();

  @Nonnull
  HCRow addFooterRow ();

  @Nonnull
  HCRow addFooterRow (int nIndex);

  @Nonnull
  THISTYPE addFooterRow (@Nullable HCRow aRow);

  @Nonnull
  THISTYPE addFooterRow (int nIndex, @Nullable HCRow aRow);

  @Nonnull
  THISTYPE removeFooterRowAtIndex (int nIndex);

  @Nonnull
  THISTYPE removeAllFooterRows ();

  @Nonnull
  THISTYPE sortAllFooterRows (Comparator <HCRow> aComparator);

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
  List <ICSSClassProvider> getBodyClasses ();

  String getBodyClassesAsString ();

  @Nonnull
  THISTYPE addBodyClass (ICSSClassProvider aCSSClassProvider);

  @Nonnull
  THISTYPE removeBodyClass (ICSSClassProvider aCSSClassProvider);

  boolean hasBodyClasses ();

  boolean hasBodyRows ();

  @Nonnegative
  int getBodyRowCount ();

  @Nullable
  HCRow getFirstBodyRow ();

  @Nullable
  HCRow getBodyRowAtIndex (int nIndex);

  @Nullable
  HCRow getLastBodyRow ();

  @Nonnull
  @ReturnsMutableCopy
  List <HCRow> getAllBodyRows ();

  @Nonnull
  HCRow addBodyRow ();

  @Nonnull
  HCRow addBodyRow (int nIndex);

  @Nonnull
  THISTYPE addBodyRow (@Nullable HCRow aRow);

  @Nonnull
  THISTYPE addBodyRow (int nIndex, @Nullable HCRow aRow);

  @Nonnull
  THISTYPE removeBodyRowAtIndex (int nIndex);

  @Nonnull
  THISTYPE removeAllBodyRows ();

  @Nonnull
  THISTYPE sortAllBodyRows (Comparator <HCRow> aComparator);

  boolean hasHeaderRow ();

  @Nullable
  HCRow getHeaderRow ();

  @Nullable
  HCRow getOrAddHeaderRow ();

  @Nonnull
  THISTYPE removeHeaderRow ();

  boolean hasFooterRow ();

  @Nullable
  HCRow getFooterRow ();

  @Nullable
  HCRow getOrAddFooterRow ();

  @Nonnull
  THISTYPE removeFooterRow ();

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
