package com.phloc.html.tools;

import java.io.InputStream;

import nu.validator.htmlparser.common.XmlViolationPolicy;
import nu.validator.htmlparser.sax.HtmlParser;
import nu.validator.htmlparser.sax.XmlSerializer;

import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import com.phloc.commons.io.streams.NonBlockingByteArrayInputStream;
import com.phloc.commons.io.streams.NonBlockingByteArrayOutputStream;
import com.phloc.commons.io.streams.StreamUtils;
import com.phloc.commons.microdom.IMicroDocument;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.microdom.serialize.MicroReader;
import com.phloc.commons.microdom.serialize.MicroWriter;
import com.phloc.commons.xml.EXMLParserProperty;
import com.phloc.commons.xml.sax.LoggingSAXErrorHandler;

public class MainReadHTMLElements
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (MainReadHTMLElements.class);

  public static void main (final String [] args) throws Exception
  {
    final String sBaseURL = "http://dev.w3.org/html5/markup/";

    s_aLogger.info ("Reading HTML");
    final byte [] aElements = Request.Get (sBaseURL + "elements.html").execute ().returnContent ().asBytes ();

    s_aLogger.info ("Converting to XML");
    final InputStream aIS = new NonBlockingByteArrayInputStream (aElements);
    final NonBlockingByteArrayOutputStream aOS = new NonBlockingByteArrayOutputStream ();

    final XmlSerializer serializer = new XmlSerializer (aOS);
    final HtmlParser parser = new HtmlParser (XmlViolationPolicy.ALTER_INFOSET);
    parser.setErrorHandler (LoggingSAXErrorHandler.getInstance ());
    parser.setContentHandler (serializer);
    parser.setProperty (EXMLParserProperty.SAX_FEATURE_LEXICAL_HANDLER.getName (), serializer);
    parser.parse (new InputSource (aIS));
    StreamUtils.close (aOS);

    s_aLogger.info ("Converting to MicroNode");
    final IMicroDocument aDoc = MicroReader.readMicroXML (aOS.toByteArray ());
    // /html/body/div[3]/div/ul
    final IMicroElement eUL = aDoc.getDocumentElement ()
                                  .getFirstChildElement ("body")
                                  .getChildElements ("div")
                                  .get (2)
                                  .getFirstChildElement ("div")
                                  .getFirstChildElement ("ul");
    System.out.println (MicroWriter.getXMLString (eUL));

    /**
     * <pre>
     * <ul xmlns="http://www.w3.org/1999/xhtml">
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the a element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-a-element.html#the-a-element">ⓘ</a>
     *     </span> <a href="a.html#a">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">a</span> – <span class="shortdesc">hyperlink</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the abbr element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-abbr-element.html#the-abbr-element">ⓘ</a>
     *     </span> <a href="abbr.html#abbr">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">abbr</span> – <span class="shortdesc">abbreviation</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the address element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-address-element.html#the-address-element">ⓘ</a>
     *     </span> <a href="address.html#address">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">address</span> – <span class="shortdesc">contact information</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the area element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-area-element.html#the-area-element">ⓘ</a>
     *     </span> <a href="area.html#area">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">area</span> – <span class="shortdesc">image-map hyperlink</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the article element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-article-element.html#the-article-element">ⓘ</a>
     *     </span> <a href="article.html#article">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">article</span> – <span class="shortdesc">article</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the aside element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-aside-element">ⓘ</a>
     *     </span> <a href="aside.html#aside">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">aside</span> – <span class="shortdesc">tangential content</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the audio element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-audio-element.html#the-audio-element">ⓘ</a>
     *     </span> <a href="audio.html#audio">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">audio</span> – <span class="shortdesc">audio stream</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the b element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-b-element.html#the-b-element">ⓘ</a>
     *     </span> <a href="b.html#b">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">b</span> – <span class="shortdesc">offset text conventionally styled in bold</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the base element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-base-element.html#the-base-element">ⓘ</a>
     *     </span> <a href="base.html#base">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">base</span> – <span class="shortdesc">base URL</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the bdi element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-bdi-element.html#the-bdi-element">ⓘ</a>
     *     </span> <a href="bdi.html#bdi">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">bdi</span> – <span class="shortdesc">BiDi isolate</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the bdo element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-bdo-element.html#the-bdo-element">ⓘ</a>
     *     </span> <a href="bdo.html#bdo">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">bdo</span> – <span class="shortdesc">BiDi override</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the blockquote element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-blockquote-element.html#the-blockquote-element">ⓘ</a>
     *     </span> <a href="blockquote.html#blockquote">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">blockquote</span> – <span class="shortdesc">block quotation</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the body element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-body-element.html#the-body-element">ⓘ</a>
     *     </span> <a href="body.html#body">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">body</span> – <span class="shortdesc">document body</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the br element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-br-element.html#the-br-element">ⓘ</a>
     *     </span> <a href="br.html#br">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">br</span> – <span class="shortdesc">line break</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the button element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-button-element.html#the-button-element">ⓘ</a>
     *     </span> <a href="button.html#button">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">button</span> – <span class="shortdesc">button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the button element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-button-element.html#the-button-element">ⓘ</a>
     *     </span> <a href="button.submit.html#button.submit">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">button</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">submit</span>
     * </span> – <span class="shortdesc">submit button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the button element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-button-element.html#the-button-element">ⓘ</a>
     *     </span> <a href="button.reset.html#button.reset">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">button</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">reset</span>
     * </span> – <span class="shortdesc">reset button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the button element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-button-element.html#the-button-element">ⓘ</a>
     *     </span> <a href="button.button.html#button.button">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">button</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">button</span>
     * </span> – <span class="shortdesc">button with no additional semantics</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the canvas element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-canvas-element.html#the-canvas-element">ⓘ</a>
     *     </span> <a href="canvas.html#canvas">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">canvas</span> – <span class="shortdesc">canvas for dynamic graphics</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the caption element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-caption-element.html#the-caption-element">ⓘ</a>
     *     </span> <a href="caption.html#caption">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">caption</span> – <span class="shortdesc">table title</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the cite element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-cite-element.html#the-cite-element">ⓘ</a>
     *     </span> <a href="cite.html#cite">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">cite</span> – <span class="shortdesc">cited title of a work</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the code element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-code-element.html#the-code-element">ⓘ</a>
     *     </span> <a href="code.html#code">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">code</span> – <span class="shortdesc">code fragment</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the col element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-col-element.html#the-col-element">ⓘ</a>
     *     </span> <a href="col.html#col">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">col</span> – <span class="shortdesc">table column</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the colgroup element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-colgroup-element.html#the-colgroup-element">ⓘ</a>
     *     </span> <a href="colgroup.html#colgroup">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">colgroup</span> – <span class="shortdesc">table column group</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the command element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-command-element.html#the-command">ⓘ</a>
     *     </span> <a href="command.html#command">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">command</span> – <span class="shortdesc">command</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the command element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-command-element.html#the-command-element">ⓘ</a>
     *     </span> <a href="command.command.html#command.command">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">command</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">command</span>
     * </span> – <span class="shortdesc">command with an associated action</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the command element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-command-element.html#the-command-element">ⓘ</a>
     *     </span> <a href="command.radio.html#command.radio">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">command</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">radio</span>
     * </span> – <span class="shortdesc">selection of one item from a list of items</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the command element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-command-element.html#the-command-element">ⓘ</a>
     *     </span> <a href="command.checkbox.html#command.checkbox">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">command</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">checkbox</span>
     * </span> – <span class="shortdesc">state or option that can be toggled</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the datalist element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-datalist-element.html#the-datalist-element">ⓘ</a>
     *     </span> <a href="datalist.html#datalist">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">datalist</span> – <span class="shortdesc">predefined options for other controls</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the dd element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-dd-element.html#the-dd-element">ⓘ</a>
     *     </span> <a href="dd.html#dd">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">dd</span> – <span class="shortdesc">description or value</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the del element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-del-element.html#the-del-element">ⓘ</a>
     *     </span> <a href="del.html#del">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">del</span> – <span class="shortdesc">deleted text</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the details element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-details-element.html#the-details-element">ⓘ</a>
     *     </span> <a href="details.html#details">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">details</span> – <span class="shortdesc">control for additional on-demand information</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the dfn element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-dfn-element.html#the-dfn-element">ⓘ</a>
     *     </span> <a href="dfn.html#dfn">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">dfn</span> – <span class="shortdesc">defining instance</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the div element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-div-element.html#the-div-element">ⓘ</a>
     *     </span> <a href="div.html#div">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">div</span> – <span class="shortdesc">generic flow container</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the dl element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-dl-element.html#the-dl-element">ⓘ</a>
     *     </span> <a href="dl.html#dl">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">dl</span> – <span class="shortdesc">description list</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the dt element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-dt-element.html#the-dt-element">ⓘ</a>
     *     </span> <a href="dt.html#dt">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">dt</span> – <span class="shortdesc">term or name</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the em element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-em-element.html#the-em-element">ⓘ</a>
     *     </span> <a href="em.html#em">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">em</span> – <span class="shortdesc">emphatic stress</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the embed element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-embed-element.html#the-embed-element">ⓘ</a>
     *     </span> <a href="embed.html#embed">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">embed</span> – <span class="shortdesc">integration point for plugins</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the fieldset element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-fieldset-element.html#the-fieldset-element">ⓘ</a>
     *     </span> <a href="fieldset.html#fieldset">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">fieldset</span> – <span class="shortdesc">set of related form controls</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the figcaption element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-figcaption-element.html#the-figcaption-element">ⓘ</a>
     *     </span> <a href="figcaption.html#figcaption">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">figcaption</span> – <span class="shortdesc">figure caption</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the figure element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-figure-element.html#the-figure-element">ⓘ</a>
     *     </span> <a href="figure.html#figure">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">figure</span> – <span class="shortdesc">figure with optional caption</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the footer element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-footer-element.html#the-footer-element">ⓘ</a>
     *     </span> <a href="footer.html#footer">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">footer</span> – <span class="shortdesc">footer</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the form element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-form-element.html#the-form-element">ⓘ</a>
     *     </span> <a href="form.html#form">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">form</span> – <span class="shortdesc">user-submittable form</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the h1 element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">ⓘ</a>
     *     </span> <a href="h1.html#h1">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">h1</span> – <span class="shortdesc">heading</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the h2 element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">ⓘ</a>
     *     </span> <a href="h2.html#h2">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">h2</span> – <span class="shortdesc">heading</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the h3 element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">ⓘ</a>
     *     </span> <a href="h3.html#h3">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">h3</span> – <span class="shortdesc">heading</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the h4 element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">ⓘ</a>
     *     </span> <a href="h4.html#h4">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">h4</span> – <span class="shortdesc">heading</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the h5 element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">ⓘ</a>
     *     </span> <a href="h5.html#h5">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">h5</span> – <span class="shortdesc">heading</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the h6 element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-aside-element.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">ⓘ</a>
     *     </span> <a href="h6.html#h6">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">h6</span> – <span class="shortdesc">heading</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the head element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-head-element.html#the-head-element">ⓘ</a>
     *     </span> <a href="head.html#head">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">head</span> – <span class="shortdesc">document metadata container</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the header element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-header-element.html#the-header-element">ⓘ</a>
     *     </span> <a href="header.html#header">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">header</span> – <span class="shortdesc">header</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the hgroup element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-hgroup-element.html#the-hgroup-element">ⓘ</a>
     *     </span> <a href="hgroup.html#hgroup">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">hgroup</span> – <span class="shortdesc">heading group</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the hr element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-hr-element.html#the-hr-element">ⓘ</a>
     *     </span> <a href="hr.html#hr">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">hr</span> – <span class="shortdesc">thematic break</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the html element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-html-element.html#the-html-element">ⓘ</a>
     *     </span> <a href="html.html#html">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">html</span> – <span class="shortdesc">root element</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the i element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-i-element.html#the-i-element">ⓘ</a>
     *     </span> <a href="i.html#i">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">i</span> – <span class="shortdesc">offset text conventionally styled in italic</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the iframe element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-iframe-element.html#the-iframe-element">ⓘ</a>
     *     </span> <a href="iframe.html#iframe">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">iframe</span> – <span class="shortdesc">nested browsing context (inline frame)</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the img element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-img-element.html#the-img-element">ⓘ</a>
     *     </span> <a href="img.html#img">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">img</span> – <span class="shortdesc">image</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-input-element.html#the-input-element">ⓘ</a>
     *     </span> <a href="input.html#input">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span> – <span class="shortdesc">input control</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#text-(type=text)-state-and-search-state-(type=search)">ⓘ</a>
     *     </span> <a href="input.text.html#input.text">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">text</span>
     * </span> – <span class="shortdesc">text-input field</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#password-state-(type=password)">ⓘ</a>
     *     </span> <a href="input.password.html#input.password">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">password</span>
     * </span> – <span class="shortdesc">password-input field</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#checkbox-state-(type=checkbox)">ⓘ</a>
     *     </span> <a href="input.checkbox.html#input.checkbox">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">checkbox</span>
     * </span> – <span class="shortdesc">checkbox</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#radio-button-state-(type=radio)">ⓘ</a>
     *     </span> <a href="input.radio.html#input.radio">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">radio</span>
     * </span> – <span class="shortdesc">radio button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#button-state-(type=button)">ⓘ</a>
     *     </span> <a href="input.button.html#input.button">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">button</span>
     * </span> – <span class="shortdesc">button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#submit-button-state-(type=submit)">ⓘ</a>
     *     </span> <a href="input.submit.html#input.submit">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">submit</span>
     * </span> – <span class="shortdesc">submit button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#reset-button-state-(type=reset)">ⓘ</a>
     *     </span> <a href="input.reset.html#input.reset">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">reset</span>
     * </span> – <span class="shortdesc">reset button</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#file-upload-state-(type=file)">ⓘ</a>
     *     </span> <a href="input.file.html#input.file">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">file</span>
     * </span> – <span class="shortdesc">file upload control</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#hidden-state-(type=hidden)">ⓘ</a>
     *     </span> <a href="input.hidden.html#input.hidden">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">hidden</span>
     * </span> – <span class="shortdesc">hidden input control</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#image-button-state-(type=image)">ⓘ</a>
     *     </span> <a href="input.image.html#input.image">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">image</span>
     * </span> – <span class="shortdesc">image-coordinates input control</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#date-and-time-state-(type=datetime)">ⓘ</a>
     *     </span> <a href="input.datetime.html#input.datetime">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">datetime</span>
     * </span> – <span class="shortdesc">global date-and-time input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#local-date-and-time-state-(type=datetime-local)">ⓘ</a>
     *     </span> <a href="input.datetime-local.html#input.datetime-local">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">datetime-local</span>
     * </span> – <span class="shortdesc">local date-and-time input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#date-state-(type=date)">ⓘ</a>
     *     </span> <a href="input.date.html#input.date">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">date</span>
     * </span> – <span class="shortdesc">date input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#month-state-(type=month)">ⓘ</a>
     *     </span> <a href="input.month.html#input.month">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">month</span>
     * </span> – <span class="shortdesc">year-and-month input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#time-state-(type=time)">ⓘ</a>
     *     </span> <a href="input.time.html#input.time">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">time</span>
     * </span> – <span class="shortdesc">time input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#week-state-(type=week)">ⓘ</a>
     *     </span> <a href="input.week.html#input.week">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">week</span>
     * </span> – <span class="shortdesc">year-and-week input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#number-state-(type=number)">ⓘ</a>
     *     </span> <a href="input.number.html#input.number">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">number</span>
     * </span> – <span class="shortdesc">number input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#range-state-(type=range)">ⓘ</a>
     *     </span> <a href="input.range.html#input.range">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">range</span>
     * </span> – <span class="shortdesc">imprecise number-input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#e-mail-state-(type=email)">ⓘ</a>
     *     </span> <a href="input.email.html#input.email">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">email</span>
     * </span> – <span class="shortdesc">e-mail address input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#url-state-(type=url)">ⓘ</a>
     *     </span> <a href="input.url.html#input.url">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">url</span>
     * </span> – <span class="shortdesc">URL input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#text-(type=text)-state-and-search-state-(type=search)">ⓘ</a>
     *     </span> <a href="input.search.html#input.search">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">search</span>
     * </span> – <span class="shortdesc">search field</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#telephone-state-(type=tel)">ⓘ</a>
     *     </span> <a href="input.tel.html#input.tel">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">tel</span>
     * </span> – <span class="shortdesc">telephone-number-input field</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the input element in the HTML5 spec" href="http://dev.w3.org/html5/spec/states-of-the-type-attribute.html#color-state-(type=color)">ⓘ</a>
     *     </span> <a href="input.color.html#input.color">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">input</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">type</span>=<span class="equals-value">color</span>
     * </span> – <span class="shortdesc">color-well control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the ins element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-ins-element.html#the-ins-element">ⓘ</a>
     *     </span> <a href="ins.html#ins">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">ins</span> – <span class="shortdesc">inserted text</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the kbd element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-kbd-element.html#the-kbd-element">ⓘ</a>
     *     </span> <a href="kbd.html#kbd">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">kbd</span> – <span class="shortdesc">user input</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the keygen element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-keygen-element.html#the-keygen-element">ⓘ</a>
     *     </span> <a href="keygen.html#keygen">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">keygen</span> – <span class="shortdesc">key-pair generator/input control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the label element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-label-element.html#the-label-element">ⓘ</a>
     *     </span> <a href="label.html#label">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">label</span> – <span class="shortdesc">caption for a form control</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the legend element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-legend-element.html#the-legend-element">ⓘ</a>
     *     </span> <a href="legend.html#legend">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">legend</span> – <span class="shortdesc">title or explanatory caption</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the li element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-li-element.html#the-li-element">ⓘ</a>
     *     </span> <a href="li.html#li">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">li</span> – <span class="shortdesc">list item</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the link element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-link-element.html#the-link-element">ⓘ</a>
     *     </span> <a href="link.html#link">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">link</span> – <span class="shortdesc">inter-document relationship metadata</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the map element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-map-element.html#the-map-element">ⓘ</a>
     *     </span> <a href="map.html#map">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">map</span> – <span class="shortdesc">image-map definition</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the mark element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-mark-element.html#the-mark-element">ⓘ</a>
     *     </span> <a href="mark.html#mark">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">mark</span> – <span class="shortdesc">marked (highlighted) text</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the menu element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-menu-element.html#the-menu-element">ⓘ</a>
     *     </span> <a href="menu.html#menu">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">menu</span> – <span class="shortdesc">list of commands</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meta element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meta-element.html#meta">ⓘ</a>
     *     </span> <a href="meta.html#meta">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meta</span> – <span class="shortdesc">metadata</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meta element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meta-element.html#attr-meta-name">ⓘ</a>
     *     </span> <a href="meta.name.html#meta.name">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meta</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">name</span>
     * </span> – <span class="shortdesc">name-value metadata</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meta element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meta-element.html#attr-meta-http-equiv-refresh">ⓘ</a>
     *     </span> <a href="meta.http-equiv.refresh.html#meta.http-equiv.refresh">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meta</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">http-equiv</span>=<span class="equals-value">refresh</span>
     * </span> – <span class="shortdesc">“refresh” pragma directive</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meta element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meta-element.html#attr-meta-http-equiv-default-style">ⓘ</a>
     *     </span> <a href="meta.http-equiv.default-style.html#meta.http-equiv.default-style">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meta</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">http-equiv</span>=<span class="equals-value">default-style</span>
     * </span> – <span class="shortdesc">“preferred stylesheet” pragma directive</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meta element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meta-element.html#attr-meta-charset">ⓘ</a>
     *     </span> <a href="meta.charset.html#meta.charset">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meta</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">charset</span>
     * </span> – <span class="shortdesc">document character-encoding declaration</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meta element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meta-element.html#attr-meta-http-equiv-content-type">ⓘ</a>
     *     </span> <a href="meta.http-equiv.content-type.html#meta.http-equiv.content-type">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meta</span>
     *         <span class="elem-qualifier"> <span class="attribute-name">http-equiv</span>=<span class="equals-value">content-type</span>
     * </span> – <span class="shortdesc">document character-encoding declaration</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the meter element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-meter-element.html#the-meter-element">ⓘ</a>
     *     </span> <a href="meter.html#meter">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">meter</span> – <span class="shortdesc">scalar gauge</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the nav element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-nav-element.html#the-nav-element">ⓘ</a>
     *     </span> <a href="nav.html#nav">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">nav</span> – <span class="shortdesc">group of navigational links</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the noscript element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-noscript-element.html#the-noscript-element">ⓘ</a>
     *     </span> <a href="noscript.html#noscript">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">noscript</span> – <span class="shortdesc">fallback content for script</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the object element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-object-element.html#the-object-element">ⓘ</a>
     *     </span> <a href="object.html#object">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">object</span> – <span class="shortdesc">generic external content</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the ol element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-ol-element.html#the-ol-element">ⓘ</a>
     *     </span> <a href="ol.html#ol">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">ol</span> – <span class="shortdesc">ordered list</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the optgroup element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-optgroup-element.html#the-optgroup-element">ⓘ</a>
     *     </span> <a href="optgroup.html#optgroup">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">optgroup</span> – <span class="shortdesc">group of options</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the option element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-option-element.html#the-option-element">ⓘ</a>
     *     </span> <a href="option.html#option">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">option</span> – <span class="shortdesc">option</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the output element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-output-element.html#the-output-element">ⓘ</a>
     *     </span> <a href="output.html#output">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">output</span> – <span class="shortdesc">result of a calculation in a form</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the p element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-p-element.html#the-p-element">ⓘ</a>
     *     </span> <a href="p.html#p">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">p</span> – <span class="shortdesc">paragraph</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the param element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-param-element.html#the-param-element">ⓘ</a>
     *     </span> <a href="param.html#param">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">param</span> – <span class="shortdesc">initialization parameters for plugins</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the pre element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-pre-element.html#the-pre-element">ⓘ</a>
     *     </span> <a href="pre.html#pre">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">pre</span> – <span class="shortdesc">preformatted text</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the progress element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-progress-element.html#the-progress-element">ⓘ</a>
     *     </span> <a href="progress.html#progress">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">progress</span> – <span class="shortdesc">progress indicator</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the q element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-q-element.html#the-q-element">ⓘ</a>
     *     </span> <a href="q.html#q">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">q</span> – <span class="shortdesc">quoted text</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the rp element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-rp-element.html#the-rp-element">ⓘ</a>
     *     </span> <a href="rp.html#rp">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">rp</span> – <span class="shortdesc">ruby parenthesis</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the rt element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-rt-element.html#the-rt-element">ⓘ</a>
     *     </span> <a href="rt.html#rt">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">rt</span> – <span class="shortdesc">ruby text</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the ruby element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-ruby-element.html#the-ruby-element">ⓘ</a>
     *     </span> <a href="ruby.html#ruby">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">ruby</span> – <span class="shortdesc">ruby annotation</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the s element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-s-element.html#the-s-element">ⓘ</a>
     *     </span> <a href="s.html#s">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">s</span> – <span class="shortdesc">struck text</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the samp element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-samp-element.html#the-samp-element">ⓘ</a>
     *     </span> <a href="samp.html#samp">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">samp</span> – <span class="shortdesc">(sample) output</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the script element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-script-element.html#the-script-element">ⓘ</a>
     *     </span> <a href="script.html#script">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">script</span> – <span class="shortdesc">embedded script</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the section element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-section-element.html#the-section-element">ⓘ</a>
     *     </span> <a href="section.html#section">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">section</span> – <span class="shortdesc">section</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the select element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-select-element.html#the-select-element">ⓘ</a>
     *     </span> <a href="select.html#select">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">select</span> – <span class="shortdesc">option-selection form control</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the small element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-small-element.html#the-small-element">ⓘ</a>
     *     </span> <a href="small.html#small">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">small</span> – <span class="shortdesc">small print</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the source element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-source-element.html#the-source-element">ⓘ</a>
     *     </span> <a href="source.html#source">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">source</span> – <span class="shortdesc">media source</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the span element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-span-element.html#the-span-element">ⓘ</a>
     *     </span> <a href="span.html#span">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">span</span> – <span class="shortdesc">generic span</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the strong element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-strong-element.html#the-strong-element">ⓘ</a>
     *     </span> <a href="strong.html#strong">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">strong</span> – <span class="shortdesc">strong importance</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the style element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-style-element.html#the-style-element">ⓘ</a>
     *     </span> <a href="style.html#style">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">style</span> – <span class="shortdesc">style (presentation) information</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the sub element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-sub-and-sup-elements.html#the-sub-and-sup-elements">ⓘ</a>
     *     </span> <a href="sub.html#sub">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">sub</span> – <span class="shortdesc">subscript</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the summary element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-summary-element.html#the-summary-element">ⓘ</a>
     *     </span> <a href="summary.html#summary">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">summary</span> – <span class="shortdesc">summary, caption, or legend for a details control</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the sup element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-sub-and-sup-elements.html#the-sub-and-sup-elements">ⓘ</a>
     *     </span> <a href="sup.html#sup">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">sup</span> – <span class="shortdesc">superscript</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the table element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-table-element.html#the-table-element">ⓘ</a>
     *     </span> <a href="table.html#table">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">table</span> – <span class="shortdesc">table</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the tbody element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-tbody-element.html#the-tbody-element">ⓘ</a>
     *     </span> <a href="tbody.html#tbody">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">tbody</span> – <span class="shortdesc">table row group</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the td element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-td-element.html#the-td-element">ⓘ</a>
     *     </span> <a href="td.html#td">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">td</span> – <span class="shortdesc">table cell</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the textarea element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-textarea-element.html#the-textarea-element">ⓘ</a>
     *     </span> <a href="textarea.html#textarea">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">textarea</span> – <span class="shortdesc">text input area</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the tfoot element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-tfoot-element.html#the-tfoot-element">ⓘ</a>
     *     </span> <a href="tfoot.html#tfoot">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">tfoot</span> – <span class="shortdesc">table footer row group</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the th element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-th-element.html#the-th-element">ⓘ</a>
     *     </span> <a href="th.html#th">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">th</span> – <span class="shortdesc">table header cell</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the thead element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-thead-element.html#the-thead-element">ⓘ</a>
     *     </span> <a href="thead.html#thead">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">thead</span> – <span class="shortdesc">table heading group</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the time element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-time-element.html#the-time-element">ⓘ</a>
     *     </span> <a href="time.html#time">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">time</span> – <span class="shortdesc">date and/or time</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the title element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-title-element.html#the-title-element">ⓘ</a>
     *     </span> <a href="title.html#title">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">title</span> – <span class="shortdesc">document title</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the tr element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-tr-element.html#the-tr-element">ⓘ</a>
     *     </span> <a href="tr.html#tr">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">tr</span> – <span class="shortdesc">table row</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the track element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-track-element.html#the-track-element">ⓘ</a>
     *     </span> <a href="track.html#track">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">track</span> – <span class="shortdesc">supplementary media track</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the u element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-u-element.html#the-u-element">ⓘ</a>
     *     </span> <a href="u.html#u">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">u</span> – <span class="shortdesc">offset text conventionally styled with an underline</span>
     *       </span>
     *     </a> <span class="changed-feature" title="The meaning, structure, or purpose of this markup feature has changed in HTML5.">CHANGED</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the ul element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-ul-element.html#the-ul-element">ⓘ</a>
     *     </span> <a href="ul.html#ul">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">ul</span> – <span class="shortdesc">unordered list</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the var element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-var-element.html#the-var-element">ⓘ</a>
     *     </span> <a href="var.html#var">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">var</span> – <span class="shortdesc">variable or placeholder text</span>
     *       </span>
     *     </a>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the video element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-video-element.html#the-video-element">ⓘ</a>
     *     </span> <a href="video.html#video">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">video</span> – <span class="shortdesc">video</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * <li>
     * <span class="spec-link">
     *       <a title="Read about the wbr element in the HTML5 spec" href="http://dev.w3.org/html5/spec/the-wbr-element.html#the-wbr-element">ⓘ</a>
     *     </span> <a href="wbr.html#wbr">
     *       <span class="toc-section-number" />
     *       <span class="toc-section-name">
     *         <span class="element">wbr</span> – <span class="shortdesc">line-break opportunity</span>
     *       </span>
     *     </a> <span class="new-feature" title="This markup feature is newly added in HTML5.">NEW</span>
     * </li>
     * </ul>
     * 
     * 
     * </pre>
     */
  }
}
