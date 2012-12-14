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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;embed&gt; element
 * 
 * @author philip
 */
public class HCEmbed extends AbstractHCElement <HCEmbed>
{
  public static final boolean DEFAULT_AUTO_START = false;
  public static final boolean DEFAULT_LOOP = false;

  private ISimpleURL m_aSrc;
  private int m_nWidth = CGlobal.ILLEGAL_UINT;
  private int m_nHeight = CGlobal.ILLEGAL_UINT;
  private String m_sPluginURL;
  private String m_sPluginsPage;
  private boolean m_bAutoStart = DEFAULT_AUTO_START;
  private boolean m_bLoop = DEFAULT_LOOP;
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

  public final int getWidth ()
  {
    return m_nWidth;
  }

  @Nonnull
  public final HCEmbed setWidth (final int nWidth)
  {
    m_nWidth = nWidth;
    return this;
  }

  public final int getHeight ()
  {
    return m_nHeight;
  }

  @Nonnull
  public final HCEmbed setHeight (final int nHeight)
  {
    m_nHeight = nHeight;
    return this;
  }

  @Nullable
  public final String getPluginURL ()
  {
    return m_sPluginURL;
  }

  @Nonnull
  public final HCEmbed setPluginURL (@Nullable final String sPluginURL)
  {
    m_sPluginURL = sPluginURL;
    return this;
  }

  @Nullable
  public final String getPluginsPage ()
  {
    return m_sPluginsPage;
  }

  @Nonnull
  public final HCEmbed setPluginsPage (@Nullable final String sPluginsPage)
  {
    m_sPluginsPage = sPluginsPage;
    return this;
  }

  public final boolean isAutoStart ()
  {
    return m_bAutoStart;
  }

  @Nonnull
  public final HCEmbed setAutoStart (final boolean bAutoStart)
  {
    m_bAutoStart = bAutoStart;
    return this;
  }

  public final boolean isLoop ()
  {
    return m_bLoop;
  }

  @Nonnull
  public final HCEmbed setLoop (final boolean bLoop)
  {
    m_bLoop = bLoop;
    return this;
  }

  @Nullable
  public final String getPalette ()
  {
    return m_sPalette;
  }

  @Nonnull
  public final HCEmbed setPalette (@Nullable final String sPalette)
  {
    m_sPalette = sPalette;
    return this;
  }

  @Nullable
  public final IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public final HCEmbed setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (m_nWidth > 0)
      aElement.setAttribute (CHTMLAttributes.WIDTH, m_nWidth);
    if (m_nHeight > 0)
      aElement.setAttribute (CHTMLAttributes.HEIGHT, m_nHeight);
    if (StringHelper.hasText (m_sPluginURL))
      aElement.setAttribute (CHTMLAttributes.PLUGINURL, m_sPluginURL);
    if (StringHelper.hasText (m_sPluginsPage))
      aElement.setAttribute (CHTMLAttributes.PLUGINSPAGE, m_sPluginsPage);
    if (m_bAutoStart)
      aElement.setAttribute (CHTMLAttributes.AUTOSTART, Boolean.toString (m_bAutoStart));
    if (m_bLoop)
      aElement.setAttribute (CHTMLAttributes.LOOP, Boolean.toString (m_bLoop));
    if (StringHelper.hasText (m_sPalette))
      aElement.setAttribute (CHTMLAttributes.PALETTE, m_sPalette);
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("src", m_aSrc)
                            .append ("width", m_nWidth)
                            .append ("height", m_nHeight)
                            .appendIfNotNull ("pluginURL", m_sPluginURL)
                            .appendIfNotNull ("pluginsPage", m_sPluginsPage)
                            .append ("autoStart", m_bAutoStart)
                            .append ("loop", m_bLoop)
                            .appendIfNotNull ("palette", m_sPalette)
                            .appendIfNotNull ("type", m_aType)
                            .toString ();
  }
}
