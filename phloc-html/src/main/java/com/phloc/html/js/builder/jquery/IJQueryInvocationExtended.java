package com.phloc.html.js.builder.jquery;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Nonnull;

import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSArray;

public interface IJQueryInvocationExtended <IMPLTYPE extends IJQueryInvocationExtended <IMPLTYPE>> extends IJQueryInvocation <IMPLTYPE>
{
  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE add (@Nonnull IJQuerySelector selector);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE add (@Nonnull EHTMLElement... elements);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE add (@Nonnull Iterable <EHTMLElement> elements);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE add (@Nonnull String... elements);

  /**
   * @param html
   *        parameter value
   */
  @Nonnull
  IMPLTYPE add (@Nonnull IHCNode html);

  /**
   * @param html
   *        parameter value
   */
  @Nonnull
  IMPLTYPE add (@Nonnull String html);

  /**
   * @param jQuery_object
   *        parameter value
   * @since jQuery 1.3.2
   */
  @Nonnull
  IMPLTYPE add (@Nonnull JQueryInvocation jQuery_object);

  /**
   * @param selector
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE add (@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement context);

  /**
   * @param selector
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE add (@Nonnull IJQuerySelector selector, @Nonnull String context);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE addBack (@Nonnull IJQuerySelector selector);

  /**
   * @param className
   *        parameter value
   */
  @Nonnull
  IMPLTYPE addClass (@Nonnull String className);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE addClass (@Nonnull JSAnonymousFunction function);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull IHCNode content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull String content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull EHTMLElement content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSArray content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JQueryInvocation content);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull IHCNode content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull String content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSArray content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull IHCNode content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull String content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull EHTMLElement content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSArray content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JQueryInvocation content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull String content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSArray content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull IHCNode content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull String content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull EHTMLElement content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSArray content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull String content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE after (@Nonnull JSAnonymousFunction function);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ajaxComplete (@Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ajaxError (@Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ajaxSend (@Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ajaxStart (@Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ajaxStop (@Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ajaxSuccess (@Nonnull JSAnonymousFunction handler);

  /**
   * @param properties
   *        parameter value
   */
  @Nonnull
  IMPLTYPE animate (@Nonnull IJSExpression properties);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull IHCNode content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull String content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull EHTMLElement content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSArray content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JQueryInvocation content);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull IHCNode content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull String content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSArray content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull IHCNode content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull String content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull EHTMLElement content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSArray content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JQueryInvocation content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull String content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSArray content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull IHCNode content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull String content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull EHTMLElement content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSArray content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull String content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE append (@Nonnull JSAnonymousFunction function);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE appendTo (@Nonnull IJQuerySelector target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE appendTo (@Nonnull IHCNode target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE appendTo (@Nonnull String target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE appendTo (@Nonnull EHTMLElement target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE appendTo (@Nonnull JSArray target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE appendTo (@Nonnull JQueryInvocation target);

  /**
   * @param attributeName
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName);

  /**
   * @param attributeName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, @Nonnull String value);

  /**
   * @param attributeName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, int value);

  /**
   * @param attributeName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, long value);

  /**
   * @param attributeName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, @Nonnull BigInteger value);

  /**
   * @param attributeName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, double value);

  /**
   * @param attributeName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, @Nonnull BigDecimal value);

  /**
   * @param attributes
   *        parameter value
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull IJSExpression attributes);

  /**
   * @param attributeName
   *        parameter value
   * @param function
   *        parameter value
   * @since jQuery 1.1
   */
  @Nonnull
  IMPLTYPE attr (@Nonnull String attributeName, @Nonnull JSAnonymousFunction function);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull IHCNode content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull String content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull EHTMLElement content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSArray content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JQueryInvocation content);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull IHCNode content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull String content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSArray content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull IHCNode content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull String content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull EHTMLElement content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSArray content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JQueryInvocation content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull String content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSArray content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull IHCNode content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull String content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull EHTMLElement content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSArray content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull String content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE before (@Nonnull JSAnonymousFunction function);

  /**
   * @param eventType
   *        parameter value
   * @param eventData
   *        parameter value
   */
  @Nonnull
  IMPLTYPE bind (@Nonnull String eventType, @Nonnull IJSExpression eventData);

  /**
   * @param eventType
   *        parameter value
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE bind (@Nonnull String eventType, @Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param eventType
   *        parameter value
   * @param eventData
   *        parameter value
   * @param preventBubble
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE bind (@Nonnull String eventType, @Nonnull IJSExpression eventData, boolean preventBubble);

  /**
   * @param events
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE bind (@Nonnull IJSExpression events);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE blur (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE blur (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE blur (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param callbacks
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_add (@Nonnull JSAnonymousFunction callbacks);

  /**
   * @param callbacks
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_add (@Nonnull JSArray callbacks);

  /**
   * @param arguments
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_fire (@Nonnull IJSExpression arguments);

  /**
   * @param context
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_fireWith (@Nonnull IJSExpression context);

  /**
   * @param context
   *        parameter value
   * @param args
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_fireWith (@Nonnull IJSExpression context, @Nonnull IJSExpression args);

  /**
   * @param callback
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_has (@Nonnull JSAnonymousFunction callback);

  /**
   * @param callbacks
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_remove (@Nonnull JSAnonymousFunction callbacks);

  /**
   * @param callbacks
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE callbacks_remove (@Nonnull JSArray callbacks);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE change (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE change (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE change (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE children (@Nonnull IJQuerySelector selector);

  /**
   * @param queueName
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE clearQueue (@Nonnull String queueName);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE click (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE click (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE click (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param withDataAndEvents
   *        parameter value
   */
  @Nonnull
  IMPLTYPE _clone (boolean withDataAndEvents);

  /**
   * @param withDataAndEvents
   *        parameter value
   * @param deepWithDataAndEvents
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE _clone (boolean withDataAndEvents, boolean deepWithDataAndEvents);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE closest (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE closest (@Nonnull IJQuerySelector selector, @Nonnull EHTMLElement context);

  /**
   * @param selector
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE closest (@Nonnull IJQuerySelector selector, @Nonnull String context);

  /**
   * @param jQuery_object
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE closest (@Nonnull JQueryInvocation jQuery_object);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE closest (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE closest (@Nonnull String element);

  /**
   * @param selectors
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.4
   */
  @Deprecated
  @Nonnull
  IMPLTYPE closest (@Nonnull JSArray selectors);

  /**
   * @param selectors
   *        parameter value
   * @param context
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.4
   */
  @Deprecated
  @Nonnull
  IMPLTYPE closest (@Nonnull JSArray selectors, @Nonnull EHTMLElement context);

  /**
   * @param selectors
   *        parameter value
   * @param context
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.4
   */
  @Deprecated
  @Nonnull
  IMPLTYPE closest (@Nonnull JSArray selectors, @Nonnull String context);

  /**
   * @param propertyName
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName);

  /**
   * @param propertyNames
   *        parameter value
   * @since jQuery 1.9
   */
  @Nonnull
  IMPLTYPE css (@Nonnull JSArray propertyNames);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, @Nonnull String value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, int value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, long value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, @Nonnull BigInteger value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, double value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, @Nonnull BigDecimal value);

  /**
   * @param propertyName
   *        parameter value
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE css (@Nonnull String propertyName, @Nonnull JSAnonymousFunction function);

  /**
   * @param properties
   *        parameter value
   */
  @Nonnull
  IMPLTYPE css (@Nonnull IJSExpression properties);

  /**
   * @param key
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE data (@Nonnull String key, @Nonnull IJSExpression value);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE data (@Nonnull IJSExpression obj);

  /**
   * @param key
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE data (@Nonnull String key);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE dblclick (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE dblclick (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE dblclick (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param alwaysCallbacks
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE deferred_always (@Nonnull JSAnonymousFunction alwaysCallbacks);

  /**
   * @param alwaysCallbacks
   *        parameter value
   * @param alwaysCallbacks1
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE deferred_always (@Nonnull JSAnonymousFunction alwaysCallbacks, @Nonnull JSAnonymousFunction alwaysCallbacks1);

  /**
   * @param doneCallbacks
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_done (@Nonnull JSAnonymousFunction doneCallbacks);

  /**
   * @param doneCallbacks
   *        parameter value
   * @param doneCallbacks1
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_done (@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull JSAnonymousFunction doneCallbacks1);

  /**
   * @param failCallbacks
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_fail (@Nonnull JSAnonymousFunction failCallbacks);

  /**
   * @param failCallbacks
   *        parameter value
   * @param failCallbacks1
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_fail (@Nonnull JSAnonymousFunction failCallbacks, @Nonnull JSAnonymousFunction failCallbacks1);

  /**
   * @param args
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE deferred_notify (@Nonnull IJSExpression args);

  /**
   * @param context
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE deferred_notifyWith (@Nonnull IJSExpression context);

  /**
   * @param context
   *        parameter value
   * @param args
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE deferred_notifyWith (@Nonnull IJSExpression context, @Nonnull IJSExpression args);

  /**
   * @param doneFilter
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.6
   */
  @Deprecated
  @Nonnull
  IMPLTYPE deferred_pipe (@Nonnull JSAnonymousFunction doneFilter);

  /**
   * @param doneFilter
   *        parameter value
   * @param failFilter
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.6
   */
  @Deprecated
  @Nonnull
  IMPLTYPE deferred_pipe (@Nonnull JSAnonymousFunction doneFilter, @Nonnull JSAnonymousFunction failFilter);

  /**
   * @param doneFilter
   *        parameter value
   * @param failFilter
   *        parameter value
   * @param progressFilter
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.7
   */
  @Deprecated
  @Nonnull
  IMPLTYPE deferred_pipe (@Nonnull JSAnonymousFunction doneFilter,
                          @Nonnull JSAnonymousFunction failFilter,
                          @Nonnull JSAnonymousFunction progressFilter);

  /**
   * @param progressCallbacks
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE deferred_progress (@Nonnull JSAnonymousFunction progressCallbacks);

  /**
   * @param progressCallbacks
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE deferred_progress (@Nonnull JSArray progressCallbacks);

  /**
   * @param target
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_promise (@Nonnull IJSExpression target);

  /**
   * @param args
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_reject (@Nonnull IJSExpression args);

  /**
   * @param context
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_rejectWith (@Nonnull IJSExpression context);

  /**
   * @param context
   *        parameter value
   * @param args
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_rejectWith (@Nonnull IJSExpression context, @Nonnull JSArray args);

  /**
   * @param args
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_resolve (@Nonnull IJSExpression args);

  /**
   * @param context
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_resolveWith (@Nonnull IJSExpression context);

  /**
   * @param context
   *        parameter value
   * @param args
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_resolveWith (@Nonnull IJSExpression context, @Nonnull JSArray args);

  /**
   * @param doneFilter
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE deferred_then (@Nonnull JSAnonymousFunction doneFilter);

  /**
   * @param doneFilter
   *        parameter value
   * @param failFilter
   *        parameter value
   * @param progressFilter
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE deferred_then (@Nonnull JSAnonymousFunction doneFilter,
                          @Nonnull JSAnonymousFunction failFilter,
                          @Nonnull JSAnonymousFunction progressFilter);

  /**
   * @param doneCallbacks
   *        parameter value
   * @param failCallbacks
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE deferred_then (@Nonnull JSAnonymousFunction doneCallbacks, @Nonnull JSAnonymousFunction failCallbacks);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE delay (int duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE delay (long duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE delay (@Nonnull BigInteger duration);

  /**
   * @param duration
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE delay (int duration, @Nonnull String queueName);

  /**
   * @param duration
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE delay (long duration, @Nonnull String queueName);

  /**
   * @param duration
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE delay (@Nonnull BigInteger duration, @Nonnull String queueName);

  /**
   * @param selector
   *        parameter value
   * @param eventType
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.2
   */
  @Nonnull
  IMPLTYPE delegate (@Nonnull String selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

  /**
   * @param selector
   *        parameter value
   * @param eventType
   *        parameter value
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.2
   */
  @Nonnull
  IMPLTYPE delegate (@Nonnull String selector,
                     @Nonnull String eventType,
                     @Nonnull IJSExpression eventData,
                     @Nonnull JSAnonymousFunction handler);

  /**
   * @param selector
   *        parameter value
   * @param events
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE delegate (@Nonnull String selector, @Nonnull IJSExpression events);

  /**
   * @param queueName
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE dequeue (@Nonnull String queueName);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE detach (@Nonnull IJQuerySelector selector);

  /**
   * @param eventType
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE die (@Nonnull String eventType);

  /**
   * @param eventType
   *        parameter value
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE die (@Nonnull String eventType, @Nonnull String handler);

  /**
   * @param events
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE die (@Nonnull IJSExpression events);

  /**
   * @param function
   *        parameter value
   */
  @Nonnull
  IMPLTYPE each (@Nonnull JSAnonymousFunction function);

  /**
   * @param index
   *        parameter value
   * @since jQuery 1.1.2
   */
  @Nonnull
  IMPLTYPE _eq (int index);

  /**
   * @param index
   *        parameter value
   * @since jQuery 1.1.2
   */
  @Nonnull
  IMPLTYPE _eq (long index);

  /**
   * @param index
   *        parameter value
   * @since jQuery 1.1.2
   */
  @Nonnull
  IMPLTYPE _eq (@Nonnull BigInteger index);

  /**
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   */
  @Deprecated
  @Nonnull
  IMPLTYPE error (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE error (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE error (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, int opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, int opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, int opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, int opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, int opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, int opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, long opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, long opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, long opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, long opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, long opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, long opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, @Nonnull BigInteger opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, @Nonnull BigInteger opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, @Nonnull BigInteger opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, @Nonnull BigInteger opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, @Nonnull BigInteger opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, @Nonnull BigInteger opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, double opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, double opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, double opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, double opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, double opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, double opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, @Nonnull BigDecimal opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, @Nonnull BigDecimal opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, @Nonnull BigDecimal opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, @Nonnull BigDecimal opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, @Nonnull BigDecimal opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, int opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, int opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, int opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, int opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, int opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, int opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, long opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, long opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, long opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, long opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, long opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, long opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, double opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, double opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, double opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, double opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, double opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, double opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, int opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, int opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, int opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, int opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, int opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, int opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, long opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, long opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, long opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, long opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, long opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, long opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, @Nonnull BigInteger opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, @Nonnull BigInteger opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, @Nonnull BigInteger opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, @Nonnull BigInteger opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, @Nonnull BigInteger opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, @Nonnull BigInteger opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, double opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, double opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, double opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, double opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, double opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, double opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration, @Nonnull BigDecimal opacity, @Nonnull String easing);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration,
                   int opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, int opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration,
                   int opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration,
                   long opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, long opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration,
                   long opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration,
                   @Nonnull BigInteger opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration,
                   @Nonnull BigInteger opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration,
                   @Nonnull BigInteger opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration,
                   @Nonnull BigInteger opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration,
                   @Nonnull BigInteger opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration,
                   @Nonnull BigInteger opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration,
                   double opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration,
                   double opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration, double opacity, @Nonnull String easing, @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration,
                   double opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull String duration,
                   @Nonnull BigDecimal opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (int duration,
                   @Nonnull BigDecimal opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (long duration,
                   @Nonnull BigDecimal opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigInteger duration,
                   @Nonnull BigDecimal opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (double duration,
                   @Nonnull BigDecimal opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param duration
   *        parameter value
   * @param opacity
   *        parameter value
   * @param easing
   *        parameter value
   * @param complete
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE fadeTo (@Nonnull BigDecimal duration,
                   @Nonnull BigDecimal opacity,
                   @Nonnull String easing,
                   @Nonnull JSAnonymousFunction complete);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE filter (@Nonnull IJQuerySelector selector);

  /**
   * @param function
   *        parameter value
   */
  @Nonnull
  IMPLTYPE filter (@Nonnull JSAnonymousFunction function);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE filter (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE filter (@Nonnull String element);

  /**
   * @param jQuery_object
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE filter (@Nonnull IJSExpression jQuery_object);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE find (@Nonnull IJQuerySelector selector);

  /**
   * @param jQuery_object
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE find (@Nonnull IJSExpression jQuery_object);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE find (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE find (@Nonnull String element);

  /**
   * @param queue
   *        parameter value
   * @since jQuery 1.9
   */
  @Nonnull
  IMPLTYPE finish (@Nonnull String queue);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE focus (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE focus (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE focus (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE focusin (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE focusin (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE focusin (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE focusout (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE focusout (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE focusout (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param index
   *        parameter value
   */
  @Nonnull
  IMPLTYPE get (int index);

  /**
   * @param index
   *        parameter value
   */
  @Nonnull
  IMPLTYPE get (long index);

  /**
   * @param index
   *        parameter value
   */
  @Nonnull
  IMPLTYPE get (@Nonnull BigInteger index);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE has (@Nonnull String selector);

  /**
   * @param contained
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE has (@Nonnull EHTMLElement contained);

  /**
   * @param className
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE hasClass (@Nonnull String className);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE height (@Nonnull String value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE height (int value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE height (long value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE height (@Nonnull BigInteger value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE height (double value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE height (@Nonnull BigDecimal value);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4.1
   */
  @Nonnull
  IMPLTYPE height (@Nonnull JSAnonymousFunction function);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE hide (int duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE hide (long duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE hide (@Nonnull BigInteger duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE hide (double duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE hide (@Nonnull BigDecimal duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE hide (@Nonnull String duration);

  /**
   * @param handlerIn
   *        parameter value
   * @param handlerOut
   *        parameter value
   */
  @Nonnull
  IMPLTYPE hover (@Nonnull JSAnonymousFunction handlerIn, @Nonnull JSAnonymousFunction handlerOut);

  /**
   * @param handlerInOut
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE hover (@Nonnull JSAnonymousFunction handlerInOut);

  /**
   * @param htmlString
   *        parameter value
   */
  @Nonnull
  IMPLTYPE html (@Nonnull IHCNode htmlString);

  /**
   * @param htmlString
   *        parameter value
   */
  @Nonnull
  IMPLTYPE html (@Nonnull String htmlString);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE html (@Nonnull JSAnonymousFunction function);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE index (@Nonnull IJQuerySelector selector);

  /**
   * @param element
   *        parameter value
   */
  @Nonnull
  IMPLTYPE index (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   */
  @Nonnull
  IMPLTYPE index (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   */
  @Nonnull
  IMPLTYPE index (@Nonnull JQueryInvocation element);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertAfter (@Nonnull IJQuerySelector target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertAfter (@Nonnull IHCNode target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertAfter (@Nonnull String target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertAfter (@Nonnull EHTMLElement target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertAfter (@Nonnull JSArray target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertAfter (@Nonnull JQueryInvocation target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertBefore (@Nonnull IJQuerySelector target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertBefore (@Nonnull IHCNode target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertBefore (@Nonnull String target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertBefore (@Nonnull EHTMLElement target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertBefore (@Nonnull JSArray target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE insertBefore (@Nonnull JQueryInvocation target);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE is (@Nonnull IJQuerySelector selector);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE is (@Nonnull JSAnonymousFunction function);

  /**
   * @param jQuery_object
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE is (@Nonnull IJSExpression jQuery_object);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE is (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE is (@Nonnull String element);

  /**
   * @param flags
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE jQuery_Callbacks (@Nonnull String flags);

  /**
   * @param beforeStart
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_Deferred (@Nonnull JSAnonymousFunction beforeStart);

  /**
   * @param url
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_ajax (@Nonnull String url);

  /**
   * @param url
   *        parameter value
   * @param settings
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_ajax (@Nonnull String url, @Nonnull IJSExpression settings);

  /**
   * @param settings
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_ajax (@Nonnull IJSExpression settings);

  /**
   * @param dataTypes
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_ajaxPrefilter (@Nonnull String dataTypes);

  /**
   * @param dataTypes
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_ajaxPrefilter (@Nonnull String dataTypes, @Nonnull JSAnonymousFunction handler);

  /**
   * @param options
   *        parameter value
   * @since jQuery 1.1
   */
  @Nonnull
  IMPLTYPE jQuery_ajaxSetup (@Nonnull IJSExpression options);

  /**
   * @param dataType
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_ajaxTransport (@Nonnull String dataType, @Nonnull JSAnonymousFunction handler);

  /**
   * @param container
   *        parameter value
   * @param contained
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_contains (@Nonnull EHTMLElement container, @Nonnull EHTMLElement contained);

  /**
   * @param container
   *        parameter value
   * @param contained
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_contains (@Nonnull String container, @Nonnull EHTMLElement contained);

  /**
   * @param container
   *        parameter value
   * @param contained
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_contains (@Nonnull EHTMLElement container, @Nonnull String contained);

  /**
   * @param container
   *        parameter value
   * @param contained
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_contains (@Nonnull String container, @Nonnull String contained);

  /**
   * @param element
   *        parameter value
   * @param key
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_data (@Nonnull EHTMLElement element, @Nonnull String key, @Nonnull IJSExpression value);

  /**
   * @param element
   *        parameter value
   * @param key
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_data (@Nonnull String element, @Nonnull String key, @Nonnull IJSExpression value);

  /**
   * @param element
   *        parameter value
   * @param key
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_data (@Nonnull EHTMLElement element, @Nonnull String key);

  /**
   * @param element
   *        parameter value
   * @param key
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_data (@Nonnull String element, @Nonnull String key);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_data (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_data (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_dequeue (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_dequeue (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_dequeue (@Nonnull EHTMLElement element, @Nonnull String queueName);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_dequeue (@Nonnull String element, @Nonnull String queueName);

  /**
   * @param collection
   *        parameter value
   * @param callback
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_each (@Nonnull IJSExpression collection, @Nonnull JSAnonymousFunction callback);

  /**
   * @param message
   *        parameter value
   * @since jQuery 1.4.1
   */
  @Nonnull
  IMPLTYPE jQuery_error (@Nonnull String message);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_extend (@Nonnull IJSExpression target);

  /**
   * @param target
   *        parameter value
   * @param object1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_extend (@Nonnull IJSExpression target, @Nonnull IJSExpression object1);

  /**
   * @param target
   *        parameter value
   * @param object1
   *        parameter value
   * @param objectN
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_extend (@Nonnull IJSExpression target, @Nonnull IJSExpression object1, @Nonnull IJSExpression objectN);

  /**
   * @param deep
   *        parameter value
   * @param target
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE jQuery_extend (boolean deep, @Nonnull IJSExpression target);

  /**
   * @param deep
   *        parameter value
   * @param target
   *        parameter value
   * @param object1
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE jQuery_extend (boolean deep, @Nonnull IJSExpression target, @Nonnull IJSExpression object1);

  /**
   * @param deep
   *        parameter value
   * @param target
   *        parameter value
   * @param object1
   *        parameter value
   * @param objectN
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE jQuery_extend (boolean deep,
                          @Nonnull IJSExpression target,
                          @Nonnull IJSExpression object1,
                          @Nonnull IJSExpression objectN);

  /**
   * @param object
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_fn_extend (@Nonnull IJSExpression object);

  /**
   * @param url
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url, @Nonnull IJSExpression data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url, @Nonnull String data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction success);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url, @Nonnull String data, @Nonnull JSAnonymousFunction success);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   * @param dataType
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url,
                       @Nonnull IJSExpression data,
                       @Nonnull JSAnonymousFunction success,
                       @Nonnull String dataType);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   * @param dataType
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_get (@Nonnull String url,
                       @Nonnull String data,
                       @Nonnull JSAnonymousFunction success,
                       @Nonnull String dataType);

  /**
   * @param url
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_getJSON (@Nonnull String url);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_getJSON (@Nonnull String url, @Nonnull IJSExpression data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_getJSON (@Nonnull String url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction success);

  /**
   * @param url
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_getScript (@Nonnull String url);

  /**
   * @param url
   *        parameter value
   * @param success
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_getScript (@Nonnull String url, @Nonnull JSAnonymousFunction success);

  /**
   * @param code
   *        parameter value
   * @since jQuery 1.0.4
   */
  @Nonnull
  IMPLTYPE jQuery_globalEval (@Nonnull String code);

  /**
   * @param array
   *        parameter value
   * @param function
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_grep (@Nonnull JSArray array, @Nonnull JSAnonymousFunction function);

  /**
   * @param array
   *        parameter value
   * @param function
   *        parameter value
   * @param invert
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_grep (@Nonnull JSArray array, @Nonnull JSAnonymousFunction function, boolean invert);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_hasData (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_hasData (@Nonnull String element);

  /**
   * @param hold
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE jQuery_holdReady (boolean hold);

  /**
   * @param value
   *        parameter value
   * @param array
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_inArray (@Nonnull IJSExpression value, @Nonnull JSArray array);

  /**
   * @param value
   *        parameter value
   * @param array
   *        parameter value
   * @param fromIndex
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_inArray (@Nonnull IJSExpression value, @Nonnull JSArray array, int fromIndex);

  /**
   * @param value
   *        parameter value
   * @param array
   *        parameter value
   * @param fromIndex
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_inArray (@Nonnull IJSExpression value, @Nonnull JSArray array, long fromIndex);

  /**
   * @param value
   *        parameter value
   * @param array
   *        parameter value
   * @param fromIndex
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_inArray (@Nonnull IJSExpression value, @Nonnull JSArray array, @Nonnull BigInteger fromIndex);

  /**
   * @param value
   *        parameter value
   * @param array
   *        parameter value
   * @param fromIndex
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_inArray (@Nonnull IJSExpression value, @Nonnull JSArray array, double fromIndex);

  /**
   * @param value
   *        parameter value
   * @param array
   *        parameter value
   * @param fromIndex
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_inArray (@Nonnull IJSExpression value, @Nonnull JSArray array, @Nonnull BigDecimal fromIndex);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_isArray (@Nonnull IJSExpression obj);

  /**
   * @param object
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_isEmptyObject (@Nonnull IJSExpression object);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_isFunction (@Nonnull IJSExpression obj);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE jQuery_isNumeric (@Nonnull IJSExpression value);

  /**
   * @param object
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_isPlainObject (@Nonnull IJSExpression object);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE jQuery_isWindow (@Nonnull IJSExpression obj);

  /**
   * @param node
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE jQuery_isXMLDoc (@Nonnull EHTMLElement node);

  /**
   * @param node
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE jQuery_isXMLDoc (@Nonnull String node);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_makeArray (@Nonnull IJSExpression obj);

  /**
   * @param array
   *        parameter value
   * @param callback
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_map (@Nonnull JSArray array, @Nonnull JSAnonymousFunction callback);

  /**
   * @param arrayOrObject
   *        parameter value
   * @param callback
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE jQuery_map (@Nonnull IJSExpression arrayOrObject, @Nonnull JSAnonymousFunction callback);

  /**
   * @param first
   *        parameter value
   * @param second
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_merge (@Nonnull JSArray first, @Nonnull JSArray second);

  /**
   * @param removeAll
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_noConflict (boolean removeAll);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_param (@Nonnull JSArray obj);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE jQuery_param (@Nonnull IJSExpression obj);

  /**
   * @param obj
   *        parameter value
   * @param traditional
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_param (@Nonnull JSArray obj, boolean traditional);

  /**
   * @param obj
   *        parameter value
   * @param traditional
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_param (@Nonnull IJSExpression obj, boolean traditional);

  /**
   * @param data
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE jQuery_parseHTML (@Nonnull String data);

  /**
   * @param data
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE jQuery_parseHTML (@Nonnull String data, @Nonnull EHTMLElement context);

  /**
   * @param data
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE jQuery_parseHTML (@Nonnull String data, @Nonnull String context);

  /**
   * @param data
   *        parameter value
   * @param context
   *        parameter value
   * @param keepScripts
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE jQuery_parseHTML (@Nonnull String data, @Nonnull EHTMLElement context, boolean keepScripts);

  /**
   * @param data
   *        parameter value
   * @param context
   *        parameter value
   * @param keepScripts
   *        parameter value
   * @since jQuery 1.8
   */
  @Nonnull
  IMPLTYPE jQuery_parseHTML (@Nonnull String data, @Nonnull String context, boolean keepScripts);

  /**
   * @param json
   *        parameter value
   * @since jQuery 1.4.1
   */
  @Nonnull
  IMPLTYPE jQuery_parseJSON (@Nonnull String json);

  /**
   * @param data
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_parseXML (@Nonnull String data);

  /**
   * @param url
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url, @Nonnull IJSExpression data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url, @Nonnull String data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction success);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url, @Nonnull String data, @Nonnull JSAnonymousFunction success);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   * @param dataType
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url,
                        @Nonnull IJSExpression data,
                        @Nonnull JSAnonymousFunction success,
                        @Nonnull String dataType);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param success
   *        parameter value
   * @param dataType
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_post (@Nonnull String url,
                        @Nonnull String data,
                        @Nonnull JSAnonymousFunction success,
                        @Nonnull String dataType);

  /**
   * @param function
   *        parameter value
   * @param context
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_proxy (@Nonnull JSAnonymousFunction function, @Nonnull IJSExpression context);

  /**
   * @param context
   *        parameter value
   * @param name
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE jQuery_proxy (@Nonnull IJSExpression context, @Nonnull String name);

  /**
   * @param function
   *        parameter value
   * @param context
   *        parameter value
   * @param additionalArguments
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE jQuery_proxy (@Nonnull JSAnonymousFunction function,
                         @Nonnull IJSExpression context,
                         @Nonnull IJSExpression additionalArguments);

  /**
   * @param context
   *        parameter value
   * @param name
   *        parameter value
   * @param additionalArguments
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE jQuery_proxy (@Nonnull IJSExpression context,
                         @Nonnull String name,
                         @Nonnull IJSExpression additionalArguments);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull EHTMLElement element, @Nonnull String queueName);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull String element, @Nonnull String queueName);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @param newQueue
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull EHTMLElement element, @Nonnull String queueName, @Nonnull JSArray newQueue);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @param newQueue
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull String element, @Nonnull String queueName, @Nonnull JSArray newQueue);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @param callback
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull EHTMLElement element, @Nonnull String queueName, @Nonnull JSAnonymousFunction callback);

  /**
   * @param element
   *        parameter value
   * @param queueName
   *        parameter value
   * @param callback
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE jQuery_queue (@Nonnull String element, @Nonnull String queueName, @Nonnull JSAnonymousFunction callback);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_removeData (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_removeData (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @param name
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_removeData (@Nonnull EHTMLElement element, @Nonnull String name);

  /**
   * @param element
   *        parameter value
   * @param name
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE jQuery_removeData (@Nonnull String element, @Nonnull String name);

  /**
   * @param str
   *        parameter value
   */
  @Nonnull
  IMPLTYPE jQuery_trim (@Nonnull String str);

  /**
   * @param obj
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE jQuery_type (@Nonnull IJSExpression obj);

  /**
   * @param array
   *        parameter value
   * @since jQuery 1.1.3
   */
  @Nonnull
  IMPLTYPE jQuery_unique (@Nonnull JSArray array);

  /**
   * @param deferreds
   *        parameter value
   * @since jQuery 1.5
   */
  @Nonnull
  IMPLTYPE jQuery_when (@Nonnull IJSExpression deferreds);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE keydown (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE keydown (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE keydown (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE keypress (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE keypress (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE keypress (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE keyup (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE keyup (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE keyup (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE live (@Nonnull String events, @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @param data
   *        parameter value
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.4
   */
  @Deprecated
  @Nonnull
  IMPLTYPE live (@Nonnull String events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @deprecated Deprecated since jQuery 1.7
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE live (@Nonnull IJSExpression events);

  /**
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   */
  @Deprecated
  @Nonnull
  IMPLTYPE load (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE load (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE load (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param url
   *        parameter value
   */
  @Nonnull
  IMPLTYPE load (@Nonnull String url);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE load (@Nonnull String url, @Nonnull IJSExpression data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   */
  @Nonnull
  IMPLTYPE load (@Nonnull String url, @Nonnull String data);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE load (@Nonnull String url, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction complete);

  /**
   * @param url
   *        parameter value
   * @param data
   *        parameter value
   * @param complete
   *        parameter value
   */
  @Nonnull
  IMPLTYPE load (@Nonnull String url, @Nonnull String data, @Nonnull JSAnonymousFunction complete);

  /**
   * @param callback
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE map (@Nonnull JSAnonymousFunction callback);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mousedown (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mousedown (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mousedown (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mouseenter (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseenter (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseenter (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mouseleave (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseleave (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseleave (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mousemove (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mousemove (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mousemove (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mouseout (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseout (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseout (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mouseover (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseover (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseover (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE mouseup (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseup (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE mouseup (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE next (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE nextAll (@Nonnull String selector);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE nextUntil (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE nextUntil (@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE nextUntil (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE nextUntil (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE nextUntil (@Nonnull EHTMLElement element, @Nonnull IJQuerySelector filter);

  /**
   * @param element
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE nextUntil (@Nonnull String element, @Nonnull IJQuerySelector filter);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE _not (@Nonnull IJQuerySelector selector);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE _not (@Nonnull EHTMLElement... elements);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE _not (@Nonnull Iterable <EHTMLElement> elements);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE _not (@Nonnull String... elements);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE _not (@Nonnull JSAnonymousFunction function);

  /**
   * @param jQuery_object
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE _not (@Nonnull IJSExpression jQuery_object);

  /**
   * @param events
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE off (@Nonnull String events);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE off (@Nonnull String events, @Nonnull String selector);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE off (@Nonnull String events, @Nonnull String selector, @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE off (@Nonnull IJSExpression events);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE off (@Nonnull IJSExpression events, @Nonnull String selector);

  /**
   * @param coordinates
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE offset (@Nonnull IJSExpression coordinates);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE offset (@Nonnull JSAnonymousFunction function);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE on (@Nonnull String events, @Nonnull String selector);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param data
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE on (@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param data
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE on (@Nonnull String events,
               @Nonnull String selector,
               @Nonnull IJSExpression data,
               @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE on (@Nonnull IJSExpression events);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE on (@Nonnull IJSExpression events, @Nonnull String selector);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param data
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE on (@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data);

  /**
   * @param events
   *        parameter value
   * @param data
   *        parameter value
   * @since jQuery 1.1
   */
  @Nonnull
  IMPLTYPE one (@Nonnull String events, @Nonnull IJSExpression data);

  /**
   * @param events
   *        parameter value
   * @param data
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.1
   */
  @Nonnull
  IMPLTYPE one (@Nonnull String events, @Nonnull IJSExpression data, @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE one (@Nonnull String events, @Nonnull String selector);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param data
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE one (@Nonnull String events, @Nonnull String selector, @Nonnull IJSExpression data);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param data
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE one (@Nonnull String events,
                @Nonnull String selector,
                @Nonnull IJSExpression data,
                @Nonnull JSAnonymousFunction handler);

  /**
   * @param events
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE one (@Nonnull IJSExpression events);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE one (@Nonnull IJSExpression events, @Nonnull String selector);

  /**
   * @param events
   *        parameter value
   * @param selector
   *        parameter value
   * @param data
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE one (@Nonnull IJSExpression events, @Nonnull String selector, @Nonnull IJSExpression data);

  /**
   * @param includeMargin
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE outerHeight (boolean includeMargin);

  /**
   * @param includeMargin
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE outerWidth (boolean includeMargin);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE parent (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE parents (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE parentsUntil (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE parentsUntil (@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE parentsUntil (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE parentsUntil (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE parentsUntil (@Nonnull EHTMLElement element, @Nonnull IJQuerySelector filter);

  /**
   * @param element
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE parentsUntil (@Nonnull String element, @Nonnull IJQuerySelector filter);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull IHCNode content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull String content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull EHTMLElement content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSArray content);

  /**
   * @param content
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JQueryInvocation content);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull IHCNode content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull String content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull EHTMLElement content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSArray content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JQueryInvocation content, @Nonnull IHCNode content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull IHCNode content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull String content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull EHTMLElement content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSArray content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JQueryInvocation content, @Nonnull String content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull IHCNode content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull String content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull EHTMLElement content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSArray content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JQueryInvocation content, @Nonnull EHTMLElement content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull IHCNode content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull String content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull EHTMLElement content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSArray content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JQueryInvocation content, @Nonnull JSArray content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull IHCNode content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull String content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull EHTMLElement content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSArray content, @Nonnull JQueryInvocation content1);

  /**
   * @param content
   *        parameter value
   * @param content1
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JQueryInvocation content, @Nonnull JQueryInvocation content1);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE prepend (@Nonnull JSAnonymousFunction function);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prependTo (@Nonnull IJQuerySelector target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prependTo (@Nonnull IHCNode target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prependTo (@Nonnull String target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prependTo (@Nonnull EHTMLElement target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prependTo (@Nonnull JSArray target);

  /**
   * @param target
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prependTo (@Nonnull JQueryInvocation target);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE prev (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE prevAll (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE prevUntil (@Nonnull IJQuerySelector selector);

  /**
   * @param selector
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE prevUntil (@Nonnull IJQuerySelector selector, @Nonnull IJQuerySelector filter);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prevUntil (@Nonnull EHTMLElement element);

  /**
   * @param element
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prevUntil (@Nonnull String element);

  /**
   * @param element
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prevUntil (@Nonnull EHTMLElement element, @Nonnull IJQuerySelector filter);

  /**
   * @param element
   *        parameter value
   * @param filter
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prevUntil (@Nonnull String element, @Nonnull IJQuerySelector filter);

  /**
   * @param type
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE promise (@Nonnull String type);

  /**
   * @param type
   *        parameter value
   * @param target
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE promise (@Nonnull String type, @Nonnull IJSExpression target);

  /**
   * @param propertyName
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, @Nonnull String value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, int value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, long value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, @Nonnull BigInteger value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, double value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, @Nonnull BigDecimal value);

  /**
   * @param propertyName
   *        parameter value
   * @param value
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, boolean value);

  /**
   * @param properties
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull IJSExpression properties);

  /**
   * @param propertyName
   *        parameter value
   * @param function
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE prop (@Nonnull String propertyName, @Nonnull JSAnonymousFunction function);

  /**
   * @param elements
   *        parameter value
   */
  @Nonnull
  IMPLTYPE pushStack (@Nonnull JSArray elements);

  /**
   * @param elements
   *        parameter value
   * @param name
   *        parameter value
   * @param arguments
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE pushStack (@Nonnull JSArray elements, @Nonnull String name, @Nonnull JSArray arguments);

  /**
   * @param queueName
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE queue (@Nonnull String queueName);

  /**
   * @param queueName
   *        parameter value
   * @param newQueue
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE queue (@Nonnull String queueName, @Nonnull JSArray newQueue);

  /**
   * @param queueName
   *        parameter value
   * @param callback
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE queue (@Nonnull String queueName, @Nonnull JSAnonymousFunction callback);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE ready (@Nonnull JSAnonymousFunction handler);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE remove (@Nonnull String selector);

  /**
   * @param attributeName
   *        parameter value
   */
  @Nonnull
  IMPLTYPE removeAttr (@Nonnull String attributeName);

  /**
   * @param className
   *        parameter value
   */
  @Nonnull
  IMPLTYPE removeClass (@Nonnull String className);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE removeClass (@Nonnull JSAnonymousFunction function);

  /**
   * @param name
   *        parameter value
   * @since jQuery 1.2.3
   */
  @Nonnull
  IMPLTYPE removeData (@Nonnull String name);

  /**
   * @param list
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE removeData (@Nonnull JSArray list);

  /**
   * @param propertyName
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE removeProp (@Nonnull String propertyName);

  /**
   * @param target
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceAll (@Nonnull IJQuerySelector target);

  /**
   * @param target
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceAll (@Nonnull JQueryInvocation target);

  /**
   * @param target
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceAll (@Nonnull JSArray target);

  /**
   * @param target
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceAll (@Nonnull EHTMLElement target);

  /**
   * @param target
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceAll (@Nonnull String target);

  /**
   * @param newContent
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceWith (@Nonnull IHCNode newContent);

  /**
   * @param newContent
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceWith (@Nonnull String newContent);

  /**
   * @param newContent
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceWith (@Nonnull EHTMLElement newContent);

  /**
   * @param newContent
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceWith (@Nonnull JSArray newContent);

  /**
   * @param newContent
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE replaceWith (@Nonnull JQueryInvocation newContent);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE replaceWith (@Nonnull JSAnonymousFunction function);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE resize (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE resize (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE resize (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE scroll (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE scroll (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE scroll (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollLeft (int value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollLeft (long value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollLeft (@Nonnull BigInteger value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollLeft (double value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollLeft (@Nonnull BigDecimal value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollTop (int value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollTop (long value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollTop (@Nonnull BigInteger value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollTop (double value);

  /**
   * @param value
   *        parameter value
   * @since jQuery 1.2.6
   */
  @Nonnull
  IMPLTYPE scrollTop (@Nonnull BigDecimal value);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE select (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE select (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE select (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE show (int duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE show (long duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE show (@Nonnull BigInteger duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE show (double duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE show (@Nonnull BigDecimal duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE show (@Nonnull String duration);

  /**
   * @param selector
   *        parameter value
   */
  @Nonnull
  IMPLTYPE siblings (@Nonnull IJQuerySelector selector);

  /**
   * @param start
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (int start);

  /**
   * @param start
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (long start);

  /**
   * @param start
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (@Nonnull BigInteger start);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (int start, int end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (long start, int end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (@Nonnull BigInteger start, int end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (int start, long end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (long start, long end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (@Nonnull BigInteger start, long end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (int start, @Nonnull BigInteger end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (long start, @Nonnull BigInteger end);

  /**
   * @param start
   *        parameter value
   * @param end
   *        parameter value
   * @since jQuery 1.1.4
   */
  @Nonnull
  IMPLTYPE slice (@Nonnull BigInteger start, @Nonnull BigInteger end);

  /**
   * @param clearQueue
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE stop (boolean clearQueue);

  /**
   * @param clearQueue
   *        parameter value
   * @param jumpToEnd
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE stop (boolean clearQueue, boolean jumpToEnd);

  /**
   * @param queue
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE stop (@Nonnull String queue);

  /**
   * @param queue
   *        parameter value
   * @param clearQueue
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE stop (@Nonnull String queue, boolean clearQueue);

  /**
   * @param queue
   *        parameter value
   * @param clearQueue
   *        parameter value
   * @param jumpToEnd
   *        parameter value
   * @since jQuery 1.7
   */
  @Nonnull
  IMPLTYPE stop (@Nonnull String queue, boolean clearQueue, boolean jumpToEnd);

  /**
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE submit (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE submit (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE submit (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param textString
   *        parameter value
   */
  @Nonnull
  IMPLTYPE text (@Nonnull String textString);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE text (@Nonnull JSAnonymousFunction function);

  /**
   * @param handler
   *        parameter value
   * @param handler_eventObject_1
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   */
  @Deprecated
  @Nonnull
  IMPLTYPE toggle (@Nonnull JSAnonymousFunction handler, @Nonnull JSAnonymousFunction handler_eventObject_1);

  /**
   * @param handler
   *        parameter value
   * @param handler_eventObject_1
   *        parameter value
   * @param handler_eventObject_2
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   */
  @Deprecated
  @Nonnull
  IMPLTYPE toggle (@Nonnull JSAnonymousFunction handler,
                   @Nonnull JSAnonymousFunction handler_eventObject_1,
                   @Nonnull JSAnonymousFunction handler_eventObject_2);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE toggle (int duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE toggle (long duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE toggle (@Nonnull BigInteger duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE toggle (double duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE toggle (@Nonnull BigDecimal duration);

  /**
   * @param duration
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE toggle (@Nonnull String duration);

  /**
   * @param showOrHide
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE toggle (boolean showOrHide);

  /**
   * @param className
   *        parameter value
   */
  @Nonnull
  IMPLTYPE toggleClass (@Nonnull String className);

  /**
   * @param className
   *        parameter value
   * @param _switch
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE toggleClass (@Nonnull String className, boolean _switch);

  /**
   * @param _switch
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE toggleClass (boolean _switch);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE toggleClass (@Nonnull JSAnonymousFunction function);

  /**
   * @param function
   *        parameter value
   * @param _switch
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE toggleClass (@Nonnull JSAnonymousFunction function, boolean _switch);

  /**
   * @param eventType
   *        parameter value
   */
  @Nonnull
  IMPLTYPE trigger (@Nonnull String eventType);

  /**
   * @param eventType
   *        parameter value
   * @param extraParameters
   *        parameter value
   */
  @Nonnull
  IMPLTYPE trigger (@Nonnull String eventType, @Nonnull JSArray extraParameters);

  /**
   * @param eventType
   *        parameter value
   * @param extraParameters
   *        parameter value
   */
  @Nonnull
  IMPLTYPE trigger (@Nonnull String eventType, @Nonnull IJSExpression extraParameters);

  /**
   * @param event
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE trigger (@Nonnull IJSExpression event);

  /**
   * @param event
   *        parameter value
   * @param extraParameters
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE trigger (@Nonnull IJSExpression event, @Nonnull JSArray extraParameters);

  /**
   * @param event
   *        parameter value
   * @param extraParameters
   *        parameter value
   * @since jQuery 1.3
   */
  @Nonnull
  IMPLTYPE trigger (@Nonnull IJSExpression event, @Nonnull IJSExpression extraParameters);

  /**
   * @param eventType
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE triggerHandler (@Nonnull String eventType);

  /**
   * @param eventType
   *        parameter value
   * @param extraParameters
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE triggerHandler (@Nonnull String eventType, @Nonnull JSArray extraParameters);

  /**
   * @param eventType
   *        parameter value
   */
  @Nonnull
  IMPLTYPE unbind (@Nonnull String eventType);

  /**
   * @param eventType
   *        parameter value
   * @param handler
   *        parameter value
   */
  @Nonnull
  IMPLTYPE unbind (@Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

  /**
   * @param eventType
   *        parameter value
   * @param _false
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE unbind (@Nonnull String eventType, boolean _false);

  /**
   * @param event
   *        parameter value
   */
  @Nonnull
  IMPLTYPE unbind (@Nonnull IJSExpression event);

  /**
   * @param selector
   *        parameter value
   * @param eventType
   *        parameter value
   * @since jQuery 1.4.2
   */
  @Nonnull
  IMPLTYPE undelegate (@Nonnull String selector, @Nonnull String eventType);

  /**
   * @param selector
   *        parameter value
   * @param eventType
   *        parameter value
   * @param handler
   *        parameter value
   * @since jQuery 1.4.2
   */
  @Nonnull
  IMPLTYPE undelegate (@Nonnull String selector, @Nonnull String eventType, @Nonnull JSAnonymousFunction handler);

  /**
   * @param selector
   *        parameter value
   * @param events
   *        parameter value
   * @since jQuery 1.4.3
   */
  @Nonnull
  IMPLTYPE undelegate (@Nonnull String selector, @Nonnull IJSExpression events);

  /**
   * @param namespace
   *        parameter value
   * @since jQuery 1.6
   */
  @Nonnull
  IMPLTYPE undelegate (@Nonnull String namespace);

  /**
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   */
  @Deprecated
  @Nonnull
  IMPLTYPE unload (@Nonnull JSAnonymousFunction handler);

  /**
   * @param eventData
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE unload (@Nonnull IJSExpression eventData);

  /**
   * @param eventData
   *        parameter value
   * @param handler
   *        parameter value
   * @deprecated Deprecated since jQuery 1.8
   * @since jQuery 1.4.3
   */
  @Deprecated
  @Nonnull
  IMPLTYPE unload (@Nonnull IJSExpression eventData, @Nonnull JSAnonymousFunction handler);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE val (@Nonnull String value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE val (@Nonnull JSArray value);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE val (@Nonnull JSAnonymousFunction function);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE width (@Nonnull String value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE width (int value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE width (long value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE width (@Nonnull BigInteger value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE width (double value);

  /**
   * @param value
   *        parameter value
   */
  @Nonnull
  IMPLTYPE width (@Nonnull BigDecimal value);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4.1
   */
  @Nonnull
  IMPLTYPE width (@Nonnull JSAnonymousFunction function);

  /**
   * @param wrappingElement
   *        parameter value
   */
  @Nonnull
  IMPLTYPE wrap (@Nonnull IJQuerySelector wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   */
  @Nonnull
  IMPLTYPE wrap (@Nonnull IHCNode wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   */
  @Nonnull
  IMPLTYPE wrap (@Nonnull String wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   */
  @Nonnull
  IMPLTYPE wrap (@Nonnull EHTMLElement wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   */
  @Nonnull
  IMPLTYPE wrap (@Nonnull JQueryInvocation wrappingElement);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE wrap (@Nonnull JSAnonymousFunction function);

  /**
   * @param wrappingElement
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE wrapAll (@Nonnull IJQuerySelector wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE wrapAll (@Nonnull IHCNode wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE wrapAll (@Nonnull String wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE wrapAll (@Nonnull EHTMLElement wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE wrapAll (@Nonnull JQueryInvocation wrappingElement);

  /**
   * @param wrappingElement
   *        parameter value
   * @since jQuery 1.2
   */
  @Nonnull
  IMPLTYPE wrapInner (@Nonnull String wrappingElement);

  /**
   * @param function
   *        parameter value
   * @since jQuery 1.4
   */
  @Nonnull
  IMPLTYPE wrapInner (@Nonnull JSAnonymousFunction function);
}
