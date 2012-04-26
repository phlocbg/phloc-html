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
package com.phloc.html.resource.css;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.string.StringHelper;
import com.phloc.css.CCSS;

@Immutable
public final class CSSFilenameHelper
{
  private CSSFilenameHelper ()
  {}

  public static boolean isCSSFilename (@Nullable final String sFilename)
  {
    return StringHelper.endsWith (sFilename, CCSS.FILE_EXTENSION_CSS);
  }

  public static boolean isMinifiedCSSFilename (@Nullable final String sFilename)
  {
    return StringHelper.endsWith (sFilename, CCSS.FILE_EXTENSION_MIN_CSS);
  }

  public static boolean isRegularCSSFilename (@Nullable final String sFilename)
  {
    return isCSSFilename (sFilename) && !isMinifiedCSSFilename (sFilename);
  }

  @Nonnull
  public static String getMinifiedCSSPath (@Nonnull final String sCSSFilename)
  {
    if (!isCSSFilename (sCSSFilename))
      throw new IllegalArgumentException ("Passed file name '" + sCSSFilename + "' is not a CSS file name!");
    if (isMinifiedCSSFilename (sCSSFilename))
      return sCSSFilename;
    return StringHelper.trimEnd (sCSSFilename, CCSS.FILE_EXTENSION_CSS) + CCSS.FILE_EXTENSION_MIN_CSS;
  }
}
