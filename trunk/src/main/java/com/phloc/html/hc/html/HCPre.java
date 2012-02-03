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

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.EHTMLElement;
import com.phloc.html.XHTMLConsistencyException;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

public final class HCPre extends AbstractHCElementWithChildren <HCPre>
{
  public HCPre ()
  {
    super (EHTMLElement.PRE);
  }

  public HCPre (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCPre (@Nullable final String sChild)
  {
    super (EHTMLElement.PRE, sChild);
  }

  public HCPre (@Nullable final String... aChildren)
  {
    super (EHTMLElement.PRE, aChildren);
  }

  public HCPre (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.PRE, aChild);
  }

  public HCPre (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.PRE, aChildren);
  }

  public HCPre (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.PRE, aChildren);
  }

  @Override
  protected void applyProperties (HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    if (GlobalDebug.isDebugMode () &&
        recursiveContainsChildWithTagName (EHTMLElement.IMG,
                                           EHTMLElement.OBJECT,
                                           EHTMLElement.BIG,
                                           EHTMLElement.SMALL,
                                           EHTMLElement.SUB,
                                           EHTMLElement.SUP))
      XHTMLConsistencyException.onInconsistency ("PRE elements contains forbidden tag!");

    super.applyProperties (aConversionSettings, aElement);
  }
}
