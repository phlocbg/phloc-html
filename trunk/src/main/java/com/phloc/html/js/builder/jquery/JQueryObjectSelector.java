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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.regex.RegExHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.css.ICSSClassProvider;

public class JQueryObjectSelector implements IJQueryObjectSelector
{
  private final List <String> m_aElements = new ArrayList <String> ();

  public JQueryObjectSelector ()
  {}

  @Nonnull
  public JQueryObjectSelector addID (@Nonnull @Nonempty final String sID)
  {
    if (StringHelper.hasNoText (sID))
      throw new IllegalArgumentException ("ID");
    // Replace all illegal characters in IDs: ":" and "."
    // http://docs.jquery.com/Frequently_Asked_Questions#How_do_I_select_an_element_by_an_ID_that_has_characters_used_in_CSS_notation.3F
    m_aElements.add ('#' + RegExHelper.stringReplacePattern ("(:|\\.)", sID, "\\\\$1"));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    if (aCSSClass == null)
      throw new NullPointerException ("CSSClass");
    m_aElements.add ('.' + aCSSClass.getCSSClass ());
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addElement (@Nonnull @Nonempty final String sElementName)
  {
    return addElement (sElementName, null);
  }

  @Nonnull
  public JQueryObjectSelector addElement (@Nonnull @Nonempty final String sElementName,
                                          @Nullable final IJQuerySelector aSelector)
  {
    if (StringHelper.hasNoText (sElementName))
      throw new IllegalArgumentException ("elementName");
    m_aElements.add (sElementName + (aSelector == null ? "" : aSelector.getAsString ()));
    return this;
  }

  @Nonnull
  public String getAsString ()
  {
    if (m_aElements.isEmpty ())
      throw new IllegalStateException ("Empty jQuery selector is not allowed!");
    return StringHelper.getImploded (',', m_aElements);
  }
}
