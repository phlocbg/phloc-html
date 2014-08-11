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
package com.phloc.html.js.builder;

import java.io.Writer;

import javax.annotation.Nonnull;
import javax.annotation.WillClose;
import javax.annotation.WillNotClose;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.ValueEnforcer;
import com.phloc.commons.io.streams.NonBlockingStringWriter;
import com.phloc.commons.io.streams.StreamUtils;
import com.phloc.html.js.IJSCodeProvider;

/**
 * Helper class to get the textual representation of JSDOM objects
 * 
 * @author Philip Helger
 */
@NotThreadSafe
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

  /**
   * This is a wrapper around {@link #setIndentAndAlign(boolean)},
   * {@link #setGenerateTypeNames(boolean)} and
   * {@link #setGenerateComments(boolean)}
   * 
   * @param bMinimumCodeSize
   *        true for minimum code size
   */
  public static void setMinimumCodeSize (final boolean bMinimumCodeSize)
  {
    setIndentAndAlign (!bMinimumCodeSize);
    setGenerateTypeNames (!bMinimumCodeSize);
    setGenerateComments (!bMinimumCodeSize);
  }

  @SuppressWarnings ("resource")
  @Nonnull
  public static JSFormatter createFormatter (@Nonnull @WillNotClose final Writer aWriter)
  {
    return new JSFormatter (aWriter).indentAndAlign (s_bIndentAndAlign)
                                    .generateTypeNames (s_bGenerateTypeNames)
                                    .generateComments (s_bGenerateComments);
  }

  public static void writeGeneratable (@Nonnull final IJSGeneratable aGeneratable,
                                       @Nonnull @WillClose final Writer aWriter)
  {
    final JSFormatter aFormatter = createFormatter (aWriter);
    try
    {
      aFormatter.generatable (aGeneratable);
    }
    finally
    {
      StreamUtils.close (aFormatter);
    }
  }

  public static void writeDeclaration (@Nonnull final IJSDeclaration aDeclaration,
                                       @Nonnull @WillClose final Writer aWriter)
  {
    final JSFormatter aFormatter = createFormatter (aWriter);
    try
    {
      aFormatter.decl (aDeclaration);
    }
    finally
    {
      StreamUtils.close (aFormatter);
    }
  }

  public static void writeStatement (@Nonnull final IJSStatement aStatement, @Nonnull @WillClose final Writer aWriter)
  {
    final JSFormatter aFormatter = createFormatter (aWriter);
    try
    {
      aFormatter.stmt (aStatement);
    }
    finally
    {
      StreamUtils.close (aFormatter);
    }
  }

  public static void writePackage (@Nonnull final JSPackage aPackage, @Nonnull @WillClose final Writer aWriter)
  {
    final JSFormatter aFormatter = createFormatter (aWriter);
    try
    {
      // for all declarations in the current package
      for (final IJSCodeProvider aObj : aPackage.members ())
        if (aObj instanceof IJSDeclaration)
          aFormatter.decl ((IJSDeclaration) aObj);
        else
          aFormatter.stmt ((IJSStatement) aObj);
    }
    finally
    {
      StreamUtils.close (aFormatter);
    }
  }

  @Nonnull
  public static String getAsString (@Nonnull final IJSGeneratable aGeneratable)
  {
    ValueEnforcer.notNull (aGeneratable, "Generatable");
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeGeneratable (aGeneratable, aSW);
    return aSW.getAsString ().trim ();
  }

  @Nonnull
  public static String getAsString (@Nonnull final IJSDeclaration aDecl)
  {
    ValueEnforcer.notNull (aDecl, "Decl");
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeDeclaration (aDecl, aSW);
    return aSW.getAsString ().trim ();
  }

  @Nonnull
  public static String getAsString (@Nonnull final IJSStatement aStatement)
  {
    ValueEnforcer.notNull (aStatement, "Statement");
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeStatement (aStatement, aSW);
    return aSW.getAsString ().trim ();
  }

  @Nonnull
  public static String getAsString (@Nonnull final JSPackage aPackage)
  {
    ValueEnforcer.notNull (aPackage, "Package");
    if (aPackage.memberCount () == 0)
      return "";

    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writePackage (aPackage, aSW);
    return aSW.getAsString ().trim ();
  }
}
