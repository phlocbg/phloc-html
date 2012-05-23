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
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCInputType;
import com.phloc.html.hc.conversion.HCConversionSettings;

// TODO change to http://dev.w3.org/html5/markup/input.text.html#input.text
public abstract class AbstractHCInput <THISTYPE extends AbstractHCInput <THISTYPE>> extends
                                                                                    AbstractHCControl <THISTYPE>
{
  private final EHCInputType m_eType;
  private String m_sPlaceholder;

  public AbstractHCInput (@Nonnull final EHCInputType eType)
  {
    super (EHTMLElement.INPUT);
    if (eType == null)
      throw new NullPointerException ("type");
    m_eType = eType;
  }

  @Nonnull
  public final EHCInputType getType ()
  {
    return m_eType;
  }

  @Nullable
  public final String getPlaceholder ()
  {
    return m_sPlaceholder;
  }

  @Nonnull
  public final THISTYPE setPlaceholder (@Nullable final String sPlaceholder)
  {
    m_sPlaceholder = sPlaceholder;
    return thisAsT ();
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_eType.getAttrValue ());
    if (StringHelper.hasText (m_sPlaceholder))
      aElement.setAttribute (CHTMLAttributes.PLACEHOLDER, m_sPlaceholder);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("type", m_eType)
                            .appendIfNotNull ("placeholder", m_sPlaceholder)
                            .toString ();
  }
}
