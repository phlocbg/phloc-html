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
package com.phloc.html.js.builder.jquery;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.state.EChange;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.builder.IJSExpression;

/**
 * A list of jQuery selectors that are chained with ' ' (space)
 * 
 * @author Philip Helger
 */
public class JQuerySelectorList implements IJSCodeProvider
{
  private final List <IJQuerySelector> m_aElements = new ArrayList <IJQuerySelector> ();

  public JQuerySelectorList ()
  {}

  public JQuerySelectorList (@Nonnull final IJQuerySelector aSelector)
  {
    addSelector (aSelector);
  }

  public JQuerySelectorList (@Nullable final IJQuerySelector... aSelectors)
  {
    if (aSelectors != null)
      for (final IJQuerySelector aSelector : aSelectors)
        addSelector (aSelector);
  }

  public JQuerySelectorList (@Nullable final Iterable <? extends IJQuerySelector> aSelectors)
  {
    if (aSelectors != null)
      for (final IJQuerySelector aSelector : aSelectors)
        addSelector (aSelector);
  }

  public boolean hasSelectors ()
  {
    return !m_aElements.isEmpty ();
  }

  @Nonnegative
  public int getSelectorCount ()
  {
    return m_aElements.size ();
  }

  @Nonnull
  public JQuerySelectorList addSelector (@Nonnull final IJQuerySelector aSelector)
  {
    if (aSelector == null)
      throw new NullPointerException ("selector");
    m_aElements.add (aSelector);
    return this;
  }

  @Nonnull
  public EChange removeSelector (@Nonnegative final int nIndex)
  {
    return EChange.valueOf (m_aElements.remove (nIndex) != null);
  }

  @Nonnull
  public EChange removeSelector (@Nonnegative final IJQuerySelector aSelector)
  {
    return EChange.valueOf (m_aElements.remove (aSelector));
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IJQuerySelector> getAllSelectors ()
  {
    return ContainerHelper.newList (m_aElements);
  }

  @Nonnull
  public EChange clear ()
  {
    if (m_aElements.isEmpty ())
      return EChange.UNCHANGED;
    m_aElements.clear ();
    return EChange.CHANGED;
  }

  @Nonnull
  public IJSExpression getAsExpression ()
  {
    final int nSize = m_aElements.size ();
    if (nSize == 0)
      throw new IllegalStateException ("Empty jQuery selector is not allowed!");

    if (nSize == 1)
      return m_aElements.get (0).getExpression ();

    // Concatenate with ' '
    IJSExpression ret = m_aElements.get (0).getExpression ();
    for (int i = 1; i < nSize; ++i)
      ret = ret.plus (' ').plus (m_aElements.get (i).getExpression ());
    return ret;
  }

  /**
   * @return <code>$(selectorString)</code>
   */
  @Nonnull
  public JQueryInvocation invoke ()
  {
    return JQuery.jQuery (getAsExpression ());
  }

  @Nonnull
  public String getJSCode ()
  {
    return getAsExpression ().getJSCode ();
  }
}
