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
import com.phloc.html.hc.CHCCSS;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCControl;

public class HCEditPassword extends AbstractHCControl <HCEditPassword>
{
  private int m_nMaxLength = CGlobal.ILLEGAL_UINT;
  private int m_nSize = CGlobal.ILLEGAL_UINT;
  private boolean m_bDisableAutoComplete = HCDefaultSettings.isAutoCompleteOffForPasswordEdits ();

  public HCEditPassword (@Nullable final String sName)
  {
    super (EHTMLElement.INPUT);
    addClasses (CHCCSS.CSS_CLASS_EDIT, CHCCSS.CSS_CLASS_EDIT_PASSWORD);
    setName (sName);
  }

  /**
   * Define the maximum number of characters to be entered into this field.
   * 
   * @param nMaxLength
   *        The maximum number of characters to be entered
   * @return this
   */
  @Nonnull
  public final HCEditPassword setMaxLength (final int nMaxLength)
  {
    m_nMaxLength = nMaxLength;
    return this;
  }

  /**
   * Define the visible size of this edit (approx. the number of visible
   * characters). Prefer using CSS instead of this methid!
   * 
   * @param nSize
   *        The visible size
   * @return this
   */
  @Nonnull
  public final HCEditPassword setSize (final int nSize)
  {
    m_nSize = nSize;
    return this;
  }

  @Nonnull
  public final HCEditPassword setDisableAutoComplete (final boolean bDisableAutoComplete)
  {
    m_bDisableAutoComplete = bDisableAutoComplete;
    return this;
  }

  @Override
  protected void applyProperties (HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);
    aElement.setAttribute (CHTMLAttributes.TYPE, CHTMLAttributeValues.INPUT_TYPE_PASSWORD);
    if (m_nMaxLength > 0)
      aElement.setAttribute (CHTMLAttributes.MAXLENGTH, Integer.toString (m_nMaxLength));
    if (m_nSize > 0)
      aElement.setAttribute (CHTMLAttributes.SIZE, Integer.toString (m_nSize));
    if (m_bDisableAutoComplete)
      aElement.setAttribute (CHTMLAttributes.AUTOCOMPLETE, CHTMLAttributeValues.OFF);
  }
}
