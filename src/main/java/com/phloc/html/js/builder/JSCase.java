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
import javax.annotation.Nullable;

import com.phloc.commons.string.ToStringGenerator;

/**
 * Case statement
 * 
 * @author philip
 */
public class JSCase implements IJSStatement
{
  /**
   * label part of the case statement
   */
  private final IJSExpression m_aLabel;

  /**
   * Block of statements which makes up body of this While statement
   */
  private JSBlock m_aBody;

  /**
   * is this a regular case statement or a default case statement?
   */
  private boolean m_bIsDefaultCase = false;

  /**
   * Construct a case statement
   */
  public JSCase (@Nonnull final IJSExpression aLabel)
  {
    this (aLabel, false);
  }

  /**
   * Construct a case statement. If isDefaultCase is true, then label should be
   * null since default cases don't have a label.
   * 
   * @param aLabel
   *        May be <code>null</code> if this is the default case
   * @param bIsDefaultCase
   *        <code>true</code> if this is the default case!
   */
  public JSCase (@Nullable final IJSExpression aLabel, final boolean bIsDefaultCase)
  {
    if (!bIsDefaultCase && aLabel == null)
      throw new NullPointerException ("Only the default case may not have a label!");
    m_aLabel = aLabel;
    m_bIsDefaultCase = bIsDefaultCase;
  }

  public boolean isDefaultCase ()
  {
    return m_bIsDefaultCase;
  }

  @Nullable
  public IJSExpression label ()
  {
    return m_aLabel;
  }

  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock (false, true);
    return m_aBody;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    f.indent ();
    if (!m_bIsDefaultCase)
      f.plain ("case ").generatable (m_aLabel).plain (':').nl ();
    else
      f.plain ("default:").nl ();
    if (m_aBody != null)
      f.stmt (m_aBody);
    f.outdent ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("label", m_aLabel)
                                       .append ("body", m_aBody)
                                       .append ("isDefaultCase", m_bIsDefaultCase)
                                       .toString ();
  }
}
