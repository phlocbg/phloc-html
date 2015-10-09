/**
 * Copyright (C) 2006-2014 phloc systems
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
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;title&gt; element
 * 
 * @author Philip Helger
 */
public class HCTitle extends AbstractHCElement <HCTitle>
{
  private String m_sContent;

  public HCTitle ()
  {
    super (EHTMLElement.TITLE);
  }

  public HCTitle (@Nullable final String sContent)
  {
    this ();
    setContent (sContent);
  }

  @Nullable
  public String getContent ()
  {
    return m_sContent;
  }

  @Nonnull
  public HCTitle setContent (@Nullable final String sContent)
  {
    m_sContent = sContent;
    return this;
  }

  @Override
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return StringHelper.hasText (m_sContent);
  }

  @Override
  protected void applyProperties (@Nonnull final IMicroElement aElement,
                                  @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.appendText (m_sContent);
  }
}
