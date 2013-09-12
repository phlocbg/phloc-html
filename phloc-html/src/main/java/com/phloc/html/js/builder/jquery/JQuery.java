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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.PresentForCodeCoverage;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.collections.pair.IReadonlyPair;
import com.phloc.commons.collections.pair.ReadonlyPair;
import com.phloc.commons.id.IHasID;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSAssocArray;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSFunction;
import com.phloc.html.js.builder.JSRef;
import com.phloc.html.js.builder.html.JSHtml;

/**
 * Wrapper around jQuery to allow for easy function calls
 * 
 * @author Philip Helger
 */
@Immutable
public final class JQuery
{
  public static final AtomicBoolean s_aUseDollar = new AtomicBoolean (true);

  @SuppressWarnings ("unused")
  @PresentForCodeCoverage
  private static final JQuery s_aInstance = new JQuery ();

  private JQuery ()
  {}

  /**
   * Globally decide, whether to use "$" or "jQuery" to access jQuery
   * 
   * @param bUseDollar
   *        <code>true</code> to use "$", <code>false</code> to use "jQuery"
   */
  public static void setUseDollarForJQuery (final boolean bUseDollar)
  {
    s_aUseDollar.set (bUseDollar);
  }

  /**
   * @return <code>true</code> if "$" is used, <code>false</code> if "jQuery" is
   *         used for the global jQuery field
   */
  public static boolean isUseDollarForJQuery ()
  {
    return s_aUseDollar.get ();
  }

  // Properties of the Global jQuery Object

  /**
   * @return <code>$</code> or <code>jQuery</code> as a field
   */
  @Nonnull
  public static JSRef jQueryField ()
  {
    return JSExpr.ref (isUseDollarForJQuery () ? "$" : "jQuery");
  }

  /**
   * @return <code>$.browser<code>
   * @deprecated Deprecated since jQuery 1.3 Removed in jQuery 1.9
   */
  @Deprecated
  @Nonnull
  public static JSFieldRef browser ()
  {
    return jQueryField ().ref ("browser");
  }

  /**
   * @return <code>$.fx</code>
   */
  @Nonnull
  public static JSFieldRef fx ()
  {
    return jQueryField ().ref ("fx");
  }

  /**
   * @return <code>$.fx.interval</code>
   * @since jQuery 1.4.3
   */
  @Nonnull
  public static JSFieldRef fxInterval ()
  {
    return fx ().ref ("interval");
  }

  /**
   * @return <code>$.fx.off</code>
   * @since jQuery 1.3
   */
  @Nonnull
  public static JSFieldRef fxOff ()
  {
    return fx ().ref ("off");
  }

  /**
   * @return <code>$.support</code>
   * @since jQuery 1.3
   */
  @Nonnull
  public static JSFieldRef support ()
  {
    return jQueryField ().ref ("support");
  }

  /**
   * @return <code>$.selector</code>
   * @since jQuery 1.3
   * @deprecated Deprecated since jQuery 1.7 Removed in jQuery 1.9
   */
  @Deprecated
  @Nonnull
  public static JSFieldRef selector ()
  {
    return jQueryField ().ref ("selector");
  }

  /**
   * @return <code>$.cssHooks</code>
   * @since jQuery 1.4.3
   */
  @Nonnull
  public static JSFieldRef cssHooks ()
  {
    return jQueryField ().ref ("cssHooks");
  }

  /**
   * @return <code>$.boxModel</code>
   * @deprecated Deprecated since jQuery 1.3
   */
  @Deprecated
  @Nonnull
  public static JSFieldRef boxModel ()
  {
    return jQueryField ().ref ("boxModel");
  }

  // todo

  /**
   * @return <code>$</code> as a function
   */
  @Nonnull
  public static JSFunction jQueryFunction ()
  {
    return new JSFunction ("$");
  }

  /**
   * @return <code>$.fn<code>
   */
  @Nonnull
  public static JSFieldRef fn ()
  {
    return jQueryField ().ref ("fn");
  }

  /**
   * @return <code>$.error</code>
   */
  @Nonnull
  public static JSFieldRef error ()
  {
    return jQueryField ().ref ("error");
  }

  /**
   * @return <code>$.parseJSON</code>
   */
  @Nonnull
  public static JSFieldRef parseJSON ()
  {
    return jQueryField ().ref ("parseJSON");
  }

  /**
   * @return <code>$.ajax</code>
   */
  @Nonnull
  public static JQueryInvocation ajax ()
  {
    return new JQueryInvocation (jQueryField (), "ajax");
  }

  /**
   * @param aArgs
   *        The array with the AJAX arguments
   * @return <code>$.ajax</code>
   */
  @Nonnull
  public static JQueryInvocation ajax (@Nonnull final JSAssocArray aArgs)
  {
    return ajax ().arg (aArgs);
  }

  /**
   * @return <code>$.ajaxPrefilter</code>
   */
  @Nonnull
  public static JQueryInvocation ajaxPrefilter ()
  {
    return new JQueryInvocation (jQueryField (), "ajaxPrefilter");
  }

  /**
   * @return <code>$.ajaxSetup</code>
   */
  @Nonnull
  public static JQueryInvocation ajaxSetup ()
  {
    return new JQueryInvocation (jQueryField (), "ajaxSetup");
  }

  /**
   * @return <code>$.Callbacks</code>
   */
  @Nonnull
  public static JQueryInvocation callbacks ()
  {
    return new JQueryInvocation (jQueryField (), "Callbacks");
  }

  /**
   * @return <code>$.contains</code>
   */
  @Nonnull
  public static JQueryInvocation contains ()
  {
    return new JQueryInvocation (jQueryField (), "contains");
  }

  /**
   * @return <code>$.data</code>
   */
  @Nonnull
  public static JQueryInvocation data ()
  {
    return new JQueryInvocation (jQueryField (), "data");
  }

  /**
   * @return <code>$.dequeue</code>
   */
  @Nonnull
  public static JQueryInvocation dequeue ()
  {
    return new JQueryInvocation (jQueryField (), "dequeue");
  }

  /**
   * @return <code>$.each</code>
   */
  @Nonnull
  public static JQueryInvocation each ()
  {
    return new JQueryInvocation (jQueryField (), "each");
  }

  /**
   * @return <code>$.extend</code>
   */
  @Nonnull
  public static JQueryInvocation extend ()
  {
    return new JQueryInvocation (jQueryField (), "extend");
  }

  /**
   * @return <code>$.get</code>
   */
  @Nonnull
  public static JQueryInvocation get ()
  {
    return new JQueryInvocation (jQueryField (), "get");
  }

  /**
   * @return <code>$.getJSON</code>
   */
  @Nonnull
  public static JQueryInvocation getJSON ()
  {
    return new JQueryInvocation (jQueryField (), "getJSON");
  }

  /**
   * @return <code>$.getScript</code>
   */
  @Nonnull
  public static JQueryInvocation getScript ()
  {
    return new JQueryInvocation (jQueryField (), "getScript");
  }

  /**
   * @return <code>$.globalEval</code>
   */
  @Nonnull
  public static JQueryInvocation globalEval ()
  {
    return new JQueryInvocation (jQueryField (), "globalEval");
  }

  /**
   * @param sEval
   *        JS code to be evaluated
   * @return <code>$.globalEval</code>
   */
  @Nonnull
  public static JQueryInvocation globalEval (@Nonnull final String sEval)
  {
    return globalEval ().arg (sEval);
  }

  /**
   * @param aEval
   *        JS code to be evaluated
   * @return <code>$.globalEval</code>
   */
  @Nonnull
  public static JQueryInvocation globalEval (@Nonnull final IJSExpression aEval)
  {
    return globalEval ().arg (aEval);
  }

  /**
   * @return <code>$.grep</code>
   */
  @Nonnull
  public static JQueryInvocation grep ()
  {
    return new JQueryInvocation (jQueryField (), "grep");
  }

  /**
   * @return <code>$.hasData</code>
   */
  @Nonnull
  public static JQueryInvocation hasData ()
  {
    return new JQueryInvocation (jQueryField (), "hasData");
  }

  /**
   * @return <code>$.holdReady</code>
   */
  @Nonnull
  public static JQueryInvocation holdReady ()
  {
    return new JQueryInvocation (jQueryField (), "holdReady");
  }

  /**
   * @return <code>$.inArray</code>
   */
  @Nonnull
  public static JQueryInvocation inArray ()
  {
    return new JQueryInvocation (jQueryField (), "inArray");
  }

  /**
   * @return <code>$.isArray</code>
   */
  @Nonnull
  public static JQueryInvocation isArray ()
  {
    return new JQueryInvocation (jQueryField (), "isArray");
  }

  /**
   * @return <code>$.isEmptyObject</code>
   */
  @Nonnull
  public static JQueryInvocation isEmptyObject ()
  {
    return new JQueryInvocation (jQueryField (), "isEmptyObject");
  }

  /**
   * @return <code>$.isFunction</code>
   */
  @Nonnull
  public static JQueryInvocation isFunction ()
  {
    return new JQueryInvocation (jQueryField (), "isFunction");
  }

  /**
   * @return <code>$.isNumeric</code>
   */
  @Nonnull
  public static JQueryInvocation isNumeric ()
  {
    return new JQueryInvocation (jQueryField (), "isNumeric");
  }

  /**
   * @return <code>$.isPlainObject</code>
   */
  @Nonnull
  public static JQueryInvocation isPlainObject ()
  {
    return new JQueryInvocation (jQueryField (), "isPlainObject");
  }

  /**
   * @return <code>$.isWindow</code>
   */
  @Nonnull
  public static JQueryInvocation isWindow ()
  {
    return new JQueryInvocation (jQueryField (), "isWindow");
  }

  /**
   * @return <code>$.isXMLDoc</code>
   */
  @Nonnull
  public static JQueryInvocation isXMLDoc ()
  {
    return new JQueryInvocation (jQueryField (), "isXMLDoc");
  }

  /**
   * @return <code>$.makeArray</code>
   */
  @Nonnull
  public static JQueryInvocation makeArray ()
  {
    return new JQueryInvocation (jQueryField (), "makeArray");
  }

  /**
   * @return <code>$.map</code>
   */
  @Nonnull
  public static JQueryInvocation map ()
  {
    return new JQueryInvocation (jQueryField (), "map");
  }

  /**
   * @return <code>$.merge</code>
   */
  @Nonnull
  public static JQueryInvocation merge ()
  {
    return new JQueryInvocation (jQueryField (), "merge");
  }

  /**
   * @return <code>$.noConflict</code>
   */
  @Nonnull
  public static JQueryInvocation noConflict ()
  {
    return new JQueryInvocation (jQueryField (), "noConflict");
  }

  /**
   * @return <code>$.noop</code>
   */
  @Nonnull
  public static JQueryInvocation noop ()
  {
    return new JQueryInvocation (jQueryField (), "noop");
  }

  /**
   * @return <code>$.now</code>
   */
  @Nonnull
  public static JQueryInvocation now ()
  {
    return new JQueryInvocation (jQueryField (), "now");
  }

  /**
   * @return <code>$.param</code>
   */
  @Nonnull
  public static JQueryInvocation param ()
  {
    return new JQueryInvocation (jQueryField (), "param");
  }

  /**
   * @return <code>$.parseXML</code>
   */
  @Nonnull
  public static JQueryInvocation parseXML ()
  {
    return new JQueryInvocation (jQueryField (), "parseXML");
  }

  /**
   * @return <code>$.post</code>
   */
  @Nonnull
  public static JQueryInvocation post ()
  {
    return new JQueryInvocation (jQueryField (), "post");
  }

  /**
   * @return <code>$.proxy</code>
   */
  @Nonnull
  public static JQueryInvocation proxy ()
  {
    return new JQueryInvocation (jQueryField (), "proxy");
  }

  /**
   * @return <code>$.queue</code>
   */
  @Nonnull
  public static JQueryInvocation queue ()
  {
    return new JQueryInvocation (jQueryField (), "queue");
  }

  /**
   * @return <code>$.removeData</code>
   */
  @Nonnull
  public static JQueryInvocation removeData ()
  {
    return new JQueryInvocation (jQueryField (), "removeData");
  }

  /**
   * @return <code>$.sub</code>
   */
  @Nonnull
  public static JQueryInvocation sub ()
  {
    return new JQueryInvocation (jQueryField (), "sub");
  }

  /**
   * @return <code>$.trim</code>
   */
  @Nonnull
  public static JQueryInvocation trim ()
  {
    return new JQueryInvocation (jQueryField (), "trim");
  }

  /**
   * @return <code>$.type</code>
   */
  @Nonnull
  public static JQueryInvocation type ()
  {
    return new JQueryInvocation (jQueryField (), "type");
  }

  /**
   * @return <code>$.unique</code>
   */
  @Nonnull
  public static JQueryInvocation unique ()
  {
    return new JQueryInvocation (jQueryField (), "unique");
  }

  /**
   * @return <code>$.when</code>
   */
  @Nonnull
  public static JQueryInvocation when ()
  {
    return new JQueryInvocation (jQueryField (), "when");
  }

  /**
   * @return a {@link JQueryInvocation} with an arbitrary expression.
   *         <code>$(<i>expr</i>)</code>
   */
  @Nonnull
  public static JQueryInvocation jQuery (@Nonnull final IJSExpression aExpr)
  {
    return new JQueryInvocation (jQueryFunction ()).arg (aExpr);
  }

  /**
   * @return a {@link JQueryInvocation} with an HTML document element.
   *         <code>$(document)</code>
   */
  @Nonnull
  public static JQueryInvocation jQueryDocument ()
  {
    return jQuery (JSHtml.document ());
  }

  /**
   * @return a {@link JQueryInvocation} with <code>this</code>:
   *         <code>$(this)</code>
   */
  @Nonnull
  public static JQueryInvocation jQueryThis ()
  {
    return jQuery (JSExpr.THIS);
  }

  /**
   * Get the result of a jQuery selection.
   * 
   * @param aSelector
   *        The selector to be used. May not be <code>null</code>.
   * @return A jQuery invocation with the passed selector:
   *         <code>$('selector')</code>
   */
  @Nonnull
  public static JQueryInvocation select (@Nonnull final IJQuerySelector aSelector)
  {
    if (aSelector == null)
      throw new NullPointerException ("selector");
    return jQuery (aSelector.getExpression ());
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aSelectors
   *        The selectors to be used. May not be <code>null</code>.
   * @return A jQuery invocation with the passed selector:
   *         <code>$('selector')</code>
   */
  @Nonnull
  public static JQueryInvocation select (@Nonnull final IJQuerySelector... aSelectors)
  {
    return select (new JQuerySelectorList (aSelectors));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aSelectorList
   *        The selector list to be used. May not be <code>null</code>.
   * @return A jQuery invocation with the passed selector:
   *         <code>$('selector selector2')</code>
   */
  @Nonnull
  public static JQueryInvocation select (@Nonnull final JQuerySelectorList aSelectorList)
  {
    if (aSelectorList == null)
      throw new NullPointerException ("selectorList");
    return jQuery (aSelectorList.getAsExpression ());
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param sID
   *        The ID to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed ID: <code>$('#id')</code>
   */
  @Nonnull
  public static JQueryInvocation idRef (@Nonnull @Nonempty final String sID)
  {
    return select (JQuerySelector.id (sID));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aIDProvider
   *        The provider that has the ID to be selected. May not be
   *        <code>null</code>.
   * @return A jQuery invocation with the passed ID: <code>$('#id')</code>
   */
  @Nonnull
  public static JQueryInvocation idRef (@Nonnull @Nonempty final IHasID <String> aIDProvider)
  {
    return idRef (aIDProvider.getID ());
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aIDs
   *        The IDs to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed IDs:
   *         <code>$('#id1,#id2,#id3')</code>
   */
  @Nonnull
  public static JQueryInvocation idRefMultiple (@Nonnull @Nonempty final String... aIDs)
  {
    if (ArrayHelper.isEmpty (aIDs))
      throw new IllegalArgumentException ("IDs may not be empty");

    final List <IJQuerySelector> aSelectors = new ArrayList <IJQuerySelector> ();
    for (final String sID : aIDs)
      aSelectors.add (JQuerySelector.id (sID));
    return select (JQuerySelector.multiple (aSelectors));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aIDs
   *        The IDs to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed IDs:
   *         <code>$('#id1,#id2,#id3')</code>
   */
  @Nonnull
  public static JQueryInvocation idRefMultiple (@Nonnull @Nonempty final Iterable <String> aIDs)
  {
    if (ContainerHelper.isEmpty (aIDs))
      throw new IllegalArgumentException ("IDs may not be empty");

    final List <IJQuerySelector> aSelectors = new ArrayList <IJQuerySelector> ();
    for (final String sID : aIDs)
      aSelectors.add (JQuerySelector.id (sID));
    return select (JQuerySelector.multiple (aSelectors));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aCSSClass
   *        The class to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed class: <code>$('.class')</code>
   */
  @Nonnull
  public static JQueryInvocation classRef (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return select (JQuerySelector.clazz (aCSSClass));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aCSSClasses
   *        The classes to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed classes:
   *         <code>$('.class1,.class2,.class3')</code>
   */
  @Nonnull
  public static JQueryInvocation classRefMultiple (@Nonnull @Nonempty final ICSSClassProvider... aCSSClasses)
  {
    if (ArrayHelper.isEmpty (aCSSClasses))
      throw new IllegalArgumentException ("classes may not be empty");

    final List <IJQuerySelector> aSelectors = new ArrayList <IJQuerySelector> ();
    for (final ICSSClassProvider aCSSClass : aCSSClasses)
      aSelectors.add (JQuerySelector.clazz (aCSSClass));
    return select (JQuerySelector.multiple (aSelectors));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param aCSSClasses
   *        The classes to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed classes:
   *         <code>$('.class1,.class2,.class3')</code>
   */
  @Nonnull
  public static JQueryInvocation classRefMultiple (@Nonnull @Nonempty final Iterable <ICSSClassProvider> aCSSClasses)
  {
    if (ContainerHelper.isEmpty (aCSSClasses))
      throw new IllegalArgumentException ("classes may not be empty");

    final List <IJQuerySelector> aSelectors = new ArrayList <IJQuerySelector> ();
    for (final ICSSClassProvider aCSSClass : aCSSClasses)
      aSelectors.add (JQuerySelector.clazz (aCSSClass));
    return select (JQuerySelector.multiple (aSelectors));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param eElement
   *        The HTML element to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed element:
   *         <code>$('element')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull final EHTMLElement eElement)
  {
    return select (JQuerySelector.element (eElement));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param sElementName
   *        The HTML element to be selected. May not be <code>null</code>.
   * @return A jQuery invocation with the passed element:
   *         <code>$('element')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull @Nonempty final String sElementName)
  {
    return select (JQuerySelector.element (sElementName));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param eElement
   *        The HTML element to be selected. May not be <code>null</code>.
   * @param aSelector
   *        The additional selector to be appended to the element. E.g an ID or
   *        a class selector. May not be <code>null</code>.
   * @return A jQuery invocation with the passed element and selector:
   *         <code>$('element#id')</code> or <code>$('element.class')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull final EHTMLElement eElement,
                                                 @Nonnull final IJQuerySelector aSelector)
  {
    return select (JQuerySelector.element (eElement).chain (aSelector));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param sElementName
   *        The HTML element to be selected. May not be <code>null</code>.
   * @param aSelector
   *        The additional selector to be appended to the element. E.g an ID or
   *        a class selector. May not be <code>null</code>.
   * @return A jQuery invocation with the passed element and selector:
   *         <code>$('element#id')</code> or <code>$('element.class')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull @Nonempty final String sElementName,
                                                 @Nonnull final IJQuerySelector aSelector)
  {
    return select (JQuerySelector.element (sElementName).chain (aSelector));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param eElement
   *        The HTML element to be selected. May not be <code>null</code>.
   * @param sID
   *        The ID to be appended to the element. May not be <code>null</code>.
   * @return A jQuery invocation with the passed element and ID:
   *         <code>$('element#id')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameWithIDRef (@Nonnull final EHTMLElement eElement,
                                                       @Nonnull @Nonempty final String sID)
  {
    return elementNameRef (eElement, JQuerySelector.id (sID));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param sElementName
   *        The HTML element to be selected. May not be <code>null</code>.
   * @param sID
   *        The ID to be appended to the element. May not be <code>null</code>.
   * @return A jQuery invocation with the passed element and ID:
   *         <code>$('element#id')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameWithIDRef (@Nonnull @Nonempty final String sElementName,
                                                       @Nonnull @Nonempty final String sID)
  {
    return elementNameRef (sElementName, JQuerySelector.id (sID));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param eElement
   *        The HTML element to be selected. May not be <code>null</code>.
   * @param aCSSClass
   *        The class to be appended to the element. May not be
   *        <code>null</code>.
   * @return A jQuery invocation with the passed element and class:
   *         <code>$('element.class')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameWithClassRef (@Nonnull final EHTMLElement eElement,
                                                          @Nonnull final ICSSClassProvider aCSSClass)
  {
    return elementNameRef (eElement, JQuerySelector.clazz (aCSSClass));
  }

  /**
   * Get the result of a jQuery selection
   * 
   * @param sElementName
   *        The HTML element to be selected. May not be <code>null</code>.
   * @param aCSSClass
   *        The class to be appended to the element. May not be
   *        <code>null</code>.
   * @return A jQuery invocation with the passed element and class:
   *         <code>$('element.class')</code>
   */
  @Nonnull
  public static JQueryInvocation elementNameWithClassRef (@Nonnull @Nonempty final String sElementName,
                                                          @Nonnull final ICSSClassProvider aCSSClass)
  {
    return elementNameRef (sElementName, JQuerySelector.clazz (aCSSClass));
  }

  @Nonnull
  public static IReadonlyPair <JQueryInvocation, JSAnonymousFunction> onDocumentReady ()
  {
    final JSAnonymousFunction aAnonFunction = new JSAnonymousFunction ();
    final JQueryInvocation aInvocation = jQueryDocument ().ready (aAnonFunction);
    return ReadonlyPair.create (aInvocation, aAnonFunction);
  }

  /**
   * Add onDocumentReady call with a single statement
   * 
   * @param aJSCodeProvider
   *        The statement to be executed on document ready
   * @return The invocation object
   */
  @Nonnull
  public static JQueryInvocation onDocumentReady (@Nonnull final IJSCodeProvider aJSCodeProvider)
  {
    final IReadonlyPair <JQueryInvocation, JSAnonymousFunction> aPair = onDocumentReady ();
    aPair.getSecond ().body ().add (aJSCodeProvider);
    return aPair.getFirst ();
  }
}
