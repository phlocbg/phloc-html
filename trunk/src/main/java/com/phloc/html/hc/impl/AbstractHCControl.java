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

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCControl;
import com.phloc.html.hc.conversion.HCConversionSettings;

// TODO change to http://dev.w3.org/html5/markup/input.text.html#input.text
public abstract class AbstractHCControl <THISTYPE extends IHCControl <THISTYPE>> extends AbstractHCElement <THISTYPE> implements
                                                                                                                     IHCControl <THISTYPE>
{
  public static final boolean DEFAULT_DISABLED = false;
  public static final boolean DEFAULT_READONLY = false;
  public static final boolean DEFAULT_FOCUSED = false;

  private String m_sName;
  private int m_nTabIndex = CGlobal.ILLEGAL_UINT;
  private boolean m_bDisabled = DEFAULT_DISABLED;
  private boolean m_bReadOnly = DEFAULT_READONLY;
  private boolean m_bFocused = DEFAULT_FOCUSED;

  public AbstractHCControl (@Nonnull @Nonempty final EHTMLElement aElement)
  {
    super (aElement);
  }

  @Nullable
  public final String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final THISTYPE setName (@Nullable final String sName)
  {
    m_sName = sName;
    return thisAsT ();
  }

  public final int getTabIndex ()
  {
    return m_nTabIndex;
  }

  @Nonnull
  public final THISTYPE setTabIndex (final int nTabIndex)
  {
    m_nTabIndex = nTabIndex;
    return thisAsT ();
  }

  public final boolean isDisabled ()
  {
    return m_bDisabled;
  }

  @Nonnull
  public final THISTYPE setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return thisAsT ();
  }

  public final boolean isReadonly ()
  {
    return m_bReadOnly;
  }

  @Nonnull
  public final THISTYPE setReadonly (final boolean bReadOnly)
  {
    m_bReadOnly = bReadOnly;
    return thisAsT ();
  }

  public final boolean isFocused ()
  {
    return m_bFocused;
  }

  @Nonnull
  public final THISTYPE setFocused (final boolean bFocused)
  {
    m_bFocused = bFocused;
    return thisAsT ();
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (m_bDisabled)
      aElement.setAttribute (CHTMLAttributes.DISABLED, CHTMLAttributeValues.DISABLED);
    if (m_bReadOnly)
      aElement.setAttribute (CHTMLAttributes.READONLY, CHTMLAttributeValues.READONLY);
    if (m_nTabIndex != CGlobal.ILLEGAL_UINT)
      aElement.setAttribute (CHTMLAttributes.TABINDEX, Integer.toString (m_nTabIndex));
  }
}
