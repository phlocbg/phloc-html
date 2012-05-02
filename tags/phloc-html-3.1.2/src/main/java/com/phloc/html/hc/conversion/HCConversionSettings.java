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
  public static final boolean DEFAULT_INDENT_AND_ALIGN_HTML = true;
  public static final boolean DEFAULT_INDENT_AND_ALIGN_CSS = true;
  public static final boolean DEFAULT_CONSISTENCY_CHECKS = true;

  private final EHTMLVersion m_eHTMLVersion;
  private boolean m_bIndentAndAlignHTML = DEFAULT_INDENT_AND_ALIGN_HTML;
  private boolean m_bIndentAndAlignCSS = DEFAULT_INDENT_AND_ALIGN_CSS;
  private boolean m_bConsistencyChecksEnabled = DEFAULT_CONSISTENCY_CHECKS;
  private IHCCustomizer m_aCustomizer = new HCDefaultCustomizer ();

  /**
   * Constructor
   * 
   * @param eHTMLVersion
   *        The HTML version to use. May not be <code>null</code>.
   */
  public HCConversionSettings (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("HTMLVersion");
    m_eHTMLVersion = eHTMLVersion;
  }

  /**
   * @return The HTML version to be used to transform HC nodes into XML nodes.
   */
  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_eHTMLVersion;
  }

  /**
   * Set the indent and align HTML flag
   * 
   * @param bIndentAndAlignHTML
   *        The new value
   * @return this
   */
  @Nonnull
  public HCConversionSettings setIndentAndAlignHTML (final boolean bIndentAndAlignHTML)
  {
    m_bIndentAndAlignHTML = bIndentAndAlignHTML;
    return this;
  }

  /**
   * @return <code>true</code> if the HTML output should be indented and
   *         aligned. The default value is defined by
   *         {@link #DEFAULT_INDENT_AND_ALIGN_HTML}.
   */
  public boolean isIdentAndAlignHTML ()
  {
    return m_bIndentAndAlignHTML;
  }

  /**
   * Set the indent and align CSS flag
   * 
   * @param bIndentAndAlignCSS
   *        The new value
   * @return this
   */
  @Nonnull
  public HCConversionSettings setIndentAndAlignCSS (final boolean bIndentAndAlignCSS)
  {
    m_bIndentAndAlignCSS = bIndentAndAlignCSS;
    return this;
  }

  /**
   * @return <code>true</code> if the CSS output should be indented and aligned.
   *         The default value is defined by
   *         {@link #DEFAULT_INDENT_AND_ALIGN_CSS}.
   */
  public boolean isIdentAndAlignCSS ()
  {
    return m_bIndentAndAlignCSS;
  }

  /**
   * Enable or disable the consistency checks. It is recommended that the
   * consistency checks are only run in debug mode!
   * 
   * @param bConsistencyChecksEnabled
   *        The new value.
   * @return this
   */
  @Nonnull
  public HCConversionSettings setConsistencyChecksEnabled (final boolean bConsistencyChecksEnabled)
  {
    m_bConsistencyChecksEnabled = bConsistencyChecksEnabled;
    return this;
  }

  /**
   * @return <code>true</code> if the consistency checks are enabled,
   *         <code>false</code> otherwise.
   */
  public boolean areConsistencyChecksEnabled ()
  {
    return m_bConsistencyChecksEnabled;
  }

  /**
   * Set the global customizer to be used to globally customize created
   * elements.
   * 
   * @param aCustomizer
   *        The customizer to be used. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCConversionSettings setCustomizer (@Nonnull final IHCCustomizer aCustomizer)
  {
    if (aCustomizer == null)
      throw new NullPointerException ("customizer");
    m_aCustomizer = aCustomizer;
    return this;
  }

  /**
   * @return The current customizer to be used. Never <code>null</code>. By
   *         default a {@link HCDefaultCustomizer} object is returned.
   */
  @Nonnull
  public IHCCustomizer getCustomizer ()
  {
    return m_aCustomizer;
  }
}
