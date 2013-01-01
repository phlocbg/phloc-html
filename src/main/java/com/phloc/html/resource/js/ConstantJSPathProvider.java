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
package com.phloc.html.resource.js;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

/**
 * An implementation of {@link IJSPathProvider} using constant paths.
 * 
 * @author philip
 */
public final class ConstantJSPathProvider implements IJSPathProvider
{
  public static final boolean DEFAULT_CAN_BE_BUNDLED = true;

  private final String m_sPath;
  private final String m_sMinifiedPath;
  private final boolean m_bCanBeBundled;

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath)
  {
    this (sPath, DEFAULT_CAN_BE_BUNDLED);
  }

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath, final boolean bCanBeBundled)
  {
    this (sPath, JSFilenameHelper.getMinifiedJSPath (sPath), bCanBeBundled);
  }

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath, @Nonnull @Nonempty final String sMinifiedPath)
  {
    this (sPath, sMinifiedPath, DEFAULT_CAN_BE_BUNDLED);
  }

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath,
                                 @Nonnull @Nonempty final String sMinifiedPath,
                                 final boolean bCanBeBundled)
  {
    if (StringHelper.hasNoText (sPath))
      throw new IllegalArgumentException ("path is empty");
    if (!JSFilenameHelper.isJSFilename (sPath))
      throw new IllegalArgumentException ("path");
    if (StringHelper.hasNoText (sMinifiedPath))
      throw new IllegalArgumentException ("minified path is empty");
    if (!JSFilenameHelper.isJSFilename (sMinifiedPath))
      throw new IllegalArgumentException ("minified path");
    m_sPath = sPath;
    m_sMinifiedPath = sMinifiedPath;
    m_bCanBeBundled = bCanBeBundled;
  }

  @Nonnull
  @Nonempty
  public String getJSItemPath (final boolean bRegular)
  {
    return bRegular ? m_sPath : m_sMinifiedPath;
  }

  @Nonnull
  @Nonempty
  public String getJSItemPathRegular ()
  {
    return m_sPath;
  }

  @Nonnull
  @Nonempty
  public String getJSItemPathMinified ()
  {
    return m_sMinifiedPath;
  }

  @Override
  public boolean canBeBundled ()
  {
    return m_bCanBeBundled;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof ConstantJSPathProvider))
      return false;
    final ConstantJSPathProvider rhs = (ConstantJSPathProvider) o;
    return m_sPath.equals (rhs.m_sPath) &&
           m_sMinifiedPath.equals (rhs.m_sMinifiedPath) &&
           m_bCanBeBundled == rhs.m_bCanBeBundled;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sPath)
                                       .append (m_sMinifiedPath)
                                       .append (m_bCanBeBundled)
                                       .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("path", m_sPath)
                                       .append ("minifiedPath", m_sMinifiedPath)
                                       .append ("canBeBundled", m_bCanBeBundled)
                                       .toString ();
  }
}
