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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNodeWithChildren;
import com.phloc.commons.microdom.impl.MicroText;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.js.IJSCodeProvider;

/**
 * This class represents an HTML &lt;script&gt; element with inline content.
 * 
 * @author philip
 * @see HCScriptFile
 */
public final class HCScript extends AbstractHCElement <HCScript>
{
  public static enum EMode
  {
    /**
     * Emit JS code as plain text, but XML masked
     */
    PLAIN_TEXT,
    /**
     * Emit JS code as plain text, but without XML masking
     */
    PLAIN_TEXT_NO_ESCAPE,
    /**
     * Wrap the whole JS code in XML comments
     */
    WRAP_IN_COMMENT,
    /**
     * Wrap the whole JS code in an XML CDATA container
     */
    CDATA,
  }

  public static final IMimeType DEFAULT_TYPE = CMimeType.TEXT_JAVASCRIPT;
  public static final EMode DEFAULT_MODE = EMode.WRAP_IN_COMMENT;
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCScript.class);

  private static EMode s_eDefaultMode = DEFAULT_MODE;

  private IMimeType m_aType = DEFAULT_TYPE;
  private final String m_sContent;
  private EMode m_eMode = s_eDefaultMode;

  public HCScript (@Nonnull final IJSCodeProvider aProvider)
  {
    super (EHTMLElement.SCRIPT);
    m_sContent = aProvider.getJSCode ();
  }

  @DevelopersNote ("Handle with care!")
  public HCScript (@Nullable final String sJSCode)
  {
    super (EHTMLElement.SCRIPT);
    m_sContent = sJSCode;
  }

  @Nonnull
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public HCScript setType (@Nonnull final IMimeType aType)
  {
    if (aType == null)
      throw new NullPointerException ("type");
    m_aType = aType;
    return this;
  }

  @Nullable
  public String getJSContent ()
  {
    return m_sContent;
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
  protected boolean canConvertToNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    // Don't create script elements with empty content....
    return StringHelper.hasText (m_sContent);
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    setInlineScript (aElement, m_sContent, m_eMode);
  }

  @Nonnull
  public String getPlainText ()
  {
    return "";
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("type", m_aType)
                            .appendIfNotNull ("content", m_sContent)
                            .toString ();
  }

  public static void setDefaultMode (@Nonnull final EMode eMode)
  {
    if (eMode == null)
      throw new NullPointerException ("mode");
    s_eDefaultMode = eMode;
    s_aLogger.info ("Default <script> mode set to " + eMode);
  }

  @Nonnull
  public static EMode getDefaultMode ()
  {
    return s_eDefaultMode;
  }
}
