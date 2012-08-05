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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.StringParser;
import com.phloc.css.ECSSUnit;
import com.phloc.css.property.CCSSProperties;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.DefaultCSSClassProvider;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.HCEntityNode;

/**
 * Represents an HTML &lt;table&gt; element with open semantics.
 * 
 * @author philip
 * @param <THISTYPE>
 *        The implementing type
 */
public abstract class AbstractHCTable <THISTYPE extends AbstractHCTable <THISTYPE>> extends
                                                                                    AbstractHCBaseTable <THISTYPE>
{
  public static final ICSSClassProvider CSS_FORCE_COLSPAN = DefaultCSSClassProvider.create ("force_colspan");
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCTable.class);

  public AbstractHCTable ()
  {
    super (EHTMLElement.TABLE);
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

  @OverrideOnDemand
  protected void applyHeaderRow (final IMicroElement aTHead,
                                 final HCRow aRow,
                                 @Nonnull final IHCConversionSettings aConversionSettings)
  {
    aTHead.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void applyFooterRow (final IMicroElement aTFoot,
                                 final HCRow aRow,
                                 @Nonnull final IHCConversionSettings aConversionSettings)
  {
    aTFoot.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void applyBodyRow (final IMicroElement aTBody,
                               final HCRow aRow,
                               @Nonnull final IHCConversionSettings aConversionSettings)
  {
    aTBody.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @Override
  protected boolean canConvertToNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    // Avoid creating a table without header, body and footer
    return m_aHeaderRow != null || !m_aBodyRows.isEmpty () || m_sBodyID != null || m_aFooterRow != null;
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (@Nonnull final IMicroElement aElement,
                                  @Nonnull final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    // Required by XHTML 1.1
    if (m_aBodyRows.isEmpty () && aConversionSettings.getHTMLVersion ().isXHTML11 ())
      s_aLogger.warn ("Tables without body rows are prohibited by XHTML 1.1!");

    // Table specific attributes
    if (aConversionSettings.getHTMLVersion ().isPriorToHTML5 ())
    {
      // These attributes are obsolete in HTML5
      if (m_nCellSpacing >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLSPACING, m_nCellSpacing);
      if (m_nCellPadding >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLPADDING, m_nCellPadding);
    }

    // Append colgroup
    if (m_aColGroup != null && m_aColGroup.hasColumns ())
      aElement.appendChild (m_aColGroup.getAsNode (aConversionSettings));

    // Table header?
    if (m_aHeaderRow != null)
    {
      final IMicroElement aTHead = aElement.appendElement (EHTMLElement.THEAD.getElementName ());
      if (StringHelper.hasText (m_sHeaderID))
        aTHead.setAttribute (CHTMLAttributes.ID, m_sHeaderID);
      applyHeaderRow (aTHead, m_aHeaderRow, aConversionSettings);
      if (!aTHead.hasChildren () && !EHTMLElement.THEAD.mayBeSelfClosed ())
        aTHead.appendText ("");
    }

    // Table footer?
    if (m_aFooterRow != null)
    {
      final IMicroElement aTFoot = aElement.appendElement (EHTMLElement.TFOOT.getElementName ());
      if (StringHelper.hasText (m_sFooterID))
        aTFoot.setAttribute (CHTMLAttributes.ID, m_sFooterID);
      applyFooterRow (aTFoot, m_aFooterRow, aConversionSettings);
      if (!aTFoot.hasChildren () && !EHTMLElement.TFOOT.mayBeSelfClosed ())
        aTFoot.appendText ("");
    }

    // add the tbody anyway - helpful for JS tables

    // Table body
    final IMicroElement aTBody = aElement.appendElement (EHTMLElement.TBODY.getElementName ());
    if (StringHelper.hasText (m_sBodyID))
      aTBody.setAttribute (CHTMLAttributes.ID, m_sBodyID);

    // bug fix for IE9 table layout bug
    // (http://msdn.microsoft.com/en-us/library/ms531161%28v=vs.85%29.aspx)
    // IE9 only interprets column widths if the first row does not use colspan
    // (i.e. at least one row does not use colspan)
    if (m_aColGroup != null &&
        m_aColGroup.hasColumns () &&
        !m_aBodyRows.isEmpty () &&
        getFirstBodyRow ().isColspanUsed ())
    {
      // Create a dummy row with explicit widths
      final HCRow aRow = new HCRow (false).addClass (CSS_FORCE_COLSPAN);
      for (final HCCol aCol : m_aColGroup.getAllColumns ())
      {
        final AbstractHCCell aCell = aRow.addAndReturnCell (HCEntityNode.newNBSP ());
        final int nWidth = StringParser.parseInt (aCol.getWidth (), -1);
        if (nWidth >= 0)
          aCell.addStyle (CCSSProperties.WIDTH.newValue (ECSSUnit.px (nWidth)));
      }
      applyBodyRow (aTBody, aRow, aConversionSettings);
    }

    // Main body rows
    for (final HCRow aRow : m_aBodyRows)
      applyBodyRow (aTBody, aRow, aConversionSettings);

    if (!aTBody.hasChildren () && !EHTMLElement.TBODY.mayBeSelfClosed ())
      aTBody.appendText ("");
  }
}
