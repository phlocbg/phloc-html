/**
 * Copyright (C) 2006-2014 phloc systems
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
import com.phloc.html.hc.api.EHCInputType;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.customize.HCDefaultSettings;

/**
 * Represents an HTML &lt;input&gt; element with type "password"
 * 
 * @author Philip Helger
 */
public class HCEditPassword extends AbstractHCEdit <HCEditPassword>
{
  private boolean m_bDisableAutoComplete = HCDefaultSettings.isAutoCompleteOffForPasswordEdits ();

  public HCEditPassword ()
  {
    super (EHCInputType.PASSWORD);
  }

  public HCEditPassword (@Nullable final String sName)
  {
    super (EHCInputType.PASSWORD, sName);
  }

  public final boolean isDisableAutoComplete ()
  {
    return m_bDisableAutoComplete;
  }

  @Nonnull
  public final HCEditPassword setDisableAutoComplete (final boolean bDisableAutoComplete)
  {
    m_bDisableAutoComplete = bDisableAutoComplete;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_bDisableAutoComplete)
      aElement.setAttribute (CHTMLAttributes.AUTOCOMPLETE, CHTMLAttributeValues.OFF);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("disableAutoComplete", m_bDisableAutoComplete)
                            .toString ();
  }
}
