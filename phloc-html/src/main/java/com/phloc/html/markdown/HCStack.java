package com.phloc.html.markdown;

import javax.annotation.Nonnull;

import com.phloc.commons.collections.NonBlockingStack;
import com.phloc.html.hc.IHCHasChildren;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.html.AbstractHCList;
import com.phloc.html.hc.html.HCLI;
import com.phloc.html.hc.impl.HCNodeList;
import com.phloc.html.hc.impl.HCTextNode;

public class HCStack
{
  private final NonBlockingStack <IHCHasChildren> m_aStack = new NonBlockingStack <IHCHasChildren> ();

  public HCStack ()
  {
    m_aStack.push (new HCNodeList ());
  }

  public void push (@Nonnull final AbstractHCList <?> aNode)
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
    final IHCHasChildren aParent = m_aStack.peek ();
    if (aNode instanceof HCLI && aParent instanceof AbstractHCList <?>)
      ((AbstractHCList <?>) aParent).addItem ((HCLI) aNode);
    else
      ((IHCNodeWithChildren <?>) aParent).addChild (aNode);
  }
}
