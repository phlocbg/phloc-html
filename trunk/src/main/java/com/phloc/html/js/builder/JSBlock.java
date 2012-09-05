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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;

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
  /**
   * Declarations and statements contained in this block. Either
   * {@link IJSStatement} or {@link IJSDeclaration}.
   */
  private final List <IJSCodeProvider> m_aContent = new ArrayList <IJSCodeProvider> ();

  /**
   * Whether or not this block must be braced and indented
   */
  private boolean m_bBracesRequired;
  private boolean m_bIndentRequired;
  private boolean m_bNewLineAtEnd = true;

  /**
   * Current position.
   */
  private int m_nPos;

  public JSBlock ()
  {
    this (true, true);
  }

  public JSBlock (final boolean bBracesRequired, final boolean bIndentRequired)
  {
    m_bBracesRequired = bBracesRequired;
    m_bIndentRequired = bIndentRequired;
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

  @Nonnull
  private <T extends IJSCodeProvider> T _insert (@Nonnull final T aElement)
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
  public int pos (final int newPos)
  {
    final int nOldPos = m_nPos;
    if (newPos > m_aContent.size () || newPos < 0)
      throw new IllegalArgumentException ();
    m_nPos = newPos;
    return nOldPos;
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
   * @param type
   *        JType of the variable
   * @param name
   *        Name of the variable
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType type, @Nonnull final String name)
  {
    return decl (type, name, null);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param name
   *        Name of the variable
   * @param init
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nonnull final String name, @Nullable final IJSExpression init)
  {
    return decl (null, name, init);
  }

  /**
   * Adds a local variable declaration to this block
   * 
   * @param type
   *        JType of the variable
   * @param name
   *        Name of the variable
   * @param init
   *        Initialization expression for this variable. May be null.
   * @return Newly generated {@link JSVar}
   */
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType type, @Nonnull final String name, @Nullable final IJSExpression init)
  {
    final JSVar v = new JSVar (type, name, init);
    _insert (v);
    m_bBracesRequired = true;
    m_bIndentRequired = true;
    return v;
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final boolean v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final char v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final double v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final float v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final String v)
  {
    return assign (lhs, JSExpr.lit (v));
  }

  /**
   * Creates an assignment statement and adds it to this block.
   * 
   * @param lhs
   *        Assignable variable or field for left hand side of expression
   * @param exp
   *        Right hand side expression
   */
  @Nonnull
  public JSBlock assign (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression exp)
  {
    _insert (JSExpr.assign (lhs, exp));
    return this;
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, final char v)
  {
    return assignPlus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, final double v)
  {
    return assignPlus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, final float v)
  {
    return assignPlus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assignPlus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assignPlus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final String v)
  {
    return assignPlus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignPlus (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression exp)
  {
    _insert (JSExpr.assignPlus (lhs, exp));
    return this;
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget lhs, final double v)
  {
    return assignMinus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget lhs, final float v)
  {
    return assignMinus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assignMinus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assignMinus (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMinus (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression exp)
  {
    _insert (JSExpr.assignMinus (lhs, exp));
    return this;
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget lhs, final double v)
  {
    return assignMultiply (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget lhs, final float v)
  {
    return assignMultiply (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assignMultiply (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assignMultiply (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignMultiply (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression exp)
  {
    _insert (JSExpr.assignMultiply (lhs, exp));
    return this;
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget lhs, final double v)
  {
    return assignDivide (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget lhs, final float v)
  {
    return assignDivide (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assignDivide (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assignDivide (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignDivide (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression exp)
  {
    _insert (JSExpr.assignDivide (lhs, exp));
    return this;
  }

  @Nonnull
  public JSBlock assignModulo (@Nonnull final IJSAssignmentTarget lhs, final int v)
  {
    return assignModulo (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignModulo (@Nonnull final IJSAssignmentTarget lhs, final long v)
  {
    return assignModulo (lhs, JSExpr.lit (v));
  }

  @Nonnull
  public JSBlock assignModulo (@Nonnull final IJSAssignmentTarget lhs, @Nonnull final IJSExpression exp)
  {
    _insert (JSExpr.assignModulo (lhs, exp));
    return this;
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param expr
   *        JExpression evaluating to the class or object upon which the named
   *        method will be invoked
   * @param method
   *        Name of method to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nullable final IJSExpression expr, @Nonnull @Nonempty final String method)
  {
    return _insert (new JSInvocation (expr, method));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param expr
   *        JExpression evaluating to the class or object upon which the method
   *        will be invoked
   * @param method
   *        JMethod to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nullable final IJSExpression expr, @Nonnull final JSMethod method)
  {
    return _insert (new JSInvocation (expr, method));
  }

  /**
   * Creates a static invocation statement.
   */
  @Nonnull
  public JSInvocation staticInvoke (@Nullable final AbstractJSClass type, @Nonnull final String method)
  {
    return _insert (new JSInvocation (type, method));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param method
   *        Name of method to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull @Nonempty final String method)
  {
    return _insert (new JSInvocation ((IJSExpression) null, method));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param method
   *        JMethod to invoke
   * @return Newly generated {@link JSInvocation}
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull final JSMethod method)
  {
    return _insert (new JSInvocation ((IJSExpression) null, method));
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
    return _insert (new JSInvocation (aFunction));
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
    return _insert (new JSInvocation (aAnonymousFunction));
  }

  /**
   * Adds a statement to this block
   * 
   * @param aJSCode
   *        Code to be added
   * @return This block
   */
  @Nonnull
  public JSBlock add (@Nonnull final IJSCodeProvider aJSCode)
  {
    if (aJSCode == null)
      throw new NullPointerException ("statement");
    _insert (aJSCode);
    return this;
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
    return _insert (new JSConditional (expr));
  }

  /**
   * Create a For statement and add it to this block
   * 
   * @return Newly generated For statement
   */
  @Nonnull
  public JSForLoop _for ()
  {
    return _insert (new JSForLoop ());
  }

  @Nonnull
  public JSForIn forIn (@Nullable final AbstractJSType varType,
                        @Nonnull final String name,
                        @Nonnull final IJSExpression collection)
  {
    return _insert (new JSForIn (varType, name, collection));
  }

  /**
   * Create a While statement and add it to this block
   * 
   * @return Newly generated While statement
   */
  @Nonnull
  public JSWhileLoop _while (final IJSExpression test)
  {
    return _insert (new JSWhileLoop (test));
  }

  /**
   * Create a switch/case statement and add it to this block
   */
  @Nonnull
  public JSSwitch _switch (@Nonnull final IJSExpression test)
  {
    return _insert (new JSSwitch (test));
  }

  /**
   * Create a Do statement and add it to this block
   * 
   * @return Newly generated Do statement
   */
  @Nonnull
  public JSDoLoop _do (final IJSExpression test)
  {
    return _insert (new JSDoLoop (test));
  }

  /**
   * Create a Try statement and add it to this block
   * 
   * @return Newly generated Try statement
   */
  @Nonnull
  public JSTryBlock _try ()
  {
    return _insert (new JSTryBlock ());
  }

  /**
   * Insert a <code>delete expr;</code> statement
   * 
   * @param aExpr
   *        the expression to be deleted. May not be <code>null</code>.
   */
  public void delete (@Nonnull final IJSExpression aExpr)
  {
    _insert (new JSDelete (aExpr));
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

  public void _return (@Nonnull final String v)
  {
    _return (JSExpr.lit (v));
  }

  /**
   * Create a return statement and add it to this block
   */
  public void _return (@Nullable final IJSExpression exp)
  {
    _insert (new JSReturn (exp));
  }

  /**
   * Create a throw statement and add it to this block
   */
  public void _throw (final IJSExpression exp)
  {
    _insert (new JSThrow (exp));
  }

  /**
   * Create a break statement and add it to this block
   */
  public void _break ()
  {
    _break (null);
  }

  public void _break (@Nullable final JSLabel label)
  {
    _insert (new JSBreak (label));
  }

  /**
   * Create a label, which can be referenced from <code>continue</code> and
   * <code>break</code> statements.
   */
  @Nonnull
  public JSLabel label (@Nonnull @Nonempty final String name)
  {
    final JSLabel l = new JSLabel (name);
    _insert (l);
    return l;
  }

  public void _continue ()
  {
    _continue (null);
  }

  /**
   * Create a continue statement and add it to this block
   */
  public void _continue (@Nullable final JSLabel label)
  {
    _insert (new JSContinue (label));
  }

  /**
   * Create a sub-block and add it to this block
   */
  @Nonnull
  public JSBlock block ()
  {
    final JSBlock b = new JSBlock ();
    b.m_bBracesRequired = false;
    b.m_bIndentRequired = false;
    return _insert (b);
  }

  @Nonnull
  public JSFunction function (@Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return function (null, name);
  }

  @Nonnull
  public JSFunction function (@Nullable final AbstractJSType aReturnType, @Nonnull final String name) throws JSNameAlreadyExistsException
  {
    return _insert (new JSFunction (aReturnType, name));
  }

  public void comment (@Nonnull final String sComment)
  {
    _insert (new JSCommentSingleLine (sComment));
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
  public IJSStatement directStatement (final String source)
  {
    final IJSStatement s = new IJSStatement ()
    {
      public void state (final JSFormatter f)
      {
        f.plain (source).nl ();
      }

      @Nullable
      public String getJSCode ()
      {
        return JSPrinter.getAsString (this);
      }
    };
    add (s);
    return s;
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
    for (final Object o : m_aContent)
    {
      if (o instanceof IJSDeclaration)
        f.decl ((IJSDeclaration) o);
      else
        f.stmt ((IJSStatement) o);
    }
  }

  public void state (final JSFormatter f)
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
  public String toString ()
  {
    return new ToStringGenerator (this).append ("content", m_aContent)
                                       .append ("bracesRequired", m_bBracesRequired)
                                       .append ("identRequired", m_bIndentRequired)
                                       .append ("newLineAtEnd", m_bNewLineAtEnd)
                                       .toString ();
  }
}
