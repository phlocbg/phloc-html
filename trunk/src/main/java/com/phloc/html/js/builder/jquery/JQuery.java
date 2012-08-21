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
package com.phloc.html.js.builder.jquery;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.js.builder.JSFunction;
import com.phloc.html.js.builder.JSPackage;

/**
 * Wrapper around jQuery to allow for easy function calls
 * 
 * @author philip
 */
public class JQuery
{
  private JQuery ()
  {}

  @Nonnull
  public static JSFunction jQuery ()
  {
    return JSPackage.functionRef ("$");
  }

  @Nonnull
  public static JQueryInvocation idRef (@Nonnull @Nonempty final String sID)
  {
    if (StringHelper.hasNoText (sID))
      throw new IllegalArgumentException ("ID");
    return new JQueryInvocation (jQuery ().invoke ().arg ('#' + sID));
  }

  @Nonnull
  public static JQueryInvocation idRefAll (@Nonnull @Nonempty final String... aIDs)
  {
    if (ArrayHelper.isEmpty (aIDs))
      throw new IllegalArgumentException ("IDs may not be empty");
    final StringBuilder aSB = new StringBuilder ();
    for (final String sID : aIDs)
    {
      if (aSB.length () > 0)
        aSB.append (',');
      aSB.append ('#').append (sID);
    }
    return new JQueryInvocation (jQuery ().invoke ().arg (aSB.toString ()));
  }

  @Nonnull
  public static JQueryInvocation idRefAll (@Nonnull @Nonempty final Iterable <String> aIDs)
  {
    if (ContainerHelper.isEmpty (aIDs))
      throw new IllegalArgumentException ("IDs may not be empty");
    final StringBuilder aSB = new StringBuilder ();
    for (final String sID : aIDs)
    {
      if (aSB.length () > 0)
        aSB.append (',');
      aSB.append ('#').append (sID);
    }
    return new JQueryInvocation (jQuery ().invoke ().arg (aSB.toString ()));
  }

  @Nonnull
  public static JQueryInvocation classRef (@Nonnull final ICSSClassProvider aCSSClass)
  {
    if (aCSSClass == null)
      throw new NullPointerException ("cssClass");
    return new JQueryInvocation (jQuery ().invoke ().arg ('.' + aCSSClass.getCSSClass ()));
  }
}