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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.CGlobal;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.mime.IMimeType;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.CHTMLAttributeValues;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.api.EHCObjectAlign;
import com.phloc.html.hc.api.IHCHasTabIndex;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

public class HCObject extends AbstractHCElementWithChildren <HCObject> implements IHCHasTabIndex <HCObject>
{
  private int m_nWidth = CGlobal.ILLEGAL_UINT;
  private int m_nHeight = CGlobal.ILLEGAL_UINT;
  private String m_sHSpace;
  private String m_sVSpace;
  private EHCObjectAlign m_eAlign;
  private String m_sArchive;
  private String m_sBorder;
  private String m_sClassID;
  private ISimpleURL m_aCodeBase;
  private IMimeType m_aCodeType;
  private ISimpleURL m_aData;
  private boolean m_bDeclare = false;
  private String m_sName;
  private String m_sStandBy;
  private int m_nTabIndex = CGlobal.ILLEGAL_UINT;
  private IMimeType m_aType;
  private String m_sUseMap;

  public HCObject ()
  {
    super (EHTMLElement.OBJECT);
  }

  public final int getWidth ()
  {
    return m_nWidth;
  }

  @Nonnull
  public final HCObject setWidth (final int nWidth)
  {
    m_nWidth = nWidth;
    return this;
  }

  public final int getHeight ()
  {
    return m_nHeight;
  }

  @Nonnull
  public final HCObject setHeight (final int nHeight)
  {
    m_nHeight = nHeight;
    return this;
  }

  @Nonnull
  public final HCObject setHSpace (@Nullable final String sHSpace)
  {
    m_sHSpace = sHSpace;
    return this;
  }

  @Nonnull
  public final HCObject setVSpace (@Nullable final String sVSpace)
  {
    m_sVSpace = sVSpace;
    return this;
  }

  @Nonnull
  public final HCObject setAlign (@Nullable final EHCObjectAlign eAlign)
  {
    m_eAlign = eAlign;
    return this;
  }

  @Nonnull
  public final HCObject setArchive (@Nullable final String sArchive)
  {
    m_sArchive = sArchive;
    return this;
  }

  @Nonnull
  public final HCObject setBorder (@Nullable final String sBorder)
  {
    m_sBorder = sBorder;
    return this;
  }

  @Nonnull
  public final HCObject setClassID (@Nullable final String sClassID)
  {
    m_sClassID = sClassID;
    return this;
  }

  @Nonnull
  public final HCObject setCodeBase (@Nullable final ISimpleURL aCodeBase)
  {
    m_aCodeBase = aCodeBase;
    return this;
  }

  @Nonnull
  public final HCObject setCodeType (@Nullable final IMimeType aCodeType)
  {
    m_aCodeType = aCodeType;
    return this;
  }

  @Nonnull
  public final HCObject setData (@Nullable final ISimpleURL aData)
  {
    m_aData = aData;
    return this;
  }

  @Nonnull
  public final HCObject setDeclare (@Nullable final boolean bDeclare)
  {
    m_bDeclare = bDeclare;
    return this;
  }

  @Nonnull
  public final HCObject setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nonnull
  public final HCObject setStandBy (@Nullable final String sStandBy)
  {
    m_sStandBy = sStandBy;
    return this;
  }

  public int getTabIndex ()
  {
    return m_nTabIndex;
  }

  @Nonnull
  public final HCObject setTabIndex (@Nullable final int nTabIndex)
  {
    m_nTabIndex = nTabIndex;
    return this;
  }

  @Nonnull
  public final HCObject setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Nonnull
  public final HCObject setUseMap (@Nullable final String sUseMap)
  {
    m_sUseMap = sUseMap;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, HCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_nWidth > 0)
      aElement.setAttribute (CHTMLAttributes.WIDTH, Integer.toString (m_nWidth));
    if (m_nHeight > 0)
      aElement.setAttribute (CHTMLAttributes.HEIGHT, Integer.toString (m_nHeight));
    if (StringHelper.hasText (m_sHSpace))
      aElement.setAttribute (CHTMLAttributes.HSPACE, m_sHSpace);
    if (StringHelper.hasText (m_sVSpace))
      aElement.setAttribute (CHTMLAttributes.VSPACE, m_sVSpace);
    if (m_eAlign != null)
      aElement.setAttribute (CHTMLAttributes.ALIGN, m_eAlign.getAttrValue ());
    if (StringHelper.hasText (m_sArchive))
      aElement.setAttribute (CHTMLAttributes.ARCHIVE, m_sArchive);
    if (StringHelper.hasText (m_sBorder))
      aElement.setAttribute (CHTMLAttributes.BORDER, m_sBorder);
    if (StringHelper.hasText (m_sClassID))
      aElement.setAttribute (CHTMLAttributes.CLASSID, m_sClassID);
    if (m_aCodeBase != null)
      aElement.setAttribute (CHTMLAttributes.CODEBASE, m_aCodeBase.getAsString ());
    if (m_aCodeType != null)
      aElement.setAttribute (CHTMLAttributes.CODETYPE, m_aCodeType.getAsString ());
    if (m_aData != null)
      aElement.setAttribute (CHTMLAttributes.DATA, m_aData.getAsString ());
    if (m_bDeclare)
      aElement.setAttribute (CHTMLAttributes.DECLARE, CHTMLAttributeValues.DECLARE);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sStandBy))
      aElement.setAttribute (CHTMLAttributes.STANDBY, m_sStandBy);
    if (m_nTabIndex != CGlobal.ILLEGAL_UINT)
      aElement.setAttribute (CHTMLAttributes.TABINDEX, Integer.toString (m_nTabIndex));
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    if (StringHelper.hasText (m_sUseMap))
      aElement.setAttribute (CHTMLAttributes.USEMAP, m_sUseMap);
  }
}
