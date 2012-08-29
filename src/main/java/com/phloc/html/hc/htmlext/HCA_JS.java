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
package com.phloc.html.hc.htmlext;

import javax.annotation.Nullable;

import com.phloc.commons.url.ISimpleURL;
import com.phloc.commons.url.ReadonlySimpleURL;
import com.phloc.html.hc.html.HCA;
import com.phloc.html.js.CJS;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.builder.IJSStatement;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSReturn;
import com.phloc.html.js.builder.JSStatementList;

public class HCA_JS extends HCA
{
  private static final ISimpleURL JS_URL = new ReadonlySimpleURL (CJS.JS_VOID);

  public HCA_JS (@Nullable final IJSStatement aJSOnClick)
  {
    /**
     * JS links must always set a JS void in the href. This ensures that if the
     * href gets called (due to double click etc.) it has no effect.
     **/
    super (JS_URL);
    addEventHandler (EJSEvent.ONCLICK, new JSStatementList (aJSOnClick, new JSReturn (JSExpr.FALSE)));
  }
}
