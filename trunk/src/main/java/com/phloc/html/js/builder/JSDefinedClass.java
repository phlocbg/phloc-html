/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2011 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.phloc.html.js.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.phloc.commons.collections.ContainerHelper;

/**
 * A generated Java class/interface/enum/....
 * <p>
 * This class models a declaration, and since a declaration can be always used
 * as a reference, it inherits {@link AbstractJSClass}.
 * <h2>Where to go from here?</h2>
 * <p>
 * You'd want to generate fields and methods on a class. See
 * {@link #method(AbstractJSType, String)} and
 * {@link #field(AbstractJSType, String)}.
 */
public class JSDefinedClass extends AbstractJSClass implements IJSDeclaration, IJSClassContainer, IJSDocCommentable
{
  /** Name of this class. Null if anonymous. */
  private String m_sName = null;

  /** Name of the super class of this class. */
  private AbstractJSClass m_aSuperClass;

  /** List of interfaces that this class implements */
  private final Set <AbstractJSClass> interfaces = new TreeSet <AbstractJSClass> ();

  /** Fields keyed by their names. */
  /* package */final Map <String, JSFieldVar> fields = new LinkedHashMap <String, JSFieldVar> ();

  /** Static initializer, if this class has one */
  private JSSBlock m_aInit = null;

  /** class javadoc */
  private JSDocComment jdoc = null;

  /** Set of constructors for this class, if any */
  private final List <JSMethod> constructors = new ArrayList <JSMethod> ();

  /** Set of methods that are members of this class */
  private final List <JSMethod> methods = new ArrayList <JSMethod> ();

  /**
   * Nested classes as a map from name to JDefinedClass. The name is all
   * capitalized in a case sensitive file system (
   * {@link JSCodeModel#isCaseSensitiveFileSystem}) to avoid conflicts. Lazily
   * created to save footprint.
   * 
   * @see #_getClasses()
   */
  private Map <String, JSDefinedClass> classes;

  /**
   * Client-app spcific metadata associated with this user-created class.
   */
  public Object metadata;

  /**
   * String that will be put directly inside the generated code. Can be null.
   */
  private String directBlock;

  /**
   * If this is a package-member class, this is {@link JSPackage}. If this is a
   * nested class, this is {@link JSDefinedClass}. If this is an anonymous
   * class, this constructor shouldn't be used.
   */
  private IJSClassContainer outer = null;

  JSDefinedClass (final IJSClassContainer parent, final String name)
  {
    this (name, parent, parent.owner ());
  }

  /**
   * Constructor for creating anonymous inner class.
   */
  JSDefinedClass (final JSCodeModel owner, final String name)
  {
    this (name, null, owner);
  }

  /**
   * JClass constructor
   * 
   * @param mods
   *        Modifiers for this class declaration
   * @param name
   *        Name of this class
   */
  private JSDefinedClass (final String name, final IJSClassContainer parent, final JSCodeModel owner)
  {
    super (owner);

    if (name.trim ().length () == 0)
      throw new IllegalArgumentException ("JClass name empty");

    if (!Character.isJavaIdentifierStart (name.charAt (0)))
    {
      final String msg = "JClass name " +
                         name +
                         " contains illegal character" +
                         " for beginning of identifier: " +
                         name.charAt (0);
      throw new IllegalArgumentException (msg);
    }
    for (int i = 1; i < name.length (); i++)
    {
      if (!Character.isJavaIdentifierPart (name.charAt (i)))
      {
        final String msg = "JClass name " + name + " contains illegal character " + name.charAt (i);
        throw new IllegalArgumentException (msg);
      }
    }

    this.m_sName = name;
    this.outer = parent;
  }

  /**
   * This class extends the specifed class.
   * 
   * @param superClass
   *        Superclass for this class
   * @return This class
   */
  public JSDefinedClass _extends (final AbstractJSClass superClass)
  {
    if (superClass == null)
      throw new NullPointerException ();

    for (AbstractJSClass o = superClass.outer (); o != null; o = o.outer ())
    {
      if (this == o)
      {
        throw new IllegalArgumentException ("Illegal class inheritance loop." +
                                            "  Outer class " +
                                            this.m_sName +
                                            " may not subclass from inner class: " +
                                            o.name ());
      }
    }

    this.m_aSuperClass = superClass;
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
   * This class implements the specifed interface.
   * 
   * @param iface
   *        Interface that this class implements
   * @return This class
   */
  public JSDefinedClass _implements (final AbstractJSClass iface)
  {
    interfaces.add (iface);
    return this;
  }

  /**
   * Returns an iterator that walks the nested classes defined in this class.
   */
  @Override
  public Iterator <AbstractJSClass> _implements ()
  {
    return interfaces.iterator ();
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
   * Gets the fully qualified name of this class.
   */
  @Override
  public String fullName ()
  {
    if (outer instanceof JSDefinedClass)
      return ((JSDefinedClass) outer).fullName () + '.' + name ();

    final JSPackage p = _package ();
    if (p.isUnnamed ())
      return name ();
    return p.name () + '.' + name ();
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
  public JSFieldVar field (final AbstractJSType type, final String name, final IJSExpression init)
  {
    final JSFieldVar f = new JSFieldVar (this, type, name, init);

    if (fields.containsKey (name))
    {
      throw new IllegalArgumentException ("trying to create the same field twice: " + name);
    }

    fields.put (name, f);
    return f;
  }

  /**
   * Returns all the fields declred in this class. The returned {@link Map} is a
   * read-only live view.
   * 
   * @return always non-null.
   */
  public Map <String, JSFieldVar> fields ()
  {
    return Collections.unmodifiableMap (fields);
  }

  /**
   * Removes a {@link JSFieldVar} from this class.
   * 
   * @throws IllegalArgumentException
   *         if the given field is not a field on this class.
   */
  public void removeField (final JSFieldVar field)
  {
    if (fields.remove (field.name ()) != field)
      throw new IllegalArgumentException ();
  }

  /**
   * Creates, if necessary, and returns the static initializer for this class.
   * 
   * @return JBlock containing initialization statements for this class
   */
  public JSSBlock init ()
  {
    if (m_aInit == null)
      m_aInit = new JSSBlock ();
    return m_aInit;
  }

  /**
   * Adds a constructor to this class.
   */
  public JSMethod constructor ()
  {
    final JSMethod c = new JSMethod (this);
    constructors.add (c);
    return c;
  }

  /**
   * Returns an iterator that walks the constructors defined in this class.
   */
  public Iterator <JSMethod> constructors ()
  {
    return constructors.iterator ();
  }

  /**
   * Looks for a method that has the specified method signature and return it.
   * 
   * @return null if not found.
   */
  public JSMethod getConstructor (final AbstractJSType [] argTypes)
  {
    for (final JSMethod m : constructors)
    {
      if (m.hasSignature (argTypes))
        return m;
    }
    return null;
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
  public JSMethod method (final AbstractJSType type, final String name)
  {
    // XXX problems caught in M constructor
    final JSMethod m = new JSMethod (this, type, name);
    methods.add (m);
    return m;
  }

  /**
   * Returns the set of methods defined in this class.
   */
  public Collection <JSMethod> methods ()
  {
    return methods;
  }

  /**
   * Looks for a method that has the specified method signature and return it.
   * 
   * @return null if not found.
   */
  public JSMethod getMethod (final String name, final AbstractJSType [] argTypes)
  {
    for (final JSMethod m : methods)
    {
      if (!m.name ().equals (name))
        continue;

      if (m.hasSignature (argTypes))
        return m;
    }
    return null;
  }

  public boolean isClass ()
  {
    return true;
  }

  public boolean isPackage ()
  {
    return false;
  }

  public JSPackage getPackage ()
  {
    return parentContainer ().getPackage ();
  }

  public JSDefinedClass _class (final String name) throws JSClassAlreadyExistsException
  {
    if (_getClasses ().containsKey (name))
      throw new JSClassAlreadyExistsException (_getClasses ().get (name));
    // XXX problems caught in the NC constructor
    final JSDefinedClass c = new JSDefinedClass (this, name);
    _getClasses ().put (name, c);
    return c;
  }

  /**
   * Creates, if necessary, and returns the class javadoc for this JDefinedClass
   * 
   * @return JDocComment containing javadocs for this class
   */
  public JSDocComment javadoc ()
  {
    if (jdoc == null)
      jdoc = new JSDocComment ();
    return jdoc;
  }

  /**
   * Returns an iterator that walks the nested classes defined in this class.
   */
  public final Collection <JSDefinedClass> classes ()
  {
    return classes == null ? ContainerHelper.<JSDefinedClass> newList () : ContainerHelper.newList (classes.values ());
  }

  private Map <String, JSDefinedClass> _getClasses ()
  {
    if (classes == null)
      classes = new TreeMap <String, JSDefinedClass> ();
    return classes;
  }

  /**
   * Returns all the nested classes defined in this class.
   */
  public final List <JSDefinedClass> listNestedClasses ()
  {
    if (classes == null)
      return new ArrayList <JSDefinedClass> ();
    return ContainerHelper.newList (classes.values ());
  }

  @Override
  public AbstractJSClass outer ()
  {
    if (outer.isClass ())
      return (AbstractJSClass) outer;
    return null;
  }

  public void declare (final JSFormatter f)
  {
    if (jdoc != null)
      f.nl ().generable (jdoc);

    f.id (m_sName);

    if (m_aSuperClass != null)
      f.nl ().indent ().plain ("extends").generable (m_aSuperClass).nl ().outdent ();

    if (!interfaces.isEmpty ())
    {
      if (m_aSuperClass == null)
        f.nl ();
      f.indent ().plain ("extends");
      f.generable (interfaces);
      f.nl ().outdent ();
    }
    declareBody (f);
  }

  /**
   * prints the body of a class.
   */
  protected void declareBody (final JSFormatter f)
  {
    f.plain ('{').nl ().nl ().indent ();

    for (final JSFieldVar field : fields.values ())
      f.decl (field);
    if (m_aInit != null)
      f.nl ().plain ("static").stmt (m_aInit);
    for (final JSMethod m : constructors)
    {
      f.nl ().decl (m);
    }
    for (final JSMethod m : methods)
    {
      f.nl ().decl (m);
    }
    if (classes != null)
      for (final JSDefinedClass dc : classes.values ())
        f.nl ().decl (dc);

    if (directBlock != null)
      f.plain (directBlock);
    f.nl ().outdent ().plain ('}').nl ();
  }

  /**
   * Places the given string directly inside the generated class. This method
   * can be used to add methods/fields that are not generated by CodeModel. This
   * method should be used only as the last resort.
   */
  public void direct (final String string)
  {
    if (directBlock == null)
      directBlock = string;
    else
      directBlock += string;
  }

  @Override
  public final JSPackage _package ()
  {
    IJSClassContainer p = outer;
    while (!(p instanceof JSPackage))
      p = p.parentContainer ();
    return (JSPackage) p;
  }

  public final IJSClassContainer parentContainer ()
  {
    return outer;
  }
}
