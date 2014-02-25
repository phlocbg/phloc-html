/**
 * Copyright (C) 2006-2014 phloc systems
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
package com.phloc.html.entities;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.exceptions.InitializationException;
import com.phloc.commons.io.resource.ClassPathResource;
import com.phloc.commons.microdom.reader.XMLMapHandler;
import com.phloc.commons.string.StringHelper;

/**
 * Contains a list of known HTML entities and their character representation.
 * 
 * @author Philip Helger
 */
@Immutable
public final class HTMLEntities
{
  private static final String HTML_ENTITY_MAPPING_FILENAME = "codelists/html-entity-mapping.xml";
  private static final Map <String, String> s_aEntityToChar = new HashMap <String, String> ();
  private static final Map <String, String> s_aCharToEntity;

  static
  {
    if (XMLMapHandler.readMap (new ClassPathResource (HTML_ENTITY_MAPPING_FILENAME), s_aEntityToChar).isFailure ())
      throw new InitializationException ("Failed to init HTML entity mapping file '" +
                                         HTML_ENTITY_MAPPING_FILENAME +
                                         "'");

    s_aCharToEntity = ContainerHelper.getSwappedKeyValues (s_aEntityToChar);
    if (s_aEntityToChar.size () != s_aCharToEntity.size ())
      throw new InitializationException ("Internal error initializing char to entity mapping");
  }

  private HTMLEntities ()
  {}

  /**
   * Get the HTML entity translation table. Key is the entity reference (e.g.
   * <i>&amp;quot;</i>) and the value is the replacement char (e.g
   * <i>&quot;</i>).
   * 
   * @return a clone of the translation table so you can alter it without
   *         affecting the global translation table!
   */
  @Nonnull
  @ReturnsMutableCopy
  public static Map <String, String> getWriteableTransTable ()
  {
    return ContainerHelper.newMap (s_aEntityToChar);
  }

  @Nullable
  public static String getCharOfEntity (@Nonnull final IHTMLEntity eEntity)
  {
    return getCharOfEntity (eEntity.getEntityReference ());
  }

  @Nullable
  public static String getCharOfEntity (@Nullable final String sEntityReference)
  {
    return s_aEntityToChar.get (sEntityReference);
  }

  @Nullable
  public static String getEntityOfChar (final char cChar)
  {
    return getEntityOfChar (Character.toString (cChar));
  }

  @Nullable
  public static String getEntityOfChar (@Nullable final String sChar)
  {
    return s_aCharToEntity.get (sChar);
  }

  @Nullable
  public static String htmlEscape (@Nullable final String sInput)
  {
    if (StringHelper.hasNoText (sInput))
      return null;

    final StringBuilder aSB = new StringBuilder (sInput.length () * 2);
    for (final char c : sInput.toCharArray ())
    {
      final String sEntity = getEntityOfChar (c);
      if (sEntity != null)
        aSB.append (sEntity);
      else
        aSB.append (c);
    }
    return aSB.toString ();
  }
}
