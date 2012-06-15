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

import javax.annotation.Nullable;

/**
 * Class for representing a simple HTML &lt;table&gt;.
 * 
 * @author philip
 */
public final class HCTable extends AbstractHCTable <HCTable>
{
  public HCTable ()
  {
    super ();
  }

  public HCTable (@Nullable final HCCol aCol)
  {
    super (aCol);
  }

  public HCTable (@Nullable final HCCol... aCols)
  {
    super (aCols);
  }

  public HCTable (@Nullable final Iterable <HCCol> aCols)
  {
    super (aCols);
  }
}
