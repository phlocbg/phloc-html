package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

/**
 * The common aspect of a package and a function.
 * 
 * @author philip
 */
public interface IJSFunctionContainer
{
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
}
