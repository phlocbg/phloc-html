package com.phloc.html.markdown.ext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class WebSequencePlugin extends AbstractPlugin
{
  public WebSequencePlugin ()
  {
    super ("sequence");
  }

  @Override
  public void emit (final StringBuilder out, final List <String> lines, final Map <String, String> params)
  {
    String style = params.get ("style");
    if (style == null)
    {
      style = "default";
    }
    String content = null;
    for (final String line : lines)
    {
      if (content == null)
      {
        content = line;
      }
      else
      {
        content = content + "\n" + line;
      }
    }

    content = content + "\n";

    try
    {
      final String link = getSequenceDiagram (content, style);

      if (link != null)
      {
        out.append ("<img src=\"");
        out.append (link);
        out.append ("\"/>");
      }
    }
    catch (final IOException e)
    {
      throw new RuntimeException ("Error while rendering websequenceplugin", e);
    }
  }

  private String getSequenceDiagram (final String text, final String style) throws IOException
  {
    // Build parameter string
    final String data = "style=" + style + "&message=" + URLEncoder.encode (text, "UTF-8") + "&apiVersion=1";

    // Send the request
    final URL url = new URL ("http://www.websequencediagrams.com");
    final URLConnection conn = url.openConnection ();
    conn.setDoOutput (true);
    final OutputStreamWriter writer = new OutputStreamWriter (conn.getOutputStream ());

    // write parameters
    writer.write (data);
    writer.flush ();

    // Get the response
    final StringBuffer answer = new StringBuffer ();
    final BufferedReader reader = new BufferedReader (new InputStreamReader (conn.getInputStream ()));
    String line;
    while ((line = reader.readLine ()) != null)
    {
      answer.append (line);
    }
    writer.close ();
    reader.close ();

    final String json = answer.toString ();

    final int start = json.indexOf ("?png=");
    final int end = json.indexOf ("\"", start);

    if (start != -1 && end != -1)
    {
      final String surl = "http://www.websequencediagrams.com/" + json.substring (start, end);
      return surl;
    }
    return null;

  }
}
