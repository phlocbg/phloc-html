package com.phloc.html.supplementary.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.annotations.ReturnsMutableCopy;
import com.phloc.commons.collections.ContainerHelper;
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
      m_sIdentifier = RegExHelper.getAsIdentifier (sName);
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
    if (sType.equals ("String"))
      return new String [] { "String" };
    if (sType.equals ("Integer"))
      return new String [] { "int", "long", "BigInteger" };
    if (sType.equals ("Number"))
      return new String [] { "int", "long", "BigInteger", "double", "BigDecimal" };
    if (sType.equals ("Selector"))
      return new String [] { "IJQuerySelector" };
    throw new IllegalArgumentException ("Unknown type '" + sType + "'");
  }

  public static void main (final String [] args)
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

    for (final File aFile : FileSystemIterator.create (new File ("src/test/resources/jqueryapi"),
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
    for (final Entry aEntry : aAllEntries)
      if (aEntry.getAPIType () == EAPIType.SELECTOR && aEntry.getSignatureCount () == 1)
      {
        final Signature aSignature = aEntry.getSignatureAtIndex (0);
        if (aSignature.getArgumentCount () == 0)
        {
          if (aSignature.isAddedAfter10 ())
            aLines.add ("// @since " + aSignature.getAdded ().getAsString (false));
          aLines.add ("public static final IJQuerySelector " +
                      aEntry.getIdentifier () +
                      " = new JQuerySelector (\":" +
                      aEntry.getName () +
                      "\");");
        }
      }

    for (final Entry aEntry : aAllEntries)
      if (aEntry.getAPIType () == EAPIType.SELECTOR &&
          (aEntry.getSignatureCount () > 1 || aEntry.getSignatureAtIndex (0).getArgumentCount () > 0))
      {
        final String sPrefix = "public static IJQuerySelector " + aEntry.getIdentifier ();
        for (final Signature aSignature : aEntry.getAllSignatures ())
        {
          String sRealPrefix = sPrefix;
          if (aSignature.isAddedAfter10 ())
            sRealPrefix = "// @since " + aSignature.getAdded ().getAsString (false) + "\n" + sRealPrefix;
          if (aSignature.getArgumentCount () == 0)
          {
            aLines.add (sRealPrefix + "();");
          }
          else
            if (aSignature.getArgumentCount () == 1)
            {
              final Argument aArg = aSignature.getArgumentAtIndex (0);
              for (final String sType : aArg.getAllTypes ())
              {
                _getJavaTypes (sType);
                aLines.add (sRealPrefix + "(" + sType + " " + aArg.getIdentifier () + ");");
              }
            }
            else
            {
              for (final Argument aArg : aSignature.getAllArguments ())
                if (aArg.getTypeCount () > 1)
                  throw new IllegalStateException ("Not supporting selectors with multiple types and multiple arguments");

              String sLine = sRealPrefix + "(";
              boolean bFirst = true;
              for (final Argument aArg : aSignature.getAllArguments ())
              {
                if (bFirst)
                  bFirst = false;
                else
                  sLine += ", ";
                final String sType = aArg.getTypeAtIndex (0);
                _getJavaTypes (sType);
                sLine += sType + " " + aArg.getIdentifier ();
              }
              aLines.add (sLine + ");");
            }
        }
      }

    for (final String sLine : aLines)
      System.out.println (sLine);
  }
}
