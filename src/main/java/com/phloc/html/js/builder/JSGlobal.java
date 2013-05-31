/**
 * Copyright (C) 2006-2013 phloc systems
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
package com.phloc.html.js.builder;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.PresentForCodeCoverage;

/**
 * This contains global JS function wrappers.<br>
 * Source: http://www.w3schools.com/jsref/jsref_obj_global.asp
 * 
 * @author Philip Helger
 */
@Immutable
public final class JSGlobal
{
  @PresentForCodeCoverage
  @SuppressWarnings ("unused")
  private static final JSGlobal s_aInstance = new JSGlobal ();

  private JSGlobal ()
  {}

  /**
   * @return Global field <code>Infinity</code>
   */
  @Nonnull
  public static JSRef infinity ()
  {
    return JSExpr.ref ("Infinity");
  }

  /**
   * @return Global field <code>NaN</code>
   */
  @Nonnull
  public static JSRef nan ()
  {
    return JSExpr.ref ("NaN");
  }

  /**
   * @return Global field <code>undefined</code>
   */
  @Nonnull
  public static JSRef undefined ()
  {
    return JSExpr.ref ("undefined");
  }

  /**
   * @return Global function <code>decodeURI(uri)</code>
   */
  @Nonnull
  public static JSInvocation decodeURI ()
  {
    return JSExpr.invoke ("decodeURI");
  }

  /**
   * @return Global function <code>decodeURIComponent(uri)</code>
   */
  @Nonnull
  public static JSInvocation decodeURIComponent ()
  {
    return JSExpr.invoke ("decodeURIComponent");
  }

  /**
   * @return Global function <code>encodeURI(uri)</code>
   */
  @Nonnull
  public static JSInvocation encodeURI ()
  {
    return JSExpr.invoke ("encodeURI");
  }

  /**
   * @return Global function <code>encodeURIComponent(uri)</code>
   */
  @Nonnull
  public static JSInvocation encodeURIComponent ()
  {
    return JSExpr.invoke ("encodeURIComponent");
  }

  /**
   * @return Global function <code>escape(string)</code>
   */
  @Nonnull
  public static JSInvocation escape ()
  {
    return JSExpr.invoke ("escape");
  }

  /**
   * @return Global function <code>eval(string)</code>
   */
  @Nonnull
  public static JSInvocation eval ()
  {
    return JSExpr.invoke ("eval");
  }

  /**
   * @return Global function <code>isFinite(value)</code>
   */
  @Nonnull
  public static JSInvocation isFinite ()
  {
    return JSExpr.invoke ("isFinite");
  }

  /**
   * @return Global function <code>isNaN(value)</code>
   */
  @Nonnull
  public static JSInvocation isNaN ()
  {
    return JSExpr.invoke ("isNaN");
  }

  /**
   * @return Global function <code>Number(value)</code>
   */
  @Nonnull
  public static JSInvocation number ()
  {
    return JSExpr.invoke ("Number");
  }

  @Nonnull
  public static JSInvocation number (@Nonnull final IJSExpression aExpr)
  {
    return number ().arg (aExpr);
  }

  /**
   * @return Global function <code>parseFloat(string)</code>
   */
  @Nonnull
  public static JSInvocation parseFloat ()
  {
    return JSExpr.invoke ("parseFloat");
  }

  /**
   * @return Global function <code>parseInt(string,radix)</code>
   */
  @Nonnull
  public static JSInvocation parseInt ()
  {
    return JSExpr.invoke ("parseInt");
  }

  /**
   * @return Global function <code>String(object)</code>
   */
  @Nonnull
  public static JSInvocation string ()
  {
    return JSExpr.invoke ("String");
  }

  /**
   * @return Global function <code>unescape(string)</code>
   */
  @Nonnull
  public static JSInvocation unescape ()
  {
    return JSExpr.invoke ("unescape");
  }
}
