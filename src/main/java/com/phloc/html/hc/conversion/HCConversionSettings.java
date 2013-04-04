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
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.xml.serialize.EXMLSerializeFormat;
import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.commons.xml.serialize.XMLWriterSettings;
import com.phloc.css.ECSSVersion;
import com.phloc.css.ICSSWriterSettings;
import com.phloc.css.writer.CSSWriterSettings;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

@NotThreadSafe
public class HCConversionSettings implements IHCConversionSettings
{
  // Is implied from default XMLWriter settings
  /** Default indent and align HTML: true */
  public static final boolean DEFAULT_INDENT_AND_ALIGN_HTML = true;
  /** Default CSS version 3.0 */
  public static final ECSSVersion DEFAULT_CSS_VERSION = ECSSVersion.CSS30;
  /** Default indent and align CSS: true */
  public static final boolean DEFAULT_INDENT_AND_ALIGN_CSS = true;
  /** Default consistency checks: true */
  public static final boolean DEFAULT_CONSISTENCY_CHECKS = true;
  /** Default extract out-of-band nodes: true */
  public static final boolean DEFAULT_EXTRACT_OUT_OF_BAND_NODES = true;

  private final EHTMLVersion m_eHTMLVersion;
  private final String m_sHTMLNamespaceURI;
  private XMLWriterSettings m_aXMLWriterSettings;
  private CSSWriterSettings m_aCSSWriterSettings;
  private boolean m_bConsistencyChecksEnabled;
  private boolean m_bExtractOutOfBandNodes;
  private IHCCustomizer m_aCustomizer;

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
    m_sHTMLNamespaceURI = eHTMLVersion.getNamespaceURI ();
    m_aXMLWriterSettings = new XMLWriterSettings ().setFormat (EXMLSerializeFormat.XHTML);
    m_aCSSWriterSettings = new CSSWriterSettings (DEFAULT_CSS_VERSION, !DEFAULT_INDENT_AND_ALIGN_CSS);
    m_bConsistencyChecksEnabled = DEFAULT_CONSISTENCY_CHECKS;
    m_bExtractOutOfBandNodes = DEFAULT_EXTRACT_OUT_OF_BAND_NODES;
    m_aCustomizer = new HCDefaultCustomizer ();
  }

  /**
   * Copy ctor. Also creates a copy of the {@link XMLWriterSettings} and the
   * {@link CSSWriterSettings}.
   * 
   * @param aBase
   *        Object to copy the settings from. May not be <code>null</code>.
   */
  public HCConversionSettings (@Nonnull final IHCConversionSettings aBase)
  {
    this (aBase, aBase.getHTMLVersion ());
  }

  /**
   * Kind of copy ctor. Also creates a copy of the {@link XMLWriterSettings} and
   * the {@link CSSWriterSettings}.
   * 
   * @param aBase
   *        Object to copy the settings from. May not be <code>null</code>.
   * @param eHTMLVersion
   *        A different HTML version to use than the one from the base settings
   */
  public HCConversionSettings (@Nonnull final IHCConversionSettings aBase, @Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (aBase == null)
      throw new NullPointerException ("base");
    if (eHTMLVersion == null)
      throw new NullPointerException ("HTMLVersion");
    m_eHTMLVersion = eHTMLVersion;
    m_sHTMLNamespaceURI = eHTMLVersion.getNamespaceURI ();
    m_aXMLWriterSettings = new XMLWriterSettings (aBase.getXMLWriterSettings ());
    m_aCSSWriterSettings = new CSSWriterSettings (aBase.getCSSWriterSettings ());
    m_bConsistencyChecksEnabled = aBase.areConsistencyChecksEnabled ();
    m_bExtractOutOfBandNodes = aBase.extractOutOfBandNodes ();
    m_aCustomizer = aBase.getCustomizer ();
  }

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_eHTMLVersion;
  }

  @Nullable
  public String getHTMLNamespaceURI ()
  {
    return m_sHTMLNamespaceURI;
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
  public XMLWriterSettings getXMLWriterSettings ()
  {
    return m_aXMLWriterSettings;
  }

  /**
   * Set the CSS writer settings to be used.
   * 
   * @param aCSSWriterSettings
   *        The settings. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCConversionSettings setCSSWriterSettings (@Nonnull final ICSSWriterSettings aCSSWriterSettings)
  {
    if (aCSSWriterSettings == null)
      throw new NullPointerException ("CSSWriterSettings");
    m_aCSSWriterSettings = new CSSWriterSettings (aCSSWriterSettings);
    return this;
  }

  @Nonnull
  public CSSWriterSettings getCSSWriterSettings ()
  {
    return m_aCSSWriterSettings;
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
   * Enable or disable the extraction of out-of-band nodes.
   * 
   * @param bExtractOutOfBandNodes
   *        The new value.
   * @return this
   */
  @Nonnull
  public HCConversionSettings setExtractOutOfBandNodes (final boolean bExtractOutOfBandNodes)
  {
    m_bExtractOutOfBandNodes = bExtractOutOfBandNodes;
    return this;
  }

  public boolean extractOutOfBandNodes ()
  {
    return m_bExtractOutOfBandNodes;
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

  @Nonnull
  public HCConversionSettings getClone ()
  {
    return new HCConversionSettings (this);
  }

  @Nonnull
  public HCConversionSettings getClone (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    return new HCConversionSettings (this, eHTMLVersion);
  }

  @Nonnull
  public HCConversionSettings getCloneIfNecessary (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    return m_eHTMLVersion.equals (eHTMLVersion) ? this : getClone (eHTMLVersion);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("htmlVersion", m_eHTMLVersion)
                                       .append ("XMLWriterSettings", m_aXMLWriterSettings)
                                       .append ("CSSWriterSettings", m_aCSSWriterSettings)
                                       .append ("consistencyChecksEnabled", m_bConsistencyChecksEnabled)
                                       .append ("extractOutOfBandNodes", m_bExtractOutOfBandNodes)
                                       .append ("customizer", m_aCustomizer)
                                       .toString ();
  }
}
