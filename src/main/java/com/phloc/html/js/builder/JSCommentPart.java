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
package com.phloc.html.js.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;

/**
 * A part is a part of a JSDoc comment, and it is a list of values.
 * 
 * @author philip
 */
public class JSCommentPart extends ArrayList <Object>
{
  /**
   * Appends a new value. If the value is {@link AbstractJSType} it will be
   * printed as a @link tag. Otherwise it will be converted to String via
   * {@link Object#toString()} .
   */
  public JSCommentPart append (final Object o)
  {
    add (o);
    return this;
  }

  @Override
  public boolean add (@Nullable final Object o)
  {
    _flattenAppend (o);
    return true;
  }

  private void _flattenAppend (@Nullable final Object value)
  {
    if (value == null)
      return;
    if (value instanceof Object [])
    {
      for (final Object o : (Object []) value)
        _flattenAppend (o);
    }
    else
      if (value instanceof Collection <?>)
      {
        for (final Object o : (Collection <?>) value)
          _flattenAppend (o);
      }
      else
        super.add (value);
  }

  /**
   * Writes this part into the formatter by using the specified indentation.
   */
  protected void format (@Nonnull final JSFormatter f, @Nonnull final String indent)
  {
    if (!isEmpty ())
      f.plain (indent);

    final Iterator <Object> itr = iterator ();
    while (itr.hasNext ())
    {
      final Object o = itr.next ();

      if (o instanceof String)
      {
        int idx;
        String s = (String) o;
        while ((idx = s.indexOf ('\n')) != -1)
        {
          final String line = s.substring (0, idx);
          if (line.length () > 0)
            f.plain (_escape (line));
          s = s.substring (idx + 1);
          f.nlFix ().plain (indent);
        }
        if (s.length () != 0)
          f.plain (_escape (s));
      }
      else
        if (o instanceof AbstractJSClass)
        {
          ((AbstractJSClass) o).printLink (f);
        }
        else
          if (o instanceof AbstractJSType)
          {
            f.generatable ((AbstractJSType) o);
          }
          else
            throw new IllegalStateException ();
    }

    if (!isEmpty ())
      f.nlFix ();
  }

  /**
   * Escapes the appearance of the comment terminator.
   */
  private static String _escape (final String ps)
  {
    String s = ps;
    while (true)
    {
      final int idx = s.indexOf ("*/");
      if (idx < 0)
        return s;

      s = s.substring (0, idx + 1) + "<!-- -->" + s.substring (idx + 1);
    }
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    return super.equals (o);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("list", super.toString ()).toString ();
  }
}
