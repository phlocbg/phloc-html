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
package com.phloc.html.hc.html;

import javax.annotation.Nullable;

import com.phloc.html.hc.api.EHCButtonType;

/**
 * Represents an HTML &lt;button&gt; element with type "reset"
 * 
 * @author Philip Helger
 */
public class HCButton_Reset extends HCButton
{
  private void _init ()
  {
    setType (EHCButtonType.RESET);
  }

  public HCButton_Reset ()
  {
    _init ();
  }

  public HCButton_Reset (@Nullable final String sLabel)
  {
    super (sLabel);
    _init ();
  }
}
