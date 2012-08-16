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

import java.util.Set;

import javax.annotation.Nullable;

import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.StringHelper;

/**
 * Utility methods that convert arbitrary strings into JS identifiers.
 */
public class JSNameChecker
{
  /** All reserved keywords of Java. */
  private static Set <String> RESERVED_KEYWORDS;

  static
  {
    // see
    // https://developer.mozilla.org/en-US/docs/JavaScript/Reference/Reserved_Words
    RESERVED_KEYWORDS = ContainerHelper.newSet ("break",
                                                "case",
                                                "catch",
                                                "continue",
                                                "debugger",
                                                "default",
                                                "delete",
                                                "do",
                                                "else",
                                                "finally",
                                                "for",
                                                "function",
                                                "if",
                                                "in",
                                                "instanceof",
                                                "new",
                                                "return",
                                                "switch",
                                                "this",
                                                "throw",
                                                "try",
                                                "typeof",
                                                "var",
                                                "void",
                                                "while",
                                                "with",
                                                "class",
                                                "enum",
                                                "export",
                                                "extends",
                                                "import",
                                                "super",

                                                // technically these are not
                                                // reserved
                                                // words but they cannot be used
                                                // as
                                                // identifiers.
                                                "true",
                                                "false",
                                                "null",
                                                "undefined");
  }

  /**
   * Checks if a given string is usable as a Java identifier.
   */
  public static boolean isJSIdentifier (@Nullable final String s)
  {
    if (StringHelper.hasNoText (s))
      return false;

    if (RESERVED_KEYWORDS.contains (s))
      return false;

    if (!Character.isJavaIdentifierStart (s.charAt (0)))
      return false;

    for (int i = 1; i < s.length (); i++)
      if (!Character.isJavaIdentifierPart (s.charAt (i)))
        return false;

    return true;
  }

  /**
   * Checks if the given string is a valid fully qualified name.
   */
  public static boolean isFullyQualifiedClassName (final String s)
  {
    return isJavaPackageName (s);
  }

  /**
   * Checks if the given string is a valid Java package name.
   */
  public static boolean isJavaPackageName (final String ps)
  {
    String s = ps;
    while (s.length () != 0)
    {
      int idx = s.indexOf ('.');
      if (idx == -1)
        idx = s.length ();
      if (!isJSIdentifier (s.substring (0, idx)))
        return false;

      s = s.substring (idx);
      if (s.length () != 0)
        s = s.substring (1); // remove '.'
    }
    return true;
  }
}
