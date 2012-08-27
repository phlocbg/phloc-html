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

import java.io.Writer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.io.streams.NonBlockingStringWriter;
import com.phloc.commons.io.streams.StreamUtils;

/**
 * Helper class to get the textual representation of JSDOM objects
 * 
 * @author philip
 */
@Immutable
public final class JSPrinter
{
  public static final boolean DEFAULT_INDENT_AND_ALIGN = false;
  public static final boolean DEFAULT_GENERATE_TYPE_NAMES = false;
  public static final boolean DEFAULT_GENERATE_COMMENTS = true;
  private static boolean s_bIndentAndAlign = DEFAULT_INDENT_AND_ALIGN;
  private static boolean s_bGenerateTypeNames = DEFAULT_GENERATE_TYPE_NAMES;
  private static boolean s_bGenerateComments = DEFAULT_GENERATE_COMMENTS;

  private JSPrinter ()
  {}

  public static void setToDefault ()
  {
    s_bIndentAndAlign = DEFAULT_INDENT_AND_ALIGN;
    s_bGenerateTypeNames = DEFAULT_GENERATE_TYPE_NAMES;
    s_bGenerateComments = DEFAULT_GENERATE_COMMENTS;
  }

  public static void setIndentAndAlign (final boolean bIndentAndAlign)
  {
    s_bIndentAndAlign = bIndentAndAlign;
  }

  public static boolean isIndentAndAlign ()
  {
    return s_bIndentAndAlign;
  }

  public static void setGenerateTypeNames (final boolean bGenerateTypeNames)
  {
    s_bGenerateTypeNames = bGenerateTypeNames;
  }

  public static boolean isGenerateTypeNames ()
  {
    return s_bGenerateTypeNames;
  }

  public static void setGenerateComments (final boolean bGenerateComments)
  {
    s_bGenerateComments = bGenerateComments;
  }

  public static boolean isGenerateComments ()
  {
    return s_bGenerateComments;
  }

  public static void setMinimumCodeSize (final boolean bMinimumCodeSize)
  {
    setIndentAndAlign (!bMinimumCodeSize);
    setGenerateTypeNames (!bMinimumCodeSize);
    setGenerateComments (!bMinimumCodeSize);
  }

  @Nonnull
  public static JSFormatter createFormatter (@Nonnull final Writer w)
  {
    return new JSFormatter (w).indentAndAlign (s_bIndentAndAlign)
                              .generateTypeNames (s_bGenerateTypeNames)
                              .generateComments (s_bGenerateComments);
  }

  public static void writeExpression (@Nonnull final IJSExpression aExpression, @Nonnull final Writer w)
  {
    final JSFormatter f = createFormatter (w);
    try
    {
      f.generatable (aExpression);
    }
    finally
    {
      StreamUtils.close (f);
    }
  }

  public static void writeDeclaration (@Nonnull final IJSDeclaration aDeclaration, @Nonnull final Writer w)
  {
    final JSFormatter f = createFormatter (w);
    try
    {
      f.decl (aDeclaration);
    }
    finally
    {
      StreamUtils.close (f);
    }
  }

  public static void writeStatement (@Nonnull final IJSStatement aStatement, @Nonnull final Writer w)
  {
    final JSFormatter f = createFormatter (w);
    try
    {
      f.stmt (aStatement);
    }
    finally
    {
      StreamUtils.close (f);
    }
  }

  public static void writePackage (@Nonnull final JSPackage aPackage, @Nonnull final Writer w)
  {
    final JSFormatter f = createFormatter (w);
    try
    {
      // for all declarations in the current package
      for (final Object aObj : aPackage.members ())
        if (aObj instanceof IJSDeclaration)
          f.decl ((IJSDeclaration) aObj);
        else
          f.stmt ((IJSStatement) aObj);
    }
    finally
    {
      StreamUtils.close (f);
    }
  }

  @Nullable
  public static String getAsString (@Nonnull final IJSExpression aExpression)
  {
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeExpression (aExpression, aSW);
    return aSW.getAsString ();
  }

  @Nullable
  public static String getAsString (@Nonnull final IJSDeclaration aDecl)
  {
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeDeclaration (aDecl, aSW);
    return aSW.getAsString ();
  }

  @Nullable
  public static String getAsString (@Nonnull final IJSStatement aStatement)
  {
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeStatement (aStatement, aSW);
    return aSW.getAsString ();
  }

  @Nullable
  public static String getAsString (@Nonnull final JSPackage aPackage)
  {
    if (aPackage.memberCount () == 0)
      return null;

    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writePackage (aPackage, aSW);
    return aSW.getAsString ();
  }
}
