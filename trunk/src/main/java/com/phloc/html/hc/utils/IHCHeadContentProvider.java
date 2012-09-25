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
package com.phloc.html.hc.utils;

import javax.annotation.Nonnull;

import com.phloc.html.hc.html.HCHead;

/**
 * This interface is only implemented by the StructureLayout. It is used to fill
 * the body element of an HTML page.
 * 
 * @author philip
 */
public interface IHCHeadContentProvider
{
  /**
   * This function is called to fill the head area of an HTML page.
   * 
   * @param aHead
   *        the XHTML head element where the head items should be appended
   */
  void fillHTMLHead (@Nonnull HCHead aHead);
}
