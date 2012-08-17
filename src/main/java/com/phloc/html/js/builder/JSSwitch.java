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
   * List of cases.
   */
  private final List <JSCase> m_aCases = new ArrayList <JSCase> ();

  /**
   * a single default case
   */
  private JSCase m_aDefaultCase;

  /**
   * Construct a switch statement
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
  public JSCase _case (@Nonnull final IJSExpression label)
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

  public void state (@Nonnull final JSFormatter f)
  {
    if (JSOp.hasTopOp (m_aTest))
      f.plain ("switch ").generatable (m_aTest).plain ('{').nl ();
    else
      f.plain ("switch (").generatable (m_aTest).plain ("){").nl ();
    for (final JSCase aCase : m_aCases)
      f.stmt (aCase);
    if (m_aDefaultCase != null)
      f.stmt (m_aDefaultCase);
    f.plain ('}').nl ();
  }
}
