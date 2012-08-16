package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

public class JSPrimitiveType extends AbstractJSType
{
  private final JSCodeModel m_aOwner;
  private final String m_sName;
  private AbstractJSClass m_aArrayClass;

  JSPrimitiveType (final JSCodeModel aOwner, final String sName)
  {
    m_aOwner = aOwner;
    m_sName = sName;
  }

  public JSCodeModel owner ()
  {
    return m_aOwner;
  }

  @Override
  public String fullName ()
  {
    return m_sName;
  }

  @Override
  public String name ()
  {
    return m_sName;
  }

  @Override
  public AbstractJSClass array ()
  {
    if (m_aArrayClass == null)
      m_aArrayClass = new JSArrayClass (m_aOwner, this);
    return m_aArrayClass;
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (m_sName);
  }
}
