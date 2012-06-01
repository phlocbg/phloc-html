package com.phloc.html;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for class {@link EHTMLElement}.
 * 
 * @author philip
 */
public final class EHTMLElementTest
{
  @Test
  public void testMaybeSelfClosed ()
  {
    assertTrue (EHTMLElement.BR.mayBeSelfClosed ());
    assertTrue (EHTMLElement.isTagThatMayBeSelfClosed ("br"));
    assertTrue (EHTMLElement.isTagThatMayBeSelfClosed ("bR"));
    assertTrue (EHTMLElement.isTagThatMayBeSelfClosed ("BR"));
    assertFalse (EHTMLElement.isTagThatMayNotBeSelfClosed ("br"));
    assertFalse (EHTMLElement.isTagThatMayNotBeSelfClosed ("bR"));
    assertFalse (EHTMLElement.isTagThatMayNotBeSelfClosed ("BR"));

    assertFalse (EHTMLElement.A.mayBeSelfClosed ());
    assertFalse (EHTMLElement.isTagThatMayBeSelfClosed ("a"));
    assertFalse (EHTMLElement.isTagThatMayBeSelfClosed ("A"));
    assertTrue (EHTMLElement.isTagThatMayNotBeSelfClosed ("a"));
    assertTrue (EHTMLElement.isTagThatMayNotBeSelfClosed ("A"));
  }
}
