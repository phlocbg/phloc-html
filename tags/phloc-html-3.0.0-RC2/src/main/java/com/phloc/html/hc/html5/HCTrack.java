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
package com.phloc.html.hc.html5;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.conversion.HCConversionSettings;

@SinceHTML5
public final class HCTrack extends AbstractHCMediaElementChild <HCTrack>
{
  private String m_sKind;
  private ISimpleURL m_aSrc;
  private String m_sSrcLang;
  private String m_sLabel;
  private boolean m_bDefault = false;

  public HCTrack ()
  {
    super (EHTMLElement.CANVAS);
  }

  @Nonnull
  public HCTrack setKind (@Nullable final String sKind)
  {
    m_sKind = sKind;
    return this;
  }

  @Nonnull
  public HCTrack setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  @Nonnull
  public HCTrack setSrcLang (@Nullable final String sSrcLang)
  {
    m_sSrcLang = sSrcLang;
    return this;
  }

  @Nonnull
  public HCTrack setLabel (@Nullable final String sLabel)
  {
    m_sLabel = sLabel;
    return this;
  }

  @Nonnull
  public HCTrack setDefault (final boolean bDefault)
  {
    m_bDefault = bDefault;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sKind))
      aElement.setAttribute (CHTMLAttributes.KIND, m_sKind);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (StringHelper.hasText (m_sSrcLang))
      aElement.setAttribute (CHTMLAttributes.SRCLANG, m_sSrcLang);
    if (StringHelper.hasText (m_sLabel))
      aElement.setAttribute (CHTMLAttributes.LABEL, m_sLabel);
    if (m_bDefault)
      aElement.setAttribute (CHTMLAttributes.DEFAULT, CHTMLAttributeValues.DEFAULT);
  }

  public String getPlainText ()
  {
    return "";
  }
}
