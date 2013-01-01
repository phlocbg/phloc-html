/**
 * Copyright (C) 2006-2013 phloc systems
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
package com.phloc.html.hc.api;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;

/**
 * The type of an {@link com.phloc.html.hc.impl.AbstractHCInput} element.
 * 
 * @author philip
 */
public enum EHCInputType implements IHCHasHTMLAttributeValue
{
  TEXT ("text"),
  PASSWORD ("password"),
  CHECKBOX ("checkbox"),
  RADIO ("radio"),
  BUTTON ("button"),
  SUBMIT ("submit"),
  RESET ("reset"),
  FILE ("file"),
  HIDDEN ("hidden"),
  IMAGE ("image"),
  // HTML5 new:
  DATETIME ("datetime"),
  DATETIME_LOCAL ("datetime-local"),
  DATE ("date"),
  MONTH ("month"),
  TIME ("time"),
  WEEK ("week"),
  NUMBER ("number"),
  RANGE ("range"),
  EMAIL ("email"),
  URL ("url"),
  SEARCH ("search"),
  TEL ("tel"),
  COLOR ("color");

  private final String m_sAttrValue;

  private EHCInputType (@Nonnull @Nonempty final String sAttrValue)
  {
    m_sAttrValue = sAttrValue;
  }

  @Nonnull
  @Nonempty
  public String getAttrValue ()
  {
    return m_sAttrValue;
  }
}
