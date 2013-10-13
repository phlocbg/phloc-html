package com.phloc.html.js.builder.jquery;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSArray;
import com.phloc.html.js.builder.JSFunction;
import com.phloc.json2.IJson;

/**
 * This file is generated - do NOT edit!
 * @author com.phloc.html.supplementary.jquery.Main_AbstractJQueryInvocationExtended
*/
public abstract class AbstractJQueryInvocationExtended <IMPLTYPE extends AbstractJQueryInvocationExtended <IMPLTYPE>> extends AbstractJQueryInvocation <IMPLTYPE> implements IJQueryInvocationExtended <IMPLTYPE>
{
  public AbstractJQueryInvocationExtended (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  public AbstractJQueryInvocationExtended (@Nullable final IJSExpression aLhs, @Nonnull @Nonempty final String sMethod)
  {
    super (aLhs, sMethod);
  }

@Nonnull
public IMPLTYPE add(@Nonnull IJSExpression selector) { return add ().arg (selector); }

@Nonnull
public IMPLTYPE add(@Nonnull IJQuerySelector selector) { return add ().arg (selector); }

@Nonnull
public IMPLTYPE add(@Nonnull EHTMLElement selector) { return add ().arg (selector); }

@Nonnull
public IMPLTYPE add(@Nonnull ICSSClassProvider selector) { return add ().arg (selector); }

@Nonnull
public IMPLTYPE add(@Nonnull EHTMLElement... elements) { return add ().arg (elements); }

@Nonnull
public IMPLTYPE add(@Nonnull Iterable<EHTMLElement> elements) { return add ().arg (elements); }

@Nonnull
public IMPLTYPE add(@Nonnull String... elements) { return add ().arg (elements); }

@Nonnull
public IMPLTYPE add(@Nonnull IHCNode html) { return add ().arg (html); }

@Nonnull
public IMPLTYPE add(@Nonnull String html) { return add ().arg (html); }

@Nonnull
public IMPLTYPE add(@Nonnull JQueryInvocation jQuery_object) { return add ().arg (jQuery_object); }

@Nonnull
public IMPLTYPE add(@Nonnull IJSExpression selector, @Nonnull IJSExpression context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull EHTMLElement selector, @Nonnull IJSExpression context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull IJSExpression selector, @Nonnull EHTMLElement context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull IJSExpression selector, @Nonnull String context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull IJQuerySelector selector, @Nonnull String context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull EHTMLElement selector, @Nonnull String context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE add(@Nonnull ICSSClassProvider selector, @Nonnull String context) { return add ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE addBack(@Nonnull IJSExpression selector) { return addBack ().arg (selector); }

@Nonnull
public IMPLTYPE addBack(@Nonnull IJQuerySelector selector) { return addBack ().arg (selector); }

@Nonnull
public IMPLTYPE addBack(@Nonnull EHTMLElement selector) { return addBack ().arg (selector); }

@Nonnull
public IMPLTYPE addBack(@Nonnull ICSSClassProvider selector) { return addBack ().arg (selector); }

@Nonnull
public IMPLTYPE addClass(@Nonnull IJSExpression className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(@Nonnull IJson className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(@Nonnull IHCNode className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(@Nonnull String className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(int className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(long className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(@Nonnull BigInteger className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(double className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(@Nonnull BigDecimal className) { return addClass ().arg (className); }

@Nonnull
public IMPLTYPE addClass(@Nonnull JSAnonymousFunction function) { return addClass ().arg (function); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content) { return after ().arg (content); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content) { return after ().arg (content); }

@Nonnull
public IMPLTYPE after(@Nonnull String content) { return after ().arg (content); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content) { return after ().arg (content); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content) { return after ().arg (content); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content) { return after ().arg (content); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull IJSExpression content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content, @Nonnull IJSExpression content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull String content, @Nonnull IJSExpression content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content, @Nonnull IJSExpression content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull IHCNode content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content, @Nonnull IHCNode content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull String content, @Nonnull IHCNode content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull IHCNode content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content, @Nonnull IHCNode content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull String content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content, @Nonnull String content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull String content, @Nonnull String content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull String content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content, @Nonnull String content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull String content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content, @Nonnull EHTMLElement content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull String content, @Nonnull EHTMLElement content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content, @Nonnull EHTMLElement content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull JSArray content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content, @Nonnull JSArray content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull String content, @Nonnull JSArray content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull JSArray content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content, @Nonnull JSArray content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull JSArray content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull String content, @Nonnull JQueryInvocation content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSArray content, @Nonnull JQueryInvocation content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1) { return after ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE after(@Nonnull JSAnonymousFunction function) { return after ().arg (function); }

@Nonnull
public IMPLTYPE ajaxComplete(@Nonnull IJSExpression handler) { return ajaxComplete ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxComplete(@Nonnull JSAnonymousFunction handler) { return ajaxComplete ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxError(@Nonnull IJSExpression handler) { return ajaxError ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxError(@Nonnull JSAnonymousFunction handler) { return ajaxError ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxSend(@Nonnull IJSExpression handler) { return ajaxSend ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxSend(@Nonnull JSAnonymousFunction handler) { return ajaxSend ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxStart(@Nonnull IJSExpression handler) { return ajaxStart ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxStart(@Nonnull JSAnonymousFunction handler) { return ajaxStart ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxStop(@Nonnull IJSExpression handler) { return ajaxStop ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxStop(@Nonnull JSAnonymousFunction handler) { return ajaxStop ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxSuccess(@Nonnull IJSExpression handler) { return ajaxSuccess ().arg (handler); }

@Nonnull
public IMPLTYPE ajaxSuccess(@Nonnull JSAnonymousFunction handler) { return ajaxSuccess ().arg (handler); }

@Nonnull
public IMPLTYPE animate(@Nonnull IJSExpression properties) { return animate ().arg (properties); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content) { return append ().arg (content); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content) { return append ().arg (content); }

@Nonnull
public IMPLTYPE append(@Nonnull String content) { return append ().arg (content); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content) { return append ().arg (content); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content) { return append ().arg (content); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content) { return append ().arg (content); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull IJSExpression content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content, @Nonnull IJSExpression content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull String content, @Nonnull IJSExpression content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content, @Nonnull IJSExpression content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull IHCNode content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content, @Nonnull IHCNode content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull String content, @Nonnull IHCNode content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull IHCNode content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content, @Nonnull IHCNode content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull String content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content, @Nonnull String content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull String content, @Nonnull String content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull String content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content, @Nonnull String content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull String content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content, @Nonnull EHTMLElement content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull String content, @Nonnull EHTMLElement content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content, @Nonnull EHTMLElement content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull JSArray content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content, @Nonnull JSArray content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull String content, @Nonnull JSArray content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull JSArray content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content, @Nonnull JSArray content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull JSArray content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull String content, @Nonnull JQueryInvocation content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSArray content, @Nonnull JQueryInvocation content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1) { return append ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE append(@Nonnull JSAnonymousFunction function) { return append ().arg (function); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull IJSExpression target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull IJQuerySelector target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull EHTMLElement target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull ICSSClassProvider target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull IHCNode target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull String target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull JSArray target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE appendTo(@Nonnull JQueryInvocation target) { return appendTo ().arg (target); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(int attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(long attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(double attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName) { return attr ().arg (attributeName); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull IJSExpression value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull IJson value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull IHCNode value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull String value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, int value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, long value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull BigInteger value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, double value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull BigDecimal value) { return attr ().arg (attributeName).arg (value); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJSExpression attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(@Nonnull IJson attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(@Nonnull IHCNode attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(@Nonnull String attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(int attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(long attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigInteger attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(double attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE attr(@Nonnull BigDecimal attributeName, @Nonnull JSAnonymousFunction function) { return attr ().arg (attributeName).arg (function); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content) { return before ().arg (content); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content) { return before ().arg (content); }

@Nonnull
public IMPLTYPE before(@Nonnull String content) { return before ().arg (content); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content) { return before ().arg (content); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content) { return before ().arg (content); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content) { return before ().arg (content); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull IJSExpression content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content, @Nonnull IJSExpression content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull String content, @Nonnull IJSExpression content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content, @Nonnull IJSExpression content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull IHCNode content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content, @Nonnull IHCNode content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull String content, @Nonnull IHCNode content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull IHCNode content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content, @Nonnull IHCNode content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull String content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content, @Nonnull String content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull String content, @Nonnull String content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull String content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content, @Nonnull String content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull String content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content, @Nonnull EHTMLElement content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull String content, @Nonnull EHTMLElement content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content, @Nonnull EHTMLElement content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull JSArray content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content, @Nonnull JSArray content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull String content, @Nonnull JSArray content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull JSArray content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content, @Nonnull JSArray content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull JSArray content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull String content, @Nonnull JQueryInvocation content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSArray content, @Nonnull JQueryInvocation content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1) { return before ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE before(@Nonnull JSAnonymousFunction function) { return before ().arg (function); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(int eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(long eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigInteger eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(double eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData) { return bind ().arg (eventType).arg (eventData); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return bind ().arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJson eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(@Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(@Nonnull String eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(int eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(long eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(double eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(@Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, boolean preventBubble) { return bind ().arg (eventType).arg (eventData).arg (preventBubble); }

@Nonnull
public IMPLTYPE bind(@Nonnull IJSExpression events) { return bind ().arg (events); }

@Nonnull
public IMPLTYPE blur(@Nonnull IJSExpression handler) { return blur ().arg (handler); }

@Nonnull
public IMPLTYPE blur(@Nonnull JSAnonymousFunction handler) { return blur ().arg (handler); }

@Nonnull
public IMPLTYPE blur(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return blur ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE blur(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return blur ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE callbacks_add(@Nonnull IJSExpression callbacks) { return callbacks_add ().arg (callbacks); }

@Nonnull
public IMPLTYPE callbacks_add(@Nonnull JSAnonymousFunction callbacks) { return callbacks_add ().arg (callbacks); }

@Nonnull
public IMPLTYPE callbacks_add(@Nonnull JSArray callbacks) { return callbacks_add ().arg (callbacks); }

@Nonnull
public IMPLTYPE callbacks_fire(@Nonnull IJSExpression arguments) { return callbacks_fire ().arg (arguments); }

@Nonnull
public IMPLTYPE callbacks_fireWith(@Nonnull IJSExpression context) { return callbacks_fireWith ().arg (context); }

@Nonnull
public IMPLTYPE callbacks_fireWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args) { return callbacks_fireWith ().arg (context).arg (args); }

@Nonnull
public IMPLTYPE callbacks_has(@Nonnull IJSExpression callback) { return callbacks_has ().arg (callback); }

@Nonnull
public IMPLTYPE callbacks_has(@Nonnull JSAnonymousFunction callback) { return callbacks_has ().arg (callback); }

@Nonnull
public IMPLTYPE callbacks_remove(@Nonnull IJSExpression callbacks) { return callbacks_remove ().arg (callbacks); }

@Nonnull
public IMPLTYPE callbacks_remove(@Nonnull JSAnonymousFunction callbacks) { return callbacks_remove ().arg (callbacks); }

@Nonnull
public IMPLTYPE callbacks_remove(@Nonnull JSArray callbacks) { return callbacks_remove ().arg (callbacks); }

@Nonnull
public IMPLTYPE change(@Nonnull IJSExpression handler) { return change ().arg (handler); }

@Nonnull
public IMPLTYPE change(@Nonnull JSAnonymousFunction handler) { return change ().arg (handler); }

@Nonnull
public IMPLTYPE change(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return change ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE change(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return change ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE children(@Nonnull IJSExpression selector) { return children ().arg (selector); }

@Nonnull
public IMPLTYPE children(@Nonnull IJQuerySelector selector) { return children ().arg (selector); }

@Nonnull
public IMPLTYPE children(@Nonnull EHTMLElement selector) { return children ().arg (selector); }

@Nonnull
public IMPLTYPE children(@Nonnull ICSSClassProvider selector) { return children ().arg (selector); }

@Nonnull
public IMPLTYPE clearQueue(@Nonnull IJSExpression queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(@Nonnull IJson queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(@Nonnull IHCNode queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(@Nonnull String queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(int queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(long queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(@Nonnull BigInteger queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(double queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE clearQueue(@Nonnull BigDecimal queueName) { return clearQueue ().arg (queueName); }

@Nonnull
public IMPLTYPE click(@Nonnull IJSExpression handler) { return click ().arg (handler); }

@Nonnull
public IMPLTYPE click(@Nonnull JSAnonymousFunction handler) { return click ().arg (handler); }

@Nonnull
public IMPLTYPE click(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return click ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE click(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return click ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE _clone(@Nonnull IJSExpression withDataAndEvents) { return _clone ().arg (withDataAndEvents); }

@Nonnull
public IMPLTYPE _clone(boolean withDataAndEvents) { return _clone ().arg (withDataAndEvents); }

@Nonnull
public IMPLTYPE _clone(@Nonnull IJSExpression withDataAndEvents, @Nonnull IJSExpression deepWithDataAndEvents) { return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents); }

@Nonnull
public IMPLTYPE _clone(boolean withDataAndEvents, @Nonnull IJSExpression deepWithDataAndEvents) { return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents); }

@Nonnull
public IMPLTYPE _clone(@Nonnull IJSExpression withDataAndEvents, boolean deepWithDataAndEvents) { return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents); }

@Nonnull
public IMPLTYPE _clone(boolean withDataAndEvents, boolean deepWithDataAndEvents) { return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJSExpression selector) { return closest ().arg (selector); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJQuerySelector selector) { return closest ().arg (selector); }

@Nonnull
public IMPLTYPE closest(@Nonnull EHTMLElement selector) { return closest ().arg (selector); }

@Nonnull
public IMPLTYPE closest(@Nonnull ICSSClassProvider selector) { return closest ().arg (selector); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJSExpression selector, @Nonnull IJSExpression context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull EHTMLElement selector, @Nonnull IJSExpression context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJSExpression selector, @Nonnull EHTMLElement context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJSExpression selector, @Nonnull String context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull IJQuerySelector selector, @Nonnull String context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull EHTMLElement selector, @Nonnull String context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull ICSSClassProvider selector, @Nonnull String context) { return closest ().arg (selector).arg (context); }

@Nonnull
public IMPLTYPE closest(@Nonnull JQueryInvocation jQuery_object) { return closest ().arg (jQuery_object); }

@Nonnull
public IMPLTYPE closest(@Nonnull String element) { return closest ().arg (element); }

@Deprecated
@Nonnull
public IMPLTYPE closest(@Nonnull JSArray selectors) { return closest ().arg (selectors); }

@Deprecated
@Nonnull
public IMPLTYPE closest(@Nonnull JSArray selectors, @Nonnull IJSExpression context) { return closest ().arg (selectors).arg (context); }

@Deprecated
@Nonnull
public IMPLTYPE closest(@Nonnull JSArray selectors, @Nonnull EHTMLElement context) { return closest ().arg (selectors).arg (context); }

@Deprecated
@Nonnull
public IMPLTYPE closest(@Nonnull JSArray selectors, @Nonnull String context) { return closest ().arg (selectors).arg (context); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(int propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(long propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(double propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName) { return css ().arg (propertyName); }

@Nonnull
public IMPLTYPE css(@Nonnull JSArray propertyNames) { return css ().arg (propertyNames); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull IJSExpression value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull IJson value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull IHCNode value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull String value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, int value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, long value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull BigInteger value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, double value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull BigDecimal value) { return css ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE css(@Nonnull IJSExpression propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(@Nonnull IJson propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(@Nonnull IHCNode propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(@Nonnull String propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(int propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(long propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(@Nonnull BigInteger propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(double propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE css(@Nonnull BigDecimal propertyName, @Nonnull JSAnonymousFunction function) { return css ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE data(@Nonnull IJSExpression key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(@Nonnull IJson key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(@Nonnull IHCNode key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(@Nonnull String key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(int key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(long key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(@Nonnull BigInteger key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(double key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(@Nonnull BigDecimal key, @Nonnull IJSExpression value) { return data ().arg (key).arg (value); }

@Nonnull
public IMPLTYPE data(@Nonnull IJSExpression obj) { return data ().arg (obj); }

@Nonnull
public IMPLTYPE data(@Nonnull IJson key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(@Nonnull IHCNode key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(@Nonnull String key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(int key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(long key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(@Nonnull BigInteger key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(double key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE data(@Nonnull BigDecimal key) { return data ().arg (key); }

@Nonnull
public IMPLTYPE dblclick(@Nonnull IJSExpression handler) { return dblclick ().arg (handler); }

@Nonnull
public IMPLTYPE dblclick(@Nonnull JSAnonymousFunction handler) { return dblclick ().arg (handler); }

@Nonnull
public IMPLTYPE dblclick(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return dblclick ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE dblclick(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return dblclick ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE deferred_always(@Nonnull IJSExpression alwaysCallbacks) { return deferred_always ().arg (alwaysCallbacks); }

@Nonnull
public IMPLTYPE deferred_always(@Nonnull JSAnonymousFunction alwaysCallbacks) { return deferred_always ().arg (alwaysCallbacks); }

@Nonnull
public IMPLTYPE deferred_always(@Nonnull IJSExpression alwaysCallbacks, @Nonnull IJSExpression alwaysCallbacks1) { return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1); }

@Nonnull
public IMPLTYPE deferred_always(@Nonnull JSAnonymousFunction alwaysCallbacks, @Nonnull IJSExpression alwaysCallbacks1) { return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1); }

@Nonnull
public IMPLTYPE deferred_always(@Nonnull IJSExpression alwaysCallbacks, @Nonnull JSAnonymousFunction alwaysCallbacks1) { return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1); }

@Nonnull
public IMPLTYPE deferred_always(@Nonnull JSAnonymousFunction alwaysCallbacks, @Nonnull JSAnonymousFunction alwaysCallbacks1) { return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1); }

@Nonnull
public IMPLTYPE deferred_done(@Nonnull IJSExpression doneCallbacks) { return deferred_done ().arg (doneCallbacks); }

@Nonnull
public IMPLTYPE deferred_done(@Nonnull JSAnonymousFunction doneCallbacks) { return deferred_done ().arg (doneCallbacks); }

@Nonnull
public IMPLTYPE deferred_done(@Nonnull IJSExpression doneCallbacks, @Nonnull IJSExpression doneCallbacks1) { return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1); }

@Nonnull
public IMPLTYPE deferred_done(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull IJSExpression doneCallbacks1) { return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1); }

@Nonnull
public IMPLTYPE deferred_done(@Nonnull IJSExpression doneCallbacks, @Nonnull JSAnonymousFunction doneCallbacks1) { return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1); }

@Nonnull
public IMPLTYPE deferred_done(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull JSAnonymousFunction doneCallbacks1) { return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1); }

@Nonnull
public IMPLTYPE deferred_fail(@Nonnull IJSExpression failCallbacks) { return deferred_fail ().arg (failCallbacks); }

@Nonnull
public IMPLTYPE deferred_fail(@Nonnull JSAnonymousFunction failCallbacks) { return deferred_fail ().arg (failCallbacks); }

@Nonnull
public IMPLTYPE deferred_fail(@Nonnull IJSExpression failCallbacks, @Nonnull IJSExpression failCallbacks1) { return deferred_fail ().arg (failCallbacks).arg (failCallbacks1); }

@Nonnull
public IMPLTYPE deferred_fail(@Nonnull JSAnonymousFunction failCallbacks, @Nonnull IJSExpression failCallbacks1) { return deferred_fail ().arg (failCallbacks).arg (failCallbacks1); }

@Nonnull
public IMPLTYPE deferred_fail(@Nonnull IJSExpression failCallbacks, @Nonnull JSAnonymousFunction failCallbacks1) { return deferred_fail ().arg (failCallbacks).arg (failCallbacks1); }

@Nonnull
public IMPLTYPE deferred_fail(@Nonnull JSAnonymousFunction failCallbacks, @Nonnull JSAnonymousFunction failCallbacks1) { return deferred_fail ().arg (failCallbacks).arg (failCallbacks1); }

@Nonnull
public IMPLTYPE deferred_notify(@Nonnull IJSExpression args) { return deferred_notify ().arg (args); }

@Nonnull
public IMPLTYPE deferred_notifyWith(@Nonnull IJSExpression context) { return deferred_notifyWith ().arg (context); }

@Nonnull
public IMPLTYPE deferred_notifyWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args) { return deferred_notifyWith ().arg (context).arg (args); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter) { return deferred_pipe ().arg (doneFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter) { return deferred_pipe ().arg (doneFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Deprecated
@Nonnull
public IMPLTYPE deferred_pipe(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_progress(@Nonnull IJSExpression progressCallbacks) { return deferred_progress ().arg (progressCallbacks); }

@Nonnull
public IMPLTYPE deferred_progress(@Nonnull JSAnonymousFunction progressCallbacks) { return deferred_progress ().arg (progressCallbacks); }

@Nonnull
public IMPLTYPE deferred_progress(@Nonnull JSArray progressCallbacks) { return deferred_progress ().arg (progressCallbacks); }

@Nonnull
public IMPLTYPE deferred_promise(@Nonnull IJSExpression target) { return deferred_promise ().arg (target); }

@Nonnull
public IMPLTYPE deferred_reject(@Nonnull IJSExpression args) { return deferred_reject ().arg (args); }

@Nonnull
public IMPLTYPE deferred_rejectWith(@Nonnull IJSExpression context) { return deferred_rejectWith ().arg (context); }

@Nonnull
public IMPLTYPE deferred_rejectWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args) { return deferred_rejectWith ().arg (context).arg (args); }

@Nonnull
public IMPLTYPE deferred_rejectWith(@Nonnull IJSExpression context, @Nonnull JSArray args) { return deferred_rejectWith ().arg (context).arg (args); }

@Nonnull
public IMPLTYPE deferred_resolve(@Nonnull IJSExpression args) { return deferred_resolve ().arg (args); }

@Nonnull
public IMPLTYPE deferred_resolveWith(@Nonnull IJSExpression context) { return deferred_resolveWith ().arg (context); }

@Nonnull
public IMPLTYPE deferred_resolveWith(@Nonnull IJSExpression context, @Nonnull IJSExpression args) { return deferred_resolveWith ().arg (context).arg (args); }

@Nonnull
public IMPLTYPE deferred_resolveWith(@Nonnull IJSExpression context, @Nonnull JSArray args) { return deferred_resolveWith ().arg (context).arg (args); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter) { return deferred_then ().arg (doneFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter) { return deferred_then ().arg (doneFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull IJSExpression progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull IJSExpression progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull IJSExpression failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter, @Nonnull JSAnonymousFunction progressFilter) { return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneCallbacks, @Nonnull IJSExpression failCallbacks) { return deferred_then ().arg (doneCallbacks).arg (failCallbacks); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull IJSExpression failCallbacks) { return deferred_then ().arg (doneCallbacks).arg (failCallbacks); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull IJSExpression doneCallbacks, @Nonnull JSAnonymousFunction failCallbacks) { return deferred_then ().arg (doneCallbacks).arg (failCallbacks); }

@Nonnull
public IMPLTYPE deferred_then(@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull JSAnonymousFunction failCallbacks) { return deferred_then ().arg (doneCallbacks).arg (failCallbacks); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration) { return delay ().arg (duration); }

@Nonnull
public IMPLTYPE delay(int duration) { return delay ().arg (duration); }

@Nonnull
public IMPLTYPE delay(long duration) { return delay ().arg (duration); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration) { return delay ().arg (duration); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull IJSExpression queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, @Nonnull IJSExpression queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, @Nonnull IJSExpression queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull IJSExpression queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull IJson queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, @Nonnull IJson queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, @Nonnull IJson queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull IJson queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull IHCNode queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, @Nonnull IHCNode queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, @Nonnull IHCNode queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull IHCNode queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull String queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, @Nonnull String queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, @Nonnull String queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull String queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, int queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, int queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, int queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, int queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, long queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, long queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, long queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, long queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull BigInteger queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, @Nonnull BigInteger queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, @Nonnull BigInteger queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull BigInteger queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, double queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, double queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, double queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, double queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull IJSExpression duration, @Nonnull BigDecimal queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(int duration, @Nonnull BigDecimal queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(long duration, @Nonnull BigDecimal queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delay(@Nonnull BigInteger duration, @Nonnull BigDecimal queueName) { return delay ().arg (duration).arg (queueName); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, int eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, long eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, double eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, int eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, long eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, double eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, int eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, long eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, double eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IJson selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(@Nonnull IHCNode selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(@Nonnull String selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(int selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(long selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigInteger selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(double selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE delegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression events) { return delegate ().arg (selector).arg (events); }

@Nonnull
public IMPLTYPE dequeue(@Nonnull IJSExpression queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(@Nonnull IJson queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(@Nonnull IHCNode queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(@Nonnull String queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(int queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(long queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(@Nonnull BigInteger queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(double queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE dequeue(@Nonnull BigDecimal queueName) { return dequeue ().arg (queueName); }

@Nonnull
public IMPLTYPE detach(@Nonnull IJSExpression selector) { return detach ().arg (selector); }

@Nonnull
public IMPLTYPE detach(@Nonnull IJQuerySelector selector) { return detach ().arg (selector); }

@Nonnull
public IMPLTYPE detach(@Nonnull EHTMLElement selector) { return detach ().arg (selector); }

@Nonnull
public IMPLTYPE detach(@Nonnull ICSSClassProvider selector) { return detach ().arg (selector); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType) { return die ().arg (eventType); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, @Nonnull IJson handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, @Nonnull IHCNode handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, @Nonnull String handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, int handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, long handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, @Nonnull BigInteger handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, double handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJSExpression eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IJson eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull IHCNode eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull String eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(int eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(long eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigInteger eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(double eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE die(@Nonnull BigDecimal eventType, @Nonnull BigDecimal handler) { return die ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE each(@Nonnull IJSExpression function) { return each ().arg (function); }

@Nonnull
public IMPLTYPE each(@Nonnull JSAnonymousFunction function) { return each ().arg (function); }

@Nonnull
public IMPLTYPE _eq(@Nonnull IJSExpression index) { return _eq ().arg (index); }

@Nonnull
public IMPLTYPE _eq(int index) { return _eq ().arg (index); }

@Nonnull
public IMPLTYPE _eq(long index) { return _eq ().arg (index); }

@Nonnull
public IMPLTYPE _eq(@Nonnull BigInteger index) { return _eq ().arg (index); }

@Deprecated
@Nonnull
public IMPLTYPE error(@Nonnull IJSExpression handler) { return error ().arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE error(@Nonnull JSAnonymousFunction handler) { return error ().arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE error(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return error ().arg (eventData).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE error(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return error ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity) { return fadeTo ().arg (duration).arg (opacity); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, int easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, long easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, double easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing) { return fadeTo ().arg (duration).arg (opacity).arg (easing); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, int easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, long easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, double easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull IJSExpression complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJSExpression easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IJson easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull IHCNode easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, int easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, long easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull BigInteger easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, double easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull IJSExpression opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, int opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, long opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, double opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJSExpression duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IJson duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull IHCNode duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(int duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(long duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(double duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE fadeTo(@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull BigDecimal easing, @Nonnull JSAnonymousFunction complete) { return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete); }

@Nonnull
public IMPLTYPE filter(@Nonnull IJSExpression selector) { return filter ().arg (selector); }

@Nonnull
public IMPLTYPE filter(@Nonnull IJQuerySelector selector) { return filter ().arg (selector); }

@Nonnull
public IMPLTYPE filter(@Nonnull EHTMLElement selector) { return filter ().arg (selector); }

@Nonnull
public IMPLTYPE filter(@Nonnull ICSSClassProvider selector) { return filter ().arg (selector); }

@Nonnull
public IMPLTYPE filter(@Nonnull JSAnonymousFunction function) { return filter ().arg (function); }

@Nonnull
public IMPLTYPE filter(@Nonnull String element) { return filter ().arg (element); }

@Nonnull
public IMPLTYPE find(@Nonnull IJSExpression selector) { return find ().arg (selector); }

@Nonnull
public IMPLTYPE find(@Nonnull IJQuerySelector selector) { return find ().arg (selector); }

@Nonnull
public IMPLTYPE find(@Nonnull EHTMLElement selector) { return find ().arg (selector); }

@Nonnull
public IMPLTYPE find(@Nonnull ICSSClassProvider selector) { return find ().arg (selector); }

@Nonnull
public IMPLTYPE find(@Nonnull String element) { return find ().arg (element); }

@Nonnull
public IMPLTYPE finish(@Nonnull IJSExpression queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(@Nonnull IJson queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(@Nonnull IHCNode queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(@Nonnull String queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(int queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(long queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(@Nonnull BigInteger queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(double queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE finish(@Nonnull BigDecimal queue) { return finish ().arg (queue); }

@Nonnull
public IMPLTYPE focus(@Nonnull IJSExpression handler) { return focus ().arg (handler); }

@Nonnull
public IMPLTYPE focus(@Nonnull JSAnonymousFunction handler) { return focus ().arg (handler); }

@Nonnull
public IMPLTYPE focus(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return focus ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE focus(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return focus ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE focusin(@Nonnull IJSExpression handler) { return focusin ().arg (handler); }

@Nonnull
public IMPLTYPE focusin(@Nonnull JSAnonymousFunction handler) { return focusin ().arg (handler); }

@Nonnull
public IMPLTYPE focusin(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return focusin ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE focusin(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return focusin ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE focusout(@Nonnull IJSExpression handler) { return focusout ().arg (handler); }

@Nonnull
public IMPLTYPE focusout(@Nonnull JSAnonymousFunction handler) { return focusout ().arg (handler); }

@Nonnull
public IMPLTYPE focusout(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return focusout ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE focusout(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return focusout ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE get(@Nonnull IJSExpression index) { return get ().arg (index); }

@Nonnull
public IMPLTYPE get(int index) { return get ().arg (index); }

@Nonnull
public IMPLTYPE get(long index) { return get ().arg (index); }

@Nonnull
public IMPLTYPE get(@Nonnull BigInteger index) { return get ().arg (index); }

@Nonnull
public IMPLTYPE has(@Nonnull IJSExpression selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(@Nonnull IJson selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(@Nonnull IHCNode selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(@Nonnull String selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(int selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(long selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(@Nonnull BigInteger selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(double selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(@Nonnull BigDecimal selector) { return has ().arg (selector); }

@Nonnull
public IMPLTYPE has(@Nonnull EHTMLElement contained) { return has ().arg (contained); }

@Nonnull
public IMPLTYPE hasClass(@Nonnull IJSExpression className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(@Nonnull IJson className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(@Nonnull IHCNode className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(@Nonnull String className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(int className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(long className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(@Nonnull BigInteger className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(double className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE hasClass(@Nonnull BigDecimal className) { return hasClass ().arg (className); }

@Nonnull
public IMPLTYPE height(@Nonnull IJSExpression value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(@Nonnull IJson value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(@Nonnull IHCNode value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(@Nonnull String value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(int value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(long value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(@Nonnull BigInteger value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(double value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(@Nonnull BigDecimal value) { return height ().arg (value); }

@Nonnull
public IMPLTYPE height(@Nonnull JSAnonymousFunction function) { return height ().arg (function); }

@Nonnull
public IMPLTYPE hide(@Nonnull IJSExpression duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(int duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(long duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(@Nonnull BigInteger duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(double duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(@Nonnull BigDecimal duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(@Nonnull IJson duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(@Nonnull IHCNode duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hide(@Nonnull String duration) { return hide ().arg (duration); }

@Nonnull
public IMPLTYPE hover(@Nonnull IJSExpression handlerIn, @Nonnull IJSExpression handlerOut) { return hover ().arg (handlerIn).arg (handlerOut); }

@Nonnull
public IMPLTYPE hover(@Nonnull JSAnonymousFunction handlerIn, @Nonnull IJSExpression handlerOut) { return hover ().arg (handlerIn).arg (handlerOut); }

@Nonnull
public IMPLTYPE hover(@Nonnull IJSExpression handlerIn, @Nonnull JSAnonymousFunction handlerOut) { return hover ().arg (handlerIn).arg (handlerOut); }

@Nonnull
public IMPLTYPE hover(@Nonnull JSAnonymousFunction handlerIn, @Nonnull JSAnonymousFunction handlerOut) { return hover ().arg (handlerIn).arg (handlerOut); }

@Nonnull
public IMPLTYPE hover(@Nonnull IJSExpression handlerInOut) { return hover ().arg (handlerInOut); }

@Nonnull
public IMPLTYPE hover(@Nonnull JSAnonymousFunction handlerInOut) { return hover ().arg (handlerInOut); }

@Nonnull
public IMPLTYPE html(@Nonnull IJSExpression htmlString) { return html ().arg (htmlString); }

@Nonnull
public IMPLTYPE html(@Nonnull IHCNode htmlString) { return html ().arg (htmlString); }

@Nonnull
public IMPLTYPE html(@Nonnull String htmlString) { return html ().arg (htmlString); }

@Nonnull
public IMPLTYPE html(@Nonnull JSAnonymousFunction function) { return html ().arg (function); }

@Nonnull
public IMPLTYPE index(@Nonnull IJSExpression selector) { return index ().arg (selector); }

@Nonnull
public IMPLTYPE index(@Nonnull IJQuerySelector selector) { return index ().arg (selector); }

@Nonnull
public IMPLTYPE index(@Nonnull EHTMLElement selector) { return index ().arg (selector); }

@Nonnull
public IMPLTYPE index(@Nonnull ICSSClassProvider selector) { return index ().arg (selector); }

@Nonnull
public IMPLTYPE index(@Nonnull String element) { return index ().arg (element); }

@Nonnull
public IMPLTYPE index(@Nonnull JQueryInvocation element) { return index ().arg (element); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull IJSExpression target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull IJQuerySelector target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull EHTMLElement target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull ICSSClassProvider target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull IHCNode target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull String target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull JSArray target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertAfter(@Nonnull JQueryInvocation target) { return insertAfter ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull IJSExpression target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull IJQuerySelector target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull EHTMLElement target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull ICSSClassProvider target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull IHCNode target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull String target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull JSArray target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE insertBefore(@Nonnull JQueryInvocation target) { return insertBefore ().arg (target); }

@Nonnull
public IMPLTYPE is(@Nonnull IJSExpression selector) { return is ().arg (selector); }

@Nonnull
public IMPLTYPE is(@Nonnull IJQuerySelector selector) { return is ().arg (selector); }

@Nonnull
public IMPLTYPE is(@Nonnull EHTMLElement selector) { return is ().arg (selector); }

@Nonnull
public IMPLTYPE is(@Nonnull ICSSClassProvider selector) { return is ().arg (selector); }

@Nonnull
public IMPLTYPE is(@Nonnull JSAnonymousFunction function) { return is ().arg (function); }

@Nonnull
public IMPLTYPE is(@Nonnull String element) { return is ().arg (element); }

@Nonnull
public IMPLTYPE keydown(@Nonnull IJSExpression handler) { return keydown ().arg (handler); }

@Nonnull
public IMPLTYPE keydown(@Nonnull JSAnonymousFunction handler) { return keydown ().arg (handler); }

@Nonnull
public IMPLTYPE keydown(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return keydown ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE keydown(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return keydown ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE keypress(@Nonnull IJSExpression handler) { return keypress ().arg (handler); }

@Nonnull
public IMPLTYPE keypress(@Nonnull JSAnonymousFunction handler) { return keypress ().arg (handler); }

@Nonnull
public IMPLTYPE keypress(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return keypress ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE keypress(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return keypress ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE keyup(@Nonnull IJSExpression handler) { return keyup ().arg (handler); }

@Nonnull
public IMPLTYPE keyup(@Nonnull JSAnonymousFunction handler) { return keyup ().arg (handler); }

@Nonnull
public IMPLTYPE keyup(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return keyup ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE keyup(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return keyup ().arg (eventData).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJson events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IHCNode events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull String events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(int events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(long events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigInteger events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(double events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigDecimal events, @Nonnull IJSExpression handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJson events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IHCNode events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull String events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(int events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(long events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigInteger events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(double events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigDecimal events, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(int events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(long events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigInteger events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(double events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigDecimal events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(int events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(long events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigInteger events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(double events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull BigDecimal events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return live ().arg (events).arg (data).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE live(@Nonnull IJSExpression events) { return live ().arg (events); }

@Deprecated
@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression handler) { return load ().arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE load(@Nonnull JSAnonymousFunction handler) { return load ().arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return load ().arg (eventData).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return load ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(@Nonnull String url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(int url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(long url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(double url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url) { return load ().arg (url); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IJSExpression data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IJson data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IHCNode data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull String data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, int data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, long data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull BigInteger data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, double data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull BigDecimal data) { return load ().arg (url).arg (data); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IJSExpression data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IJson data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IHCNode data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull String data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, int data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, long data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull BigInteger data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, double data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull BigDecimal data, @Nonnull IJSExpression complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IJson data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull IHCNode data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull String data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, int data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, long data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull BigInteger data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, double data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJSExpression url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IJson url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull IHCNode url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull String url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(int url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(long url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigInteger url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(double url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE load(@Nonnull BigDecimal url, @Nonnull BigDecimal data, @Nonnull JSAnonymousFunction complete) { return load ().arg (url).arg (data).arg (complete); }

@Nonnull
public IMPLTYPE map(@Nonnull IJSExpression callback) { return map ().arg (callback); }

@Nonnull
public IMPLTYPE map(@Nonnull JSAnonymousFunction callback) { return map ().arg (callback); }

@Nonnull
public IMPLTYPE mousedown(@Nonnull IJSExpression handler) { return mousedown ().arg (handler); }

@Nonnull
public IMPLTYPE mousedown(@Nonnull JSAnonymousFunction handler) { return mousedown ().arg (handler); }

@Nonnull
public IMPLTYPE mousedown(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mousedown ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mousedown(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mousedown ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseenter(@Nonnull IJSExpression handler) { return mouseenter ().arg (handler); }

@Nonnull
public IMPLTYPE mouseenter(@Nonnull JSAnonymousFunction handler) { return mouseenter ().arg (handler); }

@Nonnull
public IMPLTYPE mouseenter(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mouseenter ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseenter(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mouseenter ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseleave(@Nonnull IJSExpression handler) { return mouseleave ().arg (handler); }

@Nonnull
public IMPLTYPE mouseleave(@Nonnull JSAnonymousFunction handler) { return mouseleave ().arg (handler); }

@Nonnull
public IMPLTYPE mouseleave(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mouseleave ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseleave(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mouseleave ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mousemove(@Nonnull IJSExpression handler) { return mousemove ().arg (handler); }

@Nonnull
public IMPLTYPE mousemove(@Nonnull JSAnonymousFunction handler) { return mousemove ().arg (handler); }

@Nonnull
public IMPLTYPE mousemove(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mousemove ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mousemove(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mousemove ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseout(@Nonnull IJSExpression handler) { return mouseout ().arg (handler); }

@Nonnull
public IMPLTYPE mouseout(@Nonnull JSAnonymousFunction handler) { return mouseout ().arg (handler); }

@Nonnull
public IMPLTYPE mouseout(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mouseout ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseout(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mouseout ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseover(@Nonnull IJSExpression handler) { return mouseover ().arg (handler); }

@Nonnull
public IMPLTYPE mouseover(@Nonnull JSAnonymousFunction handler) { return mouseover ().arg (handler); }

@Nonnull
public IMPLTYPE mouseover(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mouseover ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseover(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mouseover ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseup(@Nonnull IJSExpression handler) { return mouseup ().arg (handler); }

@Nonnull
public IMPLTYPE mouseup(@Nonnull JSAnonymousFunction handler) { return mouseup ().arg (handler); }

@Nonnull
public IMPLTYPE mouseup(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return mouseup ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE mouseup(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return mouseup ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE next(@Nonnull IJSExpression selector) { return next ().arg (selector); }

@Nonnull
public IMPLTYPE next(@Nonnull IJQuerySelector selector) { return next ().arg (selector); }

@Nonnull
public IMPLTYPE next(@Nonnull EHTMLElement selector) { return next ().arg (selector); }

@Nonnull
public IMPLTYPE next(@Nonnull ICSSClassProvider selector) { return next ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(@Nonnull IJSExpression selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(@Nonnull IJson selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(@Nonnull IHCNode selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(@Nonnull String selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(int selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(long selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(@Nonnull BigInteger selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(double selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextAll(@Nonnull BigDecimal selector) { return nextAll ().arg (selector); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJSExpression selector) { return nextUntil ().arg (selector); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector) { return nextUntil ().arg (selector); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull EHTMLElement selector) { return nextUntil ().arg (selector); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector) { return nextUntil ().arg (selector); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull IJSExpression filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull IJSExpression filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull IJQuerySelector filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull IJQuerySelector filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJQuerySelector filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull EHTMLElement filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJSExpression selector, @Nonnull ICSSClassProvider filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull IJQuerySelector selector, @Nonnull ICSSClassProvider filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull EHTMLElement selector, @Nonnull ICSSClassProvider filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull ICSSClassProvider selector, @Nonnull ICSSClassProvider filter) { return nextUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull String element) { return nextUntil ().arg (element); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull String element, @Nonnull IJSExpression filter) { return nextUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull String element, @Nonnull IJQuerySelector filter) { return nextUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull String element, @Nonnull EHTMLElement filter) { return nextUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE nextUntil(@Nonnull String element, @Nonnull ICSSClassProvider filter) { return nextUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE _not(@Nonnull IJSExpression selector) { return _not ().arg (selector); }

@Nonnull
public IMPLTYPE _not(@Nonnull IJQuerySelector selector) { return _not ().arg (selector); }

@Nonnull
public IMPLTYPE _not(@Nonnull EHTMLElement selector) { return _not ().arg (selector); }

@Nonnull
public IMPLTYPE _not(@Nonnull ICSSClassProvider selector) { return _not ().arg (selector); }

@Nonnull
public IMPLTYPE _not(@Nonnull EHTMLElement... elements) { return _not ().arg (elements); }

@Nonnull
public IMPLTYPE _not(@Nonnull Iterable<EHTMLElement> elements) { return _not ().arg (elements); }

@Nonnull
public IMPLTYPE _not(@Nonnull String... elements) { return _not ().arg (elements); }

@Nonnull
public IMPLTYPE _not(@Nonnull JSAnonymousFunction function) { return _not ().arg (function); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(@Nonnull String events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(int events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(long events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(double events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events) { return off ().arg (events); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IJSExpression selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IJson selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IHCNode selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull String selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, int selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, long selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull BigInteger selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, double selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull BigDecimal selector) { return off ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, int selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, long selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, double selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(int events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(long events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(double events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE off(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull JSAnonymousFunction handler) { return off ().arg (events).arg (selector).arg (handler); }

@Nonnull
public IMPLTYPE offset(@Nonnull IJSExpression coordinates) { return offset ().arg (coordinates); }

@Nonnull
public IMPLTYPE offset(@Nonnull JSAnonymousFunction function) { return offset ().arg (function); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJSExpression selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJson selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IHCNode selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull String selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, int selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, long selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigInteger selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, double selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigDecimal selector) { return on ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return on ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return on ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE on(@Nonnull IJSExpression events) { return on ().arg (events); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJSExpression data) { return one ().arg (events).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJson selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IHCNode selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull String selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, int selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, long selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigInteger selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, double selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigDecimal selector) { return one ().arg (events).arg (selector); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data) { return one ().arg (events).arg (selector).arg (data); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull IJSExpression handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJSExpression selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IJson selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull IHCNode selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull String selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, int selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, long selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigInteger selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, double selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJson events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IHCNode events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull String events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(int events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(long events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigInteger events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(double events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull BigDecimal events, @Nonnull BigDecimal selector, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler) { return one ().arg (events).arg (selector).arg (data).arg (handler); }

@Nonnull
public IMPLTYPE one(@Nonnull IJSExpression events) { return one ().arg (events); }

@Nonnull
public IMPLTYPE outerHeight(@Nonnull IJSExpression includeMargin) { return outerHeight ().arg (includeMargin); }

@Nonnull
public IMPLTYPE outerHeight(boolean includeMargin) { return outerHeight ().arg (includeMargin); }

@Nonnull
public IMPLTYPE outerWidth(@Nonnull IJSExpression includeMargin) { return outerWidth ().arg (includeMargin); }

@Nonnull
public IMPLTYPE outerWidth(boolean includeMargin) { return outerWidth ().arg (includeMargin); }

@Nonnull
public IMPLTYPE parent(@Nonnull IJSExpression selector) { return parent ().arg (selector); }

@Nonnull
public IMPLTYPE parent(@Nonnull IJQuerySelector selector) { return parent ().arg (selector); }

@Nonnull
public IMPLTYPE parent(@Nonnull EHTMLElement selector) { return parent ().arg (selector); }

@Nonnull
public IMPLTYPE parent(@Nonnull ICSSClassProvider selector) { return parent ().arg (selector); }

@Nonnull
public IMPLTYPE parents(@Nonnull IJSExpression selector) { return parents ().arg (selector); }

@Nonnull
public IMPLTYPE parents(@Nonnull IJQuerySelector selector) { return parents ().arg (selector); }

@Nonnull
public IMPLTYPE parents(@Nonnull EHTMLElement selector) { return parents ().arg (selector); }

@Nonnull
public IMPLTYPE parents(@Nonnull ICSSClassProvider selector) { return parents ().arg (selector); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJSExpression selector) { return parentsUntil ().arg (selector); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector) { return parentsUntil ().arg (selector); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector) { return parentsUntil ().arg (selector); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector) { return parentsUntil ().arg (selector); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull IJSExpression filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull IJSExpression filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull IJQuerySelector filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull IJQuerySelector filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJQuerySelector filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull EHTMLElement filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJSExpression selector, @Nonnull ICSSClassProvider filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull IJQuerySelector selector, @Nonnull ICSSClassProvider filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull EHTMLElement selector, @Nonnull ICSSClassProvider filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull ICSSClassProvider selector, @Nonnull ICSSClassProvider filter) { return parentsUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull String element) { return parentsUntil ().arg (element); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull IJSExpression filter) { return parentsUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull IJQuerySelector filter) { return parentsUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull EHTMLElement filter) { return parentsUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE parentsUntil(@Nonnull String element, @Nonnull ICSSClassProvider filter) { return parentsUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content) { return prepend ().arg (content); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content) { return prepend ().arg (content); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content) { return prepend ().arg (content); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content) { return prepend ().arg (content); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content) { return prepend ().arg (content); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content) { return prepend ().arg (content); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull IJSExpression content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull IJSExpression content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content, @Nonnull IJSExpression content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull IJSExpression content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull IJSExpression content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull IJSExpression content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull IHCNode content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull IHCNode content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content, @Nonnull IHCNode content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull IHCNode content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull IHCNode content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull IHCNode content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull String content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull String content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content, @Nonnull String content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull String content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull String content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull String content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull EHTMLElement content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull EHTMLElement content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content, @Nonnull EHTMLElement content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull EHTMLElement content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull JSArray content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull JSArray content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content, @Nonnull JSArray content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull JSArray content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull JSArray content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull JSArray content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IJSExpression content, @Nonnull JQueryInvocation content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull IHCNode content, @Nonnull JQueryInvocation content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull String content, @Nonnull JQueryInvocation content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSArray content, @Nonnull JQueryInvocation content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1) { return prepend ().arg (content).arg (content1); }

@Nonnull
public IMPLTYPE prepend(@Nonnull JSAnonymousFunction function) { return prepend ().arg (function); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull IJSExpression target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull IJQuerySelector target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull EHTMLElement target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull ICSSClassProvider target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull IHCNode target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull String target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull JSArray target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prependTo(@Nonnull JQueryInvocation target) { return prependTo ().arg (target); }

@Nonnull
public IMPLTYPE prev(@Nonnull IJSExpression selector) { return prev ().arg (selector); }

@Nonnull
public IMPLTYPE prev(@Nonnull IJQuerySelector selector) { return prev ().arg (selector); }

@Nonnull
public IMPLTYPE prev(@Nonnull EHTMLElement selector) { return prev ().arg (selector); }

@Nonnull
public IMPLTYPE prev(@Nonnull ICSSClassProvider selector) { return prev ().arg (selector); }

@Nonnull
public IMPLTYPE prevAll(@Nonnull IJSExpression selector) { return prevAll ().arg (selector); }

@Nonnull
public IMPLTYPE prevAll(@Nonnull IJQuerySelector selector) { return prevAll ().arg (selector); }

@Nonnull
public IMPLTYPE prevAll(@Nonnull EHTMLElement selector) { return prevAll ().arg (selector); }

@Nonnull
public IMPLTYPE prevAll(@Nonnull ICSSClassProvider selector) { return prevAll ().arg (selector); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJSExpression selector) { return prevUntil ().arg (selector); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector) { return prevUntil ().arg (selector); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull EHTMLElement selector) { return prevUntil ().arg (selector); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector) { return prevUntil ().arg (selector); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull IJSExpression filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull IJSExpression filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull IJSExpression filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJSExpression filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull IJQuerySelector filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull IJQuerySelector filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull IJQuerySelector filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull EHTMLElement filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull EHTMLElement filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull EHTMLElement filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJSExpression selector, @Nonnull ICSSClassProvider filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull IJQuerySelector selector, @Nonnull ICSSClassProvider filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull EHTMLElement selector, @Nonnull ICSSClassProvider filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull ICSSClassProvider selector, @Nonnull ICSSClassProvider filter) { return prevUntil ().arg (selector).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull String element) { return prevUntil ().arg (element); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull String element, @Nonnull IJSExpression filter) { return prevUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull String element, @Nonnull IJQuerySelector filter) { return prevUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull String element, @Nonnull EHTMLElement filter) { return prevUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE prevUntil(@Nonnull String element, @Nonnull ICSSClassProvider filter) { return prevUntil ().arg (element).arg (filter); }

@Nonnull
public IMPLTYPE promise(@Nonnull IJSExpression type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(@Nonnull IJson type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(@Nonnull IHCNode type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(@Nonnull String type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(int type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(long type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(@Nonnull BigInteger type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(double type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(@Nonnull BigDecimal type) { return promise ().arg (type); }

@Nonnull
public IMPLTYPE promise(@Nonnull IJSExpression type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(@Nonnull IJson type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(@Nonnull IHCNode type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(@Nonnull String type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(int type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(long type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(@Nonnull BigInteger type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(double type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE promise(@Nonnull BigDecimal type, @Nonnull IJSExpression target) { return promise ().arg (type).arg (target); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(int propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(long propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(double propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName) { return prop ().arg (propertyName); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull IJSExpression value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull IJson value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull IHCNode value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull String value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, int value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, long value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull BigInteger value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, double value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull BigDecimal value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(int propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(long propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(double propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, boolean value) { return prop ().arg (propertyName).arg (value); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJSExpression propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(@Nonnull IJson propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(@Nonnull IHCNode propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(@Nonnull String propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(int propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(long propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigInteger propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(double propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE prop(@Nonnull BigDecimal propertyName, @Nonnull JSAnonymousFunction function) { return prop ().arg (propertyName).arg (function); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements) { return pushStack ().arg (elements); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements) { return pushStack ().arg (elements); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJSExpression name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJSExpression name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJson name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJson name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IHCNode name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IHCNode name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull String name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull String name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, int name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, int name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, long name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, long name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull BigInteger name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull BigInteger name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, double name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, double name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull BigDecimal name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull BigDecimal name, @Nonnull IJSExpression arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJSExpression name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJSExpression name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IJson name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IJson name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull IHCNode name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull IHCNode name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull String name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull String name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, int name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, int name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, long name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, long name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull BigInteger name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull BigInteger name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, double name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, double name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull IJSExpression elements, @Nonnull BigDecimal name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE pushStack(@Nonnull JSArray elements, @Nonnull BigDecimal name, @Nonnull JSArray arguments) { return pushStack ().arg (elements).arg (name).arg (arguments); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJSExpression queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJson queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(@Nonnull IHCNode queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(@Nonnull String queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(int queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(long queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigInteger queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(double queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigDecimal queueName) { return queue ().arg (queueName); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJSExpression queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJson queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull IHCNode queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull String queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(int queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(long queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigInteger queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(double queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigDecimal queueName, @Nonnull IJSExpression newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJSExpression queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJson queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull IHCNode queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull String queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(int queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(long queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigInteger queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(double queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigDecimal queueName, @Nonnull JSArray newQueue) { return queue ().arg (queueName).arg (newQueue); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJSExpression queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(@Nonnull IJson queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(@Nonnull IHCNode queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(@Nonnull String queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(int queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(long queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigInteger queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(double queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE queue(@Nonnull BigDecimal queueName, @Nonnull JSAnonymousFunction callback) { return queue ().arg (queueName).arg (callback); }

@Nonnull
public IMPLTYPE ready(@Nonnull IJSExpression handler) { return ready ().arg (handler); }

@Nonnull
public IMPLTYPE ready(@Nonnull JSAnonymousFunction handler) { return ready ().arg (handler); }

@Nonnull
public IMPLTYPE remove(@Nonnull IJSExpression selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(@Nonnull IJson selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(@Nonnull IHCNode selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(@Nonnull String selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(int selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(long selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(@Nonnull BigInteger selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(double selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE remove(@Nonnull BigDecimal selector) { return remove ().arg (selector); }

@Nonnull
public IMPLTYPE removeAttr(@Nonnull IJSExpression attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(@Nonnull IJson attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(@Nonnull IHCNode attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(@Nonnull String attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(int attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(long attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(@Nonnull BigInteger attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(double attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeAttr(@Nonnull BigDecimal attributeName) { return removeAttr ().arg (attributeName); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull IJSExpression className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull IJson className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull IHCNode className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull String className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(int className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(long className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull BigInteger className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(double className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull BigDecimal className) { return removeClass ().arg (className); }

@Nonnull
public IMPLTYPE removeClass(@Nonnull JSAnonymousFunction function) { return removeClass ().arg (function); }

@Nonnull
public IMPLTYPE removeData(@Nonnull IJSExpression name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(@Nonnull IJson name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(@Nonnull IHCNode name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(@Nonnull String name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(int name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(long name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(@Nonnull BigInteger name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(double name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(@Nonnull BigDecimal name) { return removeData ().arg (name); }

@Nonnull
public IMPLTYPE removeData(@Nonnull JSArray list) { return removeData ().arg (list); }

@Nonnull
public IMPLTYPE removeProp(@Nonnull IJSExpression propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(@Nonnull IJson propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(@Nonnull IHCNode propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(@Nonnull String propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(int propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(long propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(@Nonnull BigInteger propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(double propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE removeProp(@Nonnull BigDecimal propertyName) { return removeProp ().arg (propertyName); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull IJSExpression target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull IJQuerySelector target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull EHTMLElement target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull ICSSClassProvider target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull JQueryInvocation target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull JSArray target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceAll(@Nonnull String target) { return replaceAll ().arg (target); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull IJSExpression newContent) { return replaceWith ().arg (newContent); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull IHCNode newContent) { return replaceWith ().arg (newContent); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull String newContent) { return replaceWith ().arg (newContent); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull EHTMLElement newContent) { return replaceWith ().arg (newContent); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull JSArray newContent) { return replaceWith ().arg (newContent); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull JQueryInvocation newContent) { return replaceWith ().arg (newContent); }

@Nonnull
public IMPLTYPE replaceWith(@Nonnull JSAnonymousFunction function) { return replaceWith ().arg (function); }

@Nonnull
public IMPLTYPE resize(@Nonnull IJSExpression handler) { return resize ().arg (handler); }

@Nonnull
public IMPLTYPE resize(@Nonnull JSAnonymousFunction handler) { return resize ().arg (handler); }

@Nonnull
public IMPLTYPE resize(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return resize ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE resize(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return resize ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE scroll(@Nonnull IJSExpression handler) { return scroll ().arg (handler); }

@Nonnull
public IMPLTYPE scroll(@Nonnull JSAnonymousFunction handler) { return scroll ().arg (handler); }

@Nonnull
public IMPLTYPE scroll(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return scroll ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE scroll(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return scroll ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE scrollLeft(@Nonnull IJSExpression value) { return scrollLeft ().arg (value); }

@Nonnull
public IMPLTYPE scrollLeft(int value) { return scrollLeft ().arg (value); }

@Nonnull
public IMPLTYPE scrollLeft(long value) { return scrollLeft ().arg (value); }

@Nonnull
public IMPLTYPE scrollLeft(@Nonnull BigInteger value) { return scrollLeft ().arg (value); }

@Nonnull
public IMPLTYPE scrollLeft(double value) { return scrollLeft ().arg (value); }

@Nonnull
public IMPLTYPE scrollLeft(@Nonnull BigDecimal value) { return scrollLeft ().arg (value); }

@Nonnull
public IMPLTYPE scrollTop(@Nonnull IJSExpression value) { return scrollTop ().arg (value); }

@Nonnull
public IMPLTYPE scrollTop(int value) { return scrollTop ().arg (value); }

@Nonnull
public IMPLTYPE scrollTop(long value) { return scrollTop ().arg (value); }

@Nonnull
public IMPLTYPE scrollTop(@Nonnull BigInteger value) { return scrollTop ().arg (value); }

@Nonnull
public IMPLTYPE scrollTop(double value) { return scrollTop ().arg (value); }

@Nonnull
public IMPLTYPE scrollTop(@Nonnull BigDecimal value) { return scrollTop ().arg (value); }

@Nonnull
public IMPLTYPE select(@Nonnull IJSExpression handler) { return select ().arg (handler); }

@Nonnull
public IMPLTYPE select(@Nonnull JSAnonymousFunction handler) { return select ().arg (handler); }

@Nonnull
public IMPLTYPE select(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return select ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE select(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return select ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE show(@Nonnull IJSExpression duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(int duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(long duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(@Nonnull BigInteger duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(double duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(@Nonnull BigDecimal duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(@Nonnull IJson duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(@Nonnull IHCNode duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE show(@Nonnull String duration) { return show ().arg (duration); }

@Nonnull
public IMPLTYPE siblings(@Nonnull IJSExpression selector) { return siblings ().arg (selector); }

@Nonnull
public IMPLTYPE siblings(@Nonnull IJQuerySelector selector) { return siblings ().arg (selector); }

@Nonnull
public IMPLTYPE siblings(@Nonnull EHTMLElement selector) { return siblings ().arg (selector); }

@Nonnull
public IMPLTYPE siblings(@Nonnull ICSSClassProvider selector) { return siblings ().arg (selector); }

@Nonnull
public IMPLTYPE slice(@Nonnull IJSExpression start) { return slice ().arg (start); }

@Nonnull
public IMPLTYPE slice(int start) { return slice ().arg (start); }

@Nonnull
public IMPLTYPE slice(long start) { return slice ().arg (start); }

@Nonnull
public IMPLTYPE slice(@Nonnull BigInteger start) { return slice ().arg (start); }

@Nonnull
public IMPLTYPE slice(@Nonnull IJSExpression start, @Nonnull IJSExpression end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(int start, @Nonnull IJSExpression end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(long start, @Nonnull IJSExpression end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull BigInteger start, @Nonnull IJSExpression end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull IJSExpression start, int end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(int start, int end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(long start, int end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull BigInteger start, int end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull IJSExpression start, long end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(int start, long end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(long start, long end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull BigInteger start, long end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull IJSExpression start, @Nonnull BigInteger end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(int start, @Nonnull BigInteger end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(long start, @Nonnull BigInteger end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE slice(@Nonnull BigInteger start, @Nonnull BigInteger end) { return slice ().arg (start).arg (end); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression clearQueue) { return stop ().arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(boolean clearQueue) { return stop ().arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(boolean clearQueue, boolean jumpToEnd) { return stop ().arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(int queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(long queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(double queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue) { return stop ().arg (queue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(int queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(long queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(double queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue, @Nonnull IJSExpression clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(int queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(long queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(double queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue, boolean clearQueue) { return stop ().arg (queue).arg (clearQueue); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(int queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(long queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(double queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue, @Nonnull IJSExpression clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(int queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(long queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(double queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue, boolean clearQueue, @Nonnull IJSExpression jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(int queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(long queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(double queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue, @Nonnull IJSExpression clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJSExpression queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IJson queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull IHCNode queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull String queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(int queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(long queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigInteger queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(double queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE stop(@Nonnull BigDecimal queue, boolean clearQueue, boolean jumpToEnd) { return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd); }

@Nonnull
public IMPLTYPE submit(@Nonnull IJSExpression handler) { return submit ().arg (handler); }

@Nonnull
public IMPLTYPE submit(@Nonnull JSAnonymousFunction handler) { return submit ().arg (handler); }

@Nonnull
public IMPLTYPE submit(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return submit ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE submit(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return submit ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE text(@Nonnull IJSExpression textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(@Nonnull IJson textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(@Nonnull IHCNode textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(@Nonnull String textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(int textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(long textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(@Nonnull BigInteger textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(double textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(@Nonnull BigDecimal textString) { return text ().arg (textString); }

@Nonnull
public IMPLTYPE text(@Nonnull JSAnonymousFunction function) { return text ().arg (function); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull IJSExpression handler_eventObject_1) { return toggle ().arg (handler).arg (handler_eventObject_1); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull IJSExpression handler_eventObject_1) { return toggle ().arg (handler).arg (handler_eventObject_1); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull JSAnonymousFunction handler_eventObject_1) { return toggle ().arg (handler).arg (handler_eventObject_1); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1) { return toggle ().arg (handler).arg (handler_eventObject_1); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull IJSExpression handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull IJSExpression handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Deprecated
@Nonnull
public IMPLTYPE toggle(@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1, @Nonnull JSAnonymousFunction handler_eventObject_2) { return toggle ().arg (handler).arg (handler_eventObject_1).arg (handler_eventObject_2); }

@Nonnull
public IMPLTYPE toggle(@Nonnull IJSExpression duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(int duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(long duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(@Nonnull BigInteger duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(double duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(@Nonnull BigDecimal duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(@Nonnull IJson duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(@Nonnull IHCNode duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(@Nonnull String duration) { return toggle ().arg (duration); }

@Nonnull
public IMPLTYPE toggle(boolean showOrHide) { return toggle ().arg (showOrHide); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IJSExpression className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IJson className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IHCNode className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull String className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(int className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(long className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull BigInteger className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(double className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull BigDecimal className) { return toggleClass ().arg (className); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IJSExpression className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IJson className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IHCNode className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull String className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(int className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(long className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull BigInteger className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(double className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull BigDecimal className, @Nonnull IJSExpression _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IJSExpression className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IJson className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull IHCNode className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull String className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(int className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(long className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull BigInteger className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(double className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull BigDecimal className, boolean _switch) { return toggleClass ().arg (className).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(boolean _switch) { return toggleClass ().arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull JSAnonymousFunction function) { return toggleClass ().arg (function); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull JSAnonymousFunction function, @Nonnull IJSExpression _switch) { return toggleClass ().arg (function).arg (_switch); }

@Nonnull
public IMPLTYPE toggleClass(@Nonnull JSAnonymousFunction function, boolean _switch) { return toggleClass ().arg (function).arg (_switch); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IJSExpression eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IJson eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IHCNode eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(@Nonnull String eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(int eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(long eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(@Nonnull BigInteger eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(double eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(@Nonnull BigDecimal eventType) { return trigger ().arg (eventType); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IJSExpression eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IJson eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IHCNode eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull String eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(int eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(long eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull BigInteger eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(double eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull BigDecimal eventType, @Nonnull IJSExpression extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IJSExpression eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IJson eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull IHCNode eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull String eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(int eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(long eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull BigInteger eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(double eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE trigger(@Nonnull BigDecimal eventType, @Nonnull JSArray extraParameters) { return trigger ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IJSExpression eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IJson eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IHCNode eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull String eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(int eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(long eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull BigInteger eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(double eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull BigDecimal eventType) { return triggerHandler ().arg (eventType); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IJSExpression eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IJson eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IHCNode eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull String eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(int eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(long eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull BigInteger eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(double eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull BigDecimal eventType, @Nonnull IJSExpression extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IJSExpression eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IJson eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull IHCNode eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull String eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(int eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(long eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull BigInteger eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(double eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE triggerHandler(@Nonnull BigDecimal eventType, @Nonnull JSArray extraParameters) { return triggerHandler ().arg (eventType).arg (extraParameters); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJSExpression eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJson eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IHCNode eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(@Nonnull String eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(int eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(long eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigInteger eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(double eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigDecimal eventType) { return unbind ().arg (eventType); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJson eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull String eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(int eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(long eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(double eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(int eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(long eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(double eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return unbind ().arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJSExpression eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IJson eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(@Nonnull IHCNode eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(@Nonnull String eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(int eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(long eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigInteger eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(double eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE unbind(@Nonnull BigDecimal eventType, boolean _false) { return unbind ().arg (eventType).arg (_false); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull String eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, int eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, long eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, double eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType) { return undelegate ().arg (selector).arg (eventType); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull String eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, int eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, long eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, double eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType, @Nonnull IJSExpression handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IJSExpression eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IJson eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull IHCNode eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, int eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, long eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull BigInteger eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, double eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(int selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(long selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(double selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal selector, @Nonnull BigDecimal eventType, @Nonnull JSAnonymousFunction handler) { return undelegate ().arg (selector).arg (eventType).arg (handler); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJSExpression namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IJson namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull IHCNode namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull String namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(int namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(long namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigInteger namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(double namespace) { return undelegate ().arg (namespace); }

@Nonnull
public IMPLTYPE undelegate(@Nonnull BigDecimal namespace) { return undelegate ().arg (namespace); }

@Deprecated
@Nonnull
public IMPLTYPE unload(@Nonnull IJSExpression handler) { return unload ().arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE unload(@Nonnull JSAnonymousFunction handler) { return unload ().arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE unload(@Nonnull IJSExpression eventData, @Nonnull IJSExpression handler) { return unload ().arg (eventData).arg (handler); }

@Deprecated
@Nonnull
public IMPLTYPE unload(@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler) { return unload ().arg (eventData).arg (handler); }

@Nonnull
public IMPLTYPE val(@Nonnull IJSExpression value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull IJson value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull IHCNode value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull String value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(int value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(long value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull BigInteger value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(double value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull BigDecimal value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull JSArray value) { return val ().arg (value); }

@Nonnull
public IMPLTYPE val(@Nonnull JSAnonymousFunction function) { return val ().arg (function); }

@Nonnull
public IMPLTYPE width(@Nonnull IJSExpression value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(@Nonnull IJson value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(@Nonnull IHCNode value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(@Nonnull String value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(int value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(long value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(@Nonnull BigInteger value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(double value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(@Nonnull BigDecimal value) { return width ().arg (value); }

@Nonnull
public IMPLTYPE width(@Nonnull JSAnonymousFunction function) { return width ().arg (function); }

@Nonnull
public IMPLTYPE wrap(@Nonnull IJSExpression wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull IJQuerySelector wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull EHTMLElement wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull ICSSClassProvider wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull IHCNode wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull String wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull JQueryInvocation wrappingElement) { return wrap ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrap(@Nonnull JSAnonymousFunction function) { return wrap ().arg (function); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull IJSExpression wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull IJQuerySelector wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull EHTMLElement wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull ICSSClassProvider wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull IHCNode wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull String wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapAll(@Nonnull JQueryInvocation wrappingElement) { return wrapAll ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull IJSExpression wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull IJson wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull IHCNode wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull String wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(int wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(long wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull BigInteger wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(double wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull BigDecimal wrappingElement) { return wrapInner ().arg (wrappingElement); }

@Nonnull
public IMPLTYPE wrapInner(@Nonnull JSAnonymousFunction function) { return wrapInner ().arg (function); }

}
