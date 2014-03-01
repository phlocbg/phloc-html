/**
 * Copyright (C) 2006-2014 phloc systems
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

package com.phloc.html.markdown;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.phloc.commons.charset.CCharset;
import com.phloc.commons.io.file.SimpleFileIO;
import com.phloc.commons.io.resource.ClassPathResource;

@RunWith (value = Parameterized.class)
public class MarkdownTest
{

  private final static String MARKDOWN_TEST_DIR = "/MarkdownTest";

  String m_sTest;
  String m_sDir;

  @Parameters
  public static Collection <Object []> markdownTests ()
  {
    final List <Object []> list = new ArrayList <Object []> ();
    final File dir = ClassPathResource.getAsFile (MARKDOWN_TEST_DIR);
    final File [] dirEntries = dir.listFiles ();

    for (final File dirEntry : dirEntries)
    {
      final String fileName = dirEntry.getName ();
      if (fileName.endsWith (".text"))
      {
        final String testName = fileName.substring (0, fileName.lastIndexOf ('.'));
        list.add (new Object [] { MARKDOWN_TEST_DIR, testName });
      }
    }

    return list;
  }

  public MarkdownTest (final String dir, final String test)
  {
    m_sDir = dir;
    m_sTest = test;
  }

  private static String _slurp (final String fileName)
  {
    return SimpleFileIO.readFileAsString (ClassPathResource.getAsFile (fileName), CCharset.CHARSET_UTF_8_OBJ);
  }

  @Test
  public void runTest ()
  {
    final String testText = _slurp (m_sDir + File.separator + m_sTest + ".text");
    final String htmlText = _slurp (m_sDir + File.separator + m_sTest + ".html");
    final String markdownText = Processor.process (testText);
    assertEquals (m_sTest, htmlText.trim (), markdownText.trim ());
  }
}
