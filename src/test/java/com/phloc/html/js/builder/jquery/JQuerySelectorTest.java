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
package com.phloc.html.js.builder.jquery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.phloc.html.EHTMLElement;

/**
 * Test class for class {@link JQuerySelector}.
 * 
 * @author philip
 */
public final class JQuerySelectorTest
{
  @Test
  public void testBasic ()
  {
    assertEquals (":animated", JQuerySelector.animated.getAsString ());
    assertEquals (":gt(5)", JQuerySelector.gt (5).getAsString ());
    assertEquals ("ul", JQuerySelector.elementName (EHTMLElement.UL).getAsString ());
    assertEquals ("#abc", JQuerySelector.id ("abc").getAsString ());
    assertEquals ("ul#abc", JQuerySelector.elementName (EHTMLElement.UL)
                                          .chain (JQuerySelector.id ("abc"))
                                          .getAsString ());
    assertEquals ("ul li", JQuerySelector.elementName (EHTMLElement.UL)
                                         .descendant (JQuerySelector.elementName ("li"))
                                         .getAsString ());
    assertEquals ("ul,ol", JQuerySelector.elementName (EHTMLElement.UL)
                                         .multiple (JQuerySelector.elementName ("ol"))
                                         .getAsString ());
  }
}
