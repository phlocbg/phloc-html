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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.annotations.ReturnsMutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.htmlext.HCUtils;

@NotThreadSafe
public abstract class AbstractHCElementWithInternalChildren <THISTYPE extends AbstractHCElementWithInternalChildren <THISTYPE, CHILDTYPE>, CHILDTYPE extends IHCNode> extends AbstractHCElement <THISTYPE> implements IHCHasChildren
{
  private List <CHILDTYPE> m_aChildren;

  protected AbstractHCElementWithInternalChildren (@Nonnull final EHTMLElement aElement)
  {
    super (aElement);
  }

  public final boolean hasChildren ()
  {
    return ContainerHelper.isNotEmpty (m_aChildren);
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
    ContainerHelper.removeElementAtIndex (m_aChildren, nIndex);
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
    return ContainerHelper.getSafe (m_aChildren, nIndex, null);
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
    return HCUtils.recursiveGetFirstChildWithTagName (this, aElements) != null;
  }

  @Nonnull
  public final THISTYPE sortAllChildren (@Nonnull final Comparator <IHCNode> aComparator)
  {
    if (aComparator == null)
      throw new NullPointerException ("comparator");
    if (m_aChildren != null)
      Collections.sort (m_aChildren, aComparator);
    return thisAsT ();
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalApplyCustomization (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                             @Nonnull final IHCNodeWithChildren <?> aParentNode)
  {
    if (hasChildren ())
    {
      // We need to work on a copy of the children!
      for (final IHCNode aChild : getChildren ())
        aChild.applyCustomization (aConversionSettings, aParentNode);
    }
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (hasChildren ())
      for (final IHCNode aChild : m_aChildren)
        aChild.beforeConvertToNode (aConversionSettings);
  }

  /**
   * Helper method that returns the elements in the correct order for emitting.
   * This can e.g. be used for sorting or ordering.
   * 
   * @param aChildren
   *        The children to be emitted. Is a direct reference to the container
   *        where the children are stored. So handle with care!
   * @return The non-<code>null</code> list with all child elements to be
   *         emitted.
   */
  @Nonnull
  @Nonempty
  @OverrideOnDemand
  protected List <? extends IHCNode> getChildrenFormEmitting (@Nonnull @Nonempty final List <CHILDTYPE> aChildren)
  {
    return aChildren;
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (hasChildren ())
      for (final IHCNode aChild : getChildrenFormEmitting (m_aChildren))
        aElement.appendChild (aChild.convertToNode (aConversionSettings));

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

  @Override
  @Nonnull
  public String getPlainText ()
  {
    if (!hasChildren ())
      return "";
    final StringBuilder ret = new StringBuilder ();
    for (final CHILDTYPE aChild : m_aChildren)
    {
      final String sPlainText = aChild.getPlainText ();
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
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("children", m_aChildren).toString ();
  }
}
