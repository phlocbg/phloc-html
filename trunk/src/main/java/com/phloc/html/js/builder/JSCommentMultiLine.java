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

import com.phloc.commons.string.ToStringGenerator;

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

  /** The @-return tag part. */
  private JSCommentPart m_aReturn;

  /** The @-deprecated tag */
  private JSCommentPart m_aDeprecated;

  public JSCommentMultiLine ()
  {}

  @Override
  @Nonnull
  public JSCommentMultiLine append (final Object aObj)
  {
    add (aObj);
    return this;
  }

  /**
   * Append a text to a @-param tag to the JSDoc
   */
  @Nonnull
  public JSCommentPart addParam (final String sParam)
  {
    JSCommentPart p = m_aParams.get (sParam);
    if (p == null)
    {
      p = new JSCommentPart ();
      m_aParams.put (sParam, p);
    }
    return p;
  }

  /**
   * Append a text to an @-param tag.
   */
  @Nonnull
  public JSCommentPart addParam (@Nonnull final JSVar aParam)
  {
    return addParam (aParam.name ());
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
   * add an @-deprecated tag to the JSDoc, with the associated message.
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
  public Map <String, String> addXdoclet (final String sName)
  {
    Map <String, String> p = m_aXdoclets.get (sName);
    if (p == null)
    {
      p = new HashMap <String, String> ();
      m_aXdoclets.put (sName, p);
    }
    return p;
  }

  /**
   * add an xdoclet.
   */
  @Nonnull
  public Map <String, String> addXdoclet (final String sName, @Nonnull final Map <String, String> aAttributes)
  {
    final Map <String, String> p = addXdoclet (sName);
    p.putAll (aAttributes);
    return p;
  }

  /**
   * add an xdoclet.
   */
  public Map <String, String> addXdoclet (final String sName, final String sAttributeName, final String sAttributeValue)
  {
    final Map <String, String> p = addXdoclet (sName);
    p.put (sAttributeName, sAttributeValue);
    return p;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    if (!f.generateComments ())
      return;

    f.plain ("/**").nlFix ();

    // Main content start
    format (f, " * ");

    if (!m_aParams.isEmpty () || m_aReturn != null || m_aDeprecated != null || !m_aXdoclets.isEmpty ())
    {
      f.plain (" * ").nlFix ();
      for (final Map.Entry <String, JSCommentPart> e : m_aParams.entrySet ())
      {
        f.plain (" * @param ").plain (e.getKey ()).nlFix ();
        e.getValue ().format (f, INDENT);
      }
      if (m_aReturn != null)
      {
        f.plain (" * @return").nlFix ();
        m_aReturn.format (f, INDENT);
      }
      if (m_aDeprecated != null)
      {
        f.plain (" * @deprecated").nlFix ();
        m_aDeprecated.format (f, INDENT);
      }
      for (final Map.Entry <String, Map <String, String>> e : m_aXdoclets.entrySet ())
      {
        f.plain (" * @").plain (e.getKey ());
        if (e.getValue () != null)
        {
          for (final Map.Entry <String, String> a : e.getValue ().entrySet ())
            f.plain (" ").plain (a.getKey ()).plain ("= \"").plain (a.getValue ()).plain ("\"");
        }
        f.nlFix ();
      }
    }
    f.plain (" */").nlFix ();
  }

  @Nonnull
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("params", m_aParams)
                                       .append ("xdoclets", m_aXdoclets)
                                       .append ("return", m_aReturn)
                                       .append ("deprecated", m_aDeprecated)
                                       .toString ();
  }
}
