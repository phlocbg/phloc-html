/**
 * Copyright (C) 2006-2014 phloc systems
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
package com.phloc.html.markdown;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.charset.CCharset;
import com.phloc.commons.collections.ContainerHelper;

/**
 * Txtmark configuration.
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 * @since 0.7
 */
public class MarkdownConfiguration
{
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
  public static final MarkdownConfiguration DEFAULT = MarkdownConfiguration.builder ().build ();

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
  public static final MarkdownConfiguration DEFAULT_EXTENSIONS = MarkdownConfiguration.builder ()
                                                                                      .setExtendedProfile (true)
                                                                                      .build ();

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
  public static final MarkdownConfiguration DEFAULT_SAFE = MarkdownConfiguration.builder ().setSafeMode (true).build ();

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
  public static final MarkdownConfiguration DEFAULT_SAFE_EXTENSIONS = MarkdownConfiguration.builder ()
                                                                                           .setSafeMode (true)
                                                                                           .setExtendedProfile (true)
                                                                                           .build ();

  private final boolean m_bSafeMode;
  private final Charset m_aEncoding;
  private final IDecorator m_aDecorator;
  private final IBlockEmitter m_aCodeBlockEmitter;
  private final boolean m_bForceExtendedProfile;
  private final boolean m_bConvertNewline2Br;
  private final ISpanEmitter m_aSpecialLinkEmitter;
  private final List <AbstractMarkdownPlugin> m_aPlugins;

  /**
   * Constructor.
   * 
   * @param safeMode
   * @param encoding
   * @param decorator
   */
  public MarkdownConfiguration (final boolean safeMode,
                                final Charset encoding,
                                final IDecorator decorator,
                                final IBlockEmitter aCodeBlockEmitter,
                                final boolean forceExtendedProfile,
                                final boolean convertNewline2Br,
                                final ISpanEmitter specialLinkEmitter,
                                final List <AbstractMarkdownPlugin> plugins)
  {
    m_bSafeMode = safeMode;
    m_aEncoding = encoding;
    m_aDecorator = decorator;
    m_aCodeBlockEmitter = aCodeBlockEmitter;
    m_bForceExtendedProfile = forceExtendedProfile;
    m_bConvertNewline2Br = convertNewline2Br;
    m_aSpecialLinkEmitter = specialLinkEmitter;
    m_aPlugins = plugins;
  }

  public boolean isSafeMode ()
  {
    return m_bSafeMode;
  }

  public Charset getEncoding ()
  {
    return m_aEncoding;
  }

  public IDecorator getDecorator ()
  {
    return m_aDecorator;
  }

  public IBlockEmitter getCodeBlockEmitter ()
  {
    return m_aCodeBlockEmitter;
  }

  public boolean isExtendedProfile ()
  {
    return m_bForceExtendedProfile;
  }

  public boolean isConvertNewline2Br ()
  {
    return m_bConvertNewline2Br;
  }

  public ISpanEmitter getSpecialLinkEmitter ()
  {
    return m_aSpecialLinkEmitter;
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <AbstractMarkdownPlugin> getAllPlugins ()
  {
    return ContainerHelper.newList (m_aPlugins);
  }

  /**
   * Creates a new Builder instance.
   * 
   * @return A new Builder instance.
   */
  @Nonnull
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
    private Charset m_aEncoding = CCharset.CHARSET_UTF_8_OBJ;
    private IDecorator m_aDecorator = new MarkdownDefaultDecorator ();
    private IBlockEmitter m_aCodeBlockEmitter = null;
    private ISpanEmitter m_aSpecialLinkEmitter = null;
    private final List <AbstractMarkdownPlugin> m_aPlugins = new ArrayList <AbstractMarkdownPlugin> ();

    /**
     * Constructor.
     */
    Builder ()
    {
      // empty
    }

    /**
     * Forces extened profile to be enabled by default.
     * 
     * @return This builder.
     * @since 0.7
     */
    @Nonnull
    public Builder setExtendedProfile (final boolean bExtendedProfile)
    {
      m_bForceExtendedProfile = bExtendedProfile;
      return this;
    }

    /**
     * convertNewline2Br.
     * 
     * @return This builder.
     */
    @Nonnull
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
    @Nonnull
    public Builder setSafeMode (final boolean flag)
    {
      m_bSafeMode = flag;
      return this;
    }

    /**
     * Sets the character encoding for txtmark. Default:
     * <code>&quot;UTF-8&quot;</code>
     * 
     * @param aEncoding
     *        The encoding
     * @return This builder
     * @since 0.7
     */
    @Nonnull
    public Builder setEncoding (final Charset aEncoding)
    {
      m_aEncoding = aEncoding;
      return this;
    }

    public IDecorator getDecorator ()
    {
      return m_aDecorator;
    }

    /**
     * Sets the decorator for txtmark. Default: <code>DefaultDecorator()</code>
     * 
     * @param decorator
     *        The decorator
     * @return This builder
     * @see MarkdownDefaultDecorator
     * @since 0.7
     */
    @Nonnull
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
    @Nonnull
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
    @Nonnull
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
    @Nonnull
    public Builder registerPlugins (final AbstractMarkdownPlugin... plugins)
    {
      for (final AbstractMarkdownPlugin plugin : plugins)
        m_aPlugins.add (plugin);
      return this;
    }

    /**
     * Builds a configuration instance.
     * 
     * @return a Configuration instance
     * @since 0.7
     */
    @Nonnull
    public MarkdownConfiguration build ()
    {
      return new MarkdownConfiguration (m_bSafeMode,
                                        m_aEncoding,
                                        m_aDecorator,
                                        m_aCodeBlockEmitter,
                                        m_bForceExtendedProfile,
                                        m_bConvertNewline2Br,
                                        m_aSpecialLinkEmitter,
                                        m_aPlugins);
    }
  }
}
