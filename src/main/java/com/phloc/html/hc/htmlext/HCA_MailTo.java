/**
 * Copyright (C) 2006-2013 phloc systems
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
package com.phloc.html.hc.htmlext;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.EURLProtocol;
import com.phloc.commons.url.ReadonlySimpleURL;
import com.phloc.html.hc.html.HCA;

public class HCA_MailTo extends HCA
{
  public HCA_MailTo (@Nonnull final String sEmail)
  {
    super (new ReadonlySimpleURL (EURLProtocol.MAILTO.getProtocol () + sEmail));
  }

  @Nullable
  public static HCA_MailTo createLinkedEmail (@Nullable final String sAddress)
  {
    return createLinkedEmail (sAddress, sAddress);
  }

  @Nullable
  public static HCA_MailTo createLinkedEmail (@Nullable final String sAddress, @Nullable final String sPersonal)
  {
    if (StringHelper.hasNoText (sAddress))
      return null;

    final HCA_MailTo ret = new HCA_MailTo (sAddress);
    ret.addChild (StringHelper.getNotNull (sPersonal, sAddress));
    return ret;
  }
}
