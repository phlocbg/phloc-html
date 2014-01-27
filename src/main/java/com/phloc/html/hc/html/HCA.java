/**
 * Copyright (C) 2006-2014 phloc systems
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
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.commons.url.SimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api5.IHCHasMedia;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;

/**
 * Represents an HTML &lt;a&gt; element
 * 
 * @author Philip Helger
 */
public class HCA extends AbstractHCElementWithChildren <HCA> implements IHCHasMedia <HCA>
{
  private ISimpleURL m_aHref;
  private HCA_Target m_aTarget;
  private String m_sName;
  private IMimeType m_aType;
  private String m_sMediaQuery;

  public HCA ()
  {
    super (EHTMLElement.A);
  }

  public HCA (@Nonnull final String sHref)
  {
    this (new SimpleURL (sHref));
  }

  public HCA (@Nonnull final ISimpleURL aHref)
  {
    this ();
    setHref (aHref);
  }

  @Nonnull
  public final HCA setHref (@Nonnull final String sHref)
  {
    return setHref (new SimpleURL (sHref));
  }

  @Nonnull
  public final HCA setHref (@Nonnull final ISimpleURL aHref)
  {
    if (aHref == null)
      throw new NullPointerException ("href");

    HCConsistencyChecker.checkIfLinkIsMasked (aHref.getAsString ());
    m_aHref = aHref;
    return this;
  }

  @Nullable
  public ISimpleURL getHref ()
  {
    return m_aHref;
  }

  @Nonnull
  public HCA setTarget (@Nullable final HCA_Target aTarget)
  {
    m_aTarget = aTarget;
    return this;
  }

  @Nullable
  public String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public HCA setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nullable
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public HCA setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Nullable
  public String getMedia ()
  {
    return m_sMediaQuery;
  }

  @Nonnull
  public HCA setMedia (@Nullable final String sMediaQuery)
  {
    m_sMediaQuery = sMediaQuery;
    return this;
  }

  /**
   * Shortcut for <code>setEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   * 
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Nonnull
  public HCA setOnClick (@Nullable final IJSCodeProvider aOnClick)
  {
    return setEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  /**
   * Shortcut for <code>addEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   * 
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Nonnull
  public HCA addOnClick (@Nullable final IJSCodeProvider aOnClick)
  {
    return addEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_aHref != null)
      aElement.setAttribute (CHTMLAttributes.HREF, m_aHref.getAsString ());
    if (m_aTarget != null)
    {
      // Note: attribute "target" is not allowed in XHTML 1.0 strict (but in
      // 1.1)
      aElement.setAttribute (CHTMLAttributes.TARGET, m_aTarget);
    }
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    // HTML5 only:
    if (StringHelper.hasText (m_sMediaQuery))
      aElement.setAttribute (CHTMLAttributes.MEDIA, m_sMediaQuery);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("href", m_aHref)
                            .appendIfNotNull ("target", m_aTarget)
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("type", m_aType)
                            .appendIfNotNull ("mediaQuery", m_sMediaQuery)
                            .toString ();
  }
}
