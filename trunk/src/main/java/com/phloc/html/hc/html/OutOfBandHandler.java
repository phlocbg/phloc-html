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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.phloc.commons.parent.IHasChildren;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.annotations.OutOfBandNode;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.IHCWrappingNode;

/**
 * This class is used to centrally handle the out-of-band nodes.
 * 
 * @author philip
 */
public final class OutOfBandHandler
{
  private static Map <String, Boolean> s_aOOBNAnnotationCache = new HashMap <String, Boolean> ();

  private OutOfBandHandler ()
  {}

  /**
   * Check if the passed node is an out-of-band node.
   * 
   * @param aHCNode
   *        The node to be checked. May not be <code>null</code>.
   * @return <code>true</code> if it is an out-of-band node, <code>false</code>
   *         if not.
   */
  public static boolean isOutOfBandNode (@Nonnull final IHCBaseNode aHCNode)
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

  /**
   * Resolve all wrappings when adding to the result list.
   * 
   * @param aHCNode
   *        The node to be unwrapped. Never <code>null</code>.
   * @return The unwrapped node. Never <code>null</code>.
   */
  @Nonnull
  private static IHCBaseNode _getUnwrappedOutOfBandNode (@Nonnull final IHCBaseNode aHCNode)
  {
    if (aHCNode instanceof IHCWrappingNode)
      return _getUnwrappedOutOfBandNode (((IHCWrappingNode) aHCNode).getWrappedNode ());

    return aHCNode;
  }

  private static void _recursiveExtractOutOfBandNodes (@Nonnull final IHasChildren <?> aParentElement,
                                                       @Nonnull final List <IHCBaseNode> aTargetList,
                                                       @Nonnegative final int nLevel)
  {
    if (aParentElement.hasChildren ())
    {
      int nNodeIndex = 0;
      for (final Object aChildObj : aParentElement.getChildren ())
        if (aChildObj instanceof IHCBaseNode)
        {
          final IHCBaseNode aChild = (IHCBaseNode) aChildObj;

          if (false)
            System.out.println (StringHelper.getRepeated ("  ", nLevel) + aChild.getClass ().getCanonicalName ());

          if (isOutOfBandNode (aChild))
          {
            // Add to target list unwrapped
            aTargetList.add (_getUnwrappedOutOfBandNode (aChild));
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
          if (aChild instanceof IHasChildren <?>)
            _recursiveExtractOutOfBandNodes ((IHasChildren <?>) aChild, aTargetList, nLevel + 1);
        }
    }
  }

  public static void recursiveExtractOutOfBandNodes (@Nonnull final IHasChildren <?> aParentElement,
                                                     @Nonnull final List <IHCBaseNode> aTargetList)
  {
    if (aParentElement == null)
      throw new NullPointerException ("parentElement");
    if (aTargetList == null)
      throw new NullPointerException ("targetList");

    _recursiveExtractOutOfBandNodes (aParentElement, aTargetList, 0);
  }
}
