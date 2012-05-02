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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroContainer;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.hc.IHCRequestFieldBoolean;
import com.phloc.html.hc.api.EHCInputType;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCInput;

/**
 * Represents an HTML &lt;input&gt; element with type "checkbox"
 * 
 * @author philip
 */
public class HCCheckBox extends AbstractHCInput <HCCheckBox>
{
  public static final boolean DEFAULT_CHECKED = false;

  private String m_sValue;
  private boolean m_bChecked = DEFAULT_CHECKED;

  public HCCheckBox (@Nullable final String sName)
  {
    super (EHCInputType.CHECKBOX);
    setName (sName);
  }

  public HCCheckBox (@Nullable final String sName, final boolean bChecked)
  {
    this (sName);
    setChecked (bChecked);
  }

  public HCCheckBox (@Nonnull final IHCRequestFieldBoolean aRF)
  {
    this (aRF.getFieldName (), aRF.isChecked ());
  }

  @Nullable
  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final HCCheckBox setValue (final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nonnull
  public final HCCheckBox setChecked (final boolean bChecked)
  {
    m_bChecked = bChecked;
    return this;
  }

  @Override
  public IMicroNode getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    final IMicroContainer aCont = new MicroContainer ();
    aCont.appendChild (super.getAsNode (aConversionSettings));
    aCont.appendChild (new HCHiddenField (getHiddenFieldName (getName ()), getValue ()).getAsNode (aConversionSettings));
    return aCont;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_bChecked)
      aElement.setAttribute (CHTMLAttributes.CHECKED, CHTMLAttributeValues.CHECKED);
  }

  /**
   * Get the name of the automatic hidden field associated with a checkbox.
   * 
   * @param sFieldName
   *        The name of the checkbox.
   * @return The name of the hidden field associated with the given checkbox
   *         name.
   */
  @Nonnull
  public static String getHiddenFieldName (@Nonnull @Nonempty final String sFieldName)
  {
    if (StringHelper.hasNoText (sFieldName))
      throw new IllegalArgumentException ("fieldName may not be empty!");
    return "__" + sFieldName;
  }
}
