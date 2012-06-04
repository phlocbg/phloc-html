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
package com.phloc.html.hc.htmlext;

import javax.annotation.Nonnull;

import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.IHCElementWithChildren;
import com.phloc.html.hc.IHCNode;

public interface IHCPanel extends IHCNode
{
  /**
   * Set a text to be displayed in the title bar
   * 
   * @param aTextProvider
   *        The text to be displayed.
   * @return <code>this</code>
   */
  @Nonnull
  IHCPanel addTitleBarText (IPredefinedLocaleTextProvider aTextProvider);

  /**
   * Set a text to be displayed in the title bar
   * 
   * @param sTitleBarContent
   *        The text to be displayed.
   * @return <code>this</code>
   */
  @Nonnull
  IHCPanel addTitleBarText (String sTitleBarContent);

  /**
   * Set a node to be displayed in the title bar
   * 
   * @param aTitleBarContent
   *        The text to be displayed.
   * @return <code>this</code>
   */
  @Nonnull
  IHCPanel addTitleBarNode (IHCNode aTitleBarContent);

  IHCElementWithChildren <?> getContent ();
}
