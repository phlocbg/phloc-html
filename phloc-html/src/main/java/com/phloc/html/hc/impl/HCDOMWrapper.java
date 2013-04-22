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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;

import com.phloc.commons.microdom.EMicroNodeType;
import com.phloc.commons.microdom.IMicroCDATA;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.IMicroText;
import com.phloc.commons.microdom.utils.MicroRecursiveIterator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * This is a simple wrapper around any {@link IMicroNode} so it can easily be
 * used in a HC* construction!
 * 
 * @author Philip Helger
 */
public class HCDOMWrapper extends AbstractHCNode
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
  public IMicroNode getNode ()
  {
    return m_aNode;
  }

  @Override
  @Nonnull
  protected IMicroNode internalConvertToNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return m_aNode;
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    final StringBuilder ret = new StringBuilder ();
    for (final IMicroNode aNode : new MicroRecursiveIterator (m_aNode))
    {
      CharSequence sPlainText = null;
      final EMicroNodeType eType = aNode.getType ();
      if (eType == EMicroNodeType.TEXT)
      {
        final IMicroText aTextNode = (IMicroText) aNode;
        if (!aTextNode.isElementContentWhitespace ())
          sPlainText = aTextNode.getData ();
      }
      else
        if (eType == EMicroNodeType.CDATA)
        {
          final IMicroCDATA aCDATANode = (IMicroCDATA) aNode;
          sPlainText = aCDATANode.getData ();
        }
      if (StringHelper.hasText (sPlainText))
      {
        if (ret.length () > 0)
          ret.append (' ');
        ret.append (sPlainText);
      }
    }
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("node", m_aNode).toString ();
  }
}
