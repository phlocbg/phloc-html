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

/**
 * Provides default implementations for {@link IJSExpression}.
 */
public abstract class AbstractJSExpressionImpl implements IJSExpression
{
  //
  //
  // from JOp
  //
  //
  public final IJSExpression minus ()
  {
    return JSOp.minus (this);
  }

  /**
   * Logical not <tt>'!x'</tt>.
   */
  public final IJSExpression not ()
  {
    return JSOp.not (this);
  }

  public final IJSExpression complement ()
  {
    return JSOp.complement (this);
  }

  public final IJSExpression incr ()
  {
    return JSOp.incr (this);
  }

  public final IJSExpression decr ()
  {
    return JSOp.decr (this);
  }

  public final IJSExpression plus (final IJSExpression right)
  {
    return JSOp.plus (this, right);
  }

  public final IJSExpression minus (final IJSExpression right)
  {
    return JSOp.minus (this, right);
  }

  public final IJSExpression mul (final IJSExpression right)
  {
    return JSOp.mul (this, right);
  }

  public final IJSExpression div (final IJSExpression right)
  {
    return JSOp.div (this, right);
  }

  public final IJSExpression mod (final IJSExpression right)
  {
    return JSOp.mod (this, right);
  }

  public final IJSExpression shl (final IJSExpression right)
  {
    return JSOp.shl (this, right);
  }

  public final IJSExpression shr (final IJSExpression right)
  {
    return JSOp.shr (this, right);
  }

  public final IJSExpression shrz (final IJSExpression right)
  {
    return JSOp.shrz (this, right);
  }

  public final IJSExpression band (final IJSExpression right)
  {
    return JSOp.band (this, right);
  }

  public final IJSExpression bor (final IJSExpression right)
  {
    return JSOp.bor (this, right);
  }

  public final IJSExpression cand (final IJSExpression right)
  {
    return JSOp.cand (this, right);
  }

  public final IJSExpression cor (final IJSExpression right)
  {
    return JSOp.cor (this, right);
  }

  public final IJSExpression xor (final IJSExpression right)
  {
    return JSOp.xor (this, right);
  }

  public final IJSExpression lt (final IJSExpression right)
  {
    return JSOp.lt (this, right);
  }

  public final IJSExpression lte (final IJSExpression right)
  {
    return JSOp.lte (this, right);
  }

  public final IJSExpression gt (final IJSExpression right)
  {
    return JSOp.gt (this, right);
  }

  public final IJSExpression gte (final IJSExpression right)
  {
    return JSOp.gte (this, right);
  }

  public final IJSExpression eq (final IJSExpression right)
  {
    return JSOp.eq (this, right);
  }

  public final IJSExpression eeq (final IJSExpression right)
  {
    return JSOp.eeq (this, right);
  }

  public final IJSExpression ne (final IJSExpression right)
  {
    return JSOp.ne (this, right);
  }

  public final IJSExpression ene (final IJSExpression right)
  {
    return JSOp.ene (this, right);
  }

  public final IJSExpression typeof ()
  {
    return JSOp.typeof (this);
  }

  //
  //
  // from JExpr
  //
  //
  public final JSInvocation invoke (final JSMethod method)
  {
    return JSExpr.invoke (this, method);
  }

  public final JSInvocation invoke (final String method)
  {
    return JSExpr.invoke (this, method);
  }

  public final JSFieldRef ref (final JSVar field)
  {
    return JSExpr.ref (this, field);
  }

  public final JSFieldRef ref (final String field)
  {
    return JSExpr.ref (this, field);
  }

  public final JSArrayCompRef component (final IJSExpression index)
  {
    return JSExpr.component (this, index);
  }
}
