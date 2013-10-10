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
package com.phloc.html.meta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.lang.EnumHelper;

/**
 * A class with a set of predefined meta tag names.
 * 
 * @author Philip Helger
 */
public enum EStandardMetaElement implements IMetaElementDeclaration
{
  // Source: http://vancouver-webpages.com/META/metatags.detail.html
  CONTENT_TYPE ("Content-Type", true),
  CONTENT_SCRIPT_TYPE ("Content-Script-Type", true),
  CONTENT_STYLE_TYPE ("Content-Style-Type", true),
  CONTENT_DISPOSITION ("Content-Disposition", true),
  EXPIRES ("Expires", true),
  PRAGMA ("Pragma", true),
  DEFAULT_STYLE ("Default-Style", true),
  CONTENT_LANGUAGE ("Content-Language", true),
  REFRESH ("Refresh", true),
  WINDOW_TARGET ("Window-target", true),
  EXT_CACHE ("Ext-cache", true),
  SET_COOKIE ("Set-Cookie", true),
  PICS_LABEL ("PICS-Label", true),
  CACHE_CONTROL ("Cache-Control", true),
  VARY ("Vary", true),
  LOTUS ("Lotus", true),
  X_UA_COMPATIBLE ("X-UA-Compatible", true),
  // Non HTTP equiv:
  DESCRIPTION ("Description", false),
  KEYWORDS ("Keywords", false),
  AUTHOR ("Author", false),
  COPYRIGHT ("Copyright", false);

  private final String m_sName;
  private final boolean m_bIsHttpEquiv;

  private EStandardMetaElement (@Nonnull @Nonempty final String sName, final boolean bIsHttpEquiv)
  {
    m_sName = sName;
    m_bIsHttpEquiv = bIsHttpEquiv;
  }

  /**
   * Get the meta tag name.
   * 
   * @return the meta tag name
   */
  @Nonnull
  @Nonempty
  public String getName ()
  {
    return m_sName;
  }

  /*
   * All standard meta tags have no scheme! Always <code>null</code>.
   */
  @Nullable
  public String getScheme ()
  {
    return null;
  }

  public boolean isHttpEquiv ()
  {
    return m_bIsHttpEquiv;
  }

  @Nonnull
  public IMetaElement getAsMetaElement (final String sContent)
  {
    return new MetaElement (this, sContent);
  }

  @Nullable
  public static EStandardMetaElement getStandardElementOfNameOrNull (@Nullable final String sName)
  {
    return EnumHelper.getFromNameOrNull (EStandardMetaElement.class, sName);
  }

  @Nullable
  public static EStandardMetaElement getStandardElementOfNameOrNullIgnoreCase (@Nullable final String sName)
  {
    return EnumHelper.getFromNameCaseInsensitiveOrNull (EStandardMetaElement.class, sName);
  }

  public static boolean isHttpEquivMetaElement (@Nullable final String sName)
  {
    final EStandardMetaElement eStdMetaTag = getStandardElementOfNameOrNullIgnoreCase (sName);
    return eStdMetaTag != null && eStdMetaTag.isHttpEquiv ();
  }
}
