/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.phloc.html.js.builder;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;

/**
 * A block of Java code, which may contain statements and local declarations.
 * <p>
 * {@link JSBlock} contains a large number of factory methods that creates new
 * statements/declarations. Those newly created statements/declarations are
 * inserted into the {@link #pos() "current position"}. The position advances
 * one every time you add a new instruction.
 */
public final class JSBlock implements IJSGeneratable, IJSStatement, IJSFunctionContainer
{
  /**
   * Declarations and statements contained in this block. Either
   * {@link IJSStatement} or {@link IJSDeclaration}.
   */
  private final List <Object> m_aContent = new ArrayList <Object> ();

  /**
   * Whether or not this block must be braced and indented
   */
  private boolean m_bBracesRequired;
  private boolean m_bIndentRequired;

  /**
   * Current position.
   */
  private int pos;

  public JSBlock ()
  {
    this (false, false);
  }

  public JSBlock (final boolean bracesRequired, final boolean indentRequired)
  {
    m_bBracesRequired = bracesRequired;
    m_bIndentRequired = indentRequired;
  }

  /**
   * Returns a read-only view of {@link IJSStatement}s and
   * {@link IJSDeclaration} in this block.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <Object> getContents ()
  {
    return ContainerHelper.newList (m_aContent);
  }

  @Nonnull
  private <T> T _insert (@Nonnull final T statementOrDeclaration)
  {
    m_aContent.add (pos, statementOrDeclaration);
    pos++;
    return statementOrDeclaration;
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
    return pos;
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
    final int r = pos;
    if (newPos > m_aContent.size () || newPos < 0)
      throw new IllegalArgumentException ();
    pos = newPos;

    return r;
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
   * @param type
   *        JType of the variable
   * @param name
   *        Name of the variable
   * @return Newly generated JVar
   */
  @Nonnull
  public JSVar decl (@Nullable final AbstractJSType type, @Nonnull final String name)
  {
    return decl (type, name, null);
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
   * @return Newly generated JVar
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

  /**
   * Creates an assignment statement and adds it to this block.
   * 
   * @param lhs
   *        Assignable variable or field for left hand side of expression
   * @param exp
   *        Right hand side expression
   */
  @Nonnull
  public JSBlock assign (final IJSAssignmentTarget lhs, final IJSExpression exp)
  {
    _insert (new JSAssignment (lhs, exp));
    return this;
  }

  @Nonnull
  public JSBlock assignPlus (final IJSAssignmentTarget lhs, final IJSExpression exp)
  {
    _insert (new JSAssignment (lhs, "+=", exp));
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
   * @return Newly generated JInvocation
   */
  @Nonnull
  public JSInvocation invoke (@Nullable final IJSExpression expr, @Nonnull final String method)
  {
    final JSInvocation i = new JSInvocation (expr, method);
    _insert (i);
    return i;
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param expr
   *        JExpression evaluating to the class or object upon which the method
   *        will be invoked
   * @param method
   *        JMethod to invoke
   * @return Newly generated JInvocation
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
   * @return Newly generated JInvocation
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull final String method)
  {
    return _insert (new JSInvocation ((IJSExpression) null, method));
  }

  /**
   * Creates an invocation statement and adds it to this block.
   * 
   * @param method
   *        JMethod to invoke
   * @return Newly generated JInvocation
   */
  @Nonnull
  public JSInvocation invoke (@Nonnull final JSMethod method)
  {
    return _insert (new JSInvocation ((IJSExpression) null, method));
  }

  /**
   * Adds a statement to this block
   * 
   * @param s
   *        JStatement to be added
   * @return This block
   */
  @Nonnull
  public JSBlock add (@Nonnull final IJSStatement s)
  { // ## Needed?
    _insert (s);
    return this;
  }

  /**
   * Create an If statement and add it to this block
   * 
   * @param expr
   *        JExpression to be tested to determine branching
   * @return Newly generated conditional statement
   */
  @Nonnull
  public JSConditional _if (final IJSExpression expr)
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
  public JSForIn forIn (final AbstractJSType varType, final String name, final IJSExpression collection)
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
  public JSSwitch _switch (final IJSExpression test)
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
   * Create a return statement and add it to this block
   */
  public void _return ()
  {
    _return (null);
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
  public JSLabel label (final String name)
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

  /**
   * Creates a "literal" statement directly.
   * <p>
   * Specified string is printed as-is. This is useful as a short-cut.
   * <p>
   * For example, you can invoke this method as:
   * <code>directStatement("a=b+c;")</code>.
   */
  @Nonnull
  public IJSStatement directStatement (final String source)
  {
    final IJSStatement s = new IJSStatement ()
    {
      public void state (final JSFormatter f)
      {
        f.plain (source).nl ();
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
    if (m_bBracesRequired)
      f.nl ();
  }
}
