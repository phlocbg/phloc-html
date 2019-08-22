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
import com.phloc.html.CHTMLNameSpaceValues;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

@SinceHTML5
public class HCUse extends AbstractHCSVGElement <HCUse>
{
  private static final long serialVersionUID = -2648539366161645370L;

  private String m_sXlinkHref = null;
  private String m_sFill = null;
  private String m_sFilter = null;
  private String m_sTransform = null;

  public HCUse ()
  {
    super (EHTMLElement.USE);
  }

  public HCUse setXlinkHref (final String sHref)
  {
    this.m_sXlinkHref = sHref;
    return this;
  }

  public HCUse setFill (final String sFill)
  {
    this.m_sFill = sFill;
    return this;
  }

  public HCUse setTransform (final String sTransform)
  {
    this.m_sTransform = sTransform;
    return this;
  }

  public HCUse setFilter (final String sFilter)
  {
    this.m_sFilter = sFilter;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    if (StringHelper.hasText (this.m_sXlinkHref))
    {
      aElement.setAttribute (CHTMLNameSpaceValues.NS_XLINK_PREFIX + ':' + CHTMLAttributes.HREF, this.m_sXlinkHref);
    }
    if (StringHelper.hasText (this.m_sFill))
    {
      aElement.setAttribute (CHTMLAttributes.FILL, this.m_sFill);
    }
    if (StringHelper.hasText (this.m_sFilter))
    {
      aElement.setAttribute (CHTMLAttributes.FILTER, this.m_sFilter);
    }
    if (StringHelper.hasText (this.m_sTransform))
    {
      aElement.setAttribute (CHTMLAttributes.TRANSFORM, this.m_sTransform);
    }
    super.applyProperties (aElement, aConversionSettings);
  }
}
