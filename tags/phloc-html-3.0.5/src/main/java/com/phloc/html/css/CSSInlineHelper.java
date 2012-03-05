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
package com.phloc.html.css;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.string.StringHelper;
import com.phloc.css.ECSSProperty;

@Immutable
public final class CSSInlineHelper
{
  private CSSInlineHelper ()
  {}

  /**
   * Try to extract the CSS background-image URL from an inline CSS style.
   *
   * @param sInlineCSS
   *        The inline CSS style to parse.
   * @return <code>null</code> if not background image is contained, the URL
   *         otherwise.
   */
  @Nullable
  public static String getBackgroundImageSource (@Nullable final String sInlineCSS)
  {
    if (StringHelper.hasNoText (sInlineCSS))
      return null;

    int nStartDef = sInlineCSS.indexOf (ECSSProperty.BACKGROUND_IMAGE.getName ());
    if (nStartDef < 0)
      return null;

    nStartDef += ECSSProperty.BACKGROUND_IMAGE.getName ().length ();
    nStartDef = sInlineCSS.indexOf ("(", nStartDef) + 1;
    final int nEndDef = sInlineCSS.indexOf (")", nStartDef);
    return sInlineCSS.substring (nStartDef, nEndDef);
  }

  @Nullable
  public static String replaceBackgroundImageSource (@Nullable final String sInlineCSS, @Nullable final String sSource)
  {
    if (StringHelper.hasText (sInlineCSS) && StringHelper.hasText (sSource))
    {
      int nStartDef = sInlineCSS.indexOf (ECSSProperty.BACKGROUND_IMAGE.getName ());
      if (nStartDef >= 0)
      {
        nStartDef += ECSSProperty.BACKGROUND_IMAGE.getName ().length ();
        nStartDef = sInlineCSS.indexOf ("(", nStartDef) + 1;
        final int nEndDef = sInlineCSS.indexOf (")", nStartDef);

        return sInlineCSS.substring (0, nStartDef) + sSource + sInlineCSS.substring (nEndDef);
      }
    }
    return sInlineCSS;
  }
}
