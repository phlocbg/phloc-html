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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * An anonymous function (a function without a name)
 * 
 * @author philip
 */
public class JSAnonymousFunction extends AbstractJSExpression
{
  /**
   * Return type for this function
   */
  private AbstractJSType m_aType;

  /**
   * List of parameters for this function's declaration
   */
  private final List <JSVar> m_aParams = new ArrayList <JSVar> ();

  /**
   * JBlock of statements that makes up the body this function
   */
  private JSBlock m_aBody;

  public JSAnonymousFunction ()
  {
    this (null);
  }

  /**
   * constructor
   * 
   * @param type
   *        Type to which the expression is cast
   */
  public JSAnonymousFunction (@Nullable final AbstractJSType type)
  {
    m_aType = type;
  }

  JSAnonymousFunction (@Nullable final AbstractJSType type,
                       @Nullable final List <JSVar> params,
                       @Nullable final JSBlock body)
  {
    this (type);
    if (params != null)
      m_aParams.addAll (params);
    m_aBody = body;
  }

  /**
   * Returns the return type.
   */
  @Nullable
  public AbstractJSType type ()
  {
    return m_aType;
  }

  /**
   * Overrides the return type.
   */
  public void type (@Nullable final AbstractJSType t)
  {
    m_aType = t;
  }

  /**
   * Returns the list of variable of this function.
   * 
   * @return List of parameters of this function. This list is not modifiable.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <JSVar> params ()
  {
    return ContainerHelper.newList (m_aParams);
  }

  /**
   * Add the specified variable to the list of parameters for this function
   * signature.
   * 
   * @param name
   *        Name of the parameter being added
   * @return New parameter variable
   */
  @Nonnull
  public JSVar param (@Nonnull final String name)
  {
    return param (null, name);
  }

  /**
   * Add the specified variable to the list of parameters for this function
   * signature.
   * 
   * @param type
   *        type of the parameter being added
   * @param name
   *        Name of the parameter being added
   * @return New parameter variable
   */
  @Nonnull
  public JSVar param (@Nullable final AbstractJSType type, @Nonnull final String name)
  {
    final JSVar v = new JSVar (type, name, null);
    m_aParams.add (v);
    return v;
  }

  @Nonnegative
  public int getParamCount ()
  {
    return m_aParams.size ();
  }

  @Nullable
  public JSVar getParamAtIndex (final int nIndex)
  {
    return ContainerHelper.getSafe (m_aParams, nIndex);
  }

  /**
   * Get the block that makes up body of this function
   * 
   * @return Body of function
   */
  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ().newlineAtEnd (false);
    return m_aBody;
  }

  @Nonnull
  public JSInvocation invoke ()
  {
    return new JSInvocation (this);
  }

  public void generate (final JSFormatter f)
  {
    f.plain ("function");
    if (m_aType != null && f.generateTypeNames ())
      f.plain (" /*").generatable (m_aType).plain ("*/");
    f.plain ('(');
    boolean first = true;
    for (final JSVar aParam : m_aParams)
    {
      if (first)
        first = false;
      else
        f.plain (',');
      f.var (aParam);
    }
    f.plain (')').stmt (body ());
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSAnonymousFunction rhs = (JSAnonymousFunction) o;
    return EqualsUtils.equals (m_aType, rhs.m_aType) &&
           m_aParams.equals (rhs.m_aParams) &&
           EqualsUtils.equals (m_aBody, rhs.m_aBody);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ())
                            .append (m_aType)
                            .append (m_aParams)
                            .append (m_aBody)
                            .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("type", m_aType)
                            .append ("params", m_aParams)
                            .append ("body", m_aBody)
                            .toString ();
  }
}
