package com.phloc.html.js.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for class {@link JSOp}.
 * 
 * @author philip
 */
public final class JSOpTest
{

  private void _test (final String sJS, final IJSExpression aExpr)
  {
    assertEquals (sJS, aExpr.getJSCode ());
  }

  @Test
  public void testBasic ()
  {
    final JSAtom n5 = JSExpr.lit (5);
    final JSFieldRef a = JSExpr.ref ("a");
    final JSFieldRef b = JSExpr.ref ("b");
    _test ("(-5)", JSOp.minus (n5));
    _test ("(5)", JSOp.inParantheses (n5));
    _test ("false", JSOp.not (JSExpr.TRUE));
    _test ("true", JSOp.not (JSExpr.FALSE));
    _test ("(!a)", JSOp.not (a));
    _test ("(~5)", JSOp.complement (n5));
    _test ("a++", JSOp.incr (a));
    _test ("a--", JSOp.decr (a));
    _test ("typeof a", JSOp.typeof (a));
    _test ("(a+b)", JSOp.plus (a, b));
    _test ("(a-b)", JSOp.minus (a, b));
    _test ("(a*b)", JSOp.mul (a, b));
    _test ("(a/b)", JSOp.div (a, b));
    _test ("(a%b)", JSOp.mod (a, b));
    _test ("(a<<b)", JSOp.shl (a, b));
    _test ("(a>>b)", JSOp.shr (a, b));
    _test ("(a>>>b)", JSOp.shrz (a, b));
    _test ("(a&b)", JSOp.band (a, b));
    _test ("(a|b)", JSOp.bor (a, b));
    _test ("(a&&b)", JSOp.cand (a, b));
    _test ("a", JSOp.cand (a, JSExpr.TRUE));
    _test ("false", JSOp.cand (a, JSExpr.FALSE));
    _test ("b", JSOp.cand (JSExpr.TRUE, b));
    _test ("false", JSOp.cand (JSExpr.FALSE, b));
    _test ("(a||b)", JSOp.cor (a, b));
    _test ("true", JSOp.cor (a, JSExpr.TRUE));
    _test ("a", JSOp.cor (a, JSExpr.FALSE));
    _test ("true", JSOp.cor (JSExpr.TRUE, b));
    _test ("b", JSOp.cor (JSExpr.FALSE, b));
  }
}
