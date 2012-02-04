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

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents a single option within a select box.
 * 
 * @author philip
 */
public final class HCOption extends AbstractHCElementWithChildren <HCOption>
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCOption.class);

  private boolean m_bDisabled = false;
  private boolean m_bSelected = false;
  private String m_sValue;
  private String m_sLabel;

  public HCOption ()
  {
    super (EHTMLElement.OPTION);
  }

  public HCOption (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCOption (@Nullable final String sValue)
  {
    this ();
    setValue (sValue);
  }

  @Nonnull
  public HCOption setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return this;
  }

  public boolean isDisabled ()
  {
    return m_bDisabled;
  }

  @Nonnull
  public HCOption setSelected (final boolean bSelected)
  {
    m_bSelected = bSelected;
    return this;
  }

  public boolean isSelected ()
  {
    return m_bSelected;
  }

  @Nonnull
  public HCOption setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nullable
  public String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public HCOption setLabel (final String sLabel)
  {
    m_sLabel = sLabel;
    return this;
  }

  @Nullable
  public String getLabel ()
  {
    return m_sLabel;
  }

  @Override
  protected void applyProperties (HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    if (m_bDisabled)
      aElement.setAttribute (CHTMLAttributes.DISABLED, CHTMLAttributeValues.DISABLED);
    if (m_bSelected)
      aElement.setAttribute (CHTMLAttributes.SELECTED, CHTMLAttributeValues.SELECTED);
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_sLabel != null)
      aElement.setAttribute (CHTMLAttributes.LABEL, m_sLabel);

    if (GlobalDebug.isDebugMode () && false)
      if (getChildCount () == 1 && StringHelper.hasNoText (getChild (0).getPlainText ()))
        s_aLogger.warn ("Use another meta option for this option: " + toString ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("disabled", m_bDisabled)
                            .append ("selected", m_bSelected)
                            .append ("value", m_sValue)
                            .append ("label", m_sLabel)
                            .toString ();
  }
}
