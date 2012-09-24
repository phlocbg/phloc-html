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
package com.phloc.html.hc.html;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLElement;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api.IHCJSNode;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;
import com.phloc.html.hc.impl.HCConditionalCommentNode;
import com.phloc.html.hc.impl.HCNodeList;

/**
 * Represents an HTML &lt;body&gt; element
 * 
 * @author philip
 */
@SuppressWarnings ("deprecation")
public class HCBody extends AbstractHCElementWithChildren <HCBody> implements IHasJSDeclarations
{
  private final List <IHCBaseNode> m_aOutOfBandNodes = new ArrayList <IHCBaseNode> ();
  private final List <IHCNode> m_aJS = new ArrayList <IHCNode> ();
  private IHCBodyOutOfBandNodeHandler m_aOutOfBandHandler = new HCBodyDefaultJQueryOutOfBandHandler ();

  public HCBody ()
  {
    super (EHTMLElement.BODY);
  }

  /**
   * Set a custom of of band handler, that performs the actions
   * 
   * @param aOutOfBandHandler
   *        The new out of band handler. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCBody setOutOfBandHandler (@Nonnull final IHCBodyOutOfBandNodeHandler aOutOfBandHandler)
  {
    if (aOutOfBandHandler == null)
      throw new NullPointerException ("outOfBandNodeHandler");
    m_aOutOfBandHandler = aOutOfBandHandler;
    return this;
  }

  /**
   * @return the installed out-of-band-node handler. Never <code>null</code> .
   */
  @Nonnull
  public IHCBodyOutOfBandNodeHandler getOutOfBandHandler ()
  {
    return m_aOutOfBandHandler;
  }

  /**
   * Handle an out-of-band node as created by the HTML body.
   * 
   * @param aOutOfBandNode
   *        The out-of-band-node to handle. May be <code>null</code>.
   */
  public void handleOutOfBandNode (@Nullable final IHCBaseNode aOutOfBandNode)
  {
    // Only do something if there is something out of band
    if (aOutOfBandNode != null)
      m_aOutOfBandHandler.handleOutOfBandNode (this, aOutOfBandNode);
  }

  private static boolean _isValidJSNode (@Nonnull final IHCBaseNode aNode)
  {
    // Direct JS node?
    if (aNode instanceof IHCJSNode)
      return true;
    // Conditional comment?
    if (aNode instanceof HCConditionalCommentNode)
      return _isValidJSNode (((HCConditionalCommentNode) aNode).getWrappedNode ());
    return false;
  }

  /**
   * Append some JavaScript code
   * 
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCBody addJS (@Nonnull final IHCNode aJS)
  {
    if (aJS == null)
      throw new NullPointerException ("js");
    if (!_isValidJSNode (aJS))
      throw new IllegalArgumentException (aJS + " is not a valid JS node!");
    m_aJS.add (aJS);
    return this;
  }

  /**
   * Append some JavaScript code at the specified index
   * 
   * @param nIndex
   *        The index where the JS should be added (counting only JS elements)
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCBody addJS (@Nonnegative final int nIndex, @Nonnull final IHCNode aJS)
  {
    if (aJS == null)
      throw new NullPointerException ("js");
    if (!_isValidJSNode (aJS))
      throw new IllegalArgumentException (aJS + " is not a valid JS node!");
    m_aJS.add (nIndex, aJS);
    return this;
  }

  /**
   * @return The number of contained JS elements
   */
  @Nonnegative
  public int getJSCount ()
  {
    return m_aJS.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllJSNodes ()
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    for (final Object aObj : m_aJS)
      if (aObj instanceof IHCNode)
        ret.add ((IHCNode) aObj);
    return ret;
  }

  @Nonnull
  public HCBody removeAllJS ()
  {
    m_aJS.clear ();
    return this;
  }

  public void addOutOfBandNode (@Nonnull final IHCBaseNode aOutOfBandNode)
  {
    if (aOutOfBandNode == null)
      throw new NullPointerException ("outOfBandNode");
    m_aOutOfBandNodes.add (aOutOfBandNode);
  }

  public void addOutOfBandNodes (@Nonnull final Iterable <? extends IHCBaseNode> aOutOfBandNodes)
  {
    if (aOutOfBandNodes == null)
      throw new NullPointerException ("outOfBandNodes");
    for (final IHCBaseNode aOutOfBandNode : aOutOfBandNodes)
      addOutOfBandNode (aOutOfBandNode);
  }

  @Override
  public IHCBaseNode getOutOfBandNode (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final IHCBaseNode aOutOfBandNode = super.getOutOfBandNode (aConversionSettings);
    if (m_aOutOfBandNodes.isEmpty ())
    {
      // This object has no out of band nodes
      return aOutOfBandNode;
    }

    // Concatenate nodes
    final HCNodeList ret = new HCNodeList (false);
    ret.addChild (aOutOfBandNode);
    ret.addChildren (m_aOutOfBandNodes);
    return ret.getAsSimpleNode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("outOfBandNodes", m_aOutOfBandNodes)
                            .toString ();
  }

  @OverrideOnDemand
  protected void emitJS (@Nonnull final IMicroElement eBody, @Nonnull final IHCConversionSettings aConversionSettings)
  {
    for (final IHCNode aJS : m_aJS)
      eBody.appendChild (aJS.getAsNode (aConversionSettings));
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (@Nonnull final IMicroElement eHead,
                                  @Nonnull final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (eHead, aConversionSettings);
    // JS files
    emitJS (eHead, aConversionSettings);
  }
}
