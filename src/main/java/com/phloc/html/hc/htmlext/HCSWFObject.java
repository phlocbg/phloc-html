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
package com.phloc.html.hc.htmlext;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.ReturnsImmutableObject;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.url.ISimpleURL;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.api.IHCHasExternalJS;
import com.phloc.html.hc.html.HCDiv;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.hc.impl.AbstractWrappedHCNode;
import com.phloc.html.hc.impl.HCNodeList;
import com.phloc.html.js.marshal.JSMarshaller;
import com.phloc.html.js.provider.CollectingJSCodeProvider;
import com.phloc.html.resource.js.ConstantJSPathProvider;
import com.phloc.html.resource.js.IJSPathProvider;

/**
 * Create the necessary tags for embedding a flash files using SWFObject.<br>
 * See <a href="http://code.google.com/p/swfobject/">SWFObject web site</a>
 * 
 * @author philip
 */
public class HCSWFObject extends AbstractWrappedHCNode implements IHCHasExternalJS
{
  private static final List <IJSPathProvider> JS = ContainerHelper.<IJSPathProvider> newUnmodifiableList (new ConstantJSPathProvider ("swfobject/swfobject-2.2.js"));

  // Required:
  private ISimpleURL m_aSWFURL;
  private String m_sHTMLContainerID;
  private String m_sWidth;
  private String m_sHeight;
  private String m_sRequiredSWFVersion;
  // Optional
  private ISimpleURL m_aExpressInstallSWFURL;
  private Map <String, Object> m_aFlashVars;
  private Map <String, String> m_aObjectParams;
  private Map <String, String> m_aObjectAttrs;

  public HCSWFObject ()
  {}

  @Nonnull
  @ReturnsImmutableObject
  public List <IJSPathProvider> getRequiredJSFiles ()
  {
    return JS;
  }

  @Nonnull
  public final HCSWFObject setSWFURL (final ISimpleURL aSWFURL)
  {
    m_aSWFURL = aSWFURL;
    return this;
  }

  @Nonnull
  public final HCSWFObject setHTMLContainerID (final String sHTMLContainerID)
  {
    m_sHTMLContainerID = sHTMLContainerID;
    return this;
  }

  /**
   * Set the width in pixel.
   * 
   * @param nWidth
   *        The widths in pixel
   * @return this
   */
  @Nonnull
  public final HCSWFObject setWidth (final int nWidth)
  {
    if (nWidth > 0)
      m_sWidth = Integer.toString (nWidth);
    return this;
  }

  /**
   * Set the width in percent relative to the parent object
   * 
   * @param nWidth
   *        The width in percent. Should be between 0 and 100
   * @return this
   */
  @Nonnull
  public final HCSWFObject setWidthPerc (final int nWidth)
  {
    m_sWidth = Integer.toString (nWidth) + "%";
    return this;
  }

  /**
   * Set the height in pixel.
   * 
   * @param nHeight
   *        The height in pixel
   * @return this
   */
  @Nonnull
  public final HCSWFObject setHeight (final int nHeight)
  {
    if (nHeight > 0)
      m_sHeight = Integer.toString (nHeight);
    return this;
  }

  /**
   * Set the height in percent relative to the parent object
   * 
   * @param nHeight
   *        The height in percent. Should be between 0 and 100
   * @return this
   */
  @Nonnull
  public final HCSWFObject setHeightPerc (final int nHeight)
  {
    m_sHeight = Integer.toString (nHeight) + "%";
    return this;
  }

  /**
   * Set the required flash player version
   * 
   * @param sRequiredSWFVersion
   *        Text version string like "10.0.0". No check on the formatting is
   *        done.
   * @return this
   */
  @Nonnull
  public final HCSWFObject setRequiredSWFVersion (@Nullable final String sRequiredSWFVersion)
  {
    m_sRequiredSWFVersion = sRequiredSWFVersion;
    return this;
  }

  /**
   * Set an optional URL where the express installation SWF file is located.
   * 
   * @param aExpressInstallSWFURL
   *        The URL to the object. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  public final HCSWFObject setExpressInstallSWFURL (@Nullable final ISimpleURL aExpressInstallSWFURL)
  {
    m_aExpressInstallSWFURL = aExpressInstallSWFURL;
    return this;
  }

  /**
   * Add a parameter to be passed to the Flash object
   * 
   * @param sName
   *        Parameter name
   * @param aValue
   *        Parameter value
   * @return this
   */
  @Nonnull
  public final HCSWFObject addFlashVar (@Nonnull final String sName, final Object aValue)
  {
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("The name '" + sName + "' is not a legal JS identifier!");

    if (m_aFlashVars == null)
      m_aFlashVars = new LinkedHashMap <String, Object> ();
    m_aFlashVars.put (sName, aValue);
    return this;
  }

  /**
   * Remove a flash variable
   * 
   * @param sName
   *        The name of the flash variable to be removed
   * @return this
   */
  @Nonnull
  public final HCSWFObject removeFlashVar (@Nullable final String sName)
  {
    if (m_aFlashVars != null)
      m_aFlashVars.remove (sName);
    return this;
  }

  /**
   * Add a <code>param</code> tag to the created <code>object</code> tag
   * 
   * @param sName
   *        Parameter name
   * @param sValue
   *        Parameter value
   * @return this
   */
  @Nonnull
  public final HCSWFObject addObjectParam (@Nonnull final String sName, final String sValue)
  {
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("The name '" + sName + "' is not a legal JS identifier!");

    if (m_aObjectParams == null)
      m_aObjectParams = new LinkedHashMap <String, String> ();
    m_aObjectParams.put (sName, sValue);
    return this;
  }

  /**
   * Remove a <code>param</code> tag that should be created underneath the
   * <code>object</code> tag.
   * 
   * @param sName
   *        The name of the parameter to be removed
   * @return this
   */
  @Nonnull
  public final HCSWFObject removeObjectParam (@Nullable final String sName)
  {
    if (m_aObjectParams != null)
      m_aObjectParams.remove (sName);
    return this;
  }

  /**
   * Add an attribute to the created <code>object</code> tag
   * 
   * @param sName
   *        Attribute name
   * @param sValue
   *        Attribute value
   * @return this
   */
  @Nonnull
  public final HCSWFObject addObjectAttr (@Nonnull final String sName, final String sValue)
  {
    if (!JSMarshaller.isJSIdentifier (sName))
      throw new IllegalArgumentException ("The name '" + sName + "' is not a legal JS identifier!");

    if (m_aObjectAttrs == null)
      m_aObjectAttrs = new LinkedHashMap <String, String> ();
    m_aObjectAttrs.put (sName, sValue);
    return this;
  }

  /**
   * Remove an attribute that of the <code>object</code> tag.
   * 
   * @param sName
   *        The name of the attribute to be removed
   * @return this
   */
  @Nonnull
  public final HCSWFObject removeObjectAttr (@Nullable final String sName)
  {
    if (m_aObjectAttrs != null)
      m_aObjectAttrs.remove (sName);
    return this;
  }

  @Override
  protected final IHCNode getContainedHCNode ()
  {
    if (m_aSWFURL == null)
      throw new IllegalStateException ("No SWF URL present");
    if (StringHelper.hasNoText (m_sHTMLContainerID))
      throw new IllegalStateException ("No HTML container ID present");
    if (StringHelper.hasNoText (m_sWidth))
      throw new IllegalStateException ("No width present");
    if (StringHelper.hasNoText (m_sHeight))
      throw new IllegalStateException ("No height present");
    if (StringHelper.hasNoText (m_sRequiredSWFVersion))
      throw new IllegalStateException ("No required SWF version present");

    final CollectingJSCodeProvider aJS = new CollectingJSCodeProvider ();
    aJS.append ("var flashvars = {};\n");
    aJS.append ("var params = {};\n");
    aJS.append ("var attributes = {};\n");
    if (m_aFlashVars != null)
      for (final Map.Entry <String, Object> aEntry : m_aFlashVars.entrySet ())
        aJS.append ("flashvars.")
           .append (aEntry.getKey ())
           .append (" = ")
           .append (JSMarshaller.objectToJSString (aEntry.getValue ()))
           .append (";\n");
    if (m_aObjectParams != null)
      for (final Map.Entry <String, String> aEntry : m_aObjectParams.entrySet ())
        aJS.append ("params.")
           .append (aEntry.getKey ())
           .append (" = ")
           .append (JSMarshaller.objectToJSString (aEntry.getValue ()))
           .append (";\n");
    if (m_aObjectAttrs != null)
      for (final Map.Entry <String, String> aEntry : m_aObjectAttrs.entrySet ())
        aJS.append ("attributes.")
           .append (aEntry.getKey ())
           .append (" = ")
           .append (JSMarshaller.objectToJSString (aEntry.getValue ()))
           .append (";\n");

    // Call embedder
    aJS.append ("swfobject.embedSWF(\"")
       .appendEscaped (m_aSWFURL.getAsString ())
       .append ("\", \"")
       .appendEscaped (m_sHTMLContainerID)
       .append ("\", \"")
       .append (m_sWidth)
       .append ("\", \"")
       .append (m_sHeight)
       .append ("\", \"")
       .appendEscaped (m_sRequiredSWFVersion)
       .append ("\", ");
    // only supported by Flash Player 6.0.65; m_nWidth >= 310 && m_nHeight >=
    // 147;
    if (m_aExpressInstallSWFURL != null)
      aJS.append ('"').appendEscaped (m_aExpressInstallSWFURL.getAsString ()).append ('"');
    else
      aJS.append (JSMarshaller.KEYWORD_NULL);
    aJS.append (", flashvars, params, attributes);\n");

    final HCNodeList ret = new HCNodeList ();
    ret.addChild (new HCDiv ("DummySWFNode").setID (m_sHTMLContainerID));
    ret.addChild (new HCScript (aJS));
    return ret;
  }
}
