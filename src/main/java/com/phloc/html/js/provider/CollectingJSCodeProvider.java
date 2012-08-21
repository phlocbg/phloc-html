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
import com.phloc.html.js.marshal.JSMarshaller;
import com.phloc.json.IJSON;

public final class CollectingJSCodeProvider implements IJSCodeProvider
{
  private final StringBuilder m_aSB = new StringBuilder ();

  public CollectingJSCodeProvider ()
  {}

  public CollectingJSCodeProvider (@Nullable final CharSequence... aCSs)
  {
    if (aCSs != null)
      for (final CharSequence aCS : aCSs)
        if (aCS != null)
          append (aCS);
  }

  public CollectingJSCodeProvider (@Nullable final String... aStrings)
  {
    if (aStrings != null)
      for (final String sString : aStrings)
        if (sString != null)
          append (sString);
  }

  public CollectingJSCodeProvider (@Nullable final IJSCodeProvider... aProviders)
  {
    if (aProviders != null)
      for (final IJSCodeProvider aProvider : aProviders)
        if (aProvider != null)
          append (aProvider);
  }

  public CollectingJSCodeProvider (@Nullable final IJSON... aJSONs)
  {
    if (aJSONs != null)
      for (final IJSON aJSON : aJSONs)
        if (aJSON != null)
          append (aJSON);
  }

  @Nonnull
  public final CollectingJSCodeProvider append (final char c)
  {
    m_aSB.append (c);
    return this;
  }

  @Nonnull
  public final CollectingJSCodeProvider append (final long n)
  {
    m_aSB.append (n);
    return this;
  }

  /**
   * @param aCS
   *        The string to append. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  public final CollectingJSCodeProvider append (@Nullable final CharSequence aCS)
  {
    if (aCS != null)
      m_aSB.append (aCS);
    return this;
  }

  /**
   * @param sString
   *        The string to append. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  public final CollectingJSCodeProvider append (@Nullable final String sString)
  {
    if (sString != null)
      m_aSB.append (sString);
    return this;
  }

  @Nonnull
  public final CollectingJSCodeProvider appendEscaped (@Nullable final String sText)
  {
    return append (JSMarshaller.javaScriptEscape (sText));
  }

  @Nonnull
  public final CollectingJSCodeProvider append (@Nullable final CollectingJSCodeProvider aProvider)
  {
    if (aProvider != null)
      append (aProvider.m_aSB);
    return this;
  }

  @Nonnull
  public final CollectingJSCodeProvider append (@Nullable final IJSCodeProvider aProvider)
  {
    if (aProvider instanceof CollectingJSCodeProvider)
      return append ((CollectingJSCodeProvider) aProvider);
    if (aProvider != null)
      append (aProvider.getJSCode ());
    return this;
  }

  @Nonnull
  public final CollectingJSCodeProvider append (@Nullable final IJSON aJSON)
  {
    if (aJSON != null)
      append (aJSON.getJSONString ());
    return this;
  }

  @Nonnull
  public final CollectingJSCodeProvider appendSemicolon ()
  {
    // If there is nothing to append to - don't append it :)
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
  public final CollectingJSCodeProvider prepend (@Nullable final CharSequence aCS)
  {
    m_aSB.insert (0, aCS);
    return this;
  }

  @Nonnegative
  public final int length ()
  {
    return m_aSB.length ();
  }

  @Nonnull
  public final String getJSCode ()
  {
    return m_aSB.toString ();
  }

  public final void reset ()
  {
    m_aSB.setLength (0);
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
