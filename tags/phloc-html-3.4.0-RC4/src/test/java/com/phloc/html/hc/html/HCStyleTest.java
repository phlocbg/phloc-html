/**
 * Copyright (C) 2006-2012 phloc systems
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
package com.phloc.html.hc.html;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.phloc.html.hc.conversion.DefaultHCConversionSettingsProvider;

/**
 * Test class for class {@link HCStyle}.
 * 
 * @author philip
 */
public final class HCStyleTest
{
  @Test
  public void testSimple ()
  {
    final HCStyle aStyle = new HCStyle ("div{color:red;}");
    assertEquals ("<style type=\"text/css\">div{color:red;}</style>",
                  aStyle.getAsHTMLString (DefaultHCConversionSettingsProvider.getStaticConversionSettings (false)));
  }

  @Test
  public void testQuoted ()
  {
    HCStyle aStyle = new HCStyle ("div{background:url('foo.gif');}");
    assertEquals ("<style type=\"text/css\">div{background:url('foo.gif');}</style>",
                  aStyle.getAsHTMLString (DefaultHCConversionSettingsProvider.getStaticConversionSettings (false)));
    HCStyle.setDefaultEscapeText (true);
    aStyle = new HCStyle ("div{background:url('foo.gif');}");
    assertEquals ("<style type=\"text/css\">div{background:url(&#39;foo.gif&#39;);}</style>",
                  aStyle.getAsHTMLString (DefaultHCConversionSettingsProvider.getStaticConversionSettings (false)));
    HCStyle.setDefaultEscapeText (false);
    aStyle = new HCStyle ("div{background:url('foo.gif');}");
    assertEquals ("<style type=\"text/css\">div{background:url('foo.gif');}</style>",
                  aStyle.getAsHTMLString (DefaultHCConversionSettingsProvider.getStaticConversionSettings (false)));
  }
}
