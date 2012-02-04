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

import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroDocument;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.xml.CXML;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.CHTMLDocTypes;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.impl.AbstractHCBaseNode;

/**
 * The node that represents a full HTML document.
 * 
 * @author philip
 */
public final class HCHtml extends AbstractHCBaseNode
{
  private final EHTMLVersion m_eHTMLVersion;
  private EHCTextDirection m_eDir;
  private String m_sLang;
  private final HCHead m_aHead = new HCHead ();
  private final HCBody m_aBody = new HCBody ();

  /**
   * Create a new HTML object, using the default HTML version.
   */
  public HCHtml ()
  {
    this (EHTMLVersion.DEFAULT);
  }

  public HCHtml (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("docType");
    m_eHTMLVersion = eHTMLVersion;
  }

  @Nonnull
  public HCHtml setDir (@Nullable final EHCTextDirection eDir)
  {
    m_eDir = eDir;
    return this;
  }

  @Nonnull
  public HCHtml setLang (@Nullable final String sLang)
  {
    m_sLang = sLang;
    return this;
  }

  @Nullable
  public String getLang ()
  {
    return m_sLang;
  }

  @Nonnull
  public HCHead getHead ()
  {
    return m_aHead;
  }

  @Nonnull
  public HCBody getBody ()
  {
    return m_aBody;
  }

  @Nonnull
  public IMicroDocument getAsNode ()
  {
    return getAsNode (new HCConversionSettings (m_eHTMLVersion));
  }

  @Nonnull
  public IMicroDocument getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    // Note: we need to clone the doctype, because otherwise the object would
    // already have a parent assigned if "getAsNode" is called more than once!
    final IMicroDocument aDoc = new MicroDocument (m_eHTMLVersion.getDocType ().getClone ());
    final IMicroElement aRoot = aDoc.appendElement (m_eHTMLVersion.getDocType ().getQualifiedName ());
    if (m_eDir != null)
      aRoot.setAttribute (CHTMLAttributes.DIR, m_eDir.getAttrValue ());
    if (StringHelper.hasText (m_sLang))
    {
      // Both "xml:lang" and "lang"
      aRoot.setAttribute (CXML.XML_ATTR_LANG, m_sLang);
      aRoot.setAttribute ("lang", m_sLang);
    }
    aRoot.setAttribute (CXML.XML_ATTR_XMLNS, CHTMLDocTypes.DOCTYPE_XHTML_URI);

    // Create body first
    final IMicroNode eBody = m_aBody.getAsNode (aConversionSettings);
    aRoot.appendChild (eBody);

    // Handle the out of band nodes in the head
    final IHCBaseNode aOufOfBandNode = m_aBody.getOutOfBandNode ();
    m_aHead.handleOutOfBandNode (aConversionSettings, aOufOfBandNode);

    // Create head (after body)
    final IMicroNode eHead = m_aHead.getAsNode (aConversionSettings);
    aRoot.insertBefore (eHead, eBody);
    return aDoc;
  }

  @Nonnull
  public String getPlainText ()
  {
    return m_aBody.getPlainText ();
  }
}
