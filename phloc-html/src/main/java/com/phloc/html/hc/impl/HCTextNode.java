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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroText;
import com.phloc.commons.microdom.impl.MicroText;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Represents a single text node as HC node.
 * 
 * @author Philip Helger
 */
public class HCTextNode extends AbstractHCNode
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

  public HCTextNode (@Nullable final String sText, final int nBegin, final int nEnd)
  {
    m_sText = sText == null ? "" : sText.substring (nBegin, nEnd);
  }

  public HCTextNode (final char cChar)
  {
    m_sText = Character.toString (cChar);
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
   * Enable or disable XML escaping in the final document. By default all text
   * is escaped ({@link MicroText#DEFAULT_ESCAPE}), but for certain special
   * cases (like script elements in HTML), XML escaping must be disabled.
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

  /**
   * @return <code>true</code> if XML escaping is enabled, <code>false</code> if
   *         it is disabled
   */
  public boolean isEscape ()
  {
    return m_bEscape;
  }

  /**
   * @return The unescaped text. Never <code>null</code>.
   */
  @Nonnull
  public String getText ()
  {
    return m_sText;
  }

  @Override
  @Nonnull
  protected IMicroText internalConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return new MicroText (m_sText).setEscape (m_bEscape);
  }

  @Override
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

  /**
   * @deprecated Use {@link #createOnDemand(String)} instead
   */
  @Deprecated
  @Nullable
  public static HCTextNode create (@Nullable final String sText)
  {
    return createOnDemand (sText);
  }

  @Nullable
  public static HCTextNode createOnDemand (@Nullable final String sText)
  {
    return sText == null ? null : new HCTextNode (sText);
  }
}
