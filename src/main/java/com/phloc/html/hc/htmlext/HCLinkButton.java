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
package com.phloc.html.hc.htmlext;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.DevelopersNote;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.hc.html.HCButton;
import com.phloc.html.js.builder.IJSStatement;
import com.phloc.html.js.builder.html.JSHtml;

@DevelopersNote ("Do not use for pDAF3 - missing CSS information. Use HCP3Button instead!")
public class HCLinkButton extends HCButton
{
  public HCLinkButton (final String sLabel, @Nonnull final ISimpleURL aURL)
  {
    super (sLabel, JSHtml.windowLocationHref ().assign (aURL.getAsString ()));
  }

  public HCLinkButton (final String sLabel, final IJSStatement aJS)
  {
    super (sLabel, aJS);
  }
}
