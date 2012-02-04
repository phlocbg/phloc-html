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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.conversion.HCConsistencyChecker;
import com.phloc.html.hc.conversion.HCConversionSettings;

public abstract class AbstractHCElement <THISTYPE extends IHCElement <THISTYPE>> extends
                                                                                 AbstractHCHTMLObject <THISTYPE> implements
                                                                                                                IHCElement <THISTYPE>
{
  private final EHTMLElement m_eElement;
  private final String m_sElementName;

  protected AbstractHCElement (@Nonnull final EHTMLElement eElement)
  {
    if (eElement == null)
      throw new NullPointerException ("element");
    m_eElement = eElement;
    m_sElementName = eElement.getElementName ();
  }

  @Nonnull
  public final EHTMLElement getElement ()
  {
    return m_eElement;
  }

  @Nonnull
  @Nonempty
  public final String getTagName ()
  {
    return m_sElementName;
  }

  /**
   * This method checks whether the node is suitable for conversion to an
   * IMicroElement.
   * 
   * @return <code>true</code> if the node can be converted to a node,
   *         <code>false</code> otherwise.
   */
  @OverrideOnDemand
  protected boolean canConvertToNode ()
  {
    return true;
  }

  /**
   * This method is called before the element itself is created. Overwrite this
   * method to perform actions that can only be done when the element is build
   * finally.
   */
  @OverrideOnDemand
  protected void prepareBeforeCreateElement ()
  {}

  /**
   * @return The created micro element for this HC element. May not be
   *         <code>null</code>.
   */
  @OverrideOnDemand
  @Nonnull
  protected IMicroElement createElement ()
  {
    return new MicroElement (m_sElementName);
  }

  /**
   * This method is called after the element itself was created and filled.
   * Overwrite this method to perform actions that can only be done after the
   * element was build finally.
   * 
   * @param eElement
   *        The created micro element
   */
  @OverrideOnDemand
  protected void finishAfterCreateElement (@Nonnull final IMicroElement eElement)
  {}

  /*
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   */
  @Nullable
  public IMicroNode getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    if (!canConvertToNode ())
      return null;

    // Run some
    if (aConversionSettings.areConsistencyChecksEnabled ())
      HCConsistencyChecker.runConsistencyCheck (this, aConversionSettings.getHTMLVersion ());

    // Prepare object
    prepareBeforeCreateElement ();
    final IMicroElement ret = createElement ();
    if (ret == null)
      throw new IllegalStateException ("Created a null element!");
    applyProperties (ret, aConversionSettings);
    finishAfterCreateElement (ret);
    return ret;
  }
}
