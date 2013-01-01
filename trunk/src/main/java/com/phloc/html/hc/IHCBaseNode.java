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
package com.phloc.html.hc;

import java.io.Serializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.IHasPlainText;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Base interface for HC* node objects.
 * 
 * @author philip
 */
public interface IHCBaseNode extends IHasPlainText, Serializable
{
  /**
   * Apply customization as defined by
   * {@link IHCConversionSettingsToNode#getCustomizer()}. This is done only for
   * this node and not for child nodes!
   * 
   * @param aConversionSettings
   *        The conversion settings to use. May not be <code>null</code>.
   * @param aParentNode
   *        The parent node where additional elements should be added. May not
   *        be <code>null</code>.
   */
  void applyCustomization (@Nonnull IHCConversionSettingsToNode aConversionSettings,
                           @Nonnull IHCNodeWithChildren <?> aParentNode);

  /**
   * This method checks whether the node is suitable for conversion to an
   * {@link IMicroNode}. If this node cannot be converted, no child node will be
   * converted as well!
   * 
   * @param aConversionSettings
   *        The conversion settings to be used
   * @return <code>true</code> if the node can be converted to a node,
   *         <code>false</code> otherwise.
   */
  boolean canConvertToNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * Special "before" method that is invoked once per instance before the main
   * {@link #convertToNode(IHCConversionSettingsToNode)} method is invoked. This
   * is implicitly invoked on child nodes, since it is automatically called
   * within convertToNode.
   * 
   * @param aConversionSettings
   *        The conversion settings to use. May not be <code>null</code>.
   */
  void beforeConvertToNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  IMicroNode convertToNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * Get this node wrapped in a conditional comment. This is a sanity method for
   * <code>new HCConditionalCommentNode (this, sCondition)</code>
   * 
   * @param sCondition
   *        The condition to us
   * @return Never <code>null</code>.
   */
  @Nonnull
  IHCNode getAsConditionalCommentNode (@Nonnull @Nonempty String sCondition);

  /**
   * Convert the passed node to it's HTML representation. First this HC-node is
   * converted to a micro node, which is than
   * 
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as HTML string and never null.
   */
  @Nonnull
  String getAsHTMLString (@Nonnull IHCConversionSettings aConversionSettings);
}
