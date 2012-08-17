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

package com.phloc.html.js.builder.writer;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

import com.phloc.commons.io.EAppend;
import com.phloc.commons.io.file.FileOperations;
import com.phloc.commons.io.resource.FileSystemResource;
import com.phloc.html.js.builder.JSPackage;

/**
 * Writes all the source files under the specified file folder.
 * 
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class FileCodeWriter extends AbstractCodeWriter
{
  /** The target directory to put source code. */
  private final File m_aTarget;

  /** specify whether or not to mark the generated files read-only */
  private final boolean m_bReadOnly;

  /** Files that shall be marked as read only. */
  private final Set <File> m_aReadOnlyFiles = new HashSet <File> ();

  public FileCodeWriter (final File target, final String encoding) throws IOException
  {
    this (target, false, encoding);
  }

  public FileCodeWriter (final File target, final boolean readOnly, final String encoding) throws IOException
  {
    super (encoding);
    m_aTarget = target;
    m_bReadOnly = readOnly;
    if (!target.exists () || !target.isDirectory ())
      throw new IOException (target + ": non-existent directory");
  }

  @Override
  public Writer getWriter (final JSPackage pkg) throws IOException
  {
    return new FileSystemResource (getFile (pkg)).getWriter (m_sEncoding, EAppend.TRUNCATE);
  }

  protected File getFile (final JSPackage pkg) throws IOException
  {
    final JSPackage aParentPackage = pkg.parent ();

    File dir;
    if (aParentPackage == null || aParentPackage.isUnnamed ())
      dir = m_aTarget;
    else
      dir = new File (m_aTarget, _toDirName (aParentPackage));

    FileOperations.createDirRecursiveIfNotExisting (dir);

    final File fn = new File (dir, pkg.name () + ".js");

    if (FileOperations.deleteFileIfExisting (fn).isFailure ())
      throw new IOException (fn + ": Can't delete previous version");

    if (m_bReadOnly)
      m_aReadOnlyFiles.add (fn);
    return fn;
  }

  @Override
  public void afterAllPackages () throws IOException
  {
    // mark files as read-onnly if necessary
    for (final File f : m_aReadOnlyFiles)
      f.setReadOnly ();
  }

  /** Converts a package name to the directory name. */
  private static String _toDirName (final JSPackage pkg)
  {
    return pkg.name ().replace ('.', File.separatorChar);
  }
}
