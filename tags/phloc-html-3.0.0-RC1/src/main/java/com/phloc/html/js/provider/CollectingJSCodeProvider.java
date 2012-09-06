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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.CJS;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

public final class CollectingJSCodeProvider implements IJSCodeProvider
{
  private final StringBuilder m_aSB = new StringBuilder ();

  public CollectingJSCodeProvider ()
  {}

  public CollectingJSCodeProvider (final CharSequence aCS)
  {
    append (aCS);
  }

  public CollectingJSCodeProvider (@Nonnull final IJSCodeProvider... aProviders)
  {
    for (final IJSCodeProvider aProvider : aProviders)
      if (aProvider != null)
        append (aProvider);
  }

  @Nonnull
  public CollectingJSCodeProvider append (final char c)
  {
    m_aSB.append (c);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider append (final long n)
  {
    m_aSB.append (n);
    return this;
  }

  /**
   * @param aCS
   *        The string to append.
   * @return this
   */
  @Nonnull
  public CollectingJSCodeProvider append (@Nullable final CharSequence aCS)
  {
    m_aSB.append (aCS);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider append (@Nullable final CollectingJSCodeProvider aProvider)
  {
    if (aProvider != null)
      append (aProvider.m_aSB);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider append (@Nullable final IJSCodeProvider aProvider)
  {
    if (aProvider != null)
      append (aProvider.getJSCode ());
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider appendSemicolon ()
  {
    // If there is nothing to append - don't append it :)
    if (m_aSB.length () == 0)
      return this;
    return append (CJS.JS_END_OF_STATEMENT);
  }

  /**
   * @param aCS
   *        The string to prepend.
   * @return this
   */
  @Nonnull
  public CollectingJSCodeProvider prepend (@Nullable final CharSequence aCS)
  {
    m_aSB.insert (0, aCS);
    return this;
  }

  @Nonnegative
  public int length ()
  {
    return m_aSB.length ();
  }

  @Nonnull
  public String getJSCode ()
  {
    return m_aSB.toString ();
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof CollectingJSCodeProvider))
      return false;
    final CollectingJSCodeProvider rhs = (CollectingJSCodeProvider) o;
    return m_aSB.equals (rhs.m_aSB);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aSB).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("code", m_aSB).toString ();
  }
}