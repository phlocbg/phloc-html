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
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.css.media.CSSMediaList;
import com.phloc.css.media.ECSSMedium;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCLinkType;
import com.phloc.html.hc.api.IHCCSSNode;
import com.phloc.html.hc.api.IHCLinkType;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;link&gt; element
 *
 * @author philip
 */
public class HCLink extends AbstractHCElement <HCLink> implements IHCCSSNode
{
  private IHCLinkType m_aRel;
  private IHCLinkType m_aRev;
  private IMimeType m_aType;
  private ISimpleURL m_aHref;
  private String m_sHrefLang;
  private HCA_Target m_aTarget;
  private String m_sCharset;
  private CSSMediaList m_aMediaList;

  public HCLink ()
  {
    super (EHTMLElement.LINK);
  }

  public boolean isInlineCSS ()
  {
    return false;
  }

  @Nullable
  public IHCLinkType getRel ()
  {
    return m_aRel;
  }

  @Nonnull
  public HCLink setRel (@Nullable final IHCLinkType aRel)
  {
    m_aRel = aRel;
    return this;
  }

  @Nullable
  public IHCLinkType getRev ()
  {
    return m_aRev;
  }

  @Nonnull
  public HCLink setRev (@Nullable final IHCLinkType aRev)
  {
    m_aRev = aRev;
    return this;
  }

  @Nullable
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public HCLink setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Nullable
  public ISimpleURL getHref ()
  {
    return m_aHref;
  }

  @Nonnull
  public HCLink setHref (@Nullable final ISimpleURL aHref)
  {
    m_aHref = aHref;
    return this;
  }

  @Nullable
  public String getHrefLang ()
  {
    return m_sHrefLang;
  }

  @Nonnull
  public HCLink setHrefLang (@Nullable final String sHrefLang)
  {
    m_sHrefLang = sHrefLang;
    return this;
  }

  @Nullable
  public HCA_Target getTarget ()
  {
    return m_aTarget;
  }

  @Nonnull
  public HCLink setTarget (@Nullable final HCA_Target aTarget)
  {
    m_aTarget = aTarget;
    return this;
  }

  @Nullable
  public String getCharset ()
  {
    return m_sCharset;
  }

  @Nonnull
  public HCLink setCharset (@Nullable final String sCharset)
  {
    m_sCharset = sCharset;
    return this;
  }

  @Nullable
  public CSSMediaList getMedia ()
  {
    return m_aMediaList;
  }

  @Nonnull
  public HCLink setMedia (@Nullable final CSSMediaList aMediaList)
  {
    m_aMediaList = aMediaList;
    return this;
  }

  @Nonnull
  public HCLink addMedium (@Nonnull final ECSSMedium eMedium)
  {
    if (m_aMediaList == null)
      m_aMediaList = new CSSMediaList ();
    m_aMediaList.addMedium (eMedium);
    return this;
  }

  @Nonnull
  public HCLink removeAllMedia ()
  {
    m_aMediaList = null;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
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
    if (m_aMediaList != null && m_aMediaList.hasAnyMedia ())
      aElement.setAttribute (CHTMLAttributes.MEDIA, m_aMediaList.getMediaString ());

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

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("rel", m_aRel)
                            .appendIfNotNull ("rev", m_aRev)
                            .appendIfNotNull ("type", m_aType)
                            .appendIfNotNull ("href", m_aHref)
                            .appendIfNotNull ("hrefLang", m_sHrefLang)
                            .appendIfNotNull ("target", m_aTarget)
                            .appendIfNotNull ("charset", m_sCharset)
                            .appendIfNotNull ("mediaList", m_aMediaList)
                            .toString ();
  }

  /**
   * Shortcut to create a &lt;link&gt; element specific to CSS
   *
   * @param aCSSURL
   *        The CSS URL to be referenced
   * @return Never <code>null</code>.
   */
  @Nonnull
  public static HCLink createCSSLink (@Nonnull final ISimpleURL aCSSURL)
  {
    return new HCLink ().setRel (EHCLinkType.STYLESHEET).setType (CMimeType.TEXT_CSS).setHref (aCSSURL);
  }
}
