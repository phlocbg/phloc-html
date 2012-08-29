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
package com.phloc.html.js.provider;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;

public final class CollectingJSCodeProvider implements IJSCodeProvider
{
  private final List <IJSCodeProvider> m_aList = new ArrayList <IJSCodeProvider> ();

  public CollectingJSCodeProvider ()
  {}

  public CollectingJSCodeProvider (@Nullable final IJSCodeProvider... aProviders)
  {
    if (aProviders != null)
      for (final IJSCodeProvider aProvider : aProviders)
        if (aProvider != null)
          append (aProvider);
  }

  public CollectingJSCodeProvider (@Nullable final Iterable <? extends IJSCodeProvider> aProviders)
  {
    if (aProviders != null)
      for (final IJSCodeProvider aProvider : aProviders)
        if (aProvider != null)
          append (aProvider);
  }

  @Nonnull
  public final CollectingJSCodeProvider append (@Nullable final IJSCodeProvider aProvider)
  {
    if (aProvider != null)
      m_aList.add (aProvider);
    return this;
  }

  public final void reset ()
  {
    m_aList.clear ();
  }

  @Nonnull
  public final String getJSCode ()
  {
    final StringBuilder aSB = new StringBuilder ();
    for (final IJSCodeProvider aJSCodeProvider : m_aList)
      aSB.append (aJSCodeProvider.getJSCode ());
    return aSB.toString ();
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof CollectingJSCodeProvider))
      return false;
    final CollectingJSCodeProvider rhs = (CollectingJSCodeProvider) o;
    return m_aList.equals (rhs.m_aList);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aList).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("list", m_aList).toString ();
  }
}
