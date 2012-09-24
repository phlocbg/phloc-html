package com.phloc.html.hc.conversion;

public class HCPerformanceSettings
{
  private static boolean DEFAULT_JS_AT_END = false;
  private static boolean s_bJavaScriptAtEnd = DEFAULT_JS_AT_END;

  private HCPerformanceSettings ()
  {}

  public static void setJavaScriptAtEnd (final boolean bAtEnd)
  {
    s_bJavaScriptAtEnd = bAtEnd;
  }

  public static boolean isJavaScriptAtEnd ()
  {
    return s_bJavaScriptAtEnd;
  }
}
