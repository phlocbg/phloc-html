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

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCButtonType;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;

public class HCButton extends AbstractHCElementWithChildren <HCButton>
{
  private String m_sName;
  private String m_sValue;
  private boolean m_bDisabled = false;

  public HCButton ()
  {
    super (EHTMLElement.BUTTON);
  }

  public HCButton (@Nonnull final IPredefinedLocaleTextProvider aLabel)
  {
    this (aLabel.getText ());
  }

  public HCButton (@Nullable final String sLabel)
  {
    this ();
    addChild (sLabel);
  }

  public HCButton (@Nullable final String sLabel, @Nullable final IJSCodeProvider aOnClick)
  {
    this (sLabel);
    setEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  public String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final HCButton setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nonnull
  public final HCButton setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nonnull
  public final HCButton setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return this;
  }

  @OverrideOnDemand
  @Nonnull
  protected EHCButtonType getType ()
  {
    return EHCButtonType.BUTTON;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, getType ().getAttrValue ());
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sValue))
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_bDisabled)
      aElement.setAttribute (CHTMLAttributes.DISABLED, CHTMLAttributeValues.DISABLED);
  }
}
