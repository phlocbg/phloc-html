package com.phloc.html.js.builder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * The common aspect of a package and a function.
 * 
 * @author philip
 */
public interface IJSFunctionContainer extends IJSHasOwner
{
  /**
   * Gets the nearest package parent.
   * <p>
   * If <tt>this.isPackage()</tt>, then return <tt>this</tt>.
   */
  @Nonnull
  JSPackage getPackage ();

  /**
   * Add a new public function to this container
   * 
   * @exception JSNameAlreadyExistsException
   *            When the specified function was already created.
   */
  @Nonnull
  JSFunction function (String name) throws JSNameAlreadyExistsException;

  /**
   * Add a new public function to this container
   * 
   * @exception JSNameAlreadyExistsException
   *            When the specified function was already created.
   */
  @Nonnull
  JSFunction function (AbstractJSType aReturnType, String name) throws JSNameAlreadyExistsException;

  /**
   * Parent {@link IJSFunctionContainer}. If this is a package, this method
   * returns a parent package, or null if this package is the root package. If
   * this is an outer-most class, this method returns a package to which it
   * belongs. If this is an inner class, this method returns the outer class.
   */
  @Nullable
  IJSFunctionContainer parentFunctionContainer ();
}
