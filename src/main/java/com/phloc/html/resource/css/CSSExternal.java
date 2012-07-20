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
package com.phloc.html.resource.css;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.css.media.CSSMediaList;
import com.phloc.css.media.ECSSMedium;
import com.phloc.html.condcomment.ConditionalComment;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api.EHCLinkType;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.html.HCLink;

/**
 * Default implementation of {@link ICSSExternal}.
 * 
 * @author philip
 */
@Immutable
public class CSSExternal extends AbstractCSSHTMLDefinition implements ICSSExternal
{
  private final ISimpleURL m_aHref;

  public CSSExternal (@Nonnull final ISimpleURL aHref)
  {
    this (aHref, (CSSMediaList) null, (ConditionalComment) null);
  }

  public CSSExternal (@Nonnull final ISimpleURL aHref, @Nonnull final ECSSMedium eMedium)
  {
    this (aHref, eMedium, (ConditionalComment) null);
  }

  public CSSExternal (@Nonnull final ISimpleURL aHref, @Nullable final CSSMediaList aMedia)
  {
    this (aHref, aMedia, (ConditionalComment) null);
  }

  public CSSExternal (@Nonnull final ISimpleURL aHref, @Nullable final ConditionalComment aCC)
  {
    this (aHref, (CSSMediaList) null, aCC);
  }

  public CSSExternal (@Nonnull final ISimpleURL aHref,
                      @Nonnull final ECSSMedium eMedium,
                      @Nullable final ConditionalComment aCC)
  {
    this (aHref, new CSSMediaList (eMedium), aCC);
  }

  public CSSExternal (@Nonnull final ISimpleURL aHref,
                      @Nullable final CSSMediaList aMedia,
                      @Nullable final ConditionalComment aCC)
  {
    super (aMedia, aCC);
    if (aHref == null)
      throw new NullPointerException ("href");
    m_aHref = aHref;
  }

  @Nonnull
  public ISimpleURL getHref ()
  {
    return m_aHref;
  }

  @Nonnull
  public IHCNode getAsHCNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final HCLink aLink = new HCLink (EHCLinkType.STYLESHEET, CMimeType.TEXT_CSS, m_aHref);
    if (hasMedia ())
      aLink.setMedia (getMedia ().getMediaString ());
    if (hasConditionalComment ())
      return getConditionalComment ().getNodeWrappedInCondition (aLink, aConversionSettings);
    return aLink;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final CSSExternal rhs = (CSSExternal) o;
    return m_aHref.equals (rhs.m_aHref);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aHref).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("href", m_aHref).toString ();
  }
}
