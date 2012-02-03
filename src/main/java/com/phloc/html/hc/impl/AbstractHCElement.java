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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.DeprecatedInHTML32;
import com.phloc.html.annotations.DeprecatedInHTML4;
import com.phloc.html.annotations.DeprecatedInXHTML1;
import com.phloc.html.hc.HCConversionSettings;
import com.phloc.html.hc.IHCElement;

public abstract class AbstractHCElement <THISTYPE extends IHCElement <THISTYPE>> extends AbstractHCObject <THISTYPE> implements
                                                                                                                    IHCElement <THISTYPE>
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCElement.class);

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

  /*
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   */
  @Nullable
  public IMicroNode getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    if (!canConvertToNode ())
      return null;

    if (GlobalDebug.isDebugMode ())
    {
      if (getClass ().getAnnotation (DeprecatedInHTML32.class) != null)
        s_aLogger.warn ("The element '" + m_sElementName + "' was deprecated in HTML 3.2");
      else
        if (getClass ().getAnnotation (DeprecatedInHTML4.class) != null)
          s_aLogger.warn ("The element '" + m_sElementName + "' was deprecated in HTML 4.0");
        else
          if (getClass ().getAnnotation (DeprecatedInXHTML1.class) != null)
            s_aLogger.warn ("The element '" + m_sElementName + "' is deprecated in XHTML1");
    }

    prepareBeforeCreateElement ();
    final IMicroElement ret = createElement ();
    if (ret == null)
      throw new IllegalStateException ("Created a null element!");
    applyProperties (aConversionSettings, ret);
    return ret;
  }
}
