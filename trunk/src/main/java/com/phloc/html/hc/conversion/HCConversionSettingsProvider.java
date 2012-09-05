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
package com.phloc.html.hc.conversion;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.xml.serialize.EXMLSerializeIndent;
import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.commons.xml.serialize.XMLWriterSettings;
import com.phloc.css.ECSSVersion;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.IHCCustomizer;

/**
 * Default implementation of {@link IHCConversionSettingsProvider} using a
 * provided {@link EHTMLVersion}
 * 
 * @author philip
 */
@Immutable
public class HCConversionSettingsProvider implements IHCConversionSettingsProvider
{
  private final EHTMLVersion m_eHTMLVersion;
  private final HCConversionSettings m_aCSIndent;
  private final HCConversionSettings m_aCSNoIndent;

  public HCConversionSettingsProvider (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("HTMLVersion");
    m_eHTMLVersion = eHTMLVersion;
    m_aCSIndent = new HCConversionSettings (eHTMLVersion);
    m_aCSNoIndent = new HCConversionSettings (eHTMLVersion).setIndentAndAlignCSS (false)
                                                           .setXMLWriterSettings (new XMLWriterSettings ().setIndent (EXMLSerializeIndent.NONE));
  }

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_eHTMLVersion;
  }

  @Nonnull
  public IHCConversionSettings getConversionSettings (final boolean bIndentAndAlign)
  {
    return bIndentAndAlign ? m_aCSIndent : m_aCSNoIndent;
  }

  public void setXMLWriterSettings (@Nonnull final IXMLWriterSettings aXMLWriterSettings)
  {
    m_aCSIndent.setXMLWriterSettings (aXMLWriterSettings);
    m_aCSNoIndent.setXMLWriterSettings (aXMLWriterSettings);
  }

  public void setCSSVersion (@Nonnull final ECSSVersion eCSSVersion)
  {
    m_aCSIndent.setCSSVersion (eCSSVersion);
    m_aCSNoIndent.setCSSVersion (eCSSVersion);
  }

  public void setConsistencyChecksEnabled (final boolean bConsistencyChecksEnabled)
  {
    m_aCSIndent.setConsistencyChecksEnabled (bConsistencyChecksEnabled);
    m_aCSNoIndent.setConsistencyChecksEnabled (bConsistencyChecksEnabled);
  }

  public void setCustomizer (@Nonnull final IHCCustomizer aCustomizer)
  {
    m_aCSIndent.setCustomizer (aCustomizer);
    m_aCSNoIndent.setCustomizer (aCustomizer);
  }
}
