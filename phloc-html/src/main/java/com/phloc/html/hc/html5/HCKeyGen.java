/**
 * Copyright (C) 2006-2015 phloc systems
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

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.IHCCanBeDisabled;
import com.phloc.html.hc.api5.EHCKeyGenType;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;

@SinceHTML5
public class HCKeyGen extends AbstractHCElement <HCKeyGen> implements IHCCanBeDisabled <HCKeyGen>
{
  public static final EHCKeyGenType DEFAULT_KEY_TYPE = EHCKeyGenType.DEFAULT;
  public static final boolean DEFAULT_AUTOFOCUS = false;
  public static final boolean DEFAULT_DISABLED = false;

  private String m_sChallenge;
  private EHCKeyGenType m_eKeyType = DEFAULT_KEY_TYPE;
  private boolean m_bAutofocus = DEFAULT_AUTOFOCUS;
  private String m_sName;
  private boolean m_bDisabled = DEFAULT_DISABLED;
  private String m_sForm;

  public HCKeyGen ()
  {
    super (EHTMLElement.KEYGEN);
  }

  public HCKeyGen (@Nullable final String sName)
  {
    this ();
    m_sName = sName;
  }

  @Nullable
  public String getChallenge ()
  {
    return m_sChallenge;
  }

  @Nonnull
  public HCKeyGen setChallenge (@Nullable final String sChallenge)
  {
    m_sChallenge = sChallenge;
    return this;
  }

  @Nonnull
  public EHCKeyGenType getKeyType ()
  {
    return m_eKeyType;
  }

  @Nonnull
  public HCKeyGen setKeyType (@Nonnull final EHCKeyGenType eKeyType)
  {
    m_eKeyType = ValueEnforcer.notNull (eKeyType, "KeyType");
    return this;
  }

  public boolean isAutofocus ()
  {
    return m_bAutofocus;
  }

  @Nonnull
  public HCKeyGen setAutofocus (final boolean bAutofocus)
  {
    m_bAutofocus = bAutofocus;
    return this;
  }

  @Nullable
  public String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public HCKeyGen setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  public boolean isDisabled ()
  {
    return m_bDisabled;
  }

  @Nonnull
  public HCKeyGen setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return this;
  }

  @Nullable
  public String getForm ()
  {
    return m_sForm;
  }

  @Nonnull
  public HCKeyGen setForm (@Nullable final String sForm)
  {
    m_sForm = sForm;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sChallenge))
      aElement.setAttribute (CHTMLAttributes.CHALLENGE, m_sChallenge);
    aElement.setAttribute (CHTMLAttributes.KEYTYPE, m_eKeyType);
    if (m_bAutofocus)
      aElement.setAttribute (CHTMLAttributes.AUTOFOCUS, CHTMLAttributeValues.AUTOFOCUS);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (m_bDisabled)
      aElement.setAttribute (CHTMLAttributes.DISABLED, CHTMLAttributeValues.DISABLED);
    if (StringHelper.hasText (m_sForm))
      aElement.setAttribute (CHTMLAttributes.FORM, m_sForm);
  }
}
