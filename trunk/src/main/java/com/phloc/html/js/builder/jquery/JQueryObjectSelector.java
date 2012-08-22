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

import com.phloc.commons.IHasStringRepresentation;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.regex.RegExHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.css.ICSSClassProvider;

public class JQueryObjectSelector implements IHasStringRepresentation
{
  private final List <String> m_aElements = new ArrayList <String> ();

  public JQueryObjectSelector ()
  {}

  @Nonnull
  @Nonempty
  public static String getIDSelector (@Nonnull @Nonempty final String sID)
  {
    if (StringHelper.hasNoText (sID))
      throw new IllegalArgumentException ("ID");
    // Replace all illegal characters in IDs: ":" and "."
    // http://docs.jquery.com/Frequently_Asked_Questions#How_do_I_select_an_element_by_an_ID_that_has_characters_used_in_CSS_notation.3F
    return '#' + RegExHelper.stringReplacePattern ("(:|\\.)", sID, "\\\\$1");
  }

  @Nonnull
  public static String getClassSelector (@Nonnull final ICSSClassProvider aCSSClass)
  {
    if (aCSSClass == null)
      throw new NullPointerException ("CSSClass");
    return '.' + aCSSClass.getCSSClass ();
  }

  @Nonnull
  @Nonempty
  public static String getElementNameSelector (@Nonnull @Nonempty final String sElementName)
  {
    if (StringHelper.hasNoText (sElementName))
      throw new IllegalArgumentException ("elementName");
    return sElementName;
  }

  @Nonnull
  public static String getSelectorSelector (@Nonnull final IJQuerySelector aSelector)
  {
    if (aSelector == null)
      throw new NullPointerException ("selector");
    return aSelector.getAsString ();
  }

  @Nonnull
  public JQueryObjectSelector addID (@Nonnull @Nonempty final String sID)
  {
    m_aElements.add (getIDSelector (sID));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    m_aElements.add (getClassSelector (aCSSClass));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addElement (@Nonnull @Nonempty final String sElementName)
  {
    m_aElements.add (getElementNameSelector (sElementName));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addElementWithSelector (@Nonnull @Nonempty final String sElementName,
                                                      @Nonnull final IJQuerySelector aSelector)
  {
    if (aSelector == null)
      throw new NullPointerException ("selector");

    m_aElements.add (getElementNameSelector (sElementName) + getSelectorSelector (aSelector));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addElementWithID (@Nonnull @Nonempty final String sElementName,
                                                @Nonnull @Nonempty final String sID)
  {
    m_aElements.add (getElementNameSelector (sElementName) + getIDSelector (sID));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addElementWithClass (@Nonnull @Nonempty final String sElementName,
                                                   @Nonnull final ICSSClassProvider aCSSClass)
  {
    m_aElements.add (getElementNameSelector (sElementName) + getClassSelector (aCSSClass));
    return this;
  }

  @Nonnull
  public JQueryObjectSelector addSelector (@Nonnull final IJQuerySelector aSelector)
  {
    m_aElements.add (getSelectorSelector (aSelector));
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
