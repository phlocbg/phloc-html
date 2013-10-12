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
import com.phloc.html.js.builder.AbstractJSInvocation;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSFunction;

/**
 * Special invocation semantics for jQuery
 * 
 * @author Philip Helger
 */
public abstract class AbstractJQueryInvocation <IMPLTYPE extends AbstractJQueryInvocation <IMPLTYPE>> extends AbstractJSInvocation <IMPLTYPE>
{
  public AbstractJQueryInvocation (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  public AbstractJQueryInvocation (@Nullable final IJSExpression aLhs, @Nonnull @Nonempty final String sMethod)
  {
    super (aLhs, sMethod);
  }

  /**
   * Invoke an arbitrary function on this jQuery object.
   * 
   * @param sMethod
   *        The method to be invoked. May neither be <code>null</code> nor
   *        empty.
   * @return A new jQuery invocation object. Never <code>null</code>.
   */
  @Nonnull
  public abstract IMPLTYPE jqinvoke (@Nonnull @Nonempty final String sMethod);

  /**
   * Adds a JQuery selector as a string argument.
   * 
   * @param aArgument
   *        value to be added as an argument
   * @return this
   */
  @Nonnull
  public IMPLTYPE arg (@Nullable final IJQuerySelector aArgument)
  {
    return aArgument == null ? argNull () : arg (aArgument.getExpression ());
  }

  /**
   * Adds a JQuery selector list as a string argument.
   * 
   * @param aArgument
   *        value to be added as an argument
   * @return this
   */
  @Nonnull
  public IMPLTYPE arg (@Nullable final JQuerySelectorList aArgument)
  {
    return aArgument == null ? argNull () : arg (aArgument.getAsExpression ());
  }

  // Properties of jQuery Object Instances

  /**
   * @return The invocation of the jQuery function <code>context()</code>
   * @since jQuery 1.3
   * @deprecated Deprecated since jQuery 1.10
   */
  @Deprecated
  @Nonnull
  public JSFieldRef context ()
  {
    return ref ("context");
  }

  /**
   * @return The invocation of the jQuery field <code>jquery</code>
   */
  @Nonnull
  public JSFieldRef jquery ()
  {
    return ref ("jquery");
  }

  /**
   * @return The invocation of the jQuery field <code>length()</code>
   */
  @Nonnull
  public JSFieldRef length ()
  {
    return ref ("length");
  }

  // Rest

  /**
   * @return The invocation of the jQuery function <code>add()</code>
   */
  @Nonnull
  public IMPLTYPE add ()
  {
    return jqinvoke ("add");
  }

  /**
   * @return The invocation of the jQuery function <code>addClass()</code>
   */
  @Nonnull
  public IMPLTYPE addClass ()
  {
    return jqinvoke ("addClass");
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
   * @return The invocation of the jQuery function <code>after()</code>
   */
  @Nonnull
  public IMPLTYPE after ()
  {
    return jqinvoke ("after");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxComplete()</code>
   */
  @Nonnull
  public IMPLTYPE ajaxComplete ()
  {
    return jqinvoke ("ajaxComplete");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxError()</code>
   */
  @Nonnull
  public IMPLTYPE ajaxError ()
  {
    return jqinvoke ("ajaxError");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxSend()</code>
   */
  @Nonnull
  public IMPLTYPE ajaxSend ()
  {
    return jqinvoke ("ajaxSend");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxStart()</code>
   */
  @Nonnull
  public IMPLTYPE ajaxStart ()
  {
    return jqinvoke ("ajaxStart");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxStop()</code>
   */
  @Nonnull
  public IMPLTYPE ajaxStop ()
  {
    return jqinvoke ("ajaxStop");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxSuccess()</code>
   */
  @Nonnull
  public IMPLTYPE ajaxSuccess ()
  {
    return jqinvoke ("ajaxSuccess");
  }

  /**
   * @return The invocation of the jQuery function <code>andSelf()</code>
   */
  @Nonnull
  public IMPLTYPE andSelf ()
  {
    return jqinvoke ("andSelf");
  }

  /**
   * @return The invocation of the jQuery function <code>animate()</code>
   */
  @Nonnull
  public IMPLTYPE animate ()
  {
    return jqinvoke ("animate");
  }

  /**
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>append()</code>
   */
  @Nonnull
  public IMPLTYPE append ()
  {
    return jqinvoke ("append");
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
   * @return The invocation of the jQuery function <code>appendTo()</code>
   */
  @Nonnull
  public IMPLTYPE appendTo ()
  {
    return jqinvoke ("appendTo");
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
   * @return The invocation of the jQuery function <code>attr()</code>
   */
  @Nonnull
  public IMPLTYPE attr ()
  {
    return jqinvoke ("attr");
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
   * @return The invocation of the jQuery function <code>before()</code>
   */
  @Nonnull
  public IMPLTYPE before ()
  {
    return jqinvoke ("before");
  }

  /**
   * @return The invocation of the jQuery function <code>bind()</code>
   */
  @Nonnull
  public IMPLTYPE bind ()
  {
    return jqinvoke ("bind");
  }

  /**
   * @return The invocation of the jQuery function <code>blur()</code>
   */
  @Nonnull
  public IMPLTYPE blur ()
  {
    return jqinvoke ("blur");
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
   * @return The invocation of the jQuery function <code>change()</code>
   */
  @Nonnull
  public IMPLTYPE change ()
  {
    return jqinvoke ("change");
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
   * @return The invocation of the jQuery function <code>children()</code>
   */
  @Nonnull
  public IMPLTYPE children ()
  {
    return jqinvoke ("children");
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
   * @return The invocation of the jQuery function <code>clearQueue()</code>
   */
  @Nonnull
  public IMPLTYPE clearQueue ()
  {
    return jqinvoke ("clearQueue");
  }

  /**
   * This method is a shortcut for <code>.on('click', handler)</code>
   * 
   * @return The invocation of the jQuery function <code>click()</code>
   * @since jQuery 1.0
   */
  @Nonnull
  public IMPLTYPE click ()
  {
    return jqinvoke ("click");
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
   * @return The invocation of the jQuery function <code>clone()</code>
   */
  @Nonnull
  public IMPLTYPE _clone ()
  {
    return jqinvoke ("clone");
  }

  /**
   * @return The invocation of the jQuery function <code>closest()</code>
   */
  @Nonnull
  public IMPLTYPE closest ()
  {
    return jqinvoke ("closest");
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
   * @return The invocation of the jQuery function <code>contents()</code>
   */
  @Nonnull
  public IMPLTYPE contents ()
  {
    return jqinvoke ("contents");
  }

  /**
   * @return The invocation of the jQuery function <code>css()</code>
   */
  @Nonnull
  public IMPLTYPE css ()
  {
    return jqinvoke ("css");
  }

  /**
   * @return The invocation of the jQuery function <code>data()</code>
   */
  @Nonnull
  public IMPLTYPE data ()
  {
    return jqinvoke ("data");
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
   * @return The invocation of the jQuery function <code>dblclick()</code>
   */
  @Nonnull
  public IMPLTYPE dblclick ()
  {
    return jqinvoke ("dblclick");
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
   * @return The invocation of the jQuery function <code>delay()</code>
   */
  @Nonnull
  public IMPLTYPE delay ()
  {
    return jqinvoke ("delay");
  }

  /**
   * @return The invocation of the jQuery function <code>delegate()</code>
   */
  @Nonnull
  public IMPLTYPE delegate ()
  {
    return jqinvoke ("delegate");
  }

  /**
   * @return The invocation of the jQuery function <code>dequeue()</code>
   */
  @Nonnull
  public IMPLTYPE dequeue ()
  {
    return jqinvoke ("dequeue");
  }

  /**
   * @return The invocation of the jQuery function <code>detach()</code>
   */
  @Nonnull
  public IMPLTYPE detach ()
  {
    return jqinvoke ("detach");
  }

  /**
   * @return The invocation of the jQuery function <code>die()</code>
   */
  @Nonnull
  public IMPLTYPE die ()
  {
    return jqinvoke ("die");
  }

  /**
   * @return The invocation of the jQuery function <code>each()</code>
   */
  @Nonnull
  public IMPLTYPE each ()
  {
    return jqinvoke ("each");
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
   * @return The invocation of the jQuery function <code>empty()</code>
   */
  @Nonnull
  public IMPLTYPE empty ()
  {
    return jqinvoke ("empty");
  }

  /**
   * @return The invocation of the jQuery function <code>end()</code>
   */
  @Nonnull
  public IMPLTYPE end ()
  {
    return jqinvoke ("end");
  }

  /**
   * @return The invocation of the jQuery function <code>eq()</code>
   */
  @Nonnull
  public IMPLTYPE _eq ()
  {
    return jqinvoke ("eq");
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
   * @return The invocation of the jQuery function <code>error()</code>
   */
  @Nonnull
  public IMPLTYPE error ()
  {
    return jqinvoke ("error");
  }

  /**
   * @param aHandler
   *        callback handler
   * @return The invocation of the jQuery function <code>error()</code>
   */
  @Nonnull
  public IMPLTYPE error (@Nonnull final JSAnonymousFunction aHandler)
  {
    return error ().arg (aHandler);
  }

  /**
   * @return The invocation of the jQuery function <code>fadeIn()</code>
   */
  @Nonnull
  public IMPLTYPE fadeIn ()
  {
    return jqinvoke ("fadeIn");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeOut()</code>
   */
  @Nonnull
  public IMPLTYPE fadeOut ()
  {
    return jqinvoke ("fadeOut");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeTo()</code>
   */
  @Nonnull
  public IMPLTYPE fadeTo ()
  {
    return jqinvoke ("fadeTo");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeToggle()</code>
   */
  @Nonnull
  public IMPLTYPE fadeToggle ()
  {
    return jqinvoke ("fadeToggle");
  }

  /**
   * @return The invocation of the jQuery function <code>filter()</code>
   */
  @Nonnull
  public IMPLTYPE filter ()
  {
    return jqinvoke ("filter");
  }

  /**
   * @return The invocation of the jQuery function <code>find()</code>
   */
  @Nonnull
  public IMPLTYPE find ()
  {
    return jqinvoke ("find");
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
   * @return The invocation of the jQuery function <code>first()</code>
   */
  @Nonnull
  public IMPLTYPE first ()
  {
    return jqinvoke ("first");
  }

  /**
   * @return The invocation of the jQuery function <code>focus()</code>
   */
  @Nonnull
  public IMPLTYPE focus ()
  {
    return jqinvoke ("focus");
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
   * @return The invocation of the jQuery function <code>focusin()</code>
   */
  @Nonnull
  public IMPLTYPE focusin ()
  {
    return jqinvoke ("focusin");
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
   * @return The invocation of the jQuery function <code>focusout()</code>
   */
  @Nonnull
  public IMPLTYPE focusout ()
  {
    return jqinvoke ("focusout");
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
   * @return The invocation of the jQuery function <code>get()</code>
   */
  @Nonnull
  public IMPLTYPE get ()
  {
    return jqinvoke ("get");
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
   * @return The invocation of the jQuery function <code>has()</code>
   */
  @Nonnull
  public IMPLTYPE has ()
  {
    return jqinvoke ("has");
  }

  /**
   * @return The invocation of the jQuery function <code>hasClass()</code>
   */
  @Nonnull
  public IMPLTYPE hasClass ()
  {
    return jqinvoke ("hasClass");
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
   * @return The invocation of the jQuery function <code>height()</code>
   */
  @Nonnull
  public IMPLTYPE height ()
  {
    return jqinvoke ("height");
  }

  /**
   * @return The invocation of the jQuery function <code>hide()</code>
   */
  @Nonnull
  public IMPLTYPE hide ()
  {
    return jqinvoke ("hide");
  }

  /**
   * @return The invocation of the jQuery function <code>hover()</code>
   */
  @Nonnull
  public IMPLTYPE hover ()
  {
    return jqinvoke ("hover");
  }

  /**
   * @return The invocation of the jQuery function <code>html()</code>
   */
  @Nonnull
  public IMPLTYPE html ()
  {
    return jqinvoke ("html");
  }

  /**
   * @return The invocation of the jQuery function <code>index()</code>
   */
  @Nonnull
  public IMPLTYPE index ()
  {
    return jqinvoke ("index");
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
   * @return The invocation of the jQuery function <code>innerHeight()</code>
   */
  @Nonnull
  public IMPLTYPE innerHeight ()
  {
    return jqinvoke ("innerHeight");
  }

  /**
   * @return The invocation of the jQuery function <code>innerWidth()</code>
   */
  @Nonnull
  public IMPLTYPE innerWidth ()
  {
    return jqinvoke ("innerWidth");
  }

  /**
   * @return The invocation of the jQuery function <code>insertAfter()</code>
   */
  @Nonnull
  public IMPLTYPE insertAfter ()
  {
    return jqinvoke ("insertAfter");
  }

  /**
   * @return The invocation of the jQuery function <code>insertBefore()</code>
   */
  @Nonnull
  public IMPLTYPE insertBefore ()
  {
    return jqinvoke ("insertBefore");
  }

  /**
   * @return The invocation of the jQuery function <code>is()</code>
   */
  @Nonnull
  public IMPLTYPE is ()
  {
    return jqinvoke ("is");
  }

  /**
   * @return The invocation of the jQuery function <code>keydown()</code>
   */
  @Nonnull
  public IMPLTYPE keydown ()
  {
    return jqinvoke ("keydown");
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
   * @return The invocation of the jQuery function <code>keypress()</code>
   */
  @Nonnull
  public IMPLTYPE keypress ()
  {
    return jqinvoke ("keypress");
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
   * @return The invocation of the jQuery function <code>keyup()</code>
   */
  @Nonnull
  public IMPLTYPE keyup ()
  {
    return jqinvoke ("keyup");
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
   * @return The invocation of the jQuery function <code>last()</code>
   */
  @Nonnull
  public IMPLTYPE last ()
  {
    return jqinvoke ("last");
  }

  /**
   * Deprecated in jQuery 1.7, removed in 1.9
   * 
   * @return The invocation of the jQuery function <code>live()</code>
   */
  @Nonnull
  @Deprecated
  public IMPLTYPE live ()
  {
    return jqinvoke ("live");
  }

  /**
   * @return The invocation of the jQuery function <code>load()</code>
   */
  @Nonnull
  public IMPLTYPE load ()
  {
    return jqinvoke ("load");
  }

  /**
   * @return The invocation of the jQuery function <code>map()</code>
   */
  @Nonnull
  public IMPLTYPE map ()
  {
    return jqinvoke ("map");
  }

  /**
   * @return The invocation of the jQuery function <code>mousedown()</code>
   */
  @Nonnull
  public IMPLTYPE mousedown ()
  {
    return jqinvoke ("mousedown");
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
   * @return The invocation of the jQuery function <code>mouseenter()</code>
   */
  @Nonnull
  public IMPLTYPE mouseenter ()
  {
    return jqinvoke ("mouseenter");
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
   * @return The invocation of the jQuery function <code>mouseleave()</code>
   */
  @Nonnull
  public IMPLTYPE mouseleave ()
  {
    return jqinvoke ("mouseleave");
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
   * @return The invocation of the jQuery function <code>mousemove()</code>
   */
  @Nonnull
  public IMPLTYPE mousemove ()
  {
    return jqinvoke ("mousemove");
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
   * @return The invocation of the jQuery function <code>mouseout()</code>
   */
  @Nonnull
  public IMPLTYPE mouseout ()
  {
    return jqinvoke ("mouseout");
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
   * @return The invocation of the jQuery function <code>mouseover()</code>
   */
  @Nonnull
  public IMPLTYPE mouseover ()
  {
    return jqinvoke ("mouseover");
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
   * @return The invocation of the jQuery function <code>mouseup()</code>
   */
  @Nonnull
  public IMPLTYPE mouseup ()
  {
    return jqinvoke ("mouseup");
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
   * @return The invocation of the jQuery function <code>next()</code>
   */
  @Nonnull
  public IMPLTYPE next ()
  {
    return jqinvoke ("next");
  }

  /**
   * @return The invocation of the jQuery function <code>nextAll()</code>
   */
  @Nonnull
  public IMPLTYPE nextAll ()
  {
    return jqinvoke ("nextAll");
  }

  /**
   * @return The invocation of the jQuery function <code>nextUntil()</code>
   */
  @Nonnull
  public IMPLTYPE nextUntil ()
  {
    return jqinvoke ("nextUntil");
  }

  /**
   * @return The invocation of the jQuery function <code>not()</code>
   */

  @Nonnull
  public IMPLTYPE _not ()
  {
    return jqinvoke ("not");
  }

  /**
   * @return The invocation of the jQuery function <code>off()</code>
   */
  @Nonnull
  public IMPLTYPE off ()
  {
    return jqinvoke ("off");
  }

  /**
   * @return The invocation of the jQuery function <code>offset()</code>
   */
  @Nonnull
  public IMPLTYPE offset ()
  {
    return jqinvoke ("offset");
  }

  /**
   * @return The invocation of the jQuery function <code>offsetParent()</code>
   */
  @Nonnull
  public IMPLTYPE offsetParent ()
  {
    return jqinvoke ("offsetParent");
  }

  /**
   * Added in jQuery 1.7
   * 
   * @return The invocation of the jQuery function <code>on()</code>
   */
  @Nonnull
  public IMPLTYPE on ()
  {
    return jqinvoke ("on");
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
   * @return The invocation of the jQuery function <code>one()</code>
   */
  @Nonnull
  public IMPLTYPE one ()
  {
    return jqinvoke ("one");
  }

  /**
   * @return The invocation of the jQuery function <code>outerHeight()</code>
   */
  @Nonnull
  public IMPLTYPE outerHeight ()
  {
    return jqinvoke ("outerHeight");
  }

  /**
   * @return The invocation of the jQuery function <code>outerWidth()</code>
   */
  @Nonnull
  public IMPLTYPE outerWidth ()
  {
    return jqinvoke ("outerWidth");
  }

  /**
   * @return The invocation of the jQuery function <code>parent()</code>
   */
  @Nonnull
  public IMPLTYPE parent ()
  {
    return jqinvoke ("parent");
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
   * @since jQuery 1.0
   * @return The invocation of the jQuery function <code>parents()</code>
   */
  @Nonnull
  public IMPLTYPE parents ()
  {
    return jqinvoke ("parents");
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
   * @return The invocation of the jQuery function <code>parentsUntil()</code>
   */
  @Nonnull
  public IMPLTYPE parentsUntil ()
  {
    return jqinvoke ("parentsUntil");
  }

  /**
   * @return The invocation of the jQuery function <code>position()</code>
   */
  @Nonnull
  public IMPLTYPE position ()
  {
    return jqinvoke ("position");
  }

  /**
   * @return The invocation of the jQuery function <code>prepend()</code>
   */
  @Nonnull
  public IMPLTYPE prepend ()
  {
    return jqinvoke ("prepend");
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
   * @return The invocation of the jQuery function <code>prependTo()</code>
   */
  @Nonnull
  public IMPLTYPE prependTo ()
  {
    return jqinvoke ("prependTo");
  }

  /**
   * @return The invocation of the jQuery function <code>prev()</code>
   */
  @Nonnull
  public IMPLTYPE prev ()
  {
    return jqinvoke ("prev");
  }

  /**
   * @return The invocation of the jQuery function <code>prevAll()</code>
   */
  @Nonnull
  public IMPLTYPE prevAll ()
  {
    return jqinvoke ("prevAll");
  }

  /**
   * @return The invocation of the jQuery function <code>prevUntil()</code>
   */
  @Nonnull
  public IMPLTYPE prevUntil ()
  {
    return jqinvoke ("prevUntil");
  }

  /**
   * @return The invocation of the jQuery function <code>promise()</code>
   */
  @Nonnull
  public IMPLTYPE promise ()
  {
    return jqinvoke ("promise");
  }

  /**
   * @since jQuery 1.6
   * @return The invocation of the jQuery function <code>prop()</code>
   */
  @Nonnull
  public IMPLTYPE prop ()
  {
    return jqinvoke ("prop");
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
   * @return The invocation of the jQuery function <code>pushStack()</code>
   */
  @Nonnull
  public IMPLTYPE pushStack ()
  {
    return jqinvoke ("pushStack");
  }

  /**
   * @return The invocation of the jQuery function <code>queue()</code>
   */
  @Nonnull
  public IMPLTYPE queue ()
  {
    return jqinvoke ("queue");
  }

  /**
   * @return The invocation of the jQuery function <code>ready()</code>
   */
  @Nonnull
  public IMPLTYPE ready ()
  {
    return jqinvoke ("ready");
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
   * @return The invocation of the jQuery function <code>remove()</code>
   */
  @Nonnull
  public IMPLTYPE remove ()
  {
    return jqinvoke ("remove");
  }

  /**
   * @return The invocation of the jQuery function <code>removeAttr()</code>
   */
  @Nonnull
  public IMPLTYPE removeAttr ()
  {
    return jqinvoke ("removeAttr");
  }

  /**
   * @return The invocation of the jQuery function <code>removeClass()</code>
   */
  @Nonnull
  public IMPLTYPE removeClass ()
  {
    return jqinvoke ("removeClass");
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
   * @return The invocation of the jQuery function <code>removeData()</code>
   */
  @Nonnull
  public IMPLTYPE removeData ()
  {
    return jqinvoke ("removeData");
  }

  /**
   * @return The invocation of the jQuery function <code>removeProp()</code>
   */
  @Nonnull
  public IMPLTYPE removeProp ()
  {
    return jqinvoke ("removeProp");
  }

  /**
   * @return The invocation of the jQuery function <code>replaceAll()</code>
   */
  @Nonnull
  public IMPLTYPE replaceAll ()
  {
    return jqinvoke ("replaceAll");
  }

  /**
   * @return The invocation of the jQuery function <code>replaceWith()</code>
   */
  @Nonnull
  public IMPLTYPE replaceWith ()
  {
    return jqinvoke ("replaceWith");
  }

  /**
   * @return The invocation of the jQuery function <code>resize()</code>
   */
  @Nonnull
  public IMPLTYPE resize ()
  {
    return jqinvoke ("resize");
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
   * @return The invocation of the jQuery function <code>scroll()</code>
   */
  @Nonnull
  public IMPLTYPE scroll ()
  {
    return jqinvoke ("scroll");
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
   * @return The invocation of the jQuery function <code>scrollLeft()</code>
   */
  @Nonnull
  public IMPLTYPE scrollLeft ()
  {
    return jqinvoke ("scrollLeft");
  }

  /**
   * @return The invocation of the jQuery function <code>scrollTop()</code>
   */
  @Nonnull
  public IMPLTYPE scrollTop ()
  {
    return jqinvoke ("scrollTop");
  }

  /**
   * This method is a shortcut for <code>.on('select', handler)</code>
   * 
   * @return The invocation of the jQuery function <code>select()</code>
   */
  @Nonnull
  public IMPLTYPE select ()
  {
    return jqinvoke ("select");
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
   * @return The invocation of the jQuery function <code>serialize()</code>
   */
  @Nonnull
  public IMPLTYPE serialize ()
  {
    return jqinvoke ("serialize");
  }

  /**
   * @return The invocation of the jQuery function <code>serializeArray()</code>
   */
  @Nonnull
  public IMPLTYPE serializeArray ()
  {
    return jqinvoke ("serializeArray");
  }

  /**
   * @return The invocation of the jQuery function <code>show()</code>
   */
  @Nonnull
  public IMPLTYPE show ()
  {
    return jqinvoke ("show");
  }

  /**
   * @return The invocation of the jQuery function <code>siblings()</code>
   */
  @Nonnull
  public IMPLTYPE siblings ()
  {
    return jqinvoke ("siblings");
  }

  /**
   * @return The invocation of the jQuery function <code>size()</code>
   */
  @Nonnull
  public IMPLTYPE size ()
  {
    return jqinvoke ("size");
  }

  /**
   * @return The invocation of the jQuery function <code>slice()</code>
   */
  @Nonnull
  public IMPLTYPE slice ()
  {
    return jqinvoke ("slice");
  }

  /**
   * @return The invocation of the jQuery function <code>slideDown()</code>
   */
  @Nonnull
  public IMPLTYPE slideDown ()
  {
    return jqinvoke ("slideDown");
  }

  /**
   * @return The invocation of the jQuery function <code>slideToggle()</code>
   */
  @Nonnull
  public IMPLTYPE slideToggle ()
  {
    return jqinvoke ("slideToggle");
  }

  /**
   * @return The invocation of the jQuery function <code>slideUp()</code>
   */
  @Nonnull
  public IMPLTYPE slideUp ()
  {
    return jqinvoke ("slideUp");
  }

  /**
   * @return The invocation of the jQuery function <code>stop()</code>
   */
  @Nonnull
  public IMPLTYPE stop ()
  {
    return jqinvoke ("stop");
  }

  /**
   * @return The invocation of the jQuery function <code>submit()</code>
   */
  @Nonnull
  public IMPLTYPE submit ()
  {
    return jqinvoke ("submit");
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
   * @return The invocation of the jQuery function <code>text()</code>
   */
  @Nonnull
  public IMPLTYPE text ()
  {
    return jqinvoke ("text");
  }

  /**
   * @return The invocation of the jQuery function <code>toArray()</code>
   */
  @Nonnull
  public IMPLTYPE toArray ()
  {
    return jqinvoke ("toArray");
  }

  /**
   * @return The invocation of the jQuery function <code>toggle()</code>
   * @since jQuery 1.0
   */
  @Nonnull
  public IMPLTYPE toggle ()
  {
    return jqinvoke ("toggle");
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
   * @return The invocation of the jQuery function <code>toggleClass()</code>
   */
  @Nonnull
  public IMPLTYPE toggleClass ()
  {
    return jqinvoke ("toggleClass");
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
   * @return The invocation of the jQuery function <code>trigger()</code>
   */
  @Nonnull
  public IMPLTYPE trigger ()
  {
    return jqinvoke ("trigger");
  }

  /**
   * @return The invocation of the jQuery function <code>triggerHandler()</code>
   */
  @Nonnull
  public IMPLTYPE triggerHandler ()
  {
    return jqinvoke ("triggerHandler");
  }

  /**
   * @return The invocation of the jQuery function <code>unbind()</code>
   */
  @Nonnull
  public IMPLTYPE unbind ()
  {
    return jqinvoke ("unbind");
  }

  /**
   * @return The invocation of the jQuery function <code>undelegate()</code>
   */
  @Nonnull
  public IMPLTYPE undelegate ()
  {
    return jqinvoke ("undelegate");
  }

  /**
   * @return The invocation of the jQuery function <code>unload()</code>
   */
  @Nonnull
  public IMPLTYPE unload ()
  {
    return jqinvoke ("unload");
  }

  /**
   * @return The invocation of the jQuery function <code>unwrap()</code>
   */
  @Nonnull
  public IMPLTYPE unwrap ()
  {
    return jqinvoke ("unwrap");
  }

  /**
   * @return The invocation of the jQuery function <code>val()</code>
   */
  @Nonnull
  public IMPLTYPE val ()
  {
    return jqinvoke ("val");
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

  /**
   * @return The invocation of the jQuery function <code>width()</code>
   */
  @Nonnull
  public IMPLTYPE width ()
  {
    return jqinvoke ("width");
  }

  /**
   * @return The invocation of the jQuery function <code>wrap()</code>
   */
  @Nonnull
  public IMPLTYPE wrap ()
  {
    return jqinvoke ("wrap");
  }

  /**
   * @return The invocation of the jQuery function <code>wrapAll()</code>
   */
  @Nonnull
  public IMPLTYPE wrapAll ()
  {
    return jqinvoke ("wrapAll");
  }

  /**
   * @return The invocation of the jQuery function <code>wrapInner()</code>
   */
  @Nonnull
  public IMPLTYPE wrapInner ()
  {
    return jqinvoke ("wrapInner");
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
