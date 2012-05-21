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
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.locale.LocaleUtils;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.state.EChange;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.commons.xml.CXML;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.api.EHCLinkType;
import com.phloc.html.hc.api.IHCLinkType;
import com.phloc.html.hc.api.IHCOutOfBandNodeHandler;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCBaseNode;
import com.phloc.html.hc.impl.HCNodeList;
import com.phloc.html.js.provider.CollectingJSCodeProvider;
import com.phloc.html.meta.EStandardMetaElement;
import com.phloc.html.meta.IMetaElement;
import com.phloc.html.resource.css.ICSSExternal;
import com.phloc.html.resource.css.ICSSHTMLDefinition;
import com.phloc.html.resource.js.IJSHTMLDefinition;
import com.phloc.html.resource.js.JSInline;

/**
 * Represents an HTML &lt;head&gt; element
 * 
 * @author philip
 */
public class HCHead extends AbstractHCBaseNode
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCHead.class);

  private String m_sProfile;
  private String m_sPageTitle;
  private String m_sBaseHref;
  private HCA_Target m_aBaseTarget;
  private final Map <String, IMetaElement> m_aMetaElements = new LinkedHashMap <String, IMetaElement> ();
  private final List <HCLink> m_aLinks = new ArrayList <HCLink> ();
  private final List <ICSSHTMLDefinition> m_aCSS = new ArrayList <ICSSHTMLDefinition> ();
  private final List <IJSHTMLDefinition> m_aJS = new ArrayList <IJSHTMLDefinition> ();
  private final List <IHCBaseNode> m_aCustomOutOfBandNodes = new ArrayList <IHCBaseNode> ();
  private IHCOutOfBandNodeHandler m_aOutOfBandHandler;

  public HCHead ()
  {}

  public HCHead (@Nullable final String sPageTitle)
  {
    setPageTitle (sPageTitle);
  }

  @Nullable
  public String getProfile ()
  {
    return m_sProfile;
  }

  @Nonnull
  public HCHead setProfile (@Nullable final String sProfile)
  {
    m_sProfile = sProfile;
    return this;
  }

  @Nullable
  public String getPageTitle ()
  {
    return m_sPageTitle;
  }

  @Nonnull
  public HCHead setPageTitle (@Nullable final String sPageTitle)
  {
    m_sPageTitle = sPageTitle;
    return this;
  }

  @Nullable
  public String getBaseHref ()
  {
    return m_sBaseHref;
  }

  @Nonnull
  public HCHead setBaseHref (@Nullable final String sBaseHref)
  {
    m_sBaseHref = sBaseHref;
    return this;
  }

  @Nullable
  public HCA_Target getBaseTarget ()
  {
    return m_aBaseTarget;
  }

  @Nonnull
  public HCHead setBaseTarget (@Nullable final HCA_Target aTarget)
  {
    m_aBaseTarget = aTarget;
    return this;
  }

  @Nonnull
  public HCHead addMetaElement (@Nonnull final IMetaElement aMetaElement)
  {
    if (aMetaElement == null)
      throw new NullPointerException ("metaElement");
    m_aMetaElements.put (aMetaElement.getName (), aMetaElement);
    return this;
  }

  @Nonnull
  public EChange removeMetaElement (@Nullable final String sMetaElementName)
  {
    return EChange.valueOf (m_aMetaElements.remove (sMetaElementName) != null);
  }

  @Nonnull
  @ReturnsImmutableObject
  public Collection <IMetaElement> getMetaElements ()
  {
    return ContainerHelper.makeUnmodifiable (m_aMetaElements.values ());
  }

  @Nonnull
  public HCHead setShortcutIconHref (@Nullable final ISimpleURL aShortcutIconHref)
  {
    if (aShortcutIconHref == null)
    {
      // Remove the 2 link types again
      removeLinkOfRel (EHCLinkType.SHORTCUT_ICON);
      removeLinkOfRel (EHCLinkType.ICON);
    }
    else
    {
      addLink (new HCLink (EHCLinkType.SHORTCUT_ICON, aShortcutIconHref));
      // Required for IE:
      addLink (new HCLink (EHCLinkType.ICON, CMimeType.IMAGE_ICON, aShortcutIconHref));
    }
    return this;
  }

  /**
   * Add a link object to the head.
   * 
   * @param aLink
   *        The link to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addLink (@Nonnull final HCLink aLink)
  {
    if (aLink == null)
      throw new NullPointerException ("link");
    m_aLinks.add (aLink);
    return this;
  }

  @Nonnull
  public EChange removeLinkOfRel (@Nonnull final IHCLinkType aLinkType)
  {
    final int nMax = m_aLinks.size ();
    for (int i = 0; i < nMax; ++i)
    {
      final HCLink aLink = m_aLinks.get (i);
      if (aLink.getRel ().equals (aLinkType))
      {
        m_aLinks.remove (i);
        return EChange.CHANGED;
      }
    }
    return EChange.UNCHANGED;
  }

  @Nonnull
  @ReturnsImmutableObject
  public List <HCLink> getLinks ()
  {
    return ContainerHelper.makeUnmodifiable (m_aLinks);
  }

  @Nonnull
  public HCHead addCSS (@Nonnull final ICSSHTMLDefinition aCSS)
  {
    if (aCSS == null)
      throw new NullPointerException ("css");
    m_aCSS.add (aCSS);
    return this;
  }

  @Nonnull
  public HCHead addCSS (@Nonnegative final int nIndex, @Nonnull final ICSSHTMLDefinition aCSS)
  {
    if (aCSS == null)
      throw new NullPointerException ("css");
    m_aCSS.add (nIndex, aCSS);
    return this;
  }

  @Nonnegative
  public int getCSSCount ()
  {
    return m_aCSS.size ();
  }

  @Nonnull
  @ReturnsImmutableObject
  public List <ICSSHTMLDefinition> getAllCSS ()
  {
    return ContainerHelper.makeUnmodifiable (m_aCSS);
  }

  public void removeAllCSS ()
  {
    m_aCSS.clear ();
  }

  @Nonnull
  public HCHead addJS (@Nonnull final IJSHTMLDefinition aJS)
  {
    if (aJS == null)
      throw new NullPointerException ("js");
    m_aJS.add (aJS);
    return this;
  }

  @Nonnull
  public HCHead addJS (@Nonnegative final int nIndex, @Nonnull final IJSHTMLDefinition aJS)
  {
    if (aJS == null)
      throw new NullPointerException ("js");
    m_aJS.add (nIndex, aJS);
    return this;
  }

  @Nonnegative
  public int getJSCount ()
  {
    return m_aJS.size ();
  }

  @Nonnull
  @ReturnsImmutableObject
  public List <IJSHTMLDefinition> getJS ()
  {
    return ContainerHelper.makeUnmodifiable (m_aJS);
  }

  public void removeAllJS ()
  {
    m_aJS.clear ();
  }

  private static void _recursiveAddFlattened (@Nullable final IHCBaseNode aOutOfBandNode,
                                              @Nonnull final List <IHCBaseNode> aRealList)
  {
    if (aOutOfBandNode != null)
    {
      // Only check HCNodeList and not IHCNodeWithChildren because other
      // surrounding elements would not be handled correctly!
      if (aOutOfBandNode instanceof HCNodeList)
      {
        final HCNodeList x = (HCNodeList) aOutOfBandNode;
        if (x.hasChildren ())
          for (final IHCBaseNode aChild : x.getChildren ())
            _recursiveAddFlattened (aChild, aRealList);
      }
      else
        aRealList.add (aOutOfBandNode);
    }
  }

  /**
   * Set a custom of of band handler, that performs the actions
   * 
   * @param aOutOfBandHandler
   *        The new out of band handler. May be <code>null</code>.
   */
  public void setOutOfBandHandler (@Nullable final IHCOutOfBandNodeHandler aOutOfBandHandler)
  {
    m_aOutOfBandHandler = aOutOfBandHandler;
  }

  /**
   * @param aConversionSettings
   * @param aOutOfBandNode
   */
  @Deprecated
  public void handleOutOfBandNode (@Nonnull final HCConversionSettings aConversionSettings,
                                   @Nullable final IHCBaseNode aOutOfBandNode)
  {
    handleOutOfBandNode (aOutOfBandNode);
  }

  public void handleOutOfBandNode (@Nullable final IHCBaseNode aOutOfBandNode)
  {
    // Only do something if there is something out of band
    if (aOutOfBandNode != null)
    {
      if (m_aOutOfBandHandler != null)
      {
        // We have a special handler installed!
        m_aOutOfBandHandler.handleOutOfBandNode (aOutOfBandNode);
      }
      else
      {
        // Flatten list
        final List <IHCBaseNode> aRealList = new ArrayList <IHCBaseNode> ();
        _recursiveAddFlattened (aOutOfBandNode, aRealList);

        final CollectingJSCodeProvider aJS = new CollectingJSCodeProvider ();
        for (final IHCBaseNode aNode : aRealList)
        {
          if (aNode instanceof HCScript)
            aJS.append (((HCScript) aNode).getJSContent ());
          else
            m_aCustomOutOfBandNodes.add (aNode);
        }
        if (aJS.length () > 0)
        {
          // Ensure the inline JS is executed after the document has been loaded
          // Note: has dependency to jQuery
          addJS (new JSInline (aJS.prepend ("$(document).ready(function() {").append ("});")));
        }
      }
    }
  }

  @OverrideOnDemand
  protected void emitLinks (@Nonnull final IMicroElement eHead, @Nonnull final HCConversionSettings aConversionSettings)
  {
    for (final HCLink aLink : m_aLinks)
      eHead.appendChild (aLink.getAsNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void emitCSS (@Nonnull final IMicroElement eHead, @Nonnull final HCConversionSettings aConversionSettings)
  {
    int nCSSExternals = 0;
    for (final ICSSHTMLDefinition aCSS : m_aCSS)
    {
      if (aCSS instanceof ICSSExternal)
        ++nCSSExternals;
      eHead.appendChild (aCSS.getAsMicroNode (aConversionSettings));
    }

    // Sources:
    // http://acidmartin.wordpress.com/2008/11/25/the-32-external-css-files-limitation-of-internet-explorer-and-more/
    // http://social.msdn.microsoft.com/Forums/en-US/iewebdevelopment/thread/ad1b6e88-bbfa-4cc4-9e95-3889b82a7c1d
    if (nCSSExternals > 31 && !GlobalDebug.isDebugMode ())
      s_aLogger.warn ("You are including more than 31 CSS files (" +
                      nCSSExternals +
                      ") in your request, which will be ignored by Internet Explorer (at least up to version 8)!");
  }

  @OverrideOnDemand
  protected void emitJS (@Nonnull final IMicroElement eHead, @Nonnull final HCConversionSettings aConversionSettings)
  {
    for (final IJSHTMLDefinition aJS : m_aJS)
      eHead.appendChild (aJS.getAsMicroNode (aConversionSettings));
  }

  @Nonnull
  public final IMicroNode getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    final boolean bAtLeastHTML5 = aConversionSettings.getHTMLVersion ().isAtLeastHTML5 ();

    final IMicroElement eHead = new MicroElement (EHTMLElement.HEAD.getElementName ());
    if (StringHelper.hasText (m_sProfile))
      eHead.setAttribute (CHTMLAttributes.PROFILE, m_sProfile);

    // Append meta element first for charset encoding!
    for (final Map.Entry <String, IMetaElement> aEntry : m_aMetaElements.entrySet ())
    {
      final String sKey = aEntry.getKey ();
      final IMetaElement aMetaElement = aEntry.getValue ();

      // determine whether the key is an "http-equiv" or a "name"
      final boolean bIsHttpEquiv = aMetaElement.isHttpEquiv () || EStandardMetaElement.isHttpEquivMetaElement (sKey);

      for (final Map.Entry <Locale, String> aMetaEntry : aMetaElement.getContent ().entrySet ())
      {
        final IMicroElement aMeta = eHead.appendElement (EHTMLElement.META.getElementName ());
        aMeta.setAttribute (bIsHttpEquiv ? CHTMLAttributes.HTTP_EQUIV : CHTMLAttributes.NAME, sKey);
        aMeta.setAttribute (CHTMLAttributes.CONTENT, aMetaEntry.getValue ());
        final Locale aContentLocale = aMetaEntry.getKey ();
        if (aContentLocale != null && !LocaleUtils.isSpecialLocale (aContentLocale))
        {
          aMeta.setAttribute (CXML.XML_ATTR_LANG, aContentLocale.toString ());
          if (bAtLeastHTML5)
          {
            // When the attribute xml:lang in no namespace is specified, the
            // element must also have the attribute lang present with the same
            // value
            aMeta.setAttribute (CHTMLAttributes.LANG, aContentLocale.toString ());
          }
        }
        if (!bAtLeastHTML5)
        {
          // No scheme attr in HTML5
          if (aMetaElement.getScheme () != null)
            aMeta.setAttribute (CHTMLAttributes.SCHEME, aMetaElement.getScheme ());
        }
      }
    }

    // page title
    if (StringHelper.hasText (m_sPageTitle))
      eHead.appendElement (EHTMLElement.TITLE.getElementName ()).appendText (m_sPageTitle);

    // base
    if (StringHelper.hasText (m_sBaseHref) || m_aBaseTarget != null)
    {
      final IMicroElement eBase = eHead.appendElement (EHTMLElement.BASE.getElementName ());
      if (StringHelper.hasText (m_sBaseHref))
        eBase.setAttribute (CHTMLAttributes.HREF, m_sBaseHref);
      if (m_aBaseTarget != null)
        eBase.setAttribute (CHTMLAttributes.TARGET, m_aBaseTarget.getAttrValue ());
    }

    // links
    emitLinks (eHead, aConversionSettings);

    // CSS stuff
    emitCSS (eHead, aConversionSettings);

    // JS files
    emitJS (eHead, aConversionSettings);

    // Custom nodes (e.g. from out-of-band nodes)
    for (final IHCBaseNode aCustomNode : m_aCustomOutOfBandNodes)
      eHead.appendChild (aCustomNode.getAsNode (aConversionSettings));

    return eHead;
  }

  @Nonnull
  public String getPlainText ()
  {
    // Use the page title as plain text
    return StringHelper.getNotNull (m_sPageTitle);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("profile", m_sProfile)
                            .appendIfNotNull ("pageTitle", m_sPageTitle)
                            .appendIfNotNull ("baseHref", m_sBaseHref)
                            .appendIfNotNull ("baseTarget", m_aBaseTarget)
                            .appendIfNotNull ("metaElements", m_aMetaElements)
                            .appendIfNotNull ("links", m_aLinks)
                            .appendIfNotNull ("CSS", m_aCSS)
                            .appendIfNotNull ("JS", m_aJS)
                            .appendIfNotNull ("customOutOfBandHandler", m_aCustomOutOfBandNodes)
                            .appendIfNotNull ("outOfBandHandler", m_aOutOfBandHandler)
                            .toString ();
  }
}
