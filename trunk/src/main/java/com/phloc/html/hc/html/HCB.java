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

import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;b&gt; element<br>
 * HTML5: the specific semantic purpose of representing text “offset from its
 * surrounding content without conveying any extra emphasis or importance, and
 * for which the conventional typographic presentation is bold text”.
 * 
 * @author philip
 */
public class HCB extends AbstractHCElementWithChildren <HCB>
{
  public HCB ()
  {
    super (EHTMLElement.B);
  }
}
