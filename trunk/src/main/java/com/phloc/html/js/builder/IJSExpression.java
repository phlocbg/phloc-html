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
 * A Java expression.
 * <p>
 * Unlike most of CodeModel, JExpressions are built bottom-up ( meaning you
 * start from leaves and then gradually build complicated expressions by
 * combining them.)
 * <p>
 * {@link IJSExpression} defines a series of composer methods, which returns a
 * complicated expression (by often taking other {@link IJSExpression}s as
 * parameters. For example, you can build "5+2" by
 * <tt>JExpr.lit(5).add(JExpr.lit(2))</tt>
 */
public interface IJSExpression extends IJSGeneratable
{
  /**
   * @return "-[this]" from "[this]".
   */
  @Nonnull
  IJSExpression minus ();

  /**
   * @return "([this])" from "[this]".
   */
  @Nonnull
  IJSExpression inParantheses ();

  /**
   * @return "![this]" from "[this]".
   */
  @Nonnull
  IJSExpression not ();

  /**
   * @return "~[this]" from "[this]".
   */
  @Nonnull
  IJSExpression complement ();

  /**
   * @return "[this]++" from "[this]".
   */
  @Nonnull
  IJSExpression incr ();

  /**
   * @return "[this]--" from "[this]".
   */
  @Nonnull
  IJSExpression decr ();

  /**
   * @return "typeof [this]" from "[this]"
   */
  @Nonnull
  IJSExpression typeof ();

  /**
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (IJSExpression right);

  /**
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (IJSExpression right);

  /**
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (IJSExpression right);

  /**
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (IJSExpression right);

  /**
   * @return "[this]%[right]"
   */
  @Nonnull
  IJSExpression mod (IJSExpression right);

  /**
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (IJSExpression right);

  /**
   * @return "[this]>>[right]"
   */
  @Nonnull
  IJSExpression shr (IJSExpression right);

  /**
   * @return "[this]>>>[right]"
   */
  @Nonnull
  IJSExpression shrz (IJSExpression right);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (IJSExpression right);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (IJSExpression right);

  /** Logical AND '&amp;&amp;'. */
  @Nonnull
  IJSExpression cand (IJSExpression right);

  /** Logical OR '||'. */
  @Nonnull
  IJSExpression cor (IJSExpression right);

  @Nonnull
  IJSExpression xor (IJSExpression right);

  @Nonnull
  IJSExpression lt (IJSExpression right);

  @Nonnull
  IJSExpression lte (IJSExpression right);

  @Nonnull
  IJSExpression gt (IJSExpression right);

  @Nonnull
  IJSExpression gte (IJSExpression right);

  @Nonnull
  IJSExpression eq (IJSExpression right);

  @Nonnull
  IJSExpression eeq (IJSExpression right);

  @Nonnull
  IJSExpression ne (IJSExpression right);

  @Nonnull
  IJSExpression ene (IJSExpression right);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (JSMethod method);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (String method);

  @Nonnull
  JSFieldRef ref (JSVar field);

  @Nonnull
  JSFieldRef ref (String field);

  @Nonnull
  JSArrayCompRef component (IJSExpression index);
}
