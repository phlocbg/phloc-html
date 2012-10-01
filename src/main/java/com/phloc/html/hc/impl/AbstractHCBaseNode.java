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

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Default implementation of the {@link IHCNode} interface.
 * 
 * @author philip
 */
public abstract class AbstractHCBaseNode implements IHCBaseNode
{
  private boolean m_bCustomized = false;
  private boolean m_bPreparedOnce = false;

  @OverrideOnDemand
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return true;
  }

  public final boolean isCustomized ()
  {
    return m_bCustomized;
  }

  public final void applyCustomization (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                        @Nonnull final IHCNodeWithChildren <?> aParentNode)
  {
    if (!m_bCustomized)
    {
      m_bCustomized = true;
      aConversionSettings.getCustomizer ().customizeNode (aParentNode, this, aConversionSettings.getHTMLVersion ());
    }
  }

  public final boolean isPreparedOnce ()
  {
    return m_bPreparedOnce;
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
  @OverridingMethodsMustInvokeSuper
  protected void prepareOnce (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {}

  public final void prepareConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Prepare object once per instance - before first rendering (implementation
    // dependent)
    if (!m_bPreparedOnce)
    {
      prepareOnce (aConversionSettings);
      m_bPreparedOnce = true;
    }
  }

  @Nonnull
  protected abstract IMicroNode internalConvertToNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /*
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   */
  @Nullable
  public final IMicroNode convertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (!canConvertToNode (aConversionSettings))
      return null;

    // Prepare object once per instance - before first rendering (implementation
    // dependent)
    if (!m_bPreparedOnce)
    {
      prepareOnce (aConversionSettings);
      m_bPreparedOnce = true;
    }

    return internalConvertToNode (aConversionSettings);
  }

  @Nonnull
  public final String getAsHTMLString (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final IMicroNode aNode = convertToNode (aConversionSettings);
    if (aNode == null)
      return "";
    return MicroWriter.getNodeAsString (aNode, aConversionSettings.getXMLWriterSettings ());
  }

  @OverrideOnDemand
  @Nonnull
  public String getPlainText ()
  {
    return "";
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("customized", m_bCustomized)
                                       .append ("preparedOnce", m_bPreparedOnce)
                                       .toString ();
  }
}
