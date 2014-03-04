package com.phloc.html.hc.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention (RetentionPolicy.RUNTIME)
@Target ({ ElementType.TYPE })
public @interface SpecialNodeListModifier
{
  /**
   * @return The class implementing {@link IHCSpecialNodeListModifier}. It must
   *         be public and have a public no-argument constructor.
   */
  Class <? extends IHCSpecialNodeListModifier> value();
}
