package com.phloc.html.hc.html;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.phloc.html.hc.IHCNode;

public interface IHasJSDeclarations
{

  /**
   * Append some JavaScript code
   * 
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public abstract IHasJSDeclarations addJS (@Nonnull IHCNode aJS);

  /**
   * Append some JavaScript code at the specified index
   * 
   * @param nIndex
   *        The index where the JS should be added (counting only JS elements)
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public abstract IHasJSDeclarations addJS (@Nonnegative int nIndex, @Nonnull IHCNode aJS);

  /**
   * @return The number of contained JS elements
   */
  @Nonnegative
  public abstract int getJSCount ();

  @Nonnull
  public abstract IHasJSDeclarations removeAllJS ();

}
