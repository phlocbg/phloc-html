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
import javax.annotation.Nullable;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.css.CCSS;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api.EHCIFrameAlign;
import com.phloc.html.hc.api.EHCScrolling;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

public class HCIFrame extends AbstractHCElementWithChildren <HCIFrame>
{
  private ISimpleURL m_aSrc;
  private String m_sName;
  private String m_sLongDesc;
  private EHCScrolling m_eScrolling = EHCScrolling.AUTO;
  private EHCIFrameAlign m_eAlign;
  private boolean m_bFrameBorder = true;
  private String m_sWidth;
  private String m_sHeight;
  private int m_nMarginWidth = CGlobal.ILLEGAL_UINT;
  private int m_nMarginHeight = CGlobal.ILLEGAL_UINT;

  public HCIFrame ()
  {
    super (EHTMLElement.IFRAME);
  }

  public HCIFrame (@Nullable final String sChild)
  {
    super (EHTMLElement.IFRAME, sChild);
  }

  public HCIFrame (@Nullable final String... aChildren)
  {
    super (EHTMLElement.IFRAME, aChildren);
  }

  public HCIFrame (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.IFRAME, aChild);
  }

  public HCIFrame (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.IFRAME, aChildren);
  }

  public HCIFrame (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.IFRAME, aChildren);
  }

  @Nonnull
  public HCIFrame setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  @Nonnull
  public HCIFrame setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nonnull
  public HCIFrame setLongDesc (@Nullable final String sLongDesc)
  {
    m_sLongDesc = sLongDesc;
    return this;
  }

  @Nonnull
  public HCIFrame setScrolling (@Nullable final EHCScrolling eScrolling)
  {
    m_eScrolling = eScrolling;
    return this;
  }

  @Nonnull
  public HCIFrame setAlign (@Nullable final EHCIFrameAlign eAlign)
  {
    m_eAlign = eAlign;
    return this;
  }

  @Nonnull
  public HCIFrame setFrameBorder (final boolean bFrameBorder)
  {
    m_bFrameBorder = bFrameBorder;
    return this;
  }

  /**
   * Set the width in pixel
   * 
   * @param nWidth
   *        the width in pixel
   * @return this
   */
  @Nonnull
  public HCIFrame setWidth (final int nWidth)
  {
    if (nWidth >= 0)
      m_sWidth = Integer.toString (nWidth);
    return this;
  }

  @Nonnull
  public HCIFrame setWidthPercentage (final double dPercentage)
  {
    m_sWidth = CCSS.perc (dPercentage);
    return this;
  }

  @Nonnull
  public HCIFrame setHeight (final int nHeight)
  {
    if (nHeight >= 0)
      m_sHeight = Integer.toString (nHeight);
    return this;
  }

  @Nonnull
  public HCIFrame setHeightPercentage (final double dPercentage)
  {
    m_sHeight = CCSS.perc (dPercentage);
    return this;
  }

  @Nonnull
  public HCIFrame setMarginWidth (final int nMarginWidth)
  {
    m_nMarginWidth = nMarginWidth;
    return this;
  }

  @Nonnull
  public HCIFrame setMarginHeight (final int nMarginHeight)
  {
    m_nMarginHeight = nMarginHeight;
    return this;
  }

  @Override
  protected void applyProperties (HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sLongDesc))
      aElement.setAttribute (CHTMLAttributes.LONGDESC, m_sLongDesc);
    if (m_eScrolling != null)
      aElement.setAttribute (CHTMLAttributes.SCROLLING, m_eScrolling.getAttrValue ());
    if (m_eAlign != null)
      aElement.setAttribute (CHTMLAttributes.ALIGN, m_eAlign.getAttrValue ());
    aElement.setAttribute (CHTMLAttributes.FRAMEBORDER, m_bFrameBorder ? "1" : "0");
    if (StringHelper.hasText (m_sWidth))
      aElement.setAttribute (CHTMLAttributes.WIDTH, m_sWidth);
    if (StringHelper.hasText (m_sHeight))
      aElement.setAttribute (CHTMLAttributes.HEIGHT, m_sHeight);
    if (m_nMarginWidth >= 0)
      aElement.setAttribute (CHTMLAttributes.MARGINWIDTH, Integer.toString (m_nMarginWidth));
    if (m_nMarginHeight >= 0)
      aElement.setAttribute (CHTMLAttributes.MARGINHEIGHT, Integer.toString (m_nMarginHeight));
  }
}
