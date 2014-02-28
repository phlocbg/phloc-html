package com.phloc.html.markdown.ext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import com.phloc.html.markdown.Configuration;
import com.phloc.html.markdown.Processor;
import com.phloc.html.markdown.Configuration.Builder;

public class Markdown4jProcessor
{
  private final Builder m_aBuilder;
  private ExtDecorator m_aDecorator;

  public Markdown4jProcessor ()
  {
    m_aDecorator = new ExtDecorator ();
    m_aBuilder = Configuration.builder ()
                              .forceExtentedProfile ()
                              .registerPlugins (new YumlPlugin (), new WebSequencePlugin (), new IncludePlugin ())
                              .convertNewline2Br ()
                              .setDecorator (m_aDecorator)
                              .setCodeBlockEmitter (new CodeBlockEmitter ());
  }

  public Markdown4jProcessor registerPlugins (final AbstractPlugin... plugins)
  {
    m_aBuilder.registerPlugins (plugins);
    return this;
  }

  public Markdown4jProcessor setDecorator (final ExtDecorator decorator)
  {
    this.m_aDecorator = decorator;
    m_aBuilder.setDecorator (decorator);
    return this;
  }

  public Markdown4jProcessor addHtmlAttribute (final String name, final String value, final String... tags)
  {
    m_aDecorator.addHtmlAttribute (name, value, tags);
    return this;
  }

  public Markdown4jProcessor addStyleClass (final String styleClass, final String... tags)
  {
    m_aDecorator.addStyleClass (styleClass, tags);
    return this;
  }

  public String process (final File file) throws IOException
  {
    return Processor.process (file, m_aBuilder.build ());
  }

  public String process (final InputStream input) throws IOException
  {
    return Processor.process (input);
  }

  public String process (final Reader reader) throws IOException
  {
    return Processor.process (reader, m_aBuilder.build ());
  }

  public String process (final String input)
  {
    return Processor.process (input, m_aBuilder.build ());
  }
}
