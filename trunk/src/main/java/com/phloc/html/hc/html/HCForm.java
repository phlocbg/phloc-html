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
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.CHCCSS;
import com.phloc.html.hc.api.EHCFormMethod;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;

public class HCForm extends AbstractHCElementWithChildren <HCForm>
{
  private String m_sAction;
  private IJSCodeProvider m_aAction;
  private EHCFormMethod m_eMethod = EHCFormMethod.POST;
  private String m_sName;
  private String m_sAcceptCharset;
  private HCA_Target m_aLinkTarget;
  private boolean m_bDisableAutoComplete = false;
  private boolean m_bSubmitPressingEnter = false;
  private int m_nSubmitButtonTabIndex = -1;

  public HCForm ()
  {
    super (EHTMLElement.FORM);
  }

  public HCForm (@Nullable final String sAction)
  {
    this ();
    setAction (sAction);
  }

  public HCForm (@Nonnull final ISimpleURL aAction)
  {
    this (aAction.getAsString ());
  }

  public HCForm (@Nullable final IJSCodeProvider aAction)
  {
    this ();
    setAction (aAction);
  }

  @Nonnull
  public final HCForm setAction (@Nullable final String sAction)
  {
    m_sAction = sAction;
    m_aAction = null;
    return this;
  }

  @Nonnull
  public final HCForm setAction (@Nullable final IJSCodeProvider aAction)
  {
    m_sAction = null;
    m_aAction = cleanJSLink (aAction, true);
    return this;
  }

  @Nonnull
  public final HCForm setMethod (@Nullable final EHCFormMethod eMethod)
  {
    m_eMethod = eMethod;
    return this;
  }

  @Nonnull
  public final HCForm setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nonnull
  public final HCForm setTarget (@Nullable final HCA_Target aTarget)
  {
    m_aLinkTarget = aTarget;
    return this;
  }

  @Nonnull
  public final HCForm setAcceptCharset (@Nullable final String sAcceptCharset)
  {
    m_sAcceptCharset = sAcceptCharset;
    return this;
  }

  @Nonnull
  public final HCForm setDisableAutoComplete (final boolean bDisableAutoComplete)
  {
    m_bDisableAutoComplete = bDisableAutoComplete;
    return this;
  }

  @Nonnull
  public final HCForm setOnReset (@Nullable final IJSCodeProvider aOnReset)
  {
    addEventHandler (EJSEvent.ONRESET, aOnReset);
    return this;
  }

  @Nonnull
  public final HCForm setOnSubmit (@Nullable final IJSCodeProvider aOnSubmit)
  {
    addEventHandler (EJSEvent.ONSUBMIT, aOnSubmit);
    return this;
  }

  @Nonnull
  public final HCForm setSubmitPressingEnter (final boolean bSubmitPressingEnter)
  {
    return setSubmitPressingEnter (bSubmitPressingEnter, -1);
  }

  @Nonnull
  public final HCForm setSubmitPressingEnter (final boolean bSubmitPressingEnter, final int nSubmitButtonTabIndex)
  {
    m_bSubmitPressingEnter = bSubmitPressingEnter;
    m_nSubmitButtonTabIndex = nSubmitButtonTabIndex;
    return this;
  }

  @Nonnull
  private static HCButton _createFakeSubmitButton ()
  {
    return new HCButton_Submit ("").addClass (CHCCSS.CSS_CLASS_INVISIBLE_BUTTON);
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    if (m_aAction != null)
      aElement.setAttribute (CHTMLAttributes.ACTION, m_aAction.getJSCode ());
    else
      if (StringHelper.hasText (m_sAction))
        aElement.setAttribute (CHTMLAttributes.ACTION, m_sAction);

    if (m_eMethod != null)
      aElement.setAttribute (CHTMLAttributes.METHOD, m_eMethod.getAttrValue ());
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sAcceptCharset))
      aElement.setAttribute (CHTMLAttributes.ACCEPTCHARSET, m_sAcceptCharset);
    if (m_bDisableAutoComplete)
      aElement.setAttribute (CHTMLAttributes.AUTOCOMPLETE, CHTMLAttributeValues.OFF);
    if (m_aLinkTarget != null)
      aElement.setAttribute (CHTMLAttributes.TARGET, m_aLinkTarget.getAttrValue ());

    if (m_bSubmitPressingEnter)
    {
      final HCButton aButton = _createFakeSubmitButton ();
      if (m_nSubmitButtonTabIndex >= 0)
        aButton.setTabIndex (m_nSubmitButtonTabIndex);
      aElement.appendChild (aButton.getAsNode (aConversionSettings));
    }
  }
}
