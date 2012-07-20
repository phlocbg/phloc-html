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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.media.CSSMediaList;
import com.phloc.html.condcomment.ConditionalComment;
import com.phloc.html.resource.AbstractHTMLResourceObject;

@Immutable
public abstract class AbstractCSSHTMLDefinition extends AbstractHTMLResourceObject implements ICSSHTMLDefinition
{
  private final CSSMediaList m_aMedia;

  public AbstractCSSHTMLDefinition ()
  {
    this ((CSSMediaList) null, (ConditionalComment) null);
  }

  public AbstractCSSHTMLDefinition (@Nullable final CSSMediaList aMedia)
  {
    this (aMedia, (ConditionalComment) null);
  }

  public AbstractCSSHTMLDefinition (@Nullable final CSSMediaList aMedia, @Nullable final ConditionalComment aCC)
  {
    super (aCC);
    m_aMedia = aMedia == null ? new CSSMediaList () : aMedia;
  }

  public final boolean hasMedia ()
  {
    return m_aMedia.hasMedia ();
  }

  @Nonnull
  public final CSSMediaList getMedia ()
  {
    return m_aMedia;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final AbstractCSSHTMLDefinition rhs = (AbstractCSSHTMLDefinition) o;
    return m_aMedia.equals (rhs.m_aMedia);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aMedia).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("media", m_aMedia).toString ();
  }
}
