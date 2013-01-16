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
package com.phloc.html.hc.html;

import javax.annotation.Nonnull;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.DeprecatedInHTML5;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;frameset&gt; element
 * 
 * @author philip
 */
@DeprecatedInHTML5
public class HCFrameset extends AbstractHCElementWithChildren <HCFrameset>
{
  private int m_nCols = CGlobal.ILLEGAL_UINT;
  private int m_nRows = CGlobal.ILLEGAL_UINT;

  public HCFrameset ()
  {
    super (EHTMLElement.FRAMESET);
  }

  public int getCols ()
  {
    return m_nCols;
  }

  @Nonnull
  public HCFrameset setCols (final int nCols)
  {
    m_nCols = nCols;
    return this;
  }

  public int getRows ()
  {
    return m_nRows;
  }

  @Nonnull
  public HCFrameset setRows (final int nRows)
  {
    m_nRows = nRows;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_nCols > 0)
      aElement.setAttribute (CHTMLAttributes.COLS, m_nCols);
    if (m_nRows > 0)
      aElement.setAttribute (CHTMLAttributes.ROWS, m_nRows);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("cols", m_nCols)
                            .append ("rows", m_nRows)
                            .toString ();
  }
}
