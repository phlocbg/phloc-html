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

import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.html.HCBody;
import com.phloc.html.hc.html.HCHead;

/**
 * A special customization interface, that lets you modify existing elements
 * before they are assembled and emitted in the HTML code.
 * 
 * @author philip
 */
public interface IHCCustomizer
{
  /**
   * Customize HC elements with some predefined classes etc. This is only called
   * from within <code>HCHtml.getAsNode()</code>
   * 
   * @param aParentElement
   *        The parent element of the element to be customized. Never
   *        <code>null</code>. This implies that this method is never called for
   *        the root HTML element (HCHtml).
   * @param aElement
   *        The element to be customized. Never <code>null</code>.
   * @param eHTMLVersion
   *        The HTML version to be used. Never <code>null</code>.
   */
  void customizeHCElement (@Nonnull IHCNodeWithChildren <?> aParentElement,
                           @Nonnull IHCElement <?> aElement,
                           @Nonnull EHTMLVersion eHTMLVersion);

  /**
   * This callback is called, when the main HTML element is assembled, to move
   * the out-of-band nodes to the correct place. It is only called from within
   * <code>HCHtml.getAsNode()</code>
   * 
   * @param aOutOfBandNodes
   *        The non-<code>null</code> list of out-of-band nodes. May be empty.
   * @param aHead
   *        The head element. Never <code>null</code>.
   * @param aBody
   *        The body element. Never <code>null</code>.
   */
  void handleOutOfBandNodes (@Nonnull List <IHCBaseNode> aOutOfBandNodes, @Nonnull HCHead aHead, @Nonnull HCBody aBody);
}
