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
package com.phloc.html.markdown;

import javax.annotation.Nonnull;

import com.phloc.commons.ValueEnforcer;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.HCNodeList;

/**
 * The result of a Markdown processing
 * 
 * @author Philip Helger
 */
public class MarkdownProcessingResult
{
  private final HCNodeList m_aNodeList;

  public MarkdownProcessingResult (@Nonnull final HCStack aResult)
  {
    ValueEnforcer.notNull (aResult, "Result");

    m_aNodeList = aResult.getRoot ();
  }

  @Nonnull
  public HCNodeList getNodeList ()
  {
    return m_aNodeList;
  }

  @Nonnull
  public String getAsHTMLString ()
  {
    return getAsHTMLString (HCSettings.isDefaultPrettyPrint ());
  }

  @Nonnull
  public String getAsHTMLString (final boolean bPrettyPrint)
  {
    return HCSettings.getAsHTMLStringWithoutNamespaces (m_aNodeList, bPrettyPrint).trim ();
  }

  @Nonnull
  public String getAsHTMLString (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    return HCSettings.getAsHTMLString (m_aNodeList, aConversionSettings).trim ();
  }
}
