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

import javax.annotation.Nullable;

import com.phloc.commons.string.ToStringGenerator;

/**
 * Break statement
 * 
 * @author philip
 */
public class JSBreak implements IJSStatement
{
  private final JSLabel m_aLabel;

  /**
   * JBreak constructor
   * 
   * @param aLabel
   *        break label or null.
   */
  public JSBreak (@Nullable final JSLabel aLabel)
  {
    m_aLabel = aLabel;
  }

  public void state (final JSFormatter f)
  {
    if (m_aLabel == null)
      f.plain ("break;").nl ();
    else
      f.plain ("break").plain (m_aLabel.m_sLabel).plain (';').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("label", m_aLabel).toString ();
  }
}
