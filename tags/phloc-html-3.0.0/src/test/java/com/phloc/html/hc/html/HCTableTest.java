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

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.phloc.commons.GlobalDebug;
import com.phloc.html.hc.conversion.HCSettings;

/**
 * Test class for class {@link HCTable}.
 * 
 * @author philip
 */
public final class HCTableTest
{
  private static boolean s_bDebug;

  @BeforeClass
  public static void before ()
  {
    s_bDebug = GlobalDebug.isDebugMode ();
    GlobalDebug.setDebugModeDirect (true);
  }

  @AfterClass
  public static void after ()
  {
    GlobalDebug.setDebugModeDirect (s_bDebug);
  }

  @Test
  public void testConsistencySimple ()
  {
    // Simplest version
    HCTable aTable = new HCTable (new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencySimple1");
    aTable.addHeaderRow ().addCells ("h1", "h2");
    aTable.addFooterRow ().addCells ("f1", "f2");
    aTable.addBodyRow ().addCells ("a", "b");
    aTable.addBodyRow ().addCells ("c", "d");
    assertNotNull (HCSettings.getAsNode (aTable));

    aTable = new HCTable (new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencySimple2");
    aTable.addBodyRow ().addCells ("a", "b");
    aTable.addBodyRow ().addCells ("c", "d");
    assertNotNull (HCSettings.getAsNode (aTable));
  }

  @Test
  public void testConsistencyColspan ()
  {
    // Use colspan=2
    final HCTable aTable = new HCTable (new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyColspan1");
    aTable.addHeaderRow ().addAndReturnCell ("h1").setColspan (2);
    aTable.addFooterRow ().addAndReturnCell ("f1").setColspan (2);
    aTable.addBodyRow ().addAndReturnCell ("a").setColspan (2);
    aTable.addBodyRow ().addCells ("c", "d");
    assertNotNull (HCSettings.getAsNode (aTable));
  }

  @Test
  public void testConsistencyRowspan ()
  {
    // Use rowspan=2 on first column
    HCTable aTable = new HCTable (new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan1");
    aTable.addHeaderRow ().addCells ("h1", "h2");
    aTable.addFooterRow ().addCells ("f1", "f2");
    // row 1
    HCRow aRow = aTable.addBodyRow ();
    aRow.addAndReturnCell ("a").setRowspan (2);
    aRow.addCell ("b");
    // row 2
    aTable.addBodyRow ().addCell ("d");
    // row 3
    aTable.addBodyRow ().addCells ("e", "f");
    assertNotNull (HCSettings.getAsNode (aTable));

    // Use rowspan=3 on first column
    aTable = new HCTable (new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan2");
    // row 1
    aRow = aTable.addBodyRow ();
    aRow.addAndReturnCell ("a").setRowspan (3);
    aRow.addCell ("b");
    // row 2
    aTable.addBodyRow ().addCell ("d");
    // row 3
    aTable.addBodyRow ().addCell ("f");
    assertNotNull (HCSettings.getAsNode (aTable));

    // Use rowspan=3 on last column
    aTable = new HCTable (new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan3");
    // row 1
    aRow = aTable.addBodyRow ();
    aRow.addCell ("a");
    aRow.addAndReturnCell ("b").setRowspan (3);
    // row 2
    aTable.addBodyRow ().addCell ("c");
    // row 3
    aTable.addBodyRow ().addCell ("e");
    assertNotNull (HCSettings.getAsNode (aTable));

    // Use rowspan=3 on middle column
    aTable = new HCTable (new HCCol (170), new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan4");
    // row 1
    aRow = aTable.addBodyRow ();
    aRow.addCell ("a");
    aRow.addAndReturnCell ("b").setRowspan (3);
    aRow.addCell ("c0");
    // row 2
    aTable.addBodyRow ().addCells ("c", "e0");
    // row 3
    aTable.addBodyRow ().addCells ("e", "g0");
    assertNotNull (HCSettings.getAsNode (aTable));

    // Use rowspan=2 on first column
    aTable = new HCTable (new HCCol (170), new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan5");
    // row 1
    aRow = aTable.addBodyRow ();
    aRow.addAndReturnCell ("a").setRowspan (2);
    aRow.addCells ("b", "c0");
    // row 2
    aTable.addBodyRow ().addCells ("d", "e0");
    // row 3
    aTable.addBodyRow ().addCells ("e", "f", "g0");
    assertNotNull (HCSettings.getAsNode (aTable));

    // Use rowspan=2 on middle column
    aTable = new HCTable (new HCCol (170), new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan6");
    // row 1
    aRow = aTable.addBodyRow ();
    aRow.addCell ("a");
    aRow.addAndReturnCell ("b").setRowspan (2);
    aRow.addCell ("c0");
    // row 2
    aTable.addBodyRow ().addCells ("c", "e0");
    // row 3
    aTable.addBodyRow ().addCells ("e", "f", "g0");
    assertNotNull (HCSettings.getAsNode (aTable));

    // Use rowspan=2 on last column
    aTable = new HCTable (new HCCol (170), new HCCol (170), HCCol.star ());
    aTable.setID ("testConsistencyRowspan7");
    // row 1
    aRow = aTable.addBodyRow ();
    aRow.addCells ("a", "b");
    aRow.addAndReturnCell ("c0").setRowspan (2);
    // row 2
    aTable.addBodyRow ().addCells ("c", "d");
    // row 3
    aTable.addBodyRow ().addCells ("e", "f", "g0");
    assertNotNull (HCSettings.getAsNode (aTable));
  }
}
