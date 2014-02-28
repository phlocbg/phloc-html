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
 * Decorator interface.
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
public interface IDecorator
{
  /**
   * Called when a paragraph is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;p>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openParagraph (StringBuilder out);

  /**
   * Called when a paragraph is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/p>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeParagraph (StringBuilder out);

  /**
   * Called when a blockquote is opened. Default implementation is:
   * 
   * <pre>
   * <code>out.append("&lt;blockquote>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openBlockquote (StringBuilder out);

  /**
   * Called when a blockquote is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/blockquote>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeBlockquote (StringBuilder out);

  /**
   * Called when a code block is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;pre>&lt;code>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openCodeBlock (StringBuilder out);

  /**
   * Called when a code block is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/code>&lt;/pre>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeCodeBlock (StringBuilder out);

  /**
   * Called when a code span is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;code>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openCodeSpan (StringBuilder out);

  /**
   * Called when a code span is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/code>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeCodeSpan (StringBuilder out);

  /**
   * Called when a headline is opened.
   * <p>
   * <strong>Note:</strong> Don't close the HTML tag!
   * </p>
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code> out.append("&lt;h");
   * out.append(level);</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openHeadline (StringBuilder out, int level);

  /**
   * Called when a headline is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code> out.append("&lt;/h");
   * out.append(level);
   * out.append(">\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeHeadline (StringBuilder out, int level);

  /**
   * Called when a strong span is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;strong>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openStrong (StringBuilder out);

  /**
   * Called when a strong span is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/strong>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeStrong (StringBuilder out);

  /**
   * Called when a strike span is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;s>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openStrike (StringBuilder out);

  /**
   * Called when a strike span is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/s>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeStrike (StringBuilder out);

  /**
   * Called when an emphasis span is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;em>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openEmphasis (StringBuilder out);

  /**
   * Called when an emphasis span is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/em>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeEmphasis (StringBuilder out);

  /**
   * Called when a superscript span is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;sup>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openSuper (StringBuilder out);

  /**
   * Called when a superscript span is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/sup>");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeSuper (StringBuilder out);

  /**
   * Called when an ordered list is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;ol>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openOrderedList (StringBuilder out);

  /**
   * Called when an ordered list is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/ol>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeOrderedList (StringBuilder out);

  /**
   * Called when an unordered list is opened.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;ul>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openUnorderedList (StringBuilder out);

  /**
   * Called when an unordered list is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/ul>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeUnorderedList (StringBuilder out);

  /**
   * Called when a list item is opened.
   * <p>
   * <strong>Note:</strong> Don't close the HTML tag!
   * </p>
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;li");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openListItem (StringBuilder out);

  /**
   * Called when a list item is closed.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;/li>\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void closeListItem (StringBuilder out);

  /**
   * Called when a horizontal ruler is encountered.
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;hr />\n");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void horizontalRuler (StringBuilder out);

  /**
   * Called when a link is opened.
   * <p>
   * <strong>Note:</strong> Don't close the HTML tag!
   * </p>
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;a");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openLink (StringBuilder out);

  /**
   * Called when an image is opened.
   * <p>
   * <strong>Note:</strong> Don't close the HTML tag!
   * </p>
   * <p>
   * Default implementation is:
   * </p>
   * 
   * <pre>
   * <code>out.append("&lt;img");</code>
   * </pre>
   * 
   * @param out
   *        The StringBuilder to write to.
   */
  void openImage (StringBuilder out);
}
