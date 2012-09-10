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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.text.IPredefinedLocaleTextProvider;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;H3&gt; element<br>
 * This file is automatically generated from
 * com.phloc.html.tools.MainCreateHCClasses so DO NOT EDIT!
 * 
 * @author philip
 */
public class HCH3 extends AbstractHCElementWithChildren <HCH3>
{
  /**
   * Create a new H3 element
   */
  public HCH3 ()
  {
    super (EHTMLElement.H3);
  }

  @Deprecated
  public HCH3 (@Nullable final IPredefinedLocaleTextProvider aChild)
  {
    this ();
    addChild (aChild);
  }

  @Deprecated
  public HCH3 (@Nullable final String sChild)
  {
    this ();
    addChild (sChild);
  }

  @Deprecated
  public HCH3 (@Nullable final String... aChildren)
  {
    this ();
    addChildren (aChildren);
  }

  @Deprecated
  public HCH3 (@Nullable final IHCNode aChild)
  {
    this ();
    addChild (aChild);
  }

  @Deprecated
  public HCH3 (@Nullable final IHCNode... aChildren)
  {
    this ();
    addChildren (aChildren);
  }

  @Deprecated
  public HCH3 (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    this ();
    addChildren (aChildren);
  }

  /**
   * Create a new H3 element with the passed child text
   * 
   * @param aChild
   *        The child text provider to be appended. May be <code>null</code>
   * @return The created HCH3 element and never <code>null</code>
   */
  @Nonnull
  public static HCH3 create (@Nullable final IPredefinedLocaleTextProvider aChild)
  {
    return new HCH3 ().addChild (aChild);
  }

  /**
   * Create a new H3 element with the passed child text
   * 
   * @param sChild
   *        The child to be appended. May be <code>null</code>
   * @return The created HCH3 element and never <code>null</code>
   */
  @Nonnull
  public static HCH3 create (@Nullable final String sChild)
  {
    return new HCH3 ().addChild (sChild);
  }

  /**
   * Create a new H3 element with the passed child texts
   * 
   * @param aChildren
   *        The child texts to be appended. May be <code>null</code>
   * @return The created HCH3 element and never <code>null</code>
   */
  @Nonnull
  public static HCH3 create (@Nullable final String... aChildren)
  {
    return new HCH3 ().addChildren (aChildren);
  }

  /**
   * Create a new H3 element with the passed child node
   * 
   * @param aChild
   *        The child node to be appended. May be <code>null</code>
   * @return The created HCH3 element and never <code>null</code>
   */
  @Nonnull
  public static HCH3 create (@Nullable final IHCNode aChild)
  {
    return new HCH3 ().addChild (aChild);
  }

  /**
   * Create a new H3 element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCH3 element and never <code>null</code>
   */
  @Nonnull
  public static HCH3 create (@Nullable final IHCNode... aChildren)
  {
    return new HCH3 ().addChildren (aChildren);
  }

  /**
   * Create a new H3 element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCH3 element and never <code>null</code>
   */
  @Nonnull
  public static HCH3 create (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    return new HCH3 ().addChildren (aChildren);
  }
}
