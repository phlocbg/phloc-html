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
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;label&gt; element
 * 
 * @author philip
 */
public class HCLabel extends AbstractHCElementWithChildren <HCLabel>
{
  private String m_sFor;

  public HCLabel ()
  {
    super (EHTMLElement.LABEL);
  }

  @Deprecated
  public HCLabel (@Nullable final String sText)
  {
    this ();
    addChild (sText);
  }

  @Nullable
  public String getFor ()
  {
    return m_sFor;
  }

  /**
   * Indicates that this label is used as the description for another object.
   * 
   * @param sFor
   *        The HTML ID of the other object.
   * @return this
   */
  @Nonnull
  public HCLabel setFor (@Nullable final String sFor)
  {
    m_sFor = sFor;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sFor))
      aElement.setAttribute (CHTMLAttributes.FOR, m_sFor);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("for", m_sFor).toString ();
  }

  /**
   * Create a new LABEL element with the passed child text
   * 
   * @param aChild
   *        The child text provider to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IPredefinedLocaleTextProvider aChild)
  {
    return new HCLabel ().addChild (aChild);
  }

  /**
   * Create a new LABEL element with the passed child text
   * 
   * @param sChild
   *        The child to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final String sChild)
  {
    return new HCLabel ().addChild (sChild);
  }
}
