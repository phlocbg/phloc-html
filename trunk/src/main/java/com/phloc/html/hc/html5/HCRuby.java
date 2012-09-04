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
public class HCRuby extends AbstractHCElementWithChildren <HCRuby>
{
  public HCRuby ()
  {
    super (EHTMLElement.RUBY);
  }

  public HCRuby (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this (aChild.getText ());
  }

  public HCRuby (@Nullable final String sChild)
  {
    super (EHTMLElement.RUBY, sChild);
  }

  public HCRuby (@Nullable final String... aChildren)
  {
    super (EHTMLElement.RUBY, aChildren);
  }

  public HCRuby (@Nullable final IHCNode aChild)
  {
    super (EHTMLElement.RUBY, aChild);
  }

  public HCRuby (@Nullable final IHCNode... aChildren)
  {
    super (EHTMLElement.RUBY, aChildren);
  }

  public HCRuby (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (EHTMLElement.RUBY, aChildren);
  }
}
