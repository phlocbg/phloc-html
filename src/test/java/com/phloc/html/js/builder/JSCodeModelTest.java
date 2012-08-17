package com.phloc.html.js.builder;

import org.junit.Test;

public final class JSCodeModelTest
{
  @Test
  public void test () throws Exception
  {
    final JSCodeModel aCM = new JSCodeModel ();
    final JSPackage aPkg = aCM.rootPackage ();

    // Global variable
    aPkg.var (JSPrimitiveType.NUMBER, "g_aRoot", JSExpr.lit (0));

    // Crude function
    {
      final JSFunction aFuncMain = aPkg.function ("mainAdd");
      aFuncMain.jsDoc ().add ("This is a global function");
      final JSVar m1 = aFuncMain.param ("m1");
      final JSVar aRoot = aFuncMain.body ().decl (JSPrimitiveType.NUMBER, "root", JSExpr.lit (5));
      final JSFunction aFunc = aFuncMain.body ().function ("add");
      {
        aFunc.jsDoc ().add ("This is a nested function");
        final JSVar s1 = aFunc.param (JSPrimitiveType.STRING, "s1");
        final JSVar s2 = aFunc.param ("s2");
        aFunc.body ()._return (s1.plus (s2));
      }

      // if
      final JSConditional aCond = aFuncMain.body ()._if (m1.typeof ().eeq (JSPrimitiveType.STRING.type ()));

      // try catch finally
      aFuncMain.body ().comment ("Test try/catch/finally");
      final JSTryBlock aTB = aCond._then ()._try ();
      aTB.body ()._return (JSExpr.lit (5).inParantheses ().inParantheses ());
      final JSCatchBlock aCB = aTB._catch ("ex");
      aCB.body ()._throw (JSExpr._new (JSPrimitiveType.ERROR).arg (aCB.param ()));
      aTB._finally ().invoke (aRoot, "substring").arg (0).arg (1);

      // RegExp
      aFuncMain.body ().comment ("Test reg exps");
      aFuncMain.body ().add (JSExpr.regex ("water(mark)?")
                                   .global (true)
                                   .caseInsensitive (true)
                                   .multiLine (true)
                                   .invoke ("test")
                                   .arg ("waterMark"));
      aFuncMain.body ().add (JSExpr.regex ("water(mark)?")
                                   .global (false)
                                   .caseInsensitive (true)
                                   .multiLine (false)
                                   .invoke ("test")
                                   .arg ("Water"));

      // Anonymous function
      {
        final JSAnonymousFunction a = JSExpr.anonymousFunction ();
        final JSVar av = a.param ("a");
        a.body ()._return (av.plus (JSExpr.lit (0.5f)));
        aFuncMain.body ().invoke (a).arg (7.5);
        aFuncMain.body ().invoke (aFunc).arg (32).arg (-4);
      }

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
       *   return [sHTML, sComments];
       * }
       * </pre>
       */
      final JSFunction aFuncMain = aCM.rootPackage ().function ("sajax_extract_htmlcomments");
      final JSVar sHTML = aFuncMain.param ("sHTML");
      final JSVar sComments = aFuncMain.body ().decl ("sComments", JSExpr.lit (""));
      aFuncMain.body ().comment ("Lazy quantifier \"*?\"");
      final JSAnonymousFunction anonFunction = JSExpr.anonymousFunction ();
      anonFunction.param ("all");
      final JSVar sComment = anonFunction.param ("sComment");
      anonFunction.body ().assignPlus (sComments, sComment.plus (JSExpr.lit ('\n')));
      anonFunction.body ()._return (JSExpr.lit (""));
      aFuncMain.body ().assign (sHTML,
                                sHTML.invoke ("replace")
                                     .arg (JSExpr.regex ("<!--([\\s\\S]*?)-->").global (true))
                                     .arg (anonFunction));
      aFuncMain.body ().comment ("Remaining HTML + comments content");
      aFuncMain.body ()._return (JSExpr.newArray ().add (sHTML).add (JSExpr.NULL).add (sComments));
    }

    final String sCode = aCM.rootPackage ().getJSCode ();
    System.out.println (sCode);
  }
}
