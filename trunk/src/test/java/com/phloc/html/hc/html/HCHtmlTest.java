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
package com.phloc.html.hc.html;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.phloc.commons.CGlobal;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.js.provider.UnparsedJSCodeProvider;

/**
 * Test class for class {@link HCHtml}
 * 
 * @author philip
 */
public final class HCHtmlTest
{
  private static final String CRLF = CGlobal.LINE_SEPARATOR;

  @Test
  public void testOutOfBandNodes1 ()
  {
    final IHCConversionSettings aCS = HCSettings.getConversionSettings (false);
    final HCHtml aHtml = new HCHtml ();
    aHtml.getBody ().addChild (new HCH1 ().addChild ("Test"));
    aHtml.getBody ().addChild (new HCStyle ("h1{color:red;}"));

    assertEquals ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                      CRLF +
                      "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                      CRLF +
                      "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
                      "<head><style type=\"text/css\">h1{color:red;}</style></head>" +
                      "<body><h1>Test</h1></body>" +
                      "</html>",
                  aHtml.getAsHTMLString (aCS));
    // Do it again and check for node consistency
    assertEquals ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                      CRLF +
                      "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                      CRLF +
                      "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
                      "<head><style type=\"text/css\">h1{color:red;}</style></head>" +
                      "<body><h1>Test</h1></body>" +
                      "</html>",
                  aHtml.getAsHTMLString (aCS));
  }

  @Test
  public void testOutOfBandNodes2 ()
  {
    final IHCConversionSettings aCS = HCSettings.getConversionSettings (false);
    final HCHtml aHtml = new HCHtml ();
    aHtml.getBody ().addChild (new HCH1 ().addChild ("Test"));
    aHtml.getBody ().addChild (new HCScriptOnDocumentReady (new UnparsedJSCodeProvider ("a=b;")));
    aHtml.getBody ().addChild (new HCScriptOnDocumentReady (new UnparsedJSCodeProvider ("c=d;")));
    assertEquals ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                      CRLF +
                      "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                      CRLF +
                      "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
                      "<head></head>" +
                      "<body><h1>Test</h1>" +
                      "<script type=\"text/javascript\"><!--\n" +
                      "$(document).ready(function(){a=b;c=d;});\n" +
                      "//--></script>" +
                      "</body>" +
                      "</html>",
                  aHtml.getAsHTMLString (aCS));
    // Do it again and check for node consistency
    assertEquals ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                      CRLF +
                      "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                      CRLF +
                      "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
                      "<head></head>" +
                      "<body><h1>Test</h1>" +
                      "<script type=\"text/javascript\"><!--\n" +
                      "$(document).ready(function(){a=b;c=d;});\n" +
                      "//--></script>" +
                      "</body>" +
                      "</html>",
                  aHtml.getAsHTMLString (aCS));
  }
}
