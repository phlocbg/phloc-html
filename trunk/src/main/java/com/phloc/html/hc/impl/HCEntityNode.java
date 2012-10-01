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

import com.phloc.commons.microdom.IMicroEntityReference;
import com.phloc.commons.microdom.impl.MicroEntityReference;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.entities.EHTMLEntity;
import com.phloc.html.entities.IHTMLEntity;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Represents an entity reference as HC node.
 * 
 * @author philip
 */
public class HCEntityNode extends AbstractHCNode
{
  private final IHTMLEntity m_aEntity;
  private final String m_sPlainText;

  public HCEntityNode (@Nonnull final IHTMLEntity aEntity, @Nonnull final String sPlainText)
  {
    if (aEntity == null)
      throw new NullPointerException ("entity");
    if (sPlainText == null)
      throw new NullPointerException ("plainText");
    m_aEntity = aEntity;
    m_sPlainText = sPlainText;
  }

  @Nonnull
  public IHTMLEntity getEntity ()
  {
    return m_aEntity;
  }

  @Override
  @Nonnull
  protected IMicroEntityReference internalGetAsNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return new MicroEntityReference (m_aEntity.getEntityName ());
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return m_sPlainText;
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("entity", m_aEntity)
                            .append ("plainText", m_sPlainText)
                            .toString ();
  }

  @Nonnull
  public static HCEntityNode newNBSP ()
  {
    return new HCEntityNode (EHTMLEntity.nbsp, " ");
  }

  @Nonnull
  public static HCEntityNode newCopy ()
  {
    return new HCEntityNode (EHTMLEntity.copy, "©");
  }

  @Nonnull
  public static HCEntityNode newEuro ()
  {
    return new HCEntityNode (EHTMLEntity.euro, "€");
  }
}
