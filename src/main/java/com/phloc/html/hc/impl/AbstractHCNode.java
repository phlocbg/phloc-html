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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;

/**
 * Default implementation of the {@link IHCNode} interface.
 * 
 * @author philip
 */
public abstract class AbstractHCNode extends AbstractHCBaseNode implements IHCNode
{
  private final List <IHCNode> m_aOutOfBandNodes = new ArrayList <IHCNode> ();

  @Nullable
  public IHCBaseNode getOutOfBandNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    if (m_aOutOfBandNodes.isEmpty ())
      return null;
    return new HCNodeList (false).addChildren (m_aOutOfBandNodes).getAsSimpleNode ();
  }

  public void addOutOfBandNode (final IHCNode aNode)
  {
    m_aOutOfBandNodes.add (aNode);
  }

  @Nonnull
  public IHCNode getAsConditionalCommentNode (@Nonnull @Nonempty final String sCondition)
  {
    return new HCConditionalCommentNode (sCondition, this);
  }
}
