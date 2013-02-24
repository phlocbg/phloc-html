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
package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * String literal.
 * 
 * @author philip
 */
public class JSStringLiteral extends AbstractJSExpression
{
  private final String m_sStr;

  public JSStringLiteral (@Nonnull final String sStr)
  {
    if (sStr == null)
      throw new NullPointerException ("string");
    // May be empty
    m_sStr = sStr;
  }

  /**
   * @return The contained string.
   */
  @Nonnull
  public String getContainedString ()
  {
    return m_sStr;
  }

  @Nonnull
  @Nonempty
  public static String getAsString (@Nonnull final String sStr)
  {
    return '\'' + JSMarshaller.javaScriptEscape (sStr) + '\'';
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (getAsString (m_sStr));
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSStringLiteral rhs = (JSStringLiteral) o;
    return m_sStr.equals (rhs.m_sStr);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_sStr).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("string", m_sStr).toString ();
  }
}
