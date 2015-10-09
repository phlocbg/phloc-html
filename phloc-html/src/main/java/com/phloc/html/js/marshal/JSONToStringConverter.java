/**
 * Copyright (C) 2006-2015 phloc systems
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
package com.phloc.html.js.marshal;

import java.io.Serializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.hash.HashCodeGenerator;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.json.IJSON;

/**
 * Implementation of the {@link IJSToStringConverter} interface, for converting
 * native {@link IJSON} objects.
 * 
 * @author Philip Helger
 */
@Immutable
public final class JSONToStringConverter implements IJSToStringConverter, Serializable
{
  @Nullable
  public String objectToJSString (@Nullable final Object aObject, @Nonnull final JSType aType)
  {
    if (aObject != null && !(aObject instanceof IJSON))
      throw new IllegalArgumentException ("The passed object is not of type IJSON but " +
                                          aObject.getClass ().getName ());
    if (aType != JSType.JSON)
      throw new IllegalArgumentException ("Unexpected JSType '" + aType + "'! Only JSON is supported!");
    return aObject == null ? null : ((IJSON) aObject).getJSONString ();
  }

  @Override
  public boolean equals (final Object o)
  {
    return o instanceof JSONToStringConverter;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).toString ();
  }
}
