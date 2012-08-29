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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroText;
import com.phloc.commons.microdom.impl.MicroText;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.conversion.IHCConversionSettings;

/**
 * Represents a single text node as HC node.
 * 
 * @author philip
 */
public final class HCTextNode extends AbstractHCNode
{
  private final String m_sText;
  private boolean m_bEscape = MicroText.DEFAULT_ESCAPE;

  public HCTextNode (@Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    this (aTextProvider.getText ());
  }

  public HCTextNode (@Nullable final String sText)
  {
    m_sText = sText == null ? "" : sText;
  }

  public HCTextNode (final int nText)
  {
    m_sText = Integer.toString (nText);
  }

  public HCTextNode (final long nText)
  {
    m_sText = Long.toString (nText);
  }

  /**
   * Enable or disable XML escaping in the final document
   * 
   * @param bEscape
   *        <code>true</code> to enable escaping (default), <code>false</code>
   *        to disable it
   * @return this
   */
  @Nonnull
  public HCTextNode setEscape (final boolean bEscape)
  {
    m_bEscape = bEscape;
    return this;
  }

  public boolean isEscape ()
  {
    return m_bEscape;
  }

  @Nonnull
  public String getText ()
  {
    return m_sText;
  }

  @Nonnull
  public IMicroText getAsNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    return new MicroText (m_sText).setEscape (m_bEscape);
  }

  @Nonnull
  public String getPlainText ()
  {
    return m_sText;
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("text", m_sText)
                            .append ("escape", m_bEscape)
                            .toString ();
  }
}
