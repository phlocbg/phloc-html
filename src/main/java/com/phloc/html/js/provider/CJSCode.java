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
package com.phloc.html.js.provider;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.html.js.CJS;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;

/**
 * This class contains some static JS constants.
 * 
 * @author philip
 */
@Immutable
public final class CJSCode
{
  /** The 'this' keyword */
  @Deprecated
  public static final IJSCodeProvider JS_THIS = DefaultJSCodeProvider.create (CJS.JS_THIS);
  /** The 'null' keyword */
  @Deprecated
  public static final IJSCodeProvider JS_NULL = DefaultJSCodeProvider.create (CJS.JS_NULL);

  /** The HTML 'event' 'keyword' */
  @Deprecated
  public static final IJSCodeProvider HTML_EVENT = DefaultJSCodeProvider.create ("event");
  /** Often used code to get the selected value of a &lt;select&gt; element */
  @Deprecated
  public static final IJSCodeProvider HTML_SELECT_SELECTED_VALUE = DefaultJSCodeProvider.create ("this.options[this.selectedIndex].value");

  private CJSCode ()
  {}

  @Nonnull
  public static JSFieldRef getHtmlSelectSelectedValue ()
  {
    return JSExpr.refThis ("options").component (JSExpr.refThis ("selectedIndex")).ref ("value");
  }
}
