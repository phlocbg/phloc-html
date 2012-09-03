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
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents a single option within a select box.
 * 
 * @author philip
 */
public class HCOption extends AbstractHCElementWithChildren <HCOption>
{
  public static final boolean DEFAULT_DISABLED = false;
  public static final boolean DEFAULT_SELECTED = false;
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCOption.class);

  private boolean m_bDisabled = DEFAULT_DISABLED;
  private boolean m_bSelected = DEFAULT_SELECTED;
  private String m_sValue;
  private String m_sLabel;

  // Check if a selection was defined or not
  private boolean m_bSelectionDefined = false;

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

  public boolean isDisabled ()
  {
    return m_bDisabled;
  }

  @Nonnull
  public HCOption setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return this;
  }

  public boolean isSelected ()
  {
    return m_bSelected;
  }

  /**
   * @return <code>true</code> if this option was specially marked selected or
   *         not selected.
   */
  public boolean isSelectionDefined ()
  {
    return m_bSelectionDefined;
  }

  @Nonnull
  public HCOption setSelected (final boolean bSelected)
  {
    m_bSelected = bSelected;
    m_bSelectionDefined = true;
    return this;
  }

  @Nullable
  public String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public HCOption setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nullable
  public String getLabel ()
  {
    return m_sLabel;
  }

  @Nonnull
  public HCOption setLabel (final String sLabel)
  {
    m_sLabel = sLabel;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
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
                            .appendIfNotNull ("value", m_sValue)
                            .appendIfNotNull ("label", m_sLabel)
                            .toString ();
  }
}
