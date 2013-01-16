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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.annotations.ReturnsMutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.math.MathHelper;
import com.phloc.commons.state.EChange;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.json.IJSON;

/**
 * A JS package. This is the entry point for all functions, declarations etc.
 * 
 * @author philip
 */
public abstract class AbstractJSBlock implements IJSFunctionContainer
{
  private final List <IJSCodeProvider> m_aObjs = new ArrayList <IJSCodeProvider> ();

  /**
   * List of declarations contained within this package keyed by their name.
   */
  private final Map <String, IJSDeclaration> m_aDecls = new HashMap <String, IJSDeclaration> ();

  /**
   * Current position.
   */
  private int m_nPos = 0;

  /**
   * Constructor
   */
  public AbstractJSBlock ()
  {}

  /**
   * Removes a declaration from this package.
   */
  @Nonnull
  public EChange removeByName (final String sName)
  {
    final IJSDeclaration aDecl = m_aDecls.remove (sName);
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

  /**
   * Returns <code>true</code> if this block is empty and does not contain any
   * statement.
   */
  public boolean isEmpty ()
  {
    return m_aObjs.isEmpty ();
  }

  @Nonnegative
  public int memberCount ()
  {
    return m_aObjs.size ();
  }

  @Nonnull
  @ReturnsMutableObject (reason = "speed")
  List <IJSCodeProvider> directMembers ()
  {
    return m_aObjs;
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IJSCodeProvider> members ()
  {
    return ContainerHelper.newList (m_aObjs);
  }

  /**
   * Remove all contents of the block. Sets the position to 0.
   * 
   * @return this
   */
  @Nonnull
  public AbstractJSBlock clear ()
  {
    m_aObjs.clear ();
    m_aDecls.clear ();
    m_nPos = 0;
    return this;
  }

  /**
   * Called when a declaration is added
   * 
   * @param aDeclaration
   *        The added declaration. Never <code>null</code>.
   */
  @OverrideOnDemand
  protected void onAddDeclaration (@Nonnull final IJSDeclaration aDeclaration)
  {}

  @Nonnull
  public final <T extends IJSDeclaration> T addDeclaration (@Nonnull final T aDeclaration) throws JSNameAlreadyExistsException
  {
    if (aDeclaration == null)
      throw new NullPointerException ("declaration");

    final String sName = aDeclaration.name ();
    if (m_aDecls.containsKey (sName))
      throw new JSNameAlreadyExistsException (m_aDecls.get (sName));
    m_aObjs.add (m_nPos, aDeclaration);
    m_aDecls.put (sName, aDeclaration);
    m_nPos++;
    onAddDeclaration (aDeclaration);
    return aDeclaration;
  }

  @Nonnull
  public final <T extends IJSStatement> T addStatement (@Nonnull final T aStatement)
  {
    m_aObjs.add (m_nPos, aStatement);
    m_nPos++;
    return aStatement;
  }

  /**
   * Gets the current position to which new statements will be inserted. For
   * example if the value is 0, newly created instructions will be inserted at
   * the very beginning of the block.
   * 
   * @see #pos(int)
   */
  public int pos ()
  {
    return m_nPos;
  }

  /**
   * Sets the current position.
   * 
   * @return the old value of the current position.
   * @throws IllegalArgumentException
   *         if the new position value is illegal.
   * @see #pos()
   */
  public int pos (@Nonnegative final int nNewPos)
  {
    if (nNewPos < 0 || nNewPos > m_aObjs.size ())
      throw new IllegalArgumentException ("New position " + nNewPos + " is not valid!");
    final int nOldPos = m_nPos;
    m_nPos = nNewPos;
    return nOldPos;
  }

  /**
   * Sets the current position to the end of the block.
   * 
   * @return the old value of the current position.
   * @see #pos()
   */
  public int posEnd ()
  {
    return pos (m_aObjs.size ());
  }

  /**
   * Add a class to this package.
   * 
   * @param sName
   *        Name of class to be added to this package
   * @return Newly generated class
   * @exception JSNameAlreadyExistsException
   *            When the specified class/interface was already created.
   */
  @Nonnull
  public JSDefinedClass _class (@Nonnull @Nonempty final String sName) throws JSNameAlreadyExistsException
  {
    return addDeclaration (new JSDefinedClass (sName));
  }

  /**
   * @param aType
   *        The type to be instantiated
   * @return A "new type" invocation object
   */
  @Nonnull
  public JSInvocation _new (@Nonnull final AbstractJSType aType)
  {
    return aType._new ();
  }

  @Nonnull
  public JSFunction function (@Nonnull final String sName) throws JSNameAlreadyExistsException
  {
    return function (null, sName);
  }

  /**
   * Add a function to this package.
   * 
   * @param aType
   *        Optional return type
   * @param sName
   *        Name of function to be added to this package
   * @return Newly generated function
   * @exception JSNameAlreadyExistsException
   *            When the specified function was already created.
   */
  @Nonnull
  public JSFunction function (@Nullable final AbstractJSType aType, @Nonnull @Nonempty final String sName) throws JSNameAlreadyExistsException
  {
    return addDeclaration (new JSFunction (aType, sName));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName) throws JSNameAlreadyExistsException
  {
    return var (null, sName, null);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param bInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final boolean bInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, JSExpr.lit (bInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param cInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final char cInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, JSExpr.lit (cInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param dInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final double dInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, JSExpr.lit (dInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param fInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final float fInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, JSExpr.lit (fInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param nInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final int nInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, JSExpr.lit (nInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param nInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final long nInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, JSExpr.lit (nInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param sInitValue
   *        Initialization value for this variable.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, final String sInitValue) throws JSNameAlreadyExistsException
  {
    return var (null, sName, sInitValue == null ? JSExpr.NULL : JSExpr.lit (sInitValue));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param aInitExpression
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nonnull final String sName, @Nullable final IJSExpression aInitExpression) throws JSNameAlreadyExistsException
  {
    return var (null, sName, aInitExpression);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param aType
   *        Type of the variable
   * @param sName
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar var (@Nullable final AbstractJSType aType, @Nonnull final String sName) throws JSNameAlreadyExistsException
  {
    return var (aType, sName, null);
  }

  /**
   * Add a var to this block.
   * 
   * @param aType
   *        optional type to use
   * @param sName
   *        Name of variable to be added to this package
   * @param aInitExpression
   *        the initial expression. May be <code>null</code>
   * @return Newly generated function
   * @exception JSNameAlreadyExistsException
   *            When the specified var was already created.
   */
  @Nonnull
  public JSVar var (@Nullable final AbstractJSType aType,
                    @Nonnull final String sName,
                    @Nullable final IJSExpression aInitExpression) throws JSNameAlreadyExistsException
  {
    return addDeclaration (new JSVar (aType, sName, aInitExpression));
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Deprecated
  @Nonnull
  public JSVar decl (@Nonnull final String sName)
  {
    return var (sName);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param aType
   *        Type of the variable
   * @param sName
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Deprecated
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType aType, @Nonnull final String sName)
  {
    return var (aType, sName);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param aInitExpression
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Deprecated
  @Nonnull
  public JSVar decl (@Nonnull final String sName, @Nullable final IJSExpression aInitExpression)
  {
    return var (sName, aInitExpression);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param aType
   *        JType of the variable
   * @param sName
   *        Name of the variable
   * @param aInitExpression
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Deprecated
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType aType,
                     @Nonnull final String sName,
                     @Nullable final IJSExpression aInitExpression)
  {
    return var (aType, sName, aInitExpression);
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
  public JSInvocation invoke (@Nonnull @Nonempty final String sField, @Nonnull @Nonempty final String sMethodName)
  {
    return addStatement (JSExpr.ref (sField).invoke (sMethodName));
  }

  @Nonnull
  public JSInvocation invoke (@Nonnull @Nonempty final String sField, @Nonnull final JSMethod aMethod)
  {
    return addStatement (JSExpr.ref (sField).invoke (aMethod));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param aExpr
   *        JExpression evaluating to the class or object upon which the named
   *        method will be invoked
   * @param sMethod
   *        Name of method to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nullable final IJSExpression aExpr, @Nonnull @Nonempty final String sMethod)
  {
    return addStatement (new JSInvocation (aExpr, sMethod));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param aExpr
   *        JExpression evaluating to the class or object upon which the method
   *        will be invoked
   * @param aMethod
   *        JMethod to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nullable final IJSExpression aExpr, @Nonnull final JSMethod aMethod)
  {
    return addStatement (new JSInvocation (aExpr, aMethod));
  }

  /**
   * Creates a static invocation statement.
   */
  @Nonnull
  public JSInvocation staticInvoke (@Nullable final AbstractJSClass aType, @Nonnull final String sMethod)
  {
    return addStatement (new JSInvocation (aType, sMethod));
  }

  /**
   * Creates a static invocation statement.
   */
  @Nonnull
  public JSInvocation staticInvoke (@Nullable final AbstractJSClass aType, @Nonnull final JSMethod aMethod)
  {
    return addStatement (new JSInvocation (aType, aMethod));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final boolean v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final char v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final double v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final float v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final String v)
  {
    return assign (lhs, v == null ? JSExpr.NULL : JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, @Nullable final IJSON v)
  {
    return assign (aLhs, v == null ? JSExpr.NULL : JSExpr.json (v));
  }

  @Nonnull
  public AbstractJSBlock assign (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression rhs)
  {
    addStatement (lhs.assign (rhs));
    return this;
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final char v)
  {
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final String v)
  {
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    addStatement (JSExpr.assignPlus (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public AbstractJSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    addStatement (JSExpr.assignMinus (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public AbstractJSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    addStatement (JSExpr.assignMultiply (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public AbstractJSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    addStatement (JSExpr.assignDivide (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public AbstractJSBlock assignModulo (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    return assignModulo (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignModulo (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    return assignModulo (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock assignModulo (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    addStatement (JSExpr.assignModulo (aLhs, aExpr));
    return this;
  }

  /**
   * @deprecated Use {@link #incrPostfix(IJSAssignmentTarget)} instead
   */
  @Deprecated
  @Nonnull
  public AbstractJSBlock incr (@Nonnull final IJSAssignmentTarget aLhs)
  {
    return incrPostfix (aLhs);
  }

  @Nonnull
  public AbstractJSBlock incrPostfix (@Nonnull final IJSAssignmentTarget aLhs)
  {
    addStatement (new JSIncrPostfix (aLhs));
    return this;
  }

  @Nonnull
  public AbstractJSBlock incrPrefix (@Nonnull final IJSAssignmentTarget aLhs)
  {
    addStatement (new JSIncrPrefix (aLhs));
    return this;
  }

  /**
   * @deprecated Use {@link #decrPostfix(IJSAssignmentTarget)} instead
   */
  @Deprecated
  @Nonnull
  public AbstractJSBlock decr (@Nonnull final IJSAssignmentTarget aLhs)
  {
    return decrPostfix (aLhs);
  }

  @Nonnull
  public AbstractJSBlock decrPostfix (@Nonnull final IJSAssignmentTarget aLhs)
  {
    addStatement (new JSDecrPostfix (aLhs));
    return this;
  }

  @Nonnull
  public AbstractJSBlock decrPrefix (@Nonnull final IJSAssignmentTarget aLhs)
  {
    addStatement (new JSDecrPrefix (aLhs));
    return this;
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
  public JSForIn forIn (@Nonnull final JSVar aVar, @Nonnull final IJSExpression aCollection)
  {
    return addStatement (new JSForIn (aVar, aCollection));
  }

  @Nonnull
  public JSForIn forIn (@Nonnull final String sVarName, @Nonnull final IJSExpression aCollection)
  {
    return forIn (null, sVarName, aCollection);
  }

  @Nonnull
  public JSForIn forIn (@Nullable final AbstractJSType aVarType,
                        @Nonnull final String sVarName,
                        @Nonnull final IJSExpression aCollection)
  {
    return addStatement (new JSForIn (aVarType, sVarName, aCollection));
  }

  /**
   * Create a While statement and add it to this block
   * 
   * @return Newly generated While statement
   */
  @Nonnull
  public JSWhileLoop _while (@Nonnull final IJSExpression aTest)
  {
    return addStatement (new JSWhileLoop (aTest));
  }

  /**
   * Create a Do statement and add it to this block
   * 
   * @return Newly generated Do statement
   */
  @Nonnull
  public JSDoLoop _do (@Nonnull final IJSExpression aTest)
  {
    return addStatement (new JSDoLoop (aTest));
  }

  /**
   * Create a switch/case statement and add it to this block
   */
  @Nonnull
  public JSSwitch _switch (@Nonnull final IJSExpression aTest)
  {
    return addStatement (new JSSwitch (aTest));
  }

  /**
   * Create a Try statement and add it to this block
   * 
   * @return Newly generated Try statement
   */
  @Nonnull
  public JSTryBlock _try ()
  {
    return addStatement (new JSTryBlock ());
  }

  /**
   * Insert a <code>delete aExpr;</code> statement
   * 
   * @param aExpr
   *        the expression to be deleted. May not be <code>null</code>.
   */
  @Nonnull
  public AbstractJSBlock delete (@Nonnull final IJSExpression aExpr)
  {
    addStatement (new JSDelete (aExpr));
    return this;
  }

  /**
   * Create a throw statement and add it to this block
   */
  @Nonnull
  public AbstractJSBlock _throw (@Nonnull final IJSExpression aExpr)
  {
    addStatement (new JSThrow (aExpr));
    return this;
  }

  @Deprecated
  @Nonnull
  public AbstractJSBlock _debugger ()
  {
    return debugger ();
  }

  @Nonnull
  public AbstractJSBlock debugger ()
  {
    addStatement (new JSDebugger ());
    return this;
  }

  /**
   * Create a label, which can be referenced from <code>continue</code> and
   * <code>break</code> statements.
   */
  @Nonnull
  public JSLabel label (@Nonnull @Nonempty final String sName)
  {
    return addStatement (new JSLabel (sName));
  }

  /**
   * Create an If statement and add it to this block
   * 
   * @param aTest
   *        {@link IJSExpression} to be tested to determine branching
   * @return Newly generated conditional statement
   */
  @Nonnull
  public JSConditional _if (@Nonnull final IJSExpression aTest)
  {
    return addStatement (new JSConditional (aTest));
  }

  /**
   * Create a return statement and add it to this block
   */
  @Nonnull
  public AbstractJSBlock _return ()
  {
    return _return ((IJSExpression) null);
  }

  @Nonnull
  public AbstractJSBlock _return (final boolean v)
  {
    return _return (JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (final char v)
  {
    return _return (JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (final double v)
  {
    return _return (JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (final float v)
  {
    return _return (JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (final int v)
  {
    return _return (JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (final long v)
  {
    return _return (JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (@Nullable final String v)
  {
    return _return (v == null ? JSExpr.NULL : JSExpr.lit (v));
  }

  @Nonnull
  public AbstractJSBlock _return (@Nullable final IJSON v)
  {
    return _return (v == null ? JSExpr.NULL : JSExpr.json (v));
  }

  /**
   * Create a return statement and add it to this block
   */
  @Nonnull
  public AbstractJSBlock _return (@Nullable final IJSExpression aExpr)
  {
    addStatement (new JSReturn (aExpr));
    return this;
  }

  /**
   * Create a sub-block and add it to this block
   * 
   * @return The newly created block
   */
  @Nonnull
  public JSBlock block ()
  {
    return addStatement (new JSBlock (false, false));
  }

  @Nonnull
  public AbstractJSBlock comment (@Nonnull final String sComment)
  {
    addStatement (new JSCommentSingleLine (sComment));
    return this;
  }

  /**
   * Creates a "literal" statement directly.
   * <p>
   * Specified string is printed as-is. This is useful as a short-cut.
   * <p>
   * For example, you can invoke this method as:
   * <code>directStatement("a=b+c;")</code>.
   */
  @Nonnull
  @Deprecated
  public AbstractJSBlock directStatement (@Nonnull @Nonempty final String sSource)
  {
    addStatement (new JSStatementDirect (sSource));
    return this;
  }

  @Nonnull
  public AbstractJSBlock add (@Nonnull final IJSCodeProvider aJSCode)
  {
    m_aObjs.add (m_nPos, aJSCode);
    m_nPos++;
    return this;
  }

  @Nonnull
  public AbstractJSBlock add (@Nonnull final IJSStatement aStatement)
  {
    addStatement (aStatement);
    return this;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final AbstractJSBlock rhs = (AbstractJSBlock) o;
    return m_aObjs.equals (rhs.m_aObjs) && m_aDecls.equals (rhs.m_aDecls) && m_nPos == rhs.m_nPos;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aObjs).append (m_aDecls).append (m_nPos).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("objs", m_aObjs)
                                       .append ("decls", m_aDecls)
                                       .append ("pos", m_nPos)
                                       .toString ();
  }
}
