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
package com.phloc.html.hc.conversion;

import javax.annotation.Nonnull;

import com.phloc.commons.ICloneable;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.xml.serialize.IXMLWriterSettings;
import com.phloc.html.EHTMLVersion;

/**
 * Settings interface that is used to convert HC* nodes to micro nodes, to plain
 * text and for consistency checks.
 * 
 * @author Philip Helger
 */
public interface IHCConversionSettings extends IHCConversionSettingsToNode, ICloneable <IHCConversionSettings>
{
  /**
   * @return The XML writer settings to be used. Never <code>null</code>.
   */
  @Nonnull
  IXMLWriterSettings getXMLWriterSettings ();

  /**
   * Get a clone of this settings, but with a different HTML version.
   * 
   * @param eHTMLVersion
   *        The new HTML version to use. May not be <code>null</code>.
   * @return Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  IHCConversionSettings getClone (@Nonnull EHTMLVersion eHTMLVersion);

  /**
   * Get a clone of this settings, but with a different HTML version. If the
   * passed HTML version equals this HTML version than this is returned
   * unchanged.
   * 
   * @param eHTMLVersion
   *        The new HTML version to use. May not be <code>null</code>.
   * @return this or a clone of this.
   */
  @Nonnull
  IHCConversionSettings getCloneIfNecessary (@Nonnull EHTMLVersion eHTMLVersion);
}
