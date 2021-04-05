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
package com.phloc.html.resource.js;

import javax.annotation.Nonnull;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * An implementation of {@link IJSPathProvider} using constant paths.
 *
 * @author Philip Helger
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
    this (sPath, bCanBeBundled ? JSFilenameHelper.getMinifiedJSPath (sPath) : sPath, bCanBeBundled);
  }

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath, @Nonnull @Nonempty final String sMinifiedPath)
  {
    this (sPath, sMinifiedPath, DEFAULT_CAN_BE_BUNDLED);
  }

  public ConstantJSPathProvider (@Nonnull @Nonempty final String sPath,
                                 @Nonnull @Nonempty final String sMinifiedPath,
                                 final boolean bCanBeBundled)
  {
    ValueEnforcer.notEmpty (sPath, "Path");
    if (!JSFilenameHelper.isJSFilename (sPath))
      throw new IllegalArgumentException ("path");
    ValueEnforcer.notEmpty (sMinifiedPath, "MinifiedPath");
    if (!JSFilenameHelper.isJSFilename (sMinifiedPath))
      throw new IllegalArgumentException ("minified path");
    this.m_sPath = sPath;
    this.m_sMinifiedPath = sMinifiedPath;
    this.m_bCanBeBundled = bCanBeBundled;
  }

  @Override
  @Nonnull
  @Nonempty
  public String getJSItemPath (final boolean bRegular)
  {
    return bRegular ? this.m_sPath : this.m_sMinifiedPath;
  }

  @Nonnull
  @Nonempty
  public String getJSItemPathRegular ()
  {
    return this.m_sPath;
  }

  @Nonnull
  @Nonempty
  public String getJSItemPathMinified ()
  {
    return this.m_sMinifiedPath;
  }

  @Override
  public boolean canBeBundled ()
  {
    return this.m_bCanBeBundled;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof ConstantJSPathProvider))
      return false;
    final ConstantJSPathProvider rhs = (ConstantJSPathProvider) o;
    return this.m_sPath.equals (rhs.m_sPath) &&
           this.m_sMinifiedPath.equals (rhs.m_sMinifiedPath) &&
           this.m_bCanBeBundled == rhs.m_bCanBeBundled;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (this.m_sPath)
                                       .append (this.m_sMinifiedPath)
                                       .append (this.m_bCanBeBundled)
                                       .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("path", this.m_sPath)
                                       .append ("minifiedPath", this.m_sMinifiedPath)
                                       .append ("canBeBundled", this.m_bCanBeBundled)
                                       .toString ();
  }
}
