/*
 * Copyright (C) 2011 René Jeschke <rene_jeschke@yahoo.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.markdown;

/**
 * Default Decorator implementation.
 * <p>
 * Example for a user Decorator having a class attribute on &lt;p> tags.
 * </p>
 * 
 * <pre>
 * <code>public class MyDecorator extends DefaultDecorator
 * {
 *     &#64;Override
 *     public void openParagraph(StringBuilder out)
 *     {
 *         out.append("&lt;p class=\"myclass\">");
 *     }
 * }
 * </code>
 * </pre>
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
public class DefaultDecorator implements IDecorator
{
  /** Constructor. */
  public DefaultDecorator ()
  {
    // empty
  }

  @Override
  public void openParagraph (final StringBuilder out)
  {
    out.append ("<p>");
  }

  @Override
  public void closeParagraph (final StringBuilder out)
  {
    out.append ("</p>\n");
  }

  @Override
  public void openBlockquote (final StringBuilder out)
  {
    out.append ("<blockquote>");
  }

  @Override
  public void closeBlockquote (final StringBuilder out)
  {
    out.append ("</blockquote>\n");
  }

  @Override
  public void openCodeBlock (final StringBuilder out)
  {
    out.append ("<pre><code>");
  }

  @Override
  public void closeCodeBlock (final StringBuilder out)
  {
    out.append ("</code></pre>\n");
  }

  @Override
  public void openCodeSpan (final StringBuilder out)
  {
    out.append ("<code>");
  }

  @Override
  public void closeCodeSpan (final StringBuilder out)
  {
    out.append ("</code>");
  }

  @Override
  public void openHeadline (final StringBuilder out, final int level)
  {
    out.append ("<h");
    out.append (level);
  }

  @Override
  public void closeHeadline (final StringBuilder out, final int level)
  {
    out.append ("</h");
    out.append (level);
    out.append (">\n");
  }

  @Override
  public void openStrong (final StringBuilder out)
  {
    out.append ("<strong>");
  }

  @Override
  public void closeStrong (final StringBuilder out)
  {
    out.append ("</strong>");
  }

  @Override
  public void openStrike (final StringBuilder out)
  {
    out.append ("<s>");
  }

  @Override
  public void closeStrike (final StringBuilder out)
  {
    out.append ("</s>");
  }

  @Override
  public void openEmphasis (final StringBuilder out)
  {
    out.append ("<em>");
  }

  @Override
  public void closeEmphasis (final StringBuilder out)
  {
    out.append ("</em>");
  }

  @Override
  public void openSuper (final StringBuilder out)
  {
    out.append ("<sup>");
  }

  @Override
  public void closeSuper (final StringBuilder out)
  {
    out.append ("</sup>");
  }

  @Override
  public void openOrderedList (final StringBuilder out)
  {
    out.append ("<ol>\n");
  }

  @Override
  public void closeOrderedList (final StringBuilder out)
  {
    out.append ("</ol>\n");
  }

  @Override
  public void openUnorderedList (final StringBuilder out)
  {
    out.append ("<ul>\n");
  }

  @Override
  public void closeUnorderedList (final StringBuilder out)
  {
    out.append ("</ul>\n");
  }

  @Override
  public void openListItem (final StringBuilder out)
  {
    out.append ("<li");
  }

  @Override
  public void closeListItem (final StringBuilder out)
  {
    out.append ("</li>\n");
  }

  @Override
  public void horizontalRuler (final StringBuilder out)
  {
    out.append ("<hr />\n");
  }

  @Override
  public void openLink (final StringBuilder out)
  {
    out.append ("<a");
  }

  @Override
  public void openImage (final StringBuilder out)
  {
    out.append ("<img");
  }
}
