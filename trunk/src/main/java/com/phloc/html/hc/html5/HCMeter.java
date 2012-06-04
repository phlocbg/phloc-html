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
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

@SinceHTML5
public final class HCMeter extends AbstractHCElementWithChildren <HCMeter>
{
  private double m_dValue = CGlobal.ILLEGAL_DOUBLE;
  private double m_dMin = CGlobal.ILLEGAL_DOUBLE;
  private double m_dMax = CGlobal.ILLEGAL_DOUBLE;
  private double m_dLow = CGlobal.ILLEGAL_DOUBLE;
  private double m_dHigh = CGlobal.ILLEGAL_DOUBLE;
  private double m_dOptimum = CGlobal.ILLEGAL_DOUBLE;

  public HCMeter ()
  {
    super (EHTMLElement.METER);
  }

  public HCMeter (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCMeter (@Nullable final String sChild)
  {
    super (EHTMLElement.METER, sChild);
  }

  public HCMeter (@Nullable final String... aChildren)
  {
    super (EHTMLElement.METER, aChildren);
  }

  public HCMeter (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.METER, aChild);
  }

  public HCMeter (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.METER, aChildren);
  }

  public HCMeter (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.METER, aChildren);
  }

  public double getValue ()
  {
    return m_dValue;
  }

  @Nonnull
  public HCMeter setValue (final double dValue)
  {
    m_dValue = dValue;
    return this;
  }

  public double getMin ()
  {
    return m_dMin;
  }

  @Nonnull
  public HCMeter setMin (final double dMin)
  {
    m_dMin = dMin;
    return this;
  }

  public double getMax ()
  {
    return m_dMax;
  }

  @Nonnull
  public HCMeter setMax (final double dMax)
  {
    m_dMax = dMax;
    return this;
  }

  public double getLow ()
  {
    return m_dLow;
  }

  @Nonnull
  public HCMeter setLow (final double dLow)
  {
    m_dLow = dLow;
    return this;
  }

  public double getHigh ()
  {
    return m_dHigh;
  }

  @Nonnull
  public HCMeter setHigh (final double dHigh)
  {
    m_dHigh = dHigh;
    return this;
  }

  public double getOptimum ()
  {
    return m_dOptimum;
  }

  @Nonnull
  public HCMeter setOptimum (final double dOptimum)
  {
    m_dOptimum = dOptimum;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    /**
     * <pre>
     * The following inequalities must hold, as applicable:
     * 
     * minimum ≤ value ≤ maximum
     * minimum ≤ low ≤ maximum (if low is specified)
     * minimum ≤ high ≤ maximum (if high is specified)
     * minimum ≤ optimum ≤ maximum (if optimum is specified)
     * low ≤ high (if both low and high are specified)
     * </pre>
     */

    super.applyProperties (aElement, aConversionSettings);

    if (!EqualsUtils.equals (m_dValue, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.VALUE, Double.toString (m_dValue));
    if (!EqualsUtils.equals (m_dMin, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.MIN, Double.toString (m_dMin));
    if (!EqualsUtils.equals (m_dMax, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.MAX, Double.toString (m_dMax));
    if (!EqualsUtils.equals (m_dLow, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.LOW, Double.toString (m_dLow));
    if (!EqualsUtils.equals (m_dHigh, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.HIGH, Double.toString (m_dHigh));
    if (!EqualsUtils.equals (m_dOptimum, CGlobal.ILLEGAL_DOUBLE))
      aElement.setAttribute (CHTMLAttributes.OPTIMUM, Double.toString (m_dOptimum));
  }
}
