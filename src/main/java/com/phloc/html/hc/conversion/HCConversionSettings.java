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
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

@NotThreadSafe
public final class HCConversionSettings
{
  public static final boolean DEFAULT_INDENT_AND_ALIGN = true;
  public static final boolean DEFAULT_CONSISTENCY_CHECKS = true;

  private final EHTMLVersion m_eHTMLVersion;
  private boolean m_bIndentAndAlignHTML = DEFAULT_INDENT_AND_ALIGN;
  private boolean m_bIndentAndAlignCSS = DEFAULT_INDENT_AND_ALIGN;
  private boolean m_bConsistencyChecksEnabled = DEFAULT_CONSISTENCY_CHECKS;
  private IHCCustomizer m_aCustomizer = new HCDefaultCustomizer ();

  public HCConversionSettings (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("HTMLVersion");
    m_eHTMLVersion = eHTMLVersion;
  }

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_eHTMLVersion;
  }

  @Nonnull
  public HCConversionSettings setIndentAndAlignHTML (final boolean bIndentAndAlignHTML)
  {
    m_bIndentAndAlignHTML = bIndentAndAlignHTML;
    return this;
  }

  public boolean isIdentAndAlignHTML ()
  {
    return m_bIndentAndAlignHTML;
  }

  @Nonnull
  public HCConversionSettings setIndentAndAlignCSS (final boolean bIndentAndAlignCSS)
  {
    m_bIndentAndAlignCSS = bIndentAndAlignCSS;
    return this;
  }

  public boolean isIdentAndAlignCSS ()
  {
    return m_bIndentAndAlignCSS;
  }

  @Nonnull
  public HCConversionSettings setConsistencyChecksEnabled (final boolean bConsistencyChecksEnabled)
  {
    m_bConsistencyChecksEnabled = bConsistencyChecksEnabled;
    return this;
  }

  public boolean areConsistencyChecksEnabled ()
  {
    return m_bConsistencyChecksEnabled;
  }

  @Nonnull
  public HCConversionSettings setCustomizer (@Nonnull final IHCCustomizer aCustomizer)
  {
    if (aCustomizer == null)
      throw new NullPointerException ("customizer");
    m_aCustomizer = aCustomizer;
    return this;
  }

  @Nonnull
  public IHCCustomizer getCustomizer ()
  {
    return m_aCustomizer;
  }
}
