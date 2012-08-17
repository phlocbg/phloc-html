/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

/**
 * array component reference.
 */
public abstract class AbstractJSAssignmentTarget extends AbstractJSExpressionImpl implements IJSAssignmentTarget
{
  @Nonnull
  public final JSAssignment assign (@Nonnull final boolean v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final char v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final double v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final float v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final int v)
  {
    return assign (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assign (@Nonnull final long v)
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
  public final JSAssignment assignPlus (@Nonnull final char v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (@Nonnull final double v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (@Nonnull final float v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (@Nonnull final int v)
  {
    return assignPlus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignPlus (@Nonnull final long v)
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
  public final JSAssignment assignMinus (@Nonnull final double v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (@Nonnull final float v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (@Nonnull final int v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (@Nonnull final long v)
  {
    return assignMinus (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMinus (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignMinus (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignMultiply (@Nonnull final double v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (@Nonnull final float v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (@Nonnull final int v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (@Nonnull final long v)
  {
    return assignMultiply (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignMultiply (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignMultiply (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignDivide (@Nonnull final double v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (@Nonnull final float v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (@Nonnull final int v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (@Nonnull final long v)
  {
    return assignDivide (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignDivide (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignDivide (this, rhs);
  }

  @Nonnull
  public final JSAssignment assignModulo (@Nonnull final int v)
  {
    return assignModulo (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignModulo (@Nonnull final long v)
  {
    return assignModulo (JSExpr.lit (v));
  }

  @Nonnull
  public final JSAssignment assignModulo (@Nonnull final IJSExpression rhs)
  {
    return JSExpr.assignModulo (this, rhs);
  }
}
