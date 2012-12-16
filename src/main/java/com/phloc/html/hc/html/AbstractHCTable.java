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
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Represents an HTML &lt;table&gt; element with open semantics.
 * 
 * @author philip
 * @param <THISTYPE>
 *        The implementing type
 */
public abstract class AbstractHCTable <THISTYPE extends AbstractHCTable <THISTYPE>> extends AbstractHCBaseTable <THISTYPE>
{
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
  protected void applyHeaderRow (@Nonnull final IMicroElement aTHead,
                                 @Nonnull final HCRow aRow,
                                 @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    aTHead.appendChild (aRow.convertToNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void applyFooterRow (@Nonnull final IMicroElement aTFoot,
                                 @Nonnull final HCRow aRow,
                                 @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    aTFoot.appendChild (aRow.convertToNode (aConversionSettings));
  }

  /**
   * @param aTBody
   *        TBody micro element
   * @param aConversionSettings
   *        The conversion settings to use
   */
  @OverrideOnDemand
  protected void applyBody (@Nonnull final IMicroElement aTBody,
                            @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    /* empty */
  }

  @OverrideOnDemand
  protected void applyBodyRow (@Nonnull final IMicroElement aTBody,
                               @Nonnull final HCRow aRow,
                               @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    aTBody.appendChild (aRow.convertToNode (aConversionSettings));
  }

  @Override
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Avoid creating a table without header, body and footer
    return hasHeaderRow () || hasBodyRows () || hasBodyID () || hasBodyClasses () || hasFooterRow ();
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (@Nonnull final IMicroElement aElement,
                                  @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    // Required by XHTML 1.1
    if (!hasBodyRows () && !hasBodyID () && !hasBodyClasses () && aConversionSettings.getHTMLVersion ().isXHTML11 ())
      s_aLogger.warn ("Tables without body rows are prohibited by XHTML 1.1!");

    // Table specific attributes
    if (aConversionSettings.getHTMLVersion ().isPriorToHTML5 ())
    {
      // These attributes are obsolete in HTML5
      if (getCellSpacing () >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLSPACING, getCellSpacing ());
      if (getCellPadding () >= 0)
        aElement.setAttribute (CHTMLAttributes.CELLPADDING, getCellPadding ());
    }

    // Append colgroup
    if (m_aColGroup != null && m_aColGroup.hasColumns ())
      aElement.appendChild (m_aColGroup.convertToNode (aConversionSettings));

    // Table header?
    if (hasHeaderRow ())
    {
      final IMicroElement aTHead = aElement.appendElement (aConversionSettings.getHTMLNamespaceURI (),
                                                           EHTMLElement.THEAD.getElementName ());
      if (hasHeaderID ())
        aTHead.setAttribute (CHTMLAttributes.ID, getHeaderID ());
      applyHeaderRow (aTHead, getHeaderRow (), aConversionSettings);
      if (!aTHead.hasChildren () && !EHTMLElement.THEAD.mayBeSelfClosed ())
        aTHead.appendText ("");
    }

    // Table footer?
    if (hasFooterRow ())
    {
      final IMicroElement aTFoot = aElement.appendElement (aConversionSettings.getHTMLNamespaceURI (),
                                                           EHTMLElement.TFOOT.getElementName ());
      if (hasFooterID ())
        aTFoot.setAttribute (CHTMLAttributes.ID, getFooterID ());
      applyFooterRow (aTFoot, getFooterRow (), aConversionSettings);
      if (!aTFoot.hasChildren () && !EHTMLElement.TFOOT.mayBeSelfClosed ())
        aTFoot.appendText ("");
    }

    // add the tbody anyway - helpful for JS tables

    // Table body
    final IMicroElement aTBody = aElement.appendElement (aConversionSettings.getHTMLNamespaceURI (),
                                                         EHTMLElement.TBODY.getElementName ());
    if (hasBodyID ())
      aTBody.setAttribute (CHTMLAttributes.ID, getBodyID ());
    if (hasBodyClasses ())
      aTBody.setAttribute (CHTMLAttributes.CLASS, getBodyClassesAsString ());
    applyBody (aTBody, aConversionSettings);

    // Main body rows
    for (final HCRow aRow : directGetBodyRowList ())
      applyBodyRow (aTBody, aRow, aConversionSettings);

    if (!aTBody.hasChildren () && !EHTMLElement.TBODY.mayBeSelfClosed ())
      aTBody.appendText ("");
  }
}
