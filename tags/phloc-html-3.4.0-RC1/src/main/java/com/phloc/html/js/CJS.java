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
package com.phloc.html.js;

import javax.annotation.concurrent.Immutable;

import com.phloc.commons.url.EURLProtocol;

/**
 * JavaScript constants.
 * 
 * @author philip
 */
@Immutable
public final class CJS
{
  /** The JavaScript prefix "javascript:" */
  public static final String JS_PREFIX = EURLProtocol.JAVASCRIPT.getProtocol ();
  @Deprecated
  public static final char JS_END_OF_STATEMENT = ';';
  @Deprecated
  public static final String JS_END_OF_STATEMENT_STR = Character.toString (JS_END_OF_STATEMENT);
  public static final String JS_NULL = "null";
  @Deprecated
  public static final String JS_THIS = "this";
  @Deprecated
  public static final String JS_UNDEFINED = "undefined";

  /** The void statement "javascript:void(0);" */
  public static final String JS_VOID = JS_PREFIX + "void(0)" + JS_END_OF_STATEMENT;

  /** Regular JS file extension */
  public static final String FILE_EXTENSION_JS = ".js";

  /** Minified JS file extension */
  public static final String FILE_EXTENSION_MIN_JS = ".min.js";

  private CJS ()
  {}
}
