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
package com.phloc.html.hc.conversion;

import javax.annotation.Nonnull;

import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

public interface IHCConversionSettings
{
  /**
   * @return The HTML version to be used to transform HC nodes into XML nodes.
   */
  @Nonnull
  EHTMLVersion getHTMLVersion ();

  /**
   * @return <code>true</code> if the HTML output should be indented and
   *         aligned.
   */
  boolean isIdentAndAlignHTML ();

  /**
   * @return <code>true</code> if the CSS output should be indented and aligned.
   */
  boolean isIdentAndAlignCSS ();

  /**
   * @return <code>true</code> if the consistency checks are enabled,
   *         <code>false</code> otherwise.
   */
  boolean areConsistencyChecksEnabled ();

  /**
   * @return The current customizer to be used. Never <code>null</code>. By
   *         default a {@link HCDefaultCustomizer} object is returned.
   */
  @Nonnull
  IHCCustomizer getCustomizer ();
}
