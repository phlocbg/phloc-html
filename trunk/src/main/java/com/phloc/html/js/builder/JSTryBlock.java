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

/**
 * Try statement with Catch and/or Finally clause
 * 
 * @author philip
 */
public class JSTryBlock implements IJSStatement
{
  private final JSBlock m_aBody = new JSBlock ();
  private JSCatchBlock m_aCatch;
  private JSBlock m_aFinally;

  JSTryBlock ()
  {}

  @Nonnull
  public JSBlock body ()
  {
    return m_aBody;
  }

  @Nonnull
  public JSCatchBlock _catch ()
  {
    if (m_aCatch == null)
      m_aCatch = new JSCatchBlock ();
    return m_aCatch;
  }

  @Nonnull
  public JSCatchBlock _catch (@Nonnull final String name)
  {
    if (m_aCatch == null)
      m_aCatch = new JSCatchBlock (name);
    return m_aCatch;
  }

  @Nonnull
  public JSBlock _finally ()
  {
    if (m_aFinally == null)
      m_aFinally = new JSBlock ();
    return m_aFinally;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    if (m_aCatch == null && m_aFinally == null)
    {
      // no try necessary when there is no catch and no finally
      f.generatable (m_aBody);
    }
    else
    {
      f.plain ("try").generatable (m_aBody);
      if (m_aCatch != null)
        f.generatable (m_aCatch);
      if (m_aFinally != null)
        f.plain ("finally").generatable (m_aFinally);
      f.nl ();
    }
  }
}
