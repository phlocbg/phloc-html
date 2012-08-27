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
package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

import com.phloc.commons.string.ToStringGenerator;

/**
 * A cast operation.
 * 
 * @author philip
 */
final class JSCast extends AbstractJSExpression
{
  /**
   * JType to which the expression is to be cast.
   */
  private final AbstractJSType m_aType;

  /**
   * JExpression to be cast.
   */
  private final IJSExpression m_aObject;

  /**
   * JCast constructor
   * 
   * @param type
   *        JType to which the expression is cast
   * @param object
   *        JExpression for the object upon which the cast is applied
   */
  JSCast (@Nonnull final AbstractJSType type, @Nonnull final IJSExpression object)
  {
    if (type == null)
      throw new NullPointerException ("type");
    if (object == null)
      throw new NullPointerException ("object");
    m_aType = type;
    m_aObject = object;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ("((").generatable (m_aType).plain (')').generatable (m_aObject).plain (')');
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("type", m_aType).append ("object", m_aObject).toString ();
  }
}
