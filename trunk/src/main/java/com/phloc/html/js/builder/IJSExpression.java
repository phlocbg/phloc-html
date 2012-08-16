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
 * A Java expression.
 * <p>
 * Unlike most of CodeModel, JExpressions are built bottom-up ( meaning you
 * start from leaves and then gradually build compliated expressions by
 * combining them.)
 * <p>
 * {@link IJSExpression} defines a series of composer methods, which returns a
 * complicated expression (by often taking other {@link IJSExpression}s as
 * parameters. For example, you can build "5+2" by
 * <tt>JExpr.lit(5).add(JExpr.lit(2))</tt>
 */
public interface IJSExpression extends IJSGenerable
{
  /**
   * Returns "-[this]" from "[this]".
   */
  IJSExpression minus ();

  /**
   * Returns "![this]" from "[this]".
   */
  IJSExpression not ();

  /**
   * Returns "~[this]" from "[this]".
   */
  IJSExpression complement ();

  /**
   * Returns "[this]++" from "[this]".
   */
  IJSExpression incr ();

  /**
   * Returns "[this]--" from "[this]".
   */
  IJSExpression decr ();

  /**
   * Returns "typeof [this]"
   */
  IJSExpression typeof ();

  /**
   * Returns "[this]+[right]"
   */
  IJSExpression plus (IJSExpression right);

  /**
   * Returns "[this]-[right]"
   */
  IJSExpression minus (IJSExpression right);

  /**
   * Returns "[this]*[right]"
   */
  IJSExpression mul (IJSExpression right);

  /**
   * Returns "[this]/[right]"
   */
  IJSExpression div (IJSExpression right);

  /**
   * Returns "[this]%[right]"
   */
  IJSExpression mod (IJSExpression right);

  /**
   * Returns "[this]&lt;&lt;[right]"
   */
  IJSExpression shl (IJSExpression right);

  /**
   * Returns "[this]>>[right]"
   */
  IJSExpression shr (IJSExpression right);

  /**
   * Returns "[this]>>>[right]"
   */
  IJSExpression shrz (IJSExpression right);

  /** Bit-wise AND '&amp;'. */
  IJSExpression band (IJSExpression right);

  /** Bit-wise OR '|'. */
  IJSExpression bor (IJSExpression right);

  /** Logical AND '&amp;&amp;'. */
  IJSExpression cand (IJSExpression right);

  /** Logical OR '||'. */
  IJSExpression cor (IJSExpression right);

  IJSExpression xor (IJSExpression right);

  IJSExpression lt (IJSExpression right);

  IJSExpression lte (IJSExpression right);

  IJSExpression gt (IJSExpression right);

  IJSExpression gte (IJSExpression right);

  IJSExpression eq (IJSExpression right);

  IJSExpression eeq (IJSExpression right);

  IJSExpression ne (IJSExpression right);

  IJSExpression ene (IJSExpression right);

  /**
   * Returns "[this].[method]". Arguments shall be added to the returned
   * {@link JSInvocation} object.
   */
  JSInvocation invoke (JSMethod method);

  /**
   * Returns "[this].[method]". Arguments shall be added to the returned
   * {@link JSInvocation} object.
   */
  JSInvocation invoke (String method);

  JSFieldRef ref (JSVar field);

  JSFieldRef ref (String field);

  JSArrayCompRef component (IJSExpression index);
}
