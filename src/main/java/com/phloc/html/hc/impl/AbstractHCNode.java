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
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;

/**
 * Default implementation of the {@link IHCNode} interface.
 * 
 * @author philip
 */
public abstract class AbstractHCNode extends AbstractHCBaseNode implements IHCNode
{
  private boolean m_bPreparedOnce = false;

  public final boolean isPreparedOnce ()
  {
    return m_bPreparedOnce;
  }

  /**
   * This method checks whether the node is suitable for conversion to an
   * {@link IMicroNode}.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   * @return <code>true</code> if the node can be converted to a node,
   *         <code>false</code> otherwise.
   */
  @OverrideOnDemand
  protected boolean canConvertToNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    return true;
  }

  /**
   * This method is called once for each instead before the note itself is
   * created. Overwrite this method to perform actions that can only be done
   * when the node is build finally.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  protected void prepareNodeOnce (@Nonnull final IHCConversionSettings aConversionSettings)
  {}

  /**
   * This method is called everytime the node itself is created. Overwrite this
   * method to perform actions that can only be done when the node is build.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void prepare (@Nonnull final IHCConversionSettings aConversionSettings)
  {}

  @Nonnull
  protected abstract IMicroNode internalGetAsNode (@Nonnull IHCConversionSettings aConversionSettings);

  /*
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   */
  @Nullable
  public final IMicroNode getAsNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    if (!canConvertToNode (aConversionSettings))
      return null;

    // Prepare object once per instance - before first rendering (implementation
    // dependent)
    if (!m_bPreparedOnce)
    {
      prepareNodeOnce (aConversionSettings);
      m_bPreparedOnce = true;
    }

    // Prepare object for each rendering (implementation dependent)
    prepare (aConversionSettings);

    return internalGetAsNode (aConversionSettings);
  }

  @Nonnull
  public IHCNode getAsConditionalCommentNode (@Nonnull @Nonempty final String sCondition)
  {
    return new HCConditionalCommentNode (sCondition, this);
  }
}
