/**
 * Copyright (C) 2006-2014 phloc systems
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
package com.phloc.html.parser;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroContainer;
import com.phloc.commons.microdom.serialize.MicroReader;
import com.phloc.commons.regex.RegExHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.xml.CXML;
import com.phloc.commons.xml.EXMLIncorrectCharacterHandling;
import com.phloc.commons.xml.serialize.EXMLSerializeVersion;
import com.phloc.commons.xml.serialize.SAXReaderSettings;
import com.phloc.commons.xml.serialize.XMLEmitterPhloc;
import com.phloc.html.EHTMLElement;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.entities.HTMLEntityResolver;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.htmlext.HCUtils;
import com.phloc.html.hc.impl.HCDOMWrapper;
import com.phloc.html.hc.impl.HCTextNode;

/**
 * Utility class for parsing stuff as HTML.
 * 
 * @author Philip Helger
 */
@Immutable
public final class XHTMLParser
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (XHTMLParser.class);

  private XHTMLParser ()
  {}

  /**
   * Check whether the passed text looks like it contains XHTML code. This is a
   * heuristic check only and does not perform actual parsing!
   * 
   * @param sText
   *        The text to check.
   * @return <code>true</code> if the text looks like HTML
   */
  public static boolean looksLikeXHTML (@Nullable final String sText)
  {
    // If the text contains an open angle bracket followed by a character that
    // we think of it as HTML
    // (?s) enables the "dotall" mode - see Pattern.DOTALL
    return StringHelper.hasText (sText) && RegExHelper.stringMatchesPattern ("(?s).*<[a-zA-Z].+", sText);
  }

  /**
   * Check if the given fragment is valid XHTML 1.1 mark-up. This method tries
   * to parse the XHTML fragment, so it is potentially slow!
   * 
   * @param sXHTMLFragment
   *        The XHTML fragment to parse. It is not checked, whether the value
   *        looks like HTML or not.
   * @return <code>true</code> if the fragment is valid, <code>false</code>
   *         otherwise.
   */
  public static boolean isValidXHTMLFragment (@Nullable final String sXHTMLFragment)
  {
    return StringHelper.hasNoText (sXHTMLFragment) || parseXHTMLFragment (sXHTMLFragment) != null;
  }

  /**
   * Parse the given fragment as XHTML 1.1. This is a sanity method for
   * {@link #parseXHTMLFragment(EHTMLVersion, String)} with the predefined XHTML
   * 1.1 document type.
   * 
   * @param sXHTMLFragment
   *        The XHTML fragment to parse.
   * @return <code>null</code> if parsing failed.
   */
  @Nullable
  public static IMicroDocument parseXHTMLFragment (@Nullable final String sXHTMLFragment)
  {
    return parseXHTMLFragment (EHTMLVersion.DEFAULT, sXHTMLFragment);
  }

  /**
   * Parse the given fragment with the specified document type.
   * 
   * @param eHTMLVersion
   *        The HTML version to use.
   * @param sXHTMLFragment
   *        The XHTML fragment to parse.
   * @return <code>null</code> if parsing failed.
   */
  @Nullable
  public static IMicroDocument parseXHTMLFragment (@Nonnull final EHTMLVersion eHTMLVersion,
                                                   @Nullable final String sXHTMLFragment)
  {
    if (eHTMLVersion == null)
      throw new NullPointerException ("HTMLversion");

    // Build mini HTML and insert fragment in the middle.
    // If parsing succeeds, it is considered valid HTML.
    final String sHTMLNamespaceURI = eHTMLVersion.getNamespaceURI ();
    final String sXHTML = XMLEmitterPhloc.getDocTypeHTMLRepresentation (EXMLSerializeVersion.XML_10,
                                                                        EXMLIncorrectCharacterHandling.DEFAULT,
                                                                        eHTMLVersion.getDocType ()) +
                          "<html" +
                          (sHTMLNamespaceURI != null ? ' ' + CXML.XML_ATTR_XMLNS + "=\"" + sHTMLNamespaceURI + '"' : "") +
                          "><head><title></title></head><body>" +
                          StringHelper.getNotNull (sXHTMLFragment) +
                          "</body></html>";
    return parseXHTMLDocument (sXHTML);
  }

  /**
   * This method parses a full HTML document into a {@link IMicroDocument} using
   * the {@link HTMLEntityResolver} resolver.
   * 
   * @param sXHTML
   *        The complete XHTML document as a string.
   * @return <code>null</code> if interpretation failed
   */
  @Nullable
  public static IMicroDocument parseXHTMLDocument (@Nullable final String sXHTML)
  {
    return MicroReader.readMicroXML (sXHTML,
                                     new SAXReaderSettings ().setEntityResolver (HTMLEntityResolver.getInstance ()));
  }

  /**
   * Interpret the passed XHTML fragment as HTML and retrieve a result container
   * with all body elements.
   * 
   * @param sXHTML
   *        The XHTML text fragment.
   * @return <code>null</code> if the passed text could not be interpreted as
   *         XHTML.
   */
  @Nullable
  public static IMicroContainer unescapeXHTML (@Nullable final String sXHTML)
  {
    return unescapeXHTML (EHTMLVersion.DEFAULT, sXHTML);
  }

  /**
   * Interpret the passed XHTML fragment as HTML and retrieve a result container
   * with all body elements.
   * 
   * @param eHTMLVersion
   *        The HTML version to be used for parsing. May not be
   *        <code>null</code>.
   * @param sXHTML
   *        The XHTML text fragment.
   * @return <code>null</code> if the passed text could not be interpreted as
   *         XHTML.
   */
  @Nullable
  public static IMicroContainer unescapeXHTML (@Nonnull final EHTMLVersion eHTMLVersion, @Nullable final String sXHTML)
  {
    // Ensure that the content is surrounded by a single tag
    final IMicroDocument aDoc = parseXHTMLFragment (eHTMLVersion, sXHTML);
    if (aDoc != null && aDoc.getDocumentElement () != null)
    {
      // Find body case insensitive
      final IMicroElement eBody = HCUtils.getFirstChildElement (aDoc.getDocumentElement (), EHTMLElement.BODY);
      if (eBody != null)
      {
        final IMicroContainer ret = new MicroContainer ();
        if (eBody.hasChildren ())
        {
          // Make a copy of the list, because it is modified in
          // detachFromParent!
          for (final IMicroNode aChildNode : ContainerHelper.newList (eBody.getChildren ()))
            ret.appendChild (aChildNode.detachFromParent ());
        }
        return ret;
      }
    }
    return null;
  }

  /**
   * If the passed text looks like XHTML, unescape it (using
   * {@link #unescapeXHTML(String)}) else return a simple text node.
   * 
   * @param sText
   *        The text to be converted. May be <code>null</code>.
   * @return A non-<code>null</code> IHCNode with the result representation
   *         (e.g. an {@link HCTextNode} or an {@link HCDOMWrapper} with an
   *         {@link IMicroContainer} having all the body elements)
   */
  @Nonnull
  public static IHCNode convertToXHTMLOnDemand (@Nullable final String sText)
  {
    if (looksLikeXHTML (sText))
    {
      final IMicroContainer aCont = unescapeXHTML (sText);
      if (aCont != null)
        return new HCDOMWrapper (aCont);
      s_aLogger.error ("Failed to unescape XHTML:\n" + sText);
    }
    return new HCTextNode (sText);
  }
}
