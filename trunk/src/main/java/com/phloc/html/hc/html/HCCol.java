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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.ECSSUnit;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;col&gt; element
 * 
 * @author philip
 */
public final class HCCol extends AbstractHCElement <HCCol>
{
  private String m_sWidth;

  public HCCol ()
  {
    super (EHTMLElement.COL);
  }

  public HCCol (@Nonnegative final int nWidth)
  {
    this ();
    if (nWidth < 0)
      throw new IllegalArgumentException ("The passed width is too small: " + nWidth);
    setWidth (Integer.toString (nWidth));
  }

  private HCCol (@Nullable final String sWidth)
  {
    this ();
    setWidth (sWidth);
  }

  public boolean isStar ()
  {
    return CHTMLAttributeValues.STAR.equals (m_sWidth);
  }

  @Nullable
  public String getWidth ()
  {
    return m_sWidth;
  }

  @Nonnull
  public HCCol setWidth (@Nullable final String sWidth)
  {
    m_sWidth = sWidth;
    return this;
  }

  public boolean isStarWidth ()
  {
    return CHTMLAttributeValues.STAR.equals (m_sWidth);
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sWidth))
      aElement.setAttribute (CHTMLAttributes.WIDTH, m_sWidth);
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("width", m_sWidth).toString ();
  }

  @Nonnull
  public static HCCol star ()
  {
    return new HCCol (CHTMLAttributeValues.STAR);
  }

  @Nonnull
  public static HCCol perc (final int nPerc)
  {
    return new HCCol (ECSSUnit.perc (nPerc));
  }

  @Nonnull
  public static HCCol fromString (@Nullable final String sWidth)
  {
    return new HCCol (sWidth);
  }
}
