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
package com.phloc.html.hc.html;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCRequestField;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCControl;

/**
 * Represents an HTML &lt;select&gt; element
 * 
 * @author philip
 */
// TODO change hierarchy to http://dev.w3.org/html5/markup/select.html#select
public class HCSelect extends AbstractHCControl <HCSelect>
{
  public static final boolean DEFAULT_MULTIPLE = false;

  private boolean m_bMultiple = DEFAULT_MULTIPLE;
  private int m_nSize = CGlobal.ILLEGAL_UINT;
  private List <HCOption> m_aOptions;
  private Set <String> m_aPreselectedValues;

  public HCSelect ()
  {
    super (EHTMLElement.SELECT);
  }

  public HCSelect (@Nullable final String sName)
  {
    this ();
    setName (sName);
  }

  public HCSelect (@Nullable final String sName, @Nullable final Set <String> aPreselectedValues)
  {
    this (sName);
    m_aPreselectedValues = aPreselectedValues;
  }

  public HCSelect (@Nullable final String sName, @Nullable final List <String> aPreselectedValues)
  {
    this (sName, aPreselectedValues == null ? null : new HashSet <String> (aPreselectedValues));
  }

  public HCSelect (@Nonnull final IHCRequestField aRF)
  {
    this (aRF.getFieldName (), aRF.getRequestValues ());
  }

  @Nonnull
  public final HCSelect setMultiple (final boolean bMultiple)
  {
    m_bMultiple = bMultiple;
    return this;
  }

  @Nonnull
  public final HCSelect setSize (final int nSize)
  {
    m_nSize = nSize;
    return this;
  }

  @Nonnull
  @ReturnsImmutableObject
  public Set <String> getPreselectedValues ()
  {
    return ContainerHelper.makeUnmodifiableNotNull (m_aPreselectedValues);
  }

  public boolean isPreselectedValue (@Nullable final String sValue)
  {
    return m_aPreselectedValues != null && m_aPreselectedValues.contains (sValue);
  }

  /**
   * Callback
   * 
   * @param aOption
   *        The added option. Never <code>null</code>.
   */
  @OverrideOnDemand
  protected void onAddOption (@Nonnull final HCOption aOption)
  {}

  @Nonnull
  public final HCOption addOption (@Nonnull final HCOption aOption)
  {
    if (aOption == null)
      throw new NullPointerException ("option");

    // Ensure list is present
    if (m_aOptions == null)
      m_aOptions = new ArrayList <HCOption> ();

    // Handle preselection (if no manual selection state was defined so far)
    if (!aOption.isSelectionDefined ())
      aOption.setSelected (isPreselectedValue (aOption.getValue ()));

    onAddOption (aOption);
    m_aOptions.add (aOption);
    return aOption;
  }

  @Nonnull
  public final HCOption addOptionAtIndex (@Nonnegative final int nIndex, @Nonnull final HCOption aOption)
  {
    if (aOption == null)
      throw new NullPointerException ("option");

    // Ensure list is present
    if (m_aOptions == null)
      m_aOptions = new ArrayList <HCOption> ();

    // Handle preselection (if no manual selection state was defined so far)
    if (!aOption.isSelectionDefined ())
      aOption.setSelected (isPreselectedValue (aOption.getValue ()));

    onAddOption (aOption);
    m_aOptions.add (nIndex, aOption);
    return aOption;
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sText)
  {
    return addOption (sText, sText);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sText, final boolean bSelected)
  {
    return addOption (sText, sText, bSelected);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue, @Nullable final String sText)
  {
    final HCOption aOption = new HCOption (sValue);
    aOption.addChild (sText);
    return addOption (aOption);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue,
                                   @Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    return addOption (sValue, aTextProvider.getText ());
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue, @Nullable final String sText, final boolean bSelected)
  {
    return addOption (sValue, sText).setSelected (bSelected);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue,
                                   @Nullable final String sText,
                                   @Nullable final String sSelectedValue)
  {
    return addOption (sValue, sText, EqualsUtils.equals (sValue, sSelectedValue));
  }

  @Nonnull
  public final HCOption addOptionAtIndex (final int nIndex, final String sValue, final String sText)
  {
    final HCOption aOption = new HCOption (sValue);
    aOption.addChild (sText);
    return addOptionAtIndex (nIndex, aOption);
  }

  @Nonnull
  public final HCSelect removeAllOptions ()
  {
    m_aOptions = null;
    return this;
  }

  @Nonnull
  public final HCSelect removeOptionAtIndex (@Nonnegative final int nIndex)
  {
    if (m_aOptions != null)
      m_aOptions.remove (nIndex);
    return this;
  }

  /**
   * @return The number of available options.
   */
  @Nonnegative
  public final int getOptionCount ()
  {
    return ContainerHelper.getSize (m_aOptions);
  }

  /**
   * @return A non-<code>null</code> list of all available options.
   */
  @Nonnull
  @ReturnsImmutableObject
  public final List <HCOption> getOptions ()
  {
    return ContainerHelper.makeUnmodifiableNotNull (m_aOptions);
  }

  /**
   * Get the option at the specified index
   * 
   * @param nIndex
   *        The index to retrieve. Should always be &ge; 0.
   * @return <code>null</code> if no option is available for the specified
   *         index.
   */
  @Nullable
  public final HCOption getOptionAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aOptions, nIndex);
  }

  /**
   * @return <code>true</code> if this select has at least one option.
   */
  public final boolean hasOptions ()
  {
    return !ContainerHelper.isEmpty (m_aOptions);
  }

  /**
   * @return A non-<code>null</code> list of all selected options.
   */
  @Nonnull
  @ReturnsMutableCopy
  public final List <HCOption> getSelectedOptions ()
  {
    final List <HCOption> ret = new ArrayList <HCOption> ();
    if (m_aOptions != null)
      for (final HCOption aOption : m_aOptions)
        if (aOption.isSelected ())
          ret.add (aOption);
    return ret;
  }

  /**
   * @return The number of selected options. Always &ge; 0.
   */
  @Nonnegative
  public final int getSelectedOptionCount ()
  {
    int ret = 0;
    if (m_aOptions != null)
      for (final HCOption aOption : m_aOptions)
        if (aOption.isSelected ())
          ret++;
    return ret;
  }

  /**
   * Check if this select has at least one selected option
   * 
   * @return <code>true</code> if at least one option is selected
   */
  public final boolean hasSelectedOption ()
  {
    if (m_aOptions != null)
      for (final HCOption aOption : m_aOptions)
        if (aOption.isSelected ())
          return true;
    return false;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_bMultiple)
      aElement.setAttribute (CHTMLAttributes.MULTIPLE, CHTMLAttributeValues.MULTIPLE);
    if (m_nSize > 1)
      aElement.setAttribute (CHTMLAttributes.SIZE, Integer.toString (m_nSize));

    if (hasOptions ())
    {
      for (final HCOption aOption : m_aOptions)
        aElement.appendChild (aOption.getAsNode (aConversionSettings));
    }
    else
    {
      // Special check, as this is not derived from
      // AbstractHCElementWithChildren
      if (!getElement ().mayBeSelfClosed ())
        aElement.appendText ("");
    }
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("multiple", m_bMultiple)
                            .append ("size", m_nSize)
                            .appendIfNotNull ("options", m_aOptions)
                            .appendIfNotNull ("preselectedValues", m_aPreselectedValues)
                            .toString ();
  }
}
