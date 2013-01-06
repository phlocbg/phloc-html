/**
 * Copyright (C) 2006-2013 phloc systems
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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.hc.IHCRequestField;
import com.phloc.html.hc.IHCRequestFieldBoolean;
import com.phloc.html.hc.api.EHCInputType;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCInput;

/**
 * Represents an HTML &lt;input&gt; element of type "radio"
 * 
 * @author philip
 */
public class HCRadioButton extends AbstractHCInput <HCRadioButton>
{
  public static final boolean DEFAULT_CHECKED = false;

  private String m_sValue;
  private boolean m_bChecked = DEFAULT_CHECKED;

  public HCRadioButton (@Nullable final String sName)
  {
    super (EHCInputType.RADIO);
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

  public HCRadioButton (@Nonnull final IHCRequestFieldBoolean aRF)
  {
    this (aRF.getFieldName (), aRF.isChecked ());
  }

  public HCRadioButton (@Nonnull final IHCRequestField aRF)
  {
    this (aRF.getFieldName (), aRF.getRequestValue ());
  }

  @Nullable
  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final HCRadioButton setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  public final boolean isChecked ()
  {
    return m_bChecked;
  }

  @Nonnull
  public final HCRadioButton setChecked (final boolean bChecked)
  {
    m_bChecked = bChecked;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_bChecked)
      aElement.setAttribute (CHTMLAttributes.CHECKED, CHTMLAttributeValues.CHECKED);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("value", m_sValue)
                            .append ("checked", m_bChecked)
                            .toString ();
  }
}
