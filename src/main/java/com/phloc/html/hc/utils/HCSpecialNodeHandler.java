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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api.IHCCSSNode;
import com.phloc.html.hc.api.IHCJSNode;
import com.phloc.html.hc.html.HCLink;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.hc.html.HCScriptFile;
import com.phloc.html.hc.html.HCScriptOnDocumentReady;
import com.phloc.html.hc.html.HCStyle;
import com.phloc.html.hc.htmlext.HCUtils;
import com.phloc.html.js.builder.jquery.JQuery;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

/**
 * This class is used to handle the special nodes (JS and CSS, inline and
 * reference).
 * 
 * @author philip
 */
@NotThreadSafe
public final class HCSpecialNodeHandler
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCSpecialNodeHandler.class);

  private HCSpecialNodeHandler ()
  {}

  /**
   * Check if the passed node is a CSS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link IHCCSSNode} (and
   *         not a special case).
   */
  public static boolean isCSSNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);

    // Direct CSS node?
    if (aUnwrappedNode instanceof IHCCSSNode)
    {
      // Special case
      if (aUnwrappedNode instanceof HCLink && !((HCLink) aUnwrappedNode).isCSSLink ())
        return false;
      return true;
    }

    return false;
  }

  /**
   * Check if the passed node is an inline CSS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCStyle}.
   */
  public static boolean isCSSInlineNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);

    // Inline CSS node?
    return aUnwrappedNode instanceof HCStyle;
  }

  /**
   * Check if the passed node is a file CSS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCStyle}.
   */
  public static boolean isCSSFileNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);

    // File CSS node?
    return aUnwrappedNode instanceof HCLink && ((HCLink) aUnwrappedNode).isCSSLink ();
  }

  /**
   * Check if the passed node is a JS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link IHCJSNode}.
   */
  public static boolean isJSNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);

    // Direct JS node?
    return aUnwrappedNode instanceof IHCJSNode;
  }

  /**
   * Check if the passed node is an inline JS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCScript}.
   */
  public static boolean isJSInlineNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);

    // Inline JS node?
    return aUnwrappedNode instanceof HCScript;
  }

  /**
   * Check if the passed node is a file JS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCScriptFile}.
   */
  public static boolean isJSFileNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);

    // File JS node?
    return aUnwrappedNode instanceof HCScriptFile;
  }

  /**
   * Merge all inline CSS and JS elements contained in the source nodes into one
   * script elements
   * 
   * @param aNodes
   *        Source list of nodes. May not be <code>null</code>.
   * @return Target list. It contains all non-script nodes and at last one JS
   *         inline node (HCScript).
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> mergeInlineCSSAndJS (@Nonnull final List <IHCNode> aNodes)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();

    final StringBuilder aInlineCSS = new StringBuilder ();
    final CollectingJSCodeProvider aOnDocumentReadyJS = new CollectingJSCodeProvider ();
    final CollectingJSCodeProvider aInlineJS = new CollectingJSCodeProvider ();
    for (final IHCNode aNode : aNodes)
    {
      // Note: do not unwrap the node, because it is not allowed to merge JS/CSS
      // with a conditional comment with JS/CSS without a conditional comment!
      if (aNode instanceof HCScriptOnDocumentReady)
      {
        aOnDocumentReadyJS.append (((HCScriptOnDocumentReady) aNode).getOnDocumentReadyCode ());
      }
      else
        if (aNode instanceof HCScript)
        {
          aInlineJS.append (((HCScript) aNode).getJSCodeProvider ());
        }
        else
          if (aNode instanceof HCStyle && ((HCStyle) aNode).hasNoMediaOrAll ())
          {
            // Merge only inline CSS nodes, that are media-independent
            aInlineCSS.append (((HCStyle) aNode).getStyleContent ());
          }
          else
            ret.add (aNode);
    }

    // Add all inline CSS
    if (aInlineCSS.length () > 0)
      ret.add (new HCStyle (aInlineCSS.toString ()));

    // on document ready always as last inline JS!
    if (!aOnDocumentReadyJS.isEmpty ())
      aInlineJS.append (JQuery.onDocumentReady (aOnDocumentReadyJS));

    // Finally add the inline JS
    if (!aInlineJS.isEmpty ())
      ret.add (new HCScript (aInlineJS));

    return ret;
  }
}
