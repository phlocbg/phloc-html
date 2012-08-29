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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.html.HCBR;
import com.phloc.html.hc.impl.HCTextNode;

public final class HCUtilsTest
{
  private static final String HTML_STRING6 = "this is a \nlinebreak test.";
  private static final String HTML_STRING7 = "\nthis is a \nlinebreak test.\n";
  private static final String HTML_STRING8 = "\n";

  @Test
  public void testNl2brListUnmasked ()
  {
    final List <IHCNode> ret = HCUtils.nl2brList ("a\nb");
    assertNotNull (ret);
    assertEquals (3, ret.size ());
    assertTrue (ret.get (0) instanceof HCTextNode);
    assertTrue (ret.get (1) instanceof HCBR);
    assertTrue (ret.get (2) instanceof HCTextNode);

    assertEquals (3, HCUtils.nl2brList (HTML_STRING6).size ());
    assertEquals (5, HCUtils.nl2brList (HTML_STRING7).size ());
    assertEquals (1, HCUtils.nl2brList (HTML_STRING8).size ());
  }
}
