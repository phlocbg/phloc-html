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

import java.util.ArrayList;
import java.util.List;

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
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.customize.IHCCustomizer;
import com.phloc.html.hc.impl.AbstractHCBaseNode;
import com.phloc.html.hc.utils.HCOutOfBandHandler;

/**
 * The node that represents a full HTML document.
 * 
 * @author philip
 */
public class HCHtml extends AbstractHCBaseNode
{
  private EHCTextDirection m_eDir;
  private String m_sLang;
  private HCHead m_aHead;
  private HCBody m_aBody;

  // status
  private boolean m_bPrepared = false;

  /**
   * Create a new HTML object
   */
  public HCHtml ()
  {}

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

  @Nullable
  public final EHCTextDirection getDir ()
  {
    return m_eDir;
  }

  @Nonnull
  public final HCHtml setDir (@Nullable final EHCTextDirection eDir)
  {
    m_eDir = eDir;
    return this;
  }

  @Nullable
  public final String getLang ()
  {
    return m_sLang;
  }

  @Nonnull
  public final HCHtml setLang (@Nullable final String sLang)
  {
    m_sLang = sLang;
    return this;
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

  private static void _recursiveCustomizeElements (@Nonnull final IHCHasChildren aParentElement,
                                                   @Nonnull final IHCCustomizer aCustomizer,
                                                   @Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (aParentElement.hasChildren ())
    {
      final boolean bParentIsElement = aParentElement instanceof IHCNodeWithChildren <?>;
      for (final IHCBaseNode aChild : aParentElement.getChildren ())
      {
        if (bParentIsElement && aChild instanceof IHCElement <?>)
          aCustomizer.customizeHCElement ((IHCNodeWithChildren <?>) aParentElement,
                                          (IHCElement <?>) aChild,
                                          eHTMLVersion);

        // Recurse deeper?
        if (aChild instanceof IHCHasChildren)
          _recursiveCustomizeElements ((IHCHasChildren) aChild, aCustomizer, eHTMLVersion);
      }
    }
  }

  public static void customizeAndExtractOutOfBandNodes (@Nonnull final IHCNode aBaseNode,
                                                        @Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                                        @Nonnull final List <IHCBaseNode> aExtractedOutOfBandNodes)
  {
    if (aBaseNode instanceof IHCHasChildren)
    {
      final IHCHasChildren aHasChildren = (IHCHasChildren) aBaseNode;
      // Customize element, before extracting out-of-band nodes, in case the
      // customizer adds some out-of-band nodes as well
      _recursiveCustomizeElements (aHasChildren,
                                   aConversionSettings.getCustomizer (),
                                   aConversionSettings.getHTMLVersion ());

      if (aConversionSettings.extractOutOfBandNodes ())
      {
        // Extract all out-of-band nodes
        HCOutOfBandHandler.recursiveExtractOutOfBandNodes (aHasChildren, aExtractedOutOfBandNodes);
      }
    }
  }

  @Nonnull
  public final IMicroDocument getAsNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    final EHTMLVersion eHTMLVersion = aConversionSettings.getHTMLVersion ();

    // Note: we need to clone the doctype, because otherwise the object would
    // already have a parent assigned if "getAsNode" is called more than once!
    final IMicroDocument aDoc = new MicroDocument (eHTMLVersion.getDocType ().getClone ());
    final IMicroElement aRoot = aDoc.appendElement (eHTMLVersion.getDocType ().getQualifiedName ());
    if (m_eDir != null)
      aRoot.setAttribute (CHTMLAttributes.DIR, m_eDir.getAttrValue ());
    if (StringHelper.hasText (m_sLang))
    {
      // Both "xml:lang" and "lang"
      aRoot.setAttribute (CXML.XML_ATTR_LANG, m_sLang);
      aRoot.setAttribute ("lang", m_sLang);
    }
    aRoot.setAttribute (CXML.XML_ATTR_XMLNS, eHTMLVersion.getXMLNamespace ());

    // Ensure they are not null
    final HCBody aBody = getBody ();
    final HCHead aHead = getHead ();

    if (!m_bPrepared)
    {
      m_bPrepared = true;

      // Extract all out-of-band nodes
      final List <IHCBaseNode> aExtractedOutOfBandNodes = new ArrayList <IHCBaseNode> ();
      customizeAndExtractOutOfBandNodes (aBody, aConversionSettings, aExtractedOutOfBandNodes);

      // Call out-of-band node handler
      aConversionSettings.getCustomizer ().handleOutOfBandNodes (aExtractedOutOfBandNodes, aHead, aBody);
    }

    // Use the getter, to ensure the elements are not null
    final IMicroNode eBody = aBody.getAsNode (aConversionSettings);
    aRoot.appendChild (eBody);

    // Create head after body but insert it before the body
    final IMicroNode eHead = aHead.getAsNode (aConversionSettings);
    aRoot.insertAtIndex (0, eHead);

    // Done!
    return aDoc;
  }

  public boolean isPrepared ()
  {
    return m_bPrepared;
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return StringHelper.getConcatenatedOnDemand (getHead ().getPlainText (), " ", getBody ().getPlainText ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("dir", m_eDir)
                            .appendIfNotNull ("lang", m_sLang)
                            .appendIfNotNull ("head", m_aHead)
                            .appendIfNotNull ("body", m_aBody)
                            .append ("prepared", m_bPrepared)
                            .toString ();
  }
}
