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
import com.phloc.commons.string.StringHelper;
import com.phloc.html.css.ICSSClassProvider;

public class JQuerySelectorList implements IHasStringRepresentation
{
  private final List <IJQuerySelector> m_aElements = new ArrayList <IJQuerySelector> ();

  public JQuerySelectorList ()
  {}

  @Nonnull
  public JQuerySelectorList addSelector (@Nonnull final IJQuerySelector aSelector)
  {
    if (aSelector == null)
      throw new NullPointerException ("selector");
    m_aElements.add (aSelector);
    return this;
  }

  @Nonnull
  public JQuerySelectorList addID (@Nonnull @Nonempty final String sID)
  {
    return addSelector (JQuerySelector.id (sID));
  }

  @Nonnull
  public JQuerySelectorList addClass (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return addSelector (JQuerySelector.clazz (aCSSClass));
  }

  @Nonnull
  public JQuerySelectorList addElement (@Nonnull @Nonempty final String sElementName)
  {
    return addSelector (JQuerySelector.elementName (sElementName));
  }

  @Nonnull
  public JQuerySelectorList addElementWithSelector (@Nonnull @Nonempty final String sElementName,
                                                    @Nonnull final IJQuerySelector aSelector)
  {
    return addSelector (JQuerySelector.elementName (sElementName).chain (aSelector));
  }

  @Nonnull
  public JQuerySelectorList addElementWithID (@Nonnull @Nonempty final String sElementName,
                                              @Nonnull @Nonempty final String sID)
  {
    return addElementWithSelector (sElementName, JQuerySelector.id (sID));
  }

  @Nonnull
  public JQuerySelectorList addElementWithClass (@Nonnull @Nonempty final String sElementName,
                                                 @Nonnull final ICSSClassProvider aCSSClass)
  {
    return addElementWithSelector (sElementName, JQuerySelector.clazz (aCSSClass));
  }

  @Nonnull
  public String getAsString ()
  {
    if (m_aElements.isEmpty ())
      throw new IllegalStateException ("Empty jQuery selector is not allowed!");
    return StringHelper.getImploded (' ', m_aElements);
  }
}
