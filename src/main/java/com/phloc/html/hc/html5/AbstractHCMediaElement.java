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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.api5.EHCCORSSettings;
import com.phloc.html.hc.api5.EHCPreload;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithInternalChildren;

@SinceHTML5
public abstract class AbstractHCMediaElement <THISTYPE extends AbstractHCMediaElement <THISTYPE>> extends
                                                                                                  AbstractHCElementWithInternalChildren <THISTYPE, AbstractHCMediaElementChild <?>>
{
  public static final boolean DEFAULT_AUTOPLAY = false;
  public static final boolean DEFAULT_CONTROLS = false;
  public static final boolean DEFAULT_LOOP = false;
  public static final boolean DEFAULT_MUTED = false;

  private boolean m_bAutoPlay = DEFAULT_AUTOPLAY;
  private EHCPreload m_ePreload;
  private boolean m_bControls = DEFAULT_CONTROLS;
  private boolean m_bLoop = DEFAULT_LOOP;
  private boolean m_bMuted = DEFAULT_MUTED;
  private ISimpleURL m_aSrc;
  private EHCCORSSettings m_eCrossOrigin;

  public AbstractHCMediaElement (@Nonnull final EHTMLElement eElement)
  {
    super (eElement);
  }

  @Nonnull
  public final THISTYPE setAutoPlay (final boolean bAutoPlay)
  {
    m_bAutoPlay = bAutoPlay;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setPreload (@Nullable final EHCPreload ePreload)
  {
    m_ePreload = ePreload;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setControls (final boolean bControls)
  {
    m_bControls = bControls;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setLoop (final boolean bLoop)
  {
    m_bLoop = bLoop;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setMuted (final boolean bMuted)
  {
    m_bMuted = bMuted;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setCrossOrigin (@Nullable final EHCCORSSettings eCrossOrigin)
  {
    m_eCrossOrigin = eCrossOrigin;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addSource (@Nullable final HCSource aSource)
  {
    if (aSource != null)
      addChild (aSource);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addTrack (@Nullable final HCTrack aTrack)
  {
    if (aTrack != null)
      addChild (aTrack);
    return thisAsT ();
  }

  @Override
  @Nonnull
  @Nonempty
  protected List <AbstractHCMediaElementChild <?>> getChildrenFormEmitting (@Nonnull @Nonempty final List <AbstractHCMediaElementChild <?>> aChildren)
  {
    // <source> must be before <track>
    final List <AbstractHCMediaElementChild <?>> ret = new ArrayList <AbstractHCMediaElementChild <?>> (aChildren.size ());
    for (final AbstractHCMediaElementChild <?> aChild : aChildren)
      if (aChild.getElement ().equals (EHTMLElement.SOURCE))
        ret.add (aChild);
    for (final AbstractHCMediaElementChild <?> aChild : aChildren)
      if (aChild.getElement ().equals (EHTMLElement.TRACK))
        ret.add (aChild);
    return ret;
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_bAutoPlay)
      aElement.setAttribute (CHTMLAttributes.AUTOPLAY, CHTMLAttributeValues.AUTOPLAY);
    if (m_ePreload != null)
      aElement.setAttribute (CHTMLAttributes.PRELOAD, m_ePreload.getAttrValue ());
    if (m_bControls)
      aElement.setAttribute (CHTMLAttributes.CONTROLS, CHTMLAttributeValues.CONTROLS);
    if (m_bLoop)
      aElement.setAttribute (CHTMLAttributes.LOOP, CHTMLAttributeValues.LOOP);
    if (m_bMuted)
      aElement.setAttribute (CHTMLAttributes.MUTED, CHTMLAttributeValues.MUTED);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (m_eCrossOrigin != null)
      aElement.setAttribute (CHTMLAttributes.CROSSORIGIN, m_eCrossOrigin.getAttrValue ());
  }
}
