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
package com.phloc.html.hc.conversion;

import java.nio.charset.Charset;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeBuilder;
import com.phloc.html.hc.customize.IHCCustomizer;

@ThreadSafe
public final class HCSettings
{
  private static final ReadWriteLock s_aRWLock = new ReentrantReadWriteLock ();
  private static IHCConversionSettingsProvider s_aSettingsProvider = new HCConversionSettingsProvider (EHTMLVersion.DEFAULT);

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
   *         By default a {@link HCConversionSettingsProvider} object is
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
   * Convert the passed HC node builder to a micro node using the conversion
   * settings provider.
   * 
   * @param aNodeBuilder
   *        The node to be converted. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCNodeBuilder aNodeBuilder)
  {
    return getAsNode (aNodeBuilder.build ());
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
  public static IMicroNode getAsNode (@Nonnull final IHCNode aHCNode)
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
  public static IMicroNode getAsNode (@Nonnull final IHCNode aHCNode,
                                      @Nonnull final IHCConversionSettings aConversionSettings)
  {
    return aHCNode.convertToNode (aConversionSettings);
  }

  /**
   * Convert the passed HC node builder to an HTML string using the conversion
   * settings factory.
   * 
   * @param aNodeBuilder
   *        The node to be converted. May not be <code>null</code>.
   * @param bIndentAndAlign
   *        Indent and align?
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCNodeBuilder aNodeBuilder, final boolean bIndentAndAlign)
  {
    return getAsHTMLString (aNodeBuilder.build (), bIndentAndAlign);
  }

  /**
   * Convert the passed HC node builder to an HTML string using the passed
   * conversion settings.
   * 
   * @param aNodeBuilder
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as XML optionally without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCNodeBuilder aNodeBuilder,
                                        @Nonnull final IHCConversionSettings aConversionSettings)
  {
    return getAsHTMLString (aNodeBuilder.build (), aConversionSettings);
  }

  /**
   * Convert the passed HC node to an HTML string. Indent and align status is
   * determined from {@link GlobalDebug#isDebugMode()}
   * 
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCNode aHCNode)
  {
    return getAsHTMLString (aHCNode, GlobalDebug.isDebugMode ());
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
  public static String getAsHTMLString (@Nonnull final IHCNode aHCNode, final boolean bIndentAndAlign)
  {
    return getAsHTMLString (aHCNode, getConversionSettings (bIndentAndAlign));
  }

  /**
   * Convert the passed HC node to an HTML string without namespaces. Indent and
   * align status is determined from {@link GlobalDebug#isDebugMode()}
   * 
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLStringWithoutNamespaces (@Nonnull final IHCNode aHCNode)
  {
    return getAsHTMLStringWithoutNamespaces (aHCNode, GlobalDebug.isDebugMode ());
  }

  /**
   * Convert the passed HC node to an HTML string without namespaces.
   * 
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param bIndentAndAlign
   *        Indent and align?
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLStringWithoutNamespaces (@Nonnull final IHCNode aHCNode, final boolean bIndentAndAlign)
  {
    final IHCConversionSettings aCS = getConversionSettings (bIndentAndAlign);
    // Create a copy
    final HCConversionSettings aRealCS = new HCConversionSettings (aCS);
    // And modify the copied XML settings
    aRealCS.getXMLWriterSettings ().setEmitNamespaces (false);
    return getAsHTMLString (aHCNode, aRealCS);
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
  public static String getAsHTMLString (@Nonnull final IHCNode aHCNode,
                                        @Nonnull final IHCConversionSettings aConversionSettings)
  {
    return aHCNode.getAsHTMLString (aConversionSettings);
  }

  /**
   * Get the {@link Charset} that was used in creating the HTML code
   * 
   * @param bIndentAndAlign
   *        Indent and align?
   * @return The non-<code>null</code> Charset object
   */
  @Nonnull
  public static Charset getHTMLCharset (final boolean bIndentAndAlign)
  {
    return getConversionSettings (bIndentAndAlign).getXMLWriterSettings ().getCharsetObj ();
  }

  /**
   * Convert the passed HC node to a micro node using the conversion settings
   * provider.
   * 
   * @return The customizer to use. May be <code>null</code>.
   */
  @Nullable
  public static IHCCustomizer getCustomizer ()
  {
    // No indent/align required for conversion to IHCCustomizer
    return getConversionSettings (false).getCustomizer ();
  }
}
