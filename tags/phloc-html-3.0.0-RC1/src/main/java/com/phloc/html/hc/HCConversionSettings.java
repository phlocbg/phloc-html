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
package com.phloc.html.hc;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.html.EHTMLVersion;

@NotThreadSafe
public final class HCConversionSettings
{
  public static final HCConversionSettings DEFAULT = new HCConversionSettings (EHTMLVersion.DEFAULT);
  public static final HCConversionSettings DEFAULT_NOT_INDENTED = new HCConversionSettings (EHTMLVersion.DEFAULT).setIndentAndAlignHTML (false);

  public static final boolean DEFAULT_INDENT_AND_ALIGN_HTML = true;

  private final EHTMLVersion m_eHTMLVersion;
  private boolean m_bIndentAndAlignHTML = DEFAULT_INDENT_AND_ALIGN_HTML;

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
}