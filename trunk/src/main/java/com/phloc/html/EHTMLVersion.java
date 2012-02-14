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
package com.phloc.html;

import javax.annotation.Nonnull;

import com.phloc.commons.microdom.IMicroDocumentType;

/**
 * Enum of supported HTML versions.
 * 
 * @author philip
 */
public enum EHTMLVersion
{
  XHTML10_STRICT
  {
    @Override
    @Nonnull
    public IMicroDocumentType getDocType ()
    {
      return CHTMLDocTypes.DOCTYPE_XHTML10_STRICT;
    }
  },
  XHTML10_TRANSITIONAL
  {
    @Override
    @Nonnull
    public IMicroDocumentType getDocType ()
    {
      return CHTMLDocTypes.DOCTYPE_XHTML10_TRANS;
    }
  },
  XHTML11
  {
    @Override
    @Nonnull
    public IMicroDocumentType getDocType ()
    {
      return CHTMLDocTypes.DOCTYPE_XHTML11;
    }
  },
  HTML5
  {
    @Override
    @Nonnull
    public IMicroDocumentType getDocType ()
    {
      return CHTMLDocTypes.DOCTYPE_HTML5;
    }
  };

  /**
   * XHTML 1.1 is the default HTML version to use
   */
  @Nonnull
  public static final EHTMLVersion DEFAULT = XHTML11;

  /**
   * @return The document type matching this HTML version
   */
  @Nonnull
  public abstract IMicroDocumentType getDocType ();

  public boolean isPriorToHTML5 ()
  {
    return !isAtLeastHTML5 ();
  }

  public boolean isAtLeastHTML5 ()
  {
    return this == HTML5;
  }
}
