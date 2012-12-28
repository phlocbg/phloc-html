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

import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * For in Statement
 * 
 * @author philip
 */
public class JSForIn implements IJSStatement
{
  private final JSVar m_aLoopVar;
  private final IJSExpression m_aCollection;
  private JSBlock m_aBody;

  public JSForIn (@Nullable final AbstractJSType aVarType,
                  @Nonnull final String sVarName,
                  @Nonnull final IJSExpression aCollection)
  {
    this (new JSVar (aVarType, sVarName), aCollection);
  }

  public JSForIn (@Nonnull final JSVar aLoopVar, @Nonnull final IJSExpression aCollection)
  {
    if (aCollection == null)
      throw new NullPointerException ("Collection");

    m_aLoopVar = aLoopVar;
    m_aCollection = aCollection;
  }

  /**
   * Returns a reference to the loop variable.
   */
  @Nonnull
  public JSVar var ()
  {
    return m_aLoopVar;
  }

  @Nonnull
  public IJSExpression collection ()
  {
    return m_aCollection;
  }

  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ();
    return m_aBody;
  }

  public void state (final JSFormatter f)
  {
    f.plain ("for(var ").var (m_aLoopVar).plain (" in ").generatable (m_aCollection).plain (')');
    if (m_aBody != null)
      f.generatable (m_aBody).nl ();
    else
      f.plain (';').nl ();
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
    final JSForIn rhs = (JSForIn) o;
    return m_aLoopVar.equals (rhs.m_aLoopVar) &&
           m_aCollection.equals (rhs.m_aCollection) &&
           EqualsUtils.equals (m_aBody, rhs.m_aBody);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aLoopVar).append (m_aCollection).append (m_aBody).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("loopVar", m_aLoopVar)
                                       .append ("collection", m_aCollection)
                                       .append ("body", m_aBody)
                                       .toString ();
  }
}
