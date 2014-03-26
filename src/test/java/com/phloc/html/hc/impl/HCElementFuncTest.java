package com.phloc.html.hc.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.phloc.html.hc.html.HCP;

/**
 * Test class for class {@link AbstractHCElement}
 * 
 * @author Philip Helger
 */
public final class HCElementFuncTest
{
  @Test
  public void testSetID ()
  {
    final HCP aElement = new HCP ();
    assertNull (aElement.getID ());
    assertNotNull (aElement.ensureID ().getID ());
    assertSame (aElement, aElement.setID ("foo"));
    assertEquals ("foo", aElement.getID ());

    try
    {
      // ID with whitespace is not allowed
      aElement.setID ("ID blank");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      // ID with whitespace is not allowed
      aElement.setID (" IDblank");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      // ID with whitespace is not allowed
      aElement.setID ("ID\tblank");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}
    assertEquals ("foo", aElement.getID ());
  }
}
