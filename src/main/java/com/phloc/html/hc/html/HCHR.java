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
package com.phloc.html.hc.html;

import javax.annotation.Nonnull;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;hr&gt; element
 * 
 * @author philip
 */
public final class HCHR extends AbstractHCElement <HCHR>
{
  public static final boolean DEFAULT_NO_SHADE = false;

  private boolean m_bNoShade = DEFAULT_NO_SHADE;

  public HCHR ()
  {
    super (EHTMLElement.HR);
  }

  @Nonnull
  public HCHR setNoShade (final boolean bNoShade)
  {
    m_bNoShade = bNoShade;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_bNoShade)
      aElement.setAttribute (CHTMLAttributes.NOSHADE, CHTMLAttributes.NOSHADE);
  }

  public String getPlainText ()
  {
    return "------------------------------\n";
  }
}
