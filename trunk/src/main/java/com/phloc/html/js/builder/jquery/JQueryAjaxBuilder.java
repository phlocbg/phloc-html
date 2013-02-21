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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSAssocArray;

/**
 * Utility class handling <code>$.ajax</code>
 * 
 * @author philip
 */
public class JQueryAjaxBuilder
{
  /** By default asynchronous AJAX is enabled */
  public static final boolean DEFAULT_ASYNC = true;
  /** By default HTTP caching is enabled */
  public static final boolean DEFAULT_CACHE = true;
  /** By default global events are triggered */
  public static final boolean DEFAULT_GLOBAL_EVENTS = true;

  // modifier
  private boolean m_bAsync = DEFAULT_ASYNC;
  private boolean m_bCache = DEFAULT_CACHE;
  private IJSExpression m_aData;
  private String m_sDataType;
  private boolean m_bGlobalEvents = DEFAULT_GLOBAL_EVENTS;
  private String m_sURL;

  // Callbacks
  private IJSExpression m_aCallbackContext;
  private JSAnonymousFunction m_aBeforeSend;
  private JSAnonymousFunction m_aComplete;
  private JSAnonymousFunction m_aError;
  private JSAnonymousFunction m_aSuccess;

  public JQueryAjaxBuilder ()
  {}

  public boolean async ()
  {
    return m_bAsync;
  }

  @Nonnull
  public JQueryAjaxBuilder async (final boolean bAsync)
  {
    m_bAsync = bAsync;
    return this;
  }

  public boolean cache ()
  {
    return m_bCache;
  }

  @Nonnull
  public JQueryAjaxBuilder cache (final boolean bCache)
  {
    m_bCache = bCache;
    return this;
  }

  @Nullable
  public IJSExpression data ()
  {
    return m_aData;
  }

  @Nonnull
  public JQueryAjaxBuilder data (@Nullable final IJSExpression aData)
  {
    m_aData = aData;
    return this;
  }

  @Nullable
  public String dataType ()
  {
    return m_sDataType;
  }

  @Nonnull
  public JQueryAjaxBuilder dataType (@Nullable final String sDataType)
  {
    m_sDataType = sDataType;
    return this;
  }

  public boolean global ()
  {
    return m_bGlobalEvents;
  }

  @Nonnull
  public JQueryAjaxBuilder global (final boolean bGlobalEvents)
  {
    m_bGlobalEvents = bGlobalEvents;
    return this;
  }

  @Nullable
  public String url ()
  {
    return m_sURL;
  }

  @Nonnull
  public JQueryAjaxBuilder url (@Nullable final ISimpleURL aURL)
  {
    return url (aURL == null ? null : aURL.getAsString ());
  }

  @Nonnull
  public JQueryAjaxBuilder url (@Nullable final String sURL)
  {
    m_sURL = sURL;
    return this;
  }

  // Callback related

  @Nullable
  public IJSExpression context ()
  {
    return m_aCallbackContext;
  }

  @Nonnull
  public JQueryAjaxBuilder context (@Nullable final IJSExpression aContext)
  {
    m_aCallbackContext = aContext;
    return this;
  }

  @Nullable
  public JSAnonymousFunction beforeSend ()
  {
    return m_aBeforeSend;
  }

  @Nonnull
  public JQueryAjaxBuilder beforeSend (@Nullable final JSAnonymousFunction aBeforeSend)
  {
    m_aBeforeSend = aBeforeSend;
    return this;
  }

  @Nullable
  public JSAnonymousFunction complete ()
  {
    return m_aComplete;
  }

  @Nonnull
  public JQueryAjaxBuilder complete (@Nullable final JSAnonymousFunction aComplete)
  {
    m_aComplete = aComplete;
    return this;
  }

  @Nullable
  public JSAnonymousFunction error ()
  {
    return m_aError;
  }

  @Nonnull
  public JQueryAjaxBuilder error (@Nullable final JSAnonymousFunction aError)
  {
    m_aError = aError;
    return this;
  }

  @Nullable
  public JSAnonymousFunction success ()
  {
    return m_aSuccess;
  }

  @Nonnull
  public JQueryAjaxBuilder success (@Nullable final JSAnonymousFunction aSuccess)
  {
    m_aSuccess = aSuccess;
    return this;
  }

  @Nonnull
  public JQueryInvocation build ()
  {
    final JSAssocArray aSettings = new JSAssocArray ();
    if (m_bAsync != DEFAULT_ASYNC)
      aSettings.add ("async", m_bAsync);
    if (m_bCache != DEFAULT_CACHE)
      aSettings.add ("cache", m_bCache);
    if (m_aData != null)
      aSettings.add ("data", m_aData);
    if (m_sDataType != null)
      aSettings.add ("dataType", m_sDataType);
    if (m_bGlobalEvents != DEFAULT_GLOBAL_EVENTS)
      aSettings.add ("global", m_bGlobalEvents);
    if (m_sURL != null)
      aSettings.add ("url", m_sURL);

    // Callbacks
    if (m_aCallbackContext != null)
      aSettings.add ("context", m_aCallbackContext);
    if (m_aBeforeSend != null)
      aSettings.add ("beforeSend", m_aBeforeSend);
    if (m_aComplete != null)
      aSettings.add ("complete", m_aComplete);
    if (m_aError != null)
      aSettings.add ("error", m_aError);
    if (m_aSuccess != null)
      aSettings.add ("success", m_aSuccess);

    return JQuery.ajax (aSettings);
  }
}
