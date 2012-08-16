package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

/**
 * Base interface for all objects having an owner
 * 
 * @author philip
 */
public interface IJSHasOwner
{
  /**
   * Get the root code model object.
   */
  @Nonnull
  JSCodeModel owner ();
}
