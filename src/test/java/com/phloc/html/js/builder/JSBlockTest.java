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
package com.phloc.html.js.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for class {@link JSBlock}
 * 
 * @author philip
 */
public final class JSBlockTest
{
  @Test
  public void test () throws Exception
  {
    final JSBlock aBlock = new JSBlock ();
    assertEquals (0, aBlock.pos ());
    assertTrue (aBlock.isEmpty ());
    assertEquals ("{}", aBlock.getJSCode ());

    JSVar a = aBlock.decl ("a");
    assertEquals (1, aBlock.pos ());
    assertFalse (aBlock.isEmpty ());
    assertEquals ("{var a;}", aBlock.getJSCode ());

    final JSVar b = aBlock.decl ("b", JSExpr.lit (5));
    assertEquals (2, aBlock.pos ());
    assertFalse (aBlock.isEmpty ());
    assertEquals ("{var a;var b=5;}", aBlock.getJSCode ());

    aBlock.assign (a, b);
    assertEquals (3, aBlock.pos ());
    assertEquals ("{var a;var b=5;a=b;}", aBlock.getJSCode ());

    aBlock.assign (b, true);
    assertEquals (4, aBlock.pos ());
    assertEquals ("{var a;var b=5;a=b;b=true;}", aBlock.getJSCode ());

    aBlock.assign (a, 'c');
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';}", aBlock.getJSCode ());

    aBlock.assign (b, 3.1415);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;}", aBlock.getJSCode ());

    aBlock.assign (a, 47.11f);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;}", aBlock.getJSCode ());

    aBlock.assign (b, 65599);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;}", aBlock.getJSCode ());

    aBlock.assign (a, 655996559965599L);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;}", aBlock.getJSCode ());
    final int nCurPos = aBlock.pos ();

    aBlock.assign (b, "Ha llo");
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;b='Ha llo';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (b, '!');
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.pos (nCurPos);
    aBlock.assignPlus (a, 5.0);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, -4.0);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 0.0);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignMinus (a, 0.0);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 27f);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, -26f);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 0.0f);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignMinus (a, 0.0f);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 32);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, -33);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 0);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignMinus (a, 0);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 1234567890111L);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;a+=1234567890111;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, -9876543219888L);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;a+=1234567890111;a-=9876543219888;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignPlus (a, 0L);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;a+=1234567890111;a-=9876543219888;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.assignMinus (a, 0L);
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;a+=1234567890111;a-=9876543219888;b='Ha llo';b+='!';}",
                  aBlock.getJSCode ());

    aBlock.posEnd ();
    aBlock.assignPlus (b, " oder?");
    assertEquals ("{var a;var b=5;a=b;b=true;a='c';b=3.1415;a=47.11;b=65599;a=655996559965599;a+=5.0;a-=4.0;a+=27.0;a-=26.0;a+=32;a-=33;a+=1234567890111;a-=9876543219888;b='Ha llo';b+='!';b+=' oder?';}",
                  aBlock.getJSCode ());

    aBlock.clear ();
    assertEquals ("{}", aBlock.getJSCode ());
    assertTrue (aBlock.isEmpty ());
    assertEquals (0, aBlock.pos ());

    a = aBlock.decl ("a", JSExpr.lit (5));
    assertEquals (1, aBlock.pos ());
    assertFalse (aBlock.isEmpty ());
    assertEquals ("{var a=5;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 2.5);
    assertEquals ("{var a=5;a*=2.5;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 1.0);
    assertEquals ("{var a=5;a*=2.5;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 3.3f);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 1.0f);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 4);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 1);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 56L);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;}", aBlock.getJSCode ());

    aBlock.assignMultiply (a, 1L);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 4.5);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 1.0);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 22f);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 1f);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 3);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 1);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 11L);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;}", aBlock.getJSCode ());

    aBlock.assignDivide (a, 1L);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;}", aBlock.getJSCode ());

    aBlock.assignModulo (a, 101);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;a%=101;}", aBlock.getJSCode ());

    aBlock.assignModulo (a, 56L);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;a%=101;a%=56;}", aBlock.getJSCode ());

    aBlock.assign (a, "Test");
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;a%=101;a%=56;a='Test';}",
                  aBlock.getJSCode ());

    aBlock.invoke (a, "length");
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;a%=101;a%=56;a='Test';a.length();}",
                  aBlock.getJSCode ());

    final JSBlock aSubBlock = aBlock._if (JSOp.eeq (JSExpr.lit (1), JSExpr.lit (1)))._then ();
    aSubBlock._return (false);
    assertEquals ("{var a=5;a*=2.5;a*=3.3;a*=4;a*=56;a/=4.5;a/=22.0;a/=3;a/=11;a%=101;a%=56;a='Test';a.length();if(1===1){return false;}}",
                  aBlock.getJSCode ());

    assertEquals (aBlock.toString (), aBlock.toString ());
  }
}
