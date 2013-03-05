package com.phloc.html;

import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.PresentForCodeCoverage;

/**
 * Source:
 * http://www.w3.org/html/wg/drafts/html/master/dom.html#kinds-of-content
 * 
 * @author philip
 */
@Immutable
public final class CHTMLContentKind
{
  public static final int VALUE_METADATA = 0x01;
  public static final int VALUE_FLOW = 0x02;
  public static final int VALUE_SECTIONING = 0x04;
  public static final int VALUE_HEADING = 0x08;
  public static final int VALUE_PHRASING = 0x10;
  public static final int VALUE_EMBEDDED = 0x20;
  public static final int VALUE_INTERACTIVE = 0x40;

  @SuppressWarnings ("unused")
  @PresentForCodeCoverage
  private static final CHTMLContentKind s_aInstance = new CHTMLContentKind ();

  private CHTMLContentKind ()
  {}
}
