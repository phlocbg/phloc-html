/**
 * Copyright (C) 2006-2015 phloc systems
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

import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCNode;

public interface IHCSpecialNodeListModifier
{
  /**
   * Merge certain special nodes.
   * 
   * @param aNodes
   *        The source list of special nodes to be merged.
   * @return The modified list to be used for further processing.
   */
  @Nonnull
  @ReturnsMutableCopy
  List <? extends IHCNode> modifySpecialNodes (@Nonnull List <? extends IHCNode> aNodes);
}
