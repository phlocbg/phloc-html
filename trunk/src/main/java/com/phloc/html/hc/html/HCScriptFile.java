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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.hc.conversion.IHCConversionSettings;

/**
 * Represents an HTML &lt;script&gt; element that loads the code from a source
 * URL.
 * 
 * @author philip
 * @see HCScript
 */
public class HCScriptFile extends AbstractHCScript <HCScriptFile>
{
  public static final boolean DEFAULT_DEFER = false;
  public static final boolean DEFAULT_ASYNC = false;

  private ISimpleURL m_aSrc;
  private boolean m_bDefer = DEFAULT_DEFER;
  private boolean m_bAsync = DEFAULT_ASYNC;

  public HCScriptFile ()
  {
    super ();
  }

  public HCScriptFile (@Nullable final ISimpleURL aSrc)
  {
    super ();
    setSrc (aSrc);
  }

  public HCScriptFile (@Nullable final ISimpleURL aSrc, final boolean bDefer)
  {
    this (aSrc);
    setDefer (bDefer);
  }

  @Nullable
  public ISimpleURL getSrc ()
  {
    return m_aSrc;
  }

  @Nonnull
  public HCScriptFile setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  public boolean isDefer ()
  {
    return m_bDefer;
  }

  @Nonnull
  public HCScriptFile setDefer (final boolean bDefer)
  {
    m_bDefer = bDefer;
    return this;
  }

  public boolean isAsync ()
  {
    return m_bAsync;
  }

  @Nonnull
  public HCScriptFile setAsync (final boolean bAsync)
  {
    m_bAsync = bAsync;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (m_bDefer)
      aElement.setAttribute (CHTMLAttributes.DEFER, CHTMLAttributeValues.DEFER);
    if (m_bAsync)
      aElement.setAttribute (CHTMLAttributes.ASYNC, CHTMLAttributeValues.ASYNC);

    // Tag may not be self closed
    aElement.appendText ("");
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("src", m_aSrc)
                            .append ("defer", m_bDefer)
                            .append ("async", m_bAsync)
                            .toString ();
  }
}
