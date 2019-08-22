/**
 * Copyright (C) 2006-2015 phloc systems
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
package com.phloc.html.hc.html5;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

@SinceHTML5
public class HCFeColorMatrix extends AbstractHCSVGElement <HCFeColorMatrix>
{
  private static final long serialVersionUID = -4804821762444982545L;

  private String m_sIn = null;
  private String m_sValues = null;

  public HCFeColorMatrix ()
  {
    super (EHTMLElement.FECOLORMATRIX);
  }

  public HCPath addPath ()
  {
    return this.addAndReturnChild (new HCPath ());
  }

  public HCFeColorMatrix setIn (final String sValue)
  {
    this.m_sIn = sValue;
    return this;
  }

  public HCFeColorMatrix setValues (final String sValue)
  {
    this.m_sValues = sValue;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (this.m_sValues))
    {
      aElement.setAttribute (CHTMLAttributes.VALUES, this.m_sValues);
    }
    if (StringHelper.hasText (this.m_sIn))
    {
      aElement.setAttribute (CHTMLAttributes.IN, this.m_sIn);
    }
  }
}
