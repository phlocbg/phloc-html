package com.phloc.html.hc.utils;

import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCNode;

public interface IHCSpecialNodeListModifier
{
  /**
   * Merge certain special nodes.
   * 
   * @param aNodes
   *        The source list of special nodes to be merged.
   * @return The modified list to be used for further processing.
   */
  @Nonnull
  @ReturnsMutableCopy
  List <? extends IHCNode> modifySpecialNodes (@Nonnull Iterable <? extends IHCNode> aNodes);
}
