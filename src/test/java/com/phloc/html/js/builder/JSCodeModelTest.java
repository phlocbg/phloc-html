package com.phloc.html.js.builder;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import org.junit.Test;

import com.phloc.html.js.builder.writer.AbstractCodeWriter;

public final class JSCodeModelTest
{
  @Test
  public void test () throws Exception
  {
    final JSCodeModel aCM = new JSCodeModel ();
    final JSPackage aPkg = aCM.rootPackage ();

    final JSFunction aFuncMain = aPkg.function ("mainAdd");
    final JSVar m1 = aFuncMain.param ("m1");
    final JSVar aRoot = aFuncMain.body ().decl (aCM.NUMBER, "root", JSExpr.lit (5));
    final JSFunction aFunc = aFuncMain.body ().function ("add");
    {
      final JSVar s1 = aFunc.param (aCM.STRING, "s1");
      final JSVar s2 = aFunc.param ("s2");
      aFunc.body ()._return (s1.plus (s2));
    }
    final JSConditional aCond = aFuncMain.body ()._if (m1.typeof ().eeq (JSExpr.lit (aCM.STRING.name ())));
    final JSTryBlock aTB = aCond._then ()._try ();
    aTB.body ()._return (JSExpr.lit (5));
    final JSCatchBlock aCB = aTB._catch ("ex");
    aCB.body ()._throw (JSExpr._new (aCM.ERROR).arg (aCB.param ()));
    aTB._finally ().invoke (aRoot, "substring").arg (0).arg (1);
    aFuncMain.body ()._return (m1.plus (JSExpr.lit ("abc")
                                              .ref ("length")
                                              .plus (aRoot.plus (JSExpr.invoke (aFunc).arg (2).arg (4)))));

    new AbstractCodeWriter ("UTF-8")
    {
      @Override
      public Writer getWriter (final JSPackage pkg, final String fileName) throws IOException
      {
        return new PrintWriter (System.out);
      }
    }.buildPackage (aCM.rootPackage ());
  }
}
