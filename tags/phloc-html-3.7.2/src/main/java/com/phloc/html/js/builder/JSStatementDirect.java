package com.phloc.html.js.builder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;

@Deprecated
public class JSStatementDirect implements IJSStatement
{
  private final String m_sSource;

  public JSStatementDirect (@Nonnull @Nonempty final String sSource)
  {
    if (StringHelper.hasNoText (sSource))
      throw new IllegalArgumentException ("source");
    m_sSource = sSource;
  }

  public void state (@Nonnull final JSFormatter f)
  {
    f.plain (m_sSource).nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final JSStatementDirect rhs = (JSStatementDirect) o;
    return m_sSource.equals (rhs.m_sSource);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sSource).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("source", m_sSource).toString ();
  }
}
