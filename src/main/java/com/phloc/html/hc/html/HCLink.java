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
  private IHCLinkType m_eRel;
  private IHCLinkType m_eRev;
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

  public HCLink (@Nullable final IHCLinkType eRel, @Nullable final ISimpleURL aHref)
  {
    this ();
    setRel (eRel);
    setHref (aHref);
  }

  public HCLink (@Nullable final IHCLinkType eRel, @Nullable final IMimeType aType, @Nullable final ISimpleURL aHref)
  {
    this (eRel, aHref);
    setType (aType);
  }

  @Nonnull
  public final HCLink setRel (@Nullable final IHCLinkType eRel)
  {
    m_eRel = eRel;
    return this;
  }

  @Nonnull
  public final HCLink setRev (@Nullable final IHCLinkType eRev)
  {
    m_eRev = eRev;
    return this;
  }

  @Nonnull
  public final HCLink setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Nonnull
  public final HCLink setHref (@Nullable final ISimpleURL aHref)
  {
    m_aHref = aHref;
    return this;
  }

  @Nonnull
  public final HCLink setHrefLang (@Nullable final String sHrefLang)
  {
    m_sHrefLang = sHrefLang;
    return this;
  }

  @Nonnull
  public final HCLink setTarget (@Nullable final HCA_Target aTarget)
  {
    m_aTarget = aTarget;
    return this;
  }

  @Nonnull
  public final HCLink setCharset (@Nullable final String sCharset)
  {
    m_sCharset = sCharset;
    return this;
  }

  @Nonnull
  public final HCLink setMedia (@Nullable final String sMedia)
  {
    m_sMedia = sMedia;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_eRel != null)
      aElement.setAttribute (CHTMLAttributes.REL, m_eRel.getAttrValue ());
    if (m_eRev != null)
      aElement.setAttribute (CHTMLAttributes.REV, m_eRev.getAttrValue ());
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
    // May not be self-closed for IE
    aElement.appendText ("");
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }
}
