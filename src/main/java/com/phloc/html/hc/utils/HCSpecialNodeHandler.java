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
package com.phloc.html.hc.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.PresentForCodeCoverage;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.IHCCSSNode;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCJSNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.html.HCLink;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.hc.html.HCScriptFile;
import com.phloc.html.hc.html.HCScriptOnDocumentReady;
import com.phloc.html.hc.html.HCStyle;
import com.phloc.html.hc.htmlext.HCUtils;
import com.phloc.html.hc.impl.HCNodeList;
import com.phloc.html.js.builder.jquery.JQuery;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

/**
 * This class is used to handle the special nodes (JS and CSS, inline and
 * reference).
 * 
 * @author Philip Helger
 */
@NotThreadSafe
public final class HCSpecialNodeHandler
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCSpecialNodeHandler.class);
  private static final Map <String, Boolean> s_aOOBNAnnotationCache = new HashMap <String, Boolean> ();

  @PresentForCodeCoverage
  @SuppressWarnings ("unused")
  private static final HCSpecialNodeHandler s_aInstance = new HCSpecialNodeHandler ();

  private HCSpecialNodeHandler ()
  {}

  /**
   * Check if the passed node is a CSS node after unwrapping.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link IHCCSSNode} (and
   *         not a special case).
   */
  public static boolean isCSSNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);
    return isDirectCSSNode (aUnwrappedNode);
  }

  /**
   * Check if the passed node is a CSS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link IHCCSSNode} (and
   *         not a special case).
   */
  public static boolean isDirectCSSNode (@Nullable final IHCNode aNode)
  {
    // Direct CSS node?
    if (aNode instanceof IHCCSSNode)
    {
      // Special case
      if (aNode instanceof HCLink && !((HCLink) aNode).isCSSLink ())
        return false;
      return true;
    }

    return false;
  }

  /**
   * Check if the passed node is an inline CSS node after unwrapping.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCStyle}.
   */
  public static boolean isCSSInlineNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);
    return isDirectCSSInlineNode (aUnwrappedNode);
  }

  /**
   * Check if the passed node is an inline CSS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCStyle}.
   */
  public static boolean isDirectCSSInlineNode (@Nullable final IHCNode aNode)
  {
    // Inline CSS node?
    return aNode instanceof HCStyle;
  }

  /**
   * Check if the passed node is a file CSS node after unwrapping.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCStyle}.
   */
  public static boolean isCSSFileNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);
    return isDirectCSSFileNode (aUnwrappedNode);
  }

  /**
   * Check if the passed node is a file CSS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCStyle}.
   */
  public static boolean isDirectCSSFileNode (@Nullable final IHCNode aNode)
  {
    // File CSS node?
    return aNode instanceof HCLink && ((HCLink) aNode).isCSSLink ();
  }

  /**
   * Check if the passed node is a JS node after unwrapping.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link IHCJSNode}.
   */
  public static boolean isJSNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);
    return isDirectJSNode (aUnwrappedNode);
  }

  /**
   * Check if the passed node is a JS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link IHCJSNode}.
   */
  public static boolean isDirectJSNode (@Nullable final IHCNode aNode)
  {
    // Direct JS node?
    return aNode instanceof IHCJSNode;
  }

  /**
   * Check if the passed node is an inline JS node after unwrapping.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCScript}.
   */
  public static boolean isJSInlineNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);
    return isDirectJSInlineNode (aUnwrappedNode);
  }

  /**
   * Check if the passed node is an inline JS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCScript}.
   */
  public static boolean isDirectJSInlineNode (@Nullable final IHCNode aNode)
  {
    // Inline JS node?
    return aNode instanceof HCScript;
  }

  /**
   * Check if the passed node is a file JS node after unwrapping.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCScriptFile}.
   */
  public static boolean isJSFileNode (@Nullable final IHCNode aNode)
  {
    final IHCNode aUnwrappedNode = HCUtils.getUnwrappedNode (aNode);
    return isDirectJSFileNode (aUnwrappedNode);
  }

  /**
   * Check if the passed node is a file JS node.
   * 
   * @param aNode
   *        The node to be checked - may be <code>null</code>.
   * @return <code>true</code> if the node implements {@link HCScriptFile}.
   */
  public static boolean isDirectJSFileNode (@Nullable final IHCNode aNode)
  {
    // File JS node?
    return aNode instanceof HCScriptFile;
  }

  /**
   * Check if the passed node is an out-of-band node.
   * 
   * @param aHCNode
   *        The node to be checked. May not be <code>null</code>.
   * @return <code>true</code> if it is an out-of-band node, <code>false</code>
   *         if not.
   */
  public static boolean isOutOfBandNode (@Nonnull final IHCNode aHCNode)
  {
    if (aHCNode == null)
      throw new NullPointerException ("HCNode");

    // Is the @OutOfBandNode annotation present?
    final String sClassName = aHCNode.getClass ().getName ();
    Boolean aIs = s_aOOBNAnnotationCache.get (sClassName);
    if (aIs == null)
    {
      aIs = Boolean.valueOf (aHCNode.getClass ().getAnnotation (OutOfBandNode.class) != null);
      s_aOOBNAnnotationCache.put (sClassName, aIs);
    }
    if (aIs.booleanValue ())
      return true;

    // If it is a wrapped node, look into it
    if (HCUtils.isWrappedNode (aHCNode))
      return isOutOfBandNode (HCUtils.getUnwrappedNode (aHCNode));

    // Not an out of band node
    return false;
  }

  private static void _recursiveExtractOutOfBandNodes (@Nonnull final IHCHasChildren aParentElement,
                                                       @Nonnull final List <IHCNode> aTargetList,
                                                       @Nonnegative final int nLevel)
  {
    if (aParentElement.hasChildren ())
    {
      int nNodeIndex = 0;
      for (final IHCNode aChild : aParentElement.getChildren ())
      {
        if (false)
          s_aLogger.info (StringHelper.getRepeated ("  ", nLevel) + aChild.getClass ().getCanonicalName ());

        if (isOutOfBandNode (aChild))
        {
          aTargetList.add (aChild);
          if (aParentElement instanceof IHCNodeWithChildren <?>)
            ((IHCNodeWithChildren <?>) aParentElement).removeChild (nNodeIndex);
          else
            throw new IllegalStateException ("Cannot have out-of-band nodes at " + aParentElement);
        }
        else
        {
          ++nNodeIndex;
        }

        // Recurse deeper?
        if (aChild instanceof IHCHasChildren)
          _recursiveExtractOutOfBandNodes ((IHCHasChildren) aChild, aTargetList, nLevel + 1);
      }
    }
  }

  /**
   * Extract all out-of-band child nodes for the passed element. Ensure to call
   * {@link com.phloc.html.hc.IHCNode#beforeConvertToNode(com.phloc.html.hc.conversion.IHCConversionSettingsToNode)}
   * before calling this method! All out-of-band nodes are detached from their
   * parent so that the original node can be reused.
   * 
   * @param aParentElement
   *        The parent element to extract the nodes from. May not be
   *        <code>null</code>.
   * @return The list with out-of-band nodes. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> recursiveExtractOutOfBandNodes (@Nonnull final IHCHasChildren aParentElement)
  {
    if (aParentElement == null)
      throw new NullPointerException ("parentElement");

    final List <IHCNode> aTargetList = new ArrayList <IHCNode> ();

    // Using HCUtils.iterateTree would be too tedious here
    _recursiveExtractOutOfBandNodes (aParentElement, aTargetList, 0);

    return aTargetList;
  }

  /**
   * Merge all inline CSS and JS elements contained in the source nodes into one
   * script elements
   * 
   * @param aNodes
   *        Source list of nodes. May not be <code>null</code>.
   * @param bKeepOnDocumentReady
   *        if <code>true</code> than all combined document.ready() scripts are
   *        kept as document.ready() scripts. If <code>false</code> than all
   *        document.ready() scripts are converted to regular scripts and are
   *        executed after all other scripts. For AJAX calls, this should be
   *        <code>false</code>.
   * @return Target list. It contains all non-script nodes and at last one JS
   *         inline node (HCScript).
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> getMergedInlineCSSAndJSNodes (@Nonnull final Iterable <? extends IHCNode> aNodes,
                                                             final boolean bKeepOnDocumentReady)
  {
    if (aNodes == null)
      throw new NullPointerException ("nodes");

    final List <IHCNode> ret = new ArrayList <IHCNode> ();

    final StringBuilder aInlineCSS = new StringBuilder ();
    final CollectingJSCodeProvider aOnDocumentReadyJSBefore = new CollectingJSCodeProvider ();
    final CollectingJSCodeProvider aOnDocumentReadyJSAfter = new CollectingJSCodeProvider ();
    final CollectingJSCodeProvider aInlineJSBefore = new CollectingJSCodeProvider ();
    final CollectingJSCodeProvider aInlineJSAfter = new CollectingJSCodeProvider ();
    for (final IHCNode aNode : aNodes)
    {
      // Note: do not unwrap the node, because it is not allowed to merge JS/CSS
      // with a conditional comment with JS/CSS without a conditional comment!

      // Check HCScriptOnDocumentReady first, because it is a subclass of
      // HCScript
      if (aNode instanceof HCScriptOnDocumentReady)
      {
        final HCScriptOnDocumentReady aScript = (HCScriptOnDocumentReady) aNode;
        (aScript.isEmitAfterFiles () ? aOnDocumentReadyJSAfter : aOnDocumentReadyJSBefore).appendFlattened (aScript.getOnDocumentReadyCode ());
      }
      else
        if (aNode instanceof HCScript)
        {
          final HCScript aScript = (HCScript) aNode;
          (aScript.isEmitAfterFiles () ? aInlineJSAfter : aInlineJSBefore).appendFlattened (aScript.getJSCodeProvider ());
        }
        else
          if (aNode instanceof HCStyle && ((HCStyle) aNode).hasNoMediaOrAll ())
          {
            // Merge only inline CSS nodes, that are media-independent
            final HCStyle aStyle = (HCStyle) aNode;
            aInlineCSS.append (aStyle.getStyleContent ());
          }
          else
          {
            // HCLink
            // HCScriptFile
            // HCConditionalCommentNode
            ret.add (aNode);
          }
    }

    // Add all merged inline CSSs
    if (aInlineCSS.length () > 0)
      ret.add (new HCStyle (aInlineCSS.toString ()));

    // on-document-ready JS always as last inline JS!
    if (!aOnDocumentReadyJSBefore.isEmpty ())
      if (bKeepOnDocumentReady)
        aInlineJSBefore.append (JQuery.onDocumentReady (aOnDocumentReadyJSBefore));
      else
        aInlineJSBefore.append (aOnDocumentReadyJSBefore);

    if (!aOnDocumentReadyJSAfter.isEmpty ())
      if (bKeepOnDocumentReady)
        aInlineJSAfter.append (JQuery.onDocumentReady (aOnDocumentReadyJSAfter));
      else
        aInlineJSAfter.append (aOnDocumentReadyJSAfter);

    // Finally add the inline JS
    if (!aInlineJSBefore.isEmpty ())
      ret.add (new HCScript (aInlineJSBefore).setEmitAfterFiles (false));

    if (!aInlineJSAfter.isEmpty ())
      ret.add (new HCScript (aInlineJSAfter));

    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> getWithoutSpecialNodes (@Nonnull final Iterable <? extends IHCNode> aNodes,
                                                       @Nonnull final AbstractHCSpecialNodes <?> aSpecialNodes)
  {
    if (aNodes == null)
      throw new NullPointerException ("nodes");
    if (aSpecialNodes == null)
      throw new NullPointerException ("specialNodes");

    final List <IHCNode> ret = new ArrayList <IHCNode> ();

    for (final IHCNode aNode : aNodes)
    {
      if (isDirectCSSFileNode (aNode))
      {
        aSpecialNodes.addExternalCSS (((HCLink) aNode).getHrefString ());
      }
      else
        if (isDirectCSSInlineNode (aNode))
        {
          aSpecialNodes.addInlineCSS (((HCStyle) aNode).getStyleContent ());
        }
        else
          if (isDirectJSFileNode (aNode))
          {
            aSpecialNodes.addExternalJS (((HCScriptFile) aNode).getSrcString ());
          }
          else
            if (isDirectJSInlineNode (aNode))
            {
              aSpecialNodes.addInlineJS (((HCScript) aNode).getJSCodeProvider ());
            }
            else
            {
              ret.add (aNode);
            }
    }

    return ret;
  }

  /**
   * Extract all out-of-band nodes of the source node, merge JS and CSS and
   * finally extract all special nodes into the passed object.
   * 
   * @param aNode
   *        Source node. May not be <code>null</code>.
   * @param aSpecialNodes
   *        Target special node object to be filled. May not be
   *        <code>null</code>.
   * @param bKeepOnDocumentReady
   *        if <code>true</code> than all combined document.ready() scripts are
   *        kept as document.ready() scripts. If <code>false</code> than all
   *        document.ready() scripts are converted to regular scripts and are
   *        executed after all other scripts. For AJAX calls, this should be
   *        <code>false</code>.
   * @return A node list with all remaining (non-special) nodes. Never
   *         <code>null</code>.
   */
  @Nonnull
  public static HCNodeList extractSpecialContent (@Nonnull final IHCHasChildren aNode,
                                                  @Nonnull final AbstractHCSpecialNodes <?> aSpecialNodes,
                                                  final boolean bKeepOnDocumentReady)
  {
    if (aNode == null)
      throw new NullPointerException ("Node");
    if (aSpecialNodes == null)
      throw new NullPointerException ("SpecialNodes");

    // Extract all out of band nodes from the passed node
    List <IHCNode> aExtractedOutOfBandNodes = recursiveExtractOutOfBandNodes (aNode);

    // Merge JS/CSS nodes
    aExtractedOutOfBandNodes = getMergedInlineCSSAndJSNodes (aExtractedOutOfBandNodes, bKeepOnDocumentReady);

    // Extract the special nodes into the provided object
    aExtractedOutOfBandNodes = getWithoutSpecialNodes (aExtractedOutOfBandNodes, aSpecialNodes);

    // Now the aExtractedOutOfBandNodes list should be empty - otherwise we have
    // an internal inconsistency (see the warning below)
    if (!aExtractedOutOfBandNodes.isEmpty ())
      s_aLogger.warn ("Out-of-band nodes are left after merging and extraction: " + aExtractedOutOfBandNodes);

    // Add the content without the out-of-band nodes
    final HCNodeList ret = HCNodeList.create (aNode);
    // And to be sure, add all remaining out-of-band nodes at the end so that no
    // node will get lost!
    ret.addChildren (aExtractedOutOfBandNodes);
    return ret;
  }
}
