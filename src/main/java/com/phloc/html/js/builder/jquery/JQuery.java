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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.collections.ArrayHelper;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.collections.pair.IReadonlyPair;
import com.phloc.commons.collections.pair.ReadonlyPair;
import com.phloc.html.EHTMLElement;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.js.builder.IJSStatement;
import com.phloc.html.js.builder.JSAnonymousFunction;
import com.phloc.html.js.builder.JSBlock;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSFunction;
import com.phloc.html.js.builder.html.JSHtml;

/**
 * Wrapper around jQuery to allow for easy function calls
 * 
 * @author philip
 */
public class JQuery
{
  private JQuery ()
  {}

  @Nonnull
  public static JSFieldRef jQueryField ()
  {
    return JSExpr.ref ("$");
  }

  @Nonnull
  public static JSFunction jQueryFunction ()
  {
    return new JSFunction ("$");
  }

  /**
   * @return a {@link JQueryInvocation} with an HTML document element
   */
  @Nonnull
  public static JQueryInvocation document ()
  {
    return new JQueryInvocation (jQueryFunction ().invoke ().arg (JSHtml.document ()));
  }

  @Nonnull
  public static JQueryInvocation invoke (@Nonnull final JQueryObjectSelector aSelector)
  {
    if (aSelector == null)
      throw new NullPointerException ("selector");
    return new JQueryInvocation (jQueryFunction ().invoke ().arg (aSelector.getAsString ()));
  }

  @Nonnull
  public static JQueryInvocation idRef (@Nonnull @Nonempty final String sID)
  {
    return invoke (new JQueryObjectSelector ().addID (sID));
  }

  @Nonnull
  public static JQueryInvocation idRefAll (@Nonnull @Nonempty final String... aIDs)
  {
    if (ArrayHelper.isEmpty (aIDs))
      throw new IllegalArgumentException ("IDs may not be empty");

    final JQueryObjectSelector aSelector = new JQueryObjectSelector ();
    for (final String sID : aIDs)
      aSelector.addID (sID);
    return invoke (aSelector);
  }

  @Nonnull
  public static JQueryInvocation idRefAll (@Nonnull @Nonempty final Iterable <String> aIDs)
  {
    if (ContainerHelper.isEmpty (aIDs))
      throw new IllegalArgumentException ("IDs may not be empty");

    final JQueryObjectSelector aSelector = new JQueryObjectSelector ();
    for (final String sID : aIDs)
      aSelector.addID (sID);
    return invoke (aSelector);
  }

  @Nonnull
  public static JQueryInvocation classRef (@Nonnull final ICSSClassProvider aCSSClass)
  {
    return invoke (new JQueryObjectSelector ().addClass (aCSSClass));
  }

  @Nonnull
  public static JQueryInvocation classRefAll (@Nonnull @Nonempty final ICSSClassProvider... aCSSClasses)
  {
    if (ArrayHelper.isEmpty (aCSSClasses))
      throw new IllegalArgumentException ("classes may not be empty");

    final JQueryObjectSelector aSelector = new JQueryObjectSelector ();
    for (final ICSSClassProvider aCSSClass : aCSSClasses)
      aSelector.addClass (aCSSClass);
    return invoke (aSelector);
  }

  @Nonnull
  public static JQueryInvocation classRefAll (@Nonnull @Nonempty final Iterable <ICSSClassProvider> aCSSClasses)
  {
    if (ContainerHelper.isEmpty (aCSSClasses))
      throw new IllegalArgumentException ("classes may not be empty");

    final JQueryObjectSelector aSelector = new JQueryObjectSelector ();
    for (final ICSSClassProvider aCSSClass : aCSSClasses)
      aSelector.addClass (aCSSClass);
    return invoke (aSelector);
  }

  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull final EHTMLElement eElement)
  {
    return elementNameRef (eElement.getElementNameLowerCase ());
  }

  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull @Nonempty final String sElementName)
  {
    return invoke (new JQueryObjectSelector ().addElement (sElementName));
  }

  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull final EHTMLElement eElement,
                                                 @Nonnull final IJQuerySelector aSelector)
  {
    return elementNameRef (eElement.getElementNameLowerCase (), aSelector);
  }

  @Nonnull
  public static JQueryInvocation elementNameRef (@Nonnull @Nonempty final String sElementName,
                                                 @Nonnull final IJQuerySelector aSelector)
  {
    return invoke (new JQueryObjectSelector ().addElementWithSelector (sElementName, aSelector));
  }

  @Nonnull
  public static JQueryInvocation elementNameWithIDRef (@Nonnull final EHTMLElement eElement,
                                                       @Nonnull @Nonempty final String sID)
  {
    return elementNameWithIDRef (eElement.getElementNameLowerCase (), sID);
  }

  @Nonnull
  public static JQueryInvocation elementNameWithIDRef (@Nonnull @Nonempty final String sElementName,
                                                       @Nonnull @Nonempty final String sID)
  {
    return invoke (new JQueryObjectSelector ().addElementWithID (sElementName, sID));
  }

  @Nonnull
  public static JQueryInvocation elementNameWithClassRef (@Nonnull final EHTMLElement eElement,
                                                          @Nonnull final ICSSClassProvider aCSSClass)
  {
    return elementNameWithClassRef (eElement.getElementNameLowerCase (), aCSSClass);
  }

  @Nonnull
  public static JQueryInvocation elementNameWithClassRef (@Nonnull @Nonempty final String sElementName,
                                                          @Nonnull final ICSSClassProvider aCSSClass)
  {
    return invoke (new JQueryObjectSelector ().addElementWithClass (sElementName, aCSSClass));
  }

  @Nonnull
  public static JQueryInvocation selectorRef (@Nonnull final IJQuerySelector aSelector)
  {
    return invoke (new JQueryObjectSelector ().addSelector (aSelector));
  }

  @Nonnull
  public static IReadonlyPair <JQueryInvocation, JSAnonymousFunction> onDocumentReady ()
  {
    final JSAnonymousFunction aAnonFunction = JSExpr.anonymousFunction ();
    final JQueryInvocation aInvocation = document ().ready ().arg (aAnonFunction);
    return ReadonlyPair.create (aInvocation, aAnonFunction);
  }

  /**
   * Add onDocumentReady call with a single statement
   * 
   * @param aStatement
   *        The statement to be executed on document ready
   * @return The invocation object
   */
  @Nonnull
  public static JQueryInvocation onDocumentReady (@Nonnull final IJSStatement aStatement)
  {
    final IReadonlyPair <JQueryInvocation, JSAnonymousFunction> aPair = onDocumentReady ();
    aPair.getSecond ().body ().add (aStatement);
    return aPair.getFirst ();
  }

  /**
   * Add onDocumentReady call with a list of statements
   * 
   * @param aStatements
   *        The list of statements to be executed on document ready
   * @return The invocation object
   */
  @Nonnull
  public static JQueryInvocation onDocumentReady (@Nonnull final Iterable <? extends IJSStatement> aStatements)
  {
    final IReadonlyPair <JQueryInvocation, JSAnonymousFunction> aPair = onDocumentReady ();
    final JSBlock aBody = aPair.getSecond ().body ();
    for (final IJSStatement aStatement : aStatements)
      aBody.add (aStatement);
    return aPair.getFirst ();
  }
}
