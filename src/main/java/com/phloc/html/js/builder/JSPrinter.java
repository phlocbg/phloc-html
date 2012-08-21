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

import com.phloc.commons.io.streams.NonBlockingStringWriter;
import com.phloc.commons.io.streams.StreamUtils;

/**
 * Helper class to get the textual representation of JSDOM objects
 * 
 * @author philip
 */
public final class JSPrinter
{
  private JSPrinter ()
  {}

  public static void writeStatement (@Nonnull final IJSStatement aStatement, @Nonnull final Writer w)
  {
    final JSFormatter f = new JSFormatter (w);
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
    final JSFormatter f = new JSFormatter (w);
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
  public static String getAsString (@Nonnull final JSPackage aPackage)
  {
    if (aPackage.memberCount () == 0)
      return null;

    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writePackage (aPackage, aSW);
    return aSW.getAsString ();
  }

  @Nullable
  public static String getAsString (@Nonnull final IJSStatement aStatement)
  {
    final NonBlockingStringWriter aSW = new NonBlockingStringWriter ();
    writeStatement (aStatement, aSW);
    return aSW.getAsString ();
  }
}
