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
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.IJSStatement;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSFormatter;
import com.phloc.html.js.builder.JSInvocation;

/**
 * Special invocation semantics for jQuery
 * 
 * @author philip
 */
public class JQueryInvocation implements IJSStatement
{
  private final JSInvocation m_aInvocation;

  public JQueryInvocation (@Nonnull final JSInvocation aInvocation)
  {
    if (aInvocation == null)
      throw new NullPointerException ("invocation");
    m_aInvocation = aInvocation;
  }

  /**
   * Add an expression to this invocation's argument list
   * 
   * @param aArgument
   *        Argument to add to argument list
   */
  @Nonnull
  public JQueryInvocation arg (@Nonnull final IJSExpression aArgument)
  {
    m_aInvocation.arg (aArgument);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (final boolean v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (final char v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (final double v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (final float v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (final int v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (final long v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a literal argument. Short for {@code arg(JSExpr.lit(v))}
   */
  @Nonnull
  public JQueryInvocation arg (@Nonnull final String v)
  {
    m_aInvocation.arg (v);
    return this;
  }

  /**
   * Adds a null argument. Short for {@code arg(JSExpr.NULL)}
   */
  @Nonnull
  public JQueryInvocation argNull ()
  {
    m_aInvocation.argNull ();
    return this;
  }

  @Nonnull
  private JQueryInvocation _invoke (@Nonnull @Nonempty final String sMethod)
  {
    return new JQueryInvocation (m_aInvocation.invoke (sMethod));
  }

  @Nonnull
  public JQueryInvocation add ()
  {
    return _invoke ("add");
  }

  @Nonnull
  public JQueryInvocation addClass ()
  {
    return _invoke ("addClass");
  }

  @Nonnull
  public JQueryInvocation after ()
  {
    return _invoke ("after");
  }

  @Nonnull
  public JQueryInvocation ajaxComplete ()
  {
    return _invoke ("ajaxComplete");
  }

  @Nonnull
  public JQueryInvocation ajaxError ()
  {
    return _invoke ("ajaxError");
  }

  @Nonnull
  public JQueryInvocation ajaxSend ()
  {
    return _invoke ("ajaxSend");
  }

  @Nonnull
  public JQueryInvocation ajaxStart ()
  {
    return _invoke ("ajaxStart");
  }

  @Nonnull
  public JQueryInvocation ajaxStop ()
  {
    return _invoke ("ajaxStop");
  }

  @Nonnull
  public JQueryInvocation ajaxSuccess ()
  {
    return _invoke ("ajaxSuccess");
  }

  @Nonnull
  public JQueryInvocation andSelf ()
  {
    return _invoke ("andSelf");
  }

  @Nonnull
  public JQueryInvocation animate ()
  {
    return _invoke ("animate");
  }

  @Nonnull
  public JQueryInvocation append ()
  {
    return _invoke ("append");
  }

  @Nonnull
  public JQueryInvocation appendTo ()
  {
    return _invoke ("appendTo");
  }

  @Nonnull
  public JQueryInvocation attr ()
  {
    return _invoke ("attr");
  }

  @Nonnull
  public JQueryInvocation before ()
  {
    return _invoke ("before");
  }

  @Nonnull
  public JQueryInvocation bind ()
  {
    return _invoke ("bind");
  }

  @Nonnull
  public JQueryInvocation blur ()
  {
    return _invoke ("blur");
  }

  @Nonnull
  public JQueryInvocation change ()
  {
    return _invoke ("change");
  }

  @Nonnull
  public JQueryInvocation children ()
  {
    return _invoke ("children");
  }

  @Nonnull
  public JQueryInvocation clearQueue ()
  {
    return _invoke ("clearQueue");
  }

  @Nonnull
  public JQueryInvocation click ()
  {
    return _invoke ("click");
  }

  @Nonnull
  public JQueryInvocation clone_ ()
  {
    return _invoke ("clone");
  }

  @Nonnull
  public JQueryInvocation closest ()
  {
    return _invoke ("closest");
  }

  @Nonnull
  public JQueryInvocation contents ()
  {
    return _invoke ("contents");
  }

  @Nonnull
  public JSFieldRef context ()
  {
    return m_aInvocation.ref ("context");
  }

  @Nonnull
  public JQueryInvocation css ()
  {
    return _invoke ("css");
  }

  @Nonnull
  public JQueryInvocation data ()
  {
    return _invoke ("data");
  }

  @Nonnull
  public JQueryInvocation dblclick ()
  {
    return _invoke ("dblclick");
  }

  @Nonnull
  public JQueryInvocation delay ()
  {
    return _invoke ("delay");
  }

  @Nonnull
  public JQueryInvocation delegate ()
  {
    return _invoke ("delegate");
  }

  @Nonnull
  public JQueryInvocation dequeue ()
  {
    return _invoke ("dequeue");
  }

  @Nonnull
  public JQueryInvocation detach ()
  {
    return _invoke ("detach");
  }

  @Nonnull
  public JQueryInvocation die ()
  {
    return _invoke ("die");
  }

  @Nonnull
  public JQueryInvocation each ()
  {
    return _invoke ("each");
  }

  @Nonnull
  public JQueryInvocation empty ()
  {
    return _invoke ("empty");
  }

  @Nonnull
  public JQueryInvocation end ()
  {
    return _invoke ("end");
  }

  @Nonnull
  public JQueryInvocation eq ()
  {
    return _invoke ("eq");
  }

  @Nonnull
  public JQueryInvocation error ()
  {
    return _invoke ("error");
  }

  @Nonnull
  public JQueryInvocation fadeIn ()
  {
    return _invoke ("fadeIn");
  }

  @Nonnull
  public JQueryInvocation fadeOut ()
  {
    return _invoke ("fadeOut");
  }

  @Nonnull
  public JQueryInvocation fadeTo ()
  {
    return _invoke ("fadeTo");
  }

  @Nonnull
  public JQueryInvocation fadeToggle ()
  {
    return _invoke ("fadeToggle");
  }

  @Nonnull
  public JQueryInvocation filter ()
  {
    return _invoke ("filter");
  }

  @Nonnull
  public JQueryInvocation find ()
  {
    return _invoke ("find");
  }

  @Nonnull
  public JQueryInvocation first ()
  {
    return _invoke ("first");
  }

  @Nonnull
  public JQueryInvocation focus ()
  {
    return _invoke ("focus");
  }

  @Nonnull
  public JQueryInvocation focusin ()
  {
    return _invoke ("focusin");
  }

  @Nonnull
  public JQueryInvocation focusout ()
  {
    return _invoke ("focusout");
  }

  @Nonnull
  public JQueryInvocation get ()
  {
    return _invoke ("get");
  }

  @Nonnull
  public JQueryInvocation has ()
  {
    return _invoke ("has");
  }

  @Nonnull
  public JQueryInvocation hasClass ()
  {
    return _invoke ("hasClass");
  }

  @Nonnull
  public JQueryInvocation height ()
  {
    return _invoke ("height");
  }

  @Nonnull
  public JQueryInvocation hide ()
  {
    return _invoke ("hide");
  }

  @Nonnull
  public JQueryInvocation hover ()
  {
    return _invoke ("hover");
  }

  @Nonnull
  public JQueryInvocation html ()
  {
    return _invoke ("html");
  }

  @Nonnull
  public JQueryInvocation index ()
  {
    return _invoke ("index");
  }

  @Nonnull
  public JQueryInvocation innerHeight ()
  {
    return _invoke ("innerHeight");
  }

  @Nonnull
  public JQueryInvocation innerWidth ()
  {
    return _invoke ("innerWidth");
  }

  @Nonnull
  public JQueryInvocation insertAfter ()
  {
    return _invoke ("insertAfter");
  }

  @Nonnull
  public JQueryInvocation insertBefore ()
  {
    return _invoke ("insertBefore");
  }

  @Nonnull
  public JQueryInvocation is ()
  {
    return _invoke ("is");
  }

  @Nonnull
  public JSFieldRef jquery ()
  {
    return m_aInvocation.ref ("jquery");
  }

  @Nonnull
  public JQueryInvocation keydown ()
  {
    return _invoke ("keydown");
  }

  @Nonnull
  public JQueryInvocation keypress ()
  {
    return _invoke ("keypress");
  }

  @Nonnull
  public JQueryInvocation keyup ()
  {
    return _invoke ("keyup");
  }

  @Nonnull
  public JQueryInvocation last ()
  {
    return _invoke ("last");
  }

  @Nonnull
  public JSFieldRef length ()
  {
    return m_aInvocation.ref ("length");
  }

  @Nonnull
  public JQueryInvocation live ()
  {
    return _invoke ("live");
  }

  @Nonnull
  public JQueryInvocation load ()
  {
    return _invoke ("load");
  }

  @Nonnull
  public JQueryInvocation map ()
  {
    return _invoke ("map");
  }

  @Nonnull
  public JQueryInvocation mousedown ()
  {
    return _invoke ("mousedown");
  }

  @Nonnull
  public JQueryInvocation mouseenter ()
  {
    return _invoke ("mouseenter");
  }

  @Nonnull
  public JQueryInvocation mouseleave ()
  {
    return _invoke ("mouseleave");
  }

  @Nonnull
  public JQueryInvocation mousemove ()
  {
    return _invoke ("mousemove");
  }

  @Nonnull
  public JQueryInvocation mouseout ()
  {
    return _invoke ("mouseout");
  }

  @Nonnull
  public JQueryInvocation mouseover ()
  {
    return _invoke ("mouseover");
  }

  @Nonnull
  public JQueryInvocation mouseup ()
  {
    return _invoke ("mouseup");
  }

  @Nonnull
  public JQueryInvocation next ()
  {
    return _invoke ("next");
  }

  @Nonnull
  public JQueryInvocation nextAll ()
  {
    return _invoke ("nextAll");
  }

  @Nonnull
  public JQueryInvocation nextUntil ()
  {
    return _invoke ("nextUntil");
  }

  @Nonnull
  public JQueryInvocation not ()
  {
    return _invoke ("not");
  }

  @Nonnull
  public JQueryInvocation off ()
  {
    return _invoke ("off");
  }

  @Nonnull
  public JQueryInvocation offset ()
  {
    return _invoke ("offset");
  }

  @Nonnull
  public JQueryInvocation offsetParent ()
  {
    return _invoke ("offsetParent");
  }

  @Nonnull
  public JQueryInvocation on ()
  {
    return _invoke ("on");
  }

  @Nonnull
  public JQueryInvocation one ()
  {
    return _invoke ("one");
  }

  @Nonnull
  public JQueryInvocation outerHeight ()
  {
    return _invoke ("outerHeight");
  }

  @Nonnull
  public JQueryInvocation outerWidth ()
  {
    return _invoke ("outerWidth");
  }

  @Nonnull
  public JQueryInvocation parent ()
  {
    return _invoke ("parent");
  }

  @Nonnull
  public JQueryInvocation parents ()
  {
    return _invoke ("parents");
  }

  @Nonnull
  public JQueryInvocation parentsUntil ()
  {
    return _invoke ("parentsUntil");
  }

  @Nonnull
  public JQueryInvocation position ()
  {
    return _invoke ("position");
  }

  @Nonnull
  public JQueryInvocation prepend ()
  {
    return _invoke ("prepend");
  }

  @Nonnull
  public JQueryInvocation prependTo ()
  {
    return _invoke ("prependTo");
  }

  @Nonnull
  public JQueryInvocation prev ()
  {
    return _invoke ("prev");
  }

  @Nonnull
  public JQueryInvocation prevAll ()
  {
    return _invoke ("prevAll");
  }

  @Nonnull
  public JQueryInvocation prevUntil ()
  {
    return _invoke ("prevUntil");
  }

  @Nonnull
  public JQueryInvocation promise ()
  {
    return _invoke ("promise");
  }

  @Nonnull
  public JQueryInvocation prop ()
  {
    return _invoke ("prop");
  }

  @Nonnull
  public JQueryInvocation pushStack ()
  {
    return _invoke ("pushStack");
  }

  @Nonnull
  public JQueryInvocation queue ()
  {
    return _invoke ("queue");
  }

  @Nonnull
  public JQueryInvocation ready ()
  {
    return _invoke ("ready");
  }

  @Nonnull
  public JQueryInvocation remove ()
  {
    return _invoke ("remove");
  }

  @Nonnull
  public JQueryInvocation removeAttr ()
  {
    return _invoke ("removeAttr");
  }

  @Nonnull
  public JQueryInvocation removeClass ()
  {
    return _invoke ("removeClass");
  }

  @Nonnull
  public JQueryInvocation removeData ()
  {
    return _invoke ("removeData");
  }

  @Nonnull
  public JQueryInvocation removeProp ()
  {
    return _invoke ("removeProp");
  }

  @Nonnull
  public JQueryInvocation replaceAll ()
  {
    return _invoke ("replaceAll");
  }

  @Nonnull
  public JQueryInvocation replaceWith ()
  {
    return _invoke ("replaceWith");
  }

  @Nonnull
  public JQueryInvocation resize ()
  {
    return _invoke ("resize");
  }

  @Nonnull
  public JQueryInvocation scroll ()
  {
    return _invoke ("scroll");
  }

  @Nonnull
  public JQueryInvocation scrollLeft ()
  {
    return _invoke ("scrollLeft");
  }

  @Nonnull
  public JQueryInvocation scrollTop ()
  {
    return _invoke ("scrollTop");
  }

  @Nonnull
  public JQueryInvocation select ()
  {
    return _invoke ("select");
  }

  @Nonnull
  public JQueryInvocation serialize ()
  {
    return _invoke ("serialize");
  }

  @Nonnull
  public JQueryInvocation serializeArray ()
  {
    return _invoke ("serializeArray");
  }

  @Nonnull
  public JQueryInvocation show ()
  {
    return _invoke ("show");
  }

  @Nonnull
  public JQueryInvocation siblings ()
  {
    return _invoke ("siblings");
  }

  @Nonnull
  public JQueryInvocation size ()
  {
    return _invoke ("size");
  }

  @Nonnull
  public JQueryInvocation slice ()
  {
    return _invoke ("slice");
  }

  @Nonnull
  public JQueryInvocation slideDown ()
  {
    return _invoke ("slideDown");
  }

  @Nonnull
  public JQueryInvocation slideToggle ()
  {
    return _invoke ("slideToggle");
  }

  @Nonnull
  public JQueryInvocation slideUp ()
  {
    return _invoke ("slideUp");
  }

  @Nonnull
  public JQueryInvocation stop ()
  {
    return _invoke ("stop");
  }

  @Nonnull
  public JQueryInvocation submit ()
  {
    return _invoke ("submit");
  }

  @Nonnull
  public JQueryInvocation text ()
  {
    return _invoke ("text");
  }

  @Nonnull
  public JQueryInvocation toArray ()
  {
    return _invoke ("toArray");
  }

  @Nonnull
  public JQueryInvocation toggle ()
  {
    return _invoke ("toggle");
  }

  @Nonnull
  public JQueryInvocation toggleClass ()
  {
    return _invoke ("toggleClass");
  }

  @Nonnull
  public JQueryInvocation trigger ()
  {
    return _invoke ("trigger");
  }

  @Nonnull
  public JQueryInvocation triggerHandler ()
  {
    return _invoke ("triggerHandler");
  }

  @Nonnull
  public JQueryInvocation unbind ()
  {
    return _invoke ("unbind");
  }

  @Nonnull
  public JQueryInvocation undelegate ()
  {
    return _invoke ("undelegate");
  }

  @Nonnull
  public JQueryInvocation unload ()
  {
    return _invoke ("unload");
  }

  @Nonnull
  public JQueryInvocation unwrap ()
  {
    return _invoke ("unwrap");
  }

  @Nonnull
  public JQueryInvocation val ()
  {
    return _invoke ("val");
  }

  @Nonnull
  public JQueryInvocation width ()
  {
    return _invoke ("width");
  }

  @Nonnull
  public JQueryInvocation wrap ()
  {
    return _invoke ("wrap");
  }

  @Nonnull
  public JQueryInvocation wrapAll ()
  {
    return _invoke ("wrapAll");
  }

  @Nonnull
  public JQueryInvocation wrapInner ()
  {
    return _invoke ("wrapInner");
  }

  // Custom provided methods

  @Nonnull
  public JQueryInvocation enable ()
  {
    return _invoke ("enable");
  }

  @Nonnull
  public JQueryInvocation disable ()
  {
    return _invoke ("disable");
  }

  public void state (@Nonnull final JSFormatter f)
  {
    m_aInvocation.state (f);
  }

  @Nonnull
  public String getJSCode ()
  {
    return m_aInvocation.getJSCode ();
  }
}
