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
 * Abstract assignment target implementation
 * 
 * @author philip
 */
public abstract class AbstractJSAssignmentTarget extends AbstractJSExpression implements IJSAssignmentTarget
{
  @Nonnull
  public final JSAssignment assign (final boolean v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (final char v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (final double v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (final float v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (final int v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (final long v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final String v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assign (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignPlus (final char v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (final double v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (final float v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (final int v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (final long v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (@Nonnull final String v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignPlus (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignMinus (final double v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (final float v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (final int v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (final long v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignMinus (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignMultiply (final double v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (final float v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (final int v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (final long v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignMultiply (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignDivide (final double v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (final float v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (final int v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (final long v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignDivide (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignModulo (final int v)
  {
    return assignModulo (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignModulo (final long v)
  {
    return assignModulo (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignModulo (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignModulo (this, rhs);
  }
}
