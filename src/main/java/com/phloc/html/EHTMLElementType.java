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
package com.phloc.html;

import javax.annotation.concurrent.Immutable;

@Immutable
final class CHTMLElementType
{
  static final int VALUE_FLOW = 0x1;
  static final int VALUE_METADATA = 0x2;
  static final int VALUE_PHRASING = 0x4;

  private CHTMLElementType ()
  {}
}

/**
 * Contains the potential element meta types.<br>
 * See http://dev.w3.org/html5/markup/common-models.html#common-models
 * 
 * @author philip
 */
public enum EHTMLElementType
{
  FLOW (CHTMLElementType.VALUE_FLOW | CHTMLElementType.VALUE_PHRASING),
  FLOW_METADATA (CHTMLElementType.VALUE_FLOW | CHTMLElementType.VALUE_PHRASING | CHTMLElementType.VALUE_METADATA),
  PHRASING_METADATA (CHTMLElementType.VALUE_PHRASING | CHTMLElementType.VALUE_METADATA),
  METADATA (CHTMLElementType.VALUE_METADATA),
  PHRASING (CHTMLElementType.VALUE_PHRASING),
  CHILD (0),
  SPECIAL (0),
  UNDEFINED (0),
  UNDEFINED_PHRASING (CHTMLElementType.VALUE_PHRASING);

  private int m_nValue;

  private EHTMLElementType (final int nValue)
  {
    m_nValue = nValue;
  }

  public boolean isFlowElement ()
  {
    return (m_nValue & CHTMLElementType.VALUE_FLOW) > 0;
  }

  public boolean isMetadataElement ()
  {
    return (m_nValue & CHTMLElementType.VALUE_METADATA) > 0;
  }

  public boolean isPhrasingElement ()
  {
    return (m_nValue & CHTMLElementType.VALUE_PHRASING) > 0;
  }
}
