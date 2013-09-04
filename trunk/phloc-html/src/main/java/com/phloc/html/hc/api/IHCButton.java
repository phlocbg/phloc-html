package com.phloc.html.hc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.html.hc.IHCElementWithChildren;
import com.phloc.html.js.IJSCodeProvider;

public interface IHCButton <IMPLTYPE extends IHCButton <IMPLTYPE>> extends IHCElementWithChildren <IMPLTYPE>, IHCCanBeDisabled <IMPLTYPE>, IHCHasName <IMPLTYPE>
{
  /**
   * @return The value of the button. May be <code>null</code>.
   */
  @Nullable
  String getValue ();

  /**
   * Set the value of the button.
   * 
   * @param sValue
   *        The value to set. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE setValue (@Nullable String sValue);

  /**
   * @return The type of the button (button, submit or reset). Never
   *         <code>null</code>.
   */
  @Nonnull
  EHCButtonType getType ();

  /**
   * Set the type of the button.
   * 
   * @param eType
   *        The new type. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE setType (@Nonnull EHCButtonType eType);

  /**
   * Shortcut for <code>setEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   * 
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Nonnull
  IMPLTYPE setOnClick (@Nullable IJSCodeProvider aOnClick);

  /**
   * Shortcut for <code>addEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   * 
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Nonnull
  IMPLTYPE addOnClick (@Nullable IJSCodeProvider aOnClick);
}
