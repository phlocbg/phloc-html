/**
 * Copyright (C) 2006-2015 phloc systems
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
package com.phloc.html.hc.html;

import java.util.Locale;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNodeWithChildren;
import com.phloc.commons.microdom.impl.MicroText;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.decl.CSSDeclarationList;
import com.phloc.css.decl.CascadingStyleSheet;
import com.phloc.css.media.CSSMediaList;
import com.phloc.css.media.ECSSMedium;
import com.phloc.css.writer.CSSWriter;
import com.phloc.css.writer.CSSWriterSettings;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.IHCCSSNode;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;
import com.phloc.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;style&gt; element
 * 
 * @author Philip Helger
 */
@OutOfBandNode
public class HCStyle extends AbstractHCElement <HCStyle> implements IHCCSSNode
{
  private static final long serialVersionUID = 1822303861700862450L;

  public static enum EMode
  {
   /**
    * Emit JS code as plain text, but XML masked
    */
   PLAIN_TEXT,
   /**
    * Emit JS code as plain text, but without XML masking
    */
   PLAIN_TEXT_NO_ESCAPE;
  }

  /** By default plain text without escape is used */
  public static final EMode DEFAULT_MODE = EMode.PLAIN_TEXT_NO_ESCAPE;
  /** The default MIME type is text/css */
  public static final IMimeType DEFAULT_TYPE = CMimeType.TEXT_CSS;

  /** By default place inline CSS after script files */
  public static final boolean DEFAULT_EMIT_AFTER_FILES = true;

  private static final Logger s_aLogger = LoggerFactory.getLogger (HCStyle.class);

  private static EMode s_eDefaultMode = DEFAULT_MODE;

  private IMimeType m_aType = DEFAULT_TYPE;
  private CSSMediaList m_aMediaList;
  private String m_sContent;
  private EMode m_eMode = s_eDefaultMode;
  private boolean m_bEmitAfterFiles = DEFAULT_EMIT_AFTER_FILES;

  public HCStyle ()
  {
    super (EHTMLElement.STYLE);
  }

  public HCStyle (@Nullable final String sContent)
  {
    this ();
    setStyleContent (sContent);
  }

  public HCStyle (@Nonnull final CascadingStyleSheet aCSS, @Nonnull final CSSWriterSettings aSettings)
  {
    this ();
    setStyleContent (aCSS, aSettings);
  }

  public HCStyle (@Nonnull final CSSDeclarationList aCSS, @Nonnull final CSSWriterSettings aSettings)
  {
    this ();
    setStyleContent (aCSS, aSettings);
  }

  @Override
  public boolean isInlineCSS ()
  {
    return true;
  }

  @Nonnull
  public IMimeType getType ()
  {
    return this.m_aType;
  }

  @Nonnull
  public HCStyle setType (@Nonnull final IMimeType aType)
  {
    this.m_aType = ValueEnforcer.notNull (aType, "Type"); //$NON-NLS-1$
    return this;
  }

  @Nullable
  public CSSMediaList getMedia ()
  {
    return this.m_aMediaList;
  }

  @Nonnull
  public HCStyle setMedia (@Nullable final CSSMediaList aMediaList)
  {
    this.m_aMediaList = aMediaList;
    return this;
  }

  @Nonnull
  public HCStyle addMedium (@Nonnull final ECSSMedium eMedium)
  {
    if (this.m_aMediaList == null)
    {
      this.m_aMediaList = new CSSMediaList ();
    }
    this.m_aMediaList.addMedium (eMedium);
    return this;
  }

  @Nonnull
  public HCStyle removeAllMedia ()
  {
    this.m_aMediaList = null;
    return this;
  }

  /**
   * Check if the passed medium is explicitly specified
   * 
   * @param eMedium
   *        The medium to be checked. May be <code>null</code>.
   * @return <code>true</code> if it is contained, <code>false</code> otherwise
   */
  public boolean containsMedium (@Nullable final ECSSMedium eMedium)
  {
    return this.m_aMediaList != null && this.m_aMediaList.containsMedium (eMedium);
  }

  @Nonnegative
  public int getMediaCount ()
  {
    return this.m_aMediaList == null ? 0 : this.m_aMediaList.size ();
  }

  public boolean hasAnyMedia ()
  {
    return this.m_aMediaList != null && this.m_aMediaList.hasAnyMedia ();
  }

  public boolean hasNoMedia ()
  {
    return this.m_aMediaList == null || !this.m_aMediaList.hasAnyMedia ();
  }

  /**
   * @return <code>true</code> if no explicit media is defined or if
   *         {@link ECSSMedium#ALL} is contained.
   */
  public boolean hasNoMediaOrAll ()
  {
    return hasNoMedia () || containsMedium (ECSSMedium.ALL);
  }

  @Nonnull
  public HCStyle setStyleContent (@Nullable final String sContent)
  {
    this.m_sContent = sContent;
    return this;
  }

  @Nonnull
  public HCStyle setStyleContent (@Nonnull final CascadingStyleSheet aCSS, @Nonnull final CSSWriterSettings aSettings)
  {
    return setStyleContent (new CSSWriter (aSettings).getCSSAsString (aCSS));
  }

  @Nonnull
  public HCStyle setStyleContent (@Nonnull final CSSDeclarationList aCSS, @Nonnull final CSSWriterSettings aSettings)
  {
    return setStyleContent (new CSSWriter (aSettings).getCSSAsString (aCSS));
  }

  /**
   * @return The CSS content. May be <code>null</code>.
   */
  @Nullable
  public String getStyleContent ()
  {
    return this.m_sContent;
  }

  @Nonnull
  public EMode getMode ()
  {
    return this.m_eMode;
  }

  @Nonnull
  public HCStyle setMode (@Nonnull final EMode eMode)
  {
    this.m_eMode = ValueEnforcer.notNull (eMode, "Mode"); //$NON-NLS-1$
    return this;
  }

  public boolean isEmitAfterFiles ()
  {
    return this.m_bEmitAfterFiles;
  }

  @Nonnull
  public HCStyle setEmitAfterFiles (final boolean bEmitAfterFiles)
  {
    this.m_bEmitAfterFiles = bEmitAfterFiles;
    return this;
  }

  @Override
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Don't create style elements with empty content....
    return StringHelper.hasText (this.m_sContent);
  }

  public static void setInlineStyle (@Nonnull final IMicroNodeWithChildren aElement,
                                     @Nullable final String sContent,
                                     @Nonnull final EMode eMode)
  {
    if (StringHelper.hasText (sContent))
    {
      switch (eMode)
      {
        case PLAIN_TEXT:
          aElement.appendText (sContent);
          break;
        case PLAIN_TEXT_NO_ESCAPE:
          if (StringHelper.containsIgnoreCase (sContent, "</script>", Locale.US)) //$NON-NLS-1$
          {
            throw new IllegalArgumentException ("The script text contains a closing script tag!"); //$NON-NLS-1$
          }
          aElement.appendChild (new MicroText (sContent).setEscape (false));
          break;
      }
    }
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (aConversionSettings.getHTMLVersion ().isPriorToHTML5 ())
    {
      aElement.setAttribute (CHTMLAttributes.TYPE, this.m_aType.getAsString ());
    }
    if (hasAnyMedia ())
    {
      aElement.setAttribute (CHTMLAttributes.MEDIA, this.m_aMediaList.getMediaString ());
    }
    setInlineStyle (aElement, this.m_sContent, this.m_eMode);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("type", this.m_aType) //$NON-NLS-1$
                            .appendIfNotNull ("mediaList", this.m_aMediaList) //$NON-NLS-1$
                            .append ("content", this.m_sContent) //$NON-NLS-1$
                            .append ("mode", this.m_eMode) //$NON-NLS-1$
                            .append ("emitAfterFiles", this.m_bEmitAfterFiles) //$NON-NLS-1$
                            .toString ();
  }

  /**
   * Set how the content of style elements should be emitted. This only affects
   * new built objects, and does not alter existing objects! The default mode is
   * {@link #DEFAULT_MODE}.
   * 
   * @param eMode
   *        The new mode to set. May not be <code>null</code>.
   */
  public static void setDefaultMode (@Nonnull final EMode eMode)
  {
    ValueEnforcer.notNull (eMode, "mode"); //$NON-NLS-1$
    s_eDefaultMode = eMode;
    s_aLogger.info ("Default <style> mode set to " + eMode); //$NON-NLS-1$
  }

  /**
   * @return The default mode to emit style content. Never <code>null</code>.
   */
  @Nonnull
  public static EMode getDefaultMode ()
  {
    return s_eDefaultMode;
  }
}
