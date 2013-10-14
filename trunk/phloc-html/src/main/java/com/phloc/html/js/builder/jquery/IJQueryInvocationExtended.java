package com.phloc.html.js.builder.jquery;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Nonnull;

import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSArray;
import com.phloc.json2.IJson;

/**
 * This file is generated - do NOT edit!
 * @author com.phloc.html.supplementary.jquery.Main_IJQueryInvocationExtended
*/
public interface IJQueryInvocationExtended <IMPLTYPE extends IJQueryInvocationExtended <IMPLTYPE>> extends IJQueryInvocation <IMPLTYPE>
{
/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull ICSSClassProvider selector);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull EHTMLElement... elements);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull Iterable<EHTMLElement> elements);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull String... elements);

/**
* @param html parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull IHCNode html);

/**
* @param html parameter value
*/
@Nonnull IMPLTYPE add(@Nonnull String html);

/**
* @param jQuery_object parameter value
* @since jQuery 1.3.2
*/
@Nonnull IMPLTYPE add(@Nonnull JQueryInvocation jQuery_object);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull IJSExpression selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull JQuerySelectorList selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull EHTMLElement selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull IJSExpression selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull JQuerySelectorList selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull IJSExpression selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull IJQuerySelector selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull JQuerySelectorList selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull EHTMLElement selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE add(@Nonnull ICSSClassProvider selector, @Nonnull String context);

@Nonnull IMPLTYPE addBack();

/**
* @param selector parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE addBack(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE addBack(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE addBack(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE addBack(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE addBack(@Nonnull ICSSClassProvider selector);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE addClass(@Nonnull IJSExpression className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE addClass(@Nonnull IJson className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE addClass(@Nonnull IHCNode className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE addClass(@Nonnull String className);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE addClass(@Nonnull JSAnonymousFunction function);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull String content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE after(@Nonnull JSAnonymousFunction function);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxComplete(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxComplete(@Nonnull JSAnonymousFunction handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxError(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxError(@Nonnull JSAnonymousFunction handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxSend(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxSend(@Nonnull JSAnonymousFunction handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxStart(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxStart(@Nonnull JSAnonymousFunction handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxStop(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxStop(@Nonnull JSAnonymousFunction handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxSuccess(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ajaxSuccess(@Nonnull JSAnonymousFunction handler);

@Deprecated
@Nonnull IMPLTYPE andSelf();

/**
* @param properties parameter value
*/
@Nonnull IMPLTYPE animate(@Nonnull IJSExpression properties);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull String content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE append(@Nonnull JSAnonymousFunction function);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull IJSExpression target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull IJQuerySelector target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull JQuerySelectorList target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull EHTMLElement target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull ICSSClassProvider target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull IHCNode target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull String target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull JSArray target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE appendTo(@Nonnull JQueryInvocation target);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull IJSExpression value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull IJSExpression value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull IJSExpression value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull IJSExpression value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull IJson value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull IJson value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull IJson value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull IJson value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull IHCNode value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull IHCNode value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull IHCNode value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull IHCNode value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull String value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull String value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull String value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull String value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, int value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, int value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, int value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, int value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, long value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, long value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, long value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, long value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull BigInteger value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull BigInteger value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull BigInteger value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull BigInteger value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, double value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, double value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, double value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, double value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull BigDecimal value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull BigDecimal value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull BigDecimal value);

/**
* @param attributeName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull BigDecimal value);

/**
* @param attributeName parameter value
* @param function parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull JSAnonymousFunction function);

/**
* @param attributeName parameter value
* @param function parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull JSAnonymousFunction function);

/**
* @param attributeName parameter value
* @param function parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull JSAnonymousFunction function);

/**
* @param attributeName parameter value
* @param function parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE attr(@Nonnull String attributeName, @Nonnull JSAnonymousFunction function);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull String content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE before(@Nonnull JSAnonymousFunction function);

/**
* @param eventType parameter value
* @param eventData parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData);

/**
* @param eventType parameter value
* @param eventData parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData);

/**
* @param eventType parameter value
* @param eventData parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData);

/**
* @param eventType parameter value
* @param eventData parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param preventBubble parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, boolean preventBubble);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param preventBubble parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData, boolean preventBubble);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param preventBubble parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, boolean preventBubble);

/**
* @param eventType parameter value
* @param eventData parameter value
* @param preventBubble parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData, boolean preventBubble);

/**
* @param events parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE bind(@Nonnull IJSExpression events);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE blur(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE blur(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE blur(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE blur(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE blur();

/**
* @param callbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_add(@Nonnull IJSExpression callbacks);

/**
* @param callbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_add(@Nonnull JSAnonymousFunction callbacks);

/**
* @param callbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_add(@Nonnull JSArray callbacks);

@Nonnull IMPLTYPE callbacks_disable();

@Nonnull IMPLTYPE callbacks_disabled();

@Nonnull IMPLTYPE callbacks_empty();

/**
* @param arguments parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_fire(@Nonnull IJSExpression arguments);

@Nonnull IMPLTYPE callbacks_fireWith();

/**
* @param context parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_fireWith(@Nonnull IJSExpression context);

/**
* @param context parameter value
* @param args parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_fireWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args);

@Nonnull IMPLTYPE callbacks_fired();

/**
* @param callback parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_has(@Nonnull IJSExpression callback);

/**
* @param callback parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_has(@Nonnull JSAnonymousFunction callback);

@Nonnull IMPLTYPE callbacks_lock();

@Nonnull IMPLTYPE callbacks_locked();

/**
* @param callbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_remove(@Nonnull IJSExpression callbacks);

/**
* @param callbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_remove(@Nonnull JSAnonymousFunction callbacks);

/**
* @param callbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE callbacks_remove(@Nonnull JSArray callbacks);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE change(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE change(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE change(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE change(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE change();

@Nonnull IMPLTYPE children();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE children(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE children(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE children(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE children(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE children(@Nonnull ICSSClassProvider selector);

@Nonnull IMPLTYPE clearQueue();

/**
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE clearQueue(@Nonnull IJSExpression queueName);

/**
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE clearQueue(@Nonnull IJson queueName);

/**
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE clearQueue(@Nonnull IHCNode queueName);

/**
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE clearQueue(@Nonnull String queueName);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE click(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE click(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE click(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE click(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE click();

@Nonnull IMPLTYPE _clone();

/**
* @param withDataAndEvents parameter value
*/
@Nonnull IMPLTYPE _clone(@Nonnull IJSExpression withDataAndEvents);

/**
* @param withDataAndEvents parameter value
*/
@Nonnull IMPLTYPE _clone(boolean withDataAndEvents);

/**
* @param withDataAndEvents parameter value
* @param deepWithDataAndEvents parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE _clone(@Nonnull IJSExpression withDataAndEvents, @Nonnull IJSExpression deepWithDataAndEvents);

/**
* @param withDataAndEvents parameter value
* @param deepWithDataAndEvents parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE _clone(boolean withDataAndEvents, @Nonnull IJSExpression deepWithDataAndEvents);

/**
* @param withDataAndEvents parameter value
* @param deepWithDataAndEvents parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE _clone(@Nonnull IJSExpression withDataAndEvents, boolean deepWithDataAndEvents);

/**
* @param withDataAndEvents parameter value
* @param deepWithDataAndEvents parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE _clone(boolean withDataAndEvents, boolean deepWithDataAndEvents);

/**
* @param selector parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE closest(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE closest(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE closest(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE closest(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE closest(@Nonnull ICSSClassProvider selector);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull IJSExpression selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull JQuerySelectorList selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull EHTMLElement selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull IJSExpression selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull JQuerySelectorList selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull IJSExpression selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull IJQuerySelector selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull JQuerySelectorList selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull EHTMLElement selector, @Nonnull String context);

/**
* @param selector parameter value
* @param context parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE closest(@Nonnull ICSSClassProvider selector, @Nonnull String context);

/**
* @param jQuery_object parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE closest(@Nonnull JQueryInvocation jQuery_object);

/**
* @param element parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE closest(@Nonnull String element);

/**
* @param selectors parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE closest(@Nonnull JSArray selectors);

/**
* @param selectors parameter value
* @param context parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE closest(@Nonnull JSArray selectors, @Nonnull IJSExpression context);

/**
* @param selectors parameter value
* @param context parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE closest(@Nonnull JSArray selectors, @Nonnull EHTMLElement context);

/**
* @param selectors parameter value
* @param context parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE closest(@Nonnull JSArray selectors, @Nonnull String context);

@Nonnull IMPLTYPE contents();

/**
* @param propertyName parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName);

/**
* @param propertyName parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName);

/**
* @param propertyName parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName);

/**
* @param propertyName parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName);

/**
* @param propertyNames parameter value
* @since jQuery 1.9
*/
@Nonnull IMPLTYPE css(@Nonnull JSArray propertyNames);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE css(@Nonnull String propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param key parameter value
* @param value parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull IJSExpression key, @Nonnull IJSExpression value);

/**
* @param key parameter value
* @param value parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull IJson key, @Nonnull IJSExpression value);

/**
* @param key parameter value
* @param value parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull IHCNode key, @Nonnull IJSExpression value);

/**
* @param key parameter value
* @param value parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull String key, @Nonnull IJSExpression value);

/**
* @param obj parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE data(@Nonnull IJSExpression obj);

/**
* @param key parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull IJson key);

/**
* @param key parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull IHCNode key);

/**
* @param key parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE data(@Nonnull String key);

@Nonnull IMPLTYPE data();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE dblclick(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE dblclick(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE dblclick(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE dblclick(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE dblclick();

/**
* @param alwaysCallbacks parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE deferred_always(@Nonnull IJSExpression alwaysCallbacks);

/**
* @param alwaysCallbacks parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE deferred_always(@Nonnull JSAnonymousFunction alwaysCallbacks);

/**
* @param alwaysCallbacks parameter value
* @param alwaysCallbacks1 parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE deferred_always(@Nonnull IJSExpression alwaysCallbacks, @Nonnull IJSExpression alwaysCallbacks1);

/**
* @param alwaysCallbacks parameter value
* @param alwaysCallbacks1 parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE deferred_always(@Nonnull JSAnonymousFunction alwaysCallbacks, @Nonnull IJSExpression alwaysCallbacks1);

/**
* @param alwaysCallbacks parameter value
* @param alwaysCallbacks1 parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE deferred_always(@Nonnull IJSExpression alwaysCallbacks, @Nonnull JSAnonymousFunction alwaysCallbacks1);

/**
* @param alwaysCallbacks parameter value
* @param alwaysCallbacks1 parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE deferred_always(@Nonnull JSAnonymousFunction alwaysCallbacks, @Nonnull JSAnonymousFunction alwaysCallbacks1);

/**
* @param doneCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_done(@Nonnull IJSExpression doneCallbacks);

/**
* @param doneCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_done(@Nonnull JSAnonymousFunction doneCallbacks);

/**
* @param doneCallbacks parameter value
* @param doneCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_done(@Nonnull IJSExpression doneCallbacks, @Nonnull IJSExpression doneCallbacks1);

/**
* @param doneCallbacks parameter value
* @param doneCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_done(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull IJSExpression doneCallbacks1);

/**
* @param doneCallbacks parameter value
* @param doneCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_done(@Nonnull IJSExpression doneCallbacks, @Nonnull JSAnonymousFunction doneCallbacks1);

/**
* @param doneCallbacks parameter value
* @param doneCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_done(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull JSAnonymousFunction doneCallbacks1);

/**
* @param failCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_fail(@Nonnull IJSExpression failCallbacks);

/**
* @param failCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_fail(@Nonnull JSAnonymousFunction failCallbacks);

/**
* @param failCallbacks parameter value
* @param failCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_fail(@Nonnull IJSExpression failCallbacks, @Nonnull IJSExpression failCallbacks1);

/**
* @param failCallbacks parameter value
* @param failCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_fail(@Nonnull JSAnonymousFunction failCallbacks, @Nonnull IJSExpression failCallbacks1);

/**
* @param failCallbacks parameter value
* @param failCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_fail(@Nonnull IJSExpression failCallbacks, @Nonnull JSAnonymousFunction failCallbacks1);

/**
* @param failCallbacks parameter value
* @param failCallbacks1 parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_fail(@Nonnull JSAnonymousFunction failCallbacks, @Nonnull JSAnonymousFunction failCallbacks1);

@Deprecated
@Nonnull IMPLTYPE deferred_isRejected();

@Deprecated
@Nonnull IMPLTYPE deferred_isResolved();

/**
* @param args parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE deferred_notify(@Nonnull IJSExpression args);

/**
* @param context parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE deferred_notifyWith(@Nonnull IJSExpression context);

/**
* @param context parameter value
* @param args parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE deferred_notifyWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args);

@Deprecated
@Nonnull IMPLTYPE deferred_pipe();

/**
* @param doneFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.6
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter);

/**
* @param doneFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.6
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.6
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.6
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.6
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.6
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.7
*/
@Deprecated
@Nonnull IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param progressCallbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE deferred_progress(@Nonnull IJSExpression progressCallbacks);

/**
* @param progressCallbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE deferred_progress(@Nonnull JSAnonymousFunction progressCallbacks);

/**
* @param progressCallbacks parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE deferred_progress(@Nonnull JSArray progressCallbacks);

@Nonnull IMPLTYPE deferred_promise();

/**
* @param target parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_promise(@Nonnull IJSExpression target);

@Nonnull IMPLTYPE deferred_reject();

/**
* @param args parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_reject(@Nonnull IJSExpression args);

/**
* @param context parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_rejectWith(@Nonnull IJSExpression context);

/**
* @param context parameter value
* @param args parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_rejectWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args);

/**
* @param context parameter value
* @param args parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_rejectWith(@Nonnull IJSExpression context, @Nonnull JSArray args);

@Nonnull IMPLTYPE deferred_resolve();

/**
* @param args parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_resolve(@Nonnull IJSExpression args);

/**
* @param context parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_resolveWith(@Nonnull IJSExpression context);

/**
* @param context parameter value
* @param args parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_resolveWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args);

/**
* @param context parameter value
* @param args parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_resolveWith(@Nonnull IJSExpression context, @Nonnull JSArray args);

@Nonnull IMPLTYPE deferred_state();

/**
* @param doneFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter);

/**
* @param doneFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneFilter parameter value
* @param failFilter parameter value
* @param progressFilter parameter value
* @since jQuery 1.8
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter);

/**
* @param doneCallbacks parameter value
* @param failCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneCallbacks, @Nonnull IJSExpression failCallbacks);

/**
* @param doneCallbacks parameter value
* @param failCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull IJSExpression failCallbacks);

/**
* @param doneCallbacks parameter value
* @param failCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull IJSExpression doneCallbacks, @Nonnull JSAnonymousFunction failCallbacks);

/**
* @param doneCallbacks parameter value
* @param failCallbacks parameter value
* @since jQuery 1.5
*/
@Nonnull IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull JSAnonymousFunction failCallbacks);

/**
* @param duration parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull IJSExpression duration);

/**
* @param duration parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(int duration);

/**
* @param duration parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(long duration);

/**
* @param duration parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull BigInteger duration);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull IJSExpression queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(int duration, @Nonnull IJSExpression queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(long duration, @Nonnull IJSExpression queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull IJSExpression queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull IJson queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(int duration, @Nonnull IJson queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(long duration, @Nonnull IJson queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull IJson queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull IHCNode queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(int duration, @Nonnull IHCNode queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(long duration, @Nonnull IHCNode queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull IHCNode queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull String queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(int duration, @Nonnull String queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(long duration, @Nonnull String queueName);

/**
* @param duration parameter value
* @param queueName parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull String queueName);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param events parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression events);

/**
* @param selector parameter value
* @param events parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression events);

/**
* @param selector parameter value
* @param events parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression events);

/**
* @param selector parameter value
* @param events parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression events);

@Nonnull IMPLTYPE dequeue();

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE dequeue(@Nonnull IJSExpression queueName);

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE dequeue(@Nonnull IJson queueName);

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE dequeue(@Nonnull IHCNode queueName);

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE dequeue(@Nonnull String queueName);

@Nonnull IMPLTYPE detach();

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE detach(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE detach(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE detach(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE detach(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE detach(@Nonnull ICSSClassProvider selector);

@Deprecated
@Nonnull IMPLTYPE die();

/**
* @param eventType parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJSExpression eventType);

/**
* @param eventType parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJson eventType);

/**
* @param eventType parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IHCNode eventType);

/**
* @param eventType parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull String eventType);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull IJson handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJson eventType, @Nonnull IJson handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull IJson handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull String eventType, @Nonnull IJson handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull IHCNode handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJson eventType, @Nonnull IHCNode handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull IHCNode handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull String eventType, @Nonnull IHCNode handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull String handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IJson eventType, @Nonnull String handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull String handler);

/**
* @param eventType parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE die(@Nonnull String eventType, @Nonnull String handler);

/**
* @param function parameter value
*/
@Nonnull IMPLTYPE each(@Nonnull IJSExpression function);

/**
* @param function parameter value
*/
@Nonnull IMPLTYPE each(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE empty();

@Nonnull IMPLTYPE end();

/**
* @param index parameter value
* @since jQuery 1.1.2
*/
@Nonnull IMPLTYPE _eq(@Nonnull IJSExpression index);

/**
* @param index parameter value
* @since jQuery 1.1.2
*/
@Nonnull IMPLTYPE _eq(int index);

/**
* @param index parameter value
* @since jQuery 1.1.2
*/
@Nonnull IMPLTYPE _eq(long index);

/**
* @param index parameter value
* @since jQuery 1.1.2
*/
@Nonnull IMPLTYPE _eq(@Nonnull BigInteger index);

/**
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE error(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE error(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE error(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE error(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE event_isDefaultPrevented();

@Nonnull IMPLTYPE event_isImmediatePropagationStopped();

@Nonnull IMPLTYPE event_isPropagationStopped();

@Nonnull IMPLTYPE event_preventDefault();

@Nonnull IMPLTYPE event_stopImmediatePropagation();

@Nonnull IMPLTYPE event_stopPropagation();

@Nonnull IMPLTYPE fadeIn();

@Nonnull IMPLTYPE fadeOut();

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

/**
* @param duration parameter value
* @param opacity parameter value
* @param easing parameter value
* @param complete parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

@Nonnull IMPLTYPE fadeToggle();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE filter(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE filter(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE filter(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE filter(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE filter(@Nonnull ICSSClassProvider selector);

/**
* @param function parameter value
*/
@Nonnull IMPLTYPE filter(@Nonnull JSAnonymousFunction function);

/**
* @param element parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE filter(@Nonnull String element);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE find(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE find(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE find(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE find(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE find(@Nonnull ICSSClassProvider selector);

/**
* @param element parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE find(@Nonnull String element);

@Nonnull IMPLTYPE finish();

/**
* @param queue parameter value
* @since jQuery 1.9
*/
@Nonnull IMPLTYPE finish(@Nonnull IJSExpression queue);

/**
* @param queue parameter value
* @since jQuery 1.9
*/
@Nonnull IMPLTYPE finish(@Nonnull IJson queue);

/**
* @param queue parameter value
* @since jQuery 1.9
*/
@Nonnull IMPLTYPE finish(@Nonnull IHCNode queue);

/**
* @param queue parameter value
* @since jQuery 1.9
*/
@Nonnull IMPLTYPE finish(@Nonnull String queue);

@Nonnull IMPLTYPE first();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE focus(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE focus(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE focus(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE focus(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE focus();

/**
* @param handler parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE focusin(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE focusin(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE focusin(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE focusin(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param handler parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE focusout(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE focusout(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE focusout(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE focusout(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param index parameter value
*/
@Nonnull IMPLTYPE get(@Nonnull IJSExpression index);

/**
* @param index parameter value
*/
@Nonnull IMPLTYPE get(int index);

/**
* @param index parameter value
*/
@Nonnull IMPLTYPE get(long index);

/**
* @param index parameter value
*/
@Nonnull IMPLTYPE get(@Nonnull BigInteger index);

@Nonnull IMPLTYPE get();

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE has(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE has(@Nonnull IJson selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE has(@Nonnull IHCNode selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE has(@Nonnull String selector);

/**
* @param contained parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE has(@Nonnull EHTMLElement contained);

/**
* @param className parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE hasClass(@Nonnull IJSExpression className);

/**
* @param className parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE hasClass(@Nonnull IJson className);

/**
* @param className parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE hasClass(@Nonnull IHCNode className);

/**
* @param className parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE hasClass(@Nonnull String className);

@Nonnull IMPLTYPE height();

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(@Nonnull IJSExpression value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(@Nonnull IJson value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(@Nonnull IHCNode value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(@Nonnull String value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(int value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(long value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(@Nonnull BigInteger value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(double value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE height(@Nonnull BigDecimal value);

/**
* @param function parameter value
* @since jQuery 1.4.1
*/
@Nonnull IMPLTYPE height(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE hide();

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(@Nonnull IJSExpression duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(int duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(long duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(@Nonnull BigInteger duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(double duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(@Nonnull BigDecimal duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(@Nonnull IJson duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(@Nonnull IHCNode duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE hide(@Nonnull String duration);

/**
* @param handlerIn parameter value
* @param handlerOut parameter value
*/
@Nonnull IMPLTYPE hover(@Nonnull IJSExpression handlerIn, @Nonnull IJSExpression handlerOut);

/**
* @param handlerIn parameter value
* @param handlerOut parameter value
*/
@Nonnull IMPLTYPE hover(@Nonnull JSAnonymousFunction handlerIn, @Nonnull IJSExpression handlerOut);

/**
* @param handlerIn parameter value
* @param handlerOut parameter value
*/
@Nonnull IMPLTYPE hover(@Nonnull IJSExpression handlerIn, @Nonnull JSAnonymousFunction handlerOut);

/**
* @param handlerIn parameter value
* @param handlerOut parameter value
*/
@Nonnull IMPLTYPE hover(@Nonnull JSAnonymousFunction handlerIn, @Nonnull JSAnonymousFunction handlerOut);

/**
* @param handlerInOut parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE hover(@Nonnull IJSExpression handlerInOut);

/**
* @param handlerInOut parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE hover(@Nonnull JSAnonymousFunction handlerInOut);

@Nonnull IMPLTYPE html();

/**
* @param htmlString parameter value
*/
@Nonnull IMPLTYPE html(@Nonnull IJSExpression htmlString);

/**
* @param htmlString parameter value
*/
@Nonnull IMPLTYPE html(@Nonnull IHCNode htmlString);

/**
* @param htmlString parameter value
*/
@Nonnull IMPLTYPE html(@Nonnull String htmlString);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE html(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE index();

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE index(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE index(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE index(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE index(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE index(@Nonnull ICSSClassProvider selector);

/**
* @param element parameter value
*/
@Nonnull IMPLTYPE index(@Nonnull String element);

/**
* @param element parameter value
*/
@Nonnull IMPLTYPE index(@Nonnull JQueryInvocation element);

@Nonnull IMPLTYPE innerHeight();

@Nonnull IMPLTYPE innerWidth();

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull IJSExpression target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull IJQuerySelector target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull JQuerySelectorList target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull EHTMLElement target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull ICSSClassProvider target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull IHCNode target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull String target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull JSArray target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertAfter(@Nonnull JQueryInvocation target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull IJSExpression target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull IJQuerySelector target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull JQuerySelectorList target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull EHTMLElement target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull ICSSClassProvider target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull IHCNode target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull String target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull JSArray target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE insertBefore(@Nonnull JQueryInvocation target);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE is(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE is(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE is(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE is(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE is(@Nonnull ICSSClassProvider selector);

/**
* @param function parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE is(@Nonnull JSAnonymousFunction function);

/**
* @param element parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE is(@Nonnull String element);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE keydown(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE keydown(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE keydown(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE keydown(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE keydown();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE keypress(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE keypress(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE keypress(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE keypress(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE keypress();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE keyup(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE keyup(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE keyup(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE keyup(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE keyup();

@Nonnull IMPLTYPE last();

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJson events, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IHCNode events, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull String events, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJson events, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IHCNode events, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull String events, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @deprecated Deprecated since jQuery 1.7
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE live(@Nonnull IJSExpression events);

/**
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE load(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE load(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE load(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE load(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

/**
* @param url parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url);

/**
* @param url parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url);

/**
* @param url parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IJSExpression data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJSExpression data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IJSExpression data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJson data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IJson data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJson data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IJson data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IHCNode data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IHCNode data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IHCNode data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IHCNode data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull String data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull String data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull String data);

/**
* @param url parameter value
* @param data parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull String data);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJson data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IJson data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJson data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IJson data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IHCNode data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IHCNode data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IHCNode data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IHCNode data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull String data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull String data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull String data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull String data, @Nonnull IJSExpression complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull String data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IJson url, @Nonnull String data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull IHCNode url, @Nonnull String data, @Nonnull JSAnonymousFunction complete);

/**
* @param url parameter value
* @param data parameter value
* @param complete parameter value
*/
@Nonnull IMPLTYPE load(@Nonnull String url, @Nonnull String data, @Nonnull JSAnonymousFunction complete);

/**
* @param callback parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE map(@Nonnull IJSExpression callback);

/**
* @param callback parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE map(@Nonnull JSAnonymousFunction callback);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mousedown(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mousedown(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mousedown(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mousedown(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mousedown();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseenter(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseenter(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseenter(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseenter(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mouseenter();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseleave(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseleave(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseleave(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseleave(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mouseleave();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mousemove(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mousemove(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mousemove(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mousemove(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mousemove();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseout(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseout(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseout(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseout(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mouseout();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseover(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseover(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseover(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseover(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mouseover();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseup(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE mouseup(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseup(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE mouseup(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE mouseup();

@Nonnull IMPLTYPE next();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE next(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE next(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE next(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE next(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE next(@Nonnull ICSSClassProvider selector);

@Nonnull IMPLTYPE nextAll();

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE nextAll(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE nextAll(@Nonnull IJson selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE nextAll(@Nonnull IHCNode selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE nextAll(@Nonnull String selector);

@Nonnull IMPLTYPE nextUntil();

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull JQuerySelectorList selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull JQuerySelectorList selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull JQuerySelectorList selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull JQuerySelectorList selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull JQuerySelectorList selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull ICSSClassProvider filter);

/**
* @param element parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull String element);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull String element, @Nonnull IJSExpression filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull String element, @Nonnull IJQuerySelector filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull String element, @Nonnull JQuerySelectorList filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull String element, @Nonnull EHTMLElement filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE nextUntil(@Nonnull String element, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull ICSSClassProvider selector);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull EHTMLElement... elements);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull Iterable<EHTMLElement> elements);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE _not(@Nonnull String... elements);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE _not(@Nonnull JSAnonymousFunction function);

/**
* @param events parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events);

/**
* @param events parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events);

/**
* @param events parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events);

/**
* @param events parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IJson events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE off(@Nonnull String events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE offset();

/**
* @param coordinates parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE offset(@Nonnull IJSExpression coordinates);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE offset(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE offsetParent();

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE on(@Nonnull IJSExpression events);

/**
* @param events parameter value
* @param data parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param data parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param data parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param data parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.1
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull String selector);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @param selector parameter value
* @param data parameter value
* @param handler parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

/**
* @param events parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE one(@Nonnull IJSExpression events);

@Nonnull IMPLTYPE outerHeight();

/**
* @param includeMargin parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE outerHeight(@Nonnull IJSExpression includeMargin);

/**
* @param includeMargin parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE outerHeight(boolean includeMargin);

@Nonnull IMPLTYPE outerWidth();

/**
* @param includeMargin parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE outerWidth(@Nonnull IJSExpression includeMargin);

/**
* @param includeMargin parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE outerWidth(boolean includeMargin);

@Nonnull IMPLTYPE parent();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parent(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parent(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parent(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parent(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parent(@Nonnull ICSSClassProvider selector);

@Nonnull IMPLTYPE parents();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parents(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parents(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parents(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parents(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE parents(@Nonnull ICSSClassProvider selector);

@Nonnull IMPLTYPE parentsUntil();

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull JQuerySelectorList selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull JQuerySelectorList selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull JQuerySelectorList selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull JQuerySelectorList selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull JQuerySelectorList selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull ICSSClassProvider filter);

/**
* @param element parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull String element);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull IJSExpression filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull IJQuerySelector filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull JQuerySelectorList filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull EHTMLElement filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull ICSSClassProvider filter);

@Nonnull IMPLTYPE position();

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content);

/**
* @param content parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull String content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull String content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

/**
* @param content parameter value
* @param content1 parameter value
*/
@Nonnull IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prepend(@Nonnull JSAnonymousFunction function);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull IJSExpression target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull IJQuerySelector target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull JQuerySelectorList target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull EHTMLElement target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull ICSSClassProvider target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull IHCNode target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull String target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull JSArray target);

/**
* @param target parameter value
*/
@Nonnull IMPLTYPE prependTo(@Nonnull JQueryInvocation target);

@Nonnull IMPLTYPE prev();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE prev(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE prev(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE prev(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE prev(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE prev(@Nonnull ICSSClassProvider selector);

@Nonnull IMPLTYPE prevAll();

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE prevAll(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE prevAll(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE prevAll(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE prevAll(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE prevAll(@Nonnull ICSSClassProvider selector);

@Nonnull IMPLTYPE prevUntil();

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull JQuerySelectorList selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull JQuerySelectorList selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJQuerySelector filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull JQuerySelectorList selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull JQuerySelectorList filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull JQuerySelectorList selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull JQuerySelectorList selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull ICSSClassProvider filter);

/**
* @param selector parameter value
* @param filter parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull ICSSClassProvider filter);

/**
* @param element parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull String element);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull String element, @Nonnull IJSExpression filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull String element, @Nonnull IJQuerySelector filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull String element, @Nonnull JQuerySelectorList filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull String element, @Nonnull EHTMLElement filter);

/**
* @param element parameter value
* @param filter parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prevUntil(@Nonnull String element, @Nonnull ICSSClassProvider filter);

@Nonnull IMPLTYPE promise();

/**
* @param type parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull IJSExpression type);

/**
* @param type parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull IJson type);

/**
* @param type parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull IHCNode type);

/**
* @param type parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull String type);

/**
* @param type parameter value
* @param target parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull IJSExpression type, @Nonnull IJSExpression target);

/**
* @param type parameter value
* @param target parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull IJson type, @Nonnull IJSExpression target);

/**
* @param type parameter value
* @param target parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull IHCNode type, @Nonnull IJSExpression target);

/**
* @param type parameter value
* @param target parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE promise(@Nonnull String type, @Nonnull IJSExpression target);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull IJSExpression value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull IJson value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull IHCNode value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull String value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, int value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, long value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull BigInteger value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, double value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull BigDecimal value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, boolean value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, boolean value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, boolean value);

/**
* @param propertyName parameter value
* @param value parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, boolean value);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param propertyName parameter value
* @param function parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE prop(@Nonnull String propertyName, @Nonnull JSAnonymousFunction function);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements);

/**
* @param elements parameter value
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJSExpression name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJSExpression name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJson name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJson name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IHCNode name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IHCNode name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull String name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull String name, @Nonnull IJSExpression arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJSExpression name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJSExpression name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJson name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJson name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IHCNode name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IHCNode name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull String name, @Nonnull JSArray arguments);

/**
* @param elements parameter value
* @param name parameter value
* @param arguments parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull String name, @Nonnull JSArray arguments);

@Nonnull IMPLTYPE queue();

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJSExpression queueName);

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJson queueName);

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IHCNode queueName);

/**
* @param queueName parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull String queueName);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJSExpression queueName, @Nonnull IJSExpression newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJson queueName, @Nonnull IJSExpression newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IHCNode queueName, @Nonnull IJSExpression newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull String queueName, @Nonnull IJSExpression newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJSExpression queueName, @Nonnull JSArray newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJson queueName, @Nonnull JSArray newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IHCNode queueName, @Nonnull JSArray newQueue);

/**
* @param queueName parameter value
* @param newQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull String queueName, @Nonnull JSArray newQueue);

/**
* @param queueName parameter value
* @param callback parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJSExpression queueName, @Nonnull JSAnonymousFunction callback);

/**
* @param queueName parameter value
* @param callback parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IJson queueName, @Nonnull JSAnonymousFunction callback);

/**
* @param queueName parameter value
* @param callback parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull IHCNode queueName, @Nonnull JSAnonymousFunction callback);

/**
* @param queueName parameter value
* @param callback parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE queue(@Nonnull String queueName, @Nonnull JSAnonymousFunction callback);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ready(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE ready(@Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE remove();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE remove(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE remove(@Nonnull IJson selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE remove(@Nonnull IHCNode selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE remove(@Nonnull String selector);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE removeAttr(@Nonnull IJSExpression attributeName);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE removeAttr(@Nonnull IJson attributeName);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE removeAttr(@Nonnull IHCNode attributeName);

/**
* @param attributeName parameter value
*/
@Nonnull IMPLTYPE removeAttr(@Nonnull String attributeName);

@Nonnull IMPLTYPE removeClass();

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE removeClass(@Nonnull IJSExpression className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE removeClass(@Nonnull IJson className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE removeClass(@Nonnull IHCNode className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE removeClass(@Nonnull String className);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE removeClass(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE removeData();

/**
* @param name parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE removeData(@Nonnull IJSExpression name);

/**
* @param name parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE removeData(@Nonnull IJson name);

/**
* @param name parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE removeData(@Nonnull IHCNode name);

/**
* @param name parameter value
* @since jQuery 1.2.3
*/
@Nonnull IMPLTYPE removeData(@Nonnull String name);

/**
* @param list parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE removeData(@Nonnull JSArray list);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE removeProp(@Nonnull IJSExpression propertyName);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE removeProp(@Nonnull IJson propertyName);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE removeProp(@Nonnull IHCNode propertyName);

/**
* @param propertyName parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE removeProp(@Nonnull String propertyName);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull IJSExpression target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull IJQuerySelector target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull JQuerySelectorList target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull EHTMLElement target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull ICSSClassProvider target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull JQueryInvocation target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull JSArray target);

/**
* @param target parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceAll(@Nonnull String target);

/**
* @param newContent parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull IJSExpression newContent);

/**
* @param newContent parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull IHCNode newContent);

/**
* @param newContent parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull String newContent);

/**
* @param newContent parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull EHTMLElement newContent);

/**
* @param newContent parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull JSArray newContent);

/**
* @param newContent parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull JQueryInvocation newContent);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE replaceWith(@Nonnull JSAnonymousFunction function);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE resize(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE resize(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE resize(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE resize(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE resize();

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE scroll(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE scroll(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE scroll(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE scroll(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE scroll();

@Nonnull IMPLTYPE scrollLeft();

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollLeft(@Nonnull IJSExpression value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollLeft(int value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollLeft(long value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollLeft(@Nonnull BigInteger value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollLeft(double value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollLeft(@Nonnull BigDecimal value);

@Nonnull IMPLTYPE scrollTop();

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollTop(@Nonnull IJSExpression value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollTop(int value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollTop(long value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollTop(@Nonnull BigInteger value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollTop(double value);

/**
* @param value parameter value
* @since jQuery 1.2.6
*/
@Nonnull IMPLTYPE scrollTop(@Nonnull BigDecimal value);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE select(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE select(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE select(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE select(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE select();

@Nonnull IMPLTYPE serialize();

@Nonnull IMPLTYPE serializeArray();

@Nonnull IMPLTYPE show();

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(@Nonnull IJSExpression duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(int duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(long duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(@Nonnull BigInteger duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(double duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(@Nonnull BigDecimal duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(@Nonnull IJson duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(@Nonnull IHCNode duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE show(@Nonnull String duration);

@Nonnull IMPLTYPE siblings();

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE siblings(@Nonnull IJSExpression selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE siblings(@Nonnull IJQuerySelector selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE siblings(@Nonnull JQuerySelectorList selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE siblings(@Nonnull EHTMLElement selector);

/**
* @param selector parameter value
*/
@Nonnull IMPLTYPE siblings(@Nonnull ICSSClassProvider selector);

@Deprecated
@Nonnull IMPLTYPE size();

/**
* @param start parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull IJSExpression start);

/**
* @param start parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(int start);

/**
* @param start parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(long start);

/**
* @param start parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull BigInteger start);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull IJSExpression start, @Nonnull IJSExpression end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(int start, @Nonnull IJSExpression end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(long start, @Nonnull IJSExpression end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull BigInteger start, @Nonnull IJSExpression end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull IJSExpression start, int end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(int start, int end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(long start, int end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull BigInteger start, int end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull IJSExpression start, long end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(int start, long end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(long start, long end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull BigInteger start, long end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull IJSExpression start, @Nonnull BigInteger end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(int start, @Nonnull BigInteger end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(long start, @Nonnull BigInteger end);

/**
* @param start parameter value
* @param end parameter value
* @since jQuery 1.1.4
*/
@Nonnull IMPLTYPE slice(@Nonnull BigInteger start, @Nonnull BigInteger end);

@Nonnull IMPLTYPE slideDown();

@Nonnull IMPLTYPE slideToggle();

@Nonnull IMPLTYPE slideUp();

@Nonnull IMPLTYPE stop();

/**
* @param clearQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression clearQueue);

/**
* @param clearQueue parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE stop(boolean clearQueue);

/**
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE stop(boolean clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression clearQueue, boolean jumpToEnd);

/**
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE stop(boolean clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue);

/**
* @param queue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue);

/**
* @param queue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue, @Nonnull IJSExpression clearQueue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue, @Nonnull IJSExpression clearQueue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue, @Nonnull IJSExpression clearQueue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue, boolean clearQueue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue, boolean clearQueue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue, boolean clearQueue);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJSExpression queue, boolean clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IJson queue, boolean clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull IHCNode queue, boolean clearQueue, boolean jumpToEnd);

/**
* @param queue parameter value
* @param clearQueue parameter value
* @param jumpToEnd parameter value
* @since jQuery 1.7
*/
@Nonnull IMPLTYPE stop(@Nonnull String queue, boolean clearQueue, boolean jumpToEnd);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE submit(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
*/
@Nonnull IMPLTYPE submit(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE submit(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE submit(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE submit();

@Nonnull IMPLTYPE text();

/**
* @param textString parameter value
*/
@Nonnull IMPLTYPE text(@Nonnull IJSExpression textString);

/**
* @param textString parameter value
*/
@Nonnull IMPLTYPE text(@Nonnull IJson textString);

/**
* @param textString parameter value
*/
@Nonnull IMPLTYPE text(@Nonnull IHCNode textString);

/**
* @param textString parameter value
*/
@Nonnull IMPLTYPE text(@Nonnull String textString);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE text(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE toArray();

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull IJSExpression handler_eventObject_1);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull IJSExpression handler_eventObject_1);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull JSAnonymousFunction handler_eventObject_1);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2);

/**
* @param handler parameter value
* @param handler_eventObject_1 parameter value
* @param handler_eventObject_2 parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2);

@Nonnull IMPLTYPE toggle();

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(@Nonnull IJSExpression duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(int duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(long duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(@Nonnull BigInteger duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(double duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(@Nonnull BigDecimal duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(@Nonnull IJson duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(@Nonnull IHCNode duration);

/**
* @param duration parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE toggle(@Nonnull String duration);

/**
* @param showOrHide parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggle(boolean showOrHide);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IJSExpression className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IJson className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IHCNode className);

/**
* @param className parameter value
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull String className);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IJSExpression className, @Nonnull IJSExpression _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IJson className, @Nonnull IJSExpression _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IHCNode className, @Nonnull IJSExpression _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull String className, @Nonnull IJSExpression _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IJSExpression className, boolean _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IJson className, boolean _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull IHCNode className, boolean _switch);

/**
* @param className parameter value
* @param _switch parameter value
* @since jQuery 1.3
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull String className, boolean _switch);

@Nonnull IMPLTYPE toggleClass();

/**
* @param _switch parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE toggleClass(boolean _switch);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull JSAnonymousFunction function);

/**
* @param function parameter value
* @param _switch parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull JSAnonymousFunction function, @Nonnull IJSExpression _switch);

/**
* @param function parameter value
* @param _switch parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE toggleClass(@Nonnull JSAnonymousFunction function, boolean _switch);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IJSExpression eventType);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IJson eventType);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IHCNode eventType);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull String eventType);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IJSExpression eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IJson eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IHCNode eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull String eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IJSExpression eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IJson eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull IHCNode eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
*/
@Nonnull IMPLTYPE trigger(@Nonnull String eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IJSExpression eventType);

/**
* @param eventType parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IJson eventType);

/**
* @param eventType parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IHCNode eventType);

/**
* @param eventType parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull String eventType);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IJSExpression eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IJson eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IHCNode eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull String eventType, @Nonnull IJSExpression extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IJSExpression eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IJson eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull IHCNode eventType, @Nonnull JSArray extraParameters);

/**
* @param eventType parameter value
* @param extraParameters parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE triggerHandler(@Nonnull String eventType, @Nonnull JSArray extraParameters);

@Nonnull IMPLTYPE unbind();

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJSExpression eventType);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJson eventType);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IHCNode eventType);

/**
* @param eventType parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull String eventType);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param handler parameter value
*/
@Nonnull IMPLTYPE unbind(@Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param eventType parameter value
* @param _false parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJSExpression eventType, boolean _false);

/**
* @param eventType parameter value
* @param _false parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE unbind(@Nonnull IJson eventType, boolean _false);

/**
* @param eventType parameter value
* @param _false parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE unbind(@Nonnull IHCNode eventType, boolean _false);

/**
* @param eventType parameter value
* @param _false parameter value
* @since jQuery 1.4.3
*/
@Nonnull IMPLTYPE unbind(@Nonnull String eventType, boolean _false);

@Nonnull IMPLTYPE undelegate();

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJSExpression eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJson eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJson eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJson eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IHCNode eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IHCNode eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull String eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull String eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull String eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull String eventType);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param selector parameter value
* @param eventType parameter value
* @param handler parameter value
* @since jQuery 1.4.2
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

/**
* @param namespace parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJSExpression namespace);

/**
* @param namespace parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IJson namespace);

/**
* @param namespace parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE undelegate(@Nonnull IHCNode namespace);

/**
* @param namespace parameter value
* @since jQuery 1.6
*/
@Nonnull IMPLTYPE undelegate(@Nonnull String namespace);

/**
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE unload(@Nonnull IJSExpression handler);

/**
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
*/
@Deprecated
@Nonnull IMPLTYPE unload(@Nonnull JSAnonymousFunction handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE unload(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler);

/**
* @param eventData parameter value
* @param handler parameter value
* @deprecated Deprecated since jQuery 1.8
* @since jQuery 1.4.3
*/
@Deprecated
@Nonnull IMPLTYPE unload(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

@Nonnull IMPLTYPE unwrap();

@Nonnull IMPLTYPE val();

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE val(@Nonnull IJSExpression value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE val(@Nonnull IJson value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE val(@Nonnull IHCNode value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE val(@Nonnull String value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE val(@Nonnull JSArray value);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE val(@Nonnull JSAnonymousFunction function);

@Nonnull IMPLTYPE width();

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(@Nonnull IJSExpression value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(@Nonnull IJson value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(@Nonnull IHCNode value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(@Nonnull String value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(int value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(long value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(@Nonnull BigInteger value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(double value);

/**
* @param value parameter value
*/
@Nonnull IMPLTYPE width(@Nonnull BigDecimal value);

/**
* @param function parameter value
* @since jQuery 1.4.1
*/
@Nonnull IMPLTYPE width(@Nonnull JSAnonymousFunction function);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull IJSExpression wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull IJQuerySelector wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull JQuerySelectorList wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull EHTMLElement wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull ICSSClassProvider wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull IHCNode wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull String wrappingElement);

/**
* @param wrappingElement parameter value
*/
@Nonnull IMPLTYPE wrap(@Nonnull JQueryInvocation wrappingElement);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE wrap(@Nonnull JSAnonymousFunction function);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull IJSExpression wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull IJQuerySelector wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull JQuerySelectorList wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull EHTMLElement wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull ICSSClassProvider wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull IHCNode wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull String wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapAll(@Nonnull JQueryInvocation wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapInner(@Nonnull IJSExpression wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapInner(@Nonnull IJson wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapInner(@Nonnull IHCNode wrappingElement);

/**
* @param wrappingElement parameter value
* @since jQuery 1.2
*/
@Nonnull IMPLTYPE wrapInner(@Nonnull String wrappingElement);

/**
* @param function parameter value
* @since jQuery 1.4
*/
@Nonnull IMPLTYPE wrapInner(@Nonnull JSAnonymousFunction function);

}
