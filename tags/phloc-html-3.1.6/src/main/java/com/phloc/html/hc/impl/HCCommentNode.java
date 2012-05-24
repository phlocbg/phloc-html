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

import com.phloc.commons.microdom.IMicroComment;
import com.phloc.commons.microdom.impl.MicroComment;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.conversion.HCConversionSettings;

/**
 * Represents a single CDATA node as HC node.
 * 
 * @author philip
 */
public final class HCCommentNode extends AbstractHCNode
{
  private final String m_sText;

  public HCCommentNode (@Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    this (aTextProvider.getText ());
  }

  public HCCommentNode (@Nullable final String sText)
  {
    m_sText = sText == null ? "" : sText;
  }

  @Nonnull
  public String getText ()
  {
    return m_sText;
  }

  @Nonnull
  public IMicroComment getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    return new MicroComment (m_sText);
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("text", m_sText).toString ();
  }
}
