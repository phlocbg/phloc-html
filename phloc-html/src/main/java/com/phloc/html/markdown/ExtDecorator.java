package com.phloc.html.markdown;

import java.util.Iterator;
import java.util.Map;

import com.phloc.html.markdown.txtmark.DefaultDecorator;

public class ExtDecorator extends DefaultDecorator
{
  private final HtmlAttributes m_aAttributes = new HtmlAttributes ();

  public ExtDecorator addHtmlAttribute (final String name, final String value, final String... tags)
  {
    for (final String tag : tags)
      m_aAttributes.put (tag, name, value);
    return this;
  }

  public ExtDecorator addStyleClass (final String styleClass, final String... tags)
  {
    for (final String tag : tags)
      m_aAttributes.put (tag, "class", styleClass);
    return this;
  }

  public ExtDecorator useCompactStyle ()
  {
    m_aAttributes.put ("p", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("a", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("h1", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("h2", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("h3", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("h4", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("h5", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("h6", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("ul", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("ol", "style", "font-size:100%; padding:0px; margin:0px;");
    m_aAttributes.put ("li", "style", "font-size:100%; padding:0px; margin:0px;");
    return this;
  }

  private boolean _open (final StringBuilder out, final String tagName)
  {
    return _open (out, tagName, true);
  }

  private boolean _open (final StringBuilder out, final String tagName, final boolean closed)
  {
    final Map <String, String> atts = m_aAttributes.get (tagName);
    if (atts != null)
    {
      out.append ("<");
      out.append (tagName);
      final Iterator <String> it = atts.keySet ().iterator ();
      while (it.hasNext ())
      {
        final String key = it.next ();
        final String value = atts.get (key);
        out.append (" ");
        out.append (key);
        out.append ("=\"");
        out.append (value);
        out.append ("\"");
        out.append (" ");
      }
      if (closed)
      {
        out.append (">");
      }
      return true;
    }
    return false;
  }

  @Override
  public void openParagraph (final StringBuilder out)
  {
    if (!_open (out, "p"))
      super.openParagraph (out);
  }

  @Override
  public void openBlockquote (final StringBuilder out)
  {
    if (!_open (out, "blockquote"))
      super.openBlockquote (out);
  }

  @Override
  public void openCodeBlock (final StringBuilder out)
  {
    if (!_open (out, "pre"))
      super.openCodeBlock (out);
  }

  @Override
  public void openCodeSpan (final StringBuilder out)
  {
    if (!_open (out, "code"))
      super.openCodeSpan (out);
  }

  @Override
  public void openHeadline (final StringBuilder out, final int level)
  {
    if (!_open (out, "h" + level, false))
      super.openHeadline (out, level);
  }

  @Override
  public void openStrong (final StringBuilder out)
  {
    if (!_open (out, "strong"))
      super.openStrong (out);
  }

  @Override
  public void openStrike (final StringBuilder out)
  {
    if (!_open (out, "s"))
      super.openStrike (out);
  }

  @Override
  public void openEmphasis (final StringBuilder out)
  {
    if (!_open (out, "em"))
      super.openEmphasis (out);
  }

  @Override
  public void openSuper (final StringBuilder out)
  {
    if (!_open (out, "super"))
      super.openSuper (out);
  }

  @Override
  public void openOrderedList (final StringBuilder out)
  {
    if (!_open (out, "ol"))
      super.openOrderedList (out);
  }

  @Override
  public void openUnorderedList (final StringBuilder out)
  {
    if (!_open (out, "ul"))
      super.openUnorderedList (out);
  }

  @Override
  public void openListItem (final StringBuilder out)
  {
    if (!_open (out, "li", false))
      super.openListItem (out);
  }

  @Override
  public void horizontalRuler (final StringBuilder out)
  {
    if (_open (out, "hr", false))
    {
      out.append ("/>");
    }
    else
    {
      super.horizontalRuler (out);
    }
  }

  @Override
  public void openLink (final StringBuilder out)
  {
    if (!_open (out, "a", false))
      super.openLink (out);
  }

  @Override
  public void openImage (final StringBuilder out)
  {
    if (!_open (out, "img", false))
      super.openImage (out);
  }

  // @Override
  // public void openLink(StringBuilder out) {
  // out.append("<a target=\"_blank\" ");
  // }
  //
  // @Override
  // public void openBlockquote(StringBuilder out) {
  // out.append("<blockquote style=\"color:red;\">");
  // }
  //
  // @Override
  // public void openParagraph(StringBuilder out) {
  // if(useCompactStyle) {
  // out.append("<p style=\"font-size:100%; padding:0px; margin:0px;\">");
  // }
  // else {
  // super.openParagraph(out);
  // }
  // }
  //
  // @Override
  // public void openHeadline(StringBuilder out, int level) {
  // super.openHeadline(out, level);
  // if(useCompactStyle) {
  // out.append(" style=\"font-size:100%; padding:0px; margin:0px;\"");
  // }
  // }
  //
  // @Override
  // public void openOrderedList(StringBuilder out) {
  // if(useCompactStyle) {
  // openParagraph(out);
  // }
  // else {
  // super.openOrderedList(out);
  // }
  // }
  //
  // @Override
  // public void openUnorderedList(StringBuilder out) {
  // if(useCompactStyle) {
  // openParagraph(out);
  // }
  // else {
  // super.openUnorderedList(out);
  // }
  // }
  //
  // @Override
  // public void openListItem(StringBuilder out) {
  // if(useCompactStyle) {
  // openParagraph(out);
  // out.append(" * ");
  // }
  // else {
  // super.openListItem(out);
  // }
  // }
  //
  // @Override
  // public void closeOrderedList(StringBuilder out) {
  // if(useCompactStyle) {
  // closeParagraph(out);
  // }
  // else {
  // super.closeOrderedList(out);
  // }
  // }
  //
  // @Override
  // public void closeUnorderedList(StringBuilder out) {
  // if(useCompactStyle) {
  // closeParagraph(out);
  // }
  // else {
  // super.closeUnorderedList(out);
  // }
  // }
  //
  // @Override
  // public void closeListItem(StringBuilder out) {
  // if(useCompactStyle) {
  // closeParagraph(out);
  // }
  // else {
  // super.closeListItem(out);
  // }
  // }
  //
}
