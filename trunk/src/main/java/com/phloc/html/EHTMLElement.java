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
  A ("a", false),
  ABBR ("abbr", false),
  ACRONYM ("acronym", false),
  ADDRESS ("address", false),
  APPLET ("applet", false),
  AREA ("area", true),
  ARTICLE ("article", false),
  ASIDE ("aside", false),
  AUDIO ("audio", false),
  B ("b", false),
  BASE ("base", true),
  BASEFONT ("basefont", true),
  BDI ("bdi", false),
  BDO ("bdo", false),
  BIG ("big", false),
  BLOCKQUOTE ("blockquote", false),
  BODY ("body", false),
  BR ("br", true),
  BUTTON ("button", false),
  CANVAS ("canvas", false),
  CAPTION ("caption", false),
  CENTER ("center", false),
  CITE ("cite", false),
  CODE ("code", false),
  COL ("col", true),
  COLGROUP ("colgroup", false),
  COMMAND ("command", false),
  DATALIST ("datalist", false),
  DD ("dd", false),
  DEL ("del", false),
  DETAILS ("details", false),
  DFN ("dfn", false),
  DIR ("dir", false),
  DIV ("div", false),
  DL ("dl", false),
  DT ("dt", false),
  EM ("em", false),
  EMBED ("embed", true),
  FIELDSET ("fieldset", false),
  FIGCAPTION ("figcaption", false),
  FIGURE ("figure", false),
  FONT ("font", false),
  FOOTER ("footer", false),
  FORM ("form", false),
  FRAME ("frame", true),
  FRAMESET ("frameset", false),
  H1 ("h1", false),
  H2 ("h2", false),
  H3 ("h3", false),
  H4 ("h4", false),
  H5 ("h5", false),
  H6 ("h6", false),
  HEAD ("head", false),
  HEADER ("header", false),
  HGROUP ("hgroup", false),
  HR ("hr", true),
  HTML ("html", false),
  I ("i", false),
  IFRAME ("iframe", false),
  IMG ("img", true),
  INS ("ins", false),
  INPUT ("input", true),
  ISINDEX ("isindex", true),
  KBD ("kbd", false),
  KEYGEN ("keygen", true),
  LABEL ("label", false),
  LEGEND ("legend", false),
  LI ("li", false),
  LINK ("link", false),
  LISTING ("listing", false),
  MAP ("map", false),
  MARK ("mark", false),
  MENU ("menu", false),
  META ("meta", true),
  METER ("meter", false),
  NAV ("nav", false),
  NOBR ("nobr", false),
  NOEMBED ("noembed", false),
  NOSCRIPT ("noscript", false),
  OBJECT ("object", false),
  OL ("ol", false),
  OPTGROUP ("optgroup", false),
  OPTION ("option", false),
  OUTPUT ("output", false),
  P ("p", false),
  PARAM ("param", false),
  PLAINTEXT ("plaintext", false),
  PRE ("pre", false),
  PROGRESS ("progress", false),
  RP ("rp", false),
  RT ("rt", false),
  RUBY ("ruby", false),
  Q ("q", false),
  S ("s", false),
  SAMP ("samp", false),
  SCRIPT ("script", false),
  SECTION ("section", false),
  SELECT ("select", false),
  SMALL ("small", false),
  SOURCE ("source", true),
  SPAN ("span", false),
  STRIKE ("strike", false),
  STRONG ("strong", false),
  SUB ("sub", false),
  SUMMARY ("summary", false),
  SUP ("sup", false),
  STYLE ("style", false),
  TABLE ("table", false),
  TBODY ("tbody", false),
  TD ("td", false),
  TEXTAREA ("textarea", false),
  TFOOT ("tfoot", false),
  TH ("th", false),
  THEAD ("thead", false),
  TIME ("time", false),
  TITLE ("title", false),
  TR ("tr", false),
  TRACK ("track", true),
  TT ("tt", false),
  U ("u", false),
  UL ("ul", false),
  VAR ("var", false),
  VIDEO ("video", false),
  WBR ("wbr", true),
  XMP ("xmp", false);

  private static final Set <String> s_aSelfClosedElements = new HashSet <String> ();

  private final String m_sElementNameLC;
  private final String m_sElementNameUC;
  private final boolean m_bMayBeSelfClosed;

  private EHTMLElement (@Nonnull @Nonempty final String sElementName, final boolean bMayBeSelfClosed)
  {
    m_sElementNameLC = sElementName.toLowerCase (CHTMLCharset.LOCALE);
    m_sElementNameUC = sElementName.toUpperCase (CHTMLCharset.LOCALE);
    m_bMayBeSelfClosed = bMayBeSelfClosed;
  }

  @Nonnull
  @Nonempty
  public String getElementName ()
  {
    return m_sElementNameLC;
  }

  @Nonnull
  @Nonempty
  public String getElementNameLowerCase ()
  {
    return m_sElementNameLC;
  }

  @Nonnull
  @Nonempty
  public String getElementNameUpperCase ()
  {
    return m_sElementNameUC;
  }

  public boolean mayBeSelfClosed ()
  {
    return m_bMayBeSelfClosed;
  }

  public boolean mayNotBeSelfClosed ()
  {
    return !m_bMayBeSelfClosed;
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
          // Always use lowercased value
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
      for (final EHTMLElement e : values ())
        if (e.m_sElementNameLC.equalsIgnoreCase (sTagName))
          return e;
    return null;
  }
}
