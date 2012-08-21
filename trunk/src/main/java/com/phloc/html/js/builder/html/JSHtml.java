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
package com.phloc.html.js.builder.html;

import javax.annotation.Nonnull;

import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSInvocation;

/**
 * This class contains JS builder default constructs that are used very commonly
 * 
 * @author philip
 */
public final class JSHtml
{
  private JSHtml ()
  {}

  @Nonnull
  public static JSFieldRef document ()
  {
    return JSExpr.ref ("document");
  }

  @Nonnull
  public static JSFieldRef event ()
  {
    return JSExpr.ref ("event");
  }

  @Nonnull
  public static JSFieldRef history ()
  {
    return JSExpr.ref ("history");
  }

  @Nonnull
  public static JSInvocation historyBack ()
  {
    return history ().invoke ("back");
  }

  /**
   * @return <code>this.options[this.selectedIndex].value</code>
   */
  @Nonnull
  public static JSFieldRef getSelectSelectedValue ()
  {
    return JSExpr.refThis ("options").component (JSExpr.refThis ("selectedIndex")).ref ("value");
  }

  @Nonnull
  public static JSFieldRef screen ()
  {
    return JSExpr.ref ("screen");
  }

  @Nonnull
  public static JSFieldRef screenWidth ()
  {
    return screen ().ref ("width");
  }

  @Nonnull
  public static JSFieldRef screenHeight ()
  {
    return screen ().ref ("height");
  }
}
