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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.string.StringHelper;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.IHCWrappingNode;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.hc.html.HCScriptOnDocumentReady;
import com.phloc.html.js.builder.jquery.JQuery;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

/**
 * This class is used to centrally handle the out-of-band nodes.
 * 
 * @author philip
 */
public final class HCOutOfBandHandler
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCOutOfBandHandler.class);
  private static final Map <String, Boolean> s_aOOBNAnnotationCache = new HashMap <String, Boolean> ();

  private HCOutOfBandHandler ()
  {}

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
    if (aHCNode instanceof IHCWrappingNode)
      return isOutOfBandNode (((IHCWrappingNode) aHCNode).getWrappedNode ());

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
   * before calling this method!
   * 
   * @param aParentElement
   *        The parent element to extract the nodes from. May not be
   *        <code>null</code>.
   * @param aTargetList
   *        The list to add the out-of-band nodes to. May not be
   *        <code>null</code>.
   */
  public static void recursiveExtractOutOfBandNodes (@Nonnull final IHCHasChildren aParentElement,
                                                     @Nonnull final List <IHCNode> aTargetList)
  {
    if (aParentElement == null)
      throw new NullPointerException ("parentElement");
    if (aTargetList == null)
      throw new NullPointerException ("targetList");

    if (true)
    {
      // Using HCUtils.iterateTree would be too tedious here
      _recursiveExtractOutOfBandNodes (aParentElement, aTargetList, 0);
    }
    else
    {
      final int n = aTargetList.size ();

      // Using HCUtils.iterateTree would be too tedious here
      _recursiveExtractOutOfBandNodes (aParentElement, aTargetList, 0);
      s_aLogger.info ("--- +" + (aTargetList.size () - n) + " for " + aParentElement.getClass ().getSimpleName ());
    }
  }

  /**
   * Merge all inline JS elements contained in aSourceOutOfBandNodes into one
   * script element in aMergedOOBNodes
   * 
   * @param aSourceOutOfBandNodes
   *        Source list of OOB nodes. May not be <code>null</code>.
   * @param aMergedOOBNodes
   *        Target list. After the call to this method, the list contains all
   *        source nodes and at last one JS inline node (HCScript).
   * @return The number of merged nodes. Always &ge; 0.
   */
  @Nonnegative
  public static int mergeOutOfBandJS (@Nonnull final List <IHCNode> aSourceOutOfBandNodes,
                                      @Nonnull final List <IHCNode> aMergedOOBNodes)
  {
    int nMerged = 0;
    final CollectingJSCodeProvider aOnDocumentReadyJS = new CollectingJSCodeProvider ();
    final CollectingJSCodeProvider aInlineJS = new CollectingJSCodeProvider ();
    for (final IHCNode aOOBNode : aSourceOutOfBandNodes)
    {
      if (aOOBNode instanceof HCScriptOnDocumentReady)
      {
        aOnDocumentReadyJS.append (((HCScriptOnDocumentReady) aOOBNode).getOnDocumentReadyCode ());
        nMerged++;
      }
      else
        if (aOOBNode instanceof HCScript)
        {
          aInlineJS.append (((HCScript) aOOBNode).getJSCodeProvider ());
          nMerged++;
        }
        else
          aMergedOOBNodes.add (aOOBNode);
    }

    // on document ready always as last inline JS!
    if (!aOnDocumentReadyJS.isEmpty ())
      aInlineJS.append (JQuery.onDocumentReady (aOnDocumentReadyJS));

    // Finally add the inline JS
    if (!aInlineJS.isEmpty ())
      aMergedOOBNodes.add (new HCScript (aInlineJS));

    return nMerged;
  }
}
