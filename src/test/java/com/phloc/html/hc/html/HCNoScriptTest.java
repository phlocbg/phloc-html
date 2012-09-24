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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.IHCNode;

/**
 * Test class for class {@link HCNoScript} This file is automatically generated
 * from com.phloc.html.tools.MainCreateHCClasses so DO NOT EDIT!
 * 
 * @author philip
 */
public final class HCNoScriptTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCNoScript ().hasChildren ());
    assertEquals (0, HCNoScript.create ((IPredefinedLocaleTextProvider) null).getChildCount ());
    assertEquals (0, HCNoScript.create ((IPredefinedLocaleTextProvider) null, (IPredefinedLocaleTextProvider) null)
                               .getChildCount ());
    assertEquals (1, HCNoScript.create ("Text").getChildCount ());
    assertEquals (0, HCNoScript.create ((String) null).getChildCount ());
    assertEquals (1, HCNoScript.create (HCB.create ("Bold")).getChildCount ());
    assertEquals (0, HCNoScript.create ((IHCNode) null).getChildCount ());
    assertEquals (3, HCNoScript.create ("Hallo", "Welt", "!!!").getChildCount ());
    assertEquals (0, HCNoScript.create (new String [0]).getChildCount ());
    assertEquals (0, HCNoScript.create ((String []) null).getChildCount ());
    assertEquals (2, HCNoScript.create (HCB.create ("Bold"), HCI.create ("Italic")).getChildCount ());
    assertEquals (0, HCNoScript.create (new IHCNode [0]).getChildCount ());
    assertEquals (0, HCNoScript.create ((IHCNode []) null).getChildCount ());
    assertEquals (2, HCNoScript.create (ContainerHelper.newList (HCB.create ("Bold"), HCI.create ("Italic")))
                               .getChildCount ());
    assertEquals (0, HCNoScript.create (new ArrayList <IHCNode> ()).getChildCount ());
  }
}
