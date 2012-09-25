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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.string.ToStringGenerator;

/**
 * If statement, with optional else clause
 * 
 * @author philip
 */
public class JSConditional implements IJSStatement
{
  /**
   * JExpression to test to determine branching
   */
  private final IJSExpression m_aTest;

  /**
   * JBlock of statements for "then" clause
   */
  private final JSBlock m_aThen = new JSBlock ();

  /**
   * JBlock of statements for optional "else" clause
   */
  private JSBlock m_aElse;

  /**
   * Constructor
   * 
   * @param test
   *        Expression which will determine branching
   */
  public JSConditional (@Nonnull final IJSExpression test)
  {
    if (test == null)
      throw new NullPointerException ("test");
    m_aTest = test;
  }

  /**
   * Return the block to be executed by the "then" branch
   * 
   * @return Then block
   */
  @Nonnull
  public JSBlock _then ()
  {
    return m_aThen;
  }

  /**
   * Create a block to be executed by "else" branch
   * 
   * @return Newly generated else block
   */
  @Nonnull
  public JSBlock _else ()
  {
    if (m_aElse == null)
      m_aElse = new JSBlock ();
    return m_aElse;
  }

  /**
   * Creates <tt>... else if(...) ...</tt> code.
   */
  @Nonnull
  public JSConditional _elseif (@Nonnull final IJSExpression aBoolExp)
  {
    return _else ()._if (aBoolExp);
  }

  public void state (final JSFormatter f)
  {
    if (m_aTest == JSExpr.TRUE)
    {
      m_aThen.generateBody (f);
      return;
    }
    if (m_aTest == JSExpr.FALSE && m_aElse != null)
    {
      m_aElse.generateBody (f);
      return;
    }

    if (JSOp.hasOperator (m_aTest))
      f.plain ("if").generatable (m_aTest);
    else
      f.plain ("if(").generatable (m_aTest).plain (')');
    f.generatable (m_aThen);
    if (m_aElse != null)
      f.plain ("else").generatable (m_aElse);
    f.nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("test", m_aTest)
                                       .append ("then", m_aThen)
                                       .appendIfNotNull ("else", m_aElse)
                                       .toString ();
  }
}
