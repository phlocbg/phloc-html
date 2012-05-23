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

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.phloc.commons.url.SimpleURL;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.html.hc.html5.HCWBR;

public final class FuncTestHC
{
  @Test
  public void testMainHC ()
  {
    final HCBody b = new HCBody ();
    b.addChild (new HCA (new SimpleURL ("http://www.phloc.com")).setTarget (HCA_Target.SELF).addChild ("phloc"));
    b.addChild (new HCAbbreviation ("abbr"));
    b.addChild (new HCAcronym ("acronym"));
    b.addChild (new HCAddress ("address"));
    b.addChild (new HCBidirectionalOverwrite ("bdo"));
    b.addChild (new HCBlockQuote ("blockQuote"));
    b.addChild (new HCBold (new HCBR ()));
    b.addChild (new HCButton_Reset ("Abbrechen"));
    b.addChild (new HCButton_Submit ("OK"));
    b.addChild (new HCButton ("Knopf"));
    b.addChild (new HCCenter ());
    b.addChild (new HCCenter ("Zentriert"));
    b.addChild (new HCCheckBox ("cb1", true));
    b.addChild (new HCCite ());
    b.addChild (new HCCite ("Zitiert"));
    b.addChild (new HCCode ());
    b.addChild (new HCCode ("var i = 0;"));
    b.addChild (new HCDefinition ());
    b.addChild (new HCDefinition ("<a> ist ein XML Tag"));
    final HCDefinitionList aDL = b.addAndReturnChild (new HCDefinitionList ());
    aDL.addItem (new HCDefinitionDefinition ());
    aDL.addItem (new HCDefinitionDefinition ("def"));
    aDL.addItem (new HCDefinitionTerm ());
    aDL.addItem (new HCDefinitionTerm ("term"));
    b.addChild (new HCDeleted ());
    b.addChild (new HCDeleted ("gelöscht"));
    b.addChild (new HCDir ().addItem (new HCLI ("punkt")));
    b.addChild (new HCDiv ());
    b.addChild (new HCDiv ("Absatz"));
    b.addChild (new HCEdit ("filename", "autoexec.bat"));
    b.addChild (new HCEditFile ("upload"));
    b.addChild (new HCEditPassword ("password"));
    b.addChild (new HCEM ());
    b.addChild (new HCEM ("emphasised"));
    b.addChild (new HCEmbed ().setSrc (new SimpleURL ("myfile.txt")));
    b.addChild (new HCExample ());
    b.addChild (new HCExample ("Das wäre also ein Beispiel"));
    // TODO add remaining tags
    b.addChild (new HCForm ("?").setSubmitPressingEnter (false));
    b.addChild (new HCH1 ());
    b.addChild (new HCH1 ("Ü1"));
    b.addChild (new HCH2 ());
    b.addChild (new HCH2 ("Ü2"));
    b.addChild (new HCH3 ());
    b.addChild (new HCH3 ("Ü3"));
    b.addChild (new HCH4 ());
    b.addChild (new HCH4 ("Ü4"));
    b.addChild (new HCH5 ());
    b.addChild (new HCH5 ("Ü5"));
    b.addChild (new HCH6 ());
    b.addChild (new HCH6 ("Ü6"));
    b.addChild (new HCHR ());
    b.addChild (new HCStrong ());
    b.addChild (new HCStrong ("Das wäre also ein Beispiel"));
    final HCTable aTable = b.addAndReturnChild (new HCTable (new HCCol (50), new HCCol (20)).setBodyID ("ID"));
    aTable.addHeaderRow ().addCells ("Name", "Wert");
    aTable.addBodyRow ().addCells ("abc", "def");
    aTable.addFooterRow ().addCells ("", "OK!");
    b.addChild (new HCWBR ());

    assertNotNull (HCSettings.getAsNode (b));
    System.out.println (HCSettings.getAsHTMLString (b, true));
  }
}
