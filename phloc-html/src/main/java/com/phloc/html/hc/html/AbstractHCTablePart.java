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
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElementWithInternalChildren;

/**
 * This is the base class for thead, tbody and tfoot
 * 
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCTablePart <THISTYPE extends AbstractHCTablePart <THISTYPE>> extends AbstractHCElementWithInternalChildren <THISTYPE, HCRow>
{
  private final boolean m_bHeaderOrFooter;

  public AbstractHCTablePart (@Nonnull final EHTMLElement eHTMLElement, final boolean bHeaderOrFooter)
  {
    super (eHTMLElement);
    m_bHeaderOrFooter = bHeaderOrFooter;
  }

  public final boolean isHeaderOrFooter ()
  {
    return m_bHeaderOrFooter;
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Avoid creating an empty part
    return hasChildren () || hasID () || hasAnyClass () || hasAnyStyle ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("headerOrFooter", m_bHeaderOrFooter).toString ();
  }
}