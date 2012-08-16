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

    final JSFunction aFuncMain = aPkg.function ("add2");
    final JSVar aRoot = aFuncMain.body ().decl (aCM.NUMBER, "root", JSExpr.lit (5));
    final JSFunction aFunc = aFuncMain.body ().function ("add");
    {
      final JSVar s1 = aFunc.param (aCM.STRING, "s1");
      final JSVar s2 = aFunc.param ("s2");
      aFunc.body ()._return (s1.plus (s2));
    }
    aFuncMain.body ()._return (JSExpr.lit (5).invoke ("length").plus (aRoot.plus (JSExpr.invoke (aFunc))));

    new AbstractCodeWriter ("UTF-8")
    {
      @Override
      public Writer getWriter (final JSPackage pkg, final String fileName) throws IOException
      {
        return new PrintWriter (System.out);
      }
    }.build (aCM);
  }
}
