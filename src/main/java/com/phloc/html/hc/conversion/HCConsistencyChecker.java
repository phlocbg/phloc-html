/**
 * Copyright (C) 2006-2012 phloc systems
 * http://www.phloc.com
 * office[at]phloc[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.hc.conversion;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.html.EHTMLVersion;
import com.phloc.html.annotations.DeprecatedInHTML32;
import com.phloc.html.annotations.DeprecatedInHTML4;
import com.phloc.html.annotations.DeprecatedInHTML5;
import com.phloc.html.annotations.DeprecatedInXHTML1;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.html.AbstractHCBaseTable;

/**
 * This class performs some consistency checks on HCNodes
 * 
 * @author philip
 */
@Immutable
public final class HCConsistencyChecker
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCConsistencyChecker.class);

  private HCConsistencyChecker ()
  {}

  public static void consistencyAssert (final boolean bCondition, final String sMsg)
  {
    if (!bCondition)
      throw new IllegalStateException ("Consistency check failed: " + sMsg);
  }

  public static void consistencyWarning (final String sMsg)
  {
    s_aLogger.warn (sMsg);
  }

  public static void runConsistencyCheckBeforeCreation (@Nonnull final IHCElement <?> aElement,
                                                        @Nonnull final EHTMLVersion eHTMLVersion)
  {
    final String sElementName = aElement.getTagName ();
    final Class <?> aElementClass = aElement.getClass ();
    if (aElementClass.getAnnotation (DeprecatedInHTML32.class) != null)
      consistencyWarning ("The element '" + sElementName + "' was deprecated in HTML 3.2");
    else
      if (aElementClass.getAnnotation (DeprecatedInHTML4.class) != null)
        consistencyWarning ("The element '" + sElementName + "' was deprecated in HTML 4.0");
      else
        if (aElementClass.getAnnotation (DeprecatedInXHTML1.class) != null)
          consistencyWarning ("The element '" + sElementName + "' is deprecated in XHTML1");
        else
          if (eHTMLVersion.isAtLeastHTML5 ())
          {
            // HTML5 specifics checks
            if (aElementClass.getAnnotation (DeprecatedInHTML5.class) != null)
              consistencyWarning ("The element '" + sElementName + "' is deprecated in HTML5");
          }
          else
          {
            // pre-HTML5 checks
            if (aElementClass.getAnnotation (SinceHTML5.class) != null)
              consistencyWarning ("The element '" + sElementName + "' is only available in HTML5");
          }

    // Special checks based on the implementation
    if (aElement instanceof AbstractHCBaseTable <?>)
      AbstractHCBaseTable.checkInternalConsistency ((AbstractHCBaseTable <?>) aElement);
  }
}
