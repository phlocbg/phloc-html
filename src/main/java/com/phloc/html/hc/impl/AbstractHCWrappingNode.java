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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroNode;
import com.phloc.html.hc.IHCWrappingNode;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Abstract implementation of {@link IHCWrappingNode}
 * 
 * @author philip
 */
public abstract class AbstractHCWrappingNode extends AbstractHCNode implements IHCWrappingNode
{
  @Override
  @Nonnull
  public String getPlainText ()
  {
    return getWrappedNode ().getPlainText ();
  }

  @Override
  @Nullable
  protected IMicroNode internalGetAsNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return getWrappedNode ().getAsNode (aConversionSettings);
  }
}
