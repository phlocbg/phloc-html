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
package com.phloc.html.hc.html5;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.phloc.commons.url.SimpleURL;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.hc.conversion.HCConversionSettingsProvider;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.html.HCBody;
import com.phloc.html.hc.html.HCHtml;

/**
 * Instantiate and generate code for all HTML5 elements available
 * 
 * @author philip
 */
public final class HC5Test
{
  @Test
  public void testMainHC ()
  {
    final HCHtml h = new HCHtml (EHTMLVersion.HTML5);
    final HCBody b = h.getBody ();

    b.addChild (new HCArticle ());
    b.addChild (new HCArticle ("Bla foo"));
    b.addChild (new HCAside ());
    b.addChild (new HCAside ("Aside"));
    final HCAudio aAudio = new HCAudio ();
    aAudio.addSource (new HCSource (new SimpleURL ("a.mp3")));
    aAudio.addTrack (new HCTrack (new SimpleURL ("a.mp3")));
    b.addChild (aAudio);
    b.addChild (new HCBDI ());
    b.addChild (new HCBDI ("bidirectional"));
    b.addChild (new HCCanvas ());
    b.addChild (new HCCanvas ("Der kann was der Canvas"));
    b.addChild (new HCCommand ());
    b.addChild (new HCFigure ());
    b.addChild (new HCFigure ("Bla foo"));
    b.addChild (new HCFooter ());
    b.addChild (new HCFooter ("Bla foo"));
    b.addChild (new HCHeader ());
    b.addChild (new HCHeader ("Bla foo"));
    b.addChild (new HCHGroup ());
    b.addChild (new HCHGroup ("Bla foo"));
    b.addChild (new HCKeyGen ("kg1"));
    b.addChild (new HCMark ());
    b.addChild (new HCMark ("Bla foo"));
    b.addChild (new HCMeter ());
    b.addChild (new HCMeter ("Bla foo"));
    b.addChild (new HCNav ());
    b.addChild (new HCNav ("Bla foo"));
    b.addChild (new HCProgress ());
    b.addChild (new HCProgress ("Bla foo"));
    b.addChild (new HCRP ());
    b.addChild (new HCRP ("Bla foo"));
    b.addChild (new HCRT ());
    b.addChild (new HCRT ("Bla foo"));
    b.addChild (new HCRuby ());
    b.addChild (new HCRuby ("Bla foo"));
    b.addChild (new HCSection ());
    b.addChild (new HCSection ("Bla foo"));
    b.addChild (new HCTime ());
    b.addChild (new HCTime ("Bla foo"));
    final HCVideo aVideo = new HCVideo ();
    aVideo.addSource (new HCSource (new SimpleURL ("a.avi")));
    aVideo.addTrack (new HCTrack (new SimpleURL ("a.avi")));
    b.addChild (aVideo);
    b.addChild (new HCWBR ());

    final IHCConversionSettings aCS = new HCConversionSettingsProvider (EHTMLVersion.HTML5).getConversionSettings (true);
    assertNotNull (h.getAsNode (aCS));
    System.out.print (h.getAsHTMLString (aCS));
  }
}