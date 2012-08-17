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
 * Catch block for a try/catch/finally statement
 */
public class JSCatchBlock implements IJSGeneratable
{
  private JSVar m_aVar;
  private final JSBlock m_aBody = new JSBlock ();

  JSCatchBlock ()
  {}

  JSCatchBlock (@Nonnull final String name)
  {
    m_aVar = new JSVar (null, name, null);
  }

  @Nullable
  public JSVar param ()
  {
    return m_aVar;
  }

  @Nonnull
  public JSVar param (@Nonnull final String name)
  {
    if (m_aVar != null)
      throw new IllegalStateException ();
    m_aVar = new JSVar (null, name, null);
    return m_aVar;
  }

  @Nonnull
  public JSBlock body ()
  {
    return m_aBody;
  }

  public void generate (final JSFormatter f)
  {
    if (m_aVar == null)
      m_aVar = new JSVar (null, "e", null);
    f.plain ("catch (").var (m_aVar).plain (')').generatable (m_aBody);
  }
}
