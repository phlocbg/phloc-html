package com.phloc.html.hc;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.html.hc.api.EHCCellAlign;
import com.phloc.html.hc.html.HCRow;

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
