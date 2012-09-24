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
package com.phloc.html.hc.html;

import java.io.Serializable;

import javax.annotation.Nonnull;

import com.phloc.html.hc.IHCBaseNode;

/**
 * Interface for handling custom out-of-band nodes in the BODY elements
 * 
 * @author philip
 */
public interface IHCBodyOutOfBandNodeHandler extends Serializable
{
  /**
   * Handle ouf-of-band nodes in an &lt;body> element
   * 
   * @param aBody
   *        The body node that has the out-of-band-node
   * @param aOutOfBandNode
   *        The out of band node to be handled. Never <code>null</code>.
   */
  void handleOutOfBandNode (@Nonnull HCBody aBody, @Nonnull IHCBaseNode aOutOfBandNode);
}