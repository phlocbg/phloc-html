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
package com.phloc.html.hc.html5;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

@SinceHTML5
public final class HCRP extends AbstractHCElementWithChildren <HCRP>
{
  public HCRP ()
  {
    super (EHTMLElement.RP);
  }

  public HCRP (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCRP (@Nullable final String sChild)
  {
    super (EHTMLElement.RP, sChild);
  }

  public HCRP (@Nullable final String... aChildren)
  {
    super (EHTMLElement.RP, aChildren);
  }

  public HCRP (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.RP, aChild);
  }

  public HCRP (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.RP, aChildren);
  }

  public HCRP (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.RP, aChildren);
  }
}
