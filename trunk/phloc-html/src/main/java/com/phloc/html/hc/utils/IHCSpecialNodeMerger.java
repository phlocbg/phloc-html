package com.phloc.html.hc.utils;

import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCNode;

public interface IHCSpecialNodeMerger
{
  @Nonnull
  @ReturnsMutableCopy
  List <IHCNode> mergeSpecialNodes (@Nonnull Iterable <? extends IHCNode> aNodes);
}
