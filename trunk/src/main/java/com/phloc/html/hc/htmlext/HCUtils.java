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
package com.phloc.html.hc.htmlext;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mutable.MutableBoolean;
import com.phloc.commons.mutable.Wrapper;
import com.phloc.commons.state.EFinish;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCWrappingNode;
import com.phloc.html.hc.html.HCBR;
import com.phloc.html.hc.html.HCDiv;
import com.phloc.html.hc.impl.HCNodeList;
import com.phloc.html.hc.impl.HCTextNode;

@Immutable
public final class HCUtils
{
  private static final char PATTERN_NEWLINE = '\n';
  private static final int PATTERN_NEWLINE_LENGTH = 1;

  private HCUtils ()
  {}

  @Nonnull
  public static List <IHCNode> nl2brList (@Nullable final String sText)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (StringHelper.hasText (sText))
    {
      int nIndex = 0;
      while (nIndex < sText.length ())
      {
        final int nNext = sText.indexOf (PATTERN_NEWLINE, nIndex);
        if (nNext >= 0)
        {
          if (nNext > nIndex)
            ret.add (new HCTextNode (sText.substring (nIndex, nNext)));
          ret.add (new HCBR ());
          nIndex = nNext + PATTERN_NEWLINE_LENGTH;
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
      while (nIndex < sText.length ())
      {
        final int nNext = sText.indexOf (PATTERN_NEWLINE, nIndex);
        if (nNext >= 0)
        {
          if (nNext > nIndex)
            ret.add (HCDiv.create (sText.substring (nIndex, nNext)));
          nIndex = nNext + PATTERN_NEWLINE_LENGTH;
        }
        else
        {
          ret.add (HCDiv.create (sText.substring (nIndex)));
          break;
        }
      }
    }
    return ret;
  }

  @Nonnull
  public static List <IHCNode> list2brList (@Nullable final Iterable <String> aCont)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (aCont != null)
    {
      for (final String sText : aCont)
      {
        if (!ret.isEmpty ())
          ret.add (new HCBR ());
        ret.add (new HCTextNode (sText));
      }
    }
    return ret;
  }

  @Nonnull
  public static List <IHCNode> list2divList (@Nullable final Iterable <String> aCont)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (aCont != null)
      for (final String sText : aCont)
        ret.add (HCDiv.create (sText));
    return ret;
  }

  /**
   * Helper method to enforce correct element nesting. See
   * http://www.w3.org/TR/xhtml1#prohibitions
   * 
   * @param aElements
   *        The tag names to search. May not be <code>null</code>.
   * @return The first element with the passed tag name on any level, or
   *         <code>null</code> if no such element exists.
   */
  @Nullable
  public static IHCElement <?> recursiveGetFirstChildWithTagName (@Nonnull final IHCHasChildren aOwner,
                                                                  @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    if (aOwner == null)
      throw new NullPointerException ("owner");
    if (ArrayHelper.isEmpty (aElements))
      throw new IllegalArgumentException ("No tag name to search was provided");

    final Wrapper <IHCElement <?>> ret = new Wrapper <IHCElement <?>> ();
    iterateChildren (aOwner, new IHCIteratorCallback ()
    {
      @Nullable
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCElement <?>)
        {
          final IHCElement <?> aCurrentElement = (IHCElement <?>) aChildNode;
          final String sCurrentTagName = aCurrentElement.getTagName ();
          for (final EHTMLElement aElement : aElements)
            if (sCurrentTagName.equalsIgnoreCase (aElement.getElementName ()))
            {
              ret.set (aCurrentElement);
              return EFinish.FINISHED;
            }
        }
        return EFinish.UNFINISHED;
      }
    });
    return ret.get ();
  }

  public static boolean recursiveContainsChildWithTagName (@Nonnull final IHCHasChildren aOwner,
                                                           @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    return recursiveGetFirstChildWithTagName (aOwner, aElements) != null;
  }

  /**
   * Helper method to enforce correct element nesting. See
   * http://www.w3.org/TR/xhtml1#prohibitions
   * 
   * @param aElements
   *        The tag names to search. May not be <code>null</code>.
   * @return The first element with a different than the passed tag name on any
   *         level, or <code>null</code> if no such element exists.
   */
  @Nullable
  public static IHCElement <?> recursiveGetFirstChildWithDifferentTagName (@Nonnull final IHCHasChildren aOwner,
                                                                           @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    if (aOwner == null)
      throw new NullPointerException ("owner");
    if (ArrayHelper.isEmpty (aElements))
      throw new IllegalArgumentException ("No tag name to search was provided");

    final Wrapper <IHCElement <?>> ret = new Wrapper <IHCElement <?>> ();
    iterateChildren (aOwner, new IHCIteratorCallback ()
    {
      @Nullable
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCElement <?>)
        {
          final IHCElement <?> aCurrentElement = (IHCElement <?>) aChildNode;
          final String sCurrentTagName = aCurrentElement.getTagName ();
          boolean bFound = false;
          for (final EHTMLElement aElement : aElements)
            if (sCurrentTagName.equalsIgnoreCase (aElement.getElementName ()))
            {
              bFound = true;
              break;
            }
          if (!bFound)
          {
            ret.set (aCurrentElement);
            return EFinish.FINISHED;
          }
        }
        return EFinish.UNFINISHED;
      }
    });
    return ret.get ();
  }

  public static boolean recursiveContainsChildWithDifferentTagName (@Nonnull final IHCHasChildren aOwner,
                                                                    @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    return recursiveGetFirstChildWithDifferentTagName (aOwner, aElements) != null;
  }

  public static boolean recursiveContainsAtLeastOneTextNode (@Nullable final IHCNode aStartNode)
  {
    if (aStartNode == null)
      return false;

    if (aStartNode instanceof HCTextNode)
      return true;

    if (aStartNode instanceof IHCHasChildren)
    {
      final MutableBoolean ret = new MutableBoolean (false);
      iterateChildren ((IHCHasChildren) aStartNode, new IHCIteratorCallback ()
      {
        @Nullable
        public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
        {
          if (aChildNode instanceof HCTextNode)
          {
            ret.set (true);
            return EFinish.FINISHED;
          }
          return EFinish.UNFINISHED;
        }
      });
      return ret.booleanValue ();
    }

    return false;
  }

  @Nonnull
  private static EFinish _recursiveIterateTree (@Nonnull final IHCHasChildren aNode,
                                                @Nonnull final IHCIteratorCallback aCallback)
  {
    if (aNode.hasChildren ())
    {
      for (final IHCNode aChild : aNode.getChildren ())
      {
        // call callback
        if (aCallback.call (aNode, aChild).isFinished ())
          return EFinish.FINISHED;

        // does the node has children
        if (aChild instanceof IHCHasChildren)
          if (_recursiveIterateTree ((IHCHasChildren) aChild, aCallback).isFinished ())
            return EFinish.FINISHED;
      }
    }
    return EFinish.UNFINISHED;
  }

  /**
   * Recursively iterate the node and all child nodes of the passed node. The
   * difference to {@link #iterateChildren(IHCHasChildren, IHCIteratorCallback)}
   * is, that the callback is also invoked on the passed node.
   * 
   * @param aNode
   *        The node to be iterated.
   * @param aCallback
   *        The callback to be invoked on every child
   */
  public static void iterateTree (@Nonnull final IHCHasChildren aNode, @Nonnull final IHCIteratorCallback aCallback)
  {
    if (aNode == null)
      throw new NullPointerException ("node");
    if (aCallback == null)
      throw new NullPointerException ("callback");

    // call callback on start node
    if (aCallback.call (null, aNode).isUnfinished ())
      _recursiveIterateTree (aNode, aCallback);
  }

  /**
   * Recursively iterate all child nodes of the passed node.
   * 
   * @param aNode
   *        The node who's children should be iterated.
   * @param aCallback
   *        The callback to be invoked on every child
   */
  public static void iterateChildren (@Nonnull final IHCHasChildren aNode, @Nonnull final IHCIteratorCallback aCallback)
  {
    if (aNode == null)
      throw new NullPointerException ("node");
    if (aCallback == null)
      throw new NullPointerException ("callback");

    _recursiveIterateTree (aNode, aCallback);
  }

  /**
   * Find the first HTML child element within a start element. This check
   * considers both lower- and upper-case element names. Mixed case is not
   * supported!
   * 
   * @param aElement
   *        The element to search in
   * @param eHTMLElement
   *        The HTML element to search.
   * @return <code>null</code> if no such child element is present.
   */
  @Nullable
  public static IMicroElement getFirstChildElement (@Nonnull final IMicroElement aElement,
                                                    @Nonnull final EHTMLElement eHTMLElement)
  {
    IMicroElement aChild = aElement.getFirstChildElement (eHTMLElement.getElementNameLowerCase ());
    if (aChild == null)
      aChild = aElement.getFirstChildElement (eHTMLElement.getElementNameUpperCase ());
    return aChild;
  }

  /**
   * Get a list of all HTML child elements of the given element. This methods
   * handles lower- and upper-cased elements.
   * 
   * @param aElement
   *        The element to search in
   * @param eHTMLElement
   *        The HTML element to search
   * @return A non-<code>null</code> list where the lower-case elements are
   *         listed before the upper-case elements.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IMicroElement> getChildElements (@Nonnull final IMicroElement aElement,
                                                       @Nonnull final EHTMLElement eHTMLElement)
  {
    final List <IMicroElement> ret = new ArrayList <IMicroElement> ();
    ret.addAll (aElement.getChildElements (eHTMLElement.getElementNameLowerCase ()));
    ret.addAll (aElement.getChildElements (eHTMLElement.getElementNameUpperCase ()));
    return ret;
  }

  private static void _recursiveAddFlattened (@Nullable final IHCNode aNode, @Nonnull final List <IHCNode> aRealList)
  {
    if (aNode != null)
    {
      // Only check HCNodeList and not IHCNodeWithChildren because other
      // surrounding elements would not be handled correctly!
      if (aNode instanceof HCNodeList)
      {
        final HCNodeList x = (HCNodeList) aNode;
        if (x.hasChildren ())
          for (final IHCNode aChild : x.getChildren ())
            _recursiveAddFlattened (aChild, aRealList);
      }
      else
        aRealList.add (aNode);
    }
  }

  /**
   * Inline all contained node lists so that a "flat" list results. This only
   * flattens something if the passed node is an {@link HCNodeList} and all
   * node-lists directly contained in the other node lists. Node-lists that are
   * hidden deep inside the tree are not considered!
   * 
   * @param aNode
   *        The source node. May be <code>null</code>.
   * @return A non-<code>null</code> flattened list.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> getAsFlattenedList (@Nullable final IHCNode aNode)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    _recursiveAddFlattened (aNode, ret);
    return ret;
  }

  /**
   * Resolve all wrappings via {@link IHCWrappingNode} of the passed node.
   * 
   * @param aHCNode
   *        The node to be unwrapped. Never <code>null</code>.
   * @return The unwrapped node. May be the same as the parameter, if the node
   *         is not wrapped. Never <code>null</code>.
   */
  @Nonnull
  public static IHCNode getUnwrappedNode (@Nonnull final IHCNode aHCNode)
  {
    if (aHCNode instanceof IHCWrappingNode)
      return getUnwrappedNode (((IHCWrappingNode) aHCNode).getWrappedNode ());

    return aHCNode;
  }
}
