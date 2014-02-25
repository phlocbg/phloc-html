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
package com.phloc.html.hc.utils;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.annotations.PresentForCodeCoverage;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;

/**
 * This class is used to centrally handle the out-of-band nodes.
 * 
 * @author Philip Helger
 */
@NotThreadSafe
@Deprecated
public final class HCOutOfBandHandler
{
  @PresentForCodeCoverage
  @SuppressWarnings ("unused")
  private static final HCOutOfBandHandler s_aInstance = new HCOutOfBandHandler ();

  private HCOutOfBandHandler ()
  {}

  /**
   * Check if the passed node is an out-of-band node.
   * 
   * @param aHCNode
   *        The node to be checked. May not be <code>null</code>.
   * @return <code>true</code> if it is an out-of-band node, <code>false</code>
   *         if not.
   */
  public static boolean isOutOfBandNode (@Nonnull final IHCNode aHCNode)
  {
    return HCSpecialNodeHandler.isOutOfBandNode (aHCNode);
  }

  /**
   * Extract all out-of-band child nodes for the passed element. Ensure to call
   * {@link com.phloc.html.hc.IHCNode#beforeConvertToNode(com.phloc.html.hc.conversion.IHCConversionSettingsToNode)}
   * before calling this method! All out-of-band nodes are detached from their
   * parent so that the original node can be reused.
   * 
   * @param aParentElement
   *        The parent element to extract the nodes from. May not be
   *        <code>null</code>.
   * @return The list with out-of-band nodes. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> recursiveExtractOutOfBandNodes (@Nonnull final IHCHasChildren aParentElement)
  {
    return HCSpecialNodeHandler.recursiveExtractOutOfBandNodes (aParentElement);
  }
}
