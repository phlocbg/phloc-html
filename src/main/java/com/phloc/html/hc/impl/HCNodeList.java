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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.commons.microdom.impl.MicroContainer;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeBuilder;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * This class is an abstract HC node that represents a list of nodes without
 * creating an HTML element by itself.
 * 
 * @author philip
 */
public class HCNodeList extends AbstractHCNode implements IHCNodeWithChildren <HCNodeList>
{
  private final List <IHCNode> m_aNodes = new ArrayList <IHCNode> ();

  public HCNodeList ()
  {}

  public boolean hasChildren ()
  {
    return !m_aNodes.isEmpty ();
  }

  @Nonnull
  public HCNodeList addChild (@Nullable final IPredefinedLocaleTextProvider aTextProvider)
  {
    if (aTextProvider != null)
      addChild (new HCTextNode (aTextProvider));
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nullable final String sText)
  {
    // Empty text is OK!
    if (sText != null)
      addChild (new HCTextNode (sText));
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nullable final IHCNodeBuilder aNodeBuilder)
  {
    if (aNodeBuilder != null)
      addChild (aNodeBuilder.build ());
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nullable final IHCNode aNode)
  {
    if (aNode != null)
    {
      if (aNode == this)
        throw new IllegalArgumentException ("Cannot append to self!");

      if (aNode instanceof HCNodeList)
      {
        // Directly add all contained nodes of the node list, to avoid building
        // a hierarchy of node lists
        for (final IHCNode aContainedNode : ((HCNodeList) aNode).m_aNodes)
          m_aNodes.add (aContainedNode);
      }
      else
        m_aNodes.add (aNode);
    }
    return this;
  }

  @Nonnull
  public final HCNodeList addChild (@Nonnegative final int nIndex,
                                    @Nullable final IPredefinedLocaleTextProvider aTextProvider)
  {
    if (aTextProvider != null)
      return addChild (nIndex, aTextProvider.getText ());
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nonnegative final int nIndex, @Nullable final String sText)
  {
    // Empty text is OK!
    if (sText != null)
      addChild (nIndex, new HCTextNode (sText));
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nonnegative final int nIndex, @Nullable final IHCNodeBuilder aNodeBuilder)
  {
    if (aNodeBuilder != null)
      addChild (nIndex, aNodeBuilder.build ());
    return this;
  }

  @Nonnull
  public HCNodeList addChild (@Nonnegative final int nIndex, @Nullable final IHCNode aChildNode)
  {
    if (aChildNode == this)
      throw new IllegalArgumentException ("Cannot append to self!");
    if (aChildNode != null)
    {
      if (aChildNode instanceof HCNodeList)
      {
        // The child node is itself a list -> inline the content
        int i = nIndex;
        for (final IHCNode aContainedNode : ((HCNodeList) aChildNode).m_aNodes)
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

  @Deprecated
  @Nonnull
  public HCNodeList addChildren (@Nullable final IPredefinedLocaleTextProvider aChild)
  {
    return addChild (aChild);
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final IPredefinedLocaleTextProvider... aChildren)
  {
    if (aChildren != null)
      for (final IPredefinedLocaleTextProvider aChild : aChildren)
        addChild (aChild);
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
        addChild (sChild);
    return this;
  }

  @Deprecated
  @Nonnull
  public HCNodeList addChildren (@Nullable final IHCNodeBuilder aChild)
  {
    return addChild (aChild);
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final IHCNodeBuilder... aChildren)
  {
    if (aChildren != null)
      for (final IHCNodeBuilder aChild : aChildren)
        addChild (aChild);
    return this;
  }

  /**
   * Just for completeness, to avoid unnecessary array creation!
   */
  @Nonnull
  @Deprecated
  public HCNodeList addChildren (@Nullable final IHCNode aNode)
  {
    return addChild (aNode);
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final IHCNode... aNodes)
  {
    if (aNodes != null)
      for (final IHCNode aNode : aNodes)
        addChild (aNode);
    return this;
  }

  @Nonnull
  public HCNodeList addChildren (@Nullable final Iterable <? extends IHCNode> aNodes)
  {
    if (aNodes != null)
      for (final IHCNode aNode : aNodes)
        addChild (aNode);
    return this;
  }

  @Nullable
  public <T extends IHCNode> T addAndReturnChild (@Nullable final T aChild)
  {
    addChild (aChild);
    return aChild;
  }

  @Nullable
  public <T extends IHCNode> T addAndReturnChild (@Nonnegative final int nIndex, @Nullable final T aChild)
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
  public HCNodeList removeChild (@Nullable final IHCNode aNode)
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
  @ReturnsMutableCopy
  public List <IHCNode> getChildren ()
  {
    return ContainerHelper.newList (m_aNodes);
  }

  @Nullable
  public IHCNode getChildAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aNodes, nIndex);
  }

  @Nullable
  public IHCNode getFirstChild ()
  {
    return ContainerHelper.getFirstElement (m_aNodes);
  }

  @Nullable
  public IHCNode getLastChild ()
  {
    return ContainerHelper.getLastElement (m_aNodes);
  }

  /**
   * Try to simplify this node list as much as possible.
   * 
   * @return the most simple representation of this list. If the list is empty,
   *         <code>null</code> is returned. If exactly one element is contained,
   *         this element will be returned. If more than one element is
   *         contained no simplification can be performed.
   */
  @Nullable
  public IHCNode getAsSimpleNode ()
  {
    if (m_aNodes.isEmpty ())
      return null;
    if (m_aNodes.size () == 1)
      return ContainerHelper.getFirstElement (m_aNodes);
    return this;
  }

  @Override
  @Nonnull
  protected IMicroContainer internalConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    final IMicroContainer ret = new MicroContainer ();
    for (final IHCNode aNode : m_aNodes)
      ret.appendChild (aNode.convertToNode (aConversionSettings));
    return ret;
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    for (final IHCNode aNode : m_aNodes)
    {
      final String sPlainText = aNode.getPlainText ();
      if (StringHelper.hasText (sPlainText))
      {
        if (ret.length () > 0)
          ret.append (' ');
        ret.append (sPlainText);
      }
    }
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("nodes", m_aNodes).toString ();
  }

  @Nonnull
  public static HCNodeList create (@Nullable final IPredefinedLocaleTextProvider aChild)
  {
    return new HCNodeList ().addChild (aChild);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final IPredefinedLocaleTextProvider... aChildren)
  {
    return new HCNodeList ().addChildren (aChildren);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final String sChild)
  {
    return new HCNodeList ().addChild (sChild);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final String... aChildren)
  {
    return new HCNodeList ().addChildren (aChildren);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final IHCNodeBuilder aChild)
  {
    return new HCNodeList ().addChild (aChild);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final IHCNodeBuilder... aChildren)
  {
    return new HCNodeList ().addChildren (aChildren);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final IHCNode aChild)
  {
    return new HCNodeList ().addChild (aChild);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final IHCNode... aChildren)
  {
    return new HCNodeList ().addChildren (aChildren);
  }

  @Nonnull
  public static HCNodeList create (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    return new HCNodeList ().addChildren (aChildren);
  }
}
