/**
 * Copyright (C) 2006-2014 phloc systems
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

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.IHCHasChildrenMutable;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.html.HCBody;
import com.phloc.html.hc.html.HCHead;

/**
 * An implementation of {@link IHCCustomizer} that does nothing.
 * 
 * @author Philip Helger
 */
@Immutable
public class HCEmptyCustomizer implements IHCCustomizer
{
  public HCEmptyCustomizer ()
  {}

  public void customizeNode (@Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aParentElement,
                             @Nonnull final IHCNode aNode,
                             @Nonnull final EHTMLVersion eHTMLVersion)
  {
    // Nada
  }

  public void handleOutOfBandNodes (@Nonnull final List <IHCNode> aOutOfBandNodes,
                                    @Nonnull final HCHead aHead,
                                    @Nonnull final HCBody aBody)
  {
    // Nada
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).toString ();
  }
}
