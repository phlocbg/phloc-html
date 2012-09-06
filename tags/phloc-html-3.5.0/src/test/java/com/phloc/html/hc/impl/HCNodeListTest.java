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
package com.phloc.html.hc.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.html.hc.html.HCDiv;
import com.phloc.html.hc.html.HCRow;
import com.phloc.html.hc.html.HCSpan;
import com.phloc.html.hc.html.HCTable;

/**
 * Test class for class {@link HCNodeList}
 * 
 * @author philip
 */
public final class HCNodeListTest
{
  @Test
  public void testAll ()
  {
    HCNodeList x = new HCNodeList ();
    assertFalse (x.hasChildren ());
    x.addChild (new HCDiv ("d1"));
    x.addChild (new HCDiv ("d2"));
    assertTrue (x.hasChildren ());
    final IMicroContainer aNode = (IMicroContainer) HCSettings.getAsNode (x);
    assertNotNull (aNode);
    assertEquals (2, x.getChildCount ());

    x = new HCNodeList ();
    x.addChild (new HCSpan ("span"));
    final HCDiv div = x.addAndReturnChild (new HCDiv ("d3"));
    assertNotNull (div);
    assertTrue (HCSettings.getAsHTMLString (div, false).startsWith ("<div>d3</div>"));
    assertEquals (2, x.getChildCount ());
  }

  @Test
  public void testWithTable ()
  {
    final HCTable table = new HCTable ();
    final HCRow tr = table.addBodyRow ();
    tr.addCell (new HCNodeList ().addChild (new HCDiv ("dd2")).addChild (new HCDiv ("dd1")));
    assertTrue (HCSettings.getAsHTMLString (table, false).contains ("<div>dd2</div>"));
  }

  @Test
  public void testGetAsNode ()
  {
    final HCNodeList x = new HCNodeList ();
    x.addChild (new HCDiv ("Na so was"));
    x.addChild (new HCDiv ("aber auch"));
    assertNotNull (HCSettings.getAsNode (x));
    assertEquals ("<div>Na so was</div>" + CGlobal.LINE_SEPARATOR + "<div>aber auch</div>" + CGlobal.LINE_SEPARATOR,
                  HCSettings.getAsHTMLString (x, true));
  }
}
