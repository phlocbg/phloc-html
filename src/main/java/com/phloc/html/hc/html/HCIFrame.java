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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.css.CCSS;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.api.EHCIFrameAlign;
import com.phloc.html.hc.api.EHCScrolling;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;iframe&gt; element
 * 
 * @author philip
 */
public class HCIFrame extends AbstractHCElementWithChildren <HCIFrame>
{
  public static final EHCScrolling DEFAULT_SCROLLING = EHCScrolling.AUTO;
  public static final boolean DEFAULT_FRAME_BORDER = true;

  private ISimpleURL m_aSrc;
  private String m_sName;
  private String m_sLongDesc;
  private EHCScrolling m_eScrolling = DEFAULT_SCROLLING;
  private EHCIFrameAlign m_eAlign;
  private boolean m_bFrameBorder = DEFAULT_FRAME_BORDER;
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

  public HCIFrame (@Nullable final IHCBaseNode aChild)
  {
    super (EHTMLElement.IFRAME, aChild);
  }

  public HCIFrame (@Nullable final IHCBaseNode... aChildren)
  {
    super (EHTMLElement.IFRAME, aChildren);
  }

  public HCIFrame (@Nullable final Iterable <? extends IHCBaseNode> aChildren)
  {
    super (EHTMLElement.IFRAME, aChildren);
  }

  @Nullable
  public ISimpleURL getSrc ()
  {
    return m_aSrc;
  }

  @Nonnull
  public HCIFrame setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  @Nullable
  public String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public HCIFrame setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nullable
  public String getLongDesc ()
  {
    return m_sLongDesc;
  }

  @Nonnull
  public HCIFrame setLongDesc (@Nullable final String sLongDesc)
  {
    m_sLongDesc = sLongDesc;
    return this;
  }

  @Nullable
  public EHCScrolling getScrolling ()
  {
    return m_eScrolling;
  }

  @Nonnull
  public HCIFrame setScrolling (@Nullable final EHCScrolling eScrolling)
  {
    m_eScrolling = eScrolling;
    return this;
  }

  @Nullable
  public EHCIFrameAlign getAlign ()
  {
    return m_eAlign;
  }

  @Nonnull
  public HCIFrame setAlign (@Nullable final EHCIFrameAlign eAlign)
  {
    m_eAlign = eAlign;
    return this;
  }

  public boolean isFrameBorder ()
  {
    return m_bFrameBorder;
  }

  @Nonnull
  public HCIFrame setFrameBorder (final boolean bFrameBorder)
  {
    m_bFrameBorder = bFrameBorder;
    return this;
  }

  @Nullable
  public String getWidth ()
  {
    return m_sWidth;
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

  @Nullable
  public String getHeight ()
  {
    return m_sWidth;
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

  public int getMarginWidth ()
  {
    return m_nMarginWidth;
  }

  @Nonnull
  public HCIFrame setMarginWidth (final int nMarginWidth)
  {
    m_nMarginWidth = nMarginWidth;
    return this;
  }

  public int getMarginHeight ()
  {
    return m_nMarginHeight;
  }

  @Nonnull
  public HCIFrame setMarginHeight (final int nMarginHeight)
  {
    m_nMarginHeight = nMarginHeight;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
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

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("src", m_aSrc)
                            .appendIfNotNull ("src", m_aSrc)
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("longDesc", m_sLongDesc)
                            .appendIfNotNull ("scrolling", m_eScrolling)
                            .appendIfNotNull ("align", m_eAlign)
                            .append ("frameBorder", m_bFrameBorder)
                            .appendIfNotNull ("width", m_sWidth)
                            .appendIfNotNull ("height", m_sHeight)
                            .append ("marginWidth", m_nMarginWidth)
                            .append ("marginHeight", m_nMarginHeight)
                            .toString ();
  }
}
