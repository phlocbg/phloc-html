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
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSFormatter;
import com.phloc.html.js.builder.JSInvocation;
import com.phloc.json.IJSON;

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

  @Nonnull
  public JQueryInvocation arg (@Nonnull final IJSON v)
  {
    m_aInvocation.arg (JSExpr.json (v));
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
  public JQueryInvocation invoke (@Nonnull @Nonempty final String sMethod)
  {
    return new JQueryInvocation (m_aInvocation.invoke (sMethod));
  }

  @Nonnull
  public JQueryInvocation add ()
  {
    return invoke ("add");
  }

  @Nonnull
  public JQueryInvocation addClass ()
  {
    return invoke ("addClass");
  }

  @Nonnull
  public JQueryInvocation after ()
  {
    return invoke ("after");
  }

  @Nonnull
  public JQueryInvocation ajaxComplete ()
  {
    return invoke ("ajaxComplete");
  }

  @Nonnull
  public JQueryInvocation ajaxError ()
  {
    return invoke ("ajaxError");
  }

  @Nonnull
  public JQueryInvocation ajaxSend ()
  {
    return invoke ("ajaxSend");
  }

  @Nonnull
  public JQueryInvocation ajaxStart ()
  {
    return invoke ("ajaxStart");
  }

  @Nonnull
  public JQueryInvocation ajaxStop ()
  {
    return invoke ("ajaxStop");
  }

  @Nonnull
  public JQueryInvocation ajaxSuccess ()
  {
    return invoke ("ajaxSuccess");
  }

  @Nonnull
  public JQueryInvocation andSelf ()
  {
    return invoke ("andSelf");
  }

  @Nonnull
  public JQueryInvocation animate ()
  {
    return invoke ("animate");
  }

  @Nonnull
  public JQueryInvocation append ()
  {
    return invoke ("append");
  }

  @Nonnull
  public JQueryInvocation appendTo ()
  {
    return invoke ("appendTo");
  }

  @Nonnull
  public JQueryInvocation attr ()
  {
    return invoke ("attr");
  }

  @Nonnull
  public JQueryInvocation before ()
  {
    return invoke ("before");
  }

  @Nonnull
  public JQueryInvocation bind ()
  {
    return invoke ("bind");
  }

  @Nonnull
  public JQueryInvocation blur ()
  {
    return invoke ("blur");
  }

  @Nonnull
  public JQueryInvocation change ()
  {
    return invoke ("change");
  }

  @Nonnull
  public JQueryInvocation children ()
  {
    return invoke ("children");
  }

  @Nonnull
  public JQueryInvocation clearQueue ()
  {
    return invoke ("clearQueue");
  }

  @Nonnull
  public JQueryInvocation click ()
  {
    return invoke ("click");
  }

  @Nonnull
  public JQueryInvocation clone_ ()
  {
    return invoke ("clone");
  }

  @Nonnull
  public JQueryInvocation closest ()
  {
    return invoke ("closest");
  }

  @Nonnull
  public JQueryInvocation contents ()
  {
    return invoke ("contents");
  }

  @Nonnull
  public JSFieldRef context ()
  {
    return m_aInvocation.ref ("context");
  }

  @Nonnull
  public JQueryInvocation css ()
  {
    return invoke ("css");
  }

  @Nonnull
  public JQueryInvocation data ()
  {
    return invoke ("data");
  }

  @Nonnull
  public JQueryInvocation dblclick ()
  {
    return invoke ("dblclick");
  }

  @Nonnull
  public JQueryInvocation delay ()
  {
    return invoke ("delay");
  }

  @Nonnull
  public JQueryInvocation delegate ()
  {
    return invoke ("delegate");
  }

  @Nonnull
  public JQueryInvocation dequeue ()
  {
    return invoke ("dequeue");
  }

  @Nonnull
  public JQueryInvocation detach ()
  {
    return invoke ("detach");
  }

  @Nonnull
  public JQueryInvocation die ()
  {
    return invoke ("die");
  }

  @Nonnull
  public JQueryInvocation each ()
  {
    return invoke ("each");
  }

  @Nonnull
  public JQueryInvocation empty ()
  {
    return invoke ("empty");
  }

  @Nonnull
  public JQueryInvocation end ()
  {
    return invoke ("end");
  }

  @Nonnull
  public JQueryInvocation eq ()
  {
    return invoke ("eq");
  }

  @Nonnull
  public JQueryInvocation error ()
  {
    return invoke ("error");
  }

  @Nonnull
  public JQueryInvocation fadeIn ()
  {
    return invoke ("fadeIn");
  }

  @Nonnull
  public JQueryInvocation fadeOut ()
  {
    return invoke ("fadeOut");
  }

  @Nonnull
  public JQueryInvocation fadeTo ()
  {
    return invoke ("fadeTo");
  }

  @Nonnull
  public JQueryInvocation fadeToggle ()
  {
    return invoke ("fadeToggle");
  }

  @Nonnull
  public JQueryInvocation filter ()
  {
    return invoke ("filter");
  }

  @Nonnull
  public JQueryInvocation find ()
  {
    return invoke ("find");
  }

  @Nonnull
  public JQueryInvocation first ()
  {
    return invoke ("first");
  }

  @Nonnull
  public JQueryInvocation focus ()
  {
    return invoke ("focus");
  }

  @Nonnull
  public JQueryInvocation focusin ()
  {
    return invoke ("focusin");
  }

  @Nonnull
  public JQueryInvocation focusout ()
  {
    return invoke ("focusout");
  }

  @Nonnull
  public JQueryInvocation get ()
  {
    return invoke ("get");
  }

  @Nonnull
  public JQueryInvocation has ()
  {
    return invoke ("has");
  }

  @Nonnull
  public JQueryInvocation hasClass ()
  {
    return invoke ("hasClass");
  }

  @Nonnull
  public JQueryInvocation height ()
  {
    return invoke ("height");
  }

  @Nonnull
  public JQueryInvocation hide ()
  {
    return invoke ("hide");
  }

  @Nonnull
  public JQueryInvocation hover ()
  {
    return invoke ("hover");
  }

  @Nonnull
  public JQueryInvocation html ()
  {
    return invoke ("html");
  }

  @Nonnull
  public JQueryInvocation index ()
  {
    return invoke ("index");
  }

  @Nonnull
  public JQueryInvocation innerHeight ()
  {
    return invoke ("innerHeight");
  }

  @Nonnull
  public JQueryInvocation innerWidth ()
  {
    return invoke ("innerWidth");
  }

  @Nonnull
  public JQueryInvocation insertAfter ()
  {
    return invoke ("insertAfter");
  }

  @Nonnull
  public JQueryInvocation insertBefore ()
  {
    return invoke ("insertBefore");
  }

  @Nonnull
  public JQueryInvocation is ()
  {
    return invoke ("is");
  }

  @Nonnull
  public JSFieldRef jquery ()
  {
    return m_aInvocation.ref ("jquery");
  }

  @Nonnull
  public JQueryInvocation keydown ()
  {
    return invoke ("keydown");
  }

  @Nonnull
  public JQueryInvocation keypress ()
  {
    return invoke ("keypress");
  }

  @Nonnull
  public JQueryInvocation keyup ()
  {
    return invoke ("keyup");
  }

  @Nonnull
  public JQueryInvocation last ()
  {
    return invoke ("last");
  }

  @Nonnull
  public JSFieldRef length ()
  {
    return m_aInvocation.ref ("length");
  }

  @Nonnull
  public JQueryInvocation live ()
  {
    return invoke ("live");
  }

  @Nonnull
  public JQueryInvocation load ()
  {
    return invoke ("load");
  }

  @Nonnull
  public JQueryInvocation map ()
  {
    return invoke ("map");
  }

  @Nonnull
  public JQueryInvocation mousedown ()
  {
    return invoke ("mousedown");
  }

  @Nonnull
  public JQueryInvocation mouseenter ()
  {
    return invoke ("mouseenter");
  }

  @Nonnull
  public JQueryInvocation mouseleave ()
  {
    return invoke ("mouseleave");
  }

  @Nonnull
  public JQueryInvocation mousemove ()
  {
    return invoke ("mousemove");
  }

  @Nonnull
  public JQueryInvocation mouseout ()
  {
    return invoke ("mouseout");
  }

  @Nonnull
  public JQueryInvocation mouseover ()
  {
    return invoke ("mouseover");
  }

  @Nonnull
  public JQueryInvocation mouseup ()
  {
    return invoke ("mouseup");
  }

  @Nonnull
  public JQueryInvocation next ()
  {
    return invoke ("next");
  }

  @Nonnull
  public JQueryInvocation nextAll ()
  {
    return invoke ("nextAll");
  }

  @Nonnull
  public JQueryInvocation nextUntil ()
  {
    return invoke ("nextUntil");
  }

  @Nonnull
  public JQueryInvocation not ()
  {
    return invoke ("not");
  }

  @Nonnull
  public JQueryInvocation off ()
  {
    return invoke ("off");
  }

  @Nonnull
  public JQueryInvocation offset ()
  {
    return invoke ("offset");
  }

  @Nonnull
  public JQueryInvocation offsetParent ()
  {
    return invoke ("offsetParent");
  }

  @Nonnull
  public JQueryInvocation on ()
  {
    return invoke ("on");
  }

  @Nonnull
  public JQueryInvocation one ()
  {
    return invoke ("one");
  }

  @Nonnull
  public JQueryInvocation outerHeight ()
  {
    return invoke ("outerHeight");
  }

  @Nonnull
  public JQueryInvocation outerWidth ()
  {
    return invoke ("outerWidth");
  }

  @Nonnull
  public JQueryInvocation parent ()
  {
    return invoke ("parent");
  }

  @Nonnull
  public JQueryInvocation parents ()
  {
    return invoke ("parents");
  }

  @Nonnull
  public JQueryInvocation parentsUntil ()
  {
    return invoke ("parentsUntil");
  }

  @Nonnull
  public JQueryInvocation position ()
  {
    return invoke ("position");
  }

  @Nonnull
  public JQueryInvocation prepend ()
  {
    return invoke ("prepend");
  }

  @Nonnull
  public JQueryInvocation prependTo ()
  {
    return invoke ("prependTo");
  }

  @Nonnull
  public JQueryInvocation prev ()
  {
    return invoke ("prev");
  }

  @Nonnull
  public JQueryInvocation prevAll ()
  {
    return invoke ("prevAll");
  }

  @Nonnull
  public JQueryInvocation prevUntil ()
  {
    return invoke ("prevUntil");
  }

  @Nonnull
  public JQueryInvocation promise ()
  {
    return invoke ("promise");
  }

  @Nonnull
  public JQueryInvocation prop ()
  {
    return invoke ("prop");
  }

  @Nonnull
  public JQueryInvocation pushStack ()
  {
    return invoke ("pushStack");
  }

  @Nonnull
  public JQueryInvocation queue ()
  {
    return invoke ("queue");
  }

  @Nonnull
  public JQueryInvocation ready ()
  {
    return invoke ("ready");
  }

  @Nonnull
  public JQueryInvocation remove ()
  {
    return invoke ("remove");
  }

  @Nonnull
  public JQueryInvocation removeAttr ()
  {
    return invoke ("removeAttr");
  }

  @Nonnull
  public JQueryInvocation removeClass ()
  {
    return invoke ("removeClass");
  }

  @Nonnull
  public JQueryInvocation removeData ()
  {
    return invoke ("removeData");
  }

  @Nonnull
  public JQueryInvocation removeProp ()
  {
    return invoke ("removeProp");
  }

  @Nonnull
  public JQueryInvocation replaceAll ()
  {
    return invoke ("replaceAll");
  }

  @Nonnull
  public JQueryInvocation replaceWith ()
  {
    return invoke ("replaceWith");
  }

  @Nonnull
  public JQueryInvocation resize ()
  {
    return invoke ("resize");
  }

  @Nonnull
  public JQueryInvocation scroll ()
  {
    return invoke ("scroll");
  }

  @Nonnull
  public JQueryInvocation scrollLeft ()
  {
    return invoke ("scrollLeft");
  }

  @Nonnull
  public JQueryInvocation scrollTop ()
  {
    return invoke ("scrollTop");
  }

  @Nonnull
  public JQueryInvocation select ()
  {
    return invoke ("select");
  }

  @Nonnull
  public JQueryInvocation serialize ()
  {
    return invoke ("serialize");
  }

  @Nonnull
  public JQueryInvocation serializeArray ()
  {
    return invoke ("serializeArray");
  }

  @Nonnull
  public JQueryInvocation show ()
  {
    return invoke ("show");
  }

  @Nonnull
  public JQueryInvocation siblings ()
  {
    return invoke ("siblings");
  }

  @Nonnull
  public JQueryInvocation size ()
  {
    return invoke ("size");
  }

  @Nonnull
  public JQueryInvocation slice ()
  {
    return invoke ("slice");
  }

  @Nonnull
  public JQueryInvocation slideDown ()
  {
    return invoke ("slideDown");
  }

  @Nonnull
  public JQueryInvocation slideToggle ()
  {
    return invoke ("slideToggle");
  }

  @Nonnull
  public JQueryInvocation slideUp ()
  {
    return invoke ("slideUp");
  }

  @Nonnull
  public JQueryInvocation stop ()
  {
    return invoke ("stop");
  }

  @Nonnull
  public JQueryInvocation submit ()
  {
    return invoke ("submit");
  }

  @Nonnull
  public JQueryInvocation text ()
  {
    return invoke ("text");
  }

  @Nonnull
  public JQueryInvocation toArray ()
  {
    return invoke ("toArray");
  }

  @Nonnull
  public JQueryInvocation toggle ()
  {
    return invoke ("toggle");
  }

  @Nonnull
  public JQueryInvocation toggleClass ()
  {
    return invoke ("toggleClass");
  }

  @Nonnull
  public JQueryInvocation trigger ()
  {
    return invoke ("trigger");
  }

  @Nonnull
  public JQueryInvocation triggerHandler ()
  {
    return invoke ("triggerHandler");
  }

  @Nonnull
  public JQueryInvocation unbind ()
  {
    return invoke ("unbind");
  }

  @Nonnull
  public JQueryInvocation undelegate ()
  {
    return invoke ("undelegate");
  }

  @Nonnull
  public JQueryInvocation unload ()
  {
    return invoke ("unload");
  }

  @Nonnull
  public JQueryInvocation unwrap ()
  {
    return invoke ("unwrap");
  }

  @Nonnull
  public JQueryInvocation val ()
  {
    return invoke ("val");
  }

  @Nonnull
  public JQueryInvocation width ()
  {
    return invoke ("width");
  }

  @Nonnull
  public JQueryInvocation wrap ()
  {
    return invoke ("wrap");
  }

  @Nonnull
  public JQueryInvocation wrapAll ()
  {
    return invoke ("wrapAll");
  }

  @Nonnull
  public JQueryInvocation wrapInner ()
  {
    return invoke ("wrapInner");
  }

  // Custom provided methods

  @Nonnull
  public JQueryInvocation enable ()
  {
    return invoke ("enable");
  }

  @Nonnull
  public JQueryInvocation disable ()
  {
    return invoke ("disable");
  }

  @Nonnull
  public JQueryInvocation check ()
  {
    return invoke ("check");
  }

  @Nonnull
  public JQueryInvocation uncheck ()
  {
    return invoke ("uncheck");
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
