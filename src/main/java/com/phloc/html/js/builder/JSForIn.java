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

/**
 * ForIn Statement
 * 
 * @author philip
 */
public final class JSForIn implements IJSStatement
{
  private final JSVar m_aLoopVar;
  private final IJSExpression m_aCollection;
  private JSBlock m_aBody; // lazily created

  JSForIn (@Nullable final AbstractJSType vartype,
           @Nonnull final String variable,
           @Nonnull final IJSExpression collection)
  {
    m_aCollection = collection;
    m_aLoopVar = new JSVar (vartype, variable, null);
  }

  /**
   * Returns a reference to the loop variable.
   */
  @Nonnull
  public JSVar var ()
  {
    return m_aLoopVar;
  }

  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ();
    return m_aBody;
  }

  public void state (final JSFormatter f)
  {
    f.plain ("for (var ").decl (m_aLoopVar).plain (" in ").generatable (m_aCollection).plain (')');
    if (m_aBody != null)
      f.generatable (m_aBody).nl ();
    else
      f.plain (';').nl ();
  }
}
