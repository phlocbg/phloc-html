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
import javax.annotation.Nullable;

/**
 * Case statement
 */
public final class JSCase implements IJSStatement
{
  /**
   * label part of the case statement
   */
  private final IJSExpression m_aLabel;

  /**
   * JBlock of statements which makes up body of this While statement
   */
  private JSBlock m_aBody;

  /**
   * is this a regular case statement or a default case statement?
   */
  private boolean m_bIsDefaultCase = false;

  /**
   * Construct a case statement
   */
  JSCase (@Nullable final IJSExpression label)
  {
    this (label, false);
  }

  /**
   * Construct a case statement. If isDefaultCase is true, then label should be
   * null since default cases don't have a label.
   */
  JSCase (@Nullable final IJSExpression label, final boolean isDefaultCase)
  {
    m_aLabel = label;
    m_bIsDefaultCase = isDefaultCase;
  }

  @Nullable
  public IJSExpression label ()
  {
    return m_aLabel;
  }

  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock (false, true);
    return m_aBody;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    f.indent ();
    if (!m_bIsDefaultCase)
      f.plain ("case ").generatable (m_aLabel).plain (':').nl ();
    else
      f.plain ("default:").nl ();
    if (m_aBody != null)
      f.stmt (m_aBody);
    f.outdent ();
  }
}