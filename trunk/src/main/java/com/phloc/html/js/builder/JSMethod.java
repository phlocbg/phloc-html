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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * JS method.
 * 
 * @author philip
 */
public class JSMethod extends JSFunction
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (JSMethod.class);

  private final JSDefinedClass m_aClass;

  /**
   * Constructor
   * 
   * @param aClass
   *        Owning class
   * @param type
   *        Return type for the method
   * @param name
   *        Name of this method
   */
  JSMethod (@Nonnull final JSDefinedClass aClass, @Nullable final AbstractJSType type, @Nonnull final String name)
  {
    super (type, name);
    if (aClass == null)
      throw new NullPointerException ("class");
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Illegal method name: " + name);
    if (name.equals (aClass.name ()))
      throw new IllegalArgumentException ("You cannot name a method like the constructor!");
    if (!Character.isLowerCase (name.charAt (0)))
      s_aLogger.warn ("Method names should always start with a lowercase character: " + name);
    m_aClass = aClass;
    body ().newlineAtEnd (false);
  }

  @Nonnull
  public JSDefinedClass parentClass ()
  {
    return m_aClass;
  }

  @Override
  protected void declaration (@Nonnull final JSFormatter f)
  {
    f.plain (name ()).plain (':');
    if (type () != null && f.generateTypeNames ())
      f.plain ("/*").generatable (type ()).plain ("*/");
    f.plain ("function");
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("class", m_aClass.name ()).toString ();
  }
}
