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
public class HCMask extends AbstractHCSVGElement <HCMask>
{
  private static final long serialVersionUID = -2648539366161645370L;

  private String m_sFill = null;
  private String m_sMask = null;

  public HCMask ()
  {
    super (EHTMLElement.MASK);
  }

  public HCMask setFill (final String sFill)
  {
    this.m_sFill = sFill;
    return this;
  }

  public HCMask setMask (final String sMask)
  {
    this.m_sMask = sMask;
    return this;
  }

  public HCPath addPath ()
  {
    return this.addAndReturnChild (new HCPath ());
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (this.m_sFill))
    {
      aElement.setAttribute (CHTMLAttributes.FILL, this.m_sFill);
    }
    if (StringHelper.hasText (this.m_sMask))
    {
      aElement.setAttribute (CHTMLAttributes.MASK, this.m_sMask);
    }
  }
}
