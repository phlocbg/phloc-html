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

import com.phloc.commons.regex.RegExHelper;

/**
 * Single line comments
 * 
 * @author philip
 */
final class JSCommentSingleLine implements IJSStatement
{
  private final String m_sWhat;

  JSCommentSingleLine (@Nonnull final String sComment)
  {
    if (sComment == null)
      throw new NullPointerException ("comment");
    m_sWhat = sComment;
  }

  @Override
  public void state (@Nonnull final JSFormatter f)
  {
    for (final String sLine : RegExHelper.getSplitToArray (m_sWhat, "[\\r\\n]+"))
      f.plain ("// ").plain (sLine).nl ();
  }
}
