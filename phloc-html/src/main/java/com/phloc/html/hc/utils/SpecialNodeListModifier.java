package com.phloc.html.hc.utils;

public @interface SpecialNodeListModifier
{
  /**
   * @return The class implementing {@link IHCSpecialNodeListModifier}. It must
   *         be public and have a public no-argument constructor.
   */
  Class <? extends IHCSpecialNodeListModifier> value();
}
