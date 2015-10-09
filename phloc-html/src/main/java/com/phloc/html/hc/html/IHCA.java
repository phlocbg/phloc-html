package com.phloc.html.hc.html;

import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.hc.IHCElementWithChildren;
import com.phloc.html.js.IJSCodeProvider;

public interface IHCA <THISTYPE extends IHCA <THISTYPE>> extends IHCElementWithChildren <THISTYPE>
{
  ISimpleURL getHref ();

  THISTYPE setHref (String sHref);

  THISTYPE setHref (ISimpleURL aHref);

  HCA_Target getTarget ();

  boolean hasTarget ();

  THISTYPE setTarget (HCA_Target aTarget);

  THISTYPE setTargetBlank ();

  String getName ();

  THISTYPE setName (String sName);

  IMimeType getType ();

  THISTYPE setType (IMimeType aType);

  String getMedia ();

  THISTYPE setMedia (String sMediaQuery);

  /**
   * Shortcut for <code>setEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   *
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  THISTYPE setOnClick (IJSCodeProvider aOnClick);

  /**
   * Shortcut for <code>addEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   *
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  THISTYPE addOnClick (IJSCodeProvider aOnClick);

}
