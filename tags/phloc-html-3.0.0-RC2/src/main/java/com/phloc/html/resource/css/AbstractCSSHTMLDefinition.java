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

import com.phloc.commons.compare.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.media.CSSMediaList;
import com.phloc.html.condcomment.ConditionalComment;

@Immutable
public abstract class AbstractCSSHTMLDefinition implements ICSSHTMLDefinition
{
  private final CSSMediaList m_aMedia;
  private final ConditionalComment m_aCC;

  public AbstractCSSHTMLDefinition (@Nullable final CSSMediaList aMedia, @Nullable final ConditionalComment aCC)
  {
    m_aMedia = aMedia == null ? new CSSMediaList () : aMedia;
    m_aCC = aCC;
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

  public final boolean hasConditionalComment ()
  {
    return m_aCC != null;
  }

  @Nullable
  public final ConditionalComment getConditionalComment ()
  {
    return m_aCC;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final AbstractCSSHTMLDefinition rhs = (AbstractCSSHTMLDefinition) o;
    return m_aMedia.equals (rhs.m_aMedia) && EqualsUtils.nullSafeEquals (m_aCC, rhs.m_aCC);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aMedia).append (m_aCC).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("media", m_aMedia)
                                       .appendIfNotNull ("conditionalComment", m_aCC)
                                       .toString ();
  }
}