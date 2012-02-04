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
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.compare.EqualsUtils;
import com.phloc.commons.lang.GenericReflection;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.commons.xml.CXML;
import com.phloc.commons.xml.CXMLRegEx;
import com.phloc.css.ECSSProperty;
import com.phloc.css.ECSSVersion;
import com.phloc.css.ICSSClassProvider;
import com.phloc.css.ICSSValue;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.conversion.HCDefaultCustomizer;
import com.phloc.html.js.CJS;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.JSEventMap;
import com.phloc.html.js.provider.DefaultJSCodeProvider;
import com.phloc.html.js.provider.JSCodeWrapper;

public abstract class AbstractHCElement <THISTYPE extends IHCElement <THISTYPE>> extends AbstractHCNode implements
                                                                                                       IHCElement <THISTYPE>
{
  /** prefix for JS attributes */
  protected static final IJSCodeProvider JS_BLUR = JSCodeWrapper.getFunctionCall ("blur");
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCElement.class);

  /** The HTML enum element */
  private final EHTMLElement m_eElement;
  /** The cached element name */
  private final String m_sElementName;

  private String m_sID;
  private String m_sTitle;
  private String m_sLanguage;
  private EHCTextDirection m_eDirection;
  private LinkedHashSet <String> m_aClasses;
  private LinkedHashMap <ECSSProperty, ICSSValue> m_aStyles;
  /*
   * Use 1 pointer instead of many to save memory if no handler is used at all
   * (which happens quite often)!
   */
  private JSEventMap m_aJSHandler;
  private LinkedHashMap <String, String> m_aCustomAttrs;

  protected AbstractHCElement (@Nonnull final EHTMLElement eElement)
  {
    if (eElement == null)
      throw new NullPointerException ("element");
    m_eElement = eElement;
    m_sElementName = eElement.getElementName ();
  }

  @Nonnull
  public final EHTMLElement getElement ()
  {
    return m_eElement;
  }

  @Nonnull
  @Nonempty
  public final String getTagName ()
  {
    return m_sElementName;
  }

  @Nonnull
  protected final THISTYPE thisAsT ()
  {
    // Avoid the unchecked cast warning in all places
    return GenericReflection.<AbstractHCElement <THISTYPE>, THISTYPE> uncheckedCast (this);
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
      HCConsistencyChecker.consistencyAssert (sClass.indexOf (' ') == -1, "Cannot add a class with a whitespace");
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
        HCConsistencyChecker.consistencyAssert (sClass.indexOf (' ') == -1, "Cannot remove a class with a whitespace");
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
        HCConsistencyChecker.consistencyAssert (sClass.indexOf (' ') == -1,
                                                "Cannot check for a class with a whitespace");
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
   * This method checks whether the node is suitable for conversion to an
   * IMicroElement.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   * @return <code>true</code> if the node can be converted to a node,
   *         <code>false</code> otherwise.
   */
  @OverrideOnDemand
  protected boolean canConvertToNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    return true;
  }

  /**
   * This method is called before the element itself is created. Overwrite this
   * method to perform actions that can only be done when the element is build
   * finally.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  protected void prepareBeforeCreateElement (@Nonnull final HCConversionSettings aConversionSettings)
  {}

  /**
   * @return The created micro element for this HC element. May not be
   *         <code>null</code>.
   */
  @OverrideOnDemand
  @Nonnull
  protected IMicroElement createElement ()
  {
    return new MicroElement (m_sElementName);
  }

  /**
   * Set all attributes and child elements of this object
   * 
   * @param aElement
   *        The current micro element to be filled
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (@Nonnull final IMicroElement aElement,
                                  @Nonnull final HCConversionSettings aConversionSettings)
  {
    if (StringHelper.hasText (m_sID))
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

  /**
   * This method is called after the element itself was created and filled.
   * Overwrite this method to perform actions that can only be done after the
   * element was build finally.
   * 
   * @param eElement
   *        The created micro element
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  protected void finishAfterApplyProperties (@Nonnull final IMicroElement eElement,
                                             @Nonnull final HCConversionSettings aConversionSettings)
  {
    HCDefaultCustomizer.customize (eElement);
  }

  /*
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   */
  @Nullable
  public IMicroNode getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    if (!canConvertToNode (aConversionSettings))
      return null;

    // Run some
    if (aConversionSettings.areConsistencyChecksEnabled ())
      HCConsistencyChecker.runConsistencyCheckBeforeCreation (this, aConversionSettings.getHTMLVersion ());

    // Prepare object
    prepareBeforeCreateElement (aConversionSettings);
    final IMicroElement ret = createElement ();
    if (ret == null)
      throw new IllegalStateException ("Created a null element!");
    applyProperties (ret, aConversionSettings);
    finishAfterApplyProperties (ret, aConversionSettings);
    return ret;
  }
}
