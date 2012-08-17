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

import org.junit.Test;

public final class JSPackageTest
{
  @Test
  public void test () throws Exception
  {
    final JSPackage aPkg = new JSPackage ();

    // Global variable
    aPkg.var (JSPrimitiveType.NUMBER, "g_aRoot", JSExpr.lit (0));

    // Crude function
    {
      final JSFunction aFuncMain = aPkg.function ("mainAdd");
      aFuncMain.jsDoc ().add ("This is a global function");
      final JSVar m1 = aFuncMain.param ("m1");

      // function variable
      final JSVar aRoot = aFuncMain.body ().decl (JSPrimitiveType.NUMBER, "root", JSExpr.lit (5));

      // inline function
      final JSFunction aFunc = aFuncMain.body ().function ("add");
      {
        aFunc.jsDoc ().add ("This is a nested function");
        final JSVar s1 = aFunc.param (JSPrimitiveType.STRING, "s1");
        final JSVar s2 = aFunc.param ("s2");
        aFunc.body ()._return (s1.plus (s2));

        // Call nested function
        aFuncMain.body ().invoke (aFunc).arg (32).arg (-4);
      }

      // Dynamic function
      {
        final JSVar aAdd2 = aFuncMain.body ().decl ("add2",
                                                    JSPrimitiveType.FUNCTION._new ()
                                                                            .arg ("x")
                                                                            .arg ("y")
                                                                            .arg ("return x+y"));
        aFuncMain.body ().invoke (aAdd2.name ()).arg (1).arg (2);
      }

      // if
      final JSConditional aCond = aFuncMain.body ()._if (m1.typeof ().eeq (JSPrimitiveType.STRING.typeName ()));

      // try catch finally
      aCond._then ().comment ("Test try/catch/finally");
      final JSTryBlock aTB = aCond._then ()._try ();
      aTB.body ()._return (5);
      final JSCatchBlock aCB = aTB._catch ("ex");
      aCB.body ()._throw (JSPrimitiveType.ERROR._new ().arg (aCB.param ()));
      aTB._finally ().invoke (aRoot, "substring").arg (0).arg (1);

      // RegExp
      aFuncMain.body ().comment ("Test reg exps");
      aFuncMain.body ().invoke (JSExpr.regex ("water(mark)?").gim (true, true, true), "test").arg ("waterMark");
      aFuncMain.body ().invoke (JSExpr.regex ("water(mark)?").gim (false, true, false), "test").arg ("Water");
      aFuncMain.body ().invoke (JSExpr.lit ("string"), "search").arg (JSExpr.regex ("expression"));
      aFuncMain.body ().invoke (JSExpr.lit ("string"), "replace").arg (JSExpr.regex ("expression")).arg ("replacement");

      // Anonymous function
      {
        final JSAnonymousFunction a = JSExpr.anonymousFunction ();
        final JSVar av = a.param ("a");
        a.body ()._return (av.plus (0.5));
        aFuncMain.body ().invoke (a).arg (7.5);
      }

      // Array
      final JSVar aArray1 = aFuncMain.body ().decl ("array1", JSExpr.newArray ().add (5));
      aFuncMain.body ().assign (aArray1.component (0), 6);

      final JSVar aArray1a = aFuncMain.body ().decl ("array1a", JSPrimitiveType.ARRAY._new ().arg (5));
      aFuncMain.body ().assign (aArray1a.component (0), 7);
      aFuncMain.body ().invoke (aArray1a, "push").arg ("pushed");

      // Associative Array
      final JSVar aArray2 = aFuncMain.body ().decl ("array2",
                                                    JSExpr.newAssocArray ()
                                                          .add ("num", 1)
                                                          .add ("array", aArray1)
                                                          .add ("assocarray",
                                                                JSExpr.newAssocArray ()
                                                                      .add ("key", "value")
                                                                      .add ("key2", "anything else")));
      aFuncMain.body ().assign (aArray2.component ("num"), 6);

      // concatenate misc things
      aFuncMain.body ()._return (m1.plus (JSExpr.lit ("abc")
                                                .ref ("length")
                                                .plus (aRoot.plus (JSExpr.invoke (aFunc).arg (2).arg (4)))));
    }

    {
      /**
       * <pre>
       * function sajax_extract_htmlcomments (sHTML) {
       *   var sComments = '';
       *   // Lazy quantifier "*?"
       *   sHTML = sHTML.replace(/<!--([\s\S]*?)-->/g, function(all, sComment){
       *     sComments += sComment + '\n';
       *     return '';
       *   });
       *   // Remaining HTML + comments content
       *   return { html:sHTML, comments:sComments };;
       * }
       * </pre>
       */
      final JSFunction aFuncMain = aPkg.function ("sajax_extract_htmlcomments");
      final JSVar sHTML = aFuncMain.param ("sHTML");
      final JSVar sComments = aFuncMain.body ().decl ("sComments", JSExpr.lit (""));
      aFuncMain.body ().comment ("Lazy quantifier \"*?\"");
      final JSAnonymousFunction anonFunction = JSExpr.anonymousFunction ();
      anonFunction.param ("all");
      final JSVar sComment = anonFunction.param ("sComment");
      anonFunction.body ().assignPlus (sComments, sComment.plus ('\n'));
      anonFunction.body ()._return (JSExpr.lit (""));
      aFuncMain.body ().assign (sHTML,
                                sHTML.invoke ("replace")
                                     .arg (JSExpr.regex ("<!--([\\s\\S]*?)-->").global (true))
                                     .arg (anonFunction));
      aFuncMain.body ().comment ("Remaining HTML + comments content");
      aFuncMain.body ()._return (JSExpr.newAssocArray ().add ("html", sHTML).add ("comments", sComments));
    }

    final String sCode = aPkg.getJSCode ();
    System.out.println (sCode);
  }
}
