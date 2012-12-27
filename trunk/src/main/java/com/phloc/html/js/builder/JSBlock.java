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
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.equals.EqualsUtils;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.math.MathHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.json.IJSON;

/**
 * A block of JS code, which may contain statements and local declarations.
 * <p>
 * {@link JSBlock} contains a large number of factory methods that creates new
 * statements/declarations. Those newly created statements/declarations are
 * inserted into the {@link #pos() "current position"}. The position advances
 * one every time you add a new instruction.
 * 
 * @author philip
 */
public class JSBlock implements IJSGeneratable, IJSStatement, IJSFunctionContainer
{
  public static final boolean DEFAULT_BRACES_REQUIRED = true;
  public static final boolean DEFAULT_INDENT_REQUIRED = true;
  public static final boolean DEFAULT_NEWLINE_AT_END = true;

  /**
   * Declarations and statements contained in this block. Either
   * {@link IJSStatement} or {@link IJSDeclaration}.
   */
  private final List <IJSCodeProvider> m_aContent = new ArrayList <IJSCodeProvider> ();

  /**
   * Current position.
   */
  private int m_nPos;

  /**
   * Whether or not this block must be braced and indented
   */
  private boolean m_bBracesRequired;
  private boolean m_bIndentRequired;
  private boolean m_bNewLineAtEnd = DEFAULT_NEWLINE_AT_END;

  public JSBlock ()
  {
    this (DEFAULT_BRACES_REQUIRED, DEFAULT_INDENT_REQUIRED);
  }

  public JSBlock (final boolean bBracesRequired, final boolean bIndentRequired)
  {
    m_bBracesRequired = bBracesRequired;
    m_bIndentRequired = bIndentRequired;
  }

  public boolean bracesRequired ()
  {
    return m_bBracesRequired;
  }

  public boolean indentRequired ()
  {
    return m_bIndentRequired;
  }

  public boolean newlineAtEnd ()
  {
    return m_bNewLineAtEnd;
  }

  /**
   * Determine whether a newline should be printed at the end of the block. This
   * is only set to false for anonymous functions
   * 
   * @param bNewLineAtEnd
   *        <code>true</code> to enable newline at the end
   * @return this
   */
  @Nonnull
  public JSBlock newlineAtEnd (final boolean bNewLineAtEnd)
  {
    m_bNewLineAtEnd = bNewLineAtEnd;
    return this;
  }

  /**
   * Returns a read-only view of {@link IJSStatement}s and
   * {@link IJSDeclaration} in this block.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <IJSCodeProvider> contents ()
  {
    return ContainerHelper.newList (m_aContent);
  }

  /**
   * Remove all contents of the block. Sets the position to 0.
   * 
   * @return this
   */
  @Nonnull
  public JSBlock clear ()
  {
    m_aContent.clear ();
    m_nPos = 0;
    return this;
  }

  @Nonnull
  private <T extends IJSCodeProvider> T _add (@Nonnull final T aElement)
  {
    m_aContent.add (m_nPos, aElement);
    m_nPos++;
    return aElement;
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
    if (nNewPos > m_aContent.size () || nNewPos < 0)
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
    return pos (m_aContent.size ());
  }

  /**
   * Returns true if this block is empty and does not contain any statement.
   */
  public boolean isEmpty ()
  {
    return m_aContent.isEmpty ();
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param name
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nonnull final String name)
  {
    return decl (null, name, null);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param aType
   *        JType of the variable
   * @param sName
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType aType, @Nonnull final String sName)
  {
    return decl (aType, sName, null);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param sName
   *        Name of the variable
   * @param aInit
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nonnull final String sName, @Nullable final IJSExpression aInit)
  {
    return decl (null, sName, aInit);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param aType
   *        JType of the variable
   * @param sName
   *        Name of the variable
   * @param aInit
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType aType,
                     @Nonnull final String sName,
                     @Nullable final IJSExpression aInit)
  {
    final JSVar aVar = new JSVar (aType, sName, aInit);
    _add (aVar);
    m_bBracesRequired = true;
    m_bIndentRequired = true;
    return aVar;
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, final boolean v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, final char v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    return assign (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, @Nullable final String v)
  {
    return assign (aLhs, v == null ? JSExpr.NULL : JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, @Nullable final IJSON v)
  {
    return assign (aLhs, v == null ? JSExpr.NULL : JSExpr.json (v));
  }

  /**
   * Creates an assignment statement and adds it to this block.
   * 
   * @param aLhs
   *        Assignable variable or field for left hand side of expression
   * @param aExpr
   *        Right hand side expression
   */
  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    _add (JSExpr.assign (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final char v)
  {
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No add with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    if (v < 0)
      return assignMinus (aLhs, JSExpr.lit (MathHelper.abs (v)));
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final String v)
  {
    return assignPlus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    _add (JSExpr.assignPlus (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No subtract with 0
    if (EqualsUtils.equals (v, 0))
      return this;
    return assignMinus (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    _add (JSExpr.assignMinus (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No multiply with 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignMultiply (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    _add (JSExpr.assignMultiply (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final double v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final float v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    // No divide by 1
    if (EqualsUtils.equals (v, 1))
      return this;
    return assignDivide (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    _add (JSExpr.assignDivide (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public JSBlock assignModulo (@Nonnull final IJSAssignmentTarget aLhs, final int v)
  {
    return assignModulo (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignModulo (@Nonnull final IJSAssignmentTarget aLhs, final long v)
  {
    return assignModulo (aLhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignModulo (@Nonnull final IJSAssignmentTarget aLhs, @Nonnull final IJSExpression aExpr)
  {
    _add (JSExpr.assignModulo (aLhs, aExpr));
    return this;
  }

  @Nonnull
  public JSBlock incr (@Nonnull final IJSAssignmentTarget aLhs)
  {
    _add (new JSIncr (aLhs));
    return this;
  }

  @Nonnull
  public JSBlock decr (@Nonnull final IJSAssignmentTarget aLhs)
  {
    _add (new JSDecr (aLhs));
    return this;
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
    return _add (new JSInvocation (aExpr, sMethod));
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
    return _add (new JSInvocation (aExpr, aMethod));
  }

  /**
   * Creates a static invocation statement.
   */
  @Nonnull
  public JSInvocation staticInvoke (@Nullable final AbstractJSClass aType, @Nonnull final String sMethod)
  {
    return _add (new JSInvocation (aType, sMethod));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param sMethod
   *        Name of method to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull @Nonempty final String sMethod)
  {
    return _add (new JSInvocation ((IJSExpression) null, sMethod));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param aMethod
   *        JMethod to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull final JSMethod aMethod)
  {
    return _add (new JSInvocation ((IJSExpression) null, aMethod));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param aFunction
   *        function to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull final JSFunction aFunction)
  {
    return _add (new JSInvocation (aFunction));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param aAnonymousFunction
   *        anonymous function to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull final JSAnonymousFunction aAnonymousFunction)
  {
    return _add (new JSInvocation (aAnonymousFunction));
  }

  /**
   * Adds a statement to this block
   * 
   * @param aJSCodeProvider
   *        Code to be added
   * @return This block
   */
  @Nonnull
  public JSBlock add (@Nonnull final IJSCodeProvider aJSCodeProvider)
  {
    if (aJSCodeProvider == null)
      throw new NullPointerException ("JSCodeProvider");
    _add (aJSCodeProvider);
    return this;
  }

  /**
   * Create an If statement and add it to this block
   * 
   * @param aExpr
   *        {@link IJSExpression} to be tested to determine branching
   * @return Newly generated conditional statement
   */
  @Nonnull
  public JSConditional _if (@Nonnull final IJSExpression aExpr)
  {
    return _add (new JSConditional (aExpr));
  }

  /**
   * Create a For statement and add it to this block
   * 
   * @return Newly generated For statement
   */
  @Nonnull
  public JSForLoop _for ()
  {
    return _add (new JSForLoop ());
  }

  @Nonnull
  public JSForIn forIn (@Nonnull final JSVar aVar, @Nonnull final IJSExpression aCollection)
  {
    return _add (new JSForIn (aVar, aCollection));
  }

  @Nonnull
  public JSForIn forIn (@Nonnull final String sVarName, @Nonnull final IJSExpression aCollection)
  {
    return forIn (null, sVarName, aCollection);
  }

  @Nonnull
  public JSForIn forIn (@Nullable final AbstractJSType aVarType,
                        @Nonnull final String sName,
                        @Nonnull final IJSExpression aCollection)
  {
    return _add (new JSForIn (aVarType, sName, aCollection));
  }

  /**
   * Create a While statement and add it to this block
   * 
   * @return Newly generated While statement
   */
  @Nonnull
  public JSWhileLoop _while (@Nonnull final IJSExpression aTest)
  {
    return _add (new JSWhileLoop (aTest));
  }

  /**
   * Create a Do statement and add it to this block
   * 
   * @return Newly generated Do statement
   */
  @Nonnull
  public JSDoLoop _do (@Nonnull final IJSExpression aTest)
  {
    return _add (new JSDoLoop (aTest));
  }

  /**
   * Create a switch/case statement and add it to this block
   */
  @Nonnull
  public JSSwitch _switch (@Nonnull final IJSExpression aTest)
  {
    return _add (new JSSwitch (aTest));
  }

  /**
   * Create a Try statement and add it to this block
   * 
   * @return Newly generated Try statement
   */
  @Nonnull
  public JSTryBlock _try ()
  {
    return _add (new JSTryBlock ());
  }

  /**
   * Insert a <code>delete aExpr;</code> statement
   * 
   * @param aExpr
   *        the expression to be deleted. May not be <code>null</code>.
   */
  public void delete (@Nonnull final IJSExpression aExpr)
  {
    _add (new JSDelete (aExpr));
  }

  /**
   * Create a return statement and add it to this block
   */
  public void _return ()
  {
    _return ((IJSExpression) null);
  }

  public void _return (final boolean v)
  {
    _return (JSExpr.lit (v));
  }

  public void _return (final char v)
  {
    _return (JSExpr.lit (v));
  }

  public void _return (final double v)
  {
    _return (JSExpr.lit (v));
  }

  public void _return (final float v)
  {
    _return (JSExpr.lit (v));
  }

  public void _return (final int v)
  {
    _return (JSExpr.lit (v));
  }

  public void _return (final long v)
  {
    _return (JSExpr.lit (v));
  }

  public void _return (@Nullable final String v)
  {
    _return (v == null ? JSExpr.NULL : JSExpr.lit (v));
  }

  public void _return (@Nullable final IJSON v)
  {
    _return (v == null ? JSExpr.NULL : JSExpr.json (v));
  }

  /**
   * Create a return statement and add it to this block
   */
  public void _return (@Nullable final IJSExpression aExpr)
  {
    _add (new JSReturn (aExpr));
  }

  /**
   * Create a throw statement and add it to this block
   */
  public void _throw (@Nonnull final IJSExpression aExpr)
  {
    _add (new JSThrow (aExpr));
  }

  public void _debugger ()
  {
    _add (new JSDebugger ());
  }

  /**
   * Create a break statement and add it to this block
   */
  public void _break ()
  {
    _break (null);
  }

  public void _break (@Nullable final JSLabel aLabel)
  {
    _add (new JSBreak (aLabel));
  }

  /**
   * Create a label, which can be referenced from <code>continue</code> and
   * <code>break</code> statements.
   */
  @Nonnull
  public JSLabel label (@Nonnull @Nonempty final String sName)
  {
    final JSLabel aLabel = new JSLabel (sName);
    _add (aLabel);
    return aLabel;
  }

  public void _continue ()
  {
    _continue (null);
  }

  /**
   * Create a continue statement and add it to this block
   */
  public void _continue (@Nullable final JSLabel aLabel)
  {
    _add (new JSContinue (aLabel));
  }

  /**
   * Create a sub-block and add it to this block
   */
  @Nonnull
  public JSBlock block ()
  {
    final JSBlock aSubBlock = new JSBlock ();
    aSubBlock.m_bBracesRequired = false;
    aSubBlock.m_bIndentRequired = false;
    return _add (aSubBlock);
  }

  @Nonnull
  public JSFunction function (@Nonnull final String sName) throws JSNameAlreadyExistsException
  {
    return function (null, sName);
  }

  @Nonnull
  public JSFunction function (@Nullable final AbstractJSType aReturnType, @Nonnull final String sName) throws JSNameAlreadyExistsException
  {
    return _add (new JSFunction (aReturnType, sName));
  }

  public void comment (@Nonnull final String sComment)
  {
    _add (new JSCommentSingleLine (sComment));
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
  public IJSStatement directStatement (final String sSource)
  {
    final IJSStatement aStmt = new IJSStatement ()
    {
      public void state (@Nonnull final JSFormatter f)
      {
        f.plain (sSource).nl ();
      }

      @Nullable
      public String getJSCode ()
      {
        return JSPrinter.getAsString (this);
      }
    };
    add (aStmt);
    return aStmt;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    if (m_bBracesRequired)
      f.plain ('{').nl ();
    if (m_bIndentRequired)
      f.indent ();
    generateBody (f);
    if (m_bIndentRequired)
      f.outdent ();
    if (m_bBracesRequired)
      f.plain ('}');
  }

  void generateBody (@Nonnull final JSFormatter f)
  {
    for (final IJSCodeProvider aJSCode : m_aContent)
    {
      if (aJSCode instanceof IJSDeclaration)
        f.decl ((IJSDeclaration) aJSCode);
      else
        if (aJSCode instanceof IJSStatement)
          f.stmt ((IJSStatement) aJSCode);
        else
          f.plain (aJSCode.getJSCode ());
    }
  }

  public void state (@Nonnull final JSFormatter f)
  {
    f.generatable (this);
    if (m_bBracesRequired && m_bNewLineAtEnd)
      f.nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString ((IJSGeneratable) this);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSBlock rhs = (JSBlock) o;
    return m_aContent.equals (rhs.m_aContent) &&
           m_nPos == rhs.m_nPos &&
           m_bBracesRequired == rhs.m_bBracesRequired &&
           m_bIndentRequired == rhs.m_bIndentRequired &&
           m_bNewLineAtEnd == rhs.m_bNewLineAtEnd;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aContent)
                                       .append (m_nPos)
                                       .append (m_bBracesRequired)
                                       .append (m_bIndentRequired)
                                       .append (m_bNewLineAtEnd)
                                       .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("content", m_aContent)
                                       .append ("pos", m_nPos)
                                       .append ("bracesRequired", m_bBracesRequired)
                                       .append ("identRequired", m_bIndentRequired)
                                       .append ("newLineAtEnd", m_bNewLineAtEnd)
                                       .toString ();
  }
}
