package com.phloc.html;

import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.PresentForCodeCoverage;

/**
 * See http://dev.w3.org/html5/markup/common-models.html#common-models
 * 
 * @author philip
 */
@Immutable
public final class CHTMLContentModel
{
  public static final int VALUE_METADATA = CHTMLContentKind.VALUE_METADATA;
  public static final int VALUE_FLOW = CHTMLContentKind.VALUE_FLOW;
  public static final int VALUE_PHRASING = CHTMLContentKind.VALUE_PHRASING;

  @SuppressWarnings ("unused")
  @PresentForCodeCoverage
  private static final CHTMLContentModel s_aInstance = new CHTMLContentModel ();

  private CHTMLContentModel ()
  {}
}
