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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCRequestField;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCControl;

/**
 * Represents an HTML &lt;textarea&gt; element
 * 
 * @author philip
 */
public class HCTextArea extends AbstractHCControl <HCTextArea>
{
  private String m_sValue;
  private int m_nCols = CGlobal.ILLEGAL_UINT;
  private int m_nRows = CGlobal.ILLEGAL_UINT;

  public HCTextArea (@Nullable final String sName)
  {
    super (EHTMLElement.TEXTAREA);
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

  @Nonnull
  public final HCTextArea setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Nonnull
  public final HCTextArea setCols (final int nCols)
  {
    m_nCols = nCols;
    return this;
  }

  @Nonnull
  public final HCTextArea setRows (final int nRows)
  {
    m_nRows = nRows;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_nCols > 0)
      aElement.setAttribute (CHTMLAttributes.COLS, Integer.toString (m_nCols));
    if (m_nRows > 0)
      aElement.setAttribute (CHTMLAttributes.ROWS, Integer.toString (m_nRows));

    // If no children are present, add an empty text node so that an opening
    // and a closing tag are written separately
    aElement.appendText (getPlainText ());
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return m_sValue != null ? m_sValue : "";
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("value", m_sValue)
                            .append ("cols", m_nCols)
                            .append ("rows", m_nRows)
                            .toString ();
  }
}
