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
package com.phloc.html.supplementary.main;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import nu.validator.htmlparser.common.XmlViolationPolicy;
import nu.validator.htmlparser.sax.HtmlParser;
import nu.validator.htmlparser.sax.XmlSerializer;

import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.io.file.SimpleFileIO;
import com.phloc.commons.io.streams.NonBlockingByteArrayInputStream;
import com.phloc.commons.io.streams.NonBlockingByteArrayOutputStream;
import com.phloc.commons.io.streams.StreamUtils;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.impl.MicroDocument;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.commons.microdom.serialize.MicroReader;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.xml.sax.LoggingSAXErrorHandler;
import com.phloc.commons.xml.serialize.XMLWriterSettings;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;

public final class MainReadHTMLElementList
{
  private static final class Element
  {
    private final String m_sHref;
    private final EHTMLElement m_eElement;
    private final String m_sAttributeName;
    private final String m_sEqualsValue;
    private final String m_sShortDesc;

    public Element (@Nonnull @Nonempty final String sHref,
                    @Nonnull @Nonempty final String sElementName,
                    @Nullable final String sAttributeName,
                    @Nullable final String sEqualsValue,
                    @Nonnull @Nonempty final String sShortDesc)
    {
      if (StringHelper.hasNoText (sHref))
        throw new IllegalArgumentException ("href");
      if (StringHelper.hasNoText (sElementName))
        throw new IllegalArgumentException ("elementName");
      if (StringHelper.hasNoText (sAttributeName) && StringHelper.hasText (sEqualsValue))
        throw new IllegalArgumentException ("equalsValue without attributeName for " + sElementName);
      if (StringHelper.hasNoText (sShortDesc))
        throw new IllegalArgumentException ("shortDesc");
      final int nAnchor = sHref.indexOf ('#');
      m_sHref = nAnchor < 0 ? sHref : sHref.substring (0, nAnchor);
      m_eElement = EHTMLElement.getFromTagNameOrNull (sElementName);
      if (m_eElement == null)
        throw new IllegalArgumentException ("Illegal element '" + sElementName + "'");
      m_sAttributeName = sAttributeName;
      m_sEqualsValue = sEqualsValue;
      m_sShortDesc = sShortDesc;
    }

    @Nonnull
    public IMicroElement getAsMicroXML ()
    {
      final IMicroElement eElement = new MicroElement ("element");
      eElement.setAttribute ("href", m_sHref);
      eElement.setAttribute ("name", m_eElement.getElementName ());
      if (StringHelper.hasText (m_sAttributeName))
        eElement.setAttribute ("attrname", m_sAttributeName);
      if (StringHelper.hasText (m_sEqualsValue))
        eElement.setAttribute ("attrvalue", m_sEqualsValue);
      eElement.appendText (m_sShortDesc);
      return eElement;
    }

    @Override
    public String toString ()
    {
      return new ToStringGenerator (this).append ("href", m_sHref)
                                         .append ("element", m_eElement)
                                         .append ("description", m_sShortDesc)
                                         .toString ();
    }
  }

  public static final String BASE_URL = "http://dev.w3.org/html5/markup/";
  public static final String PATH_TOC_XML = "src/test/resources/html-elements/toc.xml";

  private static final Logger s_aLogger = LoggerFactory.getLogger (MainReadHTMLElementList.class);

  public static void main (final String [] args) throws Exception
  {
    s_aLogger.info ("Extracting the information on all available HTML5 elements!");

    s_aLogger.info ("Reading HTML");
    final byte [] aElementContent = Request.Get (BASE_URL + "elements.html").execute ().returnContent ().asBytes ();

    s_aLogger.info ("Converting to XML");
    final InputStream aIS = new NonBlockingByteArrayInputStream (aElementContent);
    final NonBlockingByteArrayOutputStream aOS = new NonBlockingByteArrayOutputStream ();

    final XmlSerializer serializer = new XmlSerializer (aOS);
    final HtmlParser parser = new HtmlParser (XmlViolationPolicy.ALTER_INFOSET);
    parser.setErrorHandler (LoggingSAXErrorHandler.getInstance ());
    parser.setContentHandler (serializer);
    parser.setLexicalHandler (serializer);
    parser.parse (new InputSource (aIS));
    StreamUtils.close (aOS);

    s_aLogger.info ("Converting to MicroNode");
    final IMicroDocument aDoc = MicroReader.readMicroXML (aOS.toByteArray ());

    // /html/body/div[3]/div/ul
    final IMicroElement eUL = aDoc.getDocumentElement ()
                                  .getFirstChildElement (EHTMLElement.BODY)
                                  .getAllChildElements (EHTMLElement.DIV)
                                  .get (2)
                                  .getFirstChildElement (EHTMLElement.DIV)
                                  .getFirstChildElement (EHTMLElement.UL);

    final List <Element> aElements = new ArrayList <Element> ();
    for (final IMicroElement eLI : eUL.getAllChildElements (EHTMLElement.LI))
    {
      final IMicroElement eA = eLI.getFirstChildElement (EHTMLElement.A);
      final String sHref = eA.getAttribute (CHTMLAttributes.HREF);
      final IMicroElement eSectionName = eA.getAllChildElements (EHTMLElement.SPAN).get (1);

      String sElementName = null;
      String sAttributeName = null;
      String sEqualsValue = null;
      String sShortDesc = null;
      for (final IMicroElement eSpan : eSectionName.getAllChildElements (EHTMLElement.SPAN))
      {
        final String sClass = eSpan.getAttribute (CHTMLAttributes.CLASS);
        final String sContent = eSpan.getTextContent ().trim ();
        if (sClass.equals ("element"))
          sElementName = sContent;
        else
          if (sClass.equals ("elem-qualifier"))
          {
            for (final IMicroElement eChildSpan : eSpan.getAllChildElements (EHTMLElement.SPAN))
            {
              final String sChildClass = eChildSpan.getAttribute (CHTMLAttributes.CLASS);
              final String sChildContent = eChildSpan.getTextContent ().trim ();
              if (sChildClass.equals ("attribute-name"))
                sAttributeName = sChildContent;
              else
                if (sChildClass.equals ("equals-value"))
                  sEqualsValue = sChildContent;
                else
                  s_aLogger.error ("Illegal child span of '" + sElementName + "' with class '" + sChildClass + "'");
            }
          }
          else
            if (sClass.equals ("shortdesc"))
              sShortDesc = sContent;
            else
              s_aLogger.error ("Illegal span in '" + sElementName + "' with class '" + sClass + "'");
      }

      aElements.add (new Element (sHref, sElementName, sAttributeName, sEqualsValue, sShortDesc));
    }

    s_aLogger.info ("Writing result toc.xml");
    final IMicroDocument aElementsDoc = new MicroDocument ();
    final IMicroElement eRoot = aElementsDoc.appendElement ("elements");
    for (final Element aElement : aElements)
      eRoot.appendChild (aElement.getAsMicroXML ());
    SimpleFileIO.writeFile (new File (PATH_TOC_XML),
                            MicroWriter.getXMLString (aElementsDoc),
                            XMLWriterSettings.DEFAULT_XML_CHARSET_OBJ);

    s_aLogger.info ("Done");
  }
}
