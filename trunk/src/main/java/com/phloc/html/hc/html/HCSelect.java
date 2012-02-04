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

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.compare.EqualsUtils;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCControl;

// TODO change hierarchy to http://dev.w3.org/html5/markup/select.html#select
public class HCSelect extends AbstractHCControl <HCSelect>
{
  private boolean m_bMultiple = false;
  private int m_nSize = CGlobal.ILLEGAL_UINT;
  private List <HCOption> m_aOptions;

  public HCSelect ()
  {
    super (EHTMLElement.SELECT);
  }

  public HCSelect (@Nullable final String sName)
  {
    this ();
    setName (sName);
  }

  @Nonnull
  public final HCSelect setMultiple (final boolean bMultiple)
  {
    m_bMultiple = bMultiple;
    return this;
  }

  @Nonnull
  public final HCSelect setSize (final int nSize)
  {
    m_nSize = nSize;
    return this;
  }

  /**
   * Callback
   * 
   * @param aOption
   *        The added option. Never <code>null</code>.
   */
  @OverrideOnDemand
  protected void onAddOption (@Nonnull final HCOption aOption)
  {}

  @Nonnull
  public final HCOption addOption (@Nonnull final HCOption aOption)
  {
    if (aOption == null)
      throw new NullPointerException ("option");

    if (m_aOptions == null)
      m_aOptions = new ArrayList <HCOption> ();
    onAddOption (aOption);
    m_aOptions.add (aOption);
    return aOption;
  }

  @Nonnull
  public final HCOption addOptionAtIndex (final int nIndex, @Nonnull final HCOption aOption)
  {
    if (aOption == null)
      throw new NullPointerException ("option");

    if (m_aOptions == null)
      m_aOptions = new ArrayList <HCOption> ();
    onAddOption (aOption);
    m_aOptions.add (nIndex, aOption);
    return aOption;
  }

  @Nonnull
  public final HCOption addOption (final String sText)
  {
    return addOption (sText, sText);
  }

  @Nonnull
  public final HCOption addOption (final String sValue, final String sText)
  {
    final HCOption aOption = new HCOption (sValue);
    aOption.addChild (sText);
    return addOption (aOption);
  }

  @Nonnull
  public final HCOption addOption (final String sValue, @Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    return addOption (sValue, aTextProvider.getText ());
  }

  @Nonnull
  public final HCOption addOption (final String sValue, final String sText, final boolean bSelected)
  {
    return addOption (sValue, sText).setSelected (bSelected);
  }

  @Nonnull
  public final HCOption addOption (final String sValue, final String sText, final String sSelectedValue)
  {
    return addOption (sValue, sText, EqualsUtils.nullSafeEquals (sValue, sSelectedValue));
  }

  @Nonnull
  public final HCOption addOptionAtIndex (final int nIndex, final String sValue, final String sText)
  {
    final HCOption aOption = new HCOption (sValue);
    aOption.addChild (sText);
    return addOptionAtIndex (nIndex, aOption);
  }

  @Nonnull
  public final HCSelect removeAllOptions ()
  {
    m_aOptions = null;
    return this;
  }

  @Nonnull
  public final HCSelect removeOptionAtIndex (final int nIndex)
  {
    if (m_aOptions != null)
      m_aOptions.remove (nIndex);
    return this;
  }

  @Nonnegative
  public final int getOptionCount ()
  {
    return m_aOptions == null ? 0 : m_aOptions.size ();
  }

  @ReturnsImmutableObject
  public final List <HCOption> getOptions ()
  {
    return ContainerHelper.makeUnmodifiable (m_aOptions);
  }

  @Nullable
  public final HCOption getOptionAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aOptions, nIndex);
  }

  public final boolean hasOptions ()
  {
    return m_aOptions != null && !m_aOptions.isEmpty ();
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_bMultiple)
      aElement.setAttribute (CHTMLAttributes.MULTIPLE, CHTMLAttributeValues.MULTIPLE);
    if (m_nSize > 1)
      aElement.setAttribute (CHTMLAttributes.SIZE, Integer.toString (m_nSize));

    if (hasOptions ())
    {
      for (final HCOption aOption : m_aOptions)
        aElement.appendChild (aOption.getAsNode (aConversionSettings));
    }
    else
    {
      // Special check, as this is not derived from
      // AbstractHCElementWithChildren
      if (!getElement ().mayBeSelfClosed ())
        aElement.appendText ("");
    }
  }
}
