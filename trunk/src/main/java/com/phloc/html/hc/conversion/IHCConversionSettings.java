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

import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.css.ECSSVersion;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

/**
 * Settings interface that is used to convert HC* nodes to micro nodes, to text
 * and for consistency check.
 * 
 * @author philip
 */
public interface IHCConversionSettings
{
  // Is implied from default XMLWriter settings
  boolean DEFAULT_INDENT_AND_ALIGN_HTML = true;
  ECSSVersion DEFAULT_CSS_VERSION = ECSSVersion.CSS30;
  boolean DEFAULT_INDENT_AND_ALIGN_CSS = true;
  boolean DEFAULT_CONSISTENCY_CHECKS = true;

  /**
   * @return The HTML version to be used to transform HC nodes into XML nodes.
   */
  @Nonnull
  EHTMLVersion getHTMLVersion ();

  /**
   * @return The XML writer settings to be used.
   */
  @Nonnull
  IXMLWriterSettings getXMLWriterSettings ();

  /**
   * @return The CSS version to be used. Default is {@link #DEFAULT_CSS_VERSION}
   */
  @Nonnull
  ECSSVersion getCSSVersion ();

  /**
   * @return <code>true</code> if the CSS output should be indented and aligned.
   *         Default is {@value #DEFAULT_INDENT_AND_ALIGN_CSS}
   */
  boolean isIdentAndAlignCSS ();

  /**
   * @return <code>true</code> if the consistency checks are enabled,
   *         <code>false</code> otherwise. Default is
   *         {@link #DEFAULT_CONSISTENCY_CHECKS}.
   */
  boolean areConsistencyChecksEnabled ();

  /**
   * @return The current customizer to be used. Never <code>null</code>. By
   *         default a {@link HCDefaultCustomizer} object is returned.
   */
  @Nonnull
  IHCCustomizer getCustomizer ();
}
