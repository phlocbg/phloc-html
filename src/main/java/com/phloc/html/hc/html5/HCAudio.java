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
package com.phloc.html.hc.html5;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.api5.EHCPreload;
import com.phloc.html.hc.impl.AbstractHCElementWithInternalChildren;

@SinceHTML5
public final class HCAudio extends AbstractHCElementWithInternalChildren <HCAudio, HCSource>
{
  public static final boolean DEFAULT_AUTOPLAY = false;
  public static final boolean DEFAULT_CONTROLS = false;
  public static final boolean DEFAULT_LOOP = false;

  private boolean m_bAutoPlay = DEFAULT_AUTOPLAY;
  private boolean m_bControls = DEFAULT_CONTROLS;
  private boolean m_bLoop = DEFAULT_LOOP;
  private EHCPreload m_ePreload;
  private ISimpleURL m_aSrc;

  public HCAudio ()
  {
    super (EHTMLElement.AUDIO);
  }

  @Nonnull
  public HCAudio setAutoPlay (final boolean bAutoPlay)
  {
    m_bAutoPlay = bAutoPlay;
    return this;
  }

  @Nonnull
  public HCAudio setControls (final boolean bControls)
  {
    m_bControls = bControls;
    return this;
  }

  @Nonnull
  public HCAudio setLoop (final boolean bLoop)
  {
    m_bLoop = bLoop;
    return this;
  }

  @Nonnull
  public HCAudio setPreload (@Nullable final EHCPreload ePreload)
  {
    m_ePreload = ePreload;
    return this;
  }

  @Nonnull
  public HCAudio setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  @Nonnull
  public HCAudio addSource (@Nullable final HCSource aSource)
  {
    if (aSource != null)
      addChild (aSource);
    return this;
  }

  @Override
  protected void applyProperties (@Nonnull final HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    if (m_bAutoPlay)
      aElement.setAttribute (CHTMLAttributes.AUTOPLAY, CHTMLAttributeValues.AUTOPLAY);
    if (m_bControls)
      aElement.setAttribute (CHTMLAttributes.CONTROLS, CHTMLAttributeValues.CONTROLS);
    if (m_bLoop)
      aElement.setAttribute (CHTMLAttributes.LOOP, CHTMLAttributeValues.LOOP);
    if (m_ePreload != null)
      aElement.setAttribute (CHTMLAttributes.PRELOAD, m_ePreload.getAttrValue ());
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
  }
}
