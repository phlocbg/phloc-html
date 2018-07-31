/**
 * Copyright (C) 2006-2015 phloc systems
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.state.EChange;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api.EHCLinkType;
import com.phloc.html.hc.api.IHCLinkType;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.hc.utils.HCSpecialNodeHandler;
import com.phloc.html.meta.IMetaElement;

/**
 * Represents an HTML &lt;head&gt; element
 * 
 * @author Boris Gregorcic
 * @author Philip Helger
 */
public class HCHead extends AbstractHCElement <HCHead>
{
  private static final long serialVersionUID = 664545572494794975L;

  private String m_sProfile;
  private final HCTitle m_aPageTitle = new HCTitle ();
  private final HCBase m_aBase = new HCBase ();
  private final Map <String, IMetaElement> m_aMetaElements = new LinkedHashMap <> ();
  private final List <HCLink> m_aLinks = new ArrayList <> ();
  private final List <IHCNode> m_aCSS = new ArrayList <> ();
  private final List <IHCNode> m_aJS = new ArrayList <> ();

  public HCHead ()
  {
    super (EHTMLElement.HEAD);
  }

  @Nullable
  public String getProfile ()
  {
    return this.m_sProfile;
  }

  @Nonnull
  public HCHead setProfile (@Nullable final String sProfile)
  {
    this.m_sProfile = sProfile;
    return this;
  }

  @Nullable
  public String getPageTitle ()
  {
    return this.m_aPageTitle.getContent ();
  }

  @Nonnull
  public HCHead setPageTitle (@Nullable final String sPageTitle)
  {
    this.m_aPageTitle.setContent (sPageTitle);
    return this;
  }

  @Nullable
  public String getBaseHref ()
  {
    return this.m_aBase.getHref ();
  }

  @Nonnull
  public HCHead setBaseHref (@Nullable final String sBaseHref)
  {
    this.m_aBase.setHref (sBaseHref);
    return this;
  }

  @Nullable
  public HCA_Target getBaseTarget ()
  {
    return this.m_aBase.getTarget ();
  }

  @Nonnull
  public HCHead setBaseTarget (@Nullable final HCA_Target aTarget)
  {
    this.m_aBase.setTarget (aTarget);
    return this;
  }

  //
  // Meta element handling
  //

  @Nonnull
  public HCHead addMetaElement (@Nonnull final IMetaElement aMetaElement)
  {
    ValueEnforcer.notNull (aMetaElement, "MetaElement"); //$NON-NLS-1$
    this.m_aMetaElements.put (aMetaElement.getName (), aMetaElement);
    return this;
  }

  @Nonnull
  public EChange removeMetaElement (@Nullable final String sMetaElementName)
  {
    return EChange.valueOf (this.m_aMetaElements.remove (sMetaElementName) != null);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IMetaElement> getAllMetaElements ()
  {
    return ContainerHelper.newList (this.m_aMetaElements.values ());
  }

  @Nonnegative
  public int getMetaElementCount ()
  {
    return this.m_aMetaElements.size ();
  }

  //
  // Link handling
  //

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
      addLink (new HCLink ().setRel (EHCLinkType.SHORTCUT_ICON).setHref (aShortcutIconHref));
      // Required for IE:
      addLink (new HCLink ().setRel (EHCLinkType.ICON).setType (CMimeType.IMAGE_ICON).setHref (aShortcutIconHref));
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
    ValueEnforcer.notNull (aLink, "Link"); //$NON-NLS-1$
    this.m_aLinks.add (aLink);
    return this;
  }

  /**
   * Add a link object to the head at the specified position.
   * 
   * @param nIndex
   *        The index where the links should be added (counting link elements
   *        only)
   * @param aLink
   *        The link to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addLink (@Nonnegative final int nIndex, @Nonnull final HCLink aLink)
  {
    ValueEnforcer.notNull (aLink, "Link"); //$NON-NLS-1$
    this.m_aLinks.add (nIndex, aLink);
    return this;
  }

  @Nonnull
  public EChange removeLinkOfRel (@Nonnull final IHCLinkType aLinkType)
  {
    int i = 0;
    for (final HCLink aLink : this.m_aLinks)
    {
      if (aLink.getRel ().equals (aLinkType))
      {
        this.m_aLinks.remove (i);
        return EChange.CHANGED;
      }
      ++i;
    }
    return EChange.UNCHANGED;
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <HCLink> getAllLinks ()
  {
    return ContainerHelper.newList (this.m_aLinks);
  }

  @Nonnegative
  public int getLinkCount ()
  {
    return this.m_aLinks.size ();
  }

  @Nonnull
  public HCHead addCSS (@Nonnull final IHCNode aCSS)
  {
    ValueEnforcer.notNull (aCSS, "CSS"); //$NON-NLS-1$
    if (!HCSpecialNodeHandler.isCSSNode (aCSS))
    {
      throw new IllegalArgumentException (aCSS + " is not a valid CSS node!"); //$NON-NLS-1$
    }
    this.m_aCSS.add (aCSS);
    return this;
  }

  @Nonnull
  public HCHead addCSS (@Nonnegative final int nIndex, @Nonnull final IHCNode aCSS)
  {
    ValueEnforcer.notNull (aCSS, "CSS"); //$NON-NLS-1$
    if (!HCSpecialNodeHandler.isCSSNode (aCSS))
    {
      throw new IllegalArgumentException (aCSS + " is not a valid CSS node!"); //$NON-NLS-1$
    }
    this.m_aCSS.add (nIndex, aCSS);
    return this;
  }

  @Nonnegative
  public int getCSSCount ()
  {
    return this.m_aCSS.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllCSSNodes ()
  {
    return ContainerHelper.newList (this.m_aCSS);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllAndRemoveAllCSSNodes ()
  {
    final List <IHCNode> ret = ContainerHelper.newList (this.m_aCSS);
    this.m_aCSS.clear ();
    return ret;
  }

  @Nonnull
  public HCHead removeAllCSS ()
  {
    this.m_aCSS.clear ();
    return this;
  }

  /**
   * Append some JavaScript code
   * 
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addJS (@Nonnull final IHCNode aJS)
  {
    ValueEnforcer.notNull (aJS, "JS"); //$NON-NLS-1$
    if (!HCSpecialNodeHandler.isJSNode (aJS))
    {
      throw new IllegalArgumentException (aJS + " is not a valid JS node!"); //$NON-NLS-1$
    }
    this.m_aJS.add (aJS);
    return this;
  }

  /**
   * Append some JavaScript code at the specified index
   * 
   * @param nIndex
   *        The index where the JS should be added (counting only JS elements)
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addJS (@Nonnegative final int nIndex, @Nonnull final IHCNode aJS)
  {
    ValueEnforcer.notNull (aJS, "JS"); //$NON-NLS-1$
    if (!HCSpecialNodeHandler.isJSNode (aJS))
    {
      throw new IllegalArgumentException (aJS + " is not a valid JS node!"); //$NON-NLS-1$
    }
    this.m_aJS.add (nIndex, aJS);
    return this;
  }

  /**
   * @return The number of contained JS elements
   */
  @Nonnegative
  public int getJSCount ()
  {
    return this.m_aJS.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllJSNodes ()
  {
    return ContainerHelper.newList (this.m_aJS);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllAndRemoveAllJSNodes ()
  {
    final List <IHCNode> ret = ContainerHelper.newList (this.m_aJS);
    this.m_aJS.clear ();
    return ret;
  }

  @Nonnull
  public HCHead removeAllJS ()
  {
    this.m_aJS.clear ();
    return this;
  }

  @OverrideOnDemand
  protected void emitLinks (@Nonnull final IMicroElement eHead,
                            @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final HCLink aLink : this.m_aLinks)
    {
      eHead.appendChild (aLink.convertToNode (aConversionSettings));
    }
  }

  @OverrideOnDemand
  protected void emitCSS (@Nonnull final IMicroElement eHead,
                          @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final IHCNode aCSS : this.m_aCSS)
    {
      eHead.appendChild (aCSS.convertToNode (aConversionSettings));
    }
  }

  @OverrideOnDemand
  protected void emitJS (@Nonnull final IMicroElement eHead,
                         @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final IHCNode aJS : this.m_aJS)
    {
      eHead.appendChild (aJS.convertToNode (aConversionSettings));
    }
  }

  @Override
  protected void applyProperties (@Nonnull final IMicroElement eHead,
                                  @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (eHead, aConversionSettings);

    if (StringHelper.hasText (this.m_sProfile))
    {
      eHead.setAttribute (CHTMLAttributes.PROFILE, this.m_sProfile);
    }

    // Append meta element first for charset encoding!
    for (final IMetaElement aMetaElement : this.m_aMetaElements.values ())
    {
      eHead.appendChild (aMetaElement.convertToNode (aConversionSettings));
    }

    // page title
    eHead.appendChild (this.m_aPageTitle.convertToNode (aConversionSettings));

    // base
    eHead.appendChild (this.m_aBase.convertToNode (aConversionSettings));

    // links
    emitLinks (eHead, aConversionSettings);

    // CSS stuff
    emitCSS (eHead, aConversionSettings);

    // JS files
    emitJS (eHead, aConversionSettings);

    // Ensure tag is not self-closed
    if (!eHead.hasChildren () && EHTMLElement.HEAD.mayNotBeSelfClosed ())
    {
      eHead.appendText (""); //$NON-NLS-1$
    }
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    // Use the page title as plain text
    return this.m_aPageTitle.getPlainText ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("profile", this.m_sProfile) //$NON-NLS-1$
                            .append ("pageTitle", this.m_aPageTitle) //$NON-NLS-1$
                            .append ("base", this.m_aBase) //$NON-NLS-1$
                            .appendIfNotNull ("metaElements", this.m_aMetaElements) //$NON-NLS-1$
                            .appendIfNotNull ("links", this.m_aLinks) //$NON-NLS-1$
                            .appendIfNotNull ("CSS", this.m_aCSS) //$NON-NLS-1$
                            .appendIfNotNull ("JS", this.m_aJS) //$NON-NLS-1$
                            .toString ();
  }
}
