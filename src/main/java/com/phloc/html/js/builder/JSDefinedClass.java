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
package com.phloc.html.js.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * A generated JS class.
 * 
 * @author philip
 */
public class JSDefinedClass extends AbstractJSClass implements IJSDeclaration, IJSDocCommentable
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (JSDefinedClass.class);

  /** class JSDoc */
  private JSCommentMultiLine m_aJSDoc;

  /** Ownining package */
  private final JSPackage m_aPackage;

  /** Name of this class. */
  private final String m_sName;

  /** Name of the super class of this class. */
  private AbstractJSClass m_aSuperClass;

  /** Fields keyed by their names. */
  final Map <String, JSFieldVar> m_aFields = new LinkedHashMap <String, JSFieldVar> ();

  /** Constructors for this class */
  private JSConstructor m_aConstructor;

  /** Set of methods that are members of this class */
  private final List <JSMethod> m_aMethods = new ArrayList <JSMethod> ();

  /**
   * constructor
   * 
   * @param parent
   *        Owning package. May be <code>null</code>.
   * @param name
   *        Name of this class
   */
  JSDefinedClass (@Nullable final JSPackage parent, @Nonnull @Nonempty final String name)
  {
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Illegal class name: " + name);
    if (!Character.isUpperCase (name.charAt (0)))
      s_aLogger.warn ("Class names should always start with an upper-case character: " + name);
    m_aPackage = parent;
    m_sName = name;
  }

  @Override
  @Nullable
  public final JSPackage _package ()
  {
    return m_aPackage;
  }

  /**
   * This class extends the specified class.
   * 
   * @param superClass
   *        Superclass for this class
   * @return This class
   */
  @Nonnull
  public JSDefinedClass _extends (@Nonnull final AbstractJSClass superClass)
  {
    if (superClass == null)
      throw new NullPointerException ();

    m_aSuperClass = superClass;
    return this;
  }

  /**
   * Returns the class extended by this class.
   */
  @Override
  public AbstractJSClass _extends ()
  {
    return m_aSuperClass;
  }

  /**
   * JClass name accessor.
   * <p>
   * For example, for <code>java.util.List</code>, this method returns
   * <code>"List"</code>"
   * 
   * @return Name of this class
   */
  @Override
  public String name ()
  {
    return m_sName;
  }

  /**
   * Adds a field to the list of field members of this JDefinedClass.
   * 
   * @param type
   *        type of this field
   * @param name
   *        Name of this field
   * @return Newly generated field
   */
  @Nonnull
  public JSFieldVar field (@Nullable final AbstractJSType type, @Nonnull @Nonempty final String name)
  {
    return field (type, name, null);
  }

  /**
   * Adds a field to the list of field members of this JDefinedClass.
   * 
   * @param type
   *        type of this field.
   * @param name
   *        Name of this field.
   * @param init
   *        Initial value of this field.
   * @return Newly generated field
   */
  @Nonnull
  public JSFieldVar field (@Nullable final AbstractJSType type,
                           @Nonnull @Nonempty final String name,
                           @Nullable final IJSExpression init)
  {
    final JSFieldVar f = new JSFieldVar (this, type, name, init);

    if (m_aFields.containsKey (name))
      throw new IllegalArgumentException ("trying to create the same field twice: " + name);

    m_aFields.put (name, f);
    return f;
  }

  /**
   * Returns all the fields declared in this class. The returned {@link Map} is
   * a read-only live view.
   * 
   * @return always non-null.
   */
  @Nonnull
  @ReturnsMutableCopy
  public Map <String, JSFieldVar> fields ()
  {
    return ContainerHelper.newMap (m_aFields);
  }

  /**
   * Removes a {@link JSFieldVar} from this class.
   * 
   * @throws IllegalArgumentException
   *         if the given field is not a field on this class.
   */
  public void removeField (final JSFieldVar field)
  {
    if (m_aFields.remove (field.name ()) != field)
      throw new IllegalArgumentException ();
  }

  /**
   * Adds a constructor to this class.
   * 
   * @return The constructor object to use. Never <code>null</code>.
   */
  @Nonnull
  public JSConstructor constructor ()
  {
    if (m_aConstructor != null)
      return m_aConstructor;
    final JSConstructor aConstructor = new JSConstructor (this);
    m_aConstructor = aConstructor;
    return aConstructor;
  }

  /**
   * Add a method to the list of method members of this JS class instance.
   * 
   * @param name
   *        Name of the method
   * @return Newly generated method
   */
  @Nonnull
  public JSMethod method (@Nonnull @Nonempty final String name)
  {
    return method (null, name);
  }

  /**
   * Add a method to the list of method members of this JS class instance.
   * 
   * @param type
   *        Return type for this method
   * @param name
   *        Name of the method
   * @return Newly generated method
   */
  @Nonnull
  public JSMethod method (@Nullable final AbstractJSType type, @Nonnull @Nonempty final String name)
  {
    final JSMethod m = new JSMethod (this, type, name);
    m_aMethods.add (m);
    return m;
  }

  /**
   * Returns the set of methods defined in this class.
   */
  @Nonnull
  @ReturnsMutableCopy
  public Collection <JSMethod> methods ()
  {
    return ContainerHelper.newList (m_aMethods);
  }

  /**
   * Creates, if necessary, and returns the class javadoc for this JDefinedClass
   * 
   * @return {@link JSCommentMultiLine} containing javadocs for this class
   */
  @Nonnull
  public JSCommentMultiLine jsDoc ()
  {
    if (m_aJSDoc == null)
      m_aJSDoc = new JSCommentMultiLine ();
    return m_aJSDoc;
  }

  @Nonnull
  public JSFieldRef prototype ()
  {
    return staticRef ("prototype");
  }

  public void declare (final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.nl ().generatable (m_aJSDoc);

    // Emit the constructor first
    f.decl (constructor ());

    // Start with the prototype methods
    f.plain (m_sName).plain (".prototype=").nl ().plain ('{').nl ().indent ();

    int nIndex = 0;
    for (final JSMethod m : m_aMethods)
    {
      f.decl (m);
      if (++nIndex < m_aMethods.size ())
        f.plain (',');
      f.nl ();
    }

    f.outdent ().plain ('}').nl ();
  }

  @Nullable
  public String getJSCode ()
  {
    return JSPrinter.getAsString (this);
  }
}
