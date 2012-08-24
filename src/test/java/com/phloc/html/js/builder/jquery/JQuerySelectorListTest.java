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

import com.phloc.html.css.DefaultCSSClassProvider;

/**
 * Test class for class {@link JQuerySelectorList}.
 * 
 * @author philip
 */
public final class JQuerySelectorListTest
{
  @Test
  public void testBasic ()
  {
    assertEquals ("#id5", new JQuerySelectorList ().addID ("id5").getAsString ());
    // Check masking
    assertEquals ("#id\\.value", new JQuerySelectorList ().addID ("id.value").getAsString ());
    assertEquals (".basic", new JQuerySelectorList ().addClass (DefaultCSSClassProvider.create ("basic"))
                                                       .getAsString ());
    assertEquals ("td", new JQuerySelectorList ().addElement ("td").getAsString ());
    assertEquals ("td:gt(3)", new JQuerySelectorList ().addElementWithSelector ("td", JQuerySelector.gt (3)).getAsString ());
    assertEquals ("td:checked", new JQuerySelectorList ().addElementWithSelector ("td", JQuerySelector.checked).getAsString ());
  }
}