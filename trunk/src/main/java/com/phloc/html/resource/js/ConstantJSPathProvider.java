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
package com.phloc.html.resource.js;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

public final class ConstantJSPathProvider implements IJSPathProvider
{
  private final String m_sPath;
  private final boolean m_bBundle;

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath)
  {
    this (sPath, true);
  }

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath, final boolean bCanBeBundled)
  {
    if (StringHelper.hasNoText (sPath))
      throw new IllegalArgumentException ("path is empty");
    if (!JSFilenameHelper.isJSFilename (sPath))
      throw new IllegalArgumentException ("path");
    m_sPath = sPath;
    m_bBundle = bCanBeBundled;
  }

  @Nonnull
  @Nonempty
  public String getJSItemPath (final boolean bRegular)
  {
    return bRegular ? m_sPath : JSFilenameHelper.getMinifiedJSPath (m_sPath);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("path", m_sPath).toString ();
  }

  @Override
  public boolean canBeBundled ()
  {
    return m_bBundle;
  }
}
