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

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.annotations.ReturnsMutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.parent.IHasChildrenSorted;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.htmlext.HCUtils;

public abstract class AbstractHCElementWithInternalChildren <THISTYPE extends AbstractHCElementWithInternalChildren <THISTYPE, CHILDTYPE>, CHILDTYPE extends IHCBaseNode> extends AbstractHCElement <THISTYPE> implements IHasChildrenSorted <CHILDTYPE>
{
  private List <CHILDTYPE> m_aChildren;

  protected AbstractHCElementWithInternalChildren (@Nonnull final EHTMLElement aElement)
  {
    super (aElement);
  }

  public final boolean hasChildren ()
  {
    return !ContainerHelper.isEmpty (m_aChildren);
  }

  private void _addChild (@CheckForSigned final int nIndex, @Nullable final CHILDTYPE aChild)
  {
    if (aChild == this)
      throw new IllegalArgumentException ("Cannot append to self!");

    if (aChild != null)
    {
      if (m_aChildren == null)
        m_aChildren = new ArrayList <CHILDTYPE> ();
      if (nIndex < 0)
        m_aChildren.add (aChild);
      else
        m_aChildren.add (nIndex, aChild);
    }
  }

  protected final void addChild (@Nullable final CHILDTYPE aChild)
  {
    _addChild (CGlobal.ILLEGAL_UINT, aChild);
  }

  protected final void addChild (@Nonnegative final int nIndex, @Nullable final CHILDTYPE aChild)
  {
    if (nIndex < 0 || nIndex > getChildCount ())
      throw new IllegalArgumentException ("Illegal index " + nIndex + " passed!");
    _addChild (nIndex, aChild);
  }

  protected final void addChildren (@Nullable final CHILDTYPE... aChildren)
  {
    if (aChildren != null)
      for (final CHILDTYPE aChild : aChildren)
        addChild (aChild);
  }

  protected final void removeChild (@Nullable final CHILDTYPE aChild)
  {
    if (aChild != null && m_aChildren != null)
      m_aChildren.remove (aChild);
  }

  protected final void removeChild (@Nonnegative final int nIndex)
  {
    if (m_aChildren != null && m_aChildren.size () > nIndex)
      m_aChildren.remove (nIndex);
  }

  protected final void removeAllChildren ()
  {
    if (m_aChildren != null)
    {
      m_aChildren.clear ();
      m_aChildren = null;
    }
  }

  @Nullable
  public final CHILDTYPE getChild (final int nIndex)
  {
    if (m_aChildren != null && nIndex >= 0 && nIndex < m_aChildren.size ())
      return m_aChildren.get (nIndex);
    return null;
  }

  @Nonnegative
  public final int getChildCount ()
  {
    return ContainerHelper.getSize (m_aChildren);
  }

  @Nullable
  @ReturnsMutableObject (reason = "speed")
  protected final List <CHILDTYPE> directGetChildren ()
  {
    return m_aChildren;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <CHILDTYPE> getChildren ()
  {
    return ContainerHelper.newList (m_aChildren);
  }

  @Nullable
  public final CHILDTYPE getChildAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aChildren, nIndex);
  }

  @Nullable
  public final CHILDTYPE getFirstChild ()
  {
    return ContainerHelper.getFirstElement (m_aChildren);
  }

  @Nullable
  public final CHILDTYPE getLastChild ()
  {
    return ContainerHelper.getLastElement (m_aChildren);
  }

  protected final boolean recursiveContainsChildWithTagName (@Nonnull @Nonempty final EHTMLElement... aElements)
  {
    return HCUtils.recursiveGetChildWithTagName (this, aElements) != null;
  }

  /**
   * Helper method that returns the elements in the correct order for emitting.
   * This can e.g. be used for sorting or ordering.
   * 
   * @param aChildren
   *        The children to be emitted
   * @return The non-<code>null</code> list with all child elements to be
   *         emitted.
   */
  @Nonnull
  @Nonempty
  @OverrideOnDemand
  protected List <CHILDTYPE> getChildrenFormEmitting (@Nonnull @Nonempty final List <CHILDTYPE> aChildren)
  {
    return aChildren;
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (hasChildren ())
      for (final CHILDTYPE aChild : getChildrenFormEmitting (m_aChildren))
        aElement.appendChild (aChild.getAsNode (aConversionSettings));

    if (!aElement.hasChildren ())
    {
      // If no children are present, add an empty text node so that an opening
      // and a closing tag are written separately
      // Note: just using "hasChildren" is not enough, in case a child is
      // present, that is not rendered!
      if (!getElement ().mayBeSelfClosed ())
        aElement.appendText ("");
    }
  }

  @Nonnull
  public String getPlainText ()
  {
    if (!hasChildren ())
      return "";
    final StringBuilder ret = new StringBuilder ();
    for (final CHILDTYPE aChild : m_aChildren)
      ret.append (aChild.getPlainText ());
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("children", m_aChildren).toString ();
  }
}
