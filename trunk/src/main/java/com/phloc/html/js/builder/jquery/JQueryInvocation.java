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
package com.phloc.html.js.builder.jquery;

import javax.annotation.Nonnull;

import com.phloc.html.js.builder.IJSStatement;
import com.phloc.html.js.builder.JSFormatter;
import com.phloc.html.js.builder.JSInvocation;

/**
 * Special invocation semantics for jQuery
 * 
 * @author philip
 */
public class JQueryInvocation implements IJSStatement
{
  private final JSInvocation m_aInvocation;

  public JQueryInvocation (@Nonnull final JSInvocation aInvocation)
  {
    if (aInvocation == null)
      throw new NullPointerException ("invocation");
    m_aInvocation = aInvocation;
  }

  @Nonnull
  public JQueryInvocation disable ()
  {
    return new JQueryInvocation (m_aInvocation.invoke ("disable"));
  }

  @Nonnull
  public JQueryInvocation enable ()
  {
    return new JQueryInvocation (m_aInvocation.invoke ("enable"));
  }

  @Nonnull
  public JQueryInvocation focus ()
  {
    return new JQueryInvocation (m_aInvocation.invoke ("focus"));
  }

  public void state (@Nonnull final JSFormatter f)
  {
    m_aInvocation.state (f);
  }

  @Nonnull
  public String getJSCode ()
  {
    return m_aInvocation.getJSCode ();
  }
}
