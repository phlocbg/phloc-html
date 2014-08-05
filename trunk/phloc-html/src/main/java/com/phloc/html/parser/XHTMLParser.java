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

import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.entities.HTMLEntityResolver;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.impl.HCDOMWrapper;
import com.phloc.html.hc.impl.HCTextNode;

/**
 * Utility class for parsing stuff as HTML. This class is deprecated and should
 * no longer be used, because the API possibilities are limited. Use
 * {@link XHTMLParser2} instead.
 *
 * @author Philip Helger
 */
@Immutable
@Deprecated
public final class XHTMLParser
{
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
    return XHTMLParser2.looksLikeXHTML (sText);
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
    return new XHTMLParser2 ().isValidXHTMLFragment (sXHTMLFragment);
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
    return new XHTMLParser2 ().parseXHTMLFragment (sXHTMLFragment);
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
    return new XHTMLParser2 (eHTMLVersion).parseXHTMLFragment (sXHTMLFragment);
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
    return new XHTMLParser2 ().parseXHTMLDocument (sXHTML);
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
    return new XHTMLParser2 ().unescapeXHTMLFragment (sXHTML);
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
    return new XHTMLParser2 (eHTMLVersion).unescapeXHTMLFragment (sXHTML);
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
    return new XHTMLParser2 ().convertToXHTMLFragmentOnDemand (sText);
  }
}
