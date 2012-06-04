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
package com.phloc.html.js.provider;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.marshal.JSMarshaller;

@Immutable
public final class JSCodeWrapper
{
  private JSCodeWrapper ()
  {}

  public static void appendJSParameters (@Nonnull final CollectingJSCodeProvider aProvider,
                                         @Nullable final Object... aArgs)
  {
    aProvider.append ('(');
    if (aArgs != null)
    {
      int nIndex = 0;
      for (final Object aArg : aArgs)
      {
        if (nIndex++ > 0)
          aProvider.append (',');
        aProvider.append (JSMarshaller.objectToJSString (aArg));
      }
    }
    aProvider.append (')');
  }

  /**
   * Get the JS function call with all parameters masked correctly.<br>
   * Hint: Use {@link CJSCode#JS_THIS} to pass in <code>this</code>
   * 
   * @param sFunction
   *        The name of the function to call.
   * @param aArgs
   *        The optional set of parameters.
   * @return The function without a leading semicolon
   */
  @Nonnull
  public static CollectingJSCodeProvider getFunctionCall (@Nonnull final String sFunction,
                                                          @Nullable final Object... aArgs)
  {
    // FIXME: may be valid for jQuery functions of the form
    // '$(".pdaf_tooltip").some.method'
    if (sFunction.indexOf ('(') >= 0)
      throw new IllegalArgumentException ("Passed function name contains an invalid character! [" + sFunction + "]");

    final CollectingJSCodeProvider aProvider = new CollectingJSCodeProvider ();
    aProvider.append (sFunction);
    appendJSParameters (aProvider, aArgs);
    return aProvider;
  }

  @Nonnull
  public static CollectingJSCodeProvider getVariableAssignment (@Nonnull @Nonempty final String sName,
                                                                @Nullable final Object aInitialValue)
  {
    if (StringHelper.hasNoText (sName))
      throw new IllegalArgumentException ("name");

    final CollectingJSCodeProvider aSB = new CollectingJSCodeProvider ();
    aSB.append ("var ").append (sName);
    if (aInitialValue != null)
    {
      aSB.append ('=').append (JSMarshaller.objectToJSString (aInitialValue));
    }
    aSB.appendSemicolon ();
    return aSB;
  }

  @Nonnull
  public static CollectingJSCodeProvider getInlineFunction (@Nonnull final IJSCodeProvider aImplementation,
                                                            @Nullable final String... sParameters)
  {
    if (aImplementation == null)
      throw new NullPointerException ("implementation");

    final CollectingJSCodeProvider aSB = new CollectingJSCodeProvider ();
    aSB.append ("function(" + StringHelper.implode (",", sParameters) + "){").append (aImplementation).append ("}");
    return aSB;
  }
}
