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
package com.phloc.html.js.builder.jquery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.phloc.html.EHTMLElement;
import com.phloc.html.css.DefaultCSSClassProvider;
import com.phloc.html.js.builder.JSExpr;

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
    assertEquals ("':animated'", JQuerySelector.animated.getJSCode ());
    assertEquals ("':gt(5)'", JQuerySelector.gt (5).getJSCode ());
    assertEquals ("'ul'", JQuerySelector.elementName (EHTMLElement.UL).getJSCode ());
    assertEquals ("'#abc'", JQuerySelector.id ("abc").getJSCode ());
    assertEquals ("'ul#abc'", JQuerySelector.elementName (EHTMLElement.UL)
                                            .chain (JQuerySelector.id ("abc"))
                                            .getJSCode ());
    assertEquals ("'ul,li'", JQuerySelector.elementName (EHTMLElement.UL)
                                           .multiple (JQuerySelector.elementName ("li"))
                                           .getJSCode ());
    assertEquals ("'ul > li'", JQuerySelector.elementName (EHTMLElement.UL)
                                             .child (JQuerySelector.elementName ("li"))
                                             .getJSCode ());
    assertEquals ("'ul li'", JQuerySelector.elementName (EHTMLElement.UL)
                                           .descendant (JQuerySelector.elementName ("li"))
                                           .getJSCode ());
    assertEquals ("'ul + li'",
                  JQuerySelector.elementName (EHTMLElement.UL)
                                .nextAdjacent (JQuerySelector.elementName ("li"))
                                .getJSCode ());
    assertEquals ("'ul ~ li'",
                  JQuerySelector.elementName (EHTMLElement.UL)
                                .nextSiblings (JQuerySelector.elementName ("li"))
                                .getJSCode ());

    assertEquals ("'ul.any > li,ol#bla'",
                  JQuerySelector.elementName (EHTMLElement.UL)
                                .chain (JQuerySelector.clazz (DefaultCSSClassProvider.create ("any")))
                                .child (JQuerySelector.elementName ("li"))
                                .multiple (JQuerySelector.elementName ("ol").chain (JQuerySelector.id ("bla")))
                                .getJSCode ());
  }

  @Test
  public void testExpr ()
  {
    assertEquals ("('#prefix_'+any)", JQuerySelector.id ("prefix_")
                                                    .chain (new JQuerySelector (JSExpr.ref ("any")))
                                                    .getJSCode ());
  }
}
