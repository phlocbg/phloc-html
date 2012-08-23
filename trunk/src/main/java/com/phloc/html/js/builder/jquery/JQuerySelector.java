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
package com.phloc.html.js.builder.jquery;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.regex.RegExHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.css.decl.ECSSAttributeOperator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSPrinter;

@Immutable
public final class JQuerySelector implements IJQuerySelector
{
  public static final IJQuerySelector animated = new JQuerySelector (":animated");
  public static final IJQuerySelector button = new JQuerySelector (":button");
  public static final IJQuerySelector checkbox = new JQuerySelector (":checkbox");
  public static final IJQuerySelector checked = new JQuerySelector (":checked");
  public static final IJQuerySelector disabled = new JQuerySelector (":disabled");
  public static final IJQuerySelector empty = new JQuerySelector (":empty");
  public static final IJQuerySelector enabled = new JQuerySelector (":enabled");
  public static final IJQuerySelector even = new JQuerySelector (":even");
  public static final IJQuerySelector file = new JQuerySelector (":file");
  public static final IJQuerySelector first_child = new JQuerySelector (":first-child");
  public static final IJQuerySelector first = new JQuerySelector (":first");
  public static final IJQuerySelector focus = new JQuerySelector (":focus");
  public static final IJQuerySelector header = new JQuerySelector (":header");
  public static final IJQuerySelector hidden = new JQuerySelector (":hidden");
  public static final IJQuerySelector image = new JQuerySelector (":image");
  public static final IJQuerySelector input = new JQuerySelector (":input");
  public static final IJQuerySelector last_child = new JQuerySelector (":last-child");
  public static final IJQuerySelector last = new JQuerySelector (":last");
  public static final IJQuerySelector odd = new JQuerySelector (":odd");
  public static final IJQuerySelector only_child = new JQuerySelector (":only-child");
  public static final IJQuerySelector parent = new JQuerySelector (":parent");
  public static final IJQuerySelector password = new JQuerySelector (":password");
  public static final IJQuerySelector radio = new JQuerySelector (":radio");
  public static final IJQuerySelector reset = new JQuerySelector (":reset");
  public static final IJQuerySelector selected = new JQuerySelector (":selected");
  public static final IJQuerySelector submit = new JQuerySelector (":submit");
  public static final IJQuerySelector text = new JQuerySelector (":text");
  public static final IJQuerySelector visible = new JQuerySelector (":visible");

  private final String m_sSelector;
  private final IJSExpression m_aExpr;

  private JQuerySelector (@Nonnull @Nonempty final String sSelectorName)
  {
    if (StringHelper.hasNoText (sSelectorName))
      throw new IllegalArgumentException ("selectorName");
    m_sSelector = sSelectorName;
    m_aExpr = null;
  }

  private JQuerySelector (@Nonnull @Nonempty final String sSelectorName, @Nonnull final IJSExpression aExpr)
  {
    if (StringHelper.hasNoText (sSelectorName))
      throw new IllegalArgumentException ("selectorName");
    if (aExpr == null)
      throw new NullPointerException ("expr");
    m_sSelector = sSelectorName;
    m_aExpr = aExpr;
  }

  @Nonnull
  @Nonempty
  public String getSelector ()
  {
    return m_sSelector;
  }

  @Nullable
  public IJSExpression getExpression ()
  {
    return m_aExpr;
  }

  @Nonnull
  @Nonempty
  public String getAsString ()
  {
    if (m_aExpr == null)
      return m_sSelector;
    return m_sSelector + '(' + JSPrinter.getAsString (m_aExpr) + ')';
  }

  @Nonnull
  public static IJQuerySelector contains (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":contains", aExpr);
  }

  @Nonnull
  public static IJQuerySelector eq (final int v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector eq (final long v)
  {
    return eq (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector eq (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":eq", aExpr);
  }

  @Nonnull
  public static IJQuerySelector gt (final int v)
  {
    return gt (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector gt (final long v)
  {
    return gt (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector gt (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":gt", aExpr);
  }

  @Nonnull
  public static IJQuerySelector has (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":has", aExpr);
  }

  @Nonnull
  public static IJQuerySelector lt (final int v)
  {
    return lt (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector lt (final long v)
  {
    return lt (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector lt (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":lt", aExpr);
  }

  @Nonnull
  public static IJQuerySelector not (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":not", aExpr);
  }

  @Nonnull
  public static IJQuerySelector nth_child (final int v)
  {
    return nth_child (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector nth_child (final long v)
  {
    return nth_child (JSExpr.lit (v));
  }

  @Nonnull
  public static IJQuerySelector nth_child (@Nonnull final IJSExpression aExpr)
  {
    return new JQuerySelector (":nth-child", aExpr);
  }

  @Nonnull
  public static IJQuerySelector all ()
  {
    return new JQuerySelector ("*");
  }

  @Nonnull
  public static IJQuerySelector id (@Nonnull @Nonempty final String sID)
  {
    if (StringHelper.hasNoText (sID))
      throw new IllegalArgumentException ("ID");
    // Replace all illegal characters in IDs: ":" and "." with "\:" and "\."
    // http://docs.jquery.com/Frequently_Asked_Questions#How_do_I_select_an_element_by_an_ID_that_has_characters_used_in_CSS_notation.3F
    return new JQuerySelector ('#' + RegExHelper.stringReplacePattern ("(:|\\.)", sID, "\\\\$1"));
  }

  @Nonnull
  public static IJQuerySelector clazz (@Nonnull final ICSSClassProvider aCSSClass)
  {
    if (aCSSClass == null)
      throw new NullPointerException ("CSSClass");
    return new JQuerySelector ('.' + aCSSClass.getCSSClass ());
  }

  @Nonnull
  public static IJQuerySelector elementName (@Nonnull final EHTMLElement eHTMLElement)
  {
    if (eHTMLElement == null)
      throw new NullPointerException ("element");
    return elementName (eHTMLElement.getElementNameLowerCase ());
  }

  @Nonnull
  public static IJQuerySelector elementName (@Nonnull @Nonempty final String sElementName)
  {
    if (StringHelper.hasNoText (sElementName))
      throw new IllegalArgumentException ("elementName");
    return new JQuerySelector (sElementName);
  }

  @Nonnull
  public static IJQuerySelector multiple (@Nonnull final IJQuerySelector aLhsSelector,
                                          @Nonnull final IJQuerySelector aRhsSelector)
  {
    if (aLhsSelector == null)
      throw new NullPointerException ("lhsSelector");
    return new JQuerySelector (aLhsSelector.getAsString () + "," + aRhsSelector.getAsString ());
  }

  @Nonnull
  public static IJQuerySelector attrStartsWith (@Nonnull @Nonempty final String sAttrName,
                                                @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + ECSSAttributeOperator.DASHMATCH.getName () + sAttrValue + "]");
  }
}
