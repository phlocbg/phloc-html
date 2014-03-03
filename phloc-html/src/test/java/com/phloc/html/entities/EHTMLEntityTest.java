/**
 * Copyright (C) 2006-2014 phloc systems
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
package com.phloc.html.entities;

import static org.junit.Assert.assertTrue;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.phloc.commons.compare.ComparatorString;
import com.phloc.commons.string.StringHelper;

/**
 * Test class for class {@link EHTMLEntity}
 * 
 * @author Philip Helger
 */
public final class EHTMLEntityTest
{
  @Test
  public void testBasic ()
  {
    for (final EHTMLEntity e : EHTMLEntity.values ())
    {
      assertTrue (StringHelper.hasText (e.getEntityName ()));
      assertTrue (StringHelper.hasText (e.getEntityReference ()));
      assertTrue (e.toString (), StringHelper.getLength (e.getChar ()) >= 1);
    }

    final Set <String> a = new TreeSet <String> (new ComparatorString (Locale.US));
    for (final EHTMLEntity e : EHTMLEntity.values ())
      a.add (e.getEntityReference ());
    System.out.println (a.size () + " - " + a);
  }
}
