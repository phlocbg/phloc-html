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
package com.phloc.html.hc.conversion;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.xml.serialize.EXMLSerializeIndent;
import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.css.writer.CSSWriterSettings;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.IHCCustomizer;

/**
 * Default implementation of {@link IHCConversionSettingsProvider} using a
 * provided {@link EHTMLVersion}
 * 
 * @author Philip Helger
 */
@Immutable
public class HCConversionSettingsProvider implements IHCConversionSettingsProvider
{
  private final HCConversionSettings m_aCS;
  private HCConversionSettings m_aCSOptimized;

  public HCConversionSettingsProvider (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("HTMLVersion");
    m_aCS = new HCConversionSettings (eHTMLVersion);
  }

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_aCS.getHTMLVersion ();
  }

  @Nonnull
  private HCConversionSettings _getOptimized ()
  {
    if (m_aCSOptimized == null)
    {
      // Lazily create on demand
      m_aCSOptimized = m_aCS.getClone ();
      m_aCSOptimized.getXMLWriterSettings ().setIndent (EXMLSerializeIndent.NONE);
      m_aCSOptimized.getCSSWriterSettings ().setOptimizedOutput (true);
    }
    return m_aCSOptimized;
  }

  @Nonnull
  public HCConversionSettings getConversionSettings (final boolean bIndentAndAlign)
  {
    return bIndentAndAlign ? m_aCS : _getOptimized ();
  }

  @Nonnull
  public HCConversionSettingsProvider setXMLWriterSettings (@Nonnull final IXMLWriterSettings aXMLWriterSettings)
  {
    m_aCS.setXMLWriterSettings (aXMLWriterSettings);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setCSSWriterSettings (@Nonnull final CSSWriterSettings aCSSWriterSettings)
  {
    m_aCS.setCSSWriterSettings (aCSSWriterSettings);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setConsistencyChecksEnabled (final boolean bConsistencyChecksEnabled)
  {
    m_aCS.setConsistencyChecksEnabled (bConsistencyChecksEnabled);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setExtractOutOfBandNodes (final boolean bExtractOutOfBandNodes)
  {
    m_aCS.setExtractOutOfBandNodes (bExtractOutOfBandNodes);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setCustomizer (@Nonnull final IHCCustomizer aCustomizer)
  {
    m_aCS.setCustomizer (aCustomizer);
    m_aCSOptimized = null;
    return this;
  }
}
