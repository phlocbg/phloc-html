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
package com.phloc.html.resource.css;

import javax.annotation.Nonnull;

import com.phloc.css.media.CSSMediaList;
import com.phloc.html.condcomment.IHasConditionalComment;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCConversionSettings;

/**
 * Base interface for both external and inline CSS declarations in HTML.
 * 
 * @author philip
 */
public interface ICSSHTMLDefinition extends IHasConditionalComment
{
  /**
   * @return <code>true</code> if special media properties are defined.
   */
  boolean hasMedia ();

  /**
   * @return A read only set containing all specified media elements. May not be
   *         <code>null</code> but empty if the CSS is not media specific.
   */
  @Nonnull
  CSSMediaList getMedia ();

  @Nonnull
  IHCNode getAsHCNode (@Nonnull HCConversionSettings aConversionSettings);
}
