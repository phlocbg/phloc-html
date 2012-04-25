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
  ABBR ("abbr"),
  ACRONYM ("acronym"),
  ADDRESS ("address"),
  APPLET ("applet"),
  AREA ("area"),
  ARTICLE ("article"),
  ASIDE ("aside"),
  AUDIO ("audio"),
  B ("b", false),
  BASE ("base"),
  BASEFONT ("basefont"),
  BDI ("bdi"),
  BDO ("bdo"),
  BIG ("big"),
  BLOCKQUOTE ("blockquote"),
  BODY ("body"),
  BR ("br"),
  BUTTON ("button"),
  CANVAS ("canvas", false),
  CAPTION ("caption"),
  CENTER ("center"),
  CITE ("cite"),
  CODE ("code"),
  COL ("col"),
  COLGROUP ("colgroup"),
  COMMAND ("command"),
  DATALIST ("datalist"),
  DD ("dd"),
  DEL ("del"),
  DETAILS ("details"),
  DFN ("ddn"),
  DIR ("dir"),
  DIV ("div", false),
  DL ("dt"),
  DT ("dl"),
  EM ("em"),
  EMBED ("embed"),
  FIELDSET ("fieldset"),
  FIGCAPTION ("figcaption"),
  FIGURE ("figure"),
  FONT ("font"),
  FOOTER ("footer"),
  FORM ("form"),
  FRAME ("frame"),
  FRAMESET ("frameset"),
  H1 ("h1"),
  H2 ("h2"),
  H3 ("h3"),
  H4 ("h4"),
  H5 ("h5"),
  H6 ("h6"),
  HEAD ("head"),
  HEADER ("header"),
  HGROUP ("hgroup"),
  HR ("hr"),
  HTML ("html"),
  I ("i", false),
  IFRAME ("iframe", false),
  IMG ("img"),
  INS ("ins"),
  INPUT ("input"),
  ISINDEX ("isindex"),
  KBD ("kbd"),
  KEYGEN ("keygen"),
  LABEL ("label"),
  LEGEND ("legend"),
  LI ("li"),
  LINK ("link", false),
  LISTING ("listing"),
  MAP ("map"),
  MARK ("mark"),
  MENU ("menu"),
  META ("meta"),
  METER ("meter"),
  NAV ("nav"),
  NOBR ("nobr"),
  NOEMBED ("noembed"),
  NOSCRIPT ("noscript"),
  OBJECT ("object"),
  OL ("ol", false),
  OPTGROUP ("optgroup"),
  OPTION ("option"),
  OUTPUT ("output"),
  P ("p", false),
  PARAM ("param", false),
  PLAINTEXT ("plaintext"),
  PRE ("pre"),
  PROGRESS ("progress"),
  RP ("rp"),
  RT ("rt"),
  RUBY ("ruby"),
  Q ("q"),
  S ("s"),
  SAMP ("samp"),
  SCRIPT ("script", false),
  SECTION ("section"),
  SELECT ("select", false),
  SMALL ("small"),
  SOURCE ("source"),
  SPAN ("span", false),
  STRIKE ("strike"),
  STRONG ("strong"),
  SUB ("sub"),
  SUMMARY ("summary"),
  SUP ("sup"),
  STYLE ("style"),
  TABLE ("table", false),
  TBODY ("tbody", false),
  TD ("td", false),
  TEXTAREA ("textarea"),
  TFOOT ("tfoot"),
  TH ("th", false),
  THEAD ("thead", false),
  TIME ("time"),
  TITLE ("title"),
  TR ("tr", false),
  TRACK ("track"),
  TT ("tt"),
  U ("u"),
  UL ("ul", false),
  VAR ("var"),
  VIDEO ("video"),
  WBR ("wbr"),
  XMP ("xmp");

  private static final Set <String> s_aNotSelfClosedElements = new HashSet <String> ();
  private String m_sElementName;
  private boolean m_bMayBeSelfClosed;

  private EHTMLElement (@Nonnull @Nonempty final String sElementName)
  {
    this (sElementName, true);
  }

  private EHTMLElement (@Nonnull @Nonempty final String sElementName, final boolean bMayBeSelfClosed)
  {
    m_sElementName = sElementName;
    m_bMayBeSelfClosed = bMayBeSelfClosed;
  }

  @Nonnull
  @Nonempty
  public String getElementName ()
  {
    return m_sElementName;
  }

  public boolean mayBeSelfClosed ()
  {
    return m_bMayBeSelfClosed;
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
    if (s_aNotSelfClosedElements.isEmpty ())
    {
      // Lazy init, because it cannot be done in the constructor!
      for (final EHTMLElement e : values ())
        if (!e.m_bMayBeSelfClosed)
          s_aNotSelfClosedElements.add (e.m_sElementName);
    }
    return s_aNotSelfClosedElements.contains (sElementName);
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
    if (StringHelper.hasText (sTagName))
      for (final EHTMLElement e : values ())
        if (e.getElementName ().equals (sTagName))
          return true;
    return false;
  }
}
