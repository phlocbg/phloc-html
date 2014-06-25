package com.phloc.html.hc.ext;

import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.resource.css.ICSSPathProvider;
import com.phloc.html.resource.js.IJSPathProvider;

public interface IHCNodeWithExternalResources extends IHCNode
{
  @Nonnull
  @ReturnsMutableCopy
  List <? extends ICSSPathProvider> getAllCSSPathProviders ();

  @Nonnull
  @ReturnsMutableCopy
  List <? extends IJSPathProvider> getAllJSPathProviders ();
}
