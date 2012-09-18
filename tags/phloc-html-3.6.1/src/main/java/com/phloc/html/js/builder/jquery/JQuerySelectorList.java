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
package com.phloc.html.js.builder.jquery;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.phloc.commons.IHasStringRepresentation;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.state.EChange;

public class JQuerySelectorList implements IHasStringRepresentation
{
  private final List <IJQuerySelector> m_aElements = new ArrayList <IJQuerySelector> ();

  public JQuerySelectorList ()
  {}

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
  public String getAsString ()
  {
    if (m_aElements.isEmpty ())
      throw new IllegalStateException ("Empty jQuery selector is not allowed!");

    final StringBuilder aSB = new StringBuilder ();
    for (final IJQuerySelector aSelector : m_aElements)
    {
      if (aSB.length () > 0)
        aSB.append (' ');
      aSB.append (aSelector.getAsString ());
    }
    return aSB.toString ();
  }
}
