package com.phloc.html.hc.customize;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCElement;

public interface IHCCustomizer
{
  /**
   * Customize with some predefined classes etc.
   * 
   * @param aElement
   *        The element to be customized
   */
  void customizeHCElement (@Nonnull final IHCElement <?> aElement);

  /**
   * Get a custom out of band node
   * 
   * @param aElement
   *        The element to be customized
   * @return <code>null</code> if there is no custom out-of-band node
   */
  @Nullable
  IHCBaseNode getCustomOutOfBandNode (@Nonnull final IHCElement <?> aElement);
}
