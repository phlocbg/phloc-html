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
package com.phloc.html.hc.htmlext;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

@Immutable
public final class CheckBoxState
{
  private final String m_sValue;
  private final boolean m_bChecked;

  public CheckBoxState (@Nullable final String sValue, final boolean bChecked)
  {
    m_sValue = sValue;
    m_bChecked = bChecked;
  }

  @Nullable
  public String getValue ()
  {
    return m_sValue;
  }

  public boolean isChecked ()
  {
    return m_bChecked;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof CheckBoxState))
      return false;
    final CheckBoxState rhs = (CheckBoxState) o;
    return EqualsUtils.equals (m_sValue, rhs.m_sValue) && m_bChecked == rhs.m_bChecked;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sValue).append (m_bChecked).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (null).append ("value", m_sValue).append ("checked", m_bChecked).toString ();
  }
}
