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
import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElementWithChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;

public abstract class AbstractHCElementWithChildren <THISTYPE extends AbstractHCElementWithChildren <THISTYPE>> extends
                                                                                                                AbstractHCElement <THISTYPE> implements
                                                                                                                                            IHCElementWithChildren <THISTYPE>
{
  private List <IHCBaseNode> m_aChildren;

  protected AbstractHCElementWithChildren (@Nonnull final EHTMLElement aElement)
  {
    super (aElement);
  }

  protected AbstractHCElementWithChildren (@Nonnull final EHTMLElement aElement, @Nullable final String sChild)
  {
    this (aElement);
    addChild (sChild);
  }

  protected AbstractHCElementWithChildren (@Nonnull final EHTMLElement aElement, @Nullable final String... aChildren)
  {
    this (aElement);
    addChildren (aChildren);
  }

  protected AbstractHCElementWithChildren (@Nonnull final EHTMLElement aElement, @Nullable final IHCBaseNode aChild)
  {
    this (aElement);
    addChild (aChild);
  }

  protected AbstractHCElementWithChildren (@Nonnull final EHTMLElement aElement,
                                           @Nullable final IHCBaseNode... aChildren)
  {
    this (aElement);
    addChildren (aChildren);
  }

  protected AbstractHCElementWithChildren (@Nonnull final EHTMLElement aElement,
                                           final Iterable <? extends IHCBaseNode> aChildren)
  {
    this (aElement);
    addChildren (aChildren);
  }

  public final boolean hasChildren ()
  {
    return !ContainerHelper.isEmpty (m_aChildren);
  }

  /**
   * Callback
   * 
   * @param aChild
   *        The child that was added
   */
  @OverrideOnDemand
  protected void afterAddChild (@Nonnull final IHCBaseNode aChild)
  {}

  @Nonnull
  private THISTYPE _addChild (@CheckForSigned final int nIndex, @Nullable final IHCBaseNode aChild)
  {
    if (aChild == this)
      throw new IllegalArgumentException ("Cannot append to self!");

    if (aChild != null)
    {
      if (m_aChildren == null)
        m_aChildren = new ArrayList <IHCBaseNode> ();
      if (nIndex < 0)
        m_aChildren.add (aChild);
      else
        m_aChildren.add (nIndex, aChild);
      afterAddChild (aChild);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addChild (@Nullable final IHCBaseNode aChild)
  {
    return _addChild (CGlobal.ILLEGAL_UINT, aChild);
  }

  @Nonnull
  public final THISTYPE addChild (@Nonnegative final int nIndex, @Nullable final IHCBaseNode aChild)
  {
    if (nIndex < 0 || nIndex > getChildCount ())
      throw new IllegalArgumentException ("Illegal index " + nIndex + " passed!");
    return _addChild (nIndex, aChild);
  }

  @Nonnull
  public final THISTYPE addChild (@Nonnull final IPredefinedLocaleTextProvider aTextProvider)
  {
    return addChild (aTextProvider.getText ());
  }

  @Nonnull
  public final THISTYPE addChild (@Nullable final String sText)
  {
    // Empty text is OK!!!
    if (sText != null)
      addChild (new HCTextNode (sText));
    return thisAsT ();
  }

  @Deprecated
  @DevelopersNote ("Use addChild instead!")
  @Nonnull
  public final THISTYPE addChildren (@Nullable final IHCBaseNode aChild)
  {
    return addChild (aChild);
  }

  @Nonnull
  public final THISTYPE addChildren (@Nullable final IHCBaseNode... aChildren)
  {
    if (aChildren != null)
      for (final IHCBaseNode aChild : aChildren)
        addChild (aChild);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addChildren (@Nullable final Iterable <? extends IHCBaseNode> aChildren)
  {
    if (aChildren != null)
      for (final IHCBaseNode aChild : aChildren)
        addChild (aChild);
    return thisAsT ();
  }

  @Nonnull
  @DevelopersNote ("Use addChild instead!")
  @Deprecated
  public final THISTYPE addChildren (@Nullable final String sChild)
  {
    return addChild (sChild);
  }

  @Nonnull
  public final THISTYPE addChildren (@Nullable final String... aChildren)
  {
    if (aChildren != null)
      for (final String aChild : aChildren)
        addChild (aChild);
    return thisAsT ();
  }

  @Nullable
  @CheckReturnValue
  public final <V extends IHCBaseNode> V addAndReturnChild (@Nullable final V aChild)
  {
    addChild (aChild);
    return aChild;
  }

  @Nullable
  @CheckReturnValue
  public final <V extends IHCBaseNode> V addAndReturnChild (@Nonnegative final int nIndex, @Nullable final V aChild)
  {
    addChild (nIndex, aChild);
    return aChild;
  }

  @Nonnull
  public final THISTYPE removeChild (@Nullable final IHCBaseNode aChild)
  {
    if (aChild != null && m_aChildren != null)
      m_aChildren.remove (aChild);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeChild (@Nonnegative final int nIndex)
  {
    if (m_aChildren != null && m_aChildren.size () > nIndex)
      m_aChildren.remove (nIndex);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllChildren ()
  {
    if (m_aChildren != null)
      m_aChildren.clear ();
    return thisAsT ();
  }

  @Nullable
  public final IHCBaseNode getChild (final int nIndex)
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
  @ReturnsMutableCopy
  public final List <IHCBaseNode> getChildren ()
  {
    return ContainerHelper.newList (m_aChildren);
  }

  @Nullable
  public final IHCBaseNode getChildAtIndex (@Nonnegative final int nIndex)
  {
    return ContainerHelper.getSafe (m_aChildren, nIndex);
  }

  @Nullable
  public final IHCBaseNode getFirstChild ()
  {
    return ContainerHelper.getFirstElement (m_aChildren);
  }

  @Nullable
  public final IHCBaseNode getLastChild ()
  {
    return ContainerHelper.getLastElement (m_aChildren);
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (hasChildren ())
      for (final IHCBaseNode aChild : m_aChildren)
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
    for (final IHCBaseNode aChild : m_aChildren)
      ret.append (aChild.getPlainText ());
    return ret.toString ();
  }

  @Override
  @Nullable
  public IHCBaseNode getOutOfBandNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final HCNodeList aCont = new HCNodeList ();

    // Of this
    aCont.addChild (super.getOutOfBandNode (aConversionSettings));

    // Of all children
    if (hasChildren ())
      for (final IHCBaseNode aChild : m_aChildren)
        if (aChild instanceof IHCNode)
          aCont.addChild (((IHCNode) aChild).getOutOfBandNode (aConversionSettings));
    return aCont.getAsSimpleNode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("children", m_aChildren).toString ();
  }
}
