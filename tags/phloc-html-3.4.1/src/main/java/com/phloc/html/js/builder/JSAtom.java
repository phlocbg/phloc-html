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
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

/**
 * Simple code components that merely generate themselves.
 * 
 * @author philip
 */
public final class JSAtom extends AbstractJSExpression
{
  private final String m_sAtom;

  public JSAtom (@Nonnull @Nonempty final String sAtom)
  {
    if (StringHelper.hasNoText (sAtom))
      throw new IllegalArgumentException ("atom");
    m_sAtom = sAtom;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (m_sAtom);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("atom", m_sAtom).toString ();
  }
}