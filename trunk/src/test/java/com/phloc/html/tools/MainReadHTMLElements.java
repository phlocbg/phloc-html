package com.phloc.html.tools;

import java.io.InputStream;

import nu.validator.htmlparser.common.XmlViolationPolicy;
import nu.validator.htmlparser.sax.HtmlParser;
import nu.validator.htmlparser.sax.XmlSerializer;

import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import com.phloc.commons.io.streams.NonBlockingByteArrayInputStream;
import com.phloc.commons.io.streams.NonBlockingByteArrayOutputStream;
import com.phloc.commons.io.streams.StreamUtils;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.serialize.MicroReader;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.xml.EXMLParserProperty;
import com.phloc.commons.xml.sax.LoggingSAXErrorHandler;

public class MainReadHTMLElements
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (MainReadHTMLElements.class);

  public static void main (final String [] args) throws Exception
  {
    final String sBaseURL = "http://dev.w3.org/html5/markup/";

    s_aLogger.info ("Reading HTML");
    final byte [] aElements = Request.Get (sBaseURL + "elements.html").execute ().returnContent ().asBytes ();

    s_aLogger.info ("Converting to XML");
    final InputStream aIS = new NonBlockingByteArrayInputStream (aElements);
    final NonBlockingByteArrayOutputStream aOS = new NonBlockingByteArrayOutputStream ();

    final XmlSerializer serializer = new XmlSerializer (aOS);
    final HtmlParser parser = new HtmlParser (XmlViolationPolicy.ALTER_INFOSET);
    parser.setErrorHandler (LoggingSAXErrorHandler.getInstance ());
    parser.setContentHandler (serializer);
    parser.setProperty (EXMLParserProperty.SAX_FEATURE_LEXICAL_HANDLER.getName (), serializer);
    parser.parse (new InputSource (aIS));
    StreamUtils.close (aOS);

    s_aLogger.info ("Converting to MicroNode");
    final IMicroDocument aDoc = MicroReader.readMicroXML (aOS.toByteArray ());
    // /html/body/div[3]/div/ul
    final IMicroElement eUL = aDoc.getDocumentElement ()
                                  .getFirstChildElement ("body")
                                  .getChildElements ("div")
                                  .get (2)
                                  .getFirstChildElement ("div")
                                  .getFirstChildElement ("ul");
    System.out.println (MicroWriter.getXMLString (eUL));
  }
}
