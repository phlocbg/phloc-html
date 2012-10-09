package com.phloc.html.hc.htmlext;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.state.EFinish;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCHasChildren;

public interface IHCIteratorCallback
{
  /**
   * Callback method
   * 
   * @param aParentNode
   *        Optional parent node. May be <code>null</code> for the initial
   *        element.
   * @param aChildNode
   *        The current child node. Never <code>null</code>.
   * @return {@link EFinish#FINISHED} to break iteration and
   *         {@link EFinish#UNFINISHED} to continue iteration.
   */
  @Nonnull
  EFinish call (@Nullable IHCHasChildren aParentNode, @Nonnull IHCBaseNode aChildNode);
}
