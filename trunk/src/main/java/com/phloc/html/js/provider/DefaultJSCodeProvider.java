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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;

@Immutable
public final class DefaultJSCodeProvider implements IJSCodeProvider
{
  private static final IJSCodeProvider EMPTY_JSCODE = new DefaultJSCodeProvider ();
  private final String m_sJSCode;

  private DefaultJSCodeProvider ()
  {
    m_sJSCode = "";
  }

  private DefaultJSCodeProvider (@Nonnull final String sJSCode)
  {
    if (sJSCode == null)
      throw new NullPointerException ("JSCode");
    m_sJSCode = sJSCode;
  }

  @Nonnull
  public String getJSCode ()
  {
    return m_sJSCode;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof DefaultJSCodeProvider))
      return false;
    final DefaultJSCodeProvider rhs = (DefaultJSCodeProvider) o;
    return m_sJSCode.equals (rhs.m_sJSCode);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sJSCode).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("code", m_sJSCode).toString ();
  }

  @Nonnull
  public static IJSCodeProvider create (@Nullable final String sJSCode)
  {
    return StringHelper.hasNoText (sJSCode) ? EMPTY_JSCODE : new DefaultJSCodeProvider (sJSCode);
  }
}
