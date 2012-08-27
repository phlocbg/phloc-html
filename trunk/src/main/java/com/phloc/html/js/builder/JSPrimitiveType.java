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
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Contains the JS built-in primitive types
 * 
 * @author philip
 */
public class JSPrimitiveType extends AbstractJSType
{
  public static final JSPrimitiveType ARGUMENTS = new JSPrimitiveType ("Arguments");
  public static final JSPrimitiveType ARRAY = new JSPrimitiveType ("Array");
  public static final JSPrimitiveType BOOLEAN = new JSPrimitiveType ("Boolean");
  public static final JSPrimitiveType DATE = new JSPrimitiveType ("Date");
  public static final JSPrimitiveType ERROR = new JSPrimitiveType ("Error");
  public static final JSPrimitiveType FUNCTION = new JSPrimitiveType ("Function");
  public static final JSPrimitiveType JSON = new JSPrimitiveType ("JSON");
  public static final JSTypeMath MATH = new JSTypeMath ();
  public static final JSTypeNumber NUMBER = new JSTypeNumber ();
  public static final JSPrimitiveType OBJECT = new JSPrimitiveType ("Object");
  public static final JSPrimitiveType REGEXP = new JSPrimitiveType ("RegExp");
  public static final JSPrimitiveType STRING = new JSPrimitiveType ("String");

  private final String m_sName;
  private final JSFieldRef m_aGlobal;

  JSPrimitiveType (@Nonnull @Nonempty final String sName)
  {
    if (StringHelper.hasNoText (sName))
      throw new IllegalArgumentException ("name");
    m_sName = sName;
    m_aGlobal = JSExpr.ref (sName);
  }

  @Override
  @Nonnull
  @Nonempty
  public final String name ()
  {
    return m_sName;
  }

  @Nonnull
  public final JSFieldRef global ()
  {
    return m_aGlobal;
  }

  /**
   * @return The type to be used in "typeof" expressions. A string literal with
   *         the name in it. For {@link #NUMBER} this returns
   *         <code>"Number"</code>
   */
  @Nonnull
  public final JSStringLiteral typeName ()
  {
    return JSExpr.lit (m_sName);
  }

  /**
   * @return A "new type" invocation object
   */
  @Nonnull
  public final JSInvocation _new ()
  {
    return JSExpr._new (this);
  }

  public final void generate (@Nonnull final JSFormatter f)
  {
    f.plain (m_sName);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("name", m_sName).toString ();
  }
}