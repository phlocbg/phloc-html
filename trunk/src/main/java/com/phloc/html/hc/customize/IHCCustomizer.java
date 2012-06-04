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
package com.phloc.html.hc.customize;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElement;

public interface IHCCustomizer
{
  /**
   * Customize with some predefined classes etc.
   * 
   * @param aElement
   *        The element to be customized. Never <code>null</code>.
   * @param eHTMLVersion
   *        The HTML version to be used. Never <code>null</code>.
   */
  void customizeHCElement (@Nonnull final IHCElement <?> aElement, @Nonnull EHTMLVersion eHTMLVersion);

  /**
   * Get a custom out of band node
   * 
   * @param aElement
   *        The element to be customized
   * @param eHTMLVersion
   *        The HTML version to be used. Never <code>null</code>.
   * @return <code>null</code> if there is no custom out-of-band node
   */
  @Nullable
  IHCBaseNode getCustomOutOfBandNode (@Nonnull final IHCElement <?> aElement, @Nonnull EHTMLVersion eHTMLVersion);
}
