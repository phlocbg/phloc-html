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
package com.phloc.html.meta;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.state.EChange;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Represents a single HTML meta element.
 * 
 * @author philip
 */
@NotThreadSafe
public final class MetaElement implements IMetaElement
{
  public static final boolean DEFAULT_IS_HTTP_EQUIV = false;

  /** tag name. */
  private final String m_sName;

  /** optional scheme string. */
  private final String m_sScheme;

  /** locale to value map. */
  private final Map <Locale, String> m_aContents = new LinkedHashMap <Locale, String> ();

  /** HTTP equivalent or not? */
  private boolean m_bIsHttpEquiv;

  /**
   * Constructor without content!!
   * 
   * @param sName
   *        Element name
   * @param sScheme
   *        Element scheme
   * @param bIsHttpEquiv
   *        <code>true</code> if it is a HTTP equivalent meta element,
   *        <code>false</code> if not
   */
  public MetaElement (@Nonnull final String sName, @Nullable final String sScheme, final boolean bIsHttpEquiv)
  {
    if (sName == null)
      throw new NullPointerException ("name");
    m_sName = sName;
    m_sScheme = sScheme;
    m_bIsHttpEquiv = bIsHttpEquiv;
  }

  public MetaElement (@Nonnull final IMetaElementDeclaration aMetaTagDecl, @Nullable final String sContent)
  {
    this (aMetaTagDecl.getName (), aMetaTagDecl.getScheme (), aMetaTagDecl.isHttpEquiv (), null, sContent);
  }

  public MetaElement (@Nonnull final String sName, @Nullable final String sContent)
  {
    this (sName, null, DEFAULT_IS_HTTP_EQUIV, null, sContent);
  }

  public MetaElement (@Nonnull final String sName, final boolean bIsHttpEquiv, @Nullable final String sContent)
  {
    this (sName, null, bIsHttpEquiv, null, sContent);
  }

  public MetaElement (@Nonnull final String sName,
                      @Nullable final String sScheme,
                      final boolean bIsHttpEquiv,
                      @Nullable final Locale aContentLocale,
                      @Nullable final String sContent)
  {
    if (sName == null)
      throw new NullPointerException ("name");
    m_sName = sName;
    m_sScheme = sScheme;
    m_bIsHttpEquiv = bIsHttpEquiv;
    setContent (aContentLocale, sContent);
  }

  @Nonnull
  public String getName ()
  {
    return m_sName;
  }

  @Nullable
  public String getScheme ()
  {
    return m_sScheme;
  }

  public boolean isHttpEquiv ()
  {
    return m_bIsHttpEquiv;
  }

  public boolean isLanguageIndependent ()
  {
    return m_aContents.containsKey (CGlobal.LOCALE_INDEPENDENT);
  }

  @Nonnull
  @ReturnsMutableCopy
  public Set <Locale> getAllLocales ()
  {
    return ContainerHelper.newSet (m_aContents.keySet ());
  }

  @Nonnull
  @ReturnsMutableCopy
  public Map <Locale, String> getContent ()
  {
    return ContainerHelper.newMap (m_aContents);
  }

  @Nonnull
  private static Locale _getRealContentLocale (@Nullable final Locale aContentLocale)
  {
    return aContentLocale == null ? CGlobal.LOCALE_INDEPENDENT : aContentLocale;
  }

  @Nonnull
  public EChange setContent (@Nullable final Locale aContentLocale, @Nullable final String sContent)
  {
    final Locale aRealContentLocale = _getRealContentLocale (aContentLocale);
    final String sOldContent = m_aContents.get (aRealContentLocale);
    if (EqualsUtils.equals (sOldContent, sContent))
      return EChange.UNCHANGED;
    if (sContent == null)
      m_aContents.remove (aRealContentLocale);
    else
      m_aContents.put (aRealContentLocale, sContent);
    return EChange.CHANGED;
  }

  @Nonnull
  public EChange removeContent (@Nullable final Locale aContentLocale)
  {
    final Locale aRealContentLocale = _getRealContentLocale (aContentLocale);
    // Manually check for key, as the value can be null
    if (!m_aContents.containsKey (aRealContentLocale))
      return EChange.UNCHANGED;
    m_aContents.remove (aRealContentLocale);
    return EChange.CHANGED;
  }

  @Nonnull
  public EChange setHttpEquiv (final boolean bIsHttpEquiv)
  {
    if (m_bIsHttpEquiv == bIsHttpEquiv)
      return EChange.UNCHANGED;
    m_bIsHttpEquiv = bIsHttpEquiv;
    return EChange.CHANGED;
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IMetaElementValue> getAsMetaElementValueList ()
  {
    final List <IMetaElementValue> ret = new ArrayList <IMetaElementValue> (m_aContents.size ());
    for (final Map.Entry <Locale, String> aEntry : m_aContents.entrySet ())
      ret.add (new MetaElementValue (m_sName, aEntry.getKey (), aEntry.getValue (), m_bIsHttpEquiv));
    return ret;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof MetaElement))
      return false;
    final MetaElement rhs = (MetaElement) o;
    return m_sName.equals (rhs.m_sName) &&
           EqualsUtils.equals (m_sScheme, rhs.m_sScheme) &&
           m_aContents.equals (rhs.m_aContents) &&
           m_bIsHttpEquiv == rhs.m_bIsHttpEquiv;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sName)
                                       .append (m_sScheme)
                                       .append (m_aContents)
                                       .append (m_bIsHttpEquiv)
                                       .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("name", m_sName)
                                       .appendIfNotNull ("scheme", m_sScheme)
                                       .append ("contents", m_aContents)
                                       .append ("isHttpEquiv", m_bIsHttpEquiv)
                                       .toString ();
  }
}
