package com.phloc.html.hc.api;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;

public enum EHCButtonType implements IHCHasHTMLAttributeValue
{
  SUBMIT ("submit"),
  RESET ("reset"),
  BUTTON ("button");

  private String m_sAttrValue;

  private EHCButtonType (@Nonnull @Nonempty final String sAttrValue)
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
