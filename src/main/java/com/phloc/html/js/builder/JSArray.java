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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * array creation and initialization.
 */
public final class JSArray extends AbstractJSExpressionImpl
{
  private final AbstractJSType m_aType;
  private final IJSExpression m_aSize;
  private List <IJSExpression> m_aExprs;

  JSArray (@Nonnull final AbstractJSType type, @Nullable final IJSExpression size)
  {
    m_aType = type;
    m_aSize = size;
  }

  /**
   * Add an element to the array initializer
   */
  @Nonnull
  public JSArray add (@Nonnull final IJSExpression e)
  {
    if (m_aExprs == null)
      m_aExprs = new ArrayList <IJSExpression> ();
    m_aExprs.add (e);
    return this;
  }

  public void generate (final JSFormatter f)
  {
    // generally we produce new T[x], but when T is an array type (T=T'[])
    // then new T'[][x] is wrong. It has to be new T'[x][].
    int arrayCount = 0;
    AbstractJSType t = m_aType;
    while (t.isArray ())
    {
      t = t.elementType ();
      arrayCount++;
    }

    f.plain ("new").generable (t).plain ('[');
    if (m_aSize != null)
      f.generable (m_aSize);
    f.plain (']');

    for (int i = 0; i < arrayCount; i++)
      f.plain ("[]");

    if ((m_aSize == null) || (m_aExprs != null))
      f.plain ('{');
    if (m_aExprs != null)
      f.generable (m_aExprs);
    else
      f.plain (' ');
    if ((m_aSize == null) || (m_aExprs != null))
      f.plain ('}');
  }
}
