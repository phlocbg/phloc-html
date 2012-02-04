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
package com.phloc.html.resource.js;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.condcomment.ConditionalComment;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.html.HCScriptFile;

@Immutable
public class JSExternal extends AbstractJSHTMLDefinition implements IJSExternal
{
  public static final boolean DEFAULT_DEFER = false;

  private final ISimpleURL m_aHref;
  private final boolean m_bDefer;

  public JSExternal (@Nonnull final ISimpleURL aHref)
  {
    this (aHref, DEFAULT_DEFER, null);
  }

  public JSExternal (@Nonnull final ISimpleURL aHref, final boolean bDefer, @Nullable final ConditionalComment aCC)
  {
    super (aCC);
    if (aHref == null)
      throw new NullPointerException ("href");
    m_aHref = aHref;
    m_bDefer = bDefer;
  }

  @Nonnull
  public final ISimpleURL getHref ()
  {
    return m_aHref;
  }

  public final boolean isDefer ()
  {
    return m_bDefer;
  }

  @Nonnull
  public IHCNode getAsHCNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    final HCScriptFile aScript = new HCScriptFile (m_aHref, m_bDefer);
    if (hasConditionalComment ())
      return getConditionalComment ().getNodeWrappedInCondition (aScript, aConversionSettings);
    return aScript;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSExternal rhs = (JSExternal) o;
    return m_aHref.equals (rhs.m_aHref) && m_bDefer == rhs.m_bDefer;
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aHref).append (m_bDefer).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("href", m_aHref)
                            .append ("defer", m_bDefer)
                            .toString ();
  }
}
