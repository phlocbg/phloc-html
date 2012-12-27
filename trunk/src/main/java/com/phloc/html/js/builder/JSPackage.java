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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.state.EChange;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;

/**
 * A JS package. This is the entry point for all functions, declarations etc.
 * 
 * @author philip
 */
public class JSPackage implements IJSFunctionContainer, IJSCodeProvider
{
  private final List <Object> m_aObjs = new ArrayList <Object> ();

  /**
   * List of declarations contained within this package keyed by their name.
   */
  private final Map <String, IJSDeclaration> m_aDecls = new HashMap <String, IJSDeclaration> ();

  /**
   * JPackage constructor
   */
  public JSPackage ()
  {}

  @Nonnull
  public <T extends IJSDeclaration> T addDeclaration (@Nonnull final T aDeclaration) throws JSNameAlreadyExistsException
  {
    final String sName = aDeclaration.name ();
    if (m_aDecls.containsKey (sName))
      throw new JSNameAlreadyExistsException (m_aDecls.get (sName));
    m_aObjs.add (aDeclaration);
    m_aDecls.put (sName, aDeclaration);
    return aDeclaration;
  }

  @Nonnull
  public <T extends IJSStatement> T addStatement (@Nonnull final T aStatement)
  {
    m_aObjs.add (aStatement);
    return aStatement;
  }

  /**
   * Add a class to this package.
   * 
   * @param name
   *        Name of class to be added to this package
   * @return Newly generated class
   * @exception JSNameAlreadyExistsException
   *            When the specified class/interface was already created.
   */
  @Nonnull
  public JSDefinedClass _class (final String name) throws JSNameAlreadyExistsException
  {
    return addDeclaration (new JSDefinedClass (this, name));
  }

  @Nonnull
  public JSFunction function (@Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return function (null, name);
  }

  /**
   * Add a function to this package.
   * 
   * @param name
   *        Name of function to be added to this package
   * @return Newly generated function
   * @exception JSNameAlreadyExistsException
   *            When the specified function was already created.
   */
  @Nonnull
  public JSFunction function (@Nullable final AbstractJSType aType, @Nonnull @Nonempty final String name) throws JSNameAlreadyExistsException
  {
    return addDeclaration (new JSFunction (aType, name));
  }

  @Nonnull
  public JSVar var (@Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return var (null, name, null);
  }

  @Nonnull
  public JSVar var (@Nonnull final String name, @Nullable final IJSExpression initExpression) throws JSNameAlreadyExistsException
  {
    return var (null, name, initExpression);
  }

  @Nonnull
  public JSVar var (@Nullable final AbstractJSType aType, @Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return var (aType, name, null);
  }

  /**
   * Add a var to this package.
   * 
   * @param aType
   *        optional type to use
   * @param name
   *        Name of variable to be added to this package
   * @param initExpression
   *        the initial expression. May be <code>null</code>
   * @return Newly generated function
   * @exception JSNameAlreadyExistsException
   *            When the specified var was already created.
   */
  @Nonnull
  public JSVar var (@Nullable final AbstractJSType aType,
                    @Nonnull final String name,
                    @Nullable final IJSExpression initExpression) throws JSNameAlreadyExistsException
  {
    return addDeclaration (new JSVar (aType, name, initExpression));
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull final JSAnonymousFunction aAnonFunction)
  {
    return addStatement (aAnonFunction.invoke ());
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull final JSFunction aFunction)
  {
    return addStatement (aFunction.invoke ());
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull @Nonempty final String sFunctionName)
  {
    return addStatement (new JSInvocation (sFunctionName));
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull @Nonempty final String field, @Nonnull @Nonempty final String sMethodName)
  {
    return addStatement (JSExpr.ref (field).invoke (sMethodName));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, final boolean v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, final char v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, final double v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, final float v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, final int v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, final long v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, @Nonnull final String v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSAssignment assign (@Nonnull final AbstractJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    return addStatement (lhs.assign (rhs));
  }

  /**
   * Create a For statement and add it to this block
   * 
   * @return Newly generated For statement
   */
  @Nonnull
  public JSForLoop _for ()
  {
    return addStatement (new JSForLoop ());
  }

  @Nonnull
  public JSForIn forIn (@Nullable final AbstractJSType varType,
                        @Nonnull final String name,
                        @Nonnull final IJSExpression collection)
  {
    return addStatement (new JSForIn (varType, name, collection));
  }

  /**
   * Create an If statement and add it to this block
   * 
   * @param expr
   *        {@link IJSExpression} to be tested to determine branching
   * @return Newly generated conditional statement
   */
  @Nonnull
  public JSConditional _if (@Nonnull final IJSExpression expr)
  {
    return addStatement (new JSConditional (expr));
  }

  /**
   * Removes a declaration from this package.
   */
  @Nonnull
  public EChange removeByName (final String name)
  {
    final IJSDeclaration aDecl = m_aDecls.remove (name);
    if (aDecl == null)
      return EChange.UNCHANGED;
    m_aObjs.remove (aDecl);
    return EChange.CHANGED;
  }

  @Nonnull
  @ReturnsMutableCopy
  public Collection <IJSDeclaration> declarations ()
  {
    return ContainerHelper.newList (m_aDecls.values ());
  }

  /**
   * Gets a reference to the already created {@link JSDefinedClass}.
   * 
   * @return null If the object is not yet created.
   */
  @Nullable
  public IJSDeclaration getDeclaration (@Nullable final String name)
  {
    return m_aDecls.get (name);
  }

  /**
   * Checks if a given name is already defined as a class/interface
   */
  public boolean isDeclared (@Nullable final String declLocalName)
  {
    return getDeclaration (declLocalName) != null;
  }

  @Nonnegative
  public int memberCount ()
  {
    return m_aObjs.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <Object> members ()
  {
    return ContainerHelper.newList (m_aObjs);
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSPackage rhs = (JSPackage) o;
    return m_aObjs.equals (rhs.m_aObjs) && m_aDecls.equals (rhs.m_aDecls);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aObjs).append (m_aDecls).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("objs", m_aObjs).append ("decls", m_aDecls).toString ();
  }
}
