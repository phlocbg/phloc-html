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
package com.phloc.html.hc;

import java.util.Comparator;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.hc.impl.HCNodeList;

/**
 * Special node interface for objects containing other objects
 * 
 * @author Philip Helger
 * @param <THISTYPE>
 *        The type of the contained child objects.
 */
public interface IHCNodeWithChildren <THISTYPE extends IHCNodeWithChildren <THISTYPE>> extends IHCHasChildren
{
  /**
   * @param aTextProvider
   *        Child text to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nullable IPredefinedLocaleTextProvider aTextProvider);

  /**
   * @param sText
   *        Child text to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nullable String sText);

  /**
   * @param aNodeBuilder
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nullable IHCNodeBuilder aNodeBuilder);

  /**
   * @param aNode
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nullable IHCNode aNode);

  /**
   * @param nIndex
   *        The index to where the element should be inserted.
   * @param aTextProvider
   *        Child text to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nonnegative int nIndex, @Nullable IPredefinedLocaleTextProvider aTextProvider);

  /**
   * @param nIndex
   *        The index to where the element should be inserted.
   * @param sText
   *        Child text to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nonnegative int nIndex, @Nullable String sText);

  /**
   * @param nIndex
   *        The index to where the element should be inserted.
   * @param aNodeBuilder
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nonnegative int nIndex, @Nullable IHCNodeBuilder aNodeBuilder);

  /**
   * @param nIndex
   *        The index to where the element should be inserted.
   * @param aNode
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChild (@Nonnegative int nIndex, @Nullable IHCNode aNode);

  /**
   * Use {@link #addChild(IPredefinedLocaleTextProvider)} instead
   * 
   * @param aChild
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  @Deprecated
  THISTYPE addChildren (@Nullable IPredefinedLocaleTextProvider aChild);

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChildren (@Nullable IPredefinedLocaleTextProvider... aChildren);

  /**
   * Use {@link #addChild(String)} instead
   * 
   * @param sChild
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  @Deprecated
  THISTYPE addChildren (@Nullable String sChild);

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChildren (@Nullable String... aChildren);

  /**
   * Use {@link #addChild(IHCNodeBuilder)} instead.
   * 
   * @param aChild
   *        The child to add. May be <code>null</code>.
   * @return this
   */
  @Deprecated
  @DevelopersNote ("Use addChild instead")
  THISTYPE addChildren (@Nullable IHCNodeBuilder aChild);

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChildren (@Nullable IHCNodeBuilder... aChildren);

  /**
   * Use {@link #addChild(IHCNode)} instead.
   * 
   * @param aChild
   *        The child to add. May be <code>null</code>.
   * @return this
   */
  @Deprecated
  @DevelopersNote ("Use addChild instead")
  THISTYPE addChildren (@Nullable IHCNode aChild);

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChildren (@Nullable IHCNode... aChildren);

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addChildren (@Nullable Iterable <? extends IHCNode> aChildren);

  /**
   * @param aChild
   *        Child to add. May be <code>null</code>.
   * @param <V>
   *        The type to add. Needs to be a IHCNode or a sub class.
   * @return the added child
   */
  @Nullable
  <V extends IHCNode> V addAndReturnChild (@Nullable V aChild);

  /**
   * @param nIndex
   *        The index where the element should be added. Always &ge; 0.
   * @param aChild
   *        Child to add. May be <code>null</code>.
   * @param <V>
   *        The type to add. Needs to be a IHCNode or a sub class.
   * @return the added child
   */
  @Nullable
  <V extends IHCNode> V addAndReturnChild (@Nonnegative int nIndex, @Nullable V aChild);

  /**
   * Remove the child at the specified index.
   * 
   * @param nIndex
   *        The index to use. Must be &ge; 0.
   * @return this
   */
  @Nonnull
  THISTYPE removeChild (@Nonnegative int nIndex);

  /**
   * Remove the passed direct child object.
   * 
   * @param aNode
   *        The node to be removed. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE removeChild (@Nullable IHCNode aNode);

  /**
   * Remove all children of this object.
   * 
   * @return this
   */
  @Nonnull
  THISTYPE removeAllChildren ();

  /**
   * Sort all children with the passed comparator
   * 
   * @param aComparator
   *        The comparator to be used. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE sortAllChildren (@Nonnull Comparator <IHCNode> aComparator);

  /**
   * @return A new node list with all contained children. Never
   *         <code>null</code> but maybe empty.
   */
  @Nonnull
  HCNodeList getAllChildrenAsNodeList ();
}
