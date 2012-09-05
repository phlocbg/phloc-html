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

import java.util.List;

import javax.annotation.Nonnull;

import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.htmlext.HCUtils;
import com.phloc.html.js.builder.jquery.JQuery;
import com.phloc.html.js.provider.CollectingJSCodeProvider;
import com.phloc.html.js.provider.UnparsedJSCodeProvider;
import com.phloc.html.resource.js.JSInline;

public class HCHeadDefaultJQueryOutOfBandHandler implements IHCHeadOutOfBandNodeHandler
{
  public HCHeadDefaultJQueryOutOfBandHandler ()
  {}

  public void handleOutOfBandNode (@Nonnull final HCHead aHead, @Nonnull final IHCBaseNode aOutOfBandNode)
  {
    // Flatten list
    final List <IHCBaseNode> aRealList = HCUtils.getAsFlattenedList (aOutOfBandNode);

    final CollectingJSCodeProvider aJS = new CollectingJSCodeProvider ();
    for (final IHCBaseNode aNode : aRealList)
    {
      if (aNode instanceof HCScript)
        aJS.append (new UnparsedJSCodeProvider (((HCScript) aNode).getJSContent ()));
      else
        aHead.addOutOfBandNode (aNode);
    }
    if (!aJS.isEmpty ())
    {
      // Ensure the inline JS is executed after the document has been loaded
      // Note: has dependency to jQuery
      aHead.addJS (new JSInline (JQuery.onDocumentReady (aJS)));
    }
  }
}
