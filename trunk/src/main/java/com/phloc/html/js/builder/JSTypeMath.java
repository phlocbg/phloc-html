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
package com.phloc.html.js.builder;

import javax.annotation.Nonnull;

/**
 * Contains the JS built-in type Number
 * 
 * @author philip
 */
public class JSTypeMath extends JSPrimitiveType
{
  JSTypeMath ()
  {
    super ("Math");
  }

  @Nonnull
  public JSFieldRef e ()
  {
    return global ().ref ("E");
  }

  @Nonnull
  public JSFieldRef ln2 ()
  {
    return global ().ref ("LN2");
  }

  @Nonnull
  public JSFieldRef ln10 ()
  {
    return global ().ref ("LN10");
  }

  @Nonnull
  public JSFieldRef log2e ()
  {
    return global ().ref ("LOG2E");
  }

  @Nonnull
  public JSFieldRef log10e ()
  {
    return global ().ref ("LOG10E");
  }

  @Nonnull
  public JSFieldRef pi ()
  {
    return global ().ref ("PI");
  }

  @Nonnull
  public JSFieldRef sqrt1_2 ()
  {
    return global ().ref ("SQRT1_2");
  }

  @Nonnull
  public JSFieldRef sqrt2 ()
  {
    return global ().ref ("SQRT2");
  }

  @Nonnull
  public JSInvocation abs ()
  {
    return global ().invoke ("abs");
  }

  @Nonnull
  public JSInvocation acos ()
  {
    return global ().invoke ("acos");
  }

  @Nonnull
  public JSInvocation asin ()
  {
    return global ().invoke ("asin");
  }

  @Nonnull
  public JSInvocation atan ()
  {
    return global ().invoke ("atan");
  }

  @Nonnull
  public JSInvocation atan2 ()
  {
    return global ().invoke ("atan2");
  }

  @Nonnull
  public JSInvocation ceil ()
  {
    return global ().invoke ("ceil");
  }

  @Nonnull
  public JSInvocation cos ()
  {
    return global ().invoke ("cos");
  }

  @Nonnull
  public JSInvocation exp ()
  {
    return global ().invoke ("exp");
  }

  @Nonnull
  public JSInvocation floor ()
  {
    return global ().invoke ("floor");
  }

  @Nonnull
  public JSInvocation log ()
  {
    return global ().invoke ("log");
  }

  @Nonnull
  public JSInvocation max ()
  {
    return global ().invoke ("max");
  }

  @Nonnull
  public JSInvocation min ()
  {
    return global ().invoke ("min");
  }

  @Nonnull
  public JSInvocation pow ()
  {
    return global ().invoke ("pow");
  }

  @Nonnull
  public JSInvocation random ()
  {
    return global ().invoke ("random");
  }

  @Nonnull
  public JSInvocation round ()
  {
    return global ().invoke ("round");
  }

  @Nonnull
  public JSInvocation sin ()
  {
    return global ().invoke ("sin");
  }

  @Nonnull
  public JSInvocation sqrt ()
  {
    return global ().invoke ("sqrt");
  }

  @Nonnull
  public JSInvocation tan ()
  {
    return global ().invoke ("tan");
  }
}
