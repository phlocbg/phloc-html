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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.css.CCSS;
import com.phloc.css.DefaultCSSClassProvider;
import com.phloc.css.ICSSClassProvider;
import com.phloc.css.property.CCSSProperties;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.HCEntityNode;

public abstract class AbstractHCTable <THISTYPE extends AbstractHCTable <THISTYPE>> extends
                                                                                    AbstractHCBaseTable <THISTYPE>
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCTable.class);
  private static final ICSSClassProvider CSS_FORCE_COLSPAN = DefaultCSSClassProvider.create ("force_colspan");

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
                                 @Nonnull final HCConversionSettings aConversionSettings)
  {
    aTHead.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void applyFooterRow (final IMicroElement aTFoot,
                                 final HCRow aRow,
                                 @Nonnull final HCConversionSettings aConversionSettings)
  {
    aTFoot.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void applyBodyRow (final IMicroElement aTBody,
                               final HCRow aRow,
                               @Nonnull final HCConversionSettings aConversionSettings)
  {
    aTBody.appendChild (aRow.getAsNode (aConversionSettings));
  }

  @Override
  protected boolean canConvertToNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    // Avoid creating a table without header, body and footer
    return m_aHeaderRow != null || !m_aBodyRows.isEmpty () || m_sBodyID != null || m_aFooterRow != null;
  }

  @Override
  protected void applyProperties (@Nonnull final IMicroElement aElement,
                                  @Nonnull final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (aConversionSettings.getHTMLVersion ().isPriorToHTML5 ())
    {
      // These attributes are obsolete in HTML5
      if (m_nCellSpacing >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLSPACING, Integer.toString (m_nCellSpacing));
      if (m_nCellPadding >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLPADDING, Integer.toString (m_nCellPadding));
    }
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
