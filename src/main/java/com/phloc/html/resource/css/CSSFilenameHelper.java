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

@Immutable
@Deprecated
public final class CSSFilenameHelper
{
  private CSSFilenameHelper ()
  {}

  public static boolean isCSSFilename (@Nullable final String sFilename)
  {
    return com.phloc.css.CSSFilenameHelper.isCSSFilename (sFilename);
  }

  public static boolean isMinifiedCSSFilename (@Nullable final String sFilename)
  {
    return com.phloc.css.CSSFilenameHelper.isMinifiedCSSFilename (sFilename);
  }

  public static boolean isRegularCSSFilename (@Nullable final String sFilename)
  {
    return com.phloc.css.CSSFilenameHelper.isRegularCSSFilename (sFilename);
  }

  @Nonnull
  public static String getMinifiedCSSPath (@Nonnull final String sCSSFilename)
  {
    return com.phloc.css.CSSFilenameHelper.getMinifiedCSSFilename (sCSSFilename);
  }
}
