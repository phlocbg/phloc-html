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
package com.phloc.html.hc.htmlext;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.commons.lang.GenericReflection;
import com.phloc.commons.parent.IHasChildren;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.html.HCBR;
import com.phloc.html.hc.html.HCDiv;
import com.phloc.html.hc.impl.HCTextNode;

@Immutable
public final class HCUtils
{
  private static final String PATTERN_NEWLINE = "\n";

  private HCUtils ()
  {}

  @Nullable
  public static String nl2br (@Nullable final String sText)
  {
    return StringHelper.replaceAll (sText, PATTERN_NEWLINE, "<br/>");
  }

  @Nonnull
  public static List <IHCNode> nl2brList (@Nullable final String sText)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (StringHelper.hasText (sText))
    {
      int nIndex = 0;
      int nNext = 0;
      while (nIndex < sText.length ())
      {
        nNext = sText.indexOf (PATTERN_NEWLINE, nIndex);
        if (nNext >= 0)
        {
          if (nNext > nIndex)
            ret.add (new HCTextNode (sText.substring (nIndex, nNext)));
          ret.add (new HCBR ());
          nIndex = nNext + PATTERN_NEWLINE.length ();
        }
        else
        {
          ret.add (new HCTextNode (sText.substring (nIndex)));
          break;
        }
      }
    }
    return ret;
  }

  @Nonnull
  public static List <HCDiv> nl2divList (@Nullable final String sText)
  {
    final List <HCDiv> ret = new ArrayList <HCDiv> ();
    if (StringHelper.hasText (sText))
    {
      int nIndex = 0;
      int nNext = 0;
      while (nIndex < sText.length ())
      {
        nNext = sText.indexOf (PATTERN_NEWLINE, nIndex);
        if (nNext >= 0)
        {
          if (nNext > nIndex)
            ret.add (new HCDiv (sText.substring (nIndex, nNext)));
          nIndex = nNext + PATTERN_NEWLINE.length ();
        }
        else
        {
          ret.add (new HCDiv (sText.substring (nIndex)));
          break;
        }
      }
    }
    return ret;
  }

  /**
   * Helper method to enforce correct element nesting. See
   * http://www.w3.org/TR/xhtml1#prohibitions
   * 
   * @param aElements
   *        The tag names to search. May not be <code>null</code>.
   * @return The element with the passed tag name on any level, or
   *         <code>null</code> if no such element exists.
   */
  @Nullable
  public static final IHCElement <?> recursiveGetChildWithTagName (@Nonnull final IHasChildren <? extends IHCBaseNode> aOwner,
                                                                   @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    if (ArrayHelper.isEmpty (aElements))
      throw new IllegalArgumentException ("No tag name to search was provided");

    if (aOwner.hasChildren ())
    {
      final List <IHCBaseNode> aOpen = new ArrayList <IHCBaseNode> (aOwner.getChildren ());
      while (!aOpen.isEmpty ())
      {
        // get current node
        final IHCBaseNode aCurrent = aOpen.remove (0);

        // is it an element
        if (aCurrent instanceof IHCElement <?>)
        {
          final IHCElement <?> aCurrentElement = (IHCElement <?>) aCurrent;
          for (final EHTMLElement aElement : aElements)
            if (aCurrentElement.getTagName ().equals (aElement.getElementName ()))
              return aCurrentElement;
        }

        // does the node has children
        if (aCurrent instanceof IHasChildren <?>)
        {
          final IHasChildren <IHCBaseNode> aHasChildren = GenericReflection.<IHCBaseNode, IHasChildren <IHCBaseNode>> uncheckedCast (aCurrent);
          if (aHasChildren.hasChildren ())
            aOpen.addAll (0, aHasChildren.getChildren ());
        }
      }
    }
    return null;
  }

  public static boolean recursivelyContainsAtLeastOneTextNode (@Nullable final IHCBaseNode aStartNode)
  {
    if (aStartNode == null)
      return false;

    if (aStartNode instanceof HCTextNode)
      return true;

    if (aStartNode instanceof IHCNodeWithChildren <?>)
    {
      final IHCNodeWithChildren <?> aStartNodeHC = (IHCNodeWithChildren <?>) aStartNode;
      if (aStartNodeHC.hasChildren ())
        for (final IHCBaseNode aChildNode : aStartNodeHC.getChildren ())
          if (recursivelyContainsAtLeastOneTextNode (aChildNode))
            return true;
    }

    return false;
  }
}
