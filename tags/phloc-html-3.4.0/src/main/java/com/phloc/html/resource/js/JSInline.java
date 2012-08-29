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

import java.io.IOException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.decl.CSSDeclarationList;
import com.phloc.css.decl.CascadingStyleSheet;
import com.phloc.css.writer.CSSWriter;
import com.phloc.css.writer.CSSWriterSettings;
import com.phloc.html.condcomment.ConditionalComment;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.js.IJSCodeProvider;

/**
 * Default implementation of {@link IJSInline}.
 * 
 * @author philip
 */
@Immutable
public class JSInline extends AbstractJSHTMLDefinition implements IJSInline
{
  private final String m_sContent;

  public JSInline (@Nonnull final IJSCodeProvider aContent)
  {
    this (aContent, null);
  }

  public JSInline (@Nonnull final IJSCodeProvider aContent, @Nullable final ConditionalComment aCC)
  {
    super (aCC);
    if (aContent == null)
      throw new NullPointerException ("content");
    m_sContent = aContent.getJSCode ();
  }

  public JSInline (@Nonnull final CascadingStyleSheet aCSS, @Nonnull final CSSWriterSettings aSettings) throws IOException
  {
    this (aCSS, aSettings, null);
  }

  public JSInline (@Nonnull final CascadingStyleSheet aCSS,
                   @Nonnull final CSSWriterSettings aSettings,
                   @Nullable final ConditionalComment aCC) throws IOException
  {
    this (new CSSWriter (aSettings).getCSSAsString (aCSS), aCC);
  }

  public JSInline (@Nonnull final CSSDeclarationList aCSS, @Nonnull final CSSWriterSettings aSettings) throws IOException
  {
    this (aCSS, aSettings, null);
  }

  public JSInline (@Nonnull final CSSDeclarationList aCSS,
                   @Nonnull final CSSWriterSettings aSettings,
                   @Nullable final ConditionalComment aCC) throws IOException
  {
    this (new CSSWriter (aSettings).getCSSAsString (aCSS), aCC);
  }

  @DevelopersNote ("Handle with care!")
  public JSInline (@Nonnull @Nonempty final String sContent)
  {
    this (sContent, null);
  }

  @DevelopersNote ("Handle with care!")
  public JSInline (@Nonnull @Nonempty final String sContent, @Nullable final ConditionalComment aCC)
  {
    super (aCC);
    if (StringHelper.hasNoText (sContent))
      throw new IllegalArgumentException ("Empty content is not allowed in JSInline");
    m_sContent = sContent;
  }

  @Nullable
  public String getContent ()
  {
    return m_sContent;
  }

  @Nonnull
  public IHCNode getAsHCNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final HCScript aScript = new HCScript (m_sContent);
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
    final JSInline rhs = (JSInline) o;
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
