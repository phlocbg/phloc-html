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

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.lang.GenericReflection;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.commons.xml.CXML;
import com.phloc.css.property.ECSSProperty;
import com.phloc.css.propertyvalue.ICSSValue;
import com.phloc.css.writer.CSSWriterSettings;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.api5.EHCContentEditable;
import com.phloc.html.hc.api5.EHCDraggable;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.js.CJS;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.JSEventMap;
import com.phloc.html.js.provider.DefaultJSCodeProvider;

public abstract class AbstractHCElement <THISTYPE extends AbstractHCElement <THISTYPE>> extends AbstractHCNode implements
                                                                                                              IHCElement <THISTYPE>
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCElement.class);

  /** The HTML enum element */
  private final EHTMLElement m_eElement;
  /** The cached element name */
  private final String m_sElementName;

  private String m_sID;
  private String m_sTitle;
  private String m_sLanguage;
  private EHCTextDirection m_eDirection;
  private LinkedHashSet <ICSSClassProvider> m_aCSSClassProviders;
  private LinkedHashMap <ECSSProperty, ICSSValue> m_aStyles;
  /*
   * Use 1 pointer instead of many to save memory if no handler is used at all
   * (which happens quite often)!
   */
  private JSEventMap m_aJSHandler;
  private boolean m_bUnfocusable = false;
  private boolean m_bHidden = false;
  private long m_nTabIndex = CGlobal.ILLEGAL_ULONG;
  private String m_sAccessKey;
  private EHCDraggable m_eDraggable;
  private EHCContentEditable m_eContentEditable;
  private String m_sContextMenu;
  private boolean m_bSpellCheck = false;
  private LinkedHashMap <String, String> m_aCustomAttrs;
  private boolean m_bPreparedOnce = false;

  protected AbstractHCElement (@Nonnull final EHTMLElement eElement)
  {
    if (eElement == null)
      throw new NullPointerException ("element");
    m_eElement = eElement;
    m_sElementName = eElement.getElementNameLowerCase ();
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
    // RegEx check: !CXMLRegEx.PATTERN_NCNAME.matcher (sID).matches ()
    // Happens to often, since "[" and "]" occur very often and are not allowed
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
    m_sTitle = sTitle;
    return thisAsT ();
  }

  /**
   * @deprecated Use {@link #containsClass(ICSSClassProvider)} instead
   */
  @Deprecated
  public final boolean hasClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    return containsClass (aCSSClassProvider);
  }

  public final boolean containsClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    return m_aCSSClassProviders != null &&
           aCSSClassProvider != null &&
           m_aCSSClassProviders.contains (aCSSClassProvider);
  }

  @Nonnull
  public final THISTYPE addClass (@Nullable final ICSSClassProvider aCSSClassProvider)
  {
    if (aCSSClassProvider != null)
    {
      if (m_aCSSClassProviders == null)
        m_aCSSClassProviders = new LinkedHashSet <ICSSClassProvider> ();
      m_aCSSClassProviders.add (aCSSClassProvider);
    }
    return thisAsT ();
  }

  @Deprecated
  @Nonnull
  public final THISTYPE addClasses (@Nullable final ICSSClassProvider aCSSClassProvider)
  {
    return addClass (aCSSClassProvider);
  }

  @Nonnull
  public final THISTYPE addClasses (@Nullable final ICSSClassProvider... aCSSClassProviders)
  {
    if (aCSSClassProviders != null)
      for (final ICSSClassProvider aProvider : aCSSClassProviders)
        addClass (aProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addClasses (@Nullable final Iterable <? extends ICSSClassProvider> aCSSClassProviders)
  {
    if (aCSSClassProviders != null)
      for (final ICSSClassProvider aProvider : aCSSClassProviders)
        addClass (aProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeClass (@Nonnull final ICSSClassProvider aCSSClassProvider)
  {
    if (m_aCSSClassProviders != null && aCSSClassProvider != null)
      m_aCSSClassProviders.remove (aCSSClassProvider);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllClasses ()
  {
    if (m_aCSSClassProviders != null)
      m_aCSSClassProviders.clear ();
    return thisAsT ();
  }

  /**
   * @deprecated Use {@link #getAllClasses()} instead
   */
  @Deprecated
  @Nonnull
  public final Collection <ICSSClassProvider> getClasses ()
  {
    return getAllClasses ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final Set <ICSSClassProvider> getAllClasses ()
  {
    return ContainerHelper.newOrderedSet (m_aCSSClassProviders);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final Set <String> getAllClassNames ()
  {
    final Set <String> ret = new LinkedHashSet <String> ();
    if (m_aCSSClassProviders != null)
      for (final ICSSClassProvider aCSSClassProvider : m_aCSSClassProviders)
        ret.add (aCSSClassProvider.getCSSClass ());
    return ret;
  }

  /**
   * @deprecated Use {@link #getAllStyles()} instead
   */
  @Deprecated
  @Nonnull
  @ReturnsMutableCopy
  public final Map <ECSSProperty, ICSSValue> getStyles ()
  {
    return getAllStyles ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final Map <ECSSProperty, ICSSValue> getAllStyles ()
  {
    return ContainerHelper.newMap (m_aStyles);
  }

  @Nonnull
  @ReturnsMutableCopy
  public final Collection <ICSSValue> getAllStyleValues ()
  {
    return m_aStyles == null ? new ArrayList <ICSSValue> () : ContainerHelper.newList (m_aStyles.values ());
  }

  @Nullable
  public final ICSSValue getStyleValue (@Nullable final ECSSProperty eProperty)
  {
    return eProperty == null || m_aStyles == null ? null : m_aStyles.get (eProperty);
  }

  /**
   * @deprecated Use {@link #containsStyle(ECSSProperty)} instead
   */
  @Deprecated
  public final boolean hasStyle (@Nullable final ECSSProperty eProperty)
  {
    return containsStyle (eProperty);
  }

  public final boolean containsStyle (@Nullable final ECSSProperty eProperty)
  {
    return m_aStyles != null && m_aStyles.containsKey (eProperty);
  }

  public final boolean hasStyle (@Nullable final ICSSValue aValue)
  {
    if (aValue == null || m_aStyles == null)
      return false;

    // Contained styles can never have a null value!
    final ECSSProperty eProp = aValue.getProp ();
    return EqualsUtils.equals (m_aStyles.get (eProp), aValue);
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
  @Deprecated
  public final THISTYPE addStyles (@Nullable final ICSSValue aValue)
  {
    return addStyle (aValue);
  }

  @Nonnull
  public final THISTYPE addStyles (@Nullable final ICSSValue... aValues)
  {
    if (aValues != null)
      for (final ICSSValue aValue : aValues)
        addStyle (aValue);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addStyles (@Nullable final Iterable <? extends ICSSValue> aValues)
  {
    if (aValues != null)
      for (final ICSSValue aValue : aValues)
        addStyle (aValue);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeStyle (@Nonnull final ECSSProperty eProperty)
  {
    if (m_aStyles != null)
      m_aStyles.remove (eProperty);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllStyles ()
  {
    m_aStyles.clear ();
    return thisAsT ();
  }

  @Nullable
  public final EHCTextDirection getDirection ()
  {
    return m_eDirection;
  }

  @Nonnull
  public final THISTYPE setDirection (@Nullable final EHCTextDirection eDirection)
  {
    m_eDirection = eDirection;
    return thisAsT ();
  }

  @Nullable
  public final String getLanguage ()
  {
    return m_sLanguage;
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
  public final IJSCodeProvider getEventHandler (@Nullable final EJSEvent eJSEvent)
  {
    return m_aJSHandler == null ? null : m_aJSHandler.getHandler (eJSEvent);
  }

  public final boolean containsEventHandler (@Nullable final EJSEvent eJSEvent)
  {
    return m_aJSHandler != null && m_aJSHandler.containsHandler (eJSEvent);
  }

  public final boolean isUnfocusable ()
  {
    return m_bUnfocusable;
  }

  @Nonnull
  public final THISTYPE setUnfocusable (final boolean bUnfocusable)
  {
    m_bUnfocusable = bUnfocusable;
    return thisAsT ();
  }

  public final boolean isHidden ()
  {
    return m_bHidden;
  }

  @Nonnull
  public final THISTYPE setHidden (final boolean bHidden)
  {
    m_bHidden = bHidden;
    return thisAsT ();
  }

  @CheckForSigned
  public final long getTabIndex ()
  {
    return m_nTabIndex;
  }

  @Nonnull
  public final THISTYPE setTabIndex (final long nTabIndex)
  {
    m_nTabIndex = nTabIndex;
    return thisAsT ();
  }

  @Nullable
  public final String getAccessKey ()
  {
    return m_sAccessKey;
  }

  @Nonnull
  public final THISTYPE setAccessKey (@Nullable final String sAccessKey)
  {
    m_sAccessKey = sAccessKey;
    return thisAsT ();
  }

  @Nullable
  public final EHCDraggable getDraggable ()
  {
    return m_eDraggable;
  }

  @Nonnull
  public final THISTYPE setDraggable (@Nullable final EHCDraggable eDraggable)
  {
    m_eDraggable = eDraggable;
    return thisAsT ();
  }

  @Nullable
  public final EHCContentEditable getContentEditable ()
  {
    return m_eContentEditable;
  }

  @Nonnull
  public final THISTYPE setContentEditable (@Nullable final EHCContentEditable eContentEditable)
  {
    m_eContentEditable = eContentEditable;
    return thisAsT ();
  }

  @Nullable
  public final String getContextMenu ()
  {
    return m_sContextMenu;
  }

  @Nonnull
  public final THISTYPE setContextMenu (@Nullable final String sContextMenu)
  {
    m_sContextMenu = sContextMenu;
    return thisAsT ();
  }

  public final boolean isSpellCheck ()
  {
    return m_bSpellCheck;
  }

  @Nonnull
  public final THISTYPE setSpellCheck (final boolean bSpellCheck)
  {
    m_bSpellCheck = bSpellCheck;
    return thisAsT ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public final Map <String, String> getCustomAttrs ()
  {
    return ContainerHelper.newOrderedMap (m_aCustomAttrs);
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

  public final boolean isPreparedBeforeCreateElement ()
  {
    return m_bPreparedOnce;
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
  protected boolean canConvertToNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    return true;
  }

  /**
   * This method is called once for each instead before the element itself is
   * created. Overwrite this method to perform actions that can only be done
   * when the element is build finally.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  protected void prepareOnceBeforeCreateElement (@Nonnull final IHCConversionSettings aConversionSettings)
  {}

  /**
   * This method is called before the element itself is created. Overwrite this
   * method to perform actions that can only be done when the element is build
   * finally.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void prepareBeforeCreateElement (@Nonnull final IHCConversionSettings aConversionSettings)
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
                                  @Nonnull final IHCConversionSettings aConversionSettings)
  {
    final boolean bHTML5 = aConversionSettings.getHTMLVersion ().isAtLeastHTML5 ();

    if (StringHelper.hasText (m_sID))
      aElement.setAttribute (CHTMLAttributes.ID, m_sID);

    if (StringHelper.hasText (m_sTitle))
      aElement.setAttribute (CHTMLAttributes.TITLE, m_sTitle);

    if (StringHelper.hasText (m_sLanguage))
      aElement.setAttribute (CXML.XML_ATTR_LANG, m_sLanguage);

    if (m_eDirection != null)
      aElement.setAttribute (CHTMLAttributes.DIR, m_eDirection.getAttrValue ());

    if (m_aCSSClassProviders != null && !m_aCSSClassProviders.isEmpty ())
    {
      final StringBuilder aSB = new StringBuilder ();
      for (final ICSSClassProvider aCSSClassProvider : m_aCSSClassProviders)
      {
        if (aSB.length () > 0)
          aSB.append (' ');
        aSB.append (aCSSClassProvider.getCSSClass ());
      }
      aElement.setAttribute (CHTMLAttributes.CLASS, aSB.toString ());
    }

    if (m_aStyles != null && !m_aStyles.isEmpty ())
    {
      final CSSWriterSettings aCSSSettings = new CSSWriterSettings (aConversionSettings.getCSSVersion (),
                                                                    !aConversionSettings.isIdentAndAlignCSS ());
      final StringBuilder aSB = new StringBuilder ();
      for (final ICSSValue aValue : m_aStyles.values ())
        aSB.append (aValue.getAsCSSString (aCSSSettings, 0));
      aElement.setAttribute (CHTMLAttributes.STYLE, aSB.toString ());
    }

    // Emit all JS events
    if (m_aJSHandler != null)
      m_aJSHandler.applyToElement (aElement);

    // unfocusable is handled by the customizer as it is non-standard

    // Global attributes
    if (m_nTabIndex != CGlobal.ILLEGAL_UINT)
      aElement.setAttribute (CHTMLAttributes.TABINDEX, m_nTabIndex);
    if (StringHelper.hasNoText (m_sAccessKey))
      aElement.setAttribute (CHTMLAttributes.ACCESSKEY, m_sAccessKey);

    // Global HTML5 attributes
    if (bHTML5)
    {
      if (m_eContentEditable != null)
        aElement.setAttribute (CHTMLAttributes.CONTENTEDITABLE, m_eContentEditable.getAttrValue ());
      if (StringHelper.hasNoText (m_sContextMenu))
        aElement.setAttribute (CHTMLAttributes.CONTEXTMENU, m_sContextMenu);
      if (m_eDraggable != null)
        aElement.setAttribute (CHTMLAttributes.DRAGGABLE, m_eDraggable.getAttrValue ());
      if (m_bHidden)
        aElement.setAttribute (CHTMLAttributes.HIDDEN, CHTMLAttributeValues.HIDDEN);
      if (m_bSpellCheck)
        aElement.setAttribute (CHTMLAttributes.SPELLCHECK, CHTMLAttributeValues.SPELLCHECK);
    }

    if (m_aCustomAttrs != null && !m_aCustomAttrs.isEmpty ())
      for (final Map.Entry <String, String> aEntry : m_aCustomAttrs.entrySet ())
      {
        final String sAttrName = aEntry.getKey ();
        if (bHTML5 && !StringHelper.startsWith (sAttrName, CHTMLAttributes.HTML5_PREFIX_DATA))
          s_aLogger.warn ("Custom attribute '" +
                          sAttrName +
                          "' does not start with proposed prefix '" +
                          CHTMLAttributes.HTML5_PREFIX_DATA +
                          "'");
        aElement.setAttribute (sAttrName, aEntry.getValue ());
      }
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
                                             @Nonnull final IHCConversionSettings aConversionSettings)
  {}

  /*
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   */
  @Nullable
  public IMicroNode getAsNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    if (!canConvertToNode (aConversionSettings))
      return null;

    // Run some consistency checks if desired
    if (aConversionSettings.areConsistencyChecksEnabled ())
      HCConsistencyChecker.runConsistencyCheckBeforeCreation (this, aConversionSettings.getHTMLVersion ());

    // Do standard customization
    aConversionSettings.getCustomizer ().customizeHCElement (this, aConversionSettings.getHTMLVersion ());

    // Prepare object once per instance - before first rendering (implementation
    // dependent)
    if (!m_bPreparedOnce)
    {
      prepareOnceBeforeCreateElement (aConversionSettings);
      m_bPreparedOnce = true;
    }

    // Prepare object for each rendering (implementation dependent)
    prepareBeforeCreateElement (aConversionSettings);

    // Create the element
    final IMicroElement ret = createElement ();
    if (ret == null)
      throw new IllegalStateException ("Created a null element!");

    // Set all HTML attributes etc.
    applyProperties (ret, aConversionSettings);

    // Optional callback after everything was done (implementation dependent)
    finishAfterApplyProperties (ret, aConversionSettings);
    return ret;
  }

  @Override
  @Nullable
  public IHCBaseNode getOutOfBandNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    return aConversionSettings.getCustomizer ().getCustomOutOfBandNode (this, aConversionSettings.getHTMLVersion ());
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("element", m_eElement)
                                       .appendIfNotNull ("ID", m_sID)
                                       .appendIfNotNull ("title", m_sTitle)
                                       .appendIfNotNull ("language", m_sLanguage)
                                       .appendIfNotNull ("direction", m_eDirection)
                                       .appendIfNotNull ("classes", m_aCSSClassProviders)
                                       .appendIfNotNull ("styles", m_aStyles)
                                       .appendIfNotNull ("JSHandler", m_aJSHandler)
                                       .append ("unfocusable", m_bUnfocusable)
                                       .append ("hidden", m_bHidden)
                                       .append ("tabIndex", m_nTabIndex)
                                       .appendIfNotNull ("accessKey", m_sAccessKey)
                                       .appendIfNotNull ("draggable", m_eDraggable)
                                       .appendIfNotNull ("contextMenu", m_sContextMenu)
                                       .append ("spellcheck", m_bSpellCheck)
                                       .appendIfNotNull ("customAttrs", m_aCustomAttrs)
                                       .toString ();
  }
}
