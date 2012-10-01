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
package com.phloc.html;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.StringHelper;

/**
 * Contains a list of all HTML element names.
 * 
 * @author philip
 */
public enum EHTMLElement
{
  A ("a", false, EHTMLElementType.FLOW),
  ABBR ("abbr", false, EHTMLElementType.PHRASING),
  ADDRESS ("address", false, EHTMLElementType.FLOW),
  AREA ("area", true, EHTMLElementType.PHRASING),
  ARTICLE ("article", false, EHTMLElementType.FLOW),
  ASIDE ("aside", false, EHTMLElementType.FLOW),
  AUDIO ("audio", false, EHTMLElementType.FLOW),
  B ("b", false, EHTMLElementType.PHRASING),
  BASE ("base", true, EHTMLElementType.CHILD),
  BDI ("bdi", false, EHTMLElementType.PHRASING),
  BDO ("bdo", false, EHTMLElementType.PHRASING),
  BLOCKQUOTE ("blockquote", false, EHTMLElementType.FLOW),
  BODY ("body", false, EHTMLElementType.SPECIAL),
  BR ("br", true, EHTMLElementType.PHRASING),
  BUTTON ("button", false, EHTMLElementType.PHRASING),
  CANVAS ("canvas", false, EHTMLElementType.FLOW),
  CAPTION ("caption", false, EHTMLElementType.CHILD),
  CENTER ("center", false, EHTMLElementType.UNDEFINED_PHRASING),
  CITE ("cite", false, EHTMLElementType.PHRASING),
  CODE ("code", false, EHTMLElementType.PHRASING),
  COL ("col", true, EHTMLElementType.CHILD),
  COLGROUP ("colgroup", false, EHTMLElementType.CHILD),
  COMMAND ("command", false, EHTMLElementType.PHRASING_METADATA),
  DATALIST ("datalist", false, EHTMLElementType.PHRASING),
  DD ("dd", false, EHTMLElementType.CHILD),
  DEL ("del", false, EHTMLElementType.FLOW),
  DETAILS ("details", false, EHTMLElementType.FLOW),
  DFN ("dfn", false, EHTMLElementType.PHRASING),
  DIV ("div", false, EHTMLElementType.FLOW),
  DL ("dl", false, EHTMLElementType.FLOW),
  DT ("dt", false, EHTMLElementType.CHILD),
  EM ("em", false, EHTMLElementType.PHRASING),
  EMBED ("embed", true, EHTMLElementType.PHRASING),
  FIELDSET ("fieldset", false, EHTMLElementType.FLOW),
  FIGCAPTION ("figcaption", false, EHTMLElementType.CHILD),
  FIGURE ("figure", false, EHTMLElementType.FLOW),
  FONT ("font", false, EHTMLElementType.UNDEFINED),
  FOOTER ("footer", false, EHTMLElementType.FLOW),
  FORM ("form", false, EHTMLElementType.FLOW),
  FRAME ("frame", true, EHTMLElementType.UNDEFINED),
  FRAMESET ("frameset", false, EHTMLElementType.UNDEFINED),
  H1 ("h1", false, EHTMLElementType.FLOW),
  H2 ("h2", false, EHTMLElementType.FLOW),
  H3 ("h3", false, EHTMLElementType.FLOW),
  H4 ("h4", false, EHTMLElementType.FLOW),
  H5 ("h5", false, EHTMLElementType.FLOW),
  H6 ("h6", false, EHTMLElementType.FLOW),
  HEAD ("head", false, EHTMLElementType.SPECIAL),
  HEADER ("header", false, EHTMLElementType.FLOW),
  HGROUP ("hgroup", false, EHTMLElementType.FLOW),
  HR ("hr", true, EHTMLElementType.FLOW),
  HTML ("html", false, EHTMLElementType.SPECIAL),
  I ("i", false, EHTMLElementType.PHRASING),
  IFRAME ("iframe", false, EHTMLElementType.PHRASING),
  IMG ("img", true, EHTMLElementType.PHRASING),
  INS ("ins", false, EHTMLElementType.FLOW),
  INPUT ("input", true, EHTMLElementType.PHRASING),
  KBD ("kbd", false, EHTMLElementType.PHRASING),
  KEYGEN ("keygen", true, EHTMLElementType.PHRASING),
  LABEL ("label", false, EHTMLElementType.PHRASING),
  LEGEND ("legend", false, EHTMLElementType.CHILD),
  LI ("li", false, EHTMLElementType.CHILD),
  LINK ("link", false, EHTMLElementType.METADATA),
  MAP ("map", false, EHTMLElementType.FLOW),
  MARK ("mark", false, EHTMLElementType.PHRASING),
  MENU ("menu", false, EHTMLElementType.FLOW),
  META ("meta", true, EHTMLElementType.METADATA),
  METER ("meter", false, EHTMLElementType.PHRASING),
  NAV ("nav", false, EHTMLElementType.FLOW),
  NOBR ("nobr", false, EHTMLElementType.UNDEFINED),
  NOSCRIPT ("noscript", false, EHTMLElementType.FLOW_METADATA),
  OBJECT ("object", false, EHTMLElementType.FLOW),
  OL ("ol", false, EHTMLElementType.FLOW),
  OPTGROUP ("optgroup", false, EHTMLElementType.CHILD),
  OPTION ("option", false, EHTMLElementType.CHILD),
  OUTPUT ("output", false, EHTMLElementType.PHRASING),
  P ("p", false, EHTMLElementType.FLOW),
  PARAM ("param", false, EHTMLElementType.CHILD),
  PRE ("pre", false, EHTMLElementType.FLOW),
  PROGRESS ("progress", false, EHTMLElementType.PHRASING),
  RP ("rp", false, EHTMLElementType.CHILD),
  RT ("rt", false, EHTMLElementType.CHILD),
  RUBY ("ruby", false, EHTMLElementType.PHRASING),
  Q ("q", false, EHTMLElementType.PHRASING),
  S ("s", false, EHTMLElementType.PHRASING),
  SAMP ("samp", false, EHTMLElementType.PHRASING),
  SCRIPT ("script", false, EHTMLElementType.PHRASING_METADATA),
  SECTION ("section", false, EHTMLElementType.FLOW),
  SELECT ("select", false, EHTMLElementType.PHRASING),
  SMALL ("small", false, EHTMLElementType.PHRASING),
  SOURCE ("source", true, EHTMLElementType.CHILD),
  SPAN ("span", false, EHTMLElementType.PHRASING),
  STRONG ("strong", false, EHTMLElementType.PHRASING),
  SUB ("sub", false, EHTMLElementType.PHRASING),
  SUMMARY ("summary", false, EHTMLElementType.CHILD),
  SUP ("sup", false, EHTMLElementType.PHRASING),
  STYLE ("style", false, EHTMLElementType.METADATA),
  TABLE ("table", false, EHTMLElementType.FLOW),
  TBODY ("tbody", false, EHTMLElementType.CHILD),
  TD ("td", false, EHTMLElementType.CHILD),
  TEXTAREA ("textarea", false, EHTMLElementType.PHRASING),
  TFOOT ("tfoot", false, EHTMLElementType.CHILD),
  TH ("th", false, EHTMLElementType.CHILD),
  THEAD ("thead", false, EHTMLElementType.CHILD),
  TIME ("time", false, EHTMLElementType.PHRASING),
  TITLE ("title", false, EHTMLElementType.CHILD),
  TR ("tr", false, EHTMLElementType.CHILD),
  TRACK ("track", true, EHTMLElementType.CHILD),
  U ("u", false, EHTMLElementType.PHRASING),
  UL ("ul", false, EHTMLElementType.FLOW),
  VAR ("var", false, EHTMLElementType.PHRASING),
  VIDEO ("video", false, EHTMLElementType.FLOW),
  WBR ("wbr", true, EHTMLElementType.PHRASING);

  private static final Set <String> s_aSelfClosedElements = new HashSet <String> ();

  private final String m_sElementNameLC;
  private final String m_sElementNameUC;
  private final boolean m_bMayBeSelfClosed;
  private final EHTMLElementType m_eType;

  private EHTMLElement (@Nonnull @Nonempty final String sElementName,
                        final boolean bMayBeSelfClosed,
                        @Nonnull final EHTMLElementType eType)
  {
    m_sElementNameLC = sElementName.toLowerCase (CHTMLCharset.LOCALE);
    m_sElementNameUC = sElementName.toUpperCase (CHTMLCharset.LOCALE);
    m_bMayBeSelfClosed = bMayBeSelfClosed;
    m_eType = eType;
  }

  /**
   * @return The defined element name in any case. Neither <code>null</code> nor
   *         empty.
   */
  @Nonnull
  @Nonempty
  public String getElementName ()
  {
    return m_sElementNameLC;
  }

  /**
   * @return The defined element name in lowercase characters. Neither
   *         <code>null</code> nor empty.
   */
  @Nonnull
  @Nonempty
  public String getElementNameLowerCase ()
  {
    return m_sElementNameLC;
  }

  /**
   * @return The defined element name in uppercase characters. Neither
   *         <code>null</code> nor empty.
   */
  @Nonnull
  @Nonempty
  public String getElementNameUpperCase ()
  {
    return m_sElementNameUC;
  }

  /**
   * @return <code>true</code> if this element may be self-closed (e.g. &lt;br
   *         />), and <code>false</code> if not (e.g. &lt;link...>&lt;/link>)
   */
  public boolean mayBeSelfClosed ()
  {
    return m_bMayBeSelfClosed;
  }

  /**
   * @return <code>true</code> if this element may not be self-closed (e.g.
   *         &lt;link...>&lt;/link>), <code>false</code> if it may be
   *         self-closed (e.g. &lt;br />)
   */
  public boolean mayNotBeSelfClosed ()
  {
    return !m_bMayBeSelfClosed;
  }

  public boolean isFlowElement ()
  {
    return m_eType.isFlowElement ();
  }

  public boolean isMetadataElement ()
  {
    return m_eType.isMetadataElement ();
  }

  public boolean isPhrasingElement ()
  {
    return m_eType.isPhrasingElement ();
  }

  @Nonnull
  private static Set <String> _getSelfClosedSet ()
  {
    if (s_aSelfClosedElements.isEmpty ())
    {
      // Lazy init, because it cannot be done in the constructor!
      for (final EHTMLElement e : values ())
        if (e.mayBeSelfClosed ())
        {
          // Always use lower cased value
          s_aSelfClosedElements.add (e.m_sElementNameLC);
        }
    }
    return s_aSelfClosedElements;
  }

  /**
   * Check if the passed element may be self closed when creating HTML.
   * 
   * @param sElementName
   *        The name of the tag to validate.
   * @return <code>true</code> if the tag may not be self closed.
   */
  public static boolean isTagThatMayBeSelfClosed (@Nullable final String sElementName)
  {
    if (StringHelper.hasNoText (sElementName))
      return false;

    // Always check lower cased
    return _getSelfClosedSet ().contains (sElementName.toLowerCase (CHTMLCharset.LOCALE));
  }

  /**
   * Check if the passed element may not be self closed when creating HTML.
   * 
   * @param sElementName
   *        The name of the tag to validate.
   * @return <code>true</code> if the tag may not be self closed.
   */
  public static boolean isTagThatMayNotBeSelfClosed (@Nullable final String sElementName)
  {
    if (StringHelper.hasNoText (sElementName))
      return false;

    // Always check lower cased
    return !_getSelfClosedSet ().contains (sElementName.toLowerCase (CHTMLCharset.LOCALE));
  }

  /**
   * Check if the passed tag is an HTML tag name.
   * 
   * @param sTagName
   *        The case sensitive tag name to check.
   * @return <code>true</code> if it is a known HTML tag, <code>false</code>
   *         otherwise.
   */
  public static boolean isHTMLTagName (@Nullable final String sTagName)
  {
    return getFromTagNameOrNull (sTagName) != null;
  }

  /**
   * Get the {@link EHTMLElement} for the passed tag name using case insensitive
   * compare
   * 
   * @param sTagName
   *        The case sensitive tag name to check.
   * @return The matching {@link EHTMLElement} or <code>null</code> if no such
   *         element is present.
   */
  public static EHTMLElement getFromTagNameOrNull (@Nullable final String sTagName)
  {
    if (StringHelper.hasText (sTagName))
      for (final EHTMLElement eElement : values ())
        if (eElement.m_sElementNameLC.equalsIgnoreCase (sTagName))
          return eElement;
    return null;
  }
}
