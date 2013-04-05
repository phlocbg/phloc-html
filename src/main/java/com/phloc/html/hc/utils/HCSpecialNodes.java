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
package com.phloc.html.hc.utils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

/**
 * Default implementation of {@link IHCSpecialNodes}.
 * 
 * @author philip
 */
@NotThreadSafe
public class HCSpecialNodes implements IHCSpecialNodes
{
  private final List <String> m_aCSSFiles = new ArrayList <String> ();
  private final List <String> m_aJSFiles = new ArrayList <String> ();
  private final CollectingJSCodeProvider m_aInlineJS = new CollectingJSCodeProvider ();

  public HCSpecialNodes ()
  {}

  @Nonnull
  public IHCSpecialNodes addCSSFile (@Nonnull @Nonempty final String sCSSFile)
  {
    if (StringHelper.hasNoText (sCSSFile))
      throw new IllegalArgumentException ("CSSFile");
    m_aCSSFiles.add (sCSSFile);
    return this;
  }

  public boolean hasCSSFiles ()
  {
    return !m_aCSSFiles.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <String> getAllCSSFiles ()
  {
    return ContainerHelper.newList (m_aCSSFiles);
  }

  @Nonnull
  public IHCSpecialNodes addJSFile (@Nonnull @Nonempty final String sJSFile)
  {
    if (StringHelper.hasNoText (sJSFile))
      throw new IllegalArgumentException ("JSFile");
    m_aJSFiles.add (sJSFile);
    return this;
  }

  public boolean hasJSFiles ()
  {
    return !m_aJSFiles.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <String> getAllJSFiles ()
  {
    return ContainerHelper.newList (m_aJSFiles);
  }

  @Nonnull
  public IHCSpecialNodes addInlineJS (@Nonnull final IJSCodeProvider aInlineJS)
  {
    if (aInlineJS == null)
      throw new NullPointerException ("InlineJS");
    m_aInlineJS.append (aInlineJS);
    return this;
  }

  public boolean hasInlineJS ()
  {
    return m_aInlineJS.isNotEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public CollectingJSCodeProvider getInlineJS ()
  {
    return m_aInlineJS.getClone ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("cssFiles", m_aCSSFiles)
                                       .append ("jsFiles", m_aJSFiles)
                                       .append ("inlineJS", m_aInlineJS)
                                       .toString ();
  }
}
