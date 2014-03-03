/**
 * Copyright (C) 2006-2014 phloc systems
 * http://www.phloc.com
 * office[at]phloc[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.markdown;

/**
 * A markdown link reference.
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
final class LinkRef
{
  /** The link. */
  private final String m_sLink;
  /** The optional comment/title. */
  private String m_sTitle;
  /** Flag indicating that this is an abbreviation. */
  private final boolean m_bIsAbbrev;

  /**
   * Constructor.
   * 
   * @param link
   *        The link.
   * @param title
   *        The title (may be <code>null</code>).
   */
  public LinkRef (final String link, final String title, final boolean isAbbrev)
  {
    m_sLink = link;
    m_sTitle = title;
    m_bIsAbbrev = isAbbrev;
  }

  public String getLink ()
  {
    return m_sLink;
  }

  public String getTitle ()
  {
    return m_sTitle;
  }

  public void setTitle (final String sTitle)
  {
    m_sTitle = sTitle;
  }

  public boolean isAbbrev ()
  {
    return m_bIsAbbrev;
  }
}