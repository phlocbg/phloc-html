/**
 * Copyright (C) 2006-2015 phloc systems
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.phloc.commons.charset.CCharset;
import com.phloc.commons.io.file.SimpleFileIO;
import com.phloc.commons.io.file.iterate.FileSystemRecursiveIterator;
import com.phloc.commons.string.StringHelper;

@RunWith (value = Parameterized.class)
public final class MarkdownTest
{
  @Parameters
  public static Collection <Object []> markdownTests ()
  {
    final List <Object []> list = new ArrayList <Object []> ();
    for (final File aFile : new FileSystemRecursiveIterator (new File ("src/test/resources/MarkdownTest"))) //$NON-NLS-1$
    {
      final String fileName = aFile.getName ();
      if (fileName.endsWith (".text")) //$NON-NLS-1$
      {
        final String testName = fileName.substring (0, fileName.lastIndexOf ('.'));
        list.add (new Object [] { aFile.getParentFile ().getAbsolutePath (), testName });
      }
    }
    return list;
  }

  private final String m_sTest;
  private final String m_sDir;

  public MarkdownTest (final String dir, final String test)
  {
    this.m_sDir = dir;
    this.m_sTest = test;
  }

  private static String _slurp (final String fileName)
  {
    return SimpleFileIO.readFileAsString (new File (fileName), CCharset.CHARSET_UTF_8_OBJ);
  }

  private static String getWithconsolidateLineEndings (final String sString)
  {
    return StringHelper.replaceAll (sString, "\r\n", "\n"); //$NON-NLS-1$ //$NON-NLS-2$
  }

  @Test
  public void runTest () throws IOException
  {
    final String testText = _slurp (this.m_sDir + File.separator + this.m_sTest + ".text"); //$NON-NLS-1$
    final String htmlText = _slurp (this.m_sDir + File.separator + this.m_sTest + ".html"); //$NON-NLS-1$
    final String markdownText = new MarkdownProcessor ().process (testText).getAsHTMLString ();
    // StringHelper.
    assertEquals (this.m_sTest, htmlText.trim (), markdownText.trim ());
  }
}
