package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

/**
 * delete statement
 */
final class JSDelete implements IJSStatement
{
  private final IJSExpression m_aExpr;

  /**
   * constructor
   * 
   * @param expr
   *        expression to delete. May not be <code>null</code>.
   */
  JSDelete (@Nonnull final IJSExpression expr)
  {
    if (expr == null)
      throw new NullPointerException ("expr");
    m_aExpr = expr;
  }

  public void state (final JSFormatter f)
  {
    f.plain ("delete ").generatable (m_aExpr).plain (';').nl ();
  }
}
