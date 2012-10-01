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
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCParamValueType;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents a single parameter for an {@link HCObject} or an applet.
 * 
 * @author philip
 */
public class HCParam extends AbstractHCElement <HCParam>
{
  private String m_sName;
  private String m_sValue;
  private EHCParamValueType m_eValueType;
  private IMimeType m_aType;

  public HCParam (@Nonnull final String sName)
  {
    super (EHTMLElement.PARAM);
    if (sName == null)
      throw new NullPointerException ("name");
    m_sName = sName;
  }

  @Nullable
  public String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public HCParam setName (@Nonnull final String sName)
  {
    if (sName == null)
      throw new NullPointerException ("name");
    m_sName = sName;
    return this;
  }

  @Nullable
  public String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public HCParam setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nullable
  public EHCParamValueType getValueType ()
  {
    return m_eValueType;
  }

  @Nonnull
  public HCParam setValueType (@Nullable final EHCParamValueType eValueType)
  {
    m_eValueType = eValueType;
    return this;
  }

  @Nullable
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public HCParam setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sValue))
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_eValueType != null)
      aElement.setAttribute (CHTMLAttributes.VALUETYPE, m_eValueType.getAttrValue ());
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    // Should not be self closed!
    aElement.appendText ("");
  }

  public String getPlainText ()
  {
    return "";
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("value", m_sValue)
                            .appendIfNotNull ("valueType", m_eValueType)
                            .appendIfNotNull ("type", m_aType)
                            .toString ();
  }
}
