/**
 * Copyright (C) 2006-2013 phloc systems
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
package com.phloc.html.supplementary.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.GlobalDebug;
import com.phloc.commons.SystemProperties;
import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.collections.multimap.IMultiMapListBased;
import com.phloc.commons.collections.multimap.MultiTreeMapArrayListBased;
import com.phloc.commons.io.file.filter.FilenameFilterEndsWith;
import com.phloc.commons.io.file.iterate.FileSystemIterator;
import com.phloc.commons.lang.EnumHelper;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.serialize.MicroReader;
import com.phloc.commons.name.IHasName;
import com.phloc.commons.regex.RegExHelper;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.version.Version;
import com.phloc.commons.xml.EXMLParserFeature;
import com.phloc.commons.xml.serialize.XMLReader;

public class MainCreateJQueryAPIList
{
  private static final String TYPE_ANY = "Anything";

  private static enum EAPIType implements IHasName
  {
    METHOD ("method"),
    PROPERTY ("property"),
    SELECTOR ("selector");

    private final String m_sName;

    private EAPIType (@Nonnull @Nonempty final String sName)
    {
      m_sName = sName;
    }

    @Nonnull
    @Nonempty
    public String getName ()
    {
      return m_sName;
    }

    @Nonnull
    public static EAPIType getFromNameOrThrow (@Nullable final String sName)
    {
      return EnumHelper.getFromNameOrThrow (EAPIType.class, sName);
    }
  }

  private static final class Argument
  {
    private final String m_sName;
    private final String m_sIdentifier;
    private final List <String> m_aTypes;

    public Argument (final String sName, final List <String> aTypes)
    {
      if (StringHelper.hasNoText (sName))
        throw new IllegalArgumentException ("name");
      if (ContainerHelper.isEmpty (aTypes))
        throw new IllegalArgumentException ("types");
      m_sName = sName;
      m_sIdentifier = RegExHelper.getAsIdentifier (sName);
      m_aTypes = aTypes;
    }

    @Nonnull
    @Nonempty
    public String getName ()
    {
      return m_sName;
    }

    @Nonnull
    @Nonempty
    public String getIdentifier ()
    {
      return m_sIdentifier;
    }

    @Nonnegative
    public int getTypeCount ()
    {
      return m_aTypes.size ();
    }

    @Nonnull
    public String getTypeAtIndex (@Nonnegative final int nIndex)
    {
      return m_aTypes.get (nIndex);
    }

    @Nonnull
    @Nonempty
    @ReturnsMutableCopy
    public List <String> getAllTypes ()
    {
      return ContainerHelper.newList (m_aTypes);
    }
  }

  private static final class Signature
  {
    private final Version m_aAdded;
    private final List <Argument> m_aArgs = new ArrayList <Argument> ();

    public Signature (@Nonnull final Version aAdded)
    {
      if (aAdded == null)
        throw new NullPointerException ("added");
      m_aAdded = aAdded;
    }

    void addArgument (@Nonnull final Argument aArg)
    {
      if (aArg == null)
        throw new NullPointerException ("arg");
      m_aArgs.add (aArg);
    }

    @Nonnull
    public Version getAdded ()
    {
      return m_aAdded;
    }

    public boolean isAddedAfter10 ()
    {
      return m_aAdded.isGreaterThan (new Version (1));
    }

    @Nonnegative
    public int getArgumentCount ()
    {
      return m_aArgs.size ();
    }

    @Nonnull
    public Argument getArgumentAtIndex (@Nonnegative final int nIndex)
    {
      return m_aArgs.get (nIndex);
    }

    @Nonnull
    @ReturnsMutableCopy
    public List <Argument> getAllArguments ()
    {
      return ContainerHelper.newList (m_aArgs);
    }
  }

  private static final class Entry
  {
    private static final Set <String> PARENT_CLASS_NAMES = ContainerHelper.newSet ("clone", "eq", "not");

    private final EAPIType m_eAPIType;
    private final String m_sName;
    private final String m_sIdentifier;
    private final String m_sReturn;
    private final Version m_aDeprecated;
    private final Version m_aRemoved;
    private final List <Signature> m_aSignatures = new ArrayList <Signature> ();

    public Entry (@Nonnull final EAPIType eAPIType,
                  @Nonnull @Nonempty final String sName,
                  @Nullable final String sReturn,
                  @Nullable final Version aDeprecated,
                  @Nullable final Version aRemoved)
    {
      m_eAPIType = eAPIType;
      m_sName = sName;
      m_sIdentifier = PARENT_CLASS_NAMES.contains (sName) ? "_" + sName : RegExHelper.getAsIdentifier (sName);
      m_sReturn = sReturn;
      m_aDeprecated = aDeprecated;
      m_aRemoved = aRemoved;
    }

    void addSignature (@Nonnull final Signature aSignature)
    {
      m_aSignatures.add (aSignature);
    }

    @Nonnull
    public EAPIType getAPIType ()
    {
      return m_eAPIType;
    }

    @Nonnull
    @Nonempty
    public String getName ()
    {
      return m_sName;
    }

    @Nonnull
    @Nonempty
    public String getIdentifier ()
    {
      return m_sIdentifier;
    }

    public boolean hasReturn ()
    {
      return StringHelper.hasText (m_sReturn);
    }

    @Nullable
    public String getReturn ()
    {
      return m_sReturn;
    }

    public boolean isDeprecated ()
    {
      return m_aDeprecated != null;
    }

    @Nullable
    public Version getDeprecated ()
    {
      return m_aDeprecated;
    }

    public boolean isRemoved ()
    {
      return m_aRemoved != null;
    }

    @Nullable
    public Version getRemoved ()
    {
      return m_aRemoved;
    }

    @Nonnegative
    public int getSignatureCount ()
    {
      return m_aSignatures.size ();
    }

    @Nonnull
    public Signature getSignatureAtIndex (@Nonnegative final int nIndex)
    {
      return m_aSignatures.get (nIndex);
    }

    @Nonnull
    @ReturnsMutableCopy
    public List <Signature> getAllSignatures ()
    {
      return ContainerHelper.newList (m_aSignatures);
    }
  }

  @Nonnull
  private static String [] _getJavaTypes (@Nonnull @Nonempty final String sType)
  {
    if (sType.equals ("Boolean"))
      return new String [] { "boolean" };
    if (sType.equals ("String"))
      return new String [] { "String" };
    if (sType.equals ("htmlString"))
      return new String [] { "IHCNode", "String" };
    if (sType.equals ("Integer"))
      return new String [] { "int", "long", "BigInteger" };
    if (sType.equals ("Number"))
      return new String [] { "int", "long", "BigInteger", "double", "BigDecimal" };
    if (sType.equals ("Selector"))
      return new String [] { "IJQuerySelector" };
    if (sType.equals ("Function"))
      return new String [] { "JSAnonymousFunction" };
    if (sType.equals ("Object"))
      return new String [] { "IJSExpression" };
    if (sType.equals ("PlainObject"))
      return new String [] { "IJSExpression" };
    if (sType.equals ("Anything"))
      return new String [] { "IJSExpression" };
    if (sType.equals ("Array"))
      return new String [] { "JSArray" };
    if (sType.equals ("Element"))
      return new String [] { "EHTMLElementName", "String" };
    if (sType.equals ("Elements"))
      return new String [] { "EHTMLElementName...", "Iterable<EHTMLElementName>", "String...", "Iterable<String>" };
    if (sType.equals ("jQuery"))
      return new String [] { "JQueryInvocation" };

    // DOM document
    if (sType.equals ("document"))
      return new String [] { "IJSExpression" };

    // JQuery Deferred
    if (sType.equals ("Deferred"))
      return new String [] { "IJSExpression" };

    // JQuery Event
    if (sType.equals ("Event"))
      return new String [] { "IJSExpression" };

    // ????
    if (sType.equals ("jQuery object"))
      return new String [] { "JQueryInvocation" };
    throw new IllegalArgumentException ("Unknown type '" + sType + "'");
  }

  public static void main (final String [] args) throws Exception
  {
    int nFiles = 0;
    int nSignatures = 0;
    int nArguments = 0;

    // [Array, Boolean, Callbacks, Deferred, Element, Function, Integer, Number,
    // Object, PlainObject, Promise, String, XMLDocument, boolean, jQuery,
    // jqXHR, undefined]
    final Set <String> aAllReturnTypes = new TreeSet <String> ();

    // [Anything, Array, Boolean, Deferred, Element, Elements, Event,
    // Function, Integer, Number, Number/String, Object, PlainObject, Selector,
    // String, document, htmlString, jQuery, jQuery object]
    final Set <String> aAllArgTypes = new TreeSet <String> ();

    final List <Entry> aAllEntries = new ArrayList <Entry> ();

    GlobalDebug.setDebugModeDirect (true);

    if (false)
      XMLReader.setDefaultSaxParserFeatureValue (EXMLParserFeature.XINCLUDE, Boolean.TRUE);
    SystemProperties.setPropertyValue ("org.apache.xerces.xni.parser.XMLParserConfiguration",
                                       "org.apache.xerces.parsers.XIncludeParserConfiguration");

    for (final File aFile : FileSystemIterator.create (new File ("src/test/resources/jquery/api"),
                                                       new FilenameFilterEndsWith (".xml")))
    {
      final IMicroDocument aDoc = MicroReader.readMicroXML (aFile);
      final IMicroElement eRoot = aDoc.getDocumentElement ();
      List <IMicroElement> aEntries;
      if (eRoot.getTagName ().equals ("entries"))
        aEntries = eRoot.getAllChildElements ("entry");
      else
        aEntries = ContainerHelper.newList (eRoot);

      for (final IMicroElement eEntry : aEntries)
      {
        final String sAPIType = eEntry.getAttribute ("type");
        final EAPIType eAPIType = EAPIType.getFromNameOrThrow (sAPIType);
        final String sName = eEntry.getAttribute ("name");
        final String sReturn = eEntry.getAttribute ("return");
        final String sDeprecated = eEntry.getAttribute ("deprecated");
        final Version aDeprecated = sDeprecated == null ? null : new Version (sDeprecated);
        final String sRemoved = eEntry.getAttribute ("removed");
        final Version aRemoved = sRemoved == null ? null : new Version (sRemoved);

        final Entry aEntry = new Entry (eAPIType, sName, sReturn, aDeprecated, aRemoved);

        // Return is only relevant for type "method"
        if (StringHelper.hasText (sReturn))
          aAllReturnTypes.add (sReturn);

        for (final IMicroElement eSignature : eEntry.getAllChildElements ("signature"))
        {
          final String sAdded = eSignature.getFirstChildElement ("added").getTextContent ();
          final Version aAdded = new Version (sAdded);
          final Signature aSignature = new Signature (aAdded);

          for (final IMicroElement eArg : eSignature.getAllChildElements ("argument"))
          {
            final String sArgName = eArg.getAttribute ("name");
            final String sArgType = eArg.getAttribute ("type");
            final List <String> aTypes = new ArrayList <String> ();
            if (StringHelper.hasNoTextAfterTrim (sArgType))
            {
              for (final IMicroElement eArgType : eArg.getAllChildElements ("type"))
                for (final String sRealArgType : StringHelper.getExploded ('/', eArgType.getAttribute ("name")))
                  aTypes.add (sRealArgType);
            }
            else
              for (final String sRealArgType : StringHelper.getExploded ('/', sArgType.trim ()))
                aTypes.add (sRealArgType);

            // Happens in callbacks.fireWith
            if (aTypes.isEmpty ())
              aTypes.add (TYPE_ANY);

            aAllArgTypes.addAll (aTypes);
            aSignature.addArgument (new Argument (sArgName, aTypes));

            ++nArguments;
          }

          aEntry.addSignature (aSignature);
          ++nSignatures;
        }
        aAllEntries.add (aEntry);
      }
      ++nFiles;
    }

    Collections.sort (aAllEntries, new Comparator <Entry> ()
    {
      public int compare (final Entry o1, final Entry o2)
      {
        return o1.getName ().compareTo (o2.getName ());
      }
    });

    System.out.println ("Scanned " +
                        nFiles +
                        " files, " +
                        aAllEntries.size () +
                        " entries, " +
                        nSignatures +
                        " signatures and " +
                        nArguments +
                        " arguments");
    System.out.println ("Returns: " + aAllReturnTypes);
    System.out.println ("Arg Types: " + aAllArgTypes);

    final List <String> aLines = new ArrayList <String> ();

    // All selectors
    if (false)
      for (final Entry aEntry : aAllEntries)
        if (aEntry.getAPIType () == EAPIType.SELECTOR && aEntry.getSignatureCount () == 1)
        {
          final Signature aSignature = aEntry.getSignatureAtIndex (0);
          if (aSignature.getArgumentCount () == 0)
          {
            if (aSignature.isAddedAfter10 ())
              aLines.add ("// @since jQuery " + aSignature.getAdded ().getAsString (false));
            if (aEntry.isDeprecated ())
            {
              aLines.add ("// @deprecated");
              aLines.add ("// Deprecated since jQuery " + aEntry.getDeprecated ().getAsString (false));
            }
            aLines.add ("public static final IJQuerySelector " +
                        aEntry.getIdentifier () +
                        " = new JQuerySelector (\":" +
                        aEntry.getName () +
                        "\");");
          }
        }

    // Selectors with arguments
    if (false)
      for (final Entry aEntry : aAllEntries)
        if (aEntry.getAPIType () == EAPIType.SELECTOR &&
            (aEntry.getSignatureCount () > 1 || aEntry.getSignatureAtIndex (0).getArgumentCount () > 0))
        {
          final String sPrefix = "public static IJQuerySelector " + aEntry.getIdentifier ();
          for (final Signature aSignature : aEntry.getAllSignatures ())
          {
            String sRealPrefix = sPrefix;
            if (aEntry.isRemoved ())
              sRealPrefix = "// Removed in jQuery " + aEntry.getRemoved ().getAsString (false) + "\n" + sRealPrefix;
            if (aEntry.isDeprecated ())
              sRealPrefix = "// @deprecated\n// Deprecated since jQuery " +
                            aEntry.getDeprecated ().getAsString (false) +
                            "\n" +
                            sRealPrefix;
            if (aSignature.isAddedAfter10 ())
              sRealPrefix = "// @since jQuery " + aSignature.getAdded ().getAsString (false) + "\n" + sRealPrefix;

            if (aSignature.getArgumentCount () == 0)
            {
              aLines.add (sRealPrefix + "();");
            }
            else
            {
              String sLine = sRealPrefix + "(";
              boolean bFirst = true;
              for (final Argument aArg : aSignature.getAllArguments ())
              {
                if (bFirst)
                  bFirst = false;
                else
                  sLine += ", ";
                final StringBuilder aTypes = new StringBuilder ();
                for (final String sType : aArg.getAllTypes ())
                {
                  if (aTypes.length () > 0)
                    aTypes.append (", ");
                  aTypes.append (StringHelper.getImploded ('/', _getJavaTypes (sType)));
                }

                sLine += aTypes.toString () + " " + aArg.getIdentifier ();
              }
              aLines.add (sLine + ");");
            }
          }
        }

    // All properties
    if (false)
      for (final Entry aEntry : aAllEntries)
        if (aEntry.getAPIType () == EAPIType.PROPERTY)
          for (final Signature aSignature : aEntry.getAllSignatures ())
          {
            String sLine = "JSFieldRef " + aEntry.getName () + "();";
            if (aEntry.isRemoved ())
              sLine = "// Removed in jQuery " + aEntry.getRemoved ().getAsString (false) + "\n" + sLine;
            if (aEntry.isDeprecated ())
              sLine = "// @deprecated Deprecated since jQuery " +
                      aEntry.getDeprecated ().getAsString (false) +
                      "\n" +
                      sLine;
            if (aSignature.isAddedAfter10 ())
              sLine = "// @since jQuery " + aSignature.getAdded ().getAsString (false) + "\n" + sLine;

            if (aSignature.getArgumentCount () > 0)
              throw new IllegalStateException (aEntry.getName ());
            aLines.add (sLine);
          }

    // The following prefixes are contained:
    // "callbacks."
    // "deferred."
    // "event."
    // "jQuery."

    // Methods without parameter handling
    {
      final IMultiMapListBased <String, Entry> aUsed = new MultiTreeMapArrayListBased <String, Entry> ();
      for (final Entry aEntry : aAllEntries)
        if (aEntry.getAPIType () == EAPIType.METHOD)
          aUsed.putSingle (aEntry.getName (), aEntry);

      // non static methods for AbstractJQueryInvocation
      if (false)
        for (final List <Entry> aEntries : aUsed.values ())
        {
          boolean bIsDeprecated = true;
          boolean bIsPartiallyDeprecated = false;
          final Set <String> aReturnTypes = new LinkedHashSet <String> ();
          final Set <String> aDeprecatedVersions = new LinkedHashSet <String> ();
          for (final Entry aEntry : aEntries)
          {
            aReturnTypes.add (aEntry.getReturn ());
            if (aEntry.isDeprecated ())
            {
              aDeprecatedVersions.add (aEntry.getDeprecated ().getAsString (false));
              bIsPartiallyDeprecated = true;
            }
            else
              bIsDeprecated = false;
          }

          final Entry aEntry = aEntries.get (0);

          // Static methods are handled in class jQuery
          final boolean bIsStatic = aEntry.getName ().startsWith ("jQuery.");
          if (!bIsStatic)
          {
            // Remove implicit prefixes for non-static names
            String sPrefix = "";
            String sRealName = aEntry.getName ();
            final int i = sRealName.indexOf ('.');
            if (i > 0)
            {
              sPrefix = sRealName.substring (0, i) + " ";
              sRealName = sRealName.substring (i + 1);
            }

            String sSince = null;
            if (aEntries.size () == 1 &&
                aEntry.getSignatureCount () == 1 &&
                aEntry.getSignatureAtIndex (0).isAddedAfter10 ())
              sSince = aEntry.getSignatureAtIndex (0).getAdded ().getAsString (false);

            aLines.add ("/**");
            if (!bIsDeprecated && bIsPartiallyDeprecated)
              aLines.add ("* Certain versions of this method are deprecated since jQuery " +
                          StringHelper.getImploded (" or ", aDeprecatedVersions));
            aLines.add (" * @return The invocation of the jQuery " +
                        sPrefix +
                        "function <code>" +
                        sRealName +
                        "()</code> with return type " +
                        StringHelper.getImploded (" or ", aReturnTypes));
            if (bIsDeprecated)
              aLines.add ("* @deprecated Deprecated since jQuery " +
                          StringHelper.getImploded (" or ", aDeprecatedVersions));
            if (sSince != null)
              aLines.add (" * @since jQuery " + sSince);
            aLines.add (" */");
            aLines.add ("@Nonnull");
            if (bIsDeprecated)
              aLines.add ("@Deprecated");
            aLines.add ("public final IMPLTYPE " + aEntry.getIdentifier () + " ()");
            aLines.add ("{ return jqinvoke (\"" + sRealName + "\"); }");
          }
        }

      // static methods- for JQuery.java
      for (final List <Entry> aEntries : aUsed.values ())
      {
        boolean bIsDeprecated = true;
        boolean bIsPartiallyDeprecated = false;
        final Set <String> aReturnTypes = new LinkedHashSet <String> ();
        final Set <String> aDeprecatedVersions = new LinkedHashSet <String> ();
        for (final Entry aEntry : aEntries)
        {
          aReturnTypes.add (aEntry.getReturn ());
          if (aEntry.isDeprecated ())
          {
            aDeprecatedVersions.add (aEntry.getDeprecated ().getAsString (false));
            bIsPartiallyDeprecated = true;
          }
          else
            bIsDeprecated = false;
        }

        final Entry aEntry = aEntries.get (0);

        // Static methods are handled in class jQuery
        final boolean bIsStatic = aEntry.getName ().startsWith ("jQuery.");
        if (bIsStatic)
        {
          String sSince = null;
          if (aEntries.size () == 1 &&
              aEntry.getSignatureCount () == 1 &&
              aEntry.getSignatureAtIndex (0).isAddedAfter10 ())
            sSince = aEntry.getSignatureAtIndex (0).getAdded ().getAsString (false);

          aLines.add ("/**");
          if (!bIsDeprecated && bIsPartiallyDeprecated)
            aLines.add ("* Certain versions of this method are deprecated since jQuery " +
                        StringHelper.getImploded (" or ", aDeprecatedVersions));
          aLines.add (" * @return The invocation of the static jQuery function <code>" +
                      aEntry.getName () +
                      "()</code> with return type " +
                      StringHelper.getImploded (" or ", aReturnTypes));
          if (bIsDeprecated)
            aLines.add ("* @deprecated Deprecated since jQuery " +
                        StringHelper.getImploded (" or ", aDeprecatedVersions));
          if (sSince != null)
            aLines.add (" * @since jQuery " + sSince);
          aLines.add (" */");
          aLines.add ("@Nonnull");
          if (bIsDeprecated)
            aLines.add ("@Deprecated");
          aLines.add ("public static JQueryInvocation " +
                      StringHelper.trimStart (aEntry.getIdentifier (), "jQuery_") +
                      " ()");
          aLines.add ("{ return new JQueryInvocation (JQueryProperty.jQueryField (), \"" +
                      aEntry.getName ().substring ("jQuery.".length ()) +
                      "\"); }");
        }
      }
    }

    if (false)
      for (final Entry aEntry : aAllEntries)
        if (aEntry.getAPIType () == EAPIType.METHOD)
        {
          for (final Signature aSignature : aEntry.getAllSignatures ())
          {
            String sRealPrefix = (aEntry.hasReturn () ? aEntry.getReturn () : "void") + " " + aEntry.getIdentifier ();
            if (aEntry.isRemoved ())
              sRealPrefix = "// Removed in jQuery " + aEntry.getRemoved ().getAsString (false) + "\n" + sRealPrefix;
            if (aEntry.isDeprecated ())
              sRealPrefix = "// @deprecated\n// Deprecated since jQuery " +
                            aEntry.getDeprecated ().getAsString (false) +
                            "\n" +
                            sRealPrefix;
            if (aSignature.isAddedAfter10 ())
              sRealPrefix = "// @since jQuery " + aSignature.getAdded ().getAsString (false) + "\n" + sRealPrefix;

            if (aSignature.getArgumentCount () == 0)
            {
              aLines.add (sRealPrefix + "();");
            }
            else
            {
              String sLine = sRealPrefix + "(";
              boolean bFirst = true;
              for (final Argument aArg : aSignature.getAllArguments ())
              {
                if (bFirst)
                  bFirst = false;
                else
                  sLine += ", ";
                final StringBuilder aTypes = new StringBuilder ();
                for (final String sType : aArg.getAllTypes ())
                {
                  if (aTypes.length () > 0)
                    aTypes.append ("/");
                  aTypes.append (StringHelper.getImploded ('/', _getJavaTypes (sType)));
                }

                sLine += "{" + aTypes.toString () + "} " + aArg.getIdentifier ();
              }
              aLines.add (sLine + ");");
            }
          }
        }

    for (final String sLine : aLines)
      System.out.println (sLine);
  }
}
