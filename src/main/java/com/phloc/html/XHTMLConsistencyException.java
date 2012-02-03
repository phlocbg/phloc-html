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
package com.phloc.html;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.exceptions.LoggedRuntimeException;

/**
 * Special exception indicating that the generated XHTML is inconsistent.
 * 
 * @author philip
 */
public class XHTMLConsistencyException extends LoggedRuntimeException
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (XHTMLConsistencyException.class);

  public XHTMLConsistencyException (final String sMsg)
  {
    super (sMsg);
  }

  public static void onInconsistency (final String sMsg)
  {
    // Just log
    s_aLogger.error ("XHTML inconsistency: " + sMsg);
    if (GlobalDebug.isDebugMode ())
      throw new XHTMLConsistencyException (sMsg);
  }
}
