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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.media.CSSMediaList;
import com.phloc.css.media.ECSSMedium;
import com.phloc.html.condcomment.ConditionalComment;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.html.HCStyle;

/**
 * Default implementation of {@link ICSSInline}.
 * 
 * @author philip
 */
@Deprecated
@Immutable
public class CSSInline extends AbstractCSSHTMLDefinition implements ICSSInline
{
  private final String m_sContent;

  public CSSInline (@Nonnull @Nonempty final String sContent)
  {
    this (sContent, (CSSMediaList) null, (ConditionalComment) null);
  }

  public CSSInline (@Nonnull @Nonempty final String sContent, @Nonnull final ECSSMedium eMedium)
  {
    this (sContent, eMedium, (ConditionalComment) null);
  }

  public CSSInline (@Nonnull @Nonempty final String sContent, @Nullable final CSSMediaList aMedia)
  {
    this (sContent, aMedia, (ConditionalComment) null);
  }

  public CSSInline (@Nonnull @Nonempty final String sContent, @Nullable final ConditionalComment aCC)
  {
    this (sContent, (CSSMediaList) null, aCC);
  }

  public CSSInline (@Nonnull @Nonempty final String sContent,
                    @Nonnull final ECSSMedium eMedium,
                    @Nullable final ConditionalComment aCC)
  {
    this (sContent, new CSSMediaList (eMedium), aCC);
  }

  public CSSInline (@Nonnull @Nonempty final String sContent,
                    @Nullable final CSSMediaList aMedia,
                    @Nullable final ConditionalComment aCC)
  {
    super (aMedia, aCC);
    if (StringHelper.hasNoText (sContent))
      throw new IllegalArgumentException ("content");
    m_sContent = sContent;
  }

  @Nonnull
  @Nonempty
  public String getContent ()
  {
    return m_sContent;
  }

  @Nonnull
  public IHCNode getAsHCNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final HCStyle aStyle = new HCStyle (m_sContent);
    if (hasMedia ())
      aStyle.setMedia (getMedia ());

    if (hasConditionalComment ())
      return getConditionalComment ().getNodeWrappedInCondition (aStyle, aConversionSettings);
    return aStyle;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final CSSInline rhs = (CSSInline) o;
    return m_sContent.equals (rhs.m_sContent);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_sContent).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("content", m_sContent).toString ();
  }
}
