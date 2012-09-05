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

import com.phloc.html.EHTMLVersion;

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
    m_aCSNoIndent = new HCConversionSettings (eHTMLVersion).setIndentAndAlignCSS (false).setIndentAndAlignHTML (false);
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
}
