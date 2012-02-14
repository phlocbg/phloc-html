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

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.IHCLinkType;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * This is a HTML "link" element!
 * 
 * @author philip
 */
public class HCLink extends AbstractHCElement <HCLink>
{
  private IHCLinkType m_aRel;
  private IHCLinkType m_aRev;
  private IMimeType m_aType;
  private ISimpleURL m_aHref;
  private String m_sHrefLang;
  private HCA_Target m_aTarget;
  private String m_sCharset;
  private String m_sMedia;

  public HCLink ()
  {
    super (EHTMLElement.LINK);
  }

  public HCLink (@Nullable final IHCLinkType aRel, @Nullable final ISimpleURL aHref)
  {
    this ();
    setRel (aRel);
    setHref (aHref);
  }

  public HCLink (@Nullable final IHCLinkType eRel, @Nullable final IMimeType aType, @Nullable final ISimpleURL aHref)
  {
    this (eRel, aHref);
    setType (aType);
  }

  @Nullable
  public final IHCLinkType getRel ()
  {
    return m_aRel;
  }

  @Nonnull
  public final HCLink setRel (@Nullable final IHCLinkType aRel)
  {
    m_aRel = aRel;
    return this;
  }

  @Nullable
  public final IHCLinkType getRev ()
  {
    return m_aRev;
  }

  @Nonnull
  public final HCLink setRev (@Nullable final IHCLinkType aRev)
  {
    m_aRev = aRev;
    return this;
  }

  @Nullable
  public final IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public final HCLink setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Nullable
  public final ISimpleURL getHref ()
  {
    return m_aHref;
  }

  @Nonnull
  public final HCLink setHref (@Nullable final ISimpleURL aHref)
  {
    m_aHref = aHref;
    return this;
  }

  @Nullable
  public final String getHrefLang ()
  {
    return m_sHrefLang;
  }

  @Nonnull
  public final HCLink setHrefLang (@Nullable final String sHrefLang)
  {
    m_sHrefLang = sHrefLang;
    return this;
  }

  @Nullable
  public final HCA_Target getTarget ()
  {
    return m_aTarget;
  }

  @Nonnull
  public final HCLink setTarget (@Nullable final HCA_Target aTarget)
  {
    m_aTarget = aTarget;
    return this;
  }

  @Nullable
  public final String getCharset ()
  {
    return m_sCharset;
  }

  @Nonnull
  public final HCLink setCharset (@Nullable final String sCharset)
  {
    m_sCharset = sCharset;
    return this;
  }

  @Nullable
  public final String getMedia ()
  {
    return m_sMedia;
  }

  @Nonnull
  public final HCLink setMedia (@Nullable final String sMedia)
  {
    m_sMedia = sMedia;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_aRel != null)
      aElement.setAttribute (CHTMLAttributes.REL, m_aRel.getAttrValue ());
    if (m_aRev != null)
      aElement.setAttribute (CHTMLAttributes.REV, m_aRev.getAttrValue ());
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    if (m_aHref != null)
      aElement.setAttribute (CHTMLAttributes.HREF, m_aHref.getAsString ());
    if (StringHelper.hasText (m_sHrefLang))
      aElement.setAttribute (CHTMLAttributes.HREFLANG, m_sHrefLang);
    if (m_aTarget != null)
      aElement.setAttribute (CHTMLAttributes.TARGET, m_aTarget.getAttrValue ());
    if (StringHelper.hasText (m_sCharset))
      aElement.setAttribute (CHTMLAttributes.CHARSET, m_sCharset);
    if (StringHelper.hasText (m_sMedia))
      aElement.setAttribute (CHTMLAttributes.MEDIA, m_sMedia);

    if (aConversionSettings.getHTMLVersion ().isPriorToHTML5 ())
    {
      // May not be self-closed for IE
      aElement.appendText ("");
    }
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }
}
