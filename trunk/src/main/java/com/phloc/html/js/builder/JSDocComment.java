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

/**
 * JavaDoc comment.
 * <p>
 * A javadoc comment consists of multiple parts. There's the main part (that
 * comes the first in in the comment section), then the parameter parts
 * (@param), the return part (@return), and the throws parts (@throws). TODO: it
 * would be nice if we have JComment class and we can derive this class from
 * there.
 */
public class JSDocComment extends JSCommentPart implements IJSGeneratable
{
  private static final String INDENT = " *     ";

  /** list of @param tags */
  private final Map <String, JSCommentPart> atParams = new HashMap <String, JSCommentPart> ();

  /** list of xdoclets */
  private final Map <String, Map <String, String>> atXdoclets = new HashMap <String, Map <String, String>> ();

  /**
   * The @return tag part.
   */
  private JSCommentPart atReturn;

  /** The @deprecated tag */
  private JSCommentPart atDeprecated;

  public JSDocComment ()
  {}

  @Override
  public JSDocComment append (final Object o)
  {
    add (o);
    return this;
  }

  /**
   * Append a text to a @param tag to the javadoc
   */
  public JSCommentPart addParam (final String param)
  {
    JSCommentPart p = atParams.get (param);
    if (p == null)
      atParams.put (param, p = new JSCommentPart ());
    return p;
  }

  /**
   * Append a text to an @param tag.
   */
  public JSCommentPart addParam (final JSVar param)
  {
    return addParam (param.name ());
  }

  /**
   * Appends a text to @return tag.
   */
  public JSCommentPart addReturn ()
  {
    if (atReturn == null)
      atReturn = new JSCommentPart ();
    return atReturn;
  }

  /**
   * add an @deprecated tag to the javadoc, with the associated message.
   */
  public JSCommentPart addDeprecated ()
  {
    if (atDeprecated == null)
      atDeprecated = new JSCommentPart ();
    return atDeprecated;
  }

  /**
   * add an xdoclet.
   */
  public Map <String, String> addXdoclet (final String name)
  {
    Map <String, String> p = atXdoclets.get (name);
    if (p == null)
      atXdoclets.put (name, p = new HashMap <String, String> ());
    return p;
  }

  /**
   * add an xdoclet.
   */
  public Map <String, String> addXdoclet (final String name, final Map <String, String> attributes)
  {
    Map <String, String> p = atXdoclets.get (name);
    if (p == null)
      atXdoclets.put (name, p = new HashMap <String, String> ());
    p.putAll (attributes);
    return p;
  }

  /**
   * add an xdoclet.
   */
  public Map <String, String> addXdoclet (final String name, final String attribute, final String value)
  {
    Map <String, String> p = atXdoclets.get (name);
    if (p == null)
      atXdoclets.put (name, p = new HashMap <String, String> ());
    p.put (attribute, value);
    return p;
  }

  public void generate (final JSFormatter f)
  {
    // I realized that we can't use StringTokenizer because
    // this will recognize multiple \n as one token.

    f.plain ("/**").nl ();

    format (f, " * ");

    f.plain (" * ").nl ();
    for (final Map.Entry <String, JSCommentPart> e : atParams.entrySet ())
    {
      f.plain (" * @param ").plain (e.getKey ()).nl ();
      e.getValue ().format (f, INDENT);
    }
    if (atReturn != null)
    {
      f.plain (" * @return").nl ();
      atReturn.format (f, INDENT);
    }
    if (atDeprecated != null)
    {
      f.plain (" * @deprecated").nl ();
      atDeprecated.format (f, INDENT);
    }
    for (final Map.Entry <String, Map <String, String>> e : atXdoclets.entrySet ())
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
    f.plain (" */").nl ();
  }
}
