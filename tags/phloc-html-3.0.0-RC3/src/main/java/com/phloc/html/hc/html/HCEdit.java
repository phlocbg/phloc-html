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

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCInputType;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCControl;

public class HCEdit extends AbstractHCControl <HCEdit>
{
  private String m_sValue;
  private int m_nMaxLength = CGlobal.ILLEGAL_UINT;
  private int m_nSize = CGlobal.ILLEGAL_UINT;
  private boolean m_bDisableAutoComplete = false;

  public HCEdit (@Nullable final String sName)
  {
    super (EHTMLElement.INPUT);
    setName (sName);
  }

  public HCEdit (@Nullable final String sName, @Nullable final String sValue)
  {
    this (sName);
    setValue (sValue);
  }

  public HCEdit (@Nullable final String sName, final int nValue)
  {
    this (sName, Integer.toString (nValue));
  }

  @Nullable
  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final HCEdit setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  /**
   * Set the maximum number of characters to be entered.
   * 
   * @param nMaxLength
   *        The max length. Should be > 0.
   * @return this
   */
  @Nonnull
  public final HCEdit setMaxLength (final int nMaxLength)
  {
    m_nMaxLength = nMaxLength;
    return this;
  }

  /**
   * Sets the visible size of the edit. Should not be necessary in most cases,
   * as styling via CSS is the preferred way. If you want to limit the number of
   * available characters use {@link #setMaxLength(int)} instead.
   * 
   * @param nSize
   *        The width of the edit in characters.
   * @return this
   */
  @Nonnull
  public final HCEdit setSize (final int nSize)
  {
    m_nSize = nSize;
    return this;
  }

  @Nonnull
  public final HCEdit setDisableAutoComplete (final boolean bDisableAutoComplete)
  {
    m_bDisableAutoComplete = bDisableAutoComplete;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, EHCInputType.TEXT.getAttrValue ());
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_nMaxLength > 0)
      aElement.setAttribute (CHTMLAttributes.MAXLENGTH, Integer.toString (m_nMaxLength));
    if (m_nSize > 0)
      aElement.setAttribute (CHTMLAttributes.SIZE, Integer.toString (m_nSize));
    if (m_bDisableAutoComplete)
      aElement.setAttribute (CHTMLAttributes.AUTOCOMPLETE, CHTMLAttributeValues.OFF);
  }

  @Override
  public String getPlainText ()
  {
    return m_sValue != null ? m_sValue : "";
  }
}
