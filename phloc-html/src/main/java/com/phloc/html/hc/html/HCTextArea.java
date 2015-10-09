/**
 * Copyright (C) 2006-2014 phloc systems
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCControl;
import com.phloc.html.request.IHCRequestField;

/**
 * Represents an HTML &lt;textarea&gt; element
 * 
 * @author Philip Helger
 */
public class HCTextArea extends AbstractHCControl <HCTextArea>
{
  private String m_sValue;
  private int m_nCols = CGlobal.ILLEGAL_UINT;
  private int m_nRows = CGlobal.ILLEGAL_UINT;
  private String m_sPlaceholder;

  public HCTextArea ()
  {
    super (EHTMLElement.TEXTAREA);
  }

  public HCTextArea (@Nullable final String sName)
  {
    this ();
    setName (sName);
  }

  public HCTextArea (@Nullable final String sName, @Nullable final String sValue)
  {
    this (sName);
    setValue (sValue);
  }

  public HCTextArea (@Nonnull final IHCRequestField aRF)
  {
    this (aRF.getFieldName (), aRF.getRequestValue ());
  }

  @Nullable
  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final HCTextArea setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  public final int getCols ()
  {
    return m_nCols;
  }

  @Nonnull
  public final HCTextArea setCols (final int nCols)
  {
    m_nCols = nCols;
    return this;
  }

  public final int getRows ()
  {
    return m_nRows;
  }

  @Nonnull
  public final HCTextArea setRows (final int nRows)
  {
    m_nRows = nRows;
    return this;
  }

  @Nullable
  public final String getPlaceholder ()
  {
    return m_sPlaceholder;
  }

  @Nonnull
  public final HCTextArea setPlaceholder (@Nullable final String sPlaceholder)
  {
    m_sPlaceholder = sPlaceholder;
    return thisAsT ();
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_nCols > 0)
      aElement.setAttribute (CHTMLAttributes.COLS, m_nCols);
    if (m_nRows > 0)
      aElement.setAttribute (CHTMLAttributes.ROWS, m_nRows);
    if (StringHelper.hasText (m_sPlaceholder))
      aElement.setAttribute (CHTMLAttributes.PLACEHOLDER, m_sPlaceholder);

    // If no children are present, add an empty text node so that an opening
    // and a closing tag are written separately
    aElement.appendText (getPlainText ());
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return StringHelper.getNotNull (m_sValue);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("value", m_sValue)
                            .append ("cols", m_nCols)
                            .append ("rows", m_nRows)
                            .appendIfNotNull ("placeholder", m_sPlaceholder)
                            .toString ();
  }
}
