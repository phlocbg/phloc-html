/**
 * Copyright (C) 2006-2013 phloc systems
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
package com.phloc.html.resource.css;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.css.CSSFilenameHelper;

/**
 * Implementation of {@link ICSSPathProvider} with constant paths.
 * 
 * @author Philip Helger
 */
public final class ConstantCSSPathProvider implements ICSSPathProvider
{
  private final String m_sPath;
  private final String m_sMinifiedPath;

  public ConstantCSSPathProvider (@Nonnull @Nonempty final String sPath)
  {
    this (sPath, CSSFilenameHelper.getMinifiedCSSFilename (sPath));
  }

  public ConstantCSSPathProvider (@Nonnull @Nonempty final String sPath, @Nonnull @Nonempty final String sMinifiedPath)
  {
    if (StringHelper.hasNoText (sPath))
      throw new IllegalArgumentException ("path is empty");
    if (!CSSFilenameHelper.isCSSFilename (sPath))
      throw new IllegalArgumentException ("path");
    if (StringHelper.hasNoText (sMinifiedPath))
      throw new IllegalArgumentException ("minified path is empty");
    if (!CSSFilenameHelper.isCSSFilename (sMinifiedPath))
      throw new IllegalArgumentException ("minified path");
    m_sPath = sPath;
    m_sMinifiedPath = sMinifiedPath;
  }

  @Nonnull
  @Nonempty
  public String getCSSItemPath (final boolean bRegular)
  {
    return bRegular ? m_sPath : m_sMinifiedPath;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof ConstantCSSPathProvider))
      return false;
    final ConstantCSSPathProvider rhs = (ConstantCSSPathProvider) o;
    return m_sPath.equals (rhs.m_sPath) && m_sMinifiedPath.equals (rhs.m_sMinifiedPath);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sPath).append (m_sMinifiedPath).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("path", m_sPath).append ("minifiedPath", m_sMinifiedPath).toString ();
  }
}
