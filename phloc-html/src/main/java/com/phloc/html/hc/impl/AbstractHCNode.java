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
package com.phloc.html.hc.impl;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCHasChildrenMutable;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Default implementation of the {@link IHCNode} interface.
 * 
 * @author Philip Helger
 */
@NotThreadSafe
public abstract class AbstractHCNode implements IHCNode
{
  private boolean m_bCustomized = false;
  private boolean m_bConvertedToNode = false;

  public void onAdded (@Nonnull final IHCHasChildrenMutable <?, ?> aParent)
  {}

  public void onRemoved (@Nonnull final IHCHasChildrenMutable <?, ?> aParent)
  {}

  /**
   * @return <code>true</code> if the customizer was already run on this node,
   *         <code>false</code> if not.
   */
  public final boolean isCustomized ()
  {
    return m_bCustomized;
  }

  public final void applyCustomization (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                        @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aParentNode)
  {
    if (!m_bCustomized)
    {
      m_bCustomized = true;

      // Run the global customizer
      aConversionSettings.getCustomizer ().customizeNode (aParentNode, this, aConversionSettings.getHTMLVersion ());

      if (this instanceof IHCHasChildren)
      {
        final List <? extends IHCNode> aChildNodes = ((IHCHasChildren) this).getChildren ();
        if (aChildNodes != null)
          for (final IHCNode aChildNode : aChildNodes)
            aChildNode.applyCustomization (aConversionSettings, aParentNode);
      }
    }
  }

  public final boolean isConvertedToNode ()
  {
    return m_bConvertedToNode;
  }

  @OverrideOnDemand
  public boolean canConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return true;
  }

  /**
   * This method is called only once for each instance. It is called before the
   * node itself is created. Overwrite this method to perform actions that can
   * only be done when the node is build finally.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  protected void internalBeforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {}

  public final void beforeConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Prepare object once per instance - before first rendering (implementation
    // dependent)
    if (!m_bConvertedToNode)
    {
      m_bConvertedToNode = true;
      internalBeforeConvertToNode (aConversionSettings);
    }
  }

  @Nonnull
  @OverrideOnDemand
  protected abstract IMicroNode internalConvertToNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * Called after the main conversion. Can be used to modify the created micro
   * node somehow. The default implementation just returns the passed node.
   * 
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @param aCreatedNode
   *        The created node from
   *        {@link #internalConvertToNode(IHCConversionSettingsToNode)}
   * @return The result of {@link #convertToNode(IHCConversionSettingsToNode)}
   */
  @Nullable
  @OverrideOnDemand
  protected IMicroNode internalAfterConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                                   @Nullable final IMicroNode aCreatedNode)
  {
    return aCreatedNode;
  }

  @Nullable
  public final IMicroNode convertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (!canConvertToNode (aConversionSettings))
      return null;

    // Before conversion
    beforeConvertToNode (aConversionSettings);

    // Main conversion
    final IMicroNode aOriginalNode = internalConvertToNode (aConversionSettings);

    // After convert
    final IMicroNode ret = internalAfterConvertToNode (aConversionSettings, aOriginalNode);

    return ret;
  }

  @Nonnull
  public final IHCNode getAsConditionalCommentNode (@Nonnull @Nonempty final String sCondition)
  {
    return new HCConditionalCommentNode (sCondition, this);
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
                                       .append ("preparedOnce", m_bConvertedToNode)
                                       .toString ();
  }
}
