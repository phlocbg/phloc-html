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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;

import com.phloc.commons.microdom.IMicroCDATA;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.IMicroText;
import com.phloc.commons.microdom.utils.MicroRecursiveIterator;
import com.phloc.html.hc.HCConversionSettings;

/**
 * This is a simple wrapper around any {@link IMicroNode} so it can easily be
 * used in a HC* construction!
 * 
 * @author philip
 */
public final class HCDOMWrapper extends AbstractHCNode
{
  private final IMicroNode m_aNode;

  /**
   * Constructor.
   * 
   * @param aNode
   *        The node to be wrapped. May not be <code>null</code>.
   */
  public HCDOMWrapper (@Nonnull final IMicroNode aNode)
  {
    if (aNode == null)
      throw new NullPointerException ("node");
    m_aNode = aNode;
  }

  @Nonnull
  public IMicroNode getAsNode (@Nonnull final HCConversionSettings aConversionSettings)
  {
    return m_aNode;
  }

  @Nonnull
  public String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    for (final IMicroNode aNode : new MicroRecursiveIterator (m_aNode))
      if (aNode instanceof IMicroText)
      {
        final IMicroText aTextNode = (IMicroText) aNode;
        if (!aTextNode.isElementContentWhitespace ())
          ret.append (aTextNode.getData ()).append (' ');
      }
      else
        if (aNode instanceof IMicroCDATA)
        {
          final IMicroCDATA aCDATANode = (IMicroCDATA) aNode;
          ret.append (aCDATANode.getData ()).append (' ');
        }
    return ret.toString ();
  }
}
