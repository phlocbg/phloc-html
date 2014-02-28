package com.phloc.html.markdown.ext;

import java.util.List;
import java.util.Map;

public abstract class AbstractPlugin
{
  protected String m_sIdPlugin;

  public AbstractPlugin (final String idPlugin)
  {
    m_sIdPlugin = idPlugin;
  }

  public abstract void emit (final StringBuilder out, final List <String> lines, final Map <String, String> params);

  public String getIdPlugin ()
  {
    return m_sIdPlugin;
  }
}
