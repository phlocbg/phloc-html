/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.phloc.html.js.builder;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

/**
 * JavaDoc comment.
 * <p>
 * A javadoc comment consists of multiple parts. There's the main part (that
 * comes the first in in the comment section), then the parameter parts
 * (@param), the return part (@return), and the throws parts (@throws). TODO: it
 * would be nice if we have JComment class and we can derive this class from
 * there.
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