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

    final JSFunction aFunc = aPkg.function ("add");
    final JSVar s1 = aFunc.param (aCM.STRING, "s1");
    final JSVar s2 = aFunc.param ("s2");
    aFunc.body ()._return (s1.plus (s2));

    final JSFunction aFuncMain = aPkg.function ("add2");
    aFuncMain.body ();

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
