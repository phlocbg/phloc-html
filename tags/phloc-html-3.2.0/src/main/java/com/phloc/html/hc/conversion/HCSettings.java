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
  private static IHCConversionSettingsProvider s_aSettingsProvider = DefaultHCConversionSettingsProvider.getInstance ();

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
   * Convert the passed HC node to a micro node using the conversion settings
   * provider.
   * 
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCBaseNode aHCNode)
  {
    // No indent/align required for conversion to IMicroNode
    return getAsNode (aHCNode, getConversionSettings (false));
  }

  /**
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCBaseNode aHCNode,
                                      @Nonnull final IHCConversionSettings aConversionSettings)
  {
    return aHCNode.getAsNode (aConversionSettings);
  }

  /**
   * Convert the passed HC node to an HTML string using the conversion settings
   * factory.
   * 
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param bIndentAndAlign
   *        Indent and align?
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCBaseNode aHCNode, final boolean bIndentAndAlign)
  {
    return getAsHTMLString (aHCNode, getConversionSettings (bIndentAndAlign));
  }

  /**
   * Convert the passed HC node to an HTML string using the passed conversion
   * settings.
   * 
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as XML optionally without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCBaseNode aHCNode,
                                        @Nonnull final IHCConversionSettings aConversionSettings)
  {
    return aHCNode.getAsHTMLString (aConversionSettings);
  }

  /**
   * Get the out-of-band node for the passed HC node using the conversion
   * settings provider.
   * 
   * @param aHCNode
   *        The node for which the out-of-band nodes are to be retrieved. May
   *        not be <code>null</code>.
   * @return <code>null</code> if no out-of-band node is present.
   */
  @Nullable
  public static IHCBaseNode getOutOfBandNode (@Nonnull final IHCNode aHCNode)
  {
    // No indent/align required for retrieving out of band node
    return getOutOfBandNode (aHCNode, getConversionSettings (false));
  }

  /**
   * Get the out-of-band node for the passed HC node using the passed conversion
   * settings.
   * 
   * @param aHCNode
   *        The node for which the out-of-band nodes are to be retrieved. May
   *        not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return <code>null</code> if no out-of-band node is present.
   */
  @Nullable
  public static IHCBaseNode getOutOfBandNode (@Nonnull final IHCNode aHCNode,
                                              @Nonnull final IHCConversionSettings aConversionSettings)
  {
    return aHCNode.getOutOfBandNode (aConversionSettings);
  }
}
