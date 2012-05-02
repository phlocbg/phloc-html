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

import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.PresentForCodeCoverage;
import com.phloc.commons.charset.CCharset;
import com.phloc.commons.xml.serialize.XMLWriterSettings;

/**
 * Contains the preferred charsets to be used for HTML/JS and CSS.
 * 
 * @author philip
 */
@Immutable
public final class CHTMLCharset
{
  public static final String CHARSET_HTML = XMLWriterSettings.DEFAULT_XML_CHARSET;
  public static final String CHARSET_CSS = CCharset.CHARSET_UTF_8;
  public static final String CHARSET_JS = CCharset.CHARSET_UTF_8;

  @PresentForCodeCoverage
  @SuppressWarnings ("unused")
  private static final CHTMLCharset s_aInstance = new CHTMLCharset ();

  private CHTMLCharset ()
  {}
}
