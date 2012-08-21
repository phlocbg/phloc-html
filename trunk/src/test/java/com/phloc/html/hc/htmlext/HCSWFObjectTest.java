package com.phloc.html.hc.htmlext;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.url.SimpleURL;
import com.phloc.html.hc.conversion.HCSettings;

/**
 * Test class for class {@link HCSWFObject}.
 * 
 * @author philip
 */
public final class HCSWFObjectTest
{
  @Test
  public void testCodeGen ()
  {
    final HCSWFObject x = new HCSWFObject ();
    x.setSWFURL (new SimpleURL ("a.swf"));
    x.setHTMLContainerID ("div1");
    x.setWidth (500).setHeight (300);
    x.setRequiredSWFVersion ("9.0.0");
    x.addFlashVar ("flash1", "Wert");
    final IMicroNode aNode = x.getAsNode (HCSettings.getConversionSettings (false));
    assertNotNull (aNode);
    System.out.println (MicroWriter.getXMLString (aNode));
  }
}
