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
import com.phloc.commons.mime.CMimeType;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.js.IJSCodeProvider;

/**
 * A specialized form that adds the required attribute for handling file
 * uploads.
 * 
 * @author philip
 */
public final class HCForm_FileUpload extends HCForm
{
  public HCForm_FileUpload ()
  {}

  public HCForm_FileUpload (@Nonnull final ISimpleURL aAction)
  {
    super (aAction);
  }

  public HCForm_FileUpload (@Nullable final IJSCodeProvider aJSCodeProvder)
  {
    super (aJSCodeProvder);
  }

  @Nonnull
  public final IMimeType getEncType ()
  {
    return CMimeType.MULTIPART_FORMDATA;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.ENCTYPE, getEncType ().getAsString ());
  }
}