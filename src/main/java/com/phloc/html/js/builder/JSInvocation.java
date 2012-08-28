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

import com.phloc.commons.annotations.Nonempty;

/**
 * Object invocation
 * 
 * @author philip
 */
public class JSInvocation extends AbstractJSInvocation <JSInvocation>
{
  /**
   * Invoke a function
   * 
   * @param aFunction
   */
  protected JSInvocation (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  /**
   * Invoke a function
   * 
   * @param sFunctionName
   */
  public JSInvocation (@Nonnull final String sFunctionName)
  {
    super (sFunctionName);
  }

  /**
   * Invoke an anonymous function
   * 
   * @param aAnonymousFunction
   *        The function to be invoked
   */
  protected JSInvocation (@Nonnull final JSAnonymousFunction aAnonymousFunction)
  {
    super (aAnonymousFunction);
  }

  /**
   * Invokes a method on an object.
   * 
   * @param object
   *        JExpression for the object upon which the named method will be
   *        invoked, or null if none
   * @param name
   *        Name of method to invoke
   */
  protected JSInvocation (@Nullable final IJSExpression object, @Nonnull @Nonempty final String name)
  {
    super (object, name);
  }

  protected JSInvocation (@Nullable final IJSExpression object, @Nonnull final JSMethod method)
  {
    super (object, method);
  }

  /**
   * Invokes a static method on a class.
   */
  protected JSInvocation (@Nullable final AbstractJSClass type, @Nonnull @Nonempty final String name)
  {
    super (type, name);
  }

  protected JSInvocation (@Nullable final AbstractJSClass type, @Nonnull final JSMethod method)
  {
    super (type, method);
  }

  /**
   * Invokes a constructor of an object (i.e., creates a new object.)
   * 
   * @param aType
   *        Type of the object to be created. May not be <code>null</code>.
   */
  protected JSInvocation (@Nonnull final AbstractJSType aType)
  {
    super (aType);
  }
}
