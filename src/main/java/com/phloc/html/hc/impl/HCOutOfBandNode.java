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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.IHCBaseNode;

/**
 * Implementation of a node that is ONLY an out-of-band node!
 * 
 * @author philip
 */
@OutOfBandNode
public final class HCOutOfBandNode extends AbstractHCWrappingNode
{
  private final IHCBaseNode m_aOutOfBandNode;

  public HCOutOfBandNode (@Nonnull final IHCBaseNode aOutOfBandNode)
  {
    if (aOutOfBandNode == null)
      throw new NullPointerException ("outOfBandNode");
    m_aOutOfBandNode = aOutOfBandNode;
  }

  @Nonnull
  public IHCBaseNode getWrappedNode ()
  {
    return m_aOutOfBandNode;
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("outOfBandNode", m_aOutOfBandNode).toString ();
  }
}
