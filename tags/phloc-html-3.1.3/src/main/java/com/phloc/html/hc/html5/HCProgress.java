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

import com.phloc.commons.CGlobal;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

@SinceHTML5
public final class HCProgress extends AbstractHCElementWithChildren <HCProgress>
{
  private double m_dValue = CGlobal.ILLEGAL_DOUBLE;
  private double m_dMax = CGlobal.ILLEGAL_DOUBLE;

  public HCProgress ()
  {
    super (EHTMLElement.PROGRESS);
  }

  public HCProgress (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCProgress (@Nullable final String sChild)
  {
    super (EHTMLElement.PROGRESS, sChild);
  }

  public HCProgress (@Nullable final String... aChildren)
  {
    super (EHTMLElement.PROGRESS, aChildren);
  }

  public HCProgress (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.PROGRESS, aChild);
  }

  public HCProgress (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.PROGRESS, aChildren);
  }

  public HCProgress (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.PROGRESS, aChildren);
  }

  @Nonnull
  public HCProgress setValue (final double dValue)
  {
    m_dValue = dValue;
    return this;
  }

  @Nonnull
  public HCProgress setMax (final double dMax)
  {
    m_dMax = dMax;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    /**
     * <pre>
     * The value attribute, if present, must have a value equal to or 
     * greater than zero, and less than or equal to the value of the max 
     * attribute, if present, or 1.0, otherwise. The max attribute, if 
     * present, must have a value greater than zero.
     * </pre>
     */
    if (!EqualsUtils.equals (m_dValue, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.VALUE, Double.toString (m_dValue));
    if (!EqualsUtils.equals (m_dMax, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.MAX, Double.toString (m_dMax));
  }
}
