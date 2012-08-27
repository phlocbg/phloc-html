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
package com.phloc.html.hc.html;

import javax.annotation.Nonnull;

import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Abstract base class for DD and DT tags ({@link HCDefinitionDefinition} and
 * {@link HCDefinitionTerm})
 * 
 * @author philip
 * @param <THISTYPE>
 *        The implementing type
 */
public abstract class AbstractHCDefinitionItem <THISTYPE extends AbstractHCDefinitionItem <THISTYPE>> extends
                                                                                                      AbstractHCElementWithChildren <THISTYPE>
{
  public AbstractHCDefinitionItem (@Nonnull final EHTMLElement aElement)
  {
    super (aElement);
  }
}