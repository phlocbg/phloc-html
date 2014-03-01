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
package com.phloc.html.markdown;

import javax.annotation.Nonnull;

import com.phloc.commons.collections.NonBlockingStack;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.html.AbstractHCList;
import com.phloc.html.hc.html.HCLI;
import com.phloc.html.hc.impl.HCDOMWrapper;
import com.phloc.html.hc.impl.HCNodeList;
import com.phloc.html.hc.impl.HCTextNode;

public class HCStack
{
  private final NonBlockingStack <IHCNode> m_aStack = new NonBlockingStack <IHCNode> ();

  public HCStack ()
  {
    m_aStack.push (new HCNodeList ());
  }

  public void push (@Nonnull final AbstractHCList <?> aNode)
  {
    append (aNode);
    m_aStack.push (aNode);
  }

  public void push (@Nonnull final HCDOMWrapper aNode)
  {
    append (aNode);
    m_aStack.push (aNode);
  }

  @Nonnull
  public <T extends IHCNodeWithChildren <T>> T push (@Nonnull final T aNode)
  {
    append (aNode);
    m_aStack.push (aNode);
    return aNode;
  }

  public void pop ()
  {
    if (m_aStack.size () == 1)
      throw new IllegalStateException ("Can't pop from empty stack");
    m_aStack.pop ();
  }

  @Nonnull
  public IHCNode getRoot ()
  {
    return m_aStack.get (0);
  }

  public void reset ()
  {
    // Ensure to create a new node list in case the object was appended!
    m_aStack.clear ();
    m_aStack.push (new HCNodeList ());
  }

  public void append (final HCStack aOther)
  {
    append (aOther.getRoot ());
  }

  public void append (final char c)
  {
    append (Character.toString (c));
  }

  public void append (final String s)
  {
    append (new HCTextNode (s));
  }

  public void append (final IHCNode aNode)
  {
    final IHCNode aParent = m_aStack.peek ();
    if (aNode instanceof HCLI && aParent instanceof AbstractHCList <?>)
      ((AbstractHCList <?>) aParent).addItem ((HCLI) aNode);
    else
      ((IHCNodeWithChildren <?>) aParent).addChild (aNode);
  }
}
