/**
 * Copyright (C) 2006-2015 phloc systems
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
package com.phloc.html.hc.utils;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.xml.serialize.EXMLSerializeFormat;
import com.phloc.commons.xml.serialize.EXMLSerializeIndent;
import com.phloc.commons.xml.serialize.XMLWriterSettings;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.html.HCH1;
import com.phloc.html.hc.html.HCHtml;
import com.phloc.html.hc.html.HCScript;

public class HCSpecialNodeHandlerTest
{
  private static final String XHTML11 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<html dir=\"ltr\">" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<head>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<title>Test</title>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "</head>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<body>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<h1>root</h1>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<script type=\"text/javascript\">" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "<!--" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "var y=0;" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "//-->" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "</script>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "</body>" +
                                        XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                        "</html>";

  private static final String HTML5 = "<!DOCTYPE html>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<html dir=\"ltr\">" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<head>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<title>Test</title>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "</head>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<body>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<h1>root</h1>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<script>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "<!--" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "var y=0;" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "//-->" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "</script>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "</body>" +
                                      XMLWriterSettings.DEFAULT_NEWLINE_STRING +
                                      "</html>";

  public static final class MockSpecialNodeListHandler implements IHCSpecialNodeListModifier
  {
    @Override
    public List <? extends IHCNode> modifySpecialNodes (final List <? extends IHCNode> aNodes)
    {
      final List <IHCNode> ret = ContainerHelper.newList (aNodes);
      if (!ret.isEmpty ())
      {
        ret.remove (0);
      }
      return ret;
    }
  }

  @OutOfBandNode
  @SpecialNodeListModifier (MockSpecialNodeListHandler.class)
  public static final class MockScript extends HCScript
  {
    public MockScript (final String sJSCode)
    {
      super (sJSCode);
    }
  }

  @Test
  public void testSpecialNodeListHandler ()
  {
    final HCHtml aHtml = new HCHtml ();
    aHtml.getHead ().setPageTitle ("Test");
    aHtml.getHead ().addJS (new MockScript ("var x=0;"));
    aHtml.getHead ().addJS (new MockScript ("var y=0;"));
    aHtml.getBody ().addChild (new HCH1 ().addChild ("root"));
    final String sCRLF = XMLWriterSettings.DEFAULT_NEWLINE_STRING;
    assertEquals (HTML5 + sCRLF,
                  aHtml.getAsHTMLString (new HCConversionSettings (EHTMLVersion.HTML5).setXMLWriterSettings (new XMLWriterSettings ().setEmitNamespaces (false)
                                                                                                                                     .setFormat (EXMLSerializeFormat.HTML)
                                                                                                                                     .setIndent (EXMLSerializeIndent.ALIGN_ONLY))));
    assertEquals (XHTML11 + sCRLF,
                  aHtml.getAsHTMLString (new HCConversionSettings (EHTMLVersion.XHTML11).setXMLWriterSettings (new XMLWriterSettings ().setEmitNamespaces (false)
                                                                                                                                       .setFormat (EXMLSerializeFormat.HTML)
                                                                                                                                       .setIndent (EXMLSerializeIndent.ALIGN_ONLY))));
  }
}
