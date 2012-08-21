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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCOLType;
import com.phloc.html.hc.conversion.HCConversionSettings;

/**
 * Represents an HTML &lt;ol&gt; element
 * 
 * @author philip
 */
public class HCOL extends AbstractHCList <HCOL>
{
  private Integer m_aStart;
  private EHCOLType m_eType;

  public HCOL ()
  {
    super (EHTMLElement.OL);
  }

  @Nonnull
  public HCOL setStart (final int nStart)
  {
    m_aStart = Integer.valueOf (nStart);
    return this;
  }

  @Nonnull
  public final HCOL setType (@Nullable final EHCOLType eType)
  {
    m_eType = eType;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    if (m_aStart != null)
      aElement.setAttribute (CHTMLAttributes.START, m_aStart.toString ());
    if (m_eType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_eType.getAttrValue ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("start", m_aStart)
                            .appendIfNotNull ("type", m_eType)
                            .toString ();
  }
}