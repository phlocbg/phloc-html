package com.phloc.html.hc.conversion;

import javax.annotation.Nonnull;

import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.customize.HCDefaultCustomizer;
import com.phloc.html.hc.customize.IHCCustomizer;

public interface IHCConversionSettings
{
  /**
   * @return The HTML version to be used to transform HC nodes into XML nodes.
   */
  @Nonnull
  EHTMLVersion getHTMLVersion ();

  /**
   * @return <code>true</code> if the HTML output should be indented and
   *         aligned.
   */
  boolean isIdentAndAlignHTML ();

  /**
   * @return <code>true</code> if the CSS output should be indented and aligned.
   */
  boolean isIdentAndAlignCSS ();

  /**
   * @return <code>true</code> if the consistency checks are enabled,
   *         <code>false</code> otherwise.
   */
  boolean areConsistencyChecksEnabled ();

  /**
   * @return The current customizer to be used. Never <code>null</code>. By
   *         default a {@link HCDefaultCustomizer} object is returned.
   */
  @Nonnull
  IHCCustomizer getCustomizer ();
}
