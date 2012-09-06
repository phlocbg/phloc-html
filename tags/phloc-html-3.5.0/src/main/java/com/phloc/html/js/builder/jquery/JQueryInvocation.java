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

import com.phloc.commons.annotations.Nonempty;
import com.phloc.html.js.builder.AbstractJSInvocation;
import com.phloc.html.js.builder.IJSExpression;
import com.phloc.html.js.builder.JSFieldRef;
import com.phloc.html.js.builder.JSFunction;

/**
 * Special invocation semantics for jQuery
 * 
 * @author philip
 */
public class JQueryInvocation extends AbstractJSInvocation <JQueryInvocation>
{
  public JQueryInvocation (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  public JQueryInvocation (@Nullable final IJSExpression lhs, @Nonnull @Nonempty final String method)
  {
    super (lhs, method);
  }

  @Nonnull
  public JQueryInvocation jqinvoke (@Nonnull @Nonempty final String sMethod)
  {
    return new JQueryInvocation (this, sMethod);
  }

  /**
   * @return The invocation of the jQuery function <code>add()</code>
   */
  @Nonnull
  public JQueryInvocation add ()
  {
    return jqinvoke ("add");
  }

  /**
   * @return The invocation of the jQuery function <code>addClass()</code>
   */
  @Nonnull
  public JQueryInvocation addClass ()
  {
    return jqinvoke ("addClass");
  }

  /**
   * @return The invocation of the jQuery function <code>after()</code>
   */
  @Nonnull
  public JQueryInvocation after ()
  {
    return jqinvoke ("after");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxComplete()</code>
   */
  @Nonnull
  public JQueryInvocation ajaxComplete ()
  {
    return jqinvoke ("ajaxComplete");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxError()</code>
   */
  @Nonnull
  public JQueryInvocation ajaxError ()
  {
    return jqinvoke ("ajaxError");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxSend()</code>
   */
  @Nonnull
  public JQueryInvocation ajaxSend ()
  {
    return jqinvoke ("ajaxSend");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxStart()</code>
   */
  @Nonnull
  public JQueryInvocation ajaxStart ()
  {
    return jqinvoke ("ajaxStart");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxStop()</code>
   */
  @Nonnull
  public JQueryInvocation ajaxStop ()
  {
    return jqinvoke ("ajaxStop");
  }

  /**
   * @return The invocation of the jQuery function <code>ajaxSuccess()</code>
   */
  @Nonnull
  public JQueryInvocation ajaxSuccess ()
  {
    return jqinvoke ("ajaxSuccess");
  }

  /**
   * @return The invocation of the jQuery function <code>andSelf()</code>
   */
  @Nonnull
  public JQueryInvocation andSelf ()
  {
    return jqinvoke ("andSelf");
  }

  /**
   * @return The invocation of the jQuery function <code>animate()</code>
   */
  @Nonnull
  public JQueryInvocation animate ()
  {
    return jqinvoke ("animate");
  }

  /**
   * @return The invocation of the jQuery function <code>append()</code>
   */
  @Nonnull
  public JQueryInvocation append ()
  {
    return jqinvoke ("append");
  }

  /**
   * @return The invocation of the jQuery function <code>appendTo()</code>
   */
  @Nonnull
  public JQueryInvocation appendTo ()
  {
    return jqinvoke ("appendTo");
  }

  /**
   * @return The invocation of the jQuery function <code>attr()</code>
   */
  @Nonnull
  public JQueryInvocation attr ()
  {
    return jqinvoke ("attr");
  }

  /**
   * @return The invocation of the jQuery function <code>before()</code>
   */
  @Nonnull
  public JQueryInvocation before ()
  {
    return jqinvoke ("before");
  }

  /**
   * @return The invocation of the jQuery function <code>bind()</code>
   */
  @Nonnull
  public JQueryInvocation bind ()
  {
    return jqinvoke ("bind");
  }

  /**
   * @return The invocation of the jQuery function <code>blur()</code>
   */
  @Nonnull
  public JQueryInvocation blur ()
  {
    return jqinvoke ("blur");
  }

  /**
   * @return The invocation of the jQuery function <code>change()</code>
   */
  @Nonnull
  public JQueryInvocation change ()
  {
    return jqinvoke ("change");
  }

  /**
   * @return The invocation of the jQuery function <code>children()</code>
   */
  @Nonnull
  public JQueryInvocation children ()
  {
    return jqinvoke ("children");
  }

  /**
   * @return The invocation of the jQuery function <code>clearQueue()</code>
   */
  @Nonnull
  public JQueryInvocation clearQueue ()
  {
    return jqinvoke ("clearQueue");
  }

  /**
   * @return The invocation of the jQuery function <code>click()</code>
   */
  @Nonnull
  public JQueryInvocation click ()
  {
    return jqinvoke ("click");
  }

  /**
   * @return The invocation of the jQuery function <code>clone()</code>
   */
  @Nonnull
  public JQueryInvocation clone_ ()
  {
    return jqinvoke ("clone");
  }

  /**
   * @return The invocation of the jQuery function <code>closest()</code>
   */
  @Nonnull
  public JQueryInvocation closest ()
  {
    return jqinvoke ("closest");
  }

  /**
   * @return The invocation of the jQuery function <code>contents()</code>
   */
  @Nonnull
  public JQueryInvocation contents ()
  {
    return jqinvoke ("contents");
  }

  /**
   * @return The invocation of the jQuery function <code>context()</code>
   */
  @Nonnull
  public JSFieldRef context ()
  {
    return ref ("context");
  }

  /**
   * @return The invocation of the jQuery function <code>css()</code>
   */
  @Nonnull
  public JQueryInvocation css ()
  {
    return jqinvoke ("css");
  }

  /**
   * @return The invocation of the jQuery function <code>data()</code>
   */
  @Nonnull
  public JQueryInvocation data ()
  {
    return jqinvoke ("data");
  }

  /**
   * @return The invocation of the jQuery function <code>dblclick()</code>
   */
  @Nonnull
  public JQueryInvocation dblclick ()
  {
    return jqinvoke ("dblclick");
  }

  /**
   * @return The invocation of the jQuery function <code>delay()</code>
   */
  @Nonnull
  public JQueryInvocation delay ()
  {
    return jqinvoke ("delay");
  }

  /**
   * @return The invocation of the jQuery function <code>delegate()</code>
   */
  @Nonnull
  public JQueryInvocation delegate ()
  {
    return jqinvoke ("delegate");
  }

  /**
   * @return The invocation of the jQuery function <code>dequeue()</code>
   */
  @Nonnull
  public JQueryInvocation dequeue ()
  {
    return jqinvoke ("dequeue");
  }

  /**
   * @return The invocation of the jQuery function <code>detach()</code>
   */
  @Nonnull
  public JQueryInvocation detach ()
  {
    return jqinvoke ("detach");
  }

  /**
   * @return The invocation of the jQuery function <code>die()</code>
   */
  @Nonnull
  public JQueryInvocation die ()
  {
    return jqinvoke ("die");
  }

  /**
   * @return The invocation of the jQuery function <code>each()</code>
   */
  @Nonnull
  public JQueryInvocation each ()
  {
    return jqinvoke ("each");
  }

  /**
   * @return The invocation of the jQuery function <code>empty()</code>
   */
  @Nonnull
  public JQueryInvocation empty ()
  {
    return jqinvoke ("empty");
  }

  /**
   * @return The invocation of the jQuery function <code>end()</code>
   */
  @Nonnull
  public JQueryInvocation end ()
  {
    return jqinvoke ("end");
  }

  /**
   * @return The invocation of the jQuery function <code>eq()</code>
   */
  @Nonnull
  public JQueryInvocation eq ()
  {
    return jqinvoke ("eq");
  }

  /**
   * @return The invocation of the jQuery function <code>error()</code>
   */
  @Nonnull
  public JQueryInvocation error ()
  {
    return jqinvoke ("error");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeIn()</code>
   */
  @Nonnull
  public JQueryInvocation fadeIn ()
  {
    return jqinvoke ("fadeIn");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeOut()</code>
   */
  @Nonnull
  public JQueryInvocation fadeOut ()
  {
    return jqinvoke ("fadeOut");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeTo()</code>
   */
  @Nonnull
  public JQueryInvocation fadeTo ()
  {
    return jqinvoke ("fadeTo");
  }

  /**
   * @return The invocation of the jQuery function <code>fadeToggle()</code>
   */
  @Nonnull
  public JQueryInvocation fadeToggle ()
  {
    return jqinvoke ("fadeToggle");
  }

  /**
   * @return The invocation of the jQuery function <code>filter()</code>
   */
  @Nonnull
  public JQueryInvocation filter ()
  {
    return jqinvoke ("filter");
  }

  /**
   * @return The invocation of the jQuery function <code>find()</code>
   */
  @Nonnull
  public JQueryInvocation find ()
  {
    return jqinvoke ("find");
  }

  /**
   * @return The invocation of the jQuery function <code>first()</code>
   */
  @Nonnull
  public JQueryInvocation first ()
  {
    return jqinvoke ("first");
  }

  /**
   * @return The invocation of the jQuery function <code>focus()</code>
   */
  @Nonnull
  public JQueryInvocation focus ()
  {
    return jqinvoke ("focus");
  }

  /**
   * @return The invocation of the jQuery function <code>focusin()</code>
   */
  @Nonnull
  public JQueryInvocation focusin ()
  {
    return jqinvoke ("focusin");
  }

  /**
   * @return The invocation of the jQuery function <code>focusout()</code>
   */
  @Nonnull
  public JQueryInvocation focusout ()
  {
    return jqinvoke ("focusout");
  }

  /**
   * @return The invocation of the jQuery function <code>get()</code>
   */
  @Nonnull
  public JQueryInvocation get ()
  {
    return jqinvoke ("get");
  }

  /**
   * @return The invocation of the jQuery function <code>has()</code>
   */
  @Nonnull
  public JQueryInvocation has ()
  {
    return jqinvoke ("has");
  }

  /**
   * @return The invocation of the jQuery function <code>hasClass()</code>
   */
  @Nonnull
  public JQueryInvocation hasClass ()
  {
    return jqinvoke ("hasClass");
  }

  /**
   * @return The invocation of the jQuery function <code>height()</code>
   */
  @Nonnull
  public JQueryInvocation height ()
  {
    return jqinvoke ("height");
  }

  /**
   * @return The invocation of the jQuery function <code>hide()</code>
   */
  @Nonnull
  public JQueryInvocation hide ()
  {
    return jqinvoke ("hide");
  }

  /**
   * @return The invocation of the jQuery function <code>hover()</code>
   */
  @Nonnull
  public JQueryInvocation hover ()
  {
    return jqinvoke ("hover");
  }

  /**
   * @return The invocation of the jQuery function <code>html()</code>
   */
  @Nonnull
  public JQueryInvocation html ()
  {
    return jqinvoke ("html");
  }

  /**
   * @return The invocation of the jQuery function <code>index()</code>
   */
  @Nonnull
  public JQueryInvocation index ()
  {
    return jqinvoke ("index");
  }

  /**
   * @return The invocation of the jQuery function <code>innerHeight()</code>
   */
  @Nonnull
  public JQueryInvocation innerHeight ()
  {
    return jqinvoke ("innerHeight");
  }

  /**
   * @return The invocation of the jQuery function <code>innerWidth()</code>
   */
  @Nonnull
  public JQueryInvocation innerWidth ()
  {
    return jqinvoke ("innerWidth");
  }

  /**
   * @return The invocation of the jQuery function <code>insertAfter()</code>
   */
  @Nonnull
  public JQueryInvocation insertAfter ()
  {
    return jqinvoke ("insertAfter");
  }

  /**
   * @return The invocation of the jQuery function <code>insertBefore()</code>
   */
  @Nonnull
  public JQueryInvocation insertBefore ()
  {
    return jqinvoke ("insertBefore");
  }

  /**
   * @return The invocation of the jQuery function <code>is()</code>
   */
  @Nonnull
  public JQueryInvocation is ()
  {
    return jqinvoke ("is");
  }

  /**
   * @return The invocation of the jQuery field <code>jquery</code>
   */
  @Nonnull
  public JSFieldRef jquery ()
  {
    return ref ("jquery");
  }

  /**
   * @return The invocation of the jQuery function <code>keydown()</code>
   */
  @Nonnull
  public JQueryInvocation keydown ()
  {
    return jqinvoke ("keydown");
  }

  /**
   * @return The invocation of the jQuery function <code>keypress()</code>
   */
  @Nonnull
  public JQueryInvocation keypress ()
  {
    return jqinvoke ("keypress");
  }

  /**
   * @return The invocation of the jQuery function <code>keyup()</code>
   */
  @Nonnull
  public JQueryInvocation keyup ()
  {
    return jqinvoke ("keyup");
  }

  /**
   * @return The invocation of the jQuery function <code>last()</code>
   */
  @Nonnull
  public JQueryInvocation last ()
  {
    return jqinvoke ("last");
  }

  /**
   * @return The invocation of the jQuery function <code>length()</code>
   */
  @Nonnull
  public JSFieldRef length ()
  {
    return ref ("length");
  }

  /**
   * @return The invocation of the jQuery function <code>live()</code>
   */
  @Nonnull
  public JQueryInvocation live ()
  {
    return jqinvoke ("live");
  }

  /**
   * @return The invocation of the jQuery function <code>load()</code>
   */
  @Nonnull
  public JQueryInvocation load ()
  {
    return jqinvoke ("load");
  }

  /**
   * @return The invocation of the jQuery function <code>map()</code>
   */
  @Nonnull
  public JQueryInvocation map ()
  {
    return jqinvoke ("map");
  }

  /**
   * @return The invocation of the jQuery function <code>mousedown()</code>
   */
  @Nonnull
  public JQueryInvocation mousedown ()
  {
    return jqinvoke ("mousedown");
  }

  /**
   * @return The invocation of the jQuery function <code>mouseenter()</code>
   */
  @Nonnull
  public JQueryInvocation mouseenter ()
  {
    return jqinvoke ("mouseenter");
  }

  /**
   * @return The invocation of the jQuery function <code>mouseleave()</code>
   */
  @Nonnull
  public JQueryInvocation mouseleave ()
  {
    return jqinvoke ("mouseleave");
  }

  /**
   * @return The invocation of the jQuery function <code>mousemove()</code>
   */
  @Nonnull
  public JQueryInvocation mousemove ()
  {
    return jqinvoke ("mousemove");
  }

  /**
   * @return The invocation of the jQuery function <code>mouseout()</code>
   */
  @Nonnull
  public JQueryInvocation mouseout ()
  {
    return jqinvoke ("mouseout");
  }

  /**
   * @return The invocation of the jQuery function <code>mouseover()</code>
   */
  @Nonnull
  public JQueryInvocation mouseover ()
  {
    return jqinvoke ("mouseover");
  }

  /**
   * @return The invocation of the jQuery function <code>mouseup()</code>
   */
  @Nonnull
  public JQueryInvocation mouseup ()
  {
    return jqinvoke ("mouseup");
  }

  /**
   * @return The invocation of the jQuery function <code>next()</code>
   */
  @Nonnull
  public JQueryInvocation next ()
  {
    return jqinvoke ("next");
  }

  /**
   * @return The invocation of the jQuery function <code>nextAll()</code>
   */
  @Nonnull
  public JQueryInvocation nextAll ()
  {
    return jqinvoke ("nextAll");
  }

  /**
   * @return The invocation of the jQuery function <code>nextUntil()</code>
   */
  @Nonnull
  public JQueryInvocation nextUntil ()
  {
    return jqinvoke ("nextUntil");
  }

  /**
   * @return The invocation of the jQuery function <code>not()</code>
   */

  @Nonnull
  public JQueryInvocation notJQ ()
  {
    return jqinvoke ("not");
  }

  /**
   * @return The invocation of the jQuery function <code>off()</code>
   */
  @Nonnull
  public JQueryInvocation off ()
  {
    return jqinvoke ("off");
  }

  /**
   * @return The invocation of the jQuery function <code>offset()</code>
   */
  @Nonnull
  public JQueryInvocation offset ()
  {
    return jqinvoke ("offset");
  }

  /**
   * @return The invocation of the jQuery function <code>offsetParent()</code>
   */
  @Nonnull
  public JQueryInvocation offsetParent ()
  {
    return jqinvoke ("offsetParent");
  }

  /**
   * @return The invocation of the jQuery function <code>on()</code>
   */
  @Nonnull
  public JQueryInvocation on ()
  {
    return jqinvoke ("on");
  }

  /**
   * @return The invocation of the jQuery function <code>one()</code>
   */
  @Nonnull
  public JQueryInvocation one ()
  {
    return jqinvoke ("one");
  }

  /**
   * @return The invocation of the jQuery function <code>outerHeight()</code>
   */
  @Nonnull
  public JQueryInvocation outerHeight ()
  {
    return jqinvoke ("outerHeight");
  }

  /**
   * @return The invocation of the jQuery function <code>outerWidth()</code>
   */
  @Nonnull
  public JQueryInvocation outerWidth ()
  {
    return jqinvoke ("outerWidth");
  }

  /**
   * @return The invocation of the jQuery function <code>parent()</code>
   */
  @Nonnull
  public JQueryInvocation parent ()
  {
    return jqinvoke ("parent");
  }

  /**
   * @return The invocation of the jQuery function <code>parents()</code>
   */
  @Nonnull
  public JQueryInvocation parents ()
  {
    return jqinvoke ("parents");
  }

  /**
   * @return The invocation of the jQuery function <code>parentsUntil()</code>
   */
  @Nonnull
  public JQueryInvocation parentsUntil ()
  {
    return jqinvoke ("parentsUntil");
  }

  /**
   * @return The invocation of the jQuery function <code>position()</code>
   */
  @Nonnull
  public JQueryInvocation position ()
  {
    return jqinvoke ("position");
  }

  /**
   * @return The invocation of the jQuery function <code>prepend()</code>
   */
  @Nonnull
  public JQueryInvocation prepend ()
  {
    return jqinvoke ("prepend");
  }

  /**
   * @return The invocation of the jQuery function <code>prependTo()</code>
   */
  @Nonnull
  public JQueryInvocation prependTo ()
  {
    return jqinvoke ("prependTo");
  }

  /**
   * @return The invocation of the jQuery function <code>prev()</code>
   */
  @Nonnull
  public JQueryInvocation prev ()
  {
    return jqinvoke ("prev");
  }

  /**
   * @return The invocation of the jQuery function <code>prevAll()</code>
   */
  @Nonnull
  public JQueryInvocation prevAll ()
  {
    return jqinvoke ("prevAll");
  }

  /**
   * @return The invocation of the jQuery function <code>prevUntil()</code>
   */
  @Nonnull
  public JQueryInvocation prevUntil ()
  {
    return jqinvoke ("prevUntil");
  }

  /**
   * @return The invocation of the jQuery function <code>promise()</code>
   */
  @Nonnull
  public JQueryInvocation promise ()
  {
    return jqinvoke ("promise");
  }

  /**
   * @return The invocation of the jQuery function <code>prop()</code>
   */
  @Nonnull
  public JQueryInvocation prop ()
  {
    return jqinvoke ("prop");
  }

  /**
   * @return The invocation of the jQuery function <code>pushStack()</code>
   */
  @Nonnull
  public JQueryInvocation pushStack ()
  {
    return jqinvoke ("pushStack");
  }

  /**
   * @return The invocation of the jQuery function <code>queue()</code>
   */
  @Nonnull
  public JQueryInvocation queue ()
  {
    return jqinvoke ("queue");
  }

  /**
   * @return The invocation of the jQuery function <code>ready()</code>
   */
  @Nonnull
  public JQueryInvocation ready ()
  {
    return jqinvoke ("ready");
  }

  /**
   * @return The invocation of the jQuery function <code>remove()</code>
   */
  @Nonnull
  public JQueryInvocation remove ()
  {
    return jqinvoke ("remove");
  }

  /**
   * @return The invocation of the jQuery function <code>removeAttr()</code>
   */
  @Nonnull
  public JQueryInvocation removeAttr ()
  {
    return jqinvoke ("removeAttr");
  }

  /**
   * @return The invocation of the jQuery function <code>removeClass()</code>
   */
  @Nonnull
  public JQueryInvocation removeClass ()
  {
    return jqinvoke ("removeClass");
  }

  /**
   * @return The invocation of the jQuery function <code>removeData()</code>
   */
  @Nonnull
  public JQueryInvocation removeData ()
  {
    return jqinvoke ("removeData");
  }

  /**
   * @return The invocation of the jQuery function <code>removeProp()</code>
   */
  @Nonnull
  public JQueryInvocation removeProp ()
  {
    return jqinvoke ("removeProp");
  }

  /**
   * @return The invocation of the jQuery function <code>replaceAll()</code>
   */
  @Nonnull
  public JQueryInvocation replaceAll ()
  {
    return jqinvoke ("replaceAll");
  }

  /**
   * @return The invocation of the jQuery function <code>replaceWith()</code>
   */
  @Nonnull
  public JQueryInvocation replaceWith ()
  {
    return jqinvoke ("replaceWith");
  }

  /**
   * @return The invocation of the jQuery function <code>resize()</code>
   */
  @Nonnull
  public JQueryInvocation resize ()
  {
    return jqinvoke ("resize");
  }

  /**
   * @return The invocation of the jQuery function <code>scroll()</code>
   */
  @Nonnull
  public JQueryInvocation scroll ()
  {
    return jqinvoke ("scroll");
  }

  /**
   * @return The invocation of the jQuery function <code>scrollLeft()</code>
   */
  @Nonnull
  public JQueryInvocation scrollLeft ()
  {
    return jqinvoke ("scrollLeft");
  }

  /**
   * @return The invocation of the jQuery function <code>scrollTop()</code>
   */
  @Nonnull
  public JQueryInvocation scrollTop ()
  {
    return jqinvoke ("scrollTop");
  }

  /**
   * @return The invocation of the jQuery function <code>select()</code>
   */
  @Nonnull
  public JQueryInvocation select ()
  {
    return jqinvoke ("select");
  }

  /**
   * @return The invocation of the jQuery function <code>serialize()</code>
   */
  @Nonnull
  public JQueryInvocation serialize ()
  {
    return jqinvoke ("serialize");
  }

  /**
   * @return The invocation of the jQuery function <code>serializeArray()</code>
   */
  @Nonnull
  public JQueryInvocation serializeArray ()
  {
    return jqinvoke ("serializeArray");
  }

  /**
   * @return The invocation of the jQuery function <code>show()</code>
   */
  @Nonnull
  public JQueryInvocation show ()
  {
    return jqinvoke ("show");
  }

  /**
   * @return The invocation of the jQuery function <code>siblings()</code>
   */
  @Nonnull
  public JQueryInvocation siblings ()
  {
    return jqinvoke ("siblings");
  }

  /**
   * @return The invocation of the jQuery function <code>size()</code>
   */
  @Nonnull
  public JQueryInvocation size ()
  {
    return jqinvoke ("size");
  }

  /**
   * @return The invocation of the jQuery function <code>slice()</code>
   */
  @Nonnull
  public JQueryInvocation slice ()
  {
    return jqinvoke ("slice");
  }

  /**
   * @return The invocation of the jQuery function <code>slideDown()</code>
   */
  @Nonnull
  public JQueryInvocation slideDown ()
  {
    return jqinvoke ("slideDown");
  }

  /**
   * @return The invocation of the jQuery function <code>slideToggle()</code>
   */
  @Nonnull
  public JQueryInvocation slideToggle ()
  {
    return jqinvoke ("slideToggle");
  }

  /**
   * @return The invocation of the jQuery function <code>slideUp()</code>
   */
  @Nonnull
  public JQueryInvocation slideUp ()
  {
    return jqinvoke ("slideUp");
  }

  /**
   * @return The invocation of the jQuery function <code>stop()</code>
   */
  @Nonnull
  public JQueryInvocation stop ()
  {
    return jqinvoke ("stop");
  }

  /**
   * @return The invocation of the jQuery function <code>submit()</code>
   */
  @Nonnull
  public JQueryInvocation submit ()
  {
    return jqinvoke ("submit");
  }

  /**
   * @return The invocation of the jQuery function <code>text()</code>
   */
  @Nonnull
  public JQueryInvocation text ()
  {
    return jqinvoke ("text");
  }

  /**
   * @return The invocation of the jQuery function <code>toArray()</code>
   */
  @Nonnull
  public JQueryInvocation toArray ()
  {
    return jqinvoke ("toArray");
  }

  /**
   * @return The invocation of the jQuery function <code>toggle()</code>
   */
  @Nonnull
  public JQueryInvocation toggle ()
  {
    return jqinvoke ("toggle");
  }

  /**
   * @return The invocation of the jQuery function <code>toggleClass()</code>
   */
  @Nonnull
  public JQueryInvocation toggleClass ()
  {
    return jqinvoke ("toggleClass");
  }

  /**
   * @return The invocation of the jQuery function <code>trigger()</code>
   */
  @Nonnull
  public JQueryInvocation trigger ()
  {
    return jqinvoke ("trigger");
  }

  /**
   * @return The invocation of the jQuery function <code>triggerHandler()</code>
   */
  @Nonnull
  public JQueryInvocation triggerHandler ()
  {
    return jqinvoke ("triggerHandler");
  }

  /**
   * @return The invocation of the jQuery function <code>unbind()</code>
   */
  @Nonnull
  public JQueryInvocation unbind ()
  {
    return jqinvoke ("unbind");
  }

  /**
   * @return The invocation of the jQuery function <code>undelegate()</code>
   */
  @Nonnull
  public JQueryInvocation undelegate ()
  {
    return jqinvoke ("undelegate");
  }

  /**
   * @return The invocation of the jQuery function <code>unload()</code>
   */
  @Nonnull
  public JQueryInvocation unload ()
  {
    return jqinvoke ("unload");
  }

  /**
   * @return The invocation of the jQuery function <code>unwrap()</code>
   */
  @Nonnull
  public JQueryInvocation unwrap ()
  {
    return jqinvoke ("unwrap");
  }

  /**
   * @return The invocation of the jQuery function <code>val()</code>
   */
  @Nonnull
  public JQueryInvocation val ()
  {
    return jqinvoke ("val");
  }

  /**
   * @return The invocation of the jQuery function <code>width()</code>
   */
  @Nonnull
  public JQueryInvocation width ()
  {
    return jqinvoke ("width");
  }

  /**
   * @return The invocation of the jQuery function <code>wrap()</code>
   */
  @Nonnull
  public JQueryInvocation wrap ()
  {
    return jqinvoke ("wrap");
  }

  /**
   * @return The invocation of the jQuery function <code>wrapAll()</code>
   */
  @Nonnull
  public JQueryInvocation wrapAll ()
  {
    return jqinvoke ("wrapAll");
  }

  /**
   * @return The invocation of the jQuery function <code>wrapInner()</code>
   */
  @Nonnull
  public JQueryInvocation wrapInner ()
  {
    return jqinvoke ("wrapInner");
  }

  // Custom provided methods

  /**
   * @return The invocation of the custom jQuery function <code>enable()</code>
   */
  @Nonnull
  public JQueryInvocation enable ()
  {
    return jqinvoke ("enable");
  }

  /**
   * @return The invocation of the custom jQuery function <code>disable()</code>
   */
  @Nonnull
  public JQueryInvocation disable ()
  {
    return jqinvoke ("disable");
  }

  /**
   * @return The invocation of the custom jQuery function <code>check()</code>
   */
  @Nonnull
  public JQueryInvocation check ()
  {
    return jqinvoke ("check");
  }

  /**
   * @return The invocation of the custom jQuery function <code>uncheck()</code>
   */
  @Nonnull
  public JQueryInvocation uncheck ()
  {
    return jqinvoke ("uncheck");
  }
}
