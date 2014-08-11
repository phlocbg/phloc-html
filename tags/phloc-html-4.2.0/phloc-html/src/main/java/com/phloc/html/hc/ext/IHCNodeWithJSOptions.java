package com.phloc.html.hc.ext;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.js.builder.JSAssocArray;

public interface IHCNodeWithJSOptions extends IHCNode
{
  @Nonnull
  @ReturnsMutableCopy
  JSAssocArray getJSOptions ();
}
