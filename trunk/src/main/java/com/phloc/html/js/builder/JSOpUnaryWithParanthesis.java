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

class JSOpUnaryWithParanthesis extends JSOpUnary
{
  JSOpUnaryWithParanthesis (@Nonnull @Nonempty final String op, @Nonnull final IJSExpression e)
  {
    super (op, e);
  }

  JSOpUnaryWithParanthesis (@Nonnull final IJSExpression e, @Nonnull @Nonempty final String op)
  {
    super (e, op);
  }

  @Override
  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain ('(');
    super.generate (f);
    f.plain (')');
  }
}