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
package com.phloc.html.js.builder;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

/**
 * JSDoc comment.
 * 
 * @author philip
 */
public class JSCommentMultiLine extends JSCommentPart implements IJSGeneratable
{
  private static final String INDENT = " *     ";

  /** list of @-param tags */
  private final Map <String, JSCommentPart> m_aParams = new HashMap <String, JSCommentPart> ();

  /** list of xdoclets */
  private final Map <String, Map <String, String>> m_aXdoclets = new HashMap <String, Map <String, String>> ();

  /**
   * The @-return tag part.
   */
  private JSCommentPart m_aReturn;

  /** The @-deprecated tag */
  private JSCommentPart m_aDeprecated;

  public JSCommentMultiLine ()
  {}

  @Override
  @Nonnull
  public JSCommentMultiLine append (final Object o)
  {
    add (o);
    return this;
  }

  /**
   * Append a text to a @param tag to the javadoc
   */
  @Nonnull
  public JSCommentPart addParam (final String param)
  {
    JSCommentPart p = m_aParams.get (param);
    if (p == null)
    {
      p = new JSCommentPart ();
      m_aParams.put (param, p);
    }
    return p;
  }

  /**
   * Append a text to an @param tag.
   */
  @Nonnull
  public JSCommentPart addParam (final JSVar param)
  {
    return addParam (param.name ());
  }

  /**
   * Appends a text to @return tag.
   */
  @Nonnull
  public JSCommentPart addReturn ()
  {
    if (m_aReturn == null)
      m_aReturn = new JSCommentPart ();
    return m_aReturn;
  }

  /**
   * add an @deprecated tag to the javadoc, with the associated message.
   */
  @Nonnull
  public JSCommentPart addDeprecated ()
  {
    if (m_aDeprecated == null)
      m_aDeprecated = new JSCommentPart ();
    return m_aDeprecated;
  }

  /**
   * add an xdoclet.
   */
  @Nonnull
  public Map <String, String> addXdoclet (final String name)
  {
    Map <String, String> p = m_aXdoclets.get (name);
    if (p == null)
    {
      p = new HashMap <String, String> ();
      m_aXdoclets.put (name, p);
    }
    return p;
  }

  /**
   * add an xdoclet.
   */
  @Nonnull
  public Map <String, String> addXdoclet (final String name, final Map <String, String> attributes)
  {
    final Map <String, String> p = addXdoclet (name);
    p.putAll (attributes);
    return p;
  }

  /**
   * add an xdoclet.
   */
  public Map <String, String> addXdoclet (final String name, final String attribute, final String value)
  {
    final Map <String, String> p = addXdoclet (name);
    p.put (attribute, value);
    return p;
  }

  public void generate (final JSFormatter f)
  {
    f.plain ("/**").nl ();

    // Main content
    format (f, " * ");

    if (!m_aParams.isEmpty () || m_aReturn != null || m_aDeprecated != null || !m_aXdoclets.isEmpty ())
    {
      f.plain (" * ").nl ();
      for (final Map.Entry <String, JSCommentPart> e : m_aParams.entrySet ())
      {
        f.plain (" * @param ").plain (e.getKey ()).nl ();
        e.getValue ().format (f, INDENT);
      }
      if (m_aReturn != null)
      {
        f.plain (" * @return").nl ();
        m_aReturn.format (f, INDENT);
      }
      if (m_aDeprecated != null)
      {
        f.plain (" * @deprecated").nl ();
        m_aDeprecated.format (f, INDENT);
      }
      for (final Map.Entry <String, Map <String, String>> e : m_aXdoclets.entrySet ())
      {
        f.plain (" * @").plain (e.getKey ());
        if (e.getValue () != null)
        {
          for (final Map.Entry <String, String> a : e.getValue ().entrySet ())
          {
            f.plain (" ").plain (a.getKey ()).plain ("= \"").plain (a.getValue ()).plain ("\"");
          }
        }
        f.nl ();
      }
    }
    f.plain (" */").nl ();
  }
}