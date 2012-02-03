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
package com.phloc.html.hc.html5;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api5.EHCCommandType;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

@SinceHTML5 ("IE9 only")
public final class HCCommand extends AbstractHCElementWithChildren <HCCommand>
{
  public static final boolean DEFAULT_CHECKED = false;
  public static final boolean DEFAULT_DEFAULT = false;
  public static final boolean DEFAULT_DISABLED = false;

  private boolean m_bChecked = DEFAULT_CHECKED;
  private boolean m_bDefault = DEFAULT_DEFAULT;
  private boolean m_bDisabled = DEFAULT_DISABLED;
  private ISimpleURL m_aIcon;
  private String m_sLabel;
  private String m_sRadioGroup;
  private EHCCommandType m_eType = EHCCommandType.DEFAULT;

  public HCCommand ()
  {
    super (EHTMLElement.COMMAND);
  }

  public HCCommand (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCCommand (@Nullable final String sChild)
  {
    super (EHTMLElement.COMMAND, sChild);
  }

  public HCCommand (@Nullable final String... aChildren)
  {
    super (EHTMLElement.COMMAND, aChildren);
  }

  public HCCommand (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.COMMAND, aChild);
  }

  public HCCommand (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.COMMAND, aChildren);
  }

  public HCCommand (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.COMMAND, aChildren);
  }

  @Nonnull
  public HCCommand setChecked (final boolean bChecked)
  {
    m_bChecked = bChecked;
    return this;
  }

  @Nonnull
  public HCCommand setDefault (final boolean bDefault)
  {
    m_bDefault = bDefault;
    return this;
  }

  @Nonnull
  public HCCommand setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return this;
  }

  @Nonnull
  public HCCommand setIcon (@Nullable final ISimpleURL aIcon)
  {
    m_aIcon = aIcon;
    return this;
  }

  @Nonnull
  public HCCommand setLabel (@Nullable final String sLabel)
  {
    m_sLabel = sLabel;
    return this;
  }

  @Nonnull
  public HCCommand setRadioGroup (@Nullable final String sRadioGroup)
  {
    m_sRadioGroup = sRadioGroup;
    return this;
  }

  @Nonnull
  public HCCommand setType (@Nonnull final EHCCommandType eType)
  {
    if (eType == null)
      throw new NullPointerException ("type");
    m_eType = eType;
    return this;
  }

  @Override
  protected void applyProperties (HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    if (m_bChecked)
      aElement.setAttribute (CHTMLAttributes.CHECKED, CHTMLAttributeValues.CHECKED);
    if (m_bDefault)
      aElement.setAttribute (CHTMLAttributes.DEFAULT, CHTMLAttributeValues.DEFAULT);
    if (m_bDisabled)
      aElement.setAttribute (CHTMLAttributes.DISABLED, CHTMLAttributeValues.DISABLED);
    if (m_aIcon != null)
      aElement.setAttribute (CHTMLAttributes.ICON, m_aIcon.getAsString ());
    if (StringHelper.hasText (m_sLabel))
      aElement.setAttribute (CHTMLAttributes.LABEL, m_sLabel);
    if (StringHelper.hasText (m_sRadioGroup) && EHCCommandType.RADIO.equals (m_eType))
      aElement.setAttribute (CHTMLAttributes.RADIOGROUP, m_sRadioGroup);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_eType.getAttrValue ());
  }
}
