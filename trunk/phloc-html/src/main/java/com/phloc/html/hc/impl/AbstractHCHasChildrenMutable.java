/**
 * Copyright (C) 2006-2014 phloc systems
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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.lang.GenericReflection;
import com.phloc.commons.microdom.IMicroContainer;
import com.phloc.commons.microdom.impl.MicroContainer;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.hc.IHCHasChildrenMutable;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * This class is an abstract HC node that represents a list of nodes without
 * creating an HTML element by itself.
 * 
 * @author Philip Helger
 */
@NotThreadSafe
public abstract class AbstractHCHasChildrenMutable <THISTYPE extends AbstractHCHasChildrenMutable <THISTYPE, CHILDTYPE>, CHILDTYPE extends IHCNode> extends AbstractHCNode implements IHCHasChildrenMutable <THISTYPE, CHILDTYPE>
{
  private final List <CHILDTYPE> m_aChildren = new ArrayList <CHILDTYPE> ();

  public AbstractHCHasChildrenMutable ()
  {}

  @Nonnull
  protected final THISTYPE thisAsT ()
  {
    // Avoid the unchecked cast warning in all places
    return GenericReflection.<AbstractHCHasChildrenMutable <THISTYPE, CHILDTYPE>, THISTYPE> uncheckedCast (this);
  }

  public boolean hasChildren ()
  {
    return !m_aChildren.isEmpty ();
  }

  /**
   * Callback
   * 
   * @param nIndex
   *        Index where the child was added. Always &ge; 0.
   * @param aChild
   *        The child that was added
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void afterAddChild (@Nonnegative final int nIndex, @Nonnull final CHILDTYPE aChild)
  {
    aChild.onAdded (nIndex, this);
  }

  @Nonnull
  public THISTYPE addChild (@Nullable final CHILDTYPE aNode)
  {
    if (aNode == this)
      throw new IllegalArgumentException ("Cannot append to self!");

    if (aNode != null)
    {
      final int nAddIndex = m_aChildren.size ();
      m_aChildren.add (aNode);
      afterAddChild (nAddIndex, aNode);
    }
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE addChild (@Nonnegative final int nIndex, @Nullable final CHILDTYPE aChildNode)
  {
    if (aChildNode == this)
      throw new IllegalArgumentException ("Cannot append to self!");

    if (aChildNode != null)
    {
      m_aChildren.add (nIndex, aChildNode);
      afterAddChild (nIndex, aChildNode);
    }
    return thisAsT ();
  }

  /**
   * Just for completeness, to avoid unnecessary array creation!
   */
  @Nonnull
  @Deprecated
  public THISTYPE addChildren (@Nullable final CHILDTYPE aNode)
  {
    return addChild (aNode);
  }

  @Nonnull
  public THISTYPE addChildren (@Nullable final CHILDTYPE... aNodes)
  {
    if (aNodes != null)
      for (final CHILDTYPE aNode : aNodes)
        addChild (aNode);
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE addChildren (@Nullable final Iterable <? extends CHILDTYPE> aNodes)
  {
    if (aNodes != null)
      for (final CHILDTYPE aNode : aNodes)
        addChild (aNode);
    return thisAsT ();
  }

  @Nullable
  public <T extends CHILDTYPE> T addAndReturnChild (@Nullable final T aChild)
  {
    addChild (aChild);
    return aChild;
  }

  @Nullable
  public <T extends CHILDTYPE> T addAndReturnChild (@Nonnegative final int nIndex, @Nullable final T aChild)
  {
    addChild (nIndex, aChild);
    return aChild;
  }

  /**
   * Invoked after an element was removed.
   * 
   * @param aChild
   *        The child that was removed. Never <code>null</code>.
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void afterRemoveChild (@Nonnull final CHILDTYPE aChild)
  {
    aChild.onRemoved (this);
  }

  @Nonnull
  public THISTYPE removeChild (@Nonnegative final int nIndex)
  {
    final CHILDTYPE aRemovedChild = m_aChildren.remove (nIndex);
    if (aRemovedChild != null)
      afterRemoveChild (aRemovedChild);
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE removeChild (@Nullable final CHILDTYPE aNode)
  {
    if (m_aChildren.remove (aNode))
      afterRemoveChild (aNode);
    return thisAsT ();
  }

  @Nonnull
  public THISTYPE removeAllChildren ()
  {
    while (!m_aChildren.isEmpty ())
      removeChild (0);
    return thisAsT ();
  }

  @Nonnegative
  public int getChildCount ()
  {
    return m_aChildren.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <CHILDTYPE> getChildren ()
  {
    return ContainerHelper.newList (m_aChildren);
  }

  @Nullable
  public CHILDTYPE getChildAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aChildren, nIndex);
  }

  @Nullable
  public CHILDTYPE getFirstChild ()
  {
    return ContainerHelper.getFirstElement (m_aChildren);
  }

  @Nullable
  public CHILDTYPE getLastChild ()
  {
    return ContainerHelper.getLastElement (m_aChildren);
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
    if (m_aChildren.isEmpty ())
      return null;

    if (m_aChildren.size () == 1)
      return ContainerHelper.getFirstElement (m_aChildren);

    // Return as-is
    return this;
  }

  @Nonnull
  public THISTYPE sortAllChildren (@Nonnull final Comparator <? super CHILDTYPE> aComparator)
  {
    ValueEnforcer.notNull (aComparator, "Comparator");
    Collections.sort (m_aChildren, aComparator);
    return thisAsT ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public HCNodeList getAllChildrenAsNodeList ()
  {
    return new HCNodeList ().addChildren (m_aChildren);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (hasChildren ())
    {
      // If at least one child is present and can be converted to a node, the
      // whole list can be converted to a node
      for (final CHILDTYPE aChild : m_aChildren)
        if (aChild.canConvertToNode (aConversionSettings))
          return true;
    }
    // No children, or all children cannot be converted -> cannot convert this
    // list
    return false;
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (hasChildren ())
      for (final CHILDTYPE aChild : m_aChildren)
        aChild.beforeConvertToNode (aConversionSettings);
  }

  @Nonnull
  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected IMicroContainer internalConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    final IMicroContainer ret = new MicroContainer ();
    if (hasChildren ())
      for (final CHILDTYPE aNode : m_aChildren)
        ret.appendChild (aNode.convertToNode (aConversionSettings));
    return ret;
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    if (!hasChildren ())
      return "";

    final StringBuilder ret = new StringBuilder ();
    for (final CHILDTYPE aNode : m_aChildren)
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
    return ToStringGenerator.getDerived (super.toString ()).append ("children", m_aChildren).toString ();
  }
}
