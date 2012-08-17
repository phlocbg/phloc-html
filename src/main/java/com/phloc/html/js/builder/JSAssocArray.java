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

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nonnull;

/**
 * array creation and initialization.
 */
public final class JSAssocArray extends AbstractJSExpressionImpl
{
  private Map <IJSExpression, IJSExpression> m_aExprs;

  JSAssocArray ()
  {}

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final boolean value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final char value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final double value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final float value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final int value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final long value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, final String value)
  {
    return add (key, JSExpr.lit (value));
  }

  @Nonnull
  public JSAssocArray add (@Nonnull final String key, @Nonnull final IJSExpression value)
  {
    return add (JSExpr.lit (key), value);
  }

  /**
   * Add an element to the array initializer
   */
  @Nonnull
  public JSAssocArray add (@Nonnull final IJSExpression key, @Nonnull final IJSExpression value)
  {
    if (key == null)
      throw new NullPointerException ("key");
    if (value == null)
      throw new NullPointerException ("value");
    if (m_aExprs == null)
      m_aExprs = new LinkedHashMap <IJSExpression, IJSExpression> ();
    m_aExprs.put (key, value);
    return this;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ('{');
    if (m_aExprs != null)
    {
      boolean bFirst = true;
      for (final Map.Entry <IJSExpression, IJSExpression> aEntry : m_aExprs.entrySet ())
      {
        if (bFirst)
          bFirst = false;
        else
          f.plain (',');
        f.generatable (aEntry.getKey ()).plain (':').generatable (aEntry.getValue ());
      }
    }
    f.plain ('}');
  }
}
