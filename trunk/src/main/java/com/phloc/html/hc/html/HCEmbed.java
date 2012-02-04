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
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;

public class HCEmbed extends AbstractHCElement <HCEmbed>
{
  private ISimpleURL m_aSrc;
  private int m_nWidth = CGlobal.ILLEGAL_UINT;
  private int m_nHeight = CGlobal.ILLEGAL_UINT;
  private String m_sPluginURL;
  private String m_sPluginsPage;
  private boolean m_bHidden = false;
  private boolean m_bAutoStart = false;
  private boolean m_bLoop = false;
  private String m_sPalette;
  private IMimeType m_aType;

  public HCEmbed ()
  {
    super (EHTMLElement.EMBED);
  }

  @Nullable
  public final ISimpleURL getSrc ()
  {
    return m_aSrc;
  }

  @Nonnull
  public HCEmbed setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  @Nonnull
  public final HCEmbed setWidth (final int nWidth)
  {
    m_nWidth = nWidth;
    return this;
  }

  @Nonnull
  public final HCEmbed setHeight (final int nHeight)
  {
    m_nHeight = nHeight;
    return this;
  }

  @Nonnull
  public final HCEmbed setPluginURL (@Nullable final String sPluginURL)
  {
    m_sPluginURL = sPluginURL;
    return this;
  }

  @Nonnull
  public final HCEmbed setPluginsPage (@Nullable final String sPluginsPage)
  {
    m_sPluginsPage = sPluginsPage;
    return this;
  }

  @Nonnull
  public final HCEmbed setHidden (final boolean bHidden)
  {
    m_bHidden = bHidden;
    return this;
  }

  @Nonnull
  public final HCEmbed setAutoStart (final boolean bAutoStart)
  {
    m_bAutoStart = bAutoStart;
    return this;
  }

  @Nonnull
  public final HCEmbed setLoop (final boolean bLoop)
  {
    m_bLoop = bLoop;
    return this;
  }

  @Nonnull
  public final HCEmbed setPalette (@Nullable final String sPalette)
  {
    m_sPalette = sPalette;
    return this;
  }

  @Nonnull
  public final HCEmbed setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Override
  protected void applyProperties (HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (m_nWidth > 0)
      aElement.setAttribute (CHTMLAttributes.WIDTH, Integer.toString (m_nWidth));
    if (m_nHeight > 0)
      aElement.setAttribute (CHTMLAttributes.HEIGHT, Integer.toString (m_nHeight));
    if (StringHelper.hasText (m_sPluginURL))
      aElement.setAttribute (CHTMLAttributes.PLUGINURL, m_sPluginURL);
    if (StringHelper.hasText (m_sPluginsPage))
      aElement.setAttribute (CHTMLAttributes.PLUGINSPAGE, m_sPluginsPage);
    if (m_bHidden)
      aElement.setAttribute (CHTMLAttributes.HIDDEN, Boolean.toString (m_bHidden));
    if (m_bAutoStart)
      aElement.setAttribute (CHTMLAttributes.AUTOSTART, Boolean.toString (m_bAutoStart));
    if (m_bLoop)
      aElement.setAttribute (CHTMLAttributes.LOOP, Boolean.toString (m_bLoop));
    if (StringHelper.hasText (m_sPalette))
      aElement.setAttribute (CHTMLAttributes.PALETTE, m_sPalette);
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
  }

  public String getPlainText ()
  {
    return "";
  }
}
