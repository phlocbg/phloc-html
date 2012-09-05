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

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.commons.xml.serialize.XMLWriterSettings;
import com.phloc.css.ECSSVersion;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

@NotThreadSafe
public final class HCConversionSettings implements IHCConversionSettings
{
  private final EHTMLVersion m_eHTMLVersion;
  private XMLWriterSettings m_aXMLWriterSettings = new XMLWriterSettings ();
  private ECSSVersion m_eCSSVersion = DEFAULT_CSS_VERSION;
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

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_eHTMLVersion;
  }

  /**
   * Set the XML writer settings to be used. By default values equivalent to
   * {@link XMLWriterSettings#DEFAULT_XML_SETTINGS} are used.
   * 
   * @param aXMLWriterSettings
   *        The XML writer settings to be used. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCConversionSettings setXMLWriterSettings (@Nonnull final IXMLWriterSettings aXMLWriterSettings)
  {
    if (aXMLWriterSettings == null)
      throw new NullPointerException ("XMLWriterSettings");
    // The objects are cached with indent and no-indent for performance reasons
    m_aXMLWriterSettings = new XMLWriterSettings (aXMLWriterSettings);
    return this;
  }

  @Nonnull
  public IXMLWriterSettings getXMLWriterSettings ()
  {
    return m_aXMLWriterSettings;
  }

  /**
   * Set the CSS version to be used.
   * 
   * @param eCSSVersion
   *        The new value.
   * @return this
   */
  @Nonnull
  public HCConversionSettings setCSSVersion (@Nonnull final ECSSVersion eCSSVersion)
  {
    if (eCSSVersion == null)
      throw new NullPointerException ("CSSVersion");
    m_eCSSVersion = eCSSVersion;
    return this;
  }

  @Nonnull
  public ECSSVersion getCSSVersion ()
  {
    return m_eCSSVersion;
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

  @Nonnull
  public IHCCustomizer getCustomizer ()
  {
    return m_aCustomizer;
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("htmlVersion", m_eHTMLVersion)
                                       .append ("XMLWriterSettings", m_aXMLWriterSettings)
                                       .append ("cssVersion", m_eCSSVersion)
                                       .append ("indentAndAlignCSS", m_bIndentAndAlignCSS)
                                       .append ("consistencyChecksEnabled", m_bConsistencyChecksEnabled)
                                       .append ("customizer", m_aCustomizer)
                                       .toString ();
  }
}
