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
package com.phloc.html.hc.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.charset.CCharset;
import com.phloc.commons.charset.CharsetManager;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.version.Version;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Represents an HTML conditional comment for IE specific usage. E.g.
 * 
 * <pre>
 * &lt;!--[if IE 6]>
 * Special instructions for IE 6 here
 * &lt;![endif]-->
 * </pre>
 * 
 * @author philip
 */
@Immutable
public class HCConditionalCommentNode extends AbstractHCWrappingNode
{
  public static final String DEFAULT_LINE_SEPARATOR = CGlobal.LINE_SEPARATOR;
  private static String s_sDefaultLineSeparator = DEFAULT_LINE_SEPARATOR;

  private String m_sCondition;
  private final IHCBaseNode m_aWrappedNode;
  private String m_sLineSeparator = s_sDefaultLineSeparator;

  public HCConditionalCommentNode (@Nonnull @Nonempty final String sCondition, @Nonnull final IHCBaseNode aWrappedNode)
  {
    if (StringHelper.hasNoText (sCondition))
      throw new IllegalArgumentException ("Passed condition may not be empty!");
    if (aWrappedNode == null)
      throw new NullPointerException ("wrappedNode");
    if (aWrappedNode instanceof HCCommentNode)
      throw new IllegalArgumentException ("You cannot wrap a comment inside a conditional comment");
    if (aWrappedNode instanceof HCConditionalCommentNode)
      throw new IllegalArgumentException ("You cannot wrap a conditional comment inside another conditional comment");
    m_sCondition = sCondition;
    m_aWrappedNode = aWrappedNode;
  }

  /**
   * @return The condition for the conditional comment
   */
  @Nonnull
  @Nonempty
  public String getCondition ()
  {
    return m_sCondition;
  }

  @Nonnull
  public HCConditionalCommentNode setCondition (@Nonnull @Nonempty final String sCondition)
  {
    if (StringHelper.hasNoText (sCondition))
      throw new IllegalArgumentException ("Passed condition may not be empty!");
    m_sCondition = sCondition;
    return this;
  }

  @Nonnull
  public IHCBaseNode getWrappedNode ()
  {
    return m_aWrappedNode;
  }

  @Nonnull
  @Nonempty
  public String getLineSeparator ()
  {
    return m_sLineSeparator;
  }

  @Nonnull
  public HCConditionalCommentNode setLineSeparator (@Nonnull @Nonempty final String sLineSeparator)
  {
    if (StringHelper.hasNoText (sLineSeparator))
      throw new IllegalArgumentException ("lineSeparator");
    m_sLineSeparator = sLineSeparator;
    return this;
  }

  @Nonnull
  @Nonempty
  private String _getCommentText (@Nonnull final IMicroNode aNode)
  {
    return '[' + m_sCondition + "]>" + m_sLineSeparator + MicroWriter.getXMLString (aNode) + "<![endif]";
  }

  /**
   * This method wraps an arbitrary HC node in a conditional node. The passed
   * node is simply converted to an XML string and the content is put into the
   * conditional comment.
   * 
   * @return The wrapped node. Never <code>null</code>.
   */
  @Nonnull
  public HCCommentNode getCommentNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return new HCCommentNode (_getCommentText (m_aWrappedNode.getAsNode (aConversionSettings)));
  }

  @Override
  @Nullable
  protected IMicroNode internalGetAsNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return getCommentNode (aConversionSettings).getAsNode (aConversionSettings);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("condition", m_sCondition)
                                       .append ("lineSeparator",
                                                StringHelper.getHexEncoded (CharsetManager.getAsBytes (m_sLineSeparator,
                                                                                                       CCharset.CHARSET_ISO_8859_1_OBJ)))
                                       .append ("wrappedNode", m_aWrappedNode)
                                       .toString ();
  }

  @Nonnull
  @Nonempty
  public static String getDefaultLineSeparator ()
  {
    return s_sDefaultLineSeparator;
  }

  public static void setDefaultLineSeparator (@Nonnull @Nonempty final String sDefaultLineSeparator)
  {
    if (StringHelper.hasNoText (sDefaultLineSeparator))
      throw new IllegalArgumentException ("defaultLineSeparator");
    s_sDefaultLineSeparator = sDefaultLineSeparator;
  }

  @Nonnull
  public static HCConditionalCommentNode createForIE (@Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if IE", aWrappedNode);
  }

  @Nonnull
  public static HCConditionalCommentNode createForIEExactVersion (@Nonnull final Version aVersion,
                                                                  @Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if IE " + aVersion.getAsString (), aWrappedNode);
  }

  @Nonnull
  public static HCConditionalCommentNode createForIENotVersion (@Nonnull final Version aVersion,
                                                                @Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if !IE " + aVersion.getAsString (), aWrappedNode);
  }

  @Nonnull
  public static HCConditionalCommentNode createForIELowerThanVersion (@Nonnull final Version aVersion,
                                                                      @Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if lt IE " + aVersion.getAsString (), aWrappedNode);
  }

  @Nonnull
  public static HCConditionalCommentNode createForIELowerOrEqualThanVersion (@Nonnull final Version aVersion,
                                                                             @Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if lte IE " + aVersion.getAsString (), aWrappedNode);
  }

  @Nonnull
  public static HCConditionalCommentNode createForIEGreaterThanVersion (@Nonnull final Version aVersion,
                                                                        @Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if gt IE " + aVersion.getAsString (), aWrappedNode);
  }

  @Nonnull
  public static HCConditionalCommentNode createForIEGreaterOrEqualThanVersion (@Nonnull final Version aVersion,
                                                                               @Nonnull final IHCNode aWrappedNode)
  {
    return new HCConditionalCommentNode ("if gte IE " + aVersion.getAsString (), aWrappedNode);
  }

  @Nullable
  public static HCConditionalCommentNode fromStringOrNull (@Nullable final String sValue,
                                                           @Nonnull final IHCNode aWrappedNode)
  {
    if (StringHelper.hasNoText (sValue))
      return null;
    return new HCConditionalCommentNode (sValue, aWrappedNode);
  }
}
