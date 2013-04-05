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

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.hash.HashCodeGenerator;
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
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCSpecialNodes.class);

  private final Set <String> m_aCSSFiles = new LinkedHashSet <String> ();
  private final Set <String> m_aJSFiles = new LinkedHashSet <String> ();
  private final CollectingJSCodeProvider m_aInlineJS = new CollectingJSCodeProvider ();

  public HCSpecialNodes ()
  {}

  @Nonnull
  public HCSpecialNodes addCSSFile (@Nonnull @Nonempty final String sCSSFile)
  {
    if (StringHelper.hasNoText (sCSSFile))
      throw new IllegalArgumentException ("CSSFile");
    if (!m_aCSSFiles.add (sCSSFile))
      s_aLogger.warn ("Duplicate CSS file '" + sCSSFile + "' ignored");
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
  public HCSpecialNodes addJSFile (@Nonnull @Nonempty final String sJSFile)
  {
    if (StringHelper.hasNoText (sJSFile))
      throw new IllegalArgumentException ("JSFile");
    if (!m_aJSFiles.add (sJSFile))
      s_aLogger.warn ("Duplicate JS file '" + sJSFile + "' ignored");
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
  public HCSpecialNodes addInlineJS (@Nonnull final IJSCodeProvider aInlineJS)
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

  @Nonnull
  public HCSpecialNodes addAll (@Nonnull final IHCSpecialNodes aSpecialNodes)
  {
    if (aSpecialNodes == null)
      throw new NullPointerException ("SpecialNodes");

    for (final String sCSSFile : aSpecialNodes.getAllCSSFiles ())
      addCSSFile (sCSSFile);
    for (final String sJSFile : aSpecialNodes.getAllJSFiles ())
      addJSFile (sJSFile);
    addInlineJS (aSpecialNodes.getInlineJS ());
    return this;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final HCSpecialNodes rhs = (HCSpecialNodes) o;
    return m_aCSSFiles.equals (rhs.m_aCSSFiles) &&
           m_aJSFiles.equals (rhs.m_aJSFiles) &&
           m_aInlineJS.equals (rhs.m_aInlineJS);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aCSSFiles).append (m_aJSFiles).append (m_aInlineJS).getHashCode ();
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
