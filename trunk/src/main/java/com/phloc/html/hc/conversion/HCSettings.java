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
package com.phloc.html.hc.conversion;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

import com.phloc.commons.microdom.IMicroNode;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;

@ThreadSafe
public final class HCSettings
{
  private static final ReadWriteLock s_aRWLock = new ReentrantReadWriteLock ();
  private static IHCConversionSettingsProvider s_aSettingsProvider = new DefaultHCConversionSettingsProvider ();

  private HCSettings ()
  {}

  /**
   * Set the global conversion settings provider.
   * 
   * @param aConversionSettingsProvider
   *        The object to be used. May not be <code>null</code>.
   */
  public static void setConversionSettingsProvider (@Nonnull final IHCConversionSettingsProvider aConversionSettingsProvider)
  {
    if (aConversionSettingsProvider == null)
      throw new NullPointerException ("conversionSettingsProvider");

    s_aRWLock.writeLock ().lock ();
    try
    {
      s_aSettingsProvider = aConversionSettingsProvider;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return The global conversion settings provider. Never <code>null</code>.
   *         By default a {@link DefaultHCConversionSettingsProvider} object is
   *         returned.
   */
  @Nonnull
  public static IHCConversionSettingsProvider getConversionSettingsProvider ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_aSettingsProvider;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  /**
   * Get the conversion settings from the current conversion settings provider
   * 
   * @param bIndentAndAlign
   *        Indented/aligned output?
   * @return The non-<code>null</code> conversion settings
   */
  @Nonnull
  public static IHCConversionSettings getConversionSettings (final boolean bIndentAndAlign)
  {
    return getConversionSettingsProvider ().getConversionSettings (bIndentAndAlign);
  }

  /**
   * @param aHCNode
   *        The node to be converted
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCBaseNode aHCNode)
  {
    // No indent/align required for conversion to IMicroNode
    return aHCNode.getAsNode (getConversionSettings (false));
  }

  /**
   * @param aHCNode
   *        The node to be converted
   * @param bIndentAndAlign
   *        Indent and align?
   * @return The node as XML optionally without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCBaseNode aHCNode, final boolean bIndentAndAlign)
  {
    return aHCNode.getAsHTMLString (getConversionSettings (bIndentAndAlign));
  }

  @Nullable
  public static IHCBaseNode getOutOfBandNode (@Nonnull final IHCNode aHCNode)
  {
    // No indent/align required for retrieving out of band node
    return aHCNode.getOutOfBandNode (getConversionSettings (false));
  }
}
