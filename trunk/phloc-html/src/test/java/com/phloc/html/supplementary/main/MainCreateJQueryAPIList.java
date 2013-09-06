package com.phloc.html.supplementary.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
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

  private static enum EType implements IHasName
  {
    METHOD ("method"),
    PROPERTY ("property"),
    SELECTOR ("selector");

    private final String m_sName;

    private EType (@Nonnull @Nonempty final String sName)
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
    public static EType getFromNameOrThrow (@Nullable final String sName)
    {
      return EnumHelper.getFromNameOrThrow (EType.class, sName);
    }
  }

  private static final class Argument
  {
    private final String m_sName;
    private final List <String> m_aTypes;

    public Argument (final String sName, final List <String> aTypes)
    {
      if (StringHelper.hasNoText (sName))
        throw new IllegalArgumentException ("name");
      if (ContainerHelper.isEmpty (aTypes))
        throw new IllegalArgumentException ("types");
      m_sName = sName;
      m_aTypes = aTypes;
    }
  }

  private static final class Signature
  {
    private final Version m_aAdded;
    private final List <Argument> m_aArgs = new ArrayList <Argument> ();

    public Signature (@Nonnull final Version aAdded)
    {
      m_aAdded = aAdded;
    }

    void addArgument (@Nonnull final Argument aArg)
    {
      m_aArgs.add (aArg);
    }
  }

  private static final class Entry
  {
    private final EType m_eType;
    private final String m_sName;
    private final String m_sReturn;
    private final Version m_aDeprecated;
    private final Version m_aRemoved;
    private final List <Signature> m_aSignatures = new ArrayList <Signature> ();

    public Entry (@Nonnull final EType eType,
                  @Nonnull @Nonempty final String sName,
                  @Nullable final String sReturn,
                  @Nullable final Version aDeprecated,
                  @Nullable final Version aRemoved)
    {
      m_eType = eType;
      m_sName = sName;
      m_sReturn = sReturn;
      m_aDeprecated = aDeprecated;
      m_aRemoved = aRemoved;
    }

    void addSignature (@Nonnull final Signature aSignature)
    {
      m_aSignatures.add (aSignature);
    }
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
        final String sType = eEntry.getAttribute ("type");
        final EType eType = EType.getFromNameOrThrow (sType);
        final String sName = eEntry.getAttribute ("name");
        final String sReturn = eEntry.getAttribute ("return");
        final String sDeprecated = eEntry.getAttribute ("deprecated");
        final Version aDeprecated = sDeprecated == null ? null : new Version (sDeprecated);
        final String sRemoved = eEntry.getAttribute ("removed");
        final Version aRemoved = sRemoved == null ? null : new Version (sRemoved);

        final Entry aEntry = new Entry (eType, sName, sReturn, aDeprecated, aRemoved);

        // Return is only relevant for type "method"
        if (StringHelper.hasText (sReturn))
          aAllReturnTypes.add (sReturn);

        if (false)
          if (sType.equals ("selector"))
            System.out.println ("public static final IJQuerySelector " +
                                RegExHelper.getAsIdentifier (sName) +
                                " = new JQuerySelector (\":" +
                                sName +
                                "\");");

        for (final IMicroElement eSignature : eEntry.getAllChildElements ("signature"))
        {
          final String sAdded = eSignature.getFirstChildElement ("added").getTextContent ();
          final Version aAdded = new Version (sRemoved);
          final Signature aSignature = new Signature (aAdded);

          for (final IMicroElement eArg : eSignature.getAllChildElements ("argument"))
          {
            final String sArgName = eArg.getAttribute ("name");
            final String sArgType = eArg.getAttribute ("type");
            final List <String> aTypes = new ArrayList <String> ();
            if (StringHelper.hasNoTextAfterTrim (sArgType))
            {
              for (final IMicroElement eArgType : eArg.getAllChildElements ("type"))
                aTypes.add (eArgType.getAttribute ("name"));
            }
            else
              aTypes.add (sArgType.trim ());

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
      }
      ++nFiles;
    }
    System.out.println ("Scanned " + nFiles + " files, " + nSignatures + " signatures and " + nArguments + " arguments");
    System.out.println ("Returns: " + aAllReturnTypes);
    System.out.println ("Arg Types: " + aAllArgTypes);
  }
}
