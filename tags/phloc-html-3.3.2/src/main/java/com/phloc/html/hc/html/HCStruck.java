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
 * Represents an HTML &lt;s&gt; element<br>
 * HTML5: has the specific semantic purpose of representing contents that are no
 * longer accurate or no longer relevant.
 * 
 * @author philip
 */
@Deprecated
@DevelopersNote ("Use HCS")
public final class HCStruck extends HCS
{
  public HCStruck ()
  {
    super ();
  }

  public HCStruck (@Nonnull final IPredefinedLocaleTextProvider aChild)
  {
    super (aChild);
  }

  public HCStruck (@Nullable final String sChild)
  {
    super (sChild);
  }

  public HCStruck (@Nullable final String... aChildren)
  {
    super (aChildren);
  }

  public HCStruck (@Nullable final IHCNode aChild)
  {
    super (aChild);
  }

  public HCStruck (@Nullable final IHCNode... aChildren)
  {
    super (aChildren);
  }

  public HCStruck (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    super (aChildren);
  }
}
