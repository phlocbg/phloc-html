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

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.IHCNode;

/**
 * Represents an HTML &lt;b&gt; element<br>
 * HTML5: the specific semantic purpose of representing text “offset from its
 * surrounding content without conveying any extra emphasis or importance, and
 * for which the conventional typographic presentation is bold text”.
 * 
 * @author philip
 */
@Deprecated
@DevelopersNote ("Use HCB instead")
public final class HCBold extends HCB
{
  public HCBold ()
  {
    super ();
  }

  public HCBold (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    super (aChild);
  }

  public HCBold (@Nullable final String sChild)
  {
    super (sChild);
  }

  public HCBold (@Nullable final String... aChildren)
  {
    super (aChildren);
  }

  public HCBold (@Nullable final IHCNode aChild)
  {
    super (aChild);
  }

  public HCBold (@Nullable final IHCNode... aChildren)
  {
    super (aChildren);
  }

  public HCBold (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (aChildren);
  }
}
