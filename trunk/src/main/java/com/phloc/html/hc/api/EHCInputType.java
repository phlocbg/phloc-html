package com.phloc.html.hc.api;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;

public enum EHCInputType implements IHCHasHTMLAttributeValue
{
  TEXT ("text"),
  PASSWORD ("password"),
  CHECKBOX ("checkbox"),
  RADIO ("radio"),
  BUTTON ("button"),
  SUBMIT ("submit"),
  RESET ("reset"),
  FILE ("file"),
  HIDDEN ("hidden"),
  IMAGE ("image"),
  // HTML5 new:
  DATETIME ("datetime"),
  DATETIME_LOCAL ("datetime-local"),
  DATE ("date"),
  MONTH ("month"),
  TIME ("time"),
  WEEK ("week"),
  NUMBER ("number"),
  RANGE ("range"),
  EMAIL ("email"),
  URL ("url"),
  SEARCH ("search"),
  TEL ("tel"),
  COLOR ("color");

  private String m_sAttrValue;

  private EHCInputType (@Nonnull @Nonempty final String sAttrValue)
  {
    m_sAttrValue = sAttrValue;
  }

  @Nonnull
  @Nonempty
  public String getAttrValue ()
  {
    return m_sAttrValue;
  }
}
