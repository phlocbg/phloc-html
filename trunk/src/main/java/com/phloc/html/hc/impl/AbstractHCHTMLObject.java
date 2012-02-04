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
package com.phloc.html.hc.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.compare.EqualsUtils;
import com.phloc.commons.lang.GenericReflection;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.commons.xml.CXML;
import com.phloc.commons.xml.CXMLRegEx;
import com.phloc.css.ECSSProperty;
import com.phloc.css.ECSSVersion;
import com.phloc.css.ICSSClassProvider;
import com.phloc.css.ICSSValue;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.hc.IHCObject;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.js.CJS;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.JSEventMap;
import com.phloc.html.js.provider.DefaultJSCodeProvider;
import com.phloc.html.js.provider.JSCodeWrapper;

/**
 * Abstract implementation of the {@link IHCObject} interface.
 * 
 * @author philip
 * @param <THISTYPE>
 */
public abstract class AbstractHCHTMLObject <THISTYPE extends IHCObject <THISTYPE>> extends AbstractHCNode implements
                                                                                                         IHCObject <THISTYPE>
{
  /** prefix for JS attributes */
  protected static final IJSCodeProvider JS_BLUR = JSCodeWrapper.getFunctionCall ("blur");
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCHTMLObject.class);

  private String m_sID;
  private String m_sTitle;
  private LinkedHashSet <String> m_aClasses;
  private LinkedHashMap <ECSSProperty, ICSSValue> m_aStyles;
  private EHCTextDirection m_eDirection;
  private String m_sLanguage;
  /*
   * Use 1 pointer instead of many to save memory if no handler is used at all
   * (which happens quite often)!
   */
  private JSEventMap m_aJSHandler;
  private LinkedHashMap <String, String> m_aCustomAttrs;

  protected AbstractHCHTMLObject ()
  {}

  protected static final void consistencyAssert (final boolean bCondition)
  {
    if (!bCondition)
      throw new IllegalStateException ("Consistency check failed");
  }

  protected static final void checkIfLinkIsMasked (@Nullable final String sHref)
  {
    if (sHref != null)
    {
      // FIXME: this is potential vulnerability. If the passed href is passed
      // from
      // a user input, which cannot be told at this point, it might as well
      // contain a'&amp;' followed by some malicious code that should be
      // escaped.
      if (sHref.contains ("&amp;"))
        throw new IllegalArgumentException ("The URL '" + sHref + "' seems to be already quoted!");
    }
  }

  @Nonnull
  protected final THISTYPE thisAsT ()
  {
    // Avoid the unchecked cast warning in all places
    return GenericReflection.<AbstractHCHTMLObject <THISTYPE>, THISTYPE> uncheckedCast (this);
  }

  @Nullable
  public final String getID ()
  {
    return m_sID;
  }

  @Nonnull
  public final THISTYPE setID (final String sID)
  {
    // Happens to often, since "[" and "]" occur very often and are not allowed
    if (false)
      if (sID != null && !CXMLRegEx.PATTERN_NCNAME.matcher (sID).matches ())
        s_aLogger.warn ("The ID '" + sID + "' does not match the required regular expression!");
    m_sID = sID;
    return thisAsT ();
  }

  @Nullable
  protected final String getTitle ()
  {
    return m_sTitle;
  }

  @Nonnull
  public final THISTYPE setTitle (@Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    return setTitle (aTextProvider.getText ());
  }

  @Nonnull
  public final THISTYPE setTitle (@Nullable final String sTitle)
  {
    if (false && GlobalDebug.isDebugMode ())
      if (StringHelper.endsWith (sTitle, '.') && !StringHelper.endsWith (sTitle, "..."))
        s_aLogger.warn ("Remove the trailing dot from '" + sTitle + "'");
    m_sTitle = sTitle;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addClass (@Nullable final ICSSClassProvider aProvider)
  {
    final String sClass = aProvider == null ? null : aProvider.getCSSClass ();
    if (sClass != null && sClass.length () > 0)
    {
      consistencyAssert (sClass.indexOf (' ') == -1);
      if (m_aClasses == null)
        m_aClasses = new LinkedHashSet <String> ();
      m_aClasses.add (sClass);
    }
    return thisAsT ();
  }

  @Deprecated
  @Nonnull
  public final THISTYPE addClasses (@Nullable final ICSSClassProvider aProvider)
  {
    return addClass (aProvider);
  }

  @Nonnull
  public final THISTYPE addClasses (@Nullable final ICSSClassProvider... aProviders)
  {
    if (aProviders != null)
      for (final ICSSClassProvider aProvider : aProviders)
        addClass (aProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addClasses (@Nullable final Iterable <? extends ICSSClassProvider> aProviders)
  {
    if (aProviders != null)
      for (final ICSSClassProvider aProvider : aProviders)
        addClass (aProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeClass (@Nonnull final ICSSClassProvider aProvider)
  {
    if (m_aClasses != null)
    {
      final String sClass = aProvider.getCSSClass ();
      if (StringHelper.hasText (sClass))
      {
        consistencyAssert (sClass.indexOf (' ') == -1);
        m_aClasses.remove (sClass);
      }
    }
    return thisAsT ();
  }

  public final boolean hasClass (@Nonnull final ICSSClassProvider aProvider)
  {
    if (m_aClasses != null)
    {
      final String sClass = aProvider.getCSSClass ();
      if (StringHelper.hasText (sClass))
      {
        consistencyAssert (sClass.indexOf (' ') == -1);
        return m_aClasses.contains (sClass);
      }
    }
    return false;
  }

  @Nonnull
  public final THISTYPE addStyle (@Nullable final ICSSValue aValue)
  {
    if (aValue != null)
    {
      if (m_aStyles == null)
        m_aStyles = new LinkedHashMap <ECSSProperty, ICSSValue> ();
      m_aStyles.put (aValue.getProp (), aValue);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addStyles (@Nullable final ICSSValue... aValues)
  {
    if (aValues != null)
      for (final ICSSValue aValue : aValues)
        addStyle (aValue);
    return thisAsT ();
  }

  public final boolean hasStyle (@Nullable final ECSSProperty eProperty)
  {
    return m_aStyles != null && m_aStyles.containsKey (eProperty);
  }

  public final boolean hasStyle (@Nullable final ICSSValue aValue)
  {
    if (aValue == null || m_aStyles == null)
      return false;

    // Contained styles can never have a null value!
    final ECSSProperty eProp = aValue.getProp ();
    return EqualsUtils.nullSafeEquals (m_aStyles.get (eProp), aValue);
  }

  @Nonnull
  public final THISTYPE removeStyle (@Nonnull final ECSSProperty eProperty)
  {
    if (m_aStyles != null)
      m_aStyles.remove (eProperty);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setDirection (@Nullable final EHCTextDirection eDirection)
  {
    m_eDirection = eDirection;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setLanguage (@Nullable final String sLanguage)
  {
    m_sLanguage = sLanguage;
    return thisAsT ();
  }

  /**
   * Cleans the passed JS so that it is suitable for appending it to a sequence
   * of commands.<br>
   * In contrast to assignment, we don't need no "javascript:" prefix when
   * appending something!
   * 
   * @param aJS
   *        The JS to be cleaned up. May be <code>null</code>.
   * @param bWithJSPrefix
   *        The resulting string should contain the "javascript:" prefix if any
   *        JS code was found.
   * @return The cleaned JS without a leading "javascript:" prefix and with an
   *         ensure ";" ending. If the input is empty <code>null</code> is
   *         returned.
   */
  @Nullable
  protected static final IJSCodeProvider cleanJSLink (@Nullable final IJSCodeProvider aJS, final boolean bWithJSPrefix)
  {
    // Input is null?
    if (aJS == null)
      return null;

    // Is the contained JS code empty?
    String sJSCode = aJS.getJSCode ();
    if (sJSCode == null)
      return null;

    // Trim all whitespaces - than empty?
    sJSCode = sJSCode.trim ();
    if (sJSCode.length () == 0)
      return null;

    // Short hint indicating a potentially invalid JS code
    if (sJSCode.startsWith (CJS.JS_END_OF_STATEMENT_STR))
      s_aLogger.warn ("JS code starts with a ';'!");

    // kick the leading "javascript:" prefix
    if (sJSCode.startsWith (CJS.JS_PREFIX))
    {
      sJSCode = sJSCode.substring (CJS.JS_PREFIX.length ()).trim ();

      // If there is nothing left, this is a crappy statement
      if (StringHelper.hasNoText (sJSCode))
        return null;
    }

    // Ensure string ends with a ";"
    if (!sJSCode.endsWith (CJS.JS_END_OF_STATEMENT_STR))
      sJSCode += CJS.JS_END_OF_STATEMENT_STR;

    // Ensure that a prefix is present (if desired)
    if (bWithJSPrefix)
      sJSCode = CJS.JS_PREFIX + sJSCode;

    // Now we have a non-empty string, not starting with "javascript:" and
    // ensure to be ending with ";"
    return DefaultJSCodeProvider.create (sJSCode);
  }

  @Nonnull
  public final THISTYPE addEventHandler (@Nonnull final EJSEvent eJSEvent, @Nullable final IJSCodeProvider aJSCode)
  {
    final IJSCodeProvider aCleanedCode = cleanJSLink (aJSCode, false);
    if (aCleanedCode != null)
    {
      if (m_aJSHandler == null)
        m_aJSHandler = new JSEventMap ();
      m_aJSHandler.addHandler (eJSEvent, aCleanedCode);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setEventHandler (@Nonnull final EJSEvent eJSEvent, @Nullable final IJSCodeProvider aJSCode)
  {
    final IJSCodeProvider aCleanedCode = cleanJSLink (aJSCode, false);
    if (aCleanedCode != null)
    {
      if (m_aJSHandler == null)
        m_aJSHandler = new JSEventMap ();
      m_aJSHandler.setHandler (eJSEvent, aCleanedCode);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllEventHandler (@Nonnull final EJSEvent eJSEvent)
  {
    if (m_aJSHandler != null)
      m_aJSHandler.removeHandler (eJSEvent);
    return thisAsT ();
  }

  @Nullable
  public final IJSCodeProvider getEventHandler (@Nonnull final EJSEvent eJSEvent)
  {
    return m_aJSHandler == null ? null : m_aJSHandler.getHandler (eJSEvent);
  }

  @Nonnull
  public final THISTYPE makeUnfocusable (final boolean bUnfocusable)
  {
    if (bUnfocusable)
      return setEventHandler (EJSEvent.ONFOCUS, JS_BLUR);
    return removeAllEventHandler (EJSEvent.ONFOCUS);
  }

  @Nonnull
  public final THISTYPE setCustomAttr (@Nullable final String sName, @Nullable final String sValue)
  {
    if (StringHelper.hasText (sName) && sValue != null)
    {
      if (m_aCustomAttrs == null)
        m_aCustomAttrs = new LinkedHashMap <String, String> ();
      m_aCustomAttrs.put (sName, sValue);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeCustomAttr (@Nullable final String sName)
  {
    if (m_aCustomAttrs != null && sName != null)
      m_aCustomAttrs.remove (sName);
    return thisAsT ();
  }

  /**
   * Set all attributes and child elements of this object
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   * @param aElement
   *        The current micro element to be filled
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (@Nonnull final HCConversionSettings aConversionSettings,
                                  @Nonnull final IMicroElement aElement)
  {
    applyProperties (aElement, false);
  }

  protected final void applyProperties (@Nonnull final IMicroElement aElement, final boolean bSkipUniqueProperties)
  {
    if (!bSkipUniqueProperties && StringHelper.hasText (m_sID))
      aElement.setAttribute (CHTMLAttributes.ID, m_sID);

    if (m_aClasses != null && !m_aClasses.isEmpty ())
      aElement.setAttribute (CHTMLAttributes.CLASS, StringHelper.implode (" ", m_aClasses));

    if (m_aStyles != null && !m_aStyles.isEmpty ())
    {
      final StringBuilder aSB = new StringBuilder ();
      for (final ICSSValue aValue : m_aStyles.values ())
        aSB.append (aValue.getAsCSSString (ECSSVersion.LATEST, true));
      aElement.setAttribute (CHTMLAttributes.STYLE, aSB.toString ());
    }

    if (m_eDirection != null)
      aElement.setAttribute (CHTMLAttributes.DIR, m_eDirection.getAttrValue ());

    if (StringHelper.hasText (m_sLanguage))
      aElement.setAttribute (CXML.XML_ATTR_LANG, m_sLanguage);

    if (m_aJSHandler != null)
      m_aJSHandler.applyToElement (aElement);

    if (StringHelper.hasText (m_sTitle))
      aElement.setAttribute (CHTMLAttributes.TITLE, m_sTitle);

    if (m_aCustomAttrs != null && !m_aCustomAttrs.isEmpty ())
      for (final Map.Entry <String, String> aEntry : m_aCustomAttrs.entrySet ())
        aElement.setAttribute (aEntry.getKey (), aEntry.getValue ());
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).appendIfNotNull ("id", m_sID)
                                       .appendIfNotNull ("title", m_sTitle)
                                       .appendIfNotNull ("classes", m_aClasses)
                                       .appendIfNotNull ("styles", m_aStyles)
                                       .appendIfNotNull ("direction", m_eDirection)
                                       .appendIfNotNull ("language", m_sLanguage)
                                       .appendIfNotNull ("JShandler", m_aJSHandler)
                                       .appendIfNotNull ("custom", m_aCustomAttrs)
                                       .toString ();
  }
}
