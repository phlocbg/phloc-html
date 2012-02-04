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
package com.phloc.html.js;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

/**
 * This class represents a map from an {@link EJSEvent} to an
 * {@link IJSCodeProvider} that represents the code. This is mainly meant for
 * managing HTML element JS event handler.
 * 
 * @author philip
 */
public final class JSEventMap implements Serializable
{
  private final Map <EJSEvent, IJSCodeProvider> m_aEvents = new EnumMap <EJSEvent, IJSCodeProvider> (EJSEvent.class);

  /**
   * Add an additional handler for the given JS event. If an existing handler is
   * present, the new handler is appended.
   * 
   * @param eJSEvent
   *        The JS event. May not be <code>null</code>.
   * @param aNewHandler
   *        The new handler to be added. May not be <code>null</code>.
   */
  public void addHandler (@Nonnull final EJSEvent eJSEvent, @Nonnull final IJSCodeProvider aNewHandler)
  {
    if (eJSEvent == null)
      throw new NullPointerException ("JSEvent");
    if (aNewHandler == null)
      throw new NullPointerException ("newHandler");

    final IJSCodeProvider aOldHandler = m_aEvents.get (eJSEvent);
    if (aOldHandler == null)
    {
      // Set only the new handler
      m_aEvents.put (eJSEvent, aNewHandler);
    }
    else
    {
      // Combine old and new handler
      m_aEvents.put (eJSEvent, new CollectingJSCodeProvider (aOldHandler, aNewHandler));
    }
  }

  /**
   * Set a handler for the given JS event. If an existing handler is present, it
   * is automatically overridden.
   * 
   * @param eJSEvent
   *        The JS event. May not be <code>null</code>.
   * @param aNewHandler
   *        The new handler to be added. May not be <code>null</code>.
   */
  public void setHandler (@Nonnull final EJSEvent eJSEvent, @Nonnull final IJSCodeProvider aNewHandler)
  {
    if (eJSEvent == null)
      throw new NullPointerException ("JSEvent");
    if (aNewHandler == null)
      throw new NullPointerException ("newHandler");

    // Set only the new handler
    m_aEvents.put (eJSEvent, aNewHandler);
  }

  public void removeHandler (@Nonnull final EJSEvent eJSEvent)
  {
    if (eJSEvent == null)
      throw new NullPointerException ("JSEvent");

    m_aEvents.remove (eJSEvent);
  }

  @Nullable
  public IJSCodeProvider getHandler (@Nonnull final EJSEvent eJSEvent)
  {
    return m_aEvents.get (eJSEvent);
  }

  public void applyToElement (@Nonnull final IMicroElement aElement)
  {
    // Loop over all events for consistent results
    for (final EJSEvent eEvent : EJSEvent.values ())
    {
      final IJSCodeProvider aProvider = m_aEvents.get (eEvent);
      if (aProvider != null)
      {
        final String sJSCode = aProvider.getJSCode ();
        aElement.setAttribute (eEvent.getEvent (), CJS.JS_PREFIX + sJSCode);
      }
    }
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("events", m_aEvents).toString ();
  }
}
