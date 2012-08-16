/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
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

import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.phloc.commons.collections.ContainerHelper;

/**
 * This is a utility class for managing indentation and other basic formatting
 * for PrintWriter.
 */
public final class JSFormatter
{
  /** all classes and ids encountered during the collection mode **/
  /**
   * map from short type name to ReferenceList (list of JClass and ids sharing
   * that name)
   **/
  private final Map <String, ReferenceList> m_aCollectedReferences = new HashMap <String, ReferenceList> ();

  /**
   * set of imported types (including package java types, eventhough we won't
   * generate imports for them)
   */
  private final Set <AbstractJSClass> m_aImportedClasses = new HashSet <AbstractJSClass> ();

  private static enum Mode
  {
    /**
     * Collect all the type names and identifiers. In this mode we don't
     * actually generate anything.
     */
    COLLECTING,
    /**
     * Print the actual source code.
     */
    PRINTING
  }

  /**
   * The current running mode. Set to PRINTING so that a casual client can use a
   * formatter just like before.
   */
  private Mode mode = Mode.PRINTING;

  /**
   * Current number of indentation strings to print
   */
  private int indentLevel;

  /**
   * String to be used for each indentation. Defaults to four spaces.
   */
  private final String m_sIndentSpace;

  /**
   * Stream associated with this JFormatter
   */
  private final PrintWriter m_aPW;

  /**
   * Creates a JFormatter.
   * 
   * @param s
   *        PrintWriter to JFormatter to use.
   * @param space
   *        Incremental indentation string, similar to tab value.
   */
  public JSFormatter (final PrintWriter s, final String space)
  {
    m_aPW = s;
    m_sIndentSpace = space;
  }

  /**
   * Creates a formatter with default incremental indentations of four spaces.
   */
  public JSFormatter (final PrintWriter s)
  {
    this (s, "    ");
  }

  /**
   * Creates a formatter with default incremental indentations of four spaces.
   */
  public JSFormatter (final Writer w)
  {
    this (new PrintWriter (w));
  }

  /**
   * Closes this formatter.
   */
  public void close ()
  {
    m_aPW.close ();
  }

  /**
   * Returns true if we are in the printing mode, where we actually produce
   * text. The other mode is the "collecting mode'
   */
  public boolean isPrinting ()
  {
    return mode == Mode.PRINTING;
  }

  /**
   * Decrement the indentation level.
   */
  public JSFormatter o ()
  {
    indentLevel--;
    return this;
  }

  /**
   * Increment the indentation level.
   */
  public JSFormatter i ()
  {
    indentLevel++;
    return this;
  }

  private boolean _needSpace (final char c1, final char c2)
  {
    if ((c1 == ']') && (c2 == '{'))
      return true;
    if (c1 == ';')
      return true;
    if ((c1 == ')') && (c2 == '{'))
      return true;
    if ((c1 == ',') || (c1 == '='))
      return true;
    if (c2 == '=')
      return true;
    if (Character.isDigit (c1))
    {
      if ((c2 == '(') || (c2 == ')') || (c2 == ';') || (c2 == ','))
        return false;
      return true;
    }
    if (Character.isJavaIdentifierPart (c1))
    {
      switch (c2)
      {
        case '{':
        case '}':
        case '+':
        case '>':
        case '@':
          return true;
        default:
          return Character.isJavaIdentifierStart (c2);
      }
    }
    if (Character.isJavaIdentifierStart (c2))
    {
      switch (c1)
      {
        case ']':
        case ')':
        case '}':
        case '+':
          return true;
        default:
          return false;
      }
    }
    if (Character.isDigit (c2))
    {
      if (c1 == '(')
        return false;
      return true;
    }
    return false;
  }

  private char lastChar = 0;
  private boolean atBeginningOfLine = true;

  private void _spaceIfNeeded (final char c)
  {
    if (atBeginningOfLine)
    {
      for (int i = 0; i < indentLevel; i++)
        m_aPW.print (m_sIndentSpace);
      atBeginningOfLine = false;
    }
    else
      if ((lastChar != 0) && _needSpace (lastChar, c))
        m_aPW.print (' ');
  }

  /**
   * Print a char into the stream
   * 
   * @param c
   *        the char
   */
  public JSFormatter p (final char c)
  {
    if (mode == Mode.PRINTING)
    {
      _spaceIfNeeded (c);
      m_aPW.print (c);
      lastChar = c;
    }
    return this;
  }

  /**
   * Print a String into the stream
   * 
   * @param s
   *        the String
   */
  public JSFormatter p (final String s)
  {
    if (mode == Mode.PRINTING)
    {
      _spaceIfNeeded (s.charAt (0));
      m_aPW.print (s);
      lastChar = s.charAt (s.length () - 1);
    }
    return this;
  }

  public JSFormatter t (final AbstractJSType type)
  {
    if (type.isReference ())
    {
      return t ((AbstractJSClass) type);
    }
    return g (type);
  }

  /**
   * Print a type name.
   * <p>
   * In the collecting mode we use this information to decide what types to
   * import and what not to.
   */
  public JSFormatter t (final AbstractJSClass type)
  {
    switch (mode)
    {
      case PRINTING:
        // many of the JTypes in this list are either primitive or belong to
        // package java
        // so we don't need a FQCN
        if (m_aImportedClasses.contains (type))
        {
          p (type.name ()); // FQCN imported or not necessary, so generate short
                            // name
        }
        else
        {
          if (type.outer () != null)
            t (type.outer ()).p ('.').p (type.name ());
          else
            p (type.fullName ()); // collision was detected, so generate FQCN
        }
        break;
      case COLLECTING:
        final String shortName = type.name ();
        if (m_aCollectedReferences.containsKey (shortName))
        {
          m_aCollectedReferences.get (shortName).add (type);
        }
        else
        {
          final ReferenceList tl = new ReferenceList ();
          tl.add (type);
          m_aCollectedReferences.put (shortName, tl);
        }
        break;
    }
    return this;
  }

  /**
   * Print an identifier
   */
  public JSFormatter id (final String id)
  {
    switch (mode)
    {
      case PRINTING:
        p (id);
        break;
      case COLLECTING:
        // see if there is a type name that collides with this id
        if (m_aCollectedReferences.containsKey (id))
        {
          if (!m_aCollectedReferences.get (id).getClasses ().isEmpty ())
          {
            for (final AbstractJSClass type : m_aCollectedReferences.get (id).getClasses ())
            {
              if (type.outer () != null)
              {
                m_aCollectedReferences.get (id).setId (false);
                return this;
              }
            }
          }
          m_aCollectedReferences.get (id).setId (true);
        }
        else
        {
          // not a type, but we need to create a place holder to
          // see if there might be a collision with a type
          final ReferenceList tl = new ReferenceList ();
          tl.setId (true);
          m_aCollectedReferences.put (id, tl);
        }
        break;
    }
    return this;
  }

  /**
   * Print a new line into the stream
   */
  public JSFormatter nl ()
  {
    if (mode == Mode.PRINTING)
    {
      m_aPW.println ();
      lastChar = 0;
      atBeginningOfLine = true;
    }
    return this;
  }

  /**
   * Cause the JGenerable object to generate source for iteself
   * 
   * @param g
   *        the JGenerable object
   */
  public JSFormatter g (final IJSGenerable g)
  {
    g.generate (this);
    return this;
  }

  /**
   * Produces {@link IJSGenerable}s separated by ','
   */
  public JSFormatter g (final Collection <? extends IJSGenerable> list)
  {
    boolean first = true;
    if (!list.isEmpty ())
    {
      for (final IJSGenerable item : list)
      {
        if (!first)
          p (',');
        g (item);
        first = false;
      }
    }
    return this;
  }

  /**
   * Cause the JDeclaration to generate source for itself
   * 
   * @param d
   *        the JDeclaration object
   */
  public JSFormatter d (final IJSDeclaration d)
  {
    d.declare (this);
    return this;
  }

  /**
   * Cause the JStatement to generate source for itself
   * 
   * @param s
   *        the JStatement object
   */
  public JSFormatter s (final IJSStatement s)
  {
    s.state (this);
    return this;
  }

  /**
   * Cause the JVar to generate source for itself
   * 
   * @param v
   *        the JVar object
   */
  public JSFormatter b (final JSVar v)
  {
    v.bind (this);
    return this;
  }

  /**
   * Generates the whole source code out of the specified class.
   */
  public void write (final JSDefinedClass c)
  {
    // first collect all the types and identifiers
    mode = Mode.COLLECTING;
    d (c);

    javaLang = c.owner ()._package ("java.lang");

    // collate type names and identifiers to determine which types can be
    // imported
    for (final ReferenceList tl : m_aCollectedReferences.values ())
    {
      if (!tl.collisions (c) && !tl.isId ())
      {
        assert tl.getClasses ().size () == 1;

        // add to list of collected types
        m_aImportedClasses.add (tl.getClasses ().get (0));
      }
    }

    // the class itself that we will be generating is always accessible
    m_aImportedClasses.add (c);

    // then print the declaration
    mode = Mode.PRINTING;

    assert c.parentContainer ().isPackage () : "this method is only for a pacakge-level class";
    final JSPackage pkg = (JSPackage) c.parentContainer ();
    if (!pkg.isUnnamed ())
    {
      nl ().d (pkg);
      nl ();
    }

    // generate import statements
    final List <AbstractJSClass> imports = ContainerHelper.getSorted (m_aImportedClasses);
    for (final AbstractJSClass clazz : imports)
    {
      // suppress import statements for primitive types, built-in types,
      // types in the root package, and types in
      // the same package as the current type
      if (!supressImport (clazz, c))
      {
        p ("import").p (clazz.fullName ()).p (';').nl ();
      }
    }
    nl ();

    d (c);
  }

  /**
   * determine if an import statement should be supressed
   * 
   * @param clazz
   *        JType that may or may not have an import
   * @param c
   *        JType that is the current class being processed
   * @return true if an import statement should be suppressed, false otherwise
   */
  private boolean supressImport (final AbstractJSClass clazz, final AbstractJSClass c)
  {
    if (clazz._package ().isUnnamed ())
      return true;

    final String packageName = clazz._package ().name ();
    if (packageName.equals ("java.lang"))
      return true; // no need to explicitly import java.lang classes

    if (clazz._package () == c._package ())
    {
      // inner classes require an import stmt.
      // All other pkg local classes do not need an
      // import stmt for ref.
      if (clazz.outer () == null)
      {
        return true; // no need to explicitly import a class into itself
      }
    }
    return false;
  }

  private JSPackage javaLang;

  /**
   * Used during the optimization of class imports. List of
   * {@link AbstractJSClass}es whose short name is the same.
   * 
   * @author Ryan.Shoemaker@Sun.COM
   */
  final class ReferenceList
  {
    private final ArrayList <AbstractJSClass> classes = new ArrayList <AbstractJSClass> ();

    /** true if this name is used as an identifier (like a variable name.) **/
    private boolean id;

    /**
     * Returns true if the symbol represented by the short name is "importable".
     */
    public boolean collisions (final JSDefinedClass enclosingClass)
    {
      // special case where a generated type collides with a type in package
      // java

      // more than one type with the same name
      if (classes.size () > 1)
        return true;

      // an id and (at least one) type with the same name
      if (id && classes.size () != 0)
        return true;

      for (final AbstractJSClass c : classes)
      {
        if (c._package () == javaLang)
        {
          // make sure that there's no other class with this name within the
          // same package
          final Iterator <JSDefinedClass> itr = enclosingClass._package ().classes ();
          while (itr.hasNext ())
          {
            // even if this is the only "String" class we use,
            // if the class called "String" is in the same package,
            // we still need to import it.
            final JSDefinedClass n = itr.next ();
            if (n.name ().equals (c.name ()))
              return true; // collision
          }
        }
        if (c.outer () != null)
          return true; // avoid importing inner class to work around 6431987.
                       // Also see jaxb issue 166
      }

      return false;
    }

    public void add (final AbstractJSClass clazz)
    {
      if (!classes.contains (clazz))
        classes.add (clazz);
    }

    public List <AbstractJSClass> getClasses ()
    {
      return classes;
    }

    public void setId (final boolean value)
    {
      id = value;
    }

    /**
     * Return true iff this is strictly an id, meaning that there are no
     * collisions with type names.
     */
    public boolean isId ()
    {
      return id && classes.size () == 0;
    }
  }
}
