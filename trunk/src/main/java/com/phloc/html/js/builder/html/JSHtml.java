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
package com.phloc.html.js.builder.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.PresentForCodeCoverage;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.EHTMLElement;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAssignment;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSInvocation;
import com.phloc.html.js.builder.JSRef;

/**
 * This class contains JS builder default constructs that are used very commonly
 * 
 * @author philip
 */
@Immutable
public final class JSHtml
{
  @PresentForCodeCoverage
  @SuppressWarnings ("unused")
  private static final JSHtml s_aInstance = new JSHtml ();

  private JSHtml ()
  {}

  // --- console ---

  /**
   * @return Global console object
   * @see #windowConsole()
   */
  @Nonnull
  public static JSRef console ()
  {
    return JSExpr.ref ("console");
  }

  @Nonnull
  public static JSInvocation consoleAssert ()
  {
    return console ().invoke ("assert");
  }

  @Nonnull
  public static JSInvocation consoleClear ()
  {
    return console ().invoke ("clear");
  }

  @Nonnull
  public static JSInvocation consoleDebug ()
  {
    return console ().invoke ("debug");
  }

  @Nonnull
  public static JSInvocation consoleError ()
  {
    return console ().invoke ("error");
  }

  @Nonnull
  public static JSInvocation consoleInfo ()
  {
    return console ().invoke ("info");
  }

  @Nonnull
  public static JSInvocation consoleLog ()
  {
    return console ().invoke ("log");
  }

  @Nonnull
  public static JSInvocation consoleLog (@Nullable final String sText)
  {
    return consoleLog ().arg (sText);
  }

  @Nonnull
  public static JSInvocation consoleLog (@Nonnull final IJSExpression aExpr)
  {
    return consoleLog ().arg (aExpr);
  }

  @Nonnull
  public static JSInvocation consoleWarn ()
  {
    return console ().invoke ("warn");
  }

  // --- document ---

  /**
   * @return Global document object
   * @see #windowDocument()
   */
  @Nonnull
  public static JSRef document ()
  {
    return JSExpr.ref ("document");
  }

  @Nonnull
  public static JSFieldRef documentAnchors ()
  {
    return document ().ref ("anchors");
  }

  @Nonnull
  public static JSInvocation documentCreateAttribute ()
  {
    return document ().invoke ("createAttribute");
  }

  @Nonnull
  public static JSInvocation documentCreateElement ()
  {
    return document ().invoke ("createElement");
  }

  @Nonnull
  public static JSInvocation documentCreateElement (@Nonnull final EHTMLElement eHTMLElement)
  {
    return documentCreateElement ().arg (eHTMLElement);
  }

  @Nonnull
  public static JSInvocation documentCreateTextNode ()
  {
    return document ().invoke ("createTextNode");
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
  public static JSInvocation documentGetElementsByName (@Nonnull final EHTMLElement eHTMLElement)
  {
    return documentGetElementsByName (eHTMLElement.getElementName ());
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
  public static JSInvocation documentGetElementsByTagName (@Nonnull final EHTMLElement eHTMLElement)
  {
    return documentGetElementsByTagName (eHTMLElement.getElementName ());
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
  public static JSRef event ()
  {
    return JSExpr.ref ("event");
  }

  // --- history ---

  /**
   * @return The history object
   * @see #windowHistory()
   */
  @Nonnull
  public static JSRef history ()
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

  // --- navigator ---

  /**
   * @return Global navigator object
   * @see #windowNavigator()
   */
  @Nonnull
  public static JSRef navigator ()
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
  public static JSFieldRef navigatorOnLine ()
  {
    return navigator ().ref ("onLine");
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

  /*
   * IE and Opera only
   */
  @Nonnull
  public static JSInvocation navigatorTaintEnabled ()
  {
    return navigator ().invoke ("taintEnabled");
  }

  // --- screen ---

  /**
   * @return Global screen object
   * @see #windowScreen()
   */
  @Nonnull
  public static JSRef screen ()
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
  public static JSRef window ()
  {
    return JSExpr.ref ("window");
  }

  @Nonnull
  public static JSInvocation windowAlert ()
  {
    return window ().invoke ("alert");
  }

  @Nonnull
  public static JSInvocation windowAlert (@Nullable final String sMessage)
  {
    return windowAlert ().arg (sMessage);
  }

  @Nonnull
  public static JSInvocation windowBlur ()
  {
    return window ().invoke ("blur");
  }

  @Nonnull
  public static JSInvocation windowClearInterval ()
  {
    return window ().invoke ("clearInterval");
  }

  @Nonnull
  public static JSInvocation windowClearTimeout ()
  {
    return window ().invoke ("clearTimeout");
  }

  @Nonnull
  public static JSInvocation windowClose ()
  {
    return window ().invoke ("close");
  }

  @Nonnull
  public static JSFieldRef windowClosed ()
  {
    return window ().ref ("closed");
  }

  @Nonnull
  public static JSInvocation windowConfirm ()
  {
    return window ().invoke ("confirm");
  }

  @Nonnull
  public static JSFieldRef windowConsole ()
  {
    return window ().ref ("console");
  }

  @Nonnull
  public static JSInvocation windowCreatePopup ()
  {
    return window ().invoke ("createPopup");
  }

  @Nonnull
  public static JSFieldRef windowDefaultStatus ()
  {
    return window ().ref ("defaultStatus");
  }

  @Nonnull
  public static JSFieldRef windowDocument ()
  {
    return window ().ref ("document");
  }

  @Nonnull
  public static JSInvocation windowFocus ()
  {
    return window ().invoke ("focus");
  }

  @Nonnull
  public static JSFieldRef windowFrames ()
  {
    return window ().ref ("frames");
  }

  @Nonnull
  public static JSFieldRef windowHistory ()
  {
    return window ().ref ("history");
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
  public static JSFieldRef windowLength ()
  {
    return window ().ref ("length");
  }

  @Nonnull
  public static JSFieldRef windowLocation ()
  {
    return window ().ref ("location");
  }

  @Nonnull
  public static JSFieldRef windowLocationHash ()
  {
    return windowLocation ().ref ("hash");
  }

  @Nonnull
  public static JSFieldRef windowLocationHost ()
  {
    return windowLocation ().ref ("host");
  }

  @Nonnull
  public static JSFieldRef windowLocationHostname ()
  {
    return windowLocation ().ref ("hostname");
  }

  @Nonnull
  public static JSFieldRef windowLocationHref ()
  {
    return windowLocation ().ref ("href");
  }

  @Nonnull
  public static JSAssignment windowLocationHref (@Nonnull final ISimpleURL aURL)
  {
    return windowLocationHref ().assign (aURL.getAsString ());
  }

  @Nonnull
  public static JSFieldRef windowLocationPathname ()
  {
    return windowLocation ().ref ("pathname");
  }

  @Nonnull
  public static JSFieldRef windowLocationPort ()
  {
    return windowLocation ().ref ("port");
  }

  @Nonnull
  public static JSFieldRef windowLocationProtocol ()
  {
    return windowLocation ().ref ("protocol");
  }

  @Nonnull
  public static JSInvocation windowLocationReload ()
  {
    return windowLocation ().invoke ("reload");
  }

  @Nonnull
  public static JSInvocation windowLocationReplace (@Nonnull final ISimpleURL aURL)
  {
    return windowLocationReplace (JSExpr.lit (aURL.getAsString ()));
  }

  @Nonnull
  public static JSInvocation windowLocationReplace (@Nonnull final IJSExpression aURL)
  {
    return windowLocation ().invoke ("replace").arg (aURL);
  }

  @Nonnull
  public static JSFieldRef windowLocationSearch ()
  {
    return windowLocation ().ref ("search");
  }

  @Nonnull
  public static JSInvocation windowMoveBy ()
  {
    return window ().invoke ("moveBy");
  }

  @Nonnull
  public static JSInvocation windowMoveTo ()
  {
    return window ().invoke ("moveTo");
  }

  @Nonnull
  public static JSFieldRef windowName ()
  {
    return window ().ref ("name");
  }

  @Nonnull
  public static JSFieldRef windowNavigator ()
  {
    return window ().ref ("navigator");
  }

  @Nonnull
  public static JSInvocation windowOpen ()
  {
    return window ().invoke ("open");
  }

  @Nonnull
  public static JSFieldRef windowOpener ()
  {
    return window ().ref ("opener");
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
  public static JSFieldRef windowParentFrames ()
  {
    return windowParent ().ref ("frames");
  }

  @Nonnull
  public static JSInvocation windowPrint ()
  {
    return window ().invoke ("print");
  }

  @Nonnull
  public static JSInvocation windowPrompt ()
  {
    return window ().invoke ("prompt");
  }

  @Nonnull
  public static JSInvocation windowResizeBy ()
  {
    return window ().invoke ("resizeBy");
  }

  @Nonnull
  public static JSInvocation windowResizeTo ()
  {
    return window ().invoke ("resizeTo");
  }

  @Nonnull
  public static JSFieldRef windowScreen ()
  {
    return window ().ref ("screen");
  }

  @Nonnull
  public static JSFieldRef windowScreenLeft ()
  {
    return window ().ref ("screenLeft");
  }

  @Nonnull
  public static JSFieldRef windowScreenTop ()
  {
    return window ().ref ("screenTop");
  }

  @Nonnull
  public static JSFieldRef windowScreenX ()
  {
    return window ().ref ("screenX");
  }

  @Nonnull
  public static JSFieldRef windowScreenY ()
  {
    return window ().ref ("screenY");
  }

  @Nonnull
  public static JSInvocation windowScroll ()
  {
    return window ().invoke ("scroll");
  }

  @Nonnull
  public static JSInvocation windowScrollBy ()
  {
    return window ().invoke ("scrollBy");
  }

  @Nonnull
  public static JSInvocation windowScrollTo ()
  {
    return window ().invoke ("scrollTo");
  }

  @Nonnull
  public static JSFieldRef windowSelf ()
  {
    return window ().ref ("self");
  }

  @Nonnull
  public static JSInvocation windowSetInterval ()
  {
    return window ().invoke ("setInterval");
  }

  @Nonnull
  public static JSInvocation windowSetTimeout ()
  {
    return window ().invoke ("setTimeout");
  }

  @Nonnull
  public static JSFieldRef windowStatus ()
  {
    return window ().ref ("status");
  }

  @Nonnull
  public static JSFieldRef windowTop ()
  {
    return window ().ref ("top");
  }

  @Nonnull
  public static JSFieldRef windowOnbeforeunload ()
  {
    return window ().ref ("onbeforeunload");
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
