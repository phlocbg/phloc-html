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
package com.phloc.html.js.provider;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.phloc.html.js.provider.CJSCode;
import com.phloc.html.js.provider.DefaultJSCodeProvider;
import com.phloc.html.js.provider.JSCodeWrapper;

/**
 * Test class for class {@link JSCodeWrapper}.
 * 
 * @author philip
 */
public final class JSCodeWrapperTest
{
  @Test
  public void testGetFunctionCall ()
  {
    assertEquals ("a()", JSCodeWrapper.getFunctionCall ("a").getJSCode ());
    assertEquals ("a.b()", JSCodeWrapper.getFunctionCall ("a.b").getJSCode ());
    assertEquals ("a.b(5)", JSCodeWrapper.getFunctionCall ("a.b", Integer.valueOf (5)).getJSCode ());
    assertEquals ("a.b('z')", JSCodeWrapper.getFunctionCall ("a.b", "z").getJSCode ());
    assertEquals ("a.b('n\\'roses')", JSCodeWrapper.getFunctionCall ("a.b", "n'roses").getJSCode ());
    assertEquals ("a.b(['x','y'])", JSCodeWrapper.getFunctionCall ("a.b", (Object) new String [] { "x", "y" })
                                                 .getJSCode ());
    assertEquals ("a.b('x','y')", JSCodeWrapper.getFunctionCall ("a.b", "x", "y").getJSCode ());
    assertEquals ("a.b('x',3.14,'y')", JSCodeWrapper.getFunctionCall ("a.b", "x", Double.valueOf (3.14), "y")
                                                    .getJSCode ());
    assertEquals ("a.b(x=y)", JSCodeWrapper.getFunctionCall ("a.b", DefaultJSCodeProvider.create ("x=y")).getJSCode ());
    assertEquals ("x(this)", JSCodeWrapper.getFunctionCall ("x", CJSCode.JS_THIS).getJSCode ());
  }
}
