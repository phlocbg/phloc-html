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
import com.phloc.commons.string.StringHelper;

public class JQuerySelector
{
  public static final JQuerySelector animated = new JQuerySelector ("animated");
  public static final JQuerySelector button = new JQuerySelector ("button");
  public static final JQuerySelector checkbox = new JQuerySelector ("checkbox");
  public static final JQuerySelector checked = new JQuerySelector ("checked");
  public static final JQuerySelector disabled = new JQuerySelector ("disabled");
  public static final JQuerySelector empty = new JQuerySelector ("empty");
  public static final JQuerySelector enabled = new JQuerySelector ("enabled");
  public static final JQuerySelector even = new JQuerySelector ("even");
  public static final JQuerySelector file = new JQuerySelector ("file");
  public static final JQuerySelector first_child = new JQuerySelector ("first-child");
  public static final JQuerySelector first = new JQuerySelector ("first");
  public static final JQuerySelector focus = new JQuerySelector ("focus");
  public static final JQuerySelector header = new JQuerySelector ("header");
  public static final JQuerySelector hidden = new JQuerySelector ("hidden");
  public static final JQuerySelector image = new JQuerySelector ("image");
  public static final JQuerySelector input = new JQuerySelector ("input");
  public static final JQuerySelector last_child = new JQuerySelector ("last-child");
  public static final JQuerySelector last = new JQuerySelector ("last");
  public static final JQuerySelector odd = new JQuerySelector ("odd");
  public static final JQuerySelector only_child = new JQuerySelector ("only-child");
  public static final JQuerySelector parent = new JQuerySelector ("parent");
  public static final JQuerySelector password = new JQuerySelector ("password");
  public static final JQuerySelector radio = new JQuerySelector ("radio");
  public static final JQuerySelector reset = new JQuerySelector ("reset");
  public static final JQuerySelector selected = new JQuerySelector ("selected");
  public static final JQuerySelector submit = new JQuerySelector ("submit");
  public static final JQuerySelector text = new JQuerySelector ("text");
  public static final JQuerySelector visible = new JQuerySelector ("visible");

  private final String m_sSelector;

  private JQuerySelector (@Nonnull @Nonempty final String sSelectorName)
  {
    if (StringHelper.hasNoText (sSelectorName))
      throw new IllegalArgumentException ("selectorName");
    m_sSelector = ':' + sSelectorName;
  }

}
