package com.phloc.html.markdown.ext;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class HtmlAttributes
{
  private final Map <String, Map <String, String>> m_aAttrsByTag = new HashMap <String, Map <String, String>> ();

  public HtmlAttributes put (final String tagName, final String attName, final String attValue)
  {
    Map <String, String> atts = m_aAttrsByTag.get (tagName);
    if (atts == null)
    {
      atts = new LinkedHashMap <String, String> ();
      m_aAttrsByTag.put (tagName, atts);
    }
    atts.put (attName, attValue);
    return this;
  }

  @Nullable
  public Map <String, String> get (final String tagName)
  {
    return m_aAttrsByTag.get (tagName);
  }
}
