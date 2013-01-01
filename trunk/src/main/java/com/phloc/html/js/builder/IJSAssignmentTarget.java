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

/**
 * Marker interface for code components that can be placed to the left of '=' in
 * an assignment. A left hand value can always be a right hand value, so this
 * interface derives from {@link IJSExpression}.
 * 
 * @author philip
 */
public interface IJSAssignmentTarget extends IJSExpression
{
  @Nonnull
  JSAssignment assign (boolean v);

  @Nonnull
  JSAssignment assign (char v);

  @Nonnull
  JSAssignment assign (double v);

  @Nonnull
  JSAssignment assign (float v);

  @Nonnull
  JSAssignment assign (int v);

  @Nonnull
  JSAssignment assign (long v);

  @Nonnull
  JSAssignment assign (@Nonnull String v);

  @Nonnull
  JSAssignment assign (@Nonnull IJSExpression rhs);

  @Nonnull
  JSAssignment assignPlus (char v);

  @Nonnull
  JSAssignment assignPlus (double v);

  @Nonnull
  JSAssignment assignPlus (float v);

  @Nonnull
  JSAssignment assignPlus (int v);

  @Nonnull
  JSAssignment assignPlus (long v);

  @Nonnull
  JSAssignment assignPlus (@Nonnull String v);

  @Nonnull
  JSAssignment assignPlus (@Nonnull IJSExpression rhs);

  @Nonnull
  JSAssignment assignMinus (double v);

  @Nonnull
  JSAssignment assignMinus (float v);

  @Nonnull
  JSAssignment assignMinus (int v);

  @Nonnull
  JSAssignment assignMinus (long v);

  @Nonnull
  JSAssignment assignMinus (@Nonnull IJSExpression rhs);

  @Nonnull
  JSAssignment assignMultiply (double v);

  @Nonnull
  JSAssignment assignMultiply (float v);

  @Nonnull
  JSAssignment assignMultiply (int v);

  @Nonnull
  JSAssignment assignMultiply (long v);

  @Nonnull
  JSAssignment assignMultiply (@Nonnull IJSExpression rhs);

  @Nonnull
  JSAssignment assignDivide (double v);

  @Nonnull
  JSAssignment assignDivide (float v);

  @Nonnull
  JSAssignment assignDivide (int v);

  @Nonnull
  JSAssignment assignDivide (long v);

  @Nonnull
  JSAssignment assignDivide (@Nonnull IJSExpression rhs);

  @Nonnull
  JSAssignment assignModulo (int v);

  @Nonnull
  JSAssignment assignModulo (long v);

  @Nonnull
  JSAssignment assignModulo (@Nonnull IJSExpression rhs);
}
