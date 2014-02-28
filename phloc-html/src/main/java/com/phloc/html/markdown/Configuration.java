/*
 * Copyright (C) 2011 René Jeschke <rene_jeschke@yahoo.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.markdown;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

/**
 * Txtmark configuration.
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 * @since 0.7
 */
public class Configuration
{
  final boolean m_bSafeMode;
  final String m_sEncoding;
  final IDecorator m_aDecorator;
  final IBlockEmitter m_aCodeBlockEmitter;
  final boolean m_bForceExtendedProfile;
  final boolean m_bConvertNewline2Br;
  final ISpanEmitter m_aSpecialLinkEmitter;
  final List <AbstractPlugin> m_aPlugins;

  /**
   * <p>
   * This is the default configuration for txtmark's <code>process</code>
   * methods
   * </p>
   * <ul>
   * <li><code>safeMode = false</code></li>
   * <li><code>encoding = UTF-8</code></li>
   * <li><code>decorator = DefaultDecorator</code></li>
   * <li><code>codeBlockEmitter = null</code></li>
   * </ul>
   */
  public static final Configuration DEFAULT = Configuration.builder ().build ();

  /**
   * <p>
   * Default safe configuration
   * </p>
   * <ul>
   * <li><code>safeMode = true</code></li>
   * <li><code>encoding = UTF-8</code></li>
   * <li><code>decorator = DefaultDecorator</code></li>
   * <li><code>codeBlockEmitter = null</code></li>
   * </ul>
   */
  public static final Configuration DEFAULT_SAFE = Configuration.builder ().enableSafeMode ().build ();

  /**
   * Constructor.
   * 
   * @param safeMode
   * @param encoding
   * @param decorator
   */
  Configuration (final boolean safeMode,
                 final String encoding,
                 final IDecorator decorator,
                 final IBlockEmitter codeBlockEmitter,
                 final boolean forceExtendedProfile,
                 final boolean convertNewline2Br,
                 final ISpanEmitter specialLinkEmitter,
                 final List <AbstractPlugin> plugins)
  {
    m_bSafeMode = safeMode;
    m_sEncoding = encoding;
    m_aDecorator = decorator;
    m_aCodeBlockEmitter = codeBlockEmitter;
    m_bConvertNewline2Br = convertNewline2Br;
    m_bForceExtendedProfile = forceExtendedProfile;
    m_aSpecialLinkEmitter = specialLinkEmitter;
    m_aPlugins = plugins;
  }

  /**
   * Creates a new Builder instance.
   * 
   * @return A new Builder instance.
   */
  public static Builder builder ()
  {
    return new Builder ();
  }

  /**
   * Configuration builder.
   * 
   * @author René Jeschke <rene_jeschke@yahoo.de>
   * @since 0.7
   */
  public static class Builder
  {
    private boolean m_bSafeMode = false;
    private boolean m_bForceExtendedProfile = false;
    private boolean m_bConvertNewline2Br = false;
    private String m_sEncoding = "UTF-8";
    private IDecorator m_aDecorator = new DefaultDecorator ();
    private IBlockEmitter m_aCodeBlockEmitter = null;
    private ISpanEmitter m_aSpecialLinkEmitter = null;
    private final List <AbstractPlugin> m_aPlugins = new ArrayList <AbstractPlugin> ();

    /**
     * Constructor.
     */
    Builder ()
    {
      // empty
    }

    /**
     * Enables HTML safe mode. Default: <code>false</code>
     * 
     * @return This builder
     * @since 0.7
     */
    public Builder enableSafeMode ()
    {
      m_bSafeMode = true;
      return this;
    }

    /**
     * Forces extened profile to be enabled by default.
     * 
     * @return This builder.
     * @since 0.7
     */
    public Builder forceExtentedProfile ()
    {
      m_bForceExtendedProfile = true;
      return this;
    }

    /**
     * convertNewline2Br.
     * 
     * @return This builder.
     */
    public Builder convertNewline2Br ()
    {
      m_bConvertNewline2Br = true;
      return this;
    }

    /**
     * Sets the HTML safe mode flag. Default: <code>false</code>
     * 
     * @param flag
     *        <code>true</code> to enable safe mode
     * @return This builder
     * @since 0.7
     */
    public Builder setSafeMode (final boolean flag)
    {
      m_bSafeMode = flag;
      return this;
    }

    /**
     * Sets the character encoding for txtmark. Default:
     * <code>&quot;UTF-8&quot;</code>
     * 
     * @param encoding
     *        The encoding
     * @return This builder
     * @since 0.7
     */
    public Builder setEncoding (final String encoding)
    {
      m_sEncoding = encoding;
      return this;
    }

    /**
     * Sets the decorator for txtmark. Default: <code>DefaultDecorator()</code>
     * 
     * @param decorator
     *        The decorator
     * @return This builder
     * @see DefaultDecorator
     * @since 0.7
     */
    public Builder setDecorator (final IDecorator decorator)
    {
      m_aDecorator = decorator;
      return this;
    }

    /**
     * Sets the code block emitter. Default: <code>null</code>
     * 
     * @param emitter
     *        The BlockEmitter
     * @return This builder
     * @see IBlockEmitter
     * @since 0.7
     */
    public Builder setCodeBlockEmitter (final IBlockEmitter emitter)
    {
      m_aCodeBlockEmitter = emitter;
      return this;
    }

    /**
     * Sets the emitter for special link spans ([[ ... ]]).
     * 
     * @param emitter
     *        The emitter.
     * @return This builder.
     * @since 0.7
     */
    public Builder setSpecialLinkEmitter (final ISpanEmitter emitter)
    {
      m_aSpecialLinkEmitter = emitter;
      return this;
    }

    /**
     * Sets the plugins.
     * 
     * @param plugins
     *        The plugins.
     * @return This builder.
     */
    public Builder registerPlugins (final AbstractPlugin... plugins)
    {
      for (final AbstractPlugin plugin : plugins)
      {
        m_aPlugins.add (plugin);
      }
      return this;
    }

    /**
     * Builds a configuration instance.
     * 
     * @return a Configuration instance
     * @since 0.7
     */
    @Nonnull
    public Configuration build ()
    {
      return new Configuration (m_bSafeMode,
                                m_sEncoding,
                                m_aDecorator,
                                m_aCodeBlockEmitter,
                                m_bForceExtendedProfile,
                                m_bConvertNewline2Br,
                                m_aSpecialLinkEmitter,
                                m_aPlugins);
    }

    public IDecorator getDecorator ()
    {
      return m_aDecorator;
    }
  }
}
