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

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroDocument;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.xml.CXML;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.CHTMLDocTypes;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.html.hc.impl.AbstractHCBaseNode;

/**
 * The node that represents a full HTML document.
 * 
 * @author philip
 */
public class HCHtml extends AbstractHCBaseNode
{
  private final EHTMLVersion m_eHTMLVersion;
  private EHCTextDirection m_eDir;
  private String m_sLang;
  private HCHead m_aHead;
  private HCBody m_aBody;

  // status
  private boolean m_bCopiedOutOfBandNodes = false;

  /**
   * Create a new HTML object, using the default HTML version.
   */
  public HCHtml ()
  {
    // Use the default from the conversion settings provider
    this (HCSettings.getConversionSettingsProvider ().getHTMLVersion ());
  }

  public HCHtml (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("docType");
    m_eHTMLVersion = eHTMLVersion;
  }

  /**
   * Overwrite this method to create a custom {@link HCHead} implementation
   * 
   * @return Never <code>null</code>.
   */
  @Nonnull
  @OverrideOnDemand
  protected HCHead createHead ()
  {
    return new HCHead ();
  }

  /**
   * Overwrite this method to create a custom {@link HCBody} implementation
   * 
   * @return Never <code>null</code>.
   */
  @Nonnull
  @OverrideOnDemand
  protected HCBody createBody ()
  {
    return new HCBody ();
  }

  @Nonnull
  public final HCHtml setDir (@Nullable final EHCTextDirection eDir)
  {
    m_eDir = eDir;
    return this;
  }

  @Nonnull
  public final HCHtml setLang (@Nullable final String sLang)
  {
    m_sLang = sLang;
    return this;
  }

  @Nullable
  public final String getLang ()
  {
    return m_sLang;
  }

  @Nonnull
  public final HCHead getHead ()
  {
    if (m_aHead == null)
    {
      m_aHead = createHead ();
      if (m_aHead == null)
        throw new IllegalStateException ("Created HCHead is null!");
    }
    return m_aHead;
  }

  @Nonnull
  public final HCBody getBody ()
  {
    if (m_aBody == null)
    {
      m_aBody = createBody ();
      if (m_aBody == null)
        throw new IllegalStateException ("Created HCBody is null!");
    }
    return m_aBody;
  }

  @Nonnull
  public final IMicroDocument getAsNode ()
  {
    return getAsNode (new HCConversionSettings (m_eHTMLVersion));
  }

  public final void copyOutOfBandNodesFromBodyToHead (@Nonnull final HCConversionSettings aConversionSettings)
  {
    // If no body is present, there can be no out-of-band nodes!
    if (!m_bCopiedOutOfBandNodes && m_aBody != null)
    {
      // Ensure that out-of-band nodes are handled only once, so that
      // consecutive calls to this method result in the same result!
      m_bCopiedOutOfBandNodes = true;

      // Handle the out of band nodes of the body in the head
      final IHCBaseNode aOufOfBandNode = m_aBody.getOutOfBandNode (aConversionSettings);
      getHead ().handleOutOfBandNode (aConversionSettings, aOufOfBandNode);
    }
  }

  @Nonnull
  public final IMicroDocument getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
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

    // Use the getter, to ensure the elements are not null
    final HCHead aHead = getHead ();
    final HCBody aBody = getBody ();

    // Create body first
    final IMicroNode eBody = aBody.getAsNode (aConversionSettings);
    aRoot.appendChild (eBody);

    // Handle out of band nodes
    copyOutOfBandNodesFromBodyToHead (aConversionSettings);

    // Create head after body but insert it before the body
    final IMicroNode eHead = aHead.getAsNode (aConversionSettings);
    aRoot.insertAtIndex (0, eHead);

    // Done!
    return aDoc;
  }

  @Nonnull
  public String getPlainText ()
  {
    return getBody ().getPlainText ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("HTMLversion", m_eHTMLVersion)
                            .appendIfNotNull ("dir", m_eDir)
                            .appendIfNotNull ("lang", m_sLang)
                            .appendIfNotNull ("head", m_aHead)
                            .appendIfNotNull ("body", m_aBody)
                            .append ("copiedOutOfBandNodes", m_bCopiedOutOfBandNodes)
                            .toString ();
  }
}
