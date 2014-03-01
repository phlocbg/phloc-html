/*
 * Copyright (C) 2011 René Jeschke <rene_jeschke@yahoo.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.markdown;

import javax.annotation.Nonnull;

import com.phloc.html.hc.html.HCA;
import com.phloc.html.hc.html.HCBlockQuote;
import com.phloc.html.hc.html.HCCode;
import com.phloc.html.hc.html.HCEM;
import com.phloc.html.hc.html.HCH1;
import com.phloc.html.hc.html.HCH2;
import com.phloc.html.hc.html.HCH3;
import com.phloc.html.hc.html.HCH4;
import com.phloc.html.hc.html.HCH5;
import com.phloc.html.hc.html.HCH6;
import com.phloc.html.hc.html.HCHR;
import com.phloc.html.hc.html.HCImg;
import com.phloc.html.hc.html.HCLI;
import com.phloc.html.hc.html.HCOL;
import com.phloc.html.hc.html.HCP;
import com.phloc.html.hc.html.HCPre;
import com.phloc.html.hc.html.HCS;
import com.phloc.html.hc.html.HCStrong;
import com.phloc.html.hc.html.HCSup;
import com.phloc.html.hc.html.HCUL;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Default Decorator implementation.
 * <p>
 * Example for a user Decorator having a class attribute on &lt;p> tags.
 * </p>
 * 
 * <pre>
 * <code>public class MyDecorator extends DefaultDecorator
 * {
 *     &#64;Override
 *     public void openParagraph(StringBuilder out)
 *     {
 *         out.append("&lt;p class=\"myclass\">");
 *     }
 * }
 * </code>
 * </pre>
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
public class DefaultDecorator implements IDecorator
{
  /** Constructor. */
  public DefaultDecorator ()
  {}

  public void openParagraph (final HCStack out)
  {
    out.push (new HCP ());
  }

  public void closeParagraph (final HCStack out)
  {
    out.pop ();
  }

  public void openBlockquote (final HCStack out)
  {
    out.push (new HCBlockQuote ());
  }

  public void closeBlockquote (final HCStack out)
  {
    out.pop ();
  }

  public void openCodeBlock (final HCStack out)
  {
    out.push (new HCPre ());
    out.push (new HCCode ());
  }

  public void closeCodeBlock (final HCStack out)
  {
    out.pop ();
    out.pop ();
  }

  @Nonnull
  public HCCode openCodeSpan (final HCStack out)
  {
    return out.push (new HCCode ());
  }

  public void closeCodeSpan (final HCStack out)
  {
    out.pop ();
  }

  public AbstractHCElementWithChildren <?> openHeadline (final HCStack out, final int level)
  {
    switch (level)
    {
      case 1:
        return out.push (new HCH1 ());
      case 2:
        return out.push (new HCH2 ());
      case 3:
        return out.push (new HCH3 ());
      case 4:
        return out.push (new HCH4 ());
      case 5:
        return out.push (new HCH5 ());
      case 6:
        return out.push (new HCH6 ());
    }
    throw new IllegalArgumentException ();
  }

  public void closeHeadline (final HCStack out, final int level)
  {
    out.pop ();
  }

  public void openStrong (final HCStack out)
  {
    out.push (new HCStrong ());
  }

  public void closeStrong (final HCStack out)
  {
    out.pop ();
  }

  public void openStrike (final HCStack out)
  {
    out.push (new HCS ());
  }

  public void closeStrike (final HCStack out)
  {
    out.pop ();
  }

  public void openEmphasis (final HCStack out)
  {
    out.push (new HCEM ());
  }

  public void closeEmphasis (final HCStack out)
  {
    out.pop ();
  }

  public void openSuper (final HCStack out)
  {
    out.push (new HCSup ());
  }

  public void closeSuper (final HCStack out)
  {
    out.pop ();
  }

  public void openOrderedList (final HCStack out)
  {
    out.push (new HCOL ());
  }

  public void closeOrderedList (final HCStack out)
  {
    out.pop ();
  }

  public void openUnorderedList (final HCStack out)
  {
    out.push (new HCUL ());
  }

  public void closeUnorderedList (final HCStack out)
  {
    out.pop ();
  }

  public HCLI openListItem (final HCStack out)
  {
    return out.push (new HCLI ());
  }

  public void closeListItem (final HCStack out)
  {
    out.pop ();
  }

  public void appendHorizontalRuler (final HCStack out)
  {
    out.append (new HCHR ());
  }

  public HCA openLink (final HCStack out)
  {
    return out.push (new HCA ());
  }

  public void closeLink (final HCStack out)
  {
    out.pop ();
  }

  public HCImg appendImage (final HCStack out)
  {
    final HCImg ret = new HCImg ();
    out.append (ret);
    return ret;
  }
}
