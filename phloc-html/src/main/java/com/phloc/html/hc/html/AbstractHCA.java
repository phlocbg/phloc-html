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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.commons.url.SimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.DefaultCSSClassProvider;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.api5.IHCHasMedia;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.htmlext.HCA_JS;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;

/**
 * Represents an HTML &lt;a&gt; element
 *
 * @author Philip Helger
 */
public class AbstractHCA <THISTYPE extends AbstractHCA <THISTYPE>> extends AbstractHCElementWithChildren <THISTYPE> implements IHCHasMedia <THISTYPE>, IHCA <THISTYPE>
{
  private static final long serialVersionUID = -6891012934766966780L;

  private static final ICSSClassProvider CSS_DISABLED_LINK = DefaultCSSClassProvider.create ("link_disabled");
  private ISimpleURL m_aHref;
  private HCA_Target m_aTarget;
  private String m_sName;
  private IMimeType m_aType;
  private String m_sMediaQuery;

  public AbstractHCA ()
  {
    super (EHTMLElement.A);
  }

  public AbstractHCA (@Nonnull final String sHref)
  {
    this (new SimpleURL (sHref));
  }

  public AbstractHCA (@Nonnull final ISimpleURL aHref)
  {
    this ();
    setHref (aHref);
  }

  @Override
  @Nullable
  public ISimpleURL getHref ()
  {
    return this.m_aHref;
  }

  @Override
  @Nonnull
  public final THISTYPE setHref (@Nonnull final String sHref)
  {
    return setHref (new SimpleURL (sHref));
  }

  @Override
  @Nonnull
  public final THISTYPE setHref (@Nonnull final ISimpleURL aHref)
  {
    ValueEnforcer.notNull (aHref, "href"); //$NON-NLS-1$

    HCConsistencyChecker.checkIfLinkIsMasked (aHref.getAsString ());
    this.m_aHref = aHref;
    return thisAsT ();
  }

  @Override
  @Nullable
  public HCA_Target getTarget ()
  {
    return this.m_aTarget;
  }

  @Override
  public boolean hasTarget ()
  {
    return this.m_aTarget != null;
  }

  @Override
  @Nonnull
  public THISTYPE setTarget (@Nullable final HCA_Target aTarget)
  {
    this.m_aTarget = aTarget;
    return thisAsT ();
  }

  @Override
  @Nonnull
  public THISTYPE setTargetBlank ()
  {
    return setTarget (HCA_Target.BLANK);
  }

  @Override
  @Nullable
  public String getName ()
  {
    return this.m_sName;
  }

  @Override
  @Nonnull
  public THISTYPE setName (@Nullable final String sName)
  {
    this.m_sName = sName;
    return thisAsT ();
  }

  @Override
  @Nullable
  public IMimeType getType ()
  {
    return this.m_aType;
  }

  @Override
  @Nonnull
  public THISTYPE setType (@Nullable final IMimeType aType)
  {
    this.m_aType = aType;
    return thisAsT ();
  }

  @Override
  @Nullable
  public String getMedia ()
  {
    return this.m_sMediaQuery;
  }

  @Override
  @Nonnull
  public THISTYPE setMedia (@Nullable final String sMediaQuery)
  {
    this.m_sMediaQuery = sMediaQuery;
    return thisAsT ();
  }

  /**
   * Shortcut for <code>setEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   *
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Override
  @Nonnull
  public THISTYPE setOnClick (@Nullable final IJSCodeProvider aOnClick)
  {
    return setEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  public void disable ()
  {
    setHref (HCA_JS.JS_URL);
    removeAllEventHandler (EJSEvent.ONCLICK);
    addClass (CSS_DISABLED_LINK);
  }

  /**
   * Shortcut for <code>addEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   *
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Override
  @Nonnull
  public THISTYPE addOnClick (@Nullable final IJSCodeProvider aOnClick)
  {
    return addEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (this.m_aHref != null)
      aElement.setAttribute (CHTMLAttributes.HREF, this.m_aHref.getAsString ());
    if (this.m_aTarget != null)
    {
      // Note: attribute "target" is not allowed in XHTML 1.0 strict (but in
      // 1.1)
      aElement.setAttribute (CHTMLAttributes.TARGET, this.m_aTarget);
    }
    if (StringHelper.hasText (this.m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, this.m_sName);
    if (this.m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, this.m_aType.getAsString ());
    // HTML5 only:
    if (StringHelper.hasText (this.m_sMediaQuery))
      aElement.setAttribute (CHTMLAttributes.MEDIA, this.m_sMediaQuery);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("href", this.m_aHref) //$NON-NLS-1$
                            .appendIfNotNull ("target", this.m_aTarget) //$NON-NLS-1$
                            .appendIfNotNull ("name", this.m_sName) //$NON-NLS-1$
                            .appendIfNotNull ("type", this.m_aType) //$NON-NLS-1$
                            .appendIfNotNull ("mediaQuery", this.m_sMediaQuery) //$NON-NLS-1$
                            .toString ();
  }
}
