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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.gfx.ScalableSize;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

@SinceHTML5
public class HCSVG extends AbstractHCSVGElement <HCSVG>
{
  private static final long serialVersionUID = -2648539366161645370L;
  private ScalableSize m_aExtent;
  private String m_sViewBox;
  public static final String NAMESPACE_URI = "http://www.w3.org/2000/svg";

  public HCSVG ()
  {
    super (EHTMLElement.SVG);
  }

  @Override
  @OverrideOnDemand
  @Nonnull
  protected IMicroElement createElement (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return new MicroElement (NAMESPACE_URI, EHTMLElement.SVG);
  }

  @Nullable
  public final ScalableSize getExtent ()
  {
    return this.m_aExtent;
  }

  @Nonnull
  public final HCSVG setExtent (@Nullable final ScalableSize aImageData)
  {
    this.m_aExtent = aImageData;
    return this;
  }

  @Nonnull
  public final HCSVG setExtent (@Nonnegative final int nWidth, @Nonnegative final int nHeight)
  {
    return setExtent (new ScalableSize (nWidth, nHeight));
  }

  @Nonnull
  public final HCSVG scaleToWidth (@Nonnegative final int nNewWidth)
  {
    if (this.m_aExtent != null)
      this.m_aExtent = this.m_aExtent.getScaledToWidth (nNewWidth);
    return this;
  }

  @Nonnull
  public final HCSVG scaleToHeight (@Nonnegative final int nNewHeight)
  {
    if (this.m_aExtent != null)
      this.m_aExtent = this.m_aExtent.getScaledToHeight (nNewHeight);
    return this;
  }

  /**
   * Scales the svg so that neither with nor height are exceeded, keeping the
   * aspect ratio.
   *
   * @param nMaxWidth
   *        Maximum with
   * @param nMaxHeight
   *        Maximum height
   * @return the correctly resized svg tag
   */
  @Nonnull
  public final HCSVG scaleBestMatching (@Nonnegative final int nMaxWidth, @Nonnegative final int nMaxHeight)
  {
    if (this.m_aExtent != null)
      this.m_aExtent = this.m_aExtent.getBestMatchingSize (nMaxWidth, nMaxHeight);
    return this;
  }

  public final HCSVG setViewBox (final String sViewBox)
  {
    this.m_sViewBox = sViewBox;
    return this;
  }

  public HCPath addPath ()
  {
    return this.addAndReturnChild (new HCPath ());
  }

  public HCDefs addDefs ()
  {
    return this.addAndReturnChild (new HCDefs ());
  }

  public HCG addG ()
  {
    return this.addAndReturnChild (new HCG ());
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute ("xmlns", NAMESPACE_URI);
    if (this.m_aExtent != null)
    {
      aElement.setAttribute (CHTMLAttributes.WIDTH, this.m_aExtent.getWidth ());
      aElement.setAttribute (CHTMLAttributes.HEIGHT, this.m_aExtent.getHeight ());
    }
    if (StringHelper.hasText (this.m_sViewBox))
    {
      aElement.setAttribute (CHTMLAttributes.VIEWBOX, this.m_sViewBox);
    }
  }
}
