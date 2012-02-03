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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.parent.IHasChildrenSorted;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.hc.impl.HCNodeList;

public class HCDefinitionList extends AbstractHCElement <HCDefinitionList> implements
                                                                          IHasChildrenSorted <AbstractHCDefinitionItem>
{
  private final List <AbstractHCDefinitionItem> m_aItems = new ArrayList <AbstractHCDefinitionItem> ();

  protected HCDefinitionList (@Nonnull final EHTMLElement aElement)
  {
    super (aElement);
  }

  public final boolean hasChildren ()
  {
    return !m_aItems.isEmpty ();
  }

  @Nonnegative
  public final int getChildCount ()
  {
    return m_aItems.size ();
  }

  @Nonnull
  @ReturnsImmutableObject
  public final List <? extends AbstractHCDefinitionItem> getChildren ()
  {
    return ContainerHelper.makeUnmodifiable (m_aItems);
  }

  @Nullable
  public final AbstractHCDefinitionItem getChildAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aItems, nIndex);
  }

  public final boolean hasItems ()
  {
    return !m_aItems.isEmpty ();
  }

  @Nonnull
  public final HCDefinitionList addItem (@Nullable final AbstractHCDefinitionItem aItem)
  {
    if (aItem != null)
      m_aItems.add (aItem);
    return this;
  }

  @Override
  protected void applyProperties (@Nonnull final HCConversionSettings aConversionSettings, final IMicroElement aElement)
  {
    super.applyProperties (aConversionSettings, aElement);

    for (final AbstractHCDefinitionItem aItem : m_aItems)
      aElement.appendChild (aItem.getAsNode (aConversionSettings));
  }

  @Nonnull
  public final String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    for (final AbstractHCDefinitionItem aChild : m_aItems)
      ret.append (aChild.getPlainText ());
    return ret.toString ();
  }

  @Override
  @Nullable
  public IHCBaseNode getOutOfBandNode ()
  {
    final HCNodeList aCont = new HCNodeList ();
    for (final AbstractHCDefinitionItem aItem : m_aItems)
      aCont.addChild (aItem.getOutOfBandNode ());
    return aCont.getAsSimpleNode ();
  }
}
