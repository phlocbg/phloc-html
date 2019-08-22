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
public class HCFilter extends AbstractHCSVGElement <HCFilter>
{
  private static final long serialVersionUID = 8240846286864531582L;

  private String m_sWidth = null;
  private String m_sHeight = null;
  private String m_sX = null;
  private String m_sY = null;
  private String m_sFilterUnits = null;

  public HCFilter ()
  {
    super (EHTMLElement.FILTER);
  }

  public HCFeOffset addOffset ()
  {
    return this.addAndReturnChild (new HCFeOffset ());
  }

  public HCFeGaussianBlur addGaussianBlur ()
  {
    return this.addAndReturnChild (new HCFeGaussianBlur ());
  }

  public HCFeColorMatrix addColorMatrix ()
  {
    return this.addAndReturnChild (new HCFeColorMatrix ());
  }

  public HCFilter setWidth (final String sValue)
  {
    this.m_sWidth = sValue;
    return this;
  }

  public HCFilter setHeight (final String sValue)
  {
    this.m_sHeight = sValue;
    return this;
  }

  public HCFilter setX (final String sValue)
  {
    this.m_sX = sValue;
    return this;
  }

  public HCFilter setY (final String sValue)
  {
    this.m_sY = sValue;
    return this;
  }

  public HCFilter setFilterUnits (final String sValue)
  {
    this.m_sFilterUnits = sValue;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (this.m_sWidth))
    {
      aElement.setAttribute (CHTMLAttributes.WIDTH, this.m_sWidth);
    }
    if (StringHelper.hasText (this.m_sHeight))
    {
      aElement.setAttribute (CHTMLAttributes.HEIGHT, this.m_sHeight);
    }
    if (StringHelper.hasText (this.m_sX))
    {
      aElement.setAttribute (CHTMLAttributes.X, this.m_sX);
    }
    if (StringHelper.hasText (this.m_sY))
    {
      aElement.setAttribute (CHTMLAttributes.Y, this.m_sY);
    }
    if (StringHelper.hasText (this.m_sFilterUnits))
    {
      aElement.setAttribute (CHTMLAttributes.FILTERUNITS, this.m_sFilterUnits);
    }
  }
}
