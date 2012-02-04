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
package com.phloc.html.condcomment;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.CGlobal;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.microdom.IMicroNode;
import com.phloc.commons.microdom.impl.MicroComment;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.commons.version.Version;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.conversion.HCConversionSettings;
import com.phloc.html.hc.impl.HCCommentNode;

/**
 * Represents an HTML conditional comment for IE specific usage.
 * 
 * @author philip
 */
@Immutable
public final class ConditionalComment
{
  private final String m_sCondition;

  private ConditionalComment (@Nonnull @Nonempty final String sCondition)
  {
    if (StringHelper.hasNoText (sCondition))
      throw new IllegalArgumentException ("Passed condition may not be empty!");
    m_sCondition = sCondition;
  }

  @Nonnull
  @Nonempty
  public String getCondition ()
  {
    return m_sCondition;
  }

  /**
   * This method wraps an arbitrary node in a conditional node. The passed node
   * is simply converted to an XML string and the content is put into the
   * conditional comment.
   * 
   * @param aNode
   *        The node to be wrapped. May not be <code>null</code> and should not
   *        be a comment node.
   * @return The wrapped node.
   */
  @Nonnull
  public IMicroNode getNodeWrappedInCondition (@Nonnull final IMicroNode aNode)
  {
    final String sText = '[' +
                         m_sCondition +
                         "]>" +
                         CGlobal.LINE_SEPARATOR +
                         MicroWriter.getXMLString (aNode) +
                         "<![endif]";
    return new MicroComment (sText);
  }

  @Nonnull
  public IHCNode getNodeWrappedInCondition (@Nonnull final IHCNode aNode,
                                            @Nonnull final HCConversionSettings aConversionSettings)
  {
    final String sText = '[' +
                         m_sCondition +
                         "]>" +
                         CGlobal.LINE_SEPARATOR +
                         MicroWriter.getXMLString (aNode.getAsNode (aConversionSettings)) +
                         "<![endif]";
    return new HCCommentNode (sText);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof ConditionalComment))
      return false;
    final ConditionalComment rhs = (ConditionalComment) o;
    return m_sCondition.equals (rhs.m_sCondition);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sCondition).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("condition", m_sCondition).toString ();
  }

  @Nonnull
  public static ConditionalComment createForIE ()
  {
    return new ConditionalComment ("if IE");
  }

  @Nonnull
  public static ConditionalComment createForIEExactVersion (@Nonnull final Version aVersion)
  {
    return new ConditionalComment ("if IE " + aVersion.getAsString ());
  }

  @Nonnull
  public static ConditionalComment createForIENotVersion (@Nonnull final Version aVersion)
  {
    return new ConditionalComment ("if !IE " + aVersion.getAsString ());
  }

  @Nonnull
  public static ConditionalComment createForIELowerThanVersion (@Nonnull final Version aVersion)
  {
    return new ConditionalComment ("if lt IE " + aVersion.getAsString ());
  }

  @Nonnull
  public static ConditionalComment createForIELowerOrEqualThanVersion (@Nonnull final Version aVersion)
  {
    return new ConditionalComment ("if lte IE " + aVersion.getAsString ());
  }

  @Nonnull
  public static ConditionalComment createForIEGreaterThanVersion (@Nonnull final Version aVersion)
  {
    return new ConditionalComment ("if gt IE " + aVersion.getAsString ());
  }

  @Nonnull
  public static ConditionalComment createForIEGreaterOrEqualThanVersion (@Nonnull final Version aVersion)
  {
    return new ConditionalComment ("if gte IE " + aVersion.getAsString ());
  }

  @Nullable
  public static ConditionalComment fromStringOrNull (@Nullable final String sValue)
  {
    if (StringHelper.hasNoText (sValue))
      return null;
    return new ConditionalComment (sValue);
  }
}
