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
package com.phloc.html.hc.html;

import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.GlobalDebug;

/**
 * Default settings for HTML controls
 * 
 * @author philip
 */
@NotThreadSafe
public final class HCDefaultSettings
{
  public static final boolean DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS = false;

  // For security reasons, the password should not be auto-filled by the browser
  // in the release-version
  private static boolean s_bAutoCompleteOffForPasswordEdits = DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS;

  private HCDefaultSettings ()
  {}

  public static boolean isAutoCompleteOffForPasswordEdits ()
  {
    // Extremely annoying for development...
    return s_bAutoCompleteOffForPasswordEdits && !GlobalDebug.isDebugMode ();
  }

  public static void setAutoCompleteOffForPasswordEdits (final boolean bOff)
  {
    s_bAutoCompleteOffForPasswordEdits = bOff;
  }
}
