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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.commons.microdom.impl.MicroContainer;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.conversion.IHCConversionSettings;

/**
 * This class is an abstract HC node that represents a list of nodes without
 * creating an HTML element by itself.
 * 
 * @author philip
 */
public class HCNodeList extends AbstractHCNode implements IHCNodeWithChildren <HCNodeList>
{
  private final List <IHCBaseNode> m_aNodes = new ArrayList <IHCBaseNode> ();

  public HCNodeList ()
  {}

  public HCNodeList (@Nullable final IHCBaseNode aNode)
  {
    addChild (aNode);
  }

  public HCNodeList (@Nullable final IHCBaseNode... aNodes)
  {
    addChildren (aNodes);
  }

  public HCNodeList (@Nullable final Iterable <? extends IHCBaseNode> aNodes)
  {
    addChildren (aNodes);
  }

  public boolean hasChildren ()
  {
    return !m_aNodes.isEmpty ();
  }

  @Nonnull
  public HCNodeList addChild (@Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    return addChild (aTextProvider.getText ());
  }

  @Nonnull
  public HCNodeList addChild (@Nullable final String sText)
  {
    return addChild (new HCTextNode (sText));
  }

  @Nonnull
  public HCNodeList addChild (@Nullable final IHCBaseNode aNode)
  {
    if (aNode == this)
      throw new IllegalArgumentException ("Cannot append to self!");
    if (aNode != null)
    {
      if (aNode instanceof HCNodeList)
      {
        // Directly add all contained nodes of the node list, to avoid building
        // a hierarchy of node lists
        for (final IHCBaseNode aContainedNode : ((HCNodeList) aNode).m_aNodes)
          m_aNodes.add (aContainedNode);
      }
      else
        m_aNodes.add (aNode);
    }
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nonnegative final int nIndex, @Nullable final IHCBaseNode aChildNode)
  {
    if (aChildNode == this)
      throw new IllegalArgumentException ("Cannot append to self!");
    if (aChildNode != null)
    {
      if (aChildNode instanceof HCNodeList)
      {
        // The child node is itself a list -> inline the content
        int i = nIndex;
        for (final IHCBaseNode aContainedNode : ((HCNodeList) aChildNode).m_aNodes)
        {
          m_aNodes.add (i, aContainedNode);
          ++i;
        }
      }
      else
        m_aNodes.add (nIndex, aChildNode);
    }
    return this;
  }

  /**
   * Just for completeness, to avoid unnecessary array creation!
   */
  @Nonnull
  @Deprecated
  public HCNodeList addChildren (@Nullable final IHCBaseNode aNode)
  {
    return addChild (aNode);
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final IHCBaseNode... aNodes)
  {
    if (aNodes != null)
      for (final IHCBaseNode aNode : aNodes)
        addChild (aNode);
    return this;
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final Iterable <? extends IHCBaseNode> aNodes)
  {
    if (aNodes != null)
      for (final IHCBaseNode aNode : aNodes)
        addChild (aNode);
    return this;
  }

  @Deprecated
  @Nonnull
  public HCNodeList addChildren (@Nullable final String sChild)
  {
    return addChild (sChild);
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final String... aChildren)
  {
    if (aChildren != null)
      for (final String sChild : aChildren)
        addChild (new HCTextNode (sChild));
    return this;
  }

  @Nullable
  public <T extends IHCBaseNode> T addAndReturnChild (@Nullable final T aChild)
  {
    addChild (aChild);
    return aChild;
  }

  @Nullable
  public <T extends IHCBaseNode> T addAndReturnChild (@Nonnegative final int nIndex, @Nullable final T aChild)
  {
    addChild (nIndex, aChild);
    return aChild;
  }

  @Nonnull
  public HCNodeList removeChild (@Nonnegative final int nIndex)
  {
    m_aNodes.remove (nIndex);
    return this;
  }

  @Nonnull
  public HCNodeList removeChild (@Nullable final IHCBaseNode aNode)
  {
    m_aNodes.remove (aNode);
    return this;
  }

  @Nonnull
  public HCNodeList removeAllChildren ()
  {
    m_aNodes.clear ();
    return this;
  }

  @Nonnegative
  public int getChildCount ()
  {
    return m_aNodes.size ();
  }

  @Nonnull
  @ReturnsImmutableObject
  public List <IHCBaseNode> getChildren ()
  {
    return ContainerHelper.makeUnmodifiable (m_aNodes);
  }

  @Nullable
  public IHCBaseNode getChildAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aNodes, nIndex);
  }

  @Nullable
  public IHCBaseNode getFirstChild ()
  {
    return ContainerHelper.getFirstElement (m_aNodes);
  }

  @Nullable
  public IHCBaseNode getLastChild ()
  {
    return ContainerHelper.getLastElement (m_aNodes);
  }

  /**
   * Try to simplify this nodelist as much as possible.
   * 
   * @return the most simple representation of this list. If the list is empty,
   *         <code>null</code> is returned. If exactly one element is contained,
   *         this element will be returned. If more than one element is
   *         contained no simplification can be performed.
   */
  @Nullable
  public IHCBaseNode getAsSimpleNode ()
  {
    if (m_aNodes.isEmpty ())
      return null;
    if (m_aNodes.size () == 1)
      return ContainerHelper.getFirstElement (m_aNodes);
    return this;
  }

  @Nonnull
  public IMicroContainer getAsNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final IMicroContainer ret = new MicroContainer ();
    for (final IHCBaseNode aNode : m_aNodes)
      ret.appendChild (aNode.getAsNode (aConversionSettings));
    return ret;
  }

  @Nonnull
  public String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    for (final IHCBaseNode aNode : m_aNodes)
      ret.append (aNode.getPlainText ());
    return ret.toString ();
  }

  @Override
  @Nullable
  public IHCBaseNode getOutOfBandNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final HCNodeList aCont = new HCNodeList ();
    for (final IHCBaseNode aNode : m_aNodes)
      if (aNode instanceof IHCNode)
        aCont.addChild (((IHCNode) aNode).getOutOfBandNode (aConversionSettings));
    return aCont.getAsSimpleNode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("nodes", m_aNodes).toString ();
  }
}
