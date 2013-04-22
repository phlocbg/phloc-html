/**
 * Copyright (C) 2006-2013 phloc systems
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
package com.phloc.html.entities;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.CodingStyleguideUnaware;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Contains some predefined entities.
 * 
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EHTMLEntity implements IHTMLEntity
{
  // Reserved chars:
  amp ("amp"), // ampersand
  gt ("gt"), // greater-than
  lt ("lt"), // less-than
  quot ("quot"), // quotation mark
  apos ("apos"), // apostrophe

  // ISO-8859 symbols
  nbsp ("nbsp"), // non-breaking space
  iexcl ("iexcl"), // inverted exclamation mark
  cent ("cent"), // cent
  pound ("pound"), // pound
  curren ("curren"), // currency
  yen ("yen"), // yen
  brvbar ("brvbar"), // broken vertical bar
  sect ("sect"), // section
  uml ("uml"), // spacing diaeresis
  copy ("copy"), // copyright
  ordf ("ordf"), // feminine ordinal indicator
  laquo ("laquo"), // angle quotation mark (left)
  not ("not"), // negation
  shy ("shy"), // soft hyphen
  reg ("reg"), // registered trademark
  macr ("macr"), // spacing macron
  deg ("deg"), // degree
  plusmn ("plusmn"), // plus-or-minus 
  sup2 ("sup2"), // superscript 2
  sup3 ("sup3"), // superscript 3
  acute ("acute"), // spacing acute
  micro ("micro"), // micro
  para ("para"), // paragraph
  middot ("middot"), // middle dot
  cedil ("cedil"), // spacing cedilla
  sup1 ("sup1"), // superscript 1
  ordm ("ordm"), // masculine ordinal indicator
  raquo ("raquo"), // angle quotation mark (right)
  frac14 ("frac14"), // fraction 1/4
  frac12 ("frac12"), // fraction 1/2
  frac34 ("frac34"), // fraction 3/4
  iquest ("iquest"), // inverted question mark
  times ("times"), // multiplication
  divide ("divide"), // division

  // ISO-8859 characters
  Agrave ("Agrave"), // capital a, grave accent
  Aacute ("Aacute"), // capital a, acute accent
  Acirc ("Acirc"), // capital a, circumflex accent
  Atilde ("Atilde"), // capital a, tilde
  Auml ("Auml"), // capital a, umlaut mark
  Aring ("Aring"), // capital a, ring
  AElig ("AElig"), // capital ae
  Ccedil ("Ccedil"), // capital c, cedilla
  Egrave ("Egrave"), // capital e, grave accent
  Eacute ("Eacute"), // capital e, acute accent
  Ecirc ("Ecirc"), // capital e, circumflex accent
  Euml ("Euml"), // capital e, umlaut mark
  Igrave ("Igrave"), // capital i, grave accent
  Iacute ("Iacute"), // capital i, acute accent
  Icirc ("Icirc"), // capital i, circumflex accent
  Iuml ("Iuml"), // capital i, umlaut mark
  ETH ("ETH"), // capital eth, Icelandic
  Ntilde ("Ntilde"), // capital n, tilde
  Ograve ("Ograve"), // capital o, grave accent
  Oacute ("Oacute"), // capital o, acute accent
  Ocirc ("Ocirc"), // capital o, circumflex accent
  Otilde ("Otilde"), // capital o, tilde
  Ouml ("Ouml"), // capital o, umlaut mark
  Oslash ("Oslash"), // capital o, slash
  Ugrave ("Ugrave"), // capital u, grave accent
  Uacute ("Uacute"), // capital u, acute accent
  Ucirc ("Ucirc"), // capital u, circumflex accent
  Uuml ("Uuml"), // capital u, umlaut mark
  Yacute ("Yacute"), // capital y, acute accent
  THORN ("THORN"), // capital THORN, Icelandic
  szlig ("szlig"), // small sharp s, German
  agrave ("agrave"), // small a, grave accent
  aacute ("aacute"), // small a, acute accent
  acirc ("acirc"), // small a, circumflex accent
  atilde ("atilde"), // small a, tilde
  auml ("auml"), // small a, umlaut mark
  aring ("aring"), // small a, ring
  aelig ("aelig"), // small ae
  ccedil ("ccedil"), // small c, cedilla
  egrave ("egrave"), // small e, grave accent
  eacute ("eacute"), // small e, acute accent
  ecirc ("ecirc"), // small e, circumflex accent
  euml ("euml"), // small e, umlaut mark
  igrave ("igrave"), // small i, grave accent
  iacute ("iacute"), // small i, acute accent
  icirc ("icirc"), // small i, circumflex accent
  iuml ("iuml"), // small i, umlaut mark
  eth ("eth"), // small eth, Icelandic
  ntilde ("ntilde"), // small n, tilde
  ograve ("ograve"), // small o, grave accent
  oacute ("oacute"), // small o, acute accent
  ocirc ("ocirc"), // small o, circumflex accent
  otilde ("otilde"), // small o, tilde
  ouml ("ouml"), // small o, umlaut mark
  oslash ("oslash"), // small o, slash
  ugrave ("ugrave"), // small u, grave accent
  uacute ("uacute"), // small u, acute accent
  ucirc ("ucirc"), // small u, circumflex accent
  uuml ("uuml"), // small u, umlaut mark
  yacute ("yacute"), // small y, acute accent
  thorn ("thorn"), // small thorn, Icelandic
  yuml ("yuml"), // small y, umlaut mark

  // Math symbols
  forall ("forall"), // for all
  part ("part"), // part
  exist ("exist"), // exists
  empty ("empty"), // empty
  nabla ("nabla"), // nabla
  isin ("isin"), // isin
  notin ("notin"), // notin
  ni ("ni"), // ni
  prod ("prod"), // prod
  sum ("sum"), // sum
  minus ("minus"), // minus
  lowast ("lowast"), // lowast
  radic ("radic"), // square root
  prop ("prop"), // proportional to
  infin ("infin"), // infinity
  ang ("ang"), // angle
  and ("and"), // and
  or ("or"), // or
  cap ("cap"), // cap
  cup ("cup"), // cup
  int_ ("int"), // integral
  there4 ("there4"), // therefore
  sim ("sim"), // similar to
  cong ("cong"), // congruent to
  asymp ("asymp"), // almost equal
  ne ("ne"), // not equal
  equiv ("equiv"), // equivalent
  le ("le"), // less or equal
  ge ("ge"), // greater or equal
  sub ("sub"), // subset of
  sup ("sup"), // superset of
  nsub ("nsub"), // not subset of
  sube ("sube"), // subset or equal
  supe ("supe"), // superset or equal
  oplus ("oplus"), // circled plus
  otimes ("otimes"), // circled times
  perp ("perp"), // perpendicular
  sdot ("sdot"), // dot operator

  // Greek letters
  Alpha ("Alpha"), // Alpha
  Beta ("Beta"), // Beta
  Gamma ("Gamma"), // Gamma
  Delta ("Delta"), // Delta
  Epsilon ("Epsilon"), // Epsilon
  Zeta ("Zeta"), // Zeta
  Eta ("Eta"), // Eta
  Theta ("Theta"), // Theta
  Iota ("Iota"), // Iota
  Kappa ("Kappa"), // Kappa
  Lambda ("Lambda"), // Lambda
  Mu ("Mu"), // Mu
  Nu ("Nu"), // Nu
  Xi ("Xi"), // Xi
  Omicron ("Omicron"), // Omicron
  Pi ("Pi"), // Pi
  Rho ("Rho"), // Rho
  // Sigmaf is undefined
  Sigma ("Sigma"), // Sigma
  Tau ("Tau"), // Tau
  Upsilon ("Upsilon"), // Upsilon
  Phi ("Phi"), // Phi
  Chi ("Chi"), // Chi
  Psi ("Psi"), // Psi
  Omega ("Omega"), // Omega

  alpha ("alpha"), // alpha
  beta ("beta"), // beta
  gamma ("gamma"), // gamma
  delta ("delta"), // delta
  epsilon ("epsilon"), // epsilon
  zeta ("zeta"), // zeta
  eta ("eta"), // eta
  theta ("theta"), // theta
  iota ("iota"), // iota
  kappa ("kappa"), // kappa
  lambda ("lambda"), // lambda
  mu ("mu"), // mu
  nu ("nu"), // nu
  xi ("xi"), // xi
  omicron ("omicron"), // omicron
  pi ("pi"), // pi
  rho ("rho"), // rho
  sigmaf ("sigmaf"), // sigmaf
  sigma ("sigma"), // sigma
  tau ("tau"), // tau
  upsilon ("upsilon"), // upsilon
  phi ("phi"), // phi
  chi ("chi"), // chi
  psi ("psi"), // psi
  omega ("omega"), // omega

  thetasym ("thetasym"), // theta symbol
  upsih ("upsih"), // upsilon symbol
  piv ("piv"), // pi symbol

  // Other entities
  OElig ("OElig"), // capital ligature OE
  oelig ("oelig"), // small ligature oe
  Scaron ("Scaron"), // capital S with caron
  scaron ("scaron"), // small S with caron
  Yuml ("Yuml"), // capital Y with diaeres
  fnof ("fnof"), // f with hook
  circ ("circ"), // modifier letter circumflex accent
  tilde ("tilde"), // small tilde
  ensp ("ensp"), // en space
  emsp ("emsp"), // em space
  thinsp ("thinsp"), // thin space
  zwnj ("zwnj"), // zero width non-joiner
  zwj ("zwj"), // zero width joiner
  lrm ("lrm"), // left-to-right mark
  rlm ("rlm"), // right-to-left mark
  ndash ("ndash"), // en dash
  mdash ("mdash"), // em dash
  lsquo ("lsquo"), // left single quotation mark
  rsquo ("rsquo"), // right single quotation mark
  sbquo ("sbquo"), // single low-9 quotation mark
  ldquo ("ldquo"), // left double quotation mark
  rdquo ("rdquo"), // right double quotation mark
  bdquo ("bdquo"), // double low-9 quotation mark
  dagger ("dagger"), // dagger
  Dagger ("Dagger"), // double dagger
  bull ("bull"), // bullet
  hellip ("hellip"), // horizontal ellipsis
  permil ("permil"), // per mille
  prime ("prime"), // minutes
  Prime ("Prime"), // seconds
  lsaquo ("lsaquo"), // single left angle quotation
  rsaquo ("rsaquo"), // single right angle quotation
  oline ("oline"), // overline
  euro ("euro"), // euro
  trade ("trade"), // trademark
  larr ("larr"), // left arrow
  uarr ("uarr"), // up arrow
  rarr ("rarr"), // right arrow
  darr ("darr"), // down arrow
  harr ("harr"), // left right arrow
  crarr ("crarr"), // carriage return arrow
  lceil ("lceil"), // left ceiling
  rceil ("rceil"), // right ceiling
  lfloor ("lfloor"), // left floor
  rfloor ("rfloor"), // right floor
  loz ("loz"), // lozenge
  spades ("spades"), // spade
  clubs ("clubs"), // club
  hearts ("hearts"), // heart
  diams ("diams"); // diamond

  private String m_sEntityName;
  private String m_sEntityReference;

  private EHTMLEntity (@Nonnull @Nonempty final String sName)
  {
    m_sEntityName = sName;
    m_sEntityReference = '&' + sName + ';';
  }

  @Nonnull
  @Nonempty
  public String getEntityName ()
  {
    return m_sEntityName;
  }

  @Nonnull
  @Nonempty
  public String getEntityReference ()
  {
    return m_sEntityReference;
  }

  @Nonnull
  @Nonempty
  public String getChar ()
  {
    return HTMLEntities.getCharOfEntity (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("name", m_sEntityName).toString ();
  }
}
