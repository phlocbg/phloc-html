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
package com.phloc.html.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Test class for class CSSInlineHelper
 * 
 * @author philip
 */
@SuppressWarnings ("deprecation")
public final class CSSInlineHelperTest
{
  @Test
  public void testInline ()
  {
    assertNull (CSSInlineHelper.getBackgroundImageSource (null));
    assertNull (CSSInlineHelper.getBackgroundImageSource (""));
    assertNull (CSSInlineHelper.getBackgroundImageSource ("width:5px;"));
    assertEquals ("a.gif", CSSInlineHelper.getBackgroundImageSource ("background-image: url(a.gif);"));
    assertEquals ("a.gif",
                  CSSInlineHelper.getBackgroundImageSource ("width:5px; background-image: url(a.gif); height:7em;"));
  }

  @Test
  public void testReplace ()
  {
    assertNull (CSSInlineHelper.replaceBackgroundImageSource (null, null));
    assertNull (CSSInlineHelper.replaceBackgroundImageSource (null, ""));
    assertNull (CSSInlineHelper.replaceBackgroundImageSource (null, "b.gif"));
    assertEquals ("background-image: url(b.gif);",
                  CSSInlineHelper.replaceBackgroundImageSource ("background-image: url(a.gif);", "b.gif"));
    assertEquals ("width:5px; background-image: url(b.gif); height:7em;",
                  CSSInlineHelper.replaceBackgroundImageSource ("width:5px; background-image: url(a.gif); height:7em;",
                                                                "b.gif"));
  }
}