package com.phloc.html.supplementary.main;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.phloc.commons.collections.ContainerHelper;
import com.phloc.commons.io.file.filter.FilenameFilterEndsWith;
import com.phloc.commons.io.file.iterate.FileSystemIterator;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.serialize.MicroReader;
import com.phloc.commons.string.StringHelper;

public class MainCreateJQueryAPIList
{
  public static void main (final String [] args)
  {
    int nFiles = 0;
    int nSignatures = 0;
    int nArguments = 0;

    // [method, property, selector]
    final Set <String> aTypes = new TreeSet <String> ();

    // [Array, Boolean, Callbacks, Deferred, Element, Function, Integer, Number,
    // Object, PlainObject, Promise, String, XMLDocument, boolean, jQuery,
    // jqXHR, undefined]
    final Set <String> aReturns = new TreeSet <String> ();

    // [Anything, Array, Boolean, Deferred, Element, Elements, Event, Function,
    // Integer, Number, Number/String, Object, PlainObject, Selector, String,
    // document, htmlString, jQuery, jQuery object]
    final Set <String> aArgTypes = new TreeSet <String> ();

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
        final String sName = eEntry.getAttribute ("name");
        final String sReturn = eEntry.getAttribute ("return");
        final String sDeprecated = eEntry.getAttribute ("deprecated");
        final String sRemoved = eEntry.getAttribute ("removed");

        aTypes.add (sType);

        // Return is only relevant for type "method"
        if (StringHelper.hasText (sReturn))
          aReturns.add (sReturn);

        for (final IMicroElement eSignature : eEntry.getAllChildElements ("signature"))
        {
          eSignature.getFirstChildElement ("added").getTextContent ();
          for (final IMicroElement eArg : eSignature.getAllChildElements ("argument"))
          {
            final String sArgName = eArg.getAttribute ("name");
            final String sArgType = eArg.getAttribute ("type");
            if (sArgType == null)
            {
              for (final IMicroElement eType : eArg.getAllChildElements ("type"))
                aArgTypes.add (eType.getAttribute ("name"));
            }
            else
              aArgTypes.add (sArgType.trim ());
            ++nArguments;
          }
          ++nSignatures;
        }
      }
      ++nFiles;
    }
    System.out.println ("Scanned " + nFiles + " files, " + nSignatures + " signatures and " + nArguments + " arguments");
    System.out.println ("Types: " + aTypes);
    System.out.println ("Returns: " + aReturns);
    System.out.println ("Arg Types: " + aArgTypes);
  }
}
