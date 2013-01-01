/**
 * Copyright (C) 2006-2013 phloc systems
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.microdom.IMicroComment;
import com.phloc.commons.microdom.impl.MicroComment;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Represents a single CDATA node as HC node.
 * 
 * @author philip
 */
public class HCCommentNode extends AbstractHCNode
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCCommentNode.class);
  private final String m_sText;

  public HCCommentNode (@Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    this (aTextProvider.getText ());
  }

  public HCCommentNode (@Nullable final String sText)
  {
    m_sText = sText == null ? "" : sText;
    if (m_sText.contains ("--"))
      s_aLogger.warn ("Comments may not contain the string '--': " + sText);
  }

  @Nonnull
  public String getText ()
  {
    return m_sText;
  }

  @Override
  @Nonnull
  protected IMicroComment internalConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return new MicroComment (m_sText);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("text", m_sText).toString ();
  }
}
