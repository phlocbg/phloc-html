package com.phloc.html.markdown;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncludePlugin extends AbstractPlugin
{

  public static final String DEFAULT_CHARSET = System.getProperty ("file.encoding");

  public IncludePlugin ()
  {
    super ("include");
  }

  @Override
  public void emit (final StringBuilder out, final List <String> lines, final Map <String, String> params)
  {
    final String src = params.get ("src");
    try
    {
      final String content2 = getContent (src);
      if (content2 != null)
      {
        out.append (content2);
      }
    }
    catch (final Exception e)
    {
      throw new RuntimeException ("Error while rendering " + this.getClass ().getName (), e);
    }
  }

  private String getContent (final String src) throws IOException
  {
    final URL url = new URL (new URL ("file:"), src);

    final URLConnection urlc = url.openConnection ();

    String charset = getCharsetFromContentTypeString (urlc.getHeaderField ("Content-Type"));
    if (charset == null)
    {
      charset = getCharsetFromContent (url);
    }
    if (charset == null)
    {
      charset = DEFAULT_CHARSET;
    }

    System.err.println (charset);

    urlc.connect ();
    final InputStream is = urlc.getInputStream ();
    final InputStreamReader isr = new InputStreamReader (is, charset);
    final BufferedReader br = new BufferedReader (isr);
    final StringWriter sw = new StringWriter ();
    final BufferedWriter bw = new BufferedWriter (sw);
    String line = null;
    while ((line = br.readLine ()) != null)
    {
      bw.write (line);
      bw.newLine ();

    }
    br.close ();
    bw.close ();
    return sw.toString ();

  }

  // private String resolveContentEncoding(URLConnection urlc, String charset) {
  // if (charset == null) {
  // charset =
  // getCharsetFromContentTypeString(urlc.getHeaderField("Content-Type"));
  // }
  // if (charset == null) {
  // charset = getCharsetFromContent(url);
  // }
  // if (charset == null) {
  // charset = DEFAULT_CHARSET;
  // }
  // return charset;
  // }
  public static String getCharsetFromContentTypeString (final String contentType)
  {
    if (contentType != null)
    {
      final String pattern = "charset=([a-z\\d\\-]*)";
      final Matcher matcher = Pattern.compile (pattern, Pattern.CASE_INSENSITIVE).matcher (contentType);
      if (matcher.find ())
      {
        final String charset = matcher.group (1);
        if (Charset.isSupported (charset))
        {
          return charset;
        }
      }
    }

    return null;
  }

  public static String getCharsetFromContent (final URL url) throws IOException
  {
    final InputStream stream = url.openStream ();
    final byte chunk[] = new byte [2048];
    final int bytesRead = stream.read (chunk);
    if (bytesRead > 0)
    {
      final String startContent = new String (chunk);
      final String pattern = "\\<meta\\s*http-equiv=[\\\"\\']content-type[\\\"\\']\\s*content\\s*=\\s*[\"']text/html\\s*;\\s*charset=([a-z\\d\\-]*)[\\\"\\'\\>]";
      final Matcher matcher = Pattern.compile (pattern, Pattern.CASE_INSENSITIVE).matcher (startContent);
      if (matcher.find ())
      {
        final String charset = matcher.group (1);
        if (Charset.isSupported (charset))
        {
          return charset;
        }
      }
    }

    return null;
  }

}
