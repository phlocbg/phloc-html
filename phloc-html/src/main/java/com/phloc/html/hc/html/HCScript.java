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
package com.phloc.html.hc.html;

import java.util.Locale;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNodeWithChildren;
import com.phloc.commons.microdom.impl.MicroText;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.provider.UnparsedJSCodeProvider;

/**
 * This class represents an HTML &lt;script&gt; element with inline JS content.
 * 
 * @author Philip Helger
 * @see HCScriptFile
 */
@OutOfBandNode
public class HCScript extends AbstractHCScript <HCScript> implements IJSCodeProvider
{
  public static enum EMode
  {
    /**
     * Emit JS code as plain text, but XML masked. The XML masking rules for
     * text nodes apply.
     */
    PLAIN_TEXT,
    /**
     * Emit JS code as plain text, but without XML masking.
     */
    PLAIN_TEXT_NO_ESCAPE,
    /**
     * Wrap the whole JS code in XML comments.
     */
    WRAP_IN_COMMENT,
    /**
     * Wrap the whole JS code in an XML CDATA container
     */
    CDATA;
  }

  /** By default inline scripts are emitted in mode "wrap in comment" */
  public static final EMode DEFAULT_MODE = EMode.WRAP_IN_COMMENT;

  private static final Logger s_aLogger = LoggerFactory.getLogger (HCScript.class);
  private static final ReadWriteLock s_aRWLock = new ReentrantReadWriteLock ();

  @GuardedBy ("s_aRWLock")
  private static EMode s_eDefaultMode = DEFAULT_MODE;

  private final IJSCodeProvider m_aProvider;
  private String m_sJSCode;
  private EMode m_eMode;

  public HCScript (@Nonnull final IJSCodeProvider aProvider)
  {
    super ();
    if (aProvider == null)
      throw new NullPointerException ("provider");
    m_aProvider = aProvider;
    m_eMode = getDefaultMode ();
  }

  @DevelopersNote ("Handle with care!")
  public HCScript (@Nonnull final String sJSCode)
  {
    this (new UnparsedJSCodeProvider (sJSCode));
  }

  public boolean isInlineJS ()
  {
    return true;
  }

  @Nonnull
  public IJSCodeProvider getJSCodeProvider ()
  {
    return m_aProvider;
  }

  @Nullable
  public String getJSCode ()
  {
    return m_aProvider.getJSCode ();
  }

  @Nonnull
  public EMode getMode ()
  {
    return m_eMode;
  }

  @Nonnull
  public HCScript setMode (@Nonnull final EMode eMode)
  {
    if (eMode == null)
      throw new NullPointerException ("mode");
    m_eMode = eMode;
    return this;
  }

  public static void setInlineScript (@Nonnull final IMicroNodeWithChildren aElement,
                                      @Nullable final String sContent,
                                      @Nonnull final EMode eMode)
  {
    if (StringHelper.hasText (sContent))
      switch (eMode)
      {
        case PLAIN_TEXT:
          aElement.appendText (sContent);
          break;
        case PLAIN_TEXT_NO_ESCAPE:
          if (StringHelper.containsIgnoreCase (sContent, "</script>", Locale.US))
            throw new IllegalArgumentException ("The script text contains a closing script tag!");
          aElement.appendChild (new MicroText (sContent).setEscape (false));
          break;
        case WRAP_IN_COMMENT:
          // <script>
          // my script bla
          // //</script>
          if (StringHelper.getLastChar (sContent) == '\n')
            aElement.appendComment ("\n" + sContent + "//");
          else
            aElement.appendComment ("\n" + sContent + "\n//");
          break;
        case CDATA:
          // Tested OK with FF6, Opera11, Chrome13, IE8, IE9
          /**
           * <pre>
           * //<![CDATA[
           * my script bla//]]>
           * </pre>
           */
          aElement.appendText ("//");
          aElement.appendCDATA ("\n" + sContent + "//");
          break;
      }
  }

  @Override
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    m_sJSCode = getJSCode ();
    // Don't create script elements with empty content....
    return StringHelper.hasText (m_sJSCode);
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    // m_sJSCode is set in canConvertToNode which is called before this method!
    setInlineScript (aElement, m_sJSCode, m_eMode);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("provider", m_aProvider)
                            .append ("mode", m_eMode)
                            .toString ();
  }

  /**
   * Set how the content of script elements should be emitted. This only affects
   * new built objects, and does not alter existing objects! The default mode is
   * {@link #DEFAULT_MODE}.
   * 
   * @param eMode
   *        The new mode to set. May not be <code>null</code>.
   */
  public static void setDefaultMode (@Nonnull final EMode eMode)
  {
    if (eMode == null)
      throw new NullPointerException ("mode");
    s_aRWLock.writeLock ().lock ();
    try
    {
      s_eDefaultMode = eMode;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
    s_aLogger.info ("Default <script> mode set to " + eMode);
  }

  /**
   * @return The default mode to emit script content. Never <code>null</code>.
   */
  @Nonnull
  public static EMode getDefaultMode ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_eDefaultMode;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }
}
