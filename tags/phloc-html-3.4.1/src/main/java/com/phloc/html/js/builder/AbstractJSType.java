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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.ToStringGenerator;

/**
 * A representation of a type in JS.
 * 
 * @author philip
 */
public abstract class AbstractJSType implements IJSGeneratable
{
  /**
   * Gets the name of this type.
   * 
   * @return Names like "int", "void", "BigInteger".
   */
  @Nonnull
  @Nonempty
  public abstract String name ();

  @Nonnull
  public JSCast casted (@Nonnull final IJSExpression expr)
  {
    return JSExpr.cast (this, expr);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).toString ();
  }
}