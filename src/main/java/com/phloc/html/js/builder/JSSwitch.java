/**
 * Copyright (C) 2006-2013 phloc systems
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
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Switch statement
 * 
 * @author philip
 */
public class JSSwitch implements IJSStatement
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
  public JSSwitch (@Nonnull final IJSExpression aTest)
  {
    if (aTest == null)
      throw new NullPointerException ("test");
    m_aTest = aTest;
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
    if (JSOp.hasOperator (m_aTest))
      f.plain ("switch ").generatable (m_aTest).plain ('{').nl ();
    else
      f.plain ("switch (").generatable (m_aTest).plain ("){").nl ();
    for (final JSCase aCase : m_aCases)
      f.stmt (aCase);
    if (m_aDefaultCase != null)
      f.stmt (m_aDefaultCase);
    f.plain ('}').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSSwitch rhs = (JSSwitch) o;
    return m_aTest.equals (rhs.m_aTest) &&
           m_aCases.equals (rhs.m_aCases) &&
           EqualsUtils.equals (m_aDefaultCase, rhs.m_aDefaultCase);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aTest).append (m_aCases).append (m_aDefaultCase).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("test", m_aTest)
                                       .append ("cases", m_aCases)
                                       .append ("defaultCase", m_aDefaultCase)
                                       .toString ();
  }
}
