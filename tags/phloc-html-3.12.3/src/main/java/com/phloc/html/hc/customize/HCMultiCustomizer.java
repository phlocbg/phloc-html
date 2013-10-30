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
package com.phloc.html.hc.customize;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.html.HCBody;
import com.phloc.html.hc.html.HCHead;

/**
 * An implementation of {@link IHCCustomizer} that handles multiple customizers.
 * 
 * @author Philip Helger
 */
@Immutable
public final class HCMultiCustomizer implements IHCCustomizer
{
  private final List <IHCCustomizer> m_aCustomizers = new ArrayList <IHCCustomizer> ();

  public HCMultiCustomizer (@Nullable final IHCCustomizer... aCustomizers)
  {
    if (aCustomizers != null)
      for (final IHCCustomizer aCustomizer : aCustomizers)
        m_aCustomizers.add (aCustomizer);
  }

  public HCMultiCustomizer (@Nullable final Iterable <? extends IHCCustomizer> aCustomizers)
  {
    if (aCustomizers != null)
      for (final IHCCustomizer aCustomizer : aCustomizers)
        m_aCustomizers.add (aCustomizer);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCCustomizer> getAllCustomizers ()
  {
    return ContainerHelper.newList (m_aCustomizers);
  }

  public void customizeNode (@Nonnull final IHCNodeWithChildren <?> aParentElement,
                             @Nonnull final IHCNode aNode,
                             @Nonnull final EHTMLVersion eHTMLVersion)
  {
    for (final IHCCustomizer aCustomizer : m_aCustomizers)
      aCustomizer.customizeNode (aParentElement, aNode, eHTMLVersion);
  }

  public void handleOutOfBandNodes (@Nonnull final List <IHCNode> aOutOfBandNodes,
                                    @Nonnull final HCHead aHead,
                                    @Nonnull final HCBody aBody)
  {
    for (final IHCCustomizer aCustomizer : m_aCustomizers)
      aCustomizer.handleOutOfBandNodes (aOutOfBandNodes, aHead, aBody);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("customizers", m_aCustomizers).toString ();
  }
}
