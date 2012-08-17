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

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;

/**
 * Label that can be used for continue and break.
 * 
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class JSLabel implements IJSStatement
{
  final String m_sLabel;

  /**
   * JBreak constructor
   * 
   * @param _label
   *        break label or null.
   */
  JSLabel (@Nonnull @Nonempty final String _label)
  {
    m_sLabel = _label;
  }

  public void state (final JSFormatter f)
  {
    f.plain (m_sLabel + ':').nl ();
  }
}
