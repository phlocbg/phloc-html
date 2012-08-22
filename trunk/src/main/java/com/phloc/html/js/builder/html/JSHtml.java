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

import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.js.builder.IJSExpression;
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

  // --- console ---

  @Nonnull
  public static JSFieldRef console ()
  {
    return JSExpr.ref ("console");
  }

  @Nonnull
  public static JSInvocation consoleLog (@Nonnull final String sText)
  {
    return consoleLog (JSExpr.lit (sText));
  }

  @Nonnull
  public static JSInvocation consoleLog (@Nonnull final IJSExpression aExpr)
  {
    return console ().invoke ("log").arg (aExpr);
  }

  // --- document ---

  @Nonnull
  public static JSFieldRef document ()
  {
    return JSExpr.ref ("document");
  }

  @Nonnull
  public static JSFieldRef documentAnchors ()
  {
    return document ().ref ("anchors");
  }

  @Nonnull
  public static JSFieldRef documentEmbeds ()
  {
    return document ().ref ("embeds");
  }

  @Nonnull
  public static JSFieldRef documentForms ()
  {
    return document ().ref ("forms");
  }

  @Nonnull
  public static JSInvocation documentGetElementById (@Nonnull final String sID)
  {
    return documentGetElementById (JSExpr.lit (sID));
  }

  @Nonnull
  public static JSInvocation documentGetElementById (@Nonnull final IJSExpression aID)
  {
    return document ().invoke ("getElementById").arg (aID);
  }

  @Nonnull
  public static JSInvocation documentGetElementsByName (@Nonnull final String sElementName)
  {
    return documentGetElementsByName (JSExpr.lit (sElementName));
  }

  @Nonnull
  public static JSInvocation documentGetElementsByName (@Nonnull final IJSExpression aElementName)
  {
    return document ().invoke ("getElementsByName").arg (aElementName);
  }

  @Nonnull
  public static JSInvocation documentGetElementsByTagName (@Nonnull final String sElementName)
  {
    return documentGetElementsByTagName (JSExpr.lit (sElementName));
  }

  @Nonnull
  public static JSInvocation documentGetElementsByTagName (@Nonnull final IJSExpression aElementName)
  {
    return document ().invoke ("getElementsByTagName").arg (aElementName);
  }

  @Nonnull
  public static JSFieldRef documentImages ()
  {
    return document ().ref ("images");
  }

  @Nonnull
  public static JSFieldRef documentLinks ()
  {
    return document ().ref ("links");
  }

  @Nonnull
  public static JSInvocation documentWrite (@Nonnull final String sText)
  {
    return documentWrite (JSExpr.lit (sText));
  }

  @Nonnull
  public static JSInvocation documentWrite (@Nonnull final IJSExpression aText)
  {
    return document ().invoke ("write").arg (aText);
  }

  @Nonnull
  public static JSInvocation documentWriteln (@Nonnull final String sText)
  {
    return documentWriteln (JSExpr.lit (sText));
  }

  @Nonnull
  public static JSInvocation documentWriteln (@Nonnull final IJSExpression aText)
  {
    return document ().invoke ("writeln").arg (aText);
  }

  // --- event ---

  @Nonnull
  public static JSFieldRef event ()
  {
    return JSExpr.ref ("event");
  }

  // --- history ---

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

  @Nonnull
  public static JSInvocation historyForward ()
  {
    return history ().invoke ("forward");
  }

  @Nonnull
  public static JSInvocation historyGo (final int nJumpCount)
  {
    return historyGo (JSExpr.lit (nJumpCount));
  }

  @Nonnull
  public static JSInvocation historyGo (@Nonnull final IJSExpression aJumpCount)
  {
    return history ().invoke ("go").arg (aJumpCount);
  }

  @Nonnull
  public static JSFieldRef historyLength ()
  {
    return history ().ref ("length");
  }

  // --- location ---

  @Nonnull
  public static JSFieldRef location ()
  {
    return JSExpr.ref ("location");
  }

  @Nonnull
  public static JSFieldRef locationHash ()
  {
    return location ().ref ("hash");
  }

  @Nonnull
  public static JSFieldRef locationHost ()
  {
    return location ().ref ("host");
  }

  @Nonnull
  public static JSFieldRef locationHostname ()
  {
    return location ().ref ("hostname");
  }

  @Nonnull
  public static JSFieldRef locationHref ()
  {
    return location ().ref ("href");
  }

  @Nonnull
  public static JSFieldRef locationPathname ()
  {
    return location ().ref ("pathname");
  }

  @Nonnull
  public static JSFieldRef locationPort ()
  {
    return location ().ref ("port");
  }

  @Nonnull
  public static JSFieldRef locationProtocol ()
  {
    return location ().ref ("protocol");
  }

  @Nonnull
  public static JSInvocation locationReload ()
  {
    return location ().invoke ("reload");
  }

  @Nonnull
  public static JSInvocation locationReplace (@Nonnull final ISimpleURL aURL)
  {
    return locationReplace (JSExpr.lit (aURL.getAsString ()));
  }

  @Nonnull
  public static JSInvocation locationReplace (@Nonnull final IJSExpression aURL)
  {
    return location ().invoke ("replace").arg (aURL);
  }

  @Nonnull
  public static JSFieldRef locationSearch ()
  {
    return location ().ref ("search");
  }

  // --- navigator ---

  @Nonnull
  public static JSFieldRef navigator ()
  {
    return JSExpr.ref ("navigator");
  }

  @Nonnull
  public static JSFieldRef navigatorAppCodeName ()
  {
    return navigator ().ref ("appCodeName");
  }

  @Nonnull
  public static JSFieldRef navigatorAppName ()
  {
    return navigator ().ref ("appName");
  }

  @Nonnull
  public static JSFieldRef navigatorAppVersion ()
  {
    return navigator ().ref ("appVersion");
  }

  @Nonnull
  public static JSFieldRef navigatorCookieEnabled ()
  {
    return navigator ().ref ("cookieEnabled");
  }

  @Nonnull
  public static JSFieldRef navigatorLanguage ()
  {
    return navigator ().ref ("language");
  }

  // is an array!
  @Nonnull
  public static JSFieldRef navigatorMimeTypes ()
  {
    return navigator ().ref ("mimeTypes");
  }

  @Nonnull
  public static JSFieldRef navigatorPlatform ()
  {
    return navigator ().ref ("platform");
  }

  // is an array!
  @Nonnull
  public static JSFieldRef navigatorPlugins ()
  {
    return navigator ().ref ("plugins");
  }

  @Nonnull
  public static JSFieldRef navigatorUserAgent ()
  {
    return navigator ().ref ("userAgent");
  }

  @Nonnull
  public static JSInvocation navigatorJavaEnabled ()
  {
    return navigator ().invoke ("javaEnabled");
  }

  // --- screen ---

  @Nonnull
  public static JSFieldRef screen ()
  {
    return JSExpr.ref ("screen");
  }

  @Nonnull
  public static JSFieldRef screenAvailHeight ()
  {
    return screen ().ref ("availHeight");
  }

  @Nonnull
  public static JSFieldRef screenAvailWidth ()
  {
    return screen ().ref ("availWidth");
  }

  @Nonnull
  public static JSFieldRef screenColorDepth ()
  {
    return screen ().ref ("colorDepth");
  }

  @Nonnull
  public static JSFieldRef screenHeight ()
  {
    return screen ().ref ("height");
  }

  @Nonnull
  public static JSFieldRef screenPixelDepth ()
  {
    return screen ().ref ("pixelDepth");
  }

  @Nonnull
  public static JSFieldRef screenWidth ()
  {
    return screen ().ref ("width");
  }

  // --- window ---

  @Nonnull
  public static JSFieldRef window ()
  {
    return JSExpr.ref ("window");
  }

  @Nonnull
  public static JSFieldRef windowClosed ()
  {
    return window ().ref ("closed");
  }

  @Nonnull
  public static JSFieldRef windowInnerHeight ()
  {
    return window ().ref ("innerHeight");
  }

  @Nonnull
  public static JSFieldRef windowInnerWidth ()
  {
    return window ().ref ("innerWidth");
  }

  @Nonnull
  public static JSFieldRef windowName ()
  {
    return window ().ref ("name");
  }

  @Nonnull
  public static JSFieldRef windowOuterHeight ()
  {
    return window ().ref ("outerHeight");
  }

  @Nonnull
  public static JSFieldRef windowOuterWidth ()
  {
    return window ().ref ("outerWidth");
  }

  @Nonnull
  public static JSFieldRef windowPageXOffset ()
  {
    return window ().ref ("pageXOffset");
  }

  @Nonnull
  public static JSFieldRef windowPageYOffset ()
  {
    return window ().ref ("pageYOffset");
  }

  @Nonnull
  public static JSFieldRef windowParent ()
  {
    return window ().ref ("parent");
  }

  @Nonnull
  public static JSInvocation windowPrint ()
  {
    return window ().invoke ("print");
  }

  @Nonnull
  public static JSFieldRef windowStatus ()
  {
    return window ().ref ("status");
  }

  // -- others ---

  /**
   * @return <code>this.options[this.selectedIndex].value</code>
   */
  @Nonnull
  public static JSFieldRef getSelectSelectedValue ()
  {
    return getSelectSelectedValue (JSExpr.THIS);
  }

  /**
   * @return <code>aExpr.options[aExpr.selectedIndex].value</code>
   */
  @Nonnull
  public static JSFieldRef getSelectSelectedValue (@Nonnull final IJSExpression aExpr)
  {
    return aExpr.ref ("options").component (aExpr.ref ("selectedIndex")).ref ("value");
  }
}
