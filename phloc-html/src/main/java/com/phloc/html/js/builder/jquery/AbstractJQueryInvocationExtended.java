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
package com.phloc.html.js.builder.jquery;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCSettings;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFunction;

/**
 * Special invocation semantics for jQuery
 * 
 * @author Philip Helger
 */
public abstract class AbstractJQueryInvocationExtended <IMPLTYPE extends AbstractJQueryInvocationExtended <IMPLTYPE>> extends AbstractJQueryInvocation <IMPLTYPE>
{
  public AbstractJQueryInvocationExtended (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  public AbstractJQueryInvocationExtended (@Nullable final IJSExpression aLhs, @Nonnull @Nonempty final String sMethod)
  {
    super (aLhs, sMethod);
  }

  /**
   * @return The invocation of the jQuery function <code>add()</code>
   */
  @Nonnull
  public IMPLTYPE add (@Nonnull final IJQuerySelector aSelector)
  {
    return add ().arg (aSelector);
  }

  /**
   * @param aCSSClass
   *        The class to add. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>addClass()</code>
   */
  @Nonnull
  public IMPLTYPE addClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return addClass (aCSSClass.getCSSClass ());
  }

  /**
   * @param sCSSClass
   *        The class to add. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>addClass()</code>
   */
  @Nonnull
  public IMPLTYPE addClass (@Nonnull @Nonempty final String sCSSClass)
  {
    return addClass ().arg (sCSSClass);
  }

  /**
   * @param sHTML
   *        the HTML code to be appended
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>append()</code>
   */
  @Nonnull
  final public IMPLTYPE append (@Nonnull final String sHTML)
  {
    return append ().arg (sHTML);
  }

  /**
   * @param aNode
   *        the HC node to be appended
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>append()</code>
   */
  @Nonnull
  final public IMPLTYPE append (@Nonnull final IHCNode aNode)
  {
    return append (HCSettings.getAsHTMLStringWithoutNamespaces (aNode));
  }

  /**
   * @param aContent
   *        the content to be appended
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>append()</code>
   */
  @Nonnull
  final public IMPLTYPE append (@Nonnull final IJSExpression aContent)
  {
    return append ().arg (aContent);
  }

  /**
   * @param aExpr
   *        Target to append to
   * @return The invocation of the jQuery function <code>appendTo()</code>
   */
  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final IJSExpression aExpr)
  {
    return appendTo ().arg (aExpr);
  }

  /**
   * @param sAttrName
   *        The name of the attribute
   * @return The invocation of the jQuery function <code>attr()</code>
   */
  @Nonnull
  public IMPLTYPE attr (@Nonnull @Nonempty final String sAttrName)
  {
    return attr ().arg (sAttrName);
  }

  /**
   * @param sAttrName
   *        The name of the attribute
   * @param aAttrValue
   *        Attribute value
   * @return The invocation of the jQuery function <code>attr()</code>
   */
  @Nonnull
  public IMPLTYPE attr (@Nonnull @Nonempty final String sAttrName, @Nonnull final IJSExpression aAttrValue)
  {
    return attr ().arg (sAttrName).arg (aAttrValue);
  }

  /**
   * @param aExpr
   *        Either the name of the attribute or a map with attributes to set.
   * @return The invocation of the jQuery function <code>attr()</code>
   */
  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression aExpr)
  {
    return attr ().arg (aExpr);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>blur()</code>
   */
  @Nonnull
  public IMPLTYPE blur (@Nonnull final JSAnonymousFunction aHandler)
  {
    return blur ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>change()</code>
   */
  @Nonnull
  public IMPLTYPE change (@Nonnull final JSAnonymousFunction aHandler)
  {
    return change ().arg (aHandler);
  }

  /**
   * @param aSelector
   *        Selector to use
   * @return The invocation of the jQuery function <code>children()</code>
   */
  @Nonnull
  public IMPLTYPE children (@Nonnull final IJQuerySelector aSelector)
  {
    return children ().arg (aSelector.invoke ());
  }

  /**
   * This method is a shortcut for <code>.on('click', handler)</code>
   * 
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>click()</code>
   * @since jQuery 1.0
   */
  @Nonnull
  public IMPLTYPE click (@Nonnull final JSAnonymousFunction aHandler)
  {
    return click ().arg (aHandler);
  }

  /**
   * @param eHTMLElement
   *        HTML element to retrieve
   * @return The invocation of the jQuery function <code>closest()</code>
   */
  @Nonnull
  public IMPLTYPE closest (@Nonnull final EHTMLElement eHTMLElement)
  {
    return closest (JQuerySelector.element (eHTMLElement));
  }

  /**
   * @param aSelector
   *        Selector to use
   * @return The invocation of the jQuery function <code>closest()</code>
   */
  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJQuerySelector aSelector)
  {
    return closest ().arg (aSelector);
  }

  /**
   * @param sKey
   *        data attribute to query
   * @return The invocation of the jQuery function <code>data()</code>
   */
  @Nonnull
  public IMPLTYPE data (@Nonnull final String sKey)
  {
    return data (JSExpr.lit (sKey));
  }

  /**
   * @param aExpr
   *        data attribute to query
   * @return The invocation of the jQuery function <code>data()</code>
   */
  @Nonnull
  public IMPLTYPE data (@Nonnull final IJSExpression aExpr)
  {
    return data ().arg (aExpr);
  }

  /**
   * @param sKey
   *        data attribute to query
   * @param aValue
   *        data attribute value
   * @return The invocation of the jQuery function <code>data()</code>
   */
  @Nonnull
  public IMPLTYPE data (@Nonnull final String sKey, @Nonnull final IJSExpression aValue)
  {
    return data (JSExpr.lit (sKey), aValue);
  }

  /**
   * @param aExpr
   *        data attribute to query
   * @param aValue
   *        data attribute value
   * @return The invocation of the jQuery function <code>data()</code>
   */
  @Nonnull
  public IMPLTYPE data (@Nonnull final IJSExpression aExpr, @Nonnull final IJSExpression aValue)
  {
    return data ().arg (aExpr).arg (aValue);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>dblclick()</code>
   */
  @Nonnull
  public IMPLTYPE dblclick (@Nonnull final JSAnonymousFunction aHandler)
  {
    return dblclick ().arg (aHandler);
  }

  /**
   * @return The invocation of the jQuery function <code>each()</code>
   */
  @Nonnull
  public IMPLTYPE each (@Nonnull final JSAnonymousFunction aFunc)
  {
    return each ().arg (aFunc);
  }

  /**
   * @param nIndex
   *        Index to use
   * @return The invocation of the jQuery function <code>eq()</code>
   */
  @Nonnull
  public IMPLTYPE _eq (@Nonnull final int nIndex)
  {
    return _eq (JSExpr.lit (nIndex));
  }

  /**
   * @param aExpr
   *        Expression as parameter
   * @return The invocation of the jQuery function <code>eq()</code>
   */
  @Nonnull
  public IMPLTYPE _eq (@Nonnull final IJSExpression aExpr)
  {
    return _eq ().arg (aExpr);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>error()</code>
   */
  @Nonnull
  @Deprecated
  public IMPLTYPE error (@Nonnull final JSAnonymousFunction aHandler)
  {
    return error ().arg (aHandler);
  }

  /**
   * @return The invocation of the jQuery function <code>find()</code>
   */
  @Nonnull
  public IMPLTYPE find (@Nonnull final EHTMLElement eHTMLElement)
  {
    return find (JQuerySelector.element (eHTMLElement));
  }

  /**
   * @return The invocation of the jQuery function <code>find()</code>
   */
  @Nonnull
  public IMPLTYPE find (@Nonnull final IJQuerySelector aSelector)
  {
    return find ().arg (aSelector);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>focus()</code>
   */
  @Nonnull
  public IMPLTYPE focus (@Nonnull final JSAnonymousFunction aHandler)
  {
    return focus ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>focusin()</code>
   */
  @Nonnull
  public IMPLTYPE focusin (@Nonnull final JSAnonymousFunction aHandler)
  {
    return focusin ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>focusout()</code>
   */
  @Nonnull
  public IMPLTYPE focusout (@Nonnull final JSAnonymousFunction aHandler)
  {
    return focusout ().arg (aHandler);
  }

  /**
   * @param nIndex
   *        The index to get. Must be &ge; 0.
   * @return The invocation of the jQuery function <code>get()</code>
   */
  @Nonnull
  public IMPLTYPE get (@Nonnegative final int nIndex)
  {
    return get ().arg (nIndex);
  }

  /**
   * @param aCSSClass
   *        The class to check. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>hasClass
   */
  @Nonnull
  public IMPLTYPE hasClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return hasClass (aCSSClass.getCSSClass ());
  }

  /**
   * @param sCSSClass
   *        The class to check. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>hasClass()</code>
   */
  @Nonnull
  public IMPLTYPE hasClass (@Nonnull @Nonempty final String sCSSClass)
  {
    return hasClass ().arg (sCSSClass);
  }

  /**
   * @param aSelector
   *        Selector to use
   * @return The invocation of the jQuery function <code>index()</code>
   */
  @Nonnull
  public IMPLTYPE index (@Nonnull final IJQuerySelector aSelector)
  {
    return index ().arg (aSelector);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>keydown()</code>
   */
  @Nonnull
  public IMPLTYPE keydown (@Nonnull final JSAnonymousFunction aHandler)
  {
    return keydown ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>keypress()</code>
   */
  @Nonnull
  public IMPLTYPE keypress (@Nonnull final JSAnonymousFunction aHandler)
  {
    return keypress ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>keyup()</code>
   */
  @Nonnull
  public IMPLTYPE keyup (@Nonnull final JSAnonymousFunction aHandler)
  {
    return keyup ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mousedown()</code>
   */
  @Nonnull
  public IMPLTYPE mousedown (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mousedown ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mouseenter()</code>
   */
  @Nonnull
  public IMPLTYPE mouseenter (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mouseenter ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mouseleave()</code>
   */
  @Nonnull
  public IMPLTYPE mouseleave (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mouseleave ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mousemove()</code>
   */
  @Nonnull
  public IMPLTYPE mousemove (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mousemove ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mouseout()</code>
   */
  @Nonnull
  public IMPLTYPE mouseout (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mouseout ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mouseover()</code>
   */
  @Nonnull
  public IMPLTYPE mouseover (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mouseover ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>mouseup()</code>
   */
  @Nonnull
  public IMPLTYPE mouseup (@Nonnull final JSAnonymousFunction aHandler)
  {
    return mouseup ().arg (aHandler);
  }

  /**
   * Added in jQuery 1.7
   * 
   * @param sEventName
   *        The event name to be bound
   * @return The invocation of the jQuery function <code>on()</code>
   */
  @Nonnull
  public IMPLTYPE on (@Nonnull final String sEventName)
  {
    return on ().arg (sEventName);
  }

  /**
   * Added in jQuery 1.7
   * 
   * @return The invocation of the jQuery function <code>on('click')</code>
   * @see #on()
   */
  @Nonnull
  public IMPLTYPE onClick ()
  {
    return on ("click");
  }

  /**
   * Added in jQuery 1.7
   * 
   * @return The invocation of the jQuery function <code>on('click')</code>
   * @see #on()
   */
  @Nonnull
  public IMPLTYPE onClick (@Nonnull final IJQuerySelector aSelector, @Nonnull final JSAnonymousFunction aData)
  {
    return onClick ().arg (aSelector).arg (aData);
  }

  /**
   * Added in jQuery 1.7
   * 
   * @return The invocation of the jQuery function <code>on('click')</code>
   * @see #on()
   */
  @Nonnull
  public IMPLTYPE onClick (@Nonnull final JQuerySelectorList aSelector, @Nonnull final JSAnonymousFunction aData)
  {
    return onClick ().arg (aSelector).arg (aData);
  }

  /**
   * Added in jQuery 1.7
   * 
   * @return The invocation of the jQuery function <code>on('select')</code>
   * @see #on()
   */
  @Nonnull
  public IMPLTYPE onSelect ()
  {
    return on ("select");
  }

  /**
   * Added in jQuery 1.7
   * 
   * @return The invocation of the jQuery function <code>on('submit')</code>
   * @see #on()
   */
  @Nonnull
  public IMPLTYPE onSubmit ()
  {
    return on ("submit");
  }

  /**
   * Get the matching parent element.
   * 
   * @since jQuery 1.0
   * @param aSelector
   *        The selector to use
   * @return The invocation of the jQuery function <code>parent()</code>
   */
  @Nonnull
  public IMPLTYPE parent (@Nonnull final IJQuerySelector aSelector)
  {
    return parent ().arg (aSelector);
  }

  /**
   * Get the matching parent element.
   * 
   * @since jQuery 1.0
   * @param eHTMLElement
   *        The HTML element to retrieve
   * @return The invocation of the jQuery function <code>parent()</code>
   */
  @Nonnull
  public IMPLTYPE parent (@Nonnull final EHTMLElement eHTMLElement)
  {
    return parent (JQuerySelector.element (eHTMLElement));
  }

  /**
   * Get the matching parent elements.
   * 
   * @since jQuery 1.0
   * @param aSelector
   *        The selector to use
   * @return The invocation of the jQuery function <code>parents()</code>
   */
  @Nonnull
  public IMPLTYPE parents (@Nonnull final IJQuerySelector aSelector)
  {
    return parents ().arg (aSelector);
  }

  /**
   * Get the matching parent elements.
   * 
   * @since jQuery 1.0
   * @param eHTMLElement
   *        The HTML elements to retrieve
   * @return The invocation of the jQuery function <code>parents()</code>
   */
  @Nonnull
  public IMPLTYPE parents (@Nonnull final EHTMLElement eHTMLElement)
  {
    return parents (JQuerySelector.element (eHTMLElement));
  }

  /**
   * @param sHTML
   *        the HTML code to be prepended
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>prepend()</code>
   */
  @Nonnull
  final public IMPLTYPE prepend (@Nonnull final String sHTML)
  {
    return prepend ().arg (sHTML);
  }

  /**
   * @param aNode
   *        the HC node to be prepended
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>prepend()</code>
   */
  @Nonnull
  final public IMPLTYPE prepend (@Nonnull final IHCNode aNode)
  {
    return prepend (HCSettings.getAsHTMLStringWithoutNamespaces (aNode));
  }

  /**
   * @param aContent
   *        the node to be prepended
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>prepend()</code>
   */
  @Nonnull
  final public IMPLTYPE prepend (@Nonnull final IJSExpression aContent)
  {
    return prepend ().arg (aContent);
  }

  /**
   * @since jQuery 1.6
   * @return The invocation of the jQuery function <code>prop('checked')</code>
   */
  @Nonnull
  public IMPLTYPE propChecked ()
  {
    return prop ().arg ("checked");
  }

  /**
   * @param aCallback
   *        The callback to be invoked on document.ready() May not be
   *        <code>null</code>.
   * @return The invocation of the jQuery function <code>ready()</code>
   */
  @Nonnull
  public IMPLTYPE ready (@Nonnull final JSAnonymousFunction aCallback)
  {
    return ready ().arg (aCallback);
  }

  /**
   * @param aCSSClass
   *        The class to remove. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>removeClass()</code>
   */
  @Nonnull
  public IMPLTYPE removeClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return removeClass (aCSSClass.getCSSClass ());
  }

  /**
   * @param sCSSClass
   *        The class to remove. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>removeClass()</code>
   */
  @Nonnull
  public IMPLTYPE removeClass (@Nonnull @Nonempty final String sCSSClass)
  {
    return removeClass ().arg (sCSSClass);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>resize()</code>
   */
  @Nonnull
  public IMPLTYPE resize (@Nonnull final JSAnonymousFunction aHandler)
  {
    return resize ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>scroll()</code>
   */
  @Nonnull
  public IMPLTYPE scroll (@Nonnull final JSAnonymousFunction aHandler)
  {
    return scroll ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>select()</code>
   */
  @Nonnull
  public IMPLTYPE select (@Nonnull final JSAnonymousFunction aHandler)
  {
    return select ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>submit()</code>
   */
  @Nonnull
  public IMPLTYPE submit (@Nonnull final JSAnonymousFunction aHandler)
  {
    return submit ().arg (aHandler);
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>toggle()</code>
   */
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction aHandler)
  {
    return toggle ().arg (aHandler);
  }

  /**
   * @param aCSSClass
   *        The class to toggle. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>toggleClass()</code>
   */
  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return toggleClass (aCSSClass.getCSSClass ());
  }

  /**
   * @param sCSSClass
   *        The class to toggle. May not be <code>null</code>.
   * @return The invocation of the jQuery function <code>toggleClass()</code>
   */
  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull @Nonempty final String sCSSClass)
  {
    return toggleClass ().arg (sCSSClass);
  }

  /**
   * @param nValue
   *        The value to be used as an argument to <code>val()</code>
   * @return The invocation of the jQuery function <code>val()</code>
   */
  @Nonnull
  public IMPLTYPE val (@Nonnull final int nValue)
  {
    return val (JSExpr.lit (nValue));
  }

  /**
   * @param nValue
   *        The value to be used as an argument to <code>val()</code>
   * @return The invocation of the jQuery function <code>val()</code>
   */
  @Nonnull
  public IMPLTYPE val (@Nonnull final long nValue)
  {
    return val (JSExpr.lit (nValue));
  }

  /**
   * @param sValue
   *        The value to be used as an argument to <code>val()</code>
   * @return The invocation of the jQuery function <code>val()</code>
   */
  @Nonnull
  public IMPLTYPE val (@Nonnull final String sValue)
  {
    return val (JSExpr.lit (sValue));
  }

  /**
   * @param aExpr
   *        The expression to be used as an argument to <code>val()</code>
   * @return The invocation of the jQuery function <code>val()</code>
   */
  @Nonnull
  public IMPLTYPE val (@Nonnull final IJSExpression aExpr)
  {
    return val ().arg (aExpr);
  }

  // Custom provided methods from jquery-utils.js in phloc-webctrls

  /**
   * @return The invocation of the custom jQuery function <code>enable()</code>
   */
  @Nonnull
  public IMPLTYPE enable ()
  {
    return jqinvoke ("enable");
  }

  /**
   * @return The invocation of the custom jQuery function <code>disable()</code>
   */
  @Nonnull
  public IMPLTYPE disable ()
  {
    return jqinvoke ("disable");
  }

  /**
   * @return The invocation of the custom jQuery function
   *         <code>setDisabled()</code>
   */
  @Nonnull
  public IMPLTYPE setDisabled ()
  {
    return jqinvoke ("setDisabled");
  }

  /**
   * @return The invocation of the custom jQuery function
   *         <code>setDisabled()</code>
   */
  @Nonnull
  public IMPLTYPE setDisabled (final boolean bDisabled)
  {
    return setDisabled (JSExpr.lit (bDisabled));
  }

  /**
   * @return The invocation of the custom jQuery function
   *         <code>setDisabled()</code>
   */
  @Nonnull
  public IMPLTYPE setDisabled (@Nonnull final IJSExpression aExpr)
  {
    return setDisabled ().arg (aExpr);
  }

  /**
   * @return The invocation of the custom jQuery function <code>check()</code>
   */
  @Nonnull
  public IMPLTYPE check ()
  {
    return jqinvoke ("check");
  }

  /**
   * @return The invocation of the custom jQuery function <code>uncheck()</code>
   */
  @Nonnull
  public IMPLTYPE uncheck ()
  {
    return jqinvoke ("uncheck");
  }

  /**
   * @return The invocation of the custom jQuery function
   *         <code>setChecked()</code>
   */
  @Nonnull
  public IMPLTYPE setChecked ()
  {
    return jqinvoke ("setChecked");
  }

  /**
   * @return The invocation of the custom jQuery function
   *         <code>setChecked()</code>
   */
  @Nonnull
  public IMPLTYPE setChecked (final boolean bChecked)
  {
    return setChecked (JSExpr.lit (bChecked));
  }

  /**
   * @return The invocation of the custom jQuery function
   *         <code>setChecked()</code>
   */
  @Nonnull
  public IMPLTYPE setChecked (@Nonnull final IJSExpression aExpr)
  {
    return setChecked ().arg (aExpr);
  }
}
