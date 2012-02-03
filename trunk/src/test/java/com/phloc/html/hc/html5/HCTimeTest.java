package com.phloc.html.hc.html5;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Test;

/**
 * Test class for class {@link HCTime}
 * 
 * @author philip
 */
public final class HCTimeTest
{
  @Test
  public void testSetDatetime ()
  {
    final HCTime t = new HCTime ();
    t.setAsDuration (new Duration (new DateTime (new GregorianCalendar (2010, 5, 6)),
                                   new DateTime (new GregorianCalendar (2010, 6, 7))));
    assertEquals ("PT744H", t.getDatetime ());
  }
}
