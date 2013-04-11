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
package com.phloc.html.js.builder.jquery;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSFunction;

/**
 * Special invocation semantics for jQuery
 * 
 * @author philip
 */
public class JQueryInvocation extends AbstractJQueryInvocation <JQueryInvocation>
{
  public JQueryInvocation (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  public JQueryInvocation (@Nullable final IJSExpression aLhs, @Nonnull @Nonempty final String sMethod)
  {
    super (aLhs, sMethod);
  }

  /**
   * Invoke an arbitrary function on this jQuery object.
   * 
   * @param sMethod
   *        The method to be invoked. May neither be <code>null</code> nor
   *        empty.
   * @return A new jQuery invocation object. Never <code>null</code>.
   */
  @Override
  @Nonnull
  public JQueryInvocation jqinvoke (@Nonnull @Nonempty final String sMethod)
  {
    return new JQueryInvocation (this, sMethod);
  }
}
