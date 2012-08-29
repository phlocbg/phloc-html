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

import java.io.IOException;
import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.ECSSVersion;
import com.phloc.css.decl.CSSDeclarationList;
import com.phloc.css.decl.CascadingStyleSheet;
import com.phloc.css.media.CSSMediaList;
import com.phloc.css.media.ECSSMedium;
import com.phloc.css.writer.CSSWriter;
import com.phloc.css.writer.CSSWriterSettings;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;
import com.phloc.html.hc.impl.HCTextNode;

/**
 * Represents an HTML &lt;style&gt; element
 * 
 * @author philip
 */
public final class HCStyle extends AbstractHCElementWithChildren <HCStyle>
{
  public static final IMimeType DEFAULT_TYPE = CMimeType.TEXT_CSS;
  public static final boolean DEFAULT_ESCAPE_TEXT = false;
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCStyle.class);

  private static boolean s_bDefaultEscapeText = DEFAULT_ESCAPE_TEXT;

  private IMimeType m_aType = DEFAULT_TYPE;
  private CSSMediaList m_aMediaList;

  public HCStyle ()
  {
    super (EHTMLElement.STYLE);
  }

  public HCStyle (@Nullable final String sStyle)
  {
    this ();
    addChild (sStyle);
  }

  @Deprecated
  public HCStyle (@Nonnull final CascadingStyleSheet aCSS,
                  @Nonnull final ECSSVersion eVersion,
                  final boolean bOptimizedOutput) throws IOException
  {
    this (new CSSWriter (eVersion, bOptimizedOutput).getCSSAsString (aCSS));
  }

  public HCStyle (@Nonnull final CascadingStyleSheet aCSS, @Nonnull final CSSWriterSettings aSettings) throws IOException
  {
    this (new CSSWriter (aSettings).getCSSAsString (aCSS));
  }

  public HCStyle (@Nonnull final CSSDeclarationList aCSS, @Nonnull final CSSWriterSettings aSettings) throws IOException
  {
    this (new CSSWriter (aSettings).getCSSAsString (aCSS));
  }

  @Override
  protected void beforeAddChild (@Nonnull final IHCBaseNode aChild)
  {
    if (!s_bDefaultEscapeText && aChild instanceof HCTextNode)
    {
      final HCTextNode aText = (HCTextNode) aChild;
      if (StringHelper.containsIgnoreCase (aText.getText (), "</style>", Locale.US))
        throw new IllegalArgumentException ("The style text contains a closing style tag!");

      // Do not escape style element text nodes!
      aText.setEscape (false);
    }
  }

  @Nonnull
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public HCStyle setType (@Nonnull final IMimeType aType)
  {
    if (aType == null)
      throw new NullPointerException ("type");
    m_aType = aType;
    return this;
  }

  @Nullable
  public CSSMediaList getMedia ()
  {
    return m_aMediaList;
  }

  @Nonnull
  public HCStyle setMedia (@Nullable final CSSMediaList aMediaList)
  {
    m_aMediaList = aMediaList;
    return this;
  }

  @Nonnull
  public HCStyle addMedium (@Nonnull final ECSSMedium eMedium)
  {
    if (m_aMediaList == null)
      m_aMediaList = new CSSMediaList ();
    m_aMediaList.addMedium (eMedium);
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    if (m_aMediaList != null)
      aElement.setAttribute (CHTMLAttributes.MEDIA, m_aMediaList.getMediaString ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("mediaList", m_aMediaList).toString ();
  }

  /**
   * Set whether the content of style elements should be escaped or not. This
   * only affects new built {@link HCStyle} objects, and does not alter existing
   * objects! By default escaping is disabled.
   * 
   * @param bEscapeText
   *        <code>true</code> to escape the text, <code>false</code> if not.
   */
  public static void setDefaultEscapeText (final boolean bEscapeText)
  {
    s_bDefaultEscapeText = bEscapeText;
    s_aLogger.info ("Default <style> text escaping set to " + bEscapeText);
  }

  public static boolean isDefaultEscapeText ()
  {
    return s_bDefaultEscapeText;
  }
}
