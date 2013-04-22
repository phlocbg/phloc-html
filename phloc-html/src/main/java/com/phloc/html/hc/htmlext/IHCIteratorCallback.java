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
package com.phloc.html.hc.htmlext;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.state.EFinish;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;

/**
 * Callback interface to be used when iterating an HC tree.
 * 
 * @author Philip Helger
 */
public interface IHCIteratorCallback
{
  /**
   * Callback method
   * 
   * @param aParentNode
   *        Optional parent node. May be <code>null</code> for the initial
   *        element.
   * @param aChildNode
   *        The current child node. Never <code>null</code>.
   * @return {@link EFinish#FINISHED} to break iteration and
   *         {@link EFinish#UNFINISHED} to continue iteration.
   */
  @Nonnull
  EFinish call (@Nullable IHCHasChildren aParentNode, @Nonnull IHCNode aChildNode);
}
