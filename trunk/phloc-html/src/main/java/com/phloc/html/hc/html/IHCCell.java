package com.phloc.html.hc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.html.hc.IHCElementWithChildren;
import com.phloc.html.hc.api.EHCCellAlign;

public interface IHCCell <IMPLTYPE extends IHCCell <IMPLTYPE>> extends IHCElementWithChildren <IMPLTYPE>
{
  @Nullable
  HCRow getParentRow ();

  int getColspan ();

  @Nonnull
  IMPLTYPE setColspan (int nColspan);

  int getRowspan ();

  @Nonnull
  IMPLTYPE setRowspan (int nRowspan);

  @Nullable
  EHCCellAlign getAlign ();

  @Nonnull
  IMPLTYPE setAlign (@Nullable EHCCellAlign eAlign);
}
