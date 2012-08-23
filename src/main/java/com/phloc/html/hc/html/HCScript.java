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

import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNodeWithChildren;
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElement;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.builder.IJSBuilderCodeProvider;

/**
 * This class represents an HTML &lt;script&gt; element with inline content.
 * 
 * @author philip
 * @see HCScriptFile
 */
public final class HCScript extends AbstractHCElement <HCScript>
{
  public static final IMimeType DEFAULT_TYPE = CMimeType.TEXT_JAVASCRIPT;
  public static final boolean DEFAULT_USE_CDATA_MASKING = false;

  private IMimeType m_aType = DEFAULT_TYPE;
  private final String m_sContent;

  public HCScript (@Nonnull final IJSBuilderCodeProvider aProvider)
  {
    super (EHTMLElement.SCRIPT);
    m_sContent = aProvider.getJSCode ();
  }

  @Deprecated
  public HCScript (@Nonnull final IJSCodeProvider aProvider)
  {
    super (EHTMLElement.SCRIPT);
    m_sContent = aProvider.getJSCode ();
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

  public static void setInlineScript (@Nonnull final IMicroNodeWithChildren aElement, @Nullable final String sContent)
  {
    setInlineScript (aElement, sContent, DEFAULT_USE_CDATA_MASKING);
  }

  public static void setInlineScript (@Nonnull final IMicroNodeWithChildren aElement,
                                      @Nullable final String sContent,
                                      final boolean bUseCDATAMasking)
  {
    if (StringHelper.hasText (sContent))
      if (bUseCDATAMasking)
      {
        // Tested OK with FF6, Opera11, Chrome13, IE8, IE9
        /**
         * <pre>
         * //<![CDATA[
         * my script bla//]]>
         * </pre>
         */
        aElement.appendText ("//");
        aElement.appendCDATA ("\n" + sContent + "//");
      }
      else
      {
        /**
         * <pre>
         * <script>
         * my script bla
         * //</script>
         * </pre>
         */
        if (StringHelper.endsWith (sContent, '\n'))
          aElement.appendComment ("\n" + sContent + "//");
        else
          aElement.appendComment ("\n" + sContent + "\n//");
      }
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    setInlineScript (aElement, m_sContent);
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
}
