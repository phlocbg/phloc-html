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

import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.html.js.marshal.JSMarshaller;

/**
 * A generated JS class.
 * 
 * @author philip
 */
public class JSDefinedClass extends AbstractJSClass implements IJSDeclaration, IJSDocCommentable
{
  /**
   * If this is a package-member class, this is {@link JSPackage}.
   */
  private final JSPackage m_aOuter;

  /** Name of this class. */
  private final String m_sName;

  /** Name of the super class of this class. */
  private AbstractJSClass m_aSuperClass;

  /** Fields keyed by their names. */
  final Map <String, JSFieldVar> m_aFields = new LinkedHashMap <String, JSFieldVar> ();

  /** class JSDoc */
  private JSCommentMultiLine m_aJSDoc;

  /** Set of constructors for this class, if any */
  private final List <JSMethod> m_aConstructors = new ArrayList <JSMethod> ();

  /** Set of methods that are members of this class */
  private final List <JSMethod> m_aMethods = new ArrayList <JSMethod> ();

  /**
   * String that will be put directly inside the generated code. Can be null.
   */
  private String m_sDirectBlock;

  /**
   * JClass constructor
   * 
   * @param parent
   *        Modifiers for this class declaration
   * @param name
   *        Name of this class
   */
  JSDefinedClass (final JSPackage parent, final String name)
  {
    if (StringHelper.hasNoTextAfterTrim (name))
      throw new IllegalArgumentException ("JSDefinedClass name empty");
    if (!JSMarshaller.isJSIdentifier (name))
      throw new IllegalArgumentException ("Illegal class name: " + name);
    m_aOuter = parent;
    m_sName = name;
  }

  /**
   * This class extends the specifed class.
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
   *        JType of this field
   * @param name
   *        Name of this field
   * @return Newly generated field
   */
  @Nonnull
  public JSFieldVar field (final AbstractJSType type, final String name)
  {
    return field (type, name, null);
  }

  /**
   * Adds a field to the list of field members of this JDefinedClass.
   * 
   * @param type
   *        JType of this field.
   * @param name
   *        Name of this field.
   * @param init
   *        Initial value of this field.
   * @return Newly generated field
   */
  @Nonnull
  public JSFieldVar field (final AbstractJSType type, final String name, final IJSExpression init)
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
   */
  @Nonnull
  public JSMethod constructor ()
  {
    final JSMethod c = new JSMethod (this);
    m_aConstructors.add (c);
    return c;
  }

  /**
   * Returns an iterator that walks the constructors defined in this class.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <JSMethod> constructors ()
  {
    return ContainerHelper.newList (m_aConstructors);
  }

  /**
   * Add a method to the list of method members of this JDefinedClass instance.
   * 
   * @param type
   *        Return type for this method
   * @param name
   *        Name of the method
   * @return Newly generated JMethod
   */
  @Nonnull
  public JSMethod method (final AbstractJSType type, final String name)
  {
    // XXX problems caught in M constructor
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

  public void declare (final JSFormatter f)
  {
    if (m_aJSDoc != null)
      f.nl ().generatable (m_aJSDoc);

    f.plain (m_sName);

    if (m_aSuperClass != null)
      f.nl ().indent ().plain ("extends").generatable (m_aSuperClass).nl ().outdent ();

    declareBody (f);
  }

  /**
   * prints the body of a class.
   */
  protected void declareBody (final JSFormatter f)
  {
    f.plain ('{').nl ().indent ();

    for (final JSFieldVar field : m_aFields.values ())
      f.decl (field);
    for (final JSMethod m : m_aConstructors)
      f.nl ().decl (m);
    for (final JSMethod m : m_aMethods)
      f.nl ().decl (m);

    if (m_sDirectBlock != null)
      f.plain (m_sDirectBlock);
    f.nl ().outdent ().plain ('}').nl ();
  }

  /**
   * Places the given string directly inside the generated class. This method
   * can be used to add methods/fields that are not generated by CodeModel. This
   * method should be used only as the last resort.
   */
  public void direct (final String string)
  {
    if (m_sDirectBlock == null)
      m_sDirectBlock = string;
    else
      m_sDirectBlock += string;
  }

  @Override
  public final JSPackage _package ()
  {
    return m_aOuter;
  }
}
