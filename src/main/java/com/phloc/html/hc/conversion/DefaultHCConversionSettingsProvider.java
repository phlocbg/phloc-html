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
import com.phloc.commons.xml.serialize.XMLWriterSettings;
import com.phloc.html.EHTMLVersion;

/**
 * Default implementation of {@link IHCConversionSettingsProvider} using the
 * HTML version {@link EHTMLVersion#DEFAULT}
 * 
 * @author philip
 */
@Immutable
@Deprecated
public final class DefaultHCConversionSettingsProvider implements IHCConversionSettingsProvider
{
  public static final EHTMLVersion HTML_VERSION = EHTMLVersion.DEFAULT;
  private static final HCConversionSettings DEFAULT = new HCConversionSettings (HTML_VERSION);
  private static final HCConversionSettings DEFAULT_NOT_INDENTED = new HCConversionSettings (HTML_VERSION).setIndentAndAlignCSS (false)
                                                                                                          .setXMLWriterSettings (new XMLWriterSettings ().setIndent (EXMLSerializeIndent.INDENT_AND_ALIGN));
  private static final DefaultHCConversionSettingsProvider s_aInstance = new DefaultHCConversionSettingsProvider ();

  private DefaultHCConversionSettingsProvider ()
  {}

  @Nonnull
  public static DefaultHCConversionSettingsProvider getInstance ()
  {
    return s_aInstance;
  }

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return HTML_VERSION;
  }

  @Nonnull
  public IHCConversionSettings getConversionSettings (final boolean bIndentAndAlign)
  {
    return getStaticConversionSettings (bIndentAndAlign);
  }

  @Nonnull
  public static IHCConversionSettings getStaticConversionSettings (final boolean bIndentAndAlign)
  {
    return bIndentAndAlign ? DEFAULT : DEFAULT_NOT_INDENTED;
  }
}
