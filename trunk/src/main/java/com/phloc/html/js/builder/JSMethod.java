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
package com.phloc.html.js.builder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.hash.HashCodeGenerator;
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
   * @param aType
   *        Return type for the method
   * @param sName
   *        Name of this method
   */
  public JSMethod (@Nonnull final JSDefinedClass aClass,
                   @Nullable final AbstractJSType aType,
                   @Nonnull final String sName)
  {
    super (aType, sName);
    if (aClass == null)
      throw new NullPointerException ("class");
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("The name '" + sName + "' is not a legal JS identifier!");
    if (sName.equals (aClass.name ()))
      throw new IllegalArgumentException ("You cannot name a method like the constructor!");
    if (!Character.isLowerCase (sName.charAt (0)))
      s_aLogger.warn ("Method names should always start with a lowercase character: " + sName);
    m_aClass = aClass;
    body ().newlineAtEnd (false);
  }

  @Nonnull
  public JSDefinedClass parentClass ()
  {
    return m_aClass;
  }

  @Nonnull
  public JSAnonymousFunction getAsAnonymousFunction ()
  {
    // No name required for anonymous function
    return new JSAnonymousFunction (type (), params (), body ());
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSMethod rhs = (JSMethod) o;
    return m_aClass.name ().equals (rhs.m_aClass.name ());
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aClass.name ()).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("class", m_aClass.name ()).toString ();
  }
}
