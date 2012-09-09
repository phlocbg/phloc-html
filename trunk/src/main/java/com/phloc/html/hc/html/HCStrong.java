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

import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;strong&gt; element
 * 
 * @author philip
 */
public class HCStrong extends AbstractHCElementWithChildren <HCStrong>
{
  public HCStrong ()
  {
    super (EHTMLElement.STRONG);
  }

  @Deprecated
  public HCStrong (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    this ();
    addChild (aChild);
  }

  @Deprecated
  public HCStrong (@Nullable final String sChild)
  {
    this ();
    addChild (sChild);
  }

  @Deprecated
  public HCStrong (@Nullable final String... aChildren)
  {
    this ();
    addChildren (aChildren);
  }

  @Deprecated
  public HCStrong (@Nullable final IHCNode aChild)
  {
    this ();
    addChild (aChild);
  }

  @Deprecated
  public HCStrong (@Nullable final IHCNode... aChildren)
  {
    this ();
    addChildren (aChildren);
  }

  @Deprecated
  public HCStrong (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    this ();
    addChildren (aChildren);
  }
}
