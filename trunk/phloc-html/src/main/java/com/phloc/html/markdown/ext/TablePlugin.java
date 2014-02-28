package com.phloc.html.markdown.ext;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.phloc.commons.annotations.WorkInProgress;

@WorkInProgress
public class TablePlugin extends AbstractPlugin
{
  public TablePlugin ()
  {
    super ("table");
  }

  private int findSeparatorLine (final int beginIndex, final List <String> lines)
  {
    for (int i = beginIndex; i < lines.size (); i++)
    {
      final String line = lines.get (i);
      if (Pattern.matches ("- ", line))
      {
        return i;
      }
    }
    return -1;
  }

  @SuppressWarnings ("unused")
  @Override
  public void emit (final StringBuilder out, final List <String> lines, final Map <String, String> params)
  {
    final int ioh = findSeparatorLine (0, lines);
    String headerLine = null;
    String footerLine = null;
    if (ioh != -1)
    {
      headerLine = lines.get (ioh);
      final int iof = findSeparatorLine (ioh, lines);
      if (iof != -1)
      {
        footerLine = lines.get (iof);
      }
    }
  }
}
