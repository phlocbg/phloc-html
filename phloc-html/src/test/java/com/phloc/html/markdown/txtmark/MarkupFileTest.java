/*
Copyright (c) 2005, Pete Bevin.
<http://markdownj.petebevin.com>

All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are
met:

 * Redistributions of source code must retain the above copyright notice,
  this list of conditions and the following disclaimer.

 * Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in the
  documentation and/or other materials provided with the distribution.

 * Neither the name "Markdown" nor the names of its contributors may
  be used to endorse or promote products derived from this software
  without specific prior written permission.

This software is provided by the copyright holders and contributors "as
is" and any express or implied warranties, including, but not limited
to, the implied warranties of merchantability and fitness for a
particular purpose are disclaimed. In no event shall the copyright owner
or contributors be liable for any direct, indirect, incidental, special,
exemplary, or consequential damages (including, but not limited to,
procurement of substitute goods or services; loss of use, data, or
profits; or business interruption) however caused and on any theory of
liability, whether in contract, strict liability, or tort (including
negligence or otherwise) arising in any way out of the use of this
software, even if advised of the possibility of such damage.

 */

package com.phloc.html.markdown.txtmark;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.phloc.commons.io.resource.ClassPathResource;
import com.phloc.commons.io.streams.StreamUtils;

@RunWith (value = Parameterized.class)
public class MarkupFileTest
{
  private final static String [] TEST_FILENAMES = new String [] { "/dingus.txt",
                                                                 "/paragraphs.txt",
                                                                 "/snippets.txt",
                                                                 "/lists.txt" };

  private final TestResultPair m_aPair;

  @Parameters
  public static Collection <Object []> testResultPairs () throws IOException
  {
    final List <TestResultPair> fullResultPairList = new ArrayList <TestResultPair> ();
    for (final String filename : TEST_FILENAMES)
    {
      fullResultPairList.addAll (newTestResultPairList ("MarkupFiles" + filename));
    }

    final Collection <Object []> testResultPairs = new ArrayList <Object []> ();
    for (final TestResultPair p : fullResultPairList)
    {
      testResultPairs.add (new Object [] { p });
    }
    return testResultPairs;
  }

  public MarkupFileTest (final TestResultPair pair)
  {
    this.m_aPair = pair;
  }

  @SuppressWarnings ("null")
  public static List <TestResultPair> newTestResultPairList (final String filename) throws IOException
  {
    final List <TestResultPair> list = new ArrayList <TestResultPair> ();
    final FileReader file = new FileReader (ClassPathResource.getAsFile (filename));
    final BufferedReader in = new BufferedReader (file);
    try
    {
      StringBuilder test = null;
      StringBuilder result = null;

      final Pattern pTest = Pattern.compile ("# Test (\\w+) \\((.*)\\)");
      final Pattern pResult = Pattern.compile ("# Result (\\w+)");
      String line;
      int lineNumber = 0;

      String testNumber = null;
      String testName = null;
      StringBuilder curbuf = null;
      while ((line = in.readLine ()) != null)
      {
        lineNumber++;
        final Matcher mTest = pTest.matcher (line);
        final Matcher mResult = pResult.matcher (line);

        if (mTest.matches ())
        {
          // # Test
          _addTestResultPair (list, test, result, testNumber, testName);
          testNumber = mTest.group (1);
          testName = mTest.group (2);
          test = new StringBuilder ();
          result = new StringBuilder ();
          curbuf = test;
        }
        else
          if (mResult.matches ())
          {
            // # Result
            if (testNumber == null)
              throw new RuntimeException ("Test file has result without a test (line " + lineNumber + ")");
            final String resultNumber = mResult.group (1);
            if (!testNumber.equals (resultNumber))
            {
              throw new RuntimeException ("Result " +
                                          resultNumber +
                                          " test " +
                                          testNumber +
                                          " (line " +
                                          lineNumber +
                                          ")");
            }

            curbuf = result;
          }
          else
          {
            curbuf.append (line);
            curbuf.append ("\n");
          }
      }

      _addTestResultPair (list, test, result, testNumber, testName);

      return list;
    }
    finally
    {
      StreamUtils.close (in);
    }
  }

  private static void _addTestResultPair (final List <TestResultPair> list,
                                          final StringBuilder testbuf,
                                          final StringBuilder resultbuf,
                                          final String testNumber,
                                          final String testName)
  {
    if (testbuf != null && resultbuf != null)
    {
      final String test = _chomp (testbuf.toString ());
      final String result = _chomp (resultbuf.toString ());

      final String id = testNumber + "(" + testName + ")";
      list.add (new TestResultPair (id, test, result));
    }
  }

  private static String _chomp (final String s)
  {
    int lastPos = s.length () - 1;
    while (s.charAt (lastPos) == '\n' || s.charAt (lastPos) == '\r')
    {
      lastPos--;
    }
    return s.substring (0, lastPos + 1);
  }

  @Test
  public void runTest ()
  {
    assertEquals (m_aPair.toString (),
                  m_aPair.getExpectedResult ().trim (),
                  Processor.process (m_aPair.getTest (), Configuration.builder ().forceExtentedProfile ().build ())
                           .trim ());
  }
}
