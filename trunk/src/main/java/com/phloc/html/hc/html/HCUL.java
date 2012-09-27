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
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCULType;
import com.phloc.html.hc.conversion.IHCConversionSettings;

/**
 * Represents an HTML &lt;ul&gt; element
 * 
 * @author philip
 */
public class HCUL extends AbstractHCList <HCUL>
{
  private EHCULType m_eType;

  public HCUL ()
  {
    super (EHTMLElement.UL);
  }

  @Nullable
  public final EHCULType getType ()
  {
    return m_eType;
  }

  @Nonnull
  public final HCUL setType (@Nullable final EHCULType eType)
  {
    m_eType = eType;
    return this;
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    if (m_eType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_eType.getAttrValue ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("type", m_eType).toString ();
  }
}
