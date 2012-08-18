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

/**
 * array component reference.
 * 
 * @author philip
 */
final class JSArrayCompRef extends AbstractJSAssignmentTarget
{
  /**
   * JArray expression upon which this component will be accessed.
   */
  private final IJSExpression m_aArray;

  /**
   * Integer expression representing index of the component
   */
  private final IJSExpression m_aIndex;

  /**
   * JArray component reference constructor given an array expression and index.
   * 
   * @param array
   *        JExpression for the array upon which the component will be accessed,
   * @param index
   *        JExpression for index of component to access
   */
  JSArrayCompRef (@Nonnull final IJSExpression array, @Nonnull final IJSExpression index)
  {
    if (array == null)
      throw new NullPointerException ("array");
    if (index == null)
      throw new NullPointerException ("index");
    m_aArray = array;
    m_aIndex = index;
  }

  public void generate (final JSFormatter f)
  {
    f.generatable (m_aArray).plain ('[').generatable (m_aIndex).plain (']');
  }
}
