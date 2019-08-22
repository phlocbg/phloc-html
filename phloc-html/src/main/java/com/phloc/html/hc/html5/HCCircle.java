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
public class HCCircle extends AbstractHCSVGElement <HCCircle>
{
  private static final long serialVersionUID = -2648539366161645370L;

  private String m_sCX = null;
  private String m_sCY = null;
  private String m_sR = null;
  private String m_sStroke = null;

  public HCCircle ()
  {
    super (EHTMLElement.CIRCLE);
  }

  public HCCircle setCX (final String sCX)
  {
    this.m_sCX = sCX;
    return this;
  }

  public HCCircle setCY (final String sCY)
  {
    this.m_sCY = sCY;
    return this;
  }

  public HCCircle setR (final String sR)
  {
    this.m_sR = sR;
    return this;
  }

  public HCCircle setStroke (final String sStroke)
  {
    this.m_sStroke = sStroke;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (this.m_sCX))
    {
      aElement.setAttribute (CHTMLAttributes.CX, this.m_sCX);
    }
    if (StringHelper.hasText (this.m_sCY))
    {
      aElement.setAttribute (CHTMLAttributes.CY, this.m_sCY);
    }
    if (StringHelper.hasText (this.m_sR))
    {
      aElement.setAttribute (CHTMLAttributes.R, this.m_sR);
    }
    if (StringHelper.hasText (this.m_sStroke))
    {
      aElement.setAttribute (CHTMLAttributes.STROKE, this.m_sStroke);
    }
  }
}
