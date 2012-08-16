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

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * Switch statement
 */
public final class JSSwitch implements IJSStatement
{
  /**
   * Test part of switch statement.
   */
  private final IJSExpression m_aTest;

  /**
   * vector of JCases.
   */
  private final List <JSCase> m_aCases = new ArrayList <JSCase> ();

  /**
   * a single default case
   */
  private JSCase m_aDefaultCase;

  /**
   * Construct a While statment
   */
  JSSwitch (@Nonnull final IJSExpression test)
  {
    m_aTest = test;
  }

  @Nonnull
  public IJSExpression test ()
  {
    return m_aTest;
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <JSCase> cases ()
  {
    return ContainerHelper.newList (m_aCases);
  }

  @Nonnull
  public JSCase _case (final IJSExpression label)
  {
    final JSCase c = new JSCase (label);
    m_aCases.add (c);
    return c;
  }

  @Nonnull
  public JSCase _default ()
  {
    // what if (default != null) ???

    // default cases statements don't have a label
    m_aDefaultCase = new JSCase (null, true);
    return m_aDefaultCase;
  }

  public void state (final JSFormatter f)
  {
    if (JSOp.hasTopOp (m_aTest))
    {
      f.plain ("switch ").generatable (m_aTest).plain (" {").nl ();
    }
    else
    {
      f.plain ("switch (").generatable (m_aTest).plain (')').plain (" {").nl ();
    }
    for (final JSCase c : m_aCases)
      f.stmt (c);
    if (m_aDefaultCase != null)
      f.stmt (m_aDefaultCase);
    f.plain ('}').nl ();
  }
}
