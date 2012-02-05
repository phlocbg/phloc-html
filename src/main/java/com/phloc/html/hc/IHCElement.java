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
package com.phloc.html.hc;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.css.ECSSProperty;
import com.phloc.css.ICSSClassProvider;
import com.phloc.css.ICSSValue;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCTextDirection;
import com.phloc.html.hc.api5.EHCContentEditable;
import com.phloc.html.hc.api5.EHCDraggable;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.IJSCodeProvider;

public interface IHCElement <THISTYPE extends IHCElement <THISTYPE>> extends IHCNode
{
  /**
   * @return The contained HTML element. Never <code>null</code>.
   */
  @Nonnull
  EHTMLElement getElement ();

  /**
   * @return The tag name of this element (without namespace)
   */
  @Nonnull
  @Nonempty
  String getTagName ();

  /**
   * Get the HTML ID of this object.<br>
   * Note: we cannot use <code>IHasID&lt;String></code> because the constraint
   * of IHasID is, that the returned ID may not be <code>null</code> whereas
   * here the HTML ID can be <code>null</code>!
   * 
   * @return The HTML ID of this object.
   */
  @Nullable
  String getID ();

  /**
   * Set the HTML ID of this object.
   * 
   * @param sID
   *        The ID to use. Must conform to the HTML rules for an element ID.
   * @return this
   */
  @Nonnull
  THISTYPE setID (String sID);

  @Nonnull
  THISTYPE setTitle (IPredefinedLocaleTextProvider aTextProvider);

  @Nonnull
  THISTYPE setTitle (String sTitle);

  @Nonnull
  THISTYPE addClass (ICSSClassProvider aProvider);

  @Deprecated
  @DevelopersNote ("Use addClass instead!")
  @Nonnull
  THISTYPE addClasses (ICSSClassProvider aProvider);

  /**
   * Add multiple unique CSS classes at once. Each CSS class that is already
   * present, is ignored.
   * 
   * @param aProviders
   *        The CSS classed to add. May neither be <code>null</code> nor empty.
   * @return this
   */
  @Nonnull
  THISTYPE addClasses (ICSSClassProvider... aProviders);

  @Nonnull
  THISTYPE removeClass (@Nonnull ICSSClassProvider aProvider);

  boolean hasClass (@Nonnull ICSSClassProvider aProvider);

  /**
   * Add an element specific style.
   * 
   * @param aValue
   *        The value to be added. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyle (ICSSValue aValue);

  @Nonnull
  THISTYPE removeStyle (@Nonnull ECSSProperty eProperty);

  boolean hasStyle (@Nullable ECSSProperty eProperty);

  boolean hasStyle (@Nullable ICSSValue aValue);

  @Nonnull
  THISTYPE setDirection (EHCTextDirection eDirection);

  @Nonnull
  THISTYPE setLanguage (String sLanguage);

  @Nonnull
  THISTYPE setEventHandler (@Nonnull EJSEvent eJSEvent, @Nullable IJSCodeProvider aJSHandler);

  @Nonnull
  THISTYPE addEventHandler (@Nonnull EJSEvent eJSEvent, @Nullable IJSCodeProvider aJSHandler);

  @Nonnull
  THISTYPE removeAllEventHandler (@Nonnull EJSEvent eJSEvent);

  boolean isUnfocusable ();

  @Nonnull
  THISTYPE setUnfocusable (boolean bUnfocusable);

  /**
   * @return <code>true</code> if this is hidden
   */
  boolean isHidden ();

  /**
   * Set the hidden state of this element
   * 
   * @param bHidden
   *        <code>true</code> if it is hidden, <code>false</code> otherwise
   * @return this
   */
  THISTYPE setHidden (boolean bHidden);

  /**
   * @return The tab index of this object. Negative values are invalid!
   */
  @CheckForSigned
  long getTabIndex ();

  /**
   * Set the tab index of this object. This is a common element in HTML5 only.
   * 
   * @param nTabIndex
   *        The tab-index of this object. Negative values will be ignored!
   * @return this
   */
  @Nonnull
  THISTYPE setTabIndex (@Nonnegative long nTabIndex);

  @Nullable
  String getAccessKey ();

  @Nonnull
  THISTYPE setAccessKey (@Nullable String sAccessKey);

  /**
   * @return the draggable state
   */
  @Nullable
  EHCDraggable getDraggable ();

  /**
   * Set the draggable state of this element
   * 
   * @param eDraggable
   *        value to set
   * @return this
   */
  @Nonnull
  THISTYPE setDraggable (@Nullable EHCDraggable eDraggable);

  /**
   * @return The current state of content editable
   */
  @Nullable
  EHCContentEditable getContentEditable ();

  /**
   * Change the content editable state
   * 
   * @param eContentEditable
   *        New value
   * @return this
   */
  @Nonnull
  THISTYPE setContentEditable (@Nullable EHCContentEditable eContentEditable);

  /**
   * @return The ID of the &lt;menu> element that should be used as the context
   *         menu. May be <code>null</code>.
   */
  @Nullable
  String getContextMenu ();

  /**
   * Set the ID of the &lt;menu> element that should add as a context menu
   * 
   * @param sContextMenu
   *        The ID of the &lt;menu> element
   * @return this
   */
  @Nonnull
  THISTYPE setContextMenu (@Nullable String sContextMenu);

  boolean isSpellCheck ();

  @Nonnull
  THISTYPE setSpellCheck (boolean bSpellCheck);

  /**
   * Set a custom attribute that is serialized as is.
   * 
   * @param sName
   *        The name of the attribute. If it is <code>null</code> nothing
   *        happens
   * @param sValue
   *        The value of the attribute. If it is <code>null</code> nothing
   *        happens
   * @return this
   */
  @Nonnull
  THISTYPE setCustomAttr (@Nullable String sName, @Nullable String sValue);

  @Nonnull
  THISTYPE removeCustomAttr (@Nullable String sName);
}
