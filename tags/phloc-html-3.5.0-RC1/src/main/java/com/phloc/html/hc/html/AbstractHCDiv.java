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
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;div&gt; element with open semantics.
 * 
 * @author philip
 */
public abstract class AbstractHCDiv <THISTYPE extends AbstractHCDiv <THISTYPE>> extends
                                                                                AbstractHCElementWithChildren <THISTYPE>
{
  private String m_sName;

  public AbstractHCDiv ()
  {
    super (EHTMLElement.DIV);
  }

  public AbstractHCDiv (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public AbstractHCDiv (@Nullable final String sChild)
  {
    super (EHTMLElement.DIV, sChild);
  }

  public AbstractHCDiv (@Nullable final String... aChildren)
  {
    super (EHTMLElement.DIV, aChildren);
  }

  public AbstractHCDiv (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.DIV, aChild);
  }

  public AbstractHCDiv (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.DIV, aChildren);
  }

  public AbstractHCDiv (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.DIV, aChildren);
  }

  @Nullable
  public final String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final THISTYPE setName (@Nullable final String sName)
  {
    m_sName = sName;
    return thisAsT ();
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("name", m_sName).toString ();
  }
}
