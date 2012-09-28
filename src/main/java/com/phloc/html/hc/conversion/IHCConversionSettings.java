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

import com.phloc.commons.ICloneable;
import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.css.ICSSWriterSettings;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

/**
 * Settings interface that is used to convert HC* nodes to micro nodes, to plain
 * text and for consistency checks.
 * 
 * @author philip
 */
public interface IHCConversionSettings extends ICloneable <IHCConversionSettings>
{
  /**
   * @return The HTML version to be used to transform HC nodes into XML nodes.
   */
  @Nonnull
  EHTMLVersion getHTMLVersion ();

  /**
   * @return The XML writer settings to be used. Never <code>null</code>.
   */
  @Nonnull
  IXMLWriterSettings getXMLWriterSettings ();

  /**
   * @return The CSS writer settings to be used.
   */
  @Nonnull
  ICSSWriterSettings getCSSWriterSettings ();

  /**
   * @return <code>true</code> if the consistency checks are enabled,
   *         <code>false</code> otherwise.
   */
  boolean areConsistencyChecksEnabled ();

  /**
   * @return <code>true</code> if out-of-band nodes should be extracted,
   *         <code>false</code> if not. By default <code>true</code> is
   *         returned.
   */
  boolean extractOutOfBandNodes ();

  /**
   * @return The current customizer to be used. Never <code>null</code>. By
   *         default a {@link HCDefaultCustomizer} object is returned.
   */
  @Nonnull
  IHCCustomizer getCustomizer ();

  /**
   * Get a clone of this settings, but with a different HTML version.
   * 
   * @param eHTMLVersion
   *        The new HTML version to use. May not be <code>null</code>.
   * @return Never <code>null</code>.
   */
  @Nonnull
  IHCConversionSettings getClone (@Nonnull EHTMLVersion eHTMLVersion);
}
