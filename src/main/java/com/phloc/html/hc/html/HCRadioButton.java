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

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.hc.api.EHCInputType;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCInput;

public class HCRadioButton extends AbstractHCInput <HCRadioButton>
{
  private String m_sValue;
  private boolean m_bChecked = false;

  public HCRadioButton (@Nullable final String sName)
  {
    super ();
    setName (sName);
  }

  public HCRadioButton (@Nullable final String sName, @Nullable final String sValue)
  {
    this (sName);
    setValue (sValue);
  }

  public HCRadioButton (@Nullable final String sName, final boolean bChecked)
  {
    this (sName);
    setChecked (bChecked);
  }

  public HCRadioButton (@Nullable final String sName, @Nullable final String sValue, final boolean bChecked)
  {
    this (sName, sValue);
    setChecked (bChecked);
  }

  @Nonnull
  public final HCRadioButton setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nonnull
  public final HCRadioButton setChecked (final boolean bChecked)
  {
    m_bChecked = bChecked;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, EHCInputType.RADIO.getAttrValue ());
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_bChecked)
      aElement.setAttribute (CHTMLAttributes.CHECKED, CHTMLAttributeValues.CHECKED);
  }
}
