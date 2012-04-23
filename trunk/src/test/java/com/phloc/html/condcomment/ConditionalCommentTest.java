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
package com.phloc.html.condcomment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroElement;
import com.phloc.commons.microdom.impl.MicroText;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.version.Version;

public final class ConditionalCommentTest
{
  @Test
  public void testCreateForIEExactVersion ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIEExactVersion (new Version (5, 5));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroText ("Test content!"));
    assertEquals ("<!--[if IE 5.5]>" +
                  CGlobal.LINE_SEPARATOR +
                  "Test content!" +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }

  @Test
  public void testCreateForIENotVersion ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIENotVersion (new Version (5, 5));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroText ("Test content!"));
    assertEquals ("<!--[if !IE 5.5]>" +
                  CGlobal.LINE_SEPARATOR +
                  "Test content!" +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }

  @Test
  public void testCreateForIELowerThanVersion ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIELowerThanVersion (new Version (5, 5));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroText ("Test content!"));
    assertEquals ("<!--[if lt IE 5.5]>" +
                  CGlobal.LINE_SEPARATOR +
                  "Test content!" +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }

  @Test
  public void testCreateForIELowerOrEqualThanVersion ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIELowerOrEqualThanVersion (new Version (5, 5));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroText ("Test content!"));
    assertEquals ("<!--[if lte IE 5.5]>" +
                  CGlobal.LINE_SEPARATOR +
                  "Test content!" +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }

  @Test
  public void testCreateForIEGreaterThanVersion ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIEGreaterThanVersion (new Version (5, 5));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroText ("Test content!"));
    assertEquals ("<!--[if gt IE 5.5]>" +
                  CGlobal.LINE_SEPARATOR +
                  "Test content!" +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }

  @Test
  public void testCreateForIEGreaterOrEqualThanVersion ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIEGreaterOrEqualThanVersion (new Version (6));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroText ("Test content!"));
    assertEquals ("<!--[if gte IE 6]>" +
                  CGlobal.LINE_SEPARATOR +
                  "Test content!" +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }

  @Test
  public void testCreateForIEGreaterOrEqualThanVersionElement ()
  {
    final ConditionalComment aCC = ConditionalComment.createForIEGreaterOrEqualThanVersion (new Version (6));
    final IMicroNode aNode = aCC.getNodeWrappedInCondition (new MicroElement ("tag"));
    assertEquals ("<!--[if gte IE 6]>" +
                  CGlobal.LINE_SEPARATOR +
                  "<tag />" +
                  CGlobal.LINE_SEPARATOR +
                  "<![endif]-->" +
                  CGlobal.LINE_SEPARATOR, MicroWriter.getXMLString (aNode));
  }
}
