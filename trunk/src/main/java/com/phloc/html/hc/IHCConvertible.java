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
package com.phloc.html.hc;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Interface for HC elements that can be converted to micro XML (and therefore
 * also to a string)
 * 
 * @author philip
 */
public interface IHCConvertible
{
  /**
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  IMicroNode getAsNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as XML optionally without indentation.
   */
  @Nonnull
  String getAsHTMLString (@Nonnull IHCConversionSettings aConversionSettings);
}
