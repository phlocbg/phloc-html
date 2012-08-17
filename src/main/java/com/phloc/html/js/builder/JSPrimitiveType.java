package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

import com.phloc.commons.annotations.Nonempty;

public class JSPrimitiveType extends AbstractJSType
{
  public static final JSPrimitiveType ARGUMENTS = new JSPrimitiveType ("Arguments");
  public static final JSPrimitiveType ARRAY = new JSPrimitiveType ("Array");
  public static final JSPrimitiveType BOOLEAN = new JSPrimitiveType ("Boolean");
  public static final JSPrimitiveType DATE = new JSPrimitiveType ("Date");
  public static final JSPrimitiveType ERROR = new JSPrimitiveType ("Error");
  public static final JSPrimitiveType FUNCTION = new JSPrimitiveType ("Function");
  public static final JSPrimitiveType JSON = new JSPrimitiveType ("JSON");
  public static final JSPrimitiveType MATH = new JSPrimitiveType ("Math");
  public static final JSPrimitiveType NUMBER = new JSPrimitiveType ("Number");
  public static final JSPrimitiveType OBJECT = new JSPrimitiveType ("Object");
  public static final JSPrimitiveType REGEXP = new JSPrimitiveType ("RegExp");
  public static final JSPrimitiveType STRING = new JSPrimitiveType ("String");

  private final String m_sName;

  private JSPrimitiveType (@Nonnull @Nonempty final String sName)
  {
    m_sName = sName;
  }

  @Override
  @Nonnull
  @Nonempty
  public String fullName ()
  {
    return m_sName;
  }

  @Override
  @Nonnull
  @Nonempty
  public String name ()
  {
    return m_sName;
  }

  /**
   * @return The type to be used in "typeof" expressions. A string literal with
   *         the name in it
   */
  @Nonnull
  public JSStringLiteral type ()
  {
    return JSExpr.lit (m_sName);
  }

  @Nonnull
  public JSInvocation _new ()
  {
    return JSExpr._new (this);
  }

  public void generate (@Nonnull final JSFormatter f)
  {
    f.plain (m_sName);
  }
}
