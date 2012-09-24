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

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.regex.RegExHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSPrinter;
import com.phloc.html.js.builder.JSStringLiteral;

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

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("selector", m_sSelector).appendIfNotNull ("expr", m_aExpr).toString ();
  }

  @Nonnull
  @CheckReturnValue
  public IJQuerySelector chain (@Nonnull final IJQuerySelector aRhsSelector)
  {
    return chain (this, aRhsSelector);
  }

  @Nonnull
  @CheckReturnValue
  public IJQuerySelector multiple (@Nonnull final IJQuerySelector aRhsSelector)
  {
    return multiple (this, aRhsSelector);
  }

  @Nonnull
  @CheckReturnValue
  public IJQuerySelector child (@Nonnull final IJQuerySelector aRhsSelector)
  {
    return child (this, aRhsSelector);
  }

  @Nonnull
  @CheckReturnValue
  public IJQuerySelector descendant (@Nonnull final IJQuerySelector aRhsSelector)
  {
    return descendant (this, aRhsSelector);
  }

  @Nonnull
  @CheckReturnValue
  public IJQuerySelector nextAdjacent (@Nonnull final IJQuerySelector aRhsSelector)
  {
    return nextAdjacent (this, aRhsSelector);
  }

  @Nonnull
  @CheckReturnValue
  public IJQuerySelector nextSiblings (@Nonnull final IJQuerySelector aRhsSelector)
  {
    return nextSiblings (this, aRhsSelector);
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

  /**
   * jQuery ID selection
   * 
   * @param sID
   *        The ID to select
   * @return <code>#id</code>
   */
  @Nonnull
  public static IJQuerySelector id (@Nonnull @Nonempty final String sID)
  {
    if (StringHelper.hasNoText (sID))
      throw new IllegalArgumentException ("ID");
    // Replace all illegal characters in IDs: ":" and "." with "\:" and "\."
    // http://docs.jquery.com/Frequently_Asked_Questions#How_do_I_select_an_element_by_an_ID_that_has_characters_used_in_CSS_notation.3F
    return new JQuerySelector ('#' + RegExHelper.stringReplacePattern ("(:|\\.)", sID, "\\\\$1"));
  }

  /**
   * jQuery class selection
   * 
   * @param aCSSClass
   *        The CSS class to select
   * @return <code>.class</code>
   */
  @Nonnull
  public static IJQuerySelector clazz (@Nonnull final ICSSClassProvider aCSSClass)
  {
    if (aCSSClass == null)
      throw new NullPointerException ("CSSClass");
    return new JQuerySelector ('.' + aCSSClass.getCSSClass ());
  }

  /**
   * jQuery element name selection
   * 
   * @param eHTMLElement
   *        The HTML element to select
   * @return <code>element</code>
   */
  @Nonnull
  public static IJQuerySelector elementName (@Nonnull final EHTMLElement eHTMLElement)
  {
    if (eHTMLElement == null)
      throw new NullPointerException ("element");
    return elementName (eHTMLElement.getElementNameLowerCase ());
  }

  /**
   * jQuery element name selection
   * 
   * @param sElementName
   *        The HTML element to select
   * @return <code>element</code>
   */
  @Nonnull
  public static IJQuerySelector elementName (@Nonnull @Nonempty final String sElementName)
  {
    if (StringHelper.hasNoText (sElementName))
      throw new IllegalArgumentException ("elementName");
    return new JQuerySelector (sElementName);
  }

  /**
   * Chain them directly together to build stuff like "div#id" or
   * ".class1.class" or "span.foo"
   * 
   * @param aFirstSelector
   *        The first selector. May not be <code>null</code>.
   * @param aSecondSelector
   *        The second selector. May not be <code>null</code>.
   * @return <code>first<i>second</i></code>
   */
  @Nonnull
  public static IJQuerySelector chain (@Nonnull final IJQuerySelector aFirstSelector,
                                       @Nonnull final IJQuerySelector aSecondSelector)
  {
    if (aFirstSelector == null)
      throw new NullPointerException ("firstSelector");
    if (aSecondSelector == null)
      throw new NullPointerException ("secondSelector");
    return new JQuerySelector (aFirstSelector.getAsString () + aSecondSelector.getAsString ());
  }

  /**
   * @param aSelectors
   *        the selectors to chaing via ","
   * @return <code>sel, sel, sel, ...</code>
   */
  @Nonnull
  public static IJQuerySelector multiple (@Nonnull @Nonempty final IJQuerySelector... aSelectors)
  {
    if (ArrayHelper.isEmpty (aSelectors))
      throw new IllegalArgumentException ("empty selectors");
    if (ArrayHelper.containsAnyNullElement (aSelectors))
      throw new IllegalArgumentException ("selectors array contains null element");

    final StringBuilder aSB = new StringBuilder ();
    for (final IJQuerySelector aSelector : aSelectors)
    {
      if (aSB.length () > 0)
        aSB.append (',');
      aSB.append (aSelector.getAsString ());
    }
    return new JQuerySelector (aSB.toString ());
  }

  /**
   * @param aSelectors
   *        the selectors to chaing via ","
   * @return <code>sel, sel, sel, ...</code>
   */
  @Nonnull
  public static IJQuerySelector multiple (@Nonnull @Nonempty final Iterable <IJQuerySelector> aSelectors)
  {
    if (ContainerHelper.isEmpty (aSelectors))
      throw new IllegalArgumentException ("empty selectors");
    if (ContainerHelper.containsAnyNullElement (aSelectors))
      throw new IllegalArgumentException ("selectors collection contains null element");

    final StringBuilder aSB = new StringBuilder ();
    for (final IJQuerySelector aSelector : aSelectors)
    {
      if (aSB.length () > 0)
        aSB.append (',');
      aSB.append (aSelector.getAsString ());
    }
    return new JQuerySelector (aSB.toString ());
  }

  /**
   * @param aParentSelector
   * @param aChildSelector
   * @return <code>parent > child</code>
   */
  @Nonnull
  public static IJQuerySelector child (@Nonnull final IJQuerySelector aParentSelector,
                                       @Nonnull final IJQuerySelector aChildSelector)
  {
    if (aParentSelector == null)
      throw new NullPointerException ("parentSelector");
    if (aChildSelector == null)
      throw new NullPointerException ("childSelector");
    return new JQuerySelector (aParentSelector.getAsString () + " > " + aChildSelector.getAsString ());
  }

  /**
   * @param aAncestorSelector
   * @param aDescendantSelector
   * @return <code>ancestor descendant</code>
   */
  @Nonnull
  public static IJQuerySelector descendant (@Nonnull final IJQuerySelector aAncestorSelector,
                                            @Nonnull final IJQuerySelector aDescendantSelector)
  {
    if (aAncestorSelector == null)
      throw new NullPointerException ("ancestorSelector");
    if (aDescendantSelector == null)
      throw new NullPointerException ("descendantSelector");
    return new JQuerySelector (aAncestorSelector.getAsString () + " " + aDescendantSelector.getAsString ());
  }

  /**
   * @param aPrevSelector
   * @param aNextSelector
   * @return <code>prev + next</code>
   */
  @Nonnull
  public static IJQuerySelector nextAdjacent (@Nonnull final IJQuerySelector aPrevSelector,
                                              @Nonnull final IJQuerySelector aNextSelector)
  {
    if (aPrevSelector == null)
      throw new NullPointerException ("prevSelector");
    if (aNextSelector == null)
      throw new NullPointerException ("nextSelector");
    return new JQuerySelector (aPrevSelector.getAsString () + " + " + aNextSelector.getAsString ());
  }

  /**
   * @param aPrevSelector
   * @param aSiblingsSelector
   * @return <code>prev ~ siblings</code>
   */
  @Nonnull
  public static IJQuerySelector nextSiblings (@Nonnull final IJQuerySelector aPrevSelector,
                                              @Nonnull final IJQuerySelector aSiblingsSelector)
  {
    if (aPrevSelector == null)
      throw new NullPointerException ("prevSelector");
    if (aSiblingsSelector == null)
      throw new NullPointerException ("siblingsSelector");
    return new JQuerySelector (aPrevSelector.getAsString () + " ~ " + aSiblingsSelector.getAsString ());
  }

  /**
   * @param sAttrName
   * @return <code>[attrName]</code>
   */
  @Nonnull
  public static IJQuerySelector hasAttr (@Nonnull @Nonempty final String sAttrName)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    return new JQuerySelector ("[" + sAttrName + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName|='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrContainsPrefix (@Nonnull @Nonempty final String sAttrName,
                                                    @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "|=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName*='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrContains (@Nonnull @Nonempty final String sAttrName,
                                              @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "*=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName~='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrContainsWord (@Nonnull @Nonempty final String sAttrName,
                                                  @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "~=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName$='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrEndsWith (@Nonnull @Nonempty final String sAttrName,
                                              @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "$=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrEquals (@Nonnull @Nonempty final String sAttrName, @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName!='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrNotEquals (@Nonnull @Nonempty final String sAttrName,
                                               @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "!=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }

  /**
   * @param sAttrName
   * @param sAttrValue
   * @return <code>[attrName^='attrValue']</code>
   */
  @Nonnull
  public static IJQuerySelector attrStartsWith (@Nonnull @Nonempty final String sAttrName,
                                                @Nonnull final String sAttrValue)
  {
    if (StringHelper.hasNoText (sAttrName))
      throw new IllegalArgumentException ("attrName");
    if (sAttrValue == null)
      throw new NullPointerException ("attrValue");
    return new JQuerySelector ("[" + sAttrName + "^=" + JSStringLiteral.getAsString (sAttrValue) + "]");
  }
}
