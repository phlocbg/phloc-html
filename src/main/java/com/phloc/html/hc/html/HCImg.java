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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.gfx.ScalableSize;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;

public class HCImg extends AbstractHCElement <HCImg>
{
  private String m_sSrc;
  private ScalableSize m_aExtent;
  private String m_sAlt;

  public HCImg ()
  {
    super (EHTMLElement.IMG);
  }

  public HCImg (@Nullable final String sSrc)
  {
    this ();
    setSrc (sSrc);
  }

  @Nullable
  public final String getSrc ()
  {
    return m_sSrc;
  }

  @Nonnull
  public HCImg setSrc (@Nullable final String sSrc)
  {
    checkIfLinkIsMasked (sSrc);
    m_sSrc = sSrc;
    return this;
  }

  @Nonnull
  public final HCImg setExtent (@Nullable final ScalableSize aImageData)
  {
    m_aExtent = aImageData;
    return this;
  }

  @Nonnull
  public final HCImg setExtent (@Nonnegative final int nWidth, @Nonnegative final int nHeight)
  {
    return setExtent (new ScalableSize (nWidth, nHeight));
  }

  @Nonnull
  public final HCImg scaleToWidth (@Nonnegative final int nNewWidth)
  {
    if (m_aExtent != null)
      m_aExtent = m_aExtent.getScaledToWidth (nNewWidth);
    return this;
  }

  @Nonnull
  public final HCImg scaleToHeight (@Nonnegative final int nNewHeight)
  {
    if (m_aExtent != null)
      m_aExtent = m_aExtent.getScaledToHeight (nNewHeight);
    return this;
  }

  /**
   * Scales the image so that neither with nor height are exceeded, keeping the
   * aspect ratio.
   * 
   * @param nMaxWidth
   * @param nMaxHeight
   * @return the correctly resized image tag
   */
  @Nonnull
  public final HCImg scaleBestMatching (@Nonnegative final int nMaxWidth, @Nonnegative final int nMaxHeight)
  {
    if (m_aExtent != null)
      m_aExtent = m_aExtent.getBestMatchingSize (nMaxWidth, nMaxHeight);
    return this;
  }

  @Nonnull
  public final HCImg setAlt (@Nullable final String sAlt)
  {
    m_sAlt = sAlt;
    return this;
  }

  private String _getRealAlt ()
  {
    String sRealAlt = m_sAlt;
    if (StringHelper.hasNoText (sRealAlt))
    {
      // If no alternative text is present, use the title
      sRealAlt = getTitle ();
    }
    return sRealAlt;
  }

  @Override
  protected void applyProperties (final HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    if (m_sSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_sSrc);
    if (m_aExtent != null)
    {
      aElement.setAttribute (CHTMLAttributes.WIDTH, Integer.toString (m_aExtent.getWidth ()));
      aElement.setAttribute (CHTMLAttributes.HEIGHT, Integer.toString (m_aExtent.getHeight ()));
    }

    // Ensure that the alt attribute is present
    aElement.setAttribute (CHTMLAttributes.ALT, _getRealAlt ());

    // If the title is empty, but the alternative text is present, use the
    // alternative text as title
    if (StringHelper.hasNoText (getTitle ()) && StringHelper.hasText (m_sAlt))
      aElement.setAttribute (CHTMLAttributes.TITLE, m_sAlt);
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }
}
