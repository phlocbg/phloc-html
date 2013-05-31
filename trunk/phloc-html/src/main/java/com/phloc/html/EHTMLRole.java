package com.phloc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.phloc.commons.annotations.Nonempty;
import com.phloc.commons.id.IHasID;
import com.phloc.commons.lang.EnumHelper;

/**
 * Enumeration with all HTML roles. Source: http://www.w3.org/TR/wai-aria/roles
 * 
 * @author Philip Helger
 */
public enum EHTMLRole implements IHasID <String>
{
  ALERT ("alert", false, "A message with important, and usually time-sensitive, information. See related alertdialog and status."),
  ALERTDIALOG ("alertdialog", false, "A type of dialog that contains an alert message, where initial focus goes to an element within the dialog. See related alert and dialog."),
  APPLICATION ("application", false, "A region declared as a web application, as opposed to a web document."),
  ARTICLE ("article", false, "A section of a page that consists of a composition that forms an independent part of a document, page, or site."),
  BANNER ("banner", false, "A region that contains mostly site-oriented content, rather than page-specific content."),
  BUTTON ("button", false, "An input that allows for user-triggered actions when clicked or pressed. See related link."),
  CHECKBOX ("checkbox", false, "A checkable input that has three possible values: true, false, or mixed."),
  COLUMNHEADER ("columnheader", false, "A cell containing header information for a column."),
  COMBOBOX ("combobox", false, "A presentation of a select; usually similar to a textbox where users can type ahead to select an option, or type to enter arbitrary text as a new item in the list. See related listbox."),
  COMMAND ("command", true, "A form of widget that performs an action but does not receive input data."),
  COMPLEMENTARY ("complementary", false, "A supporting section of the document, designed to be complementary to the main content at a similar level in the DOM hierarchy, but remains meaningful when separated from the main content."),
  COMPOSITE ("composite", true, "A widget that may contain navigable descendants or owned children."),
  CONTENTINFO ("contentinfo", false, "A large perceivable region that contains information about the parent document."),
  DEFINITION ("definition", false, "A definition of a term or concept."),
  DIALOG ("dialog", false, "A dialog is an application window that is designed to interrupt the current processing of an application in order to prompt the user to enter information or require a response. See related alertdialog."),
  DIRECTORY ("directory", false, "A list of references to members of a group, such as a static table of contents."),
  DOCUMENT ("document", false, "A region containing related information that is declared as document content, as opposed to a web application."),
  FORM ("form", false, "A landmark region that contains a collection of items and objects that, as a whole, combine to create a form. See related search."),
  GRID ("grid", false, "A grid is an interactive control which contains cells of tabular data arranged in rows and columns, like a table."),
  GRIDCELL ("gridcell", false, "A cell in a grid or treegrid."),
  GROUP ("group", false, "A set of user interface objects which are not intended to be included in a page summary or table of contents by assistive technologies."),
  HEADING ("heading", false, "A heading for a section of the page."),
  IMG ("img", false, "A container for a collection of elements that form an image."),
  INPUT ("input", true, "A generic type of widget that allows user input."),
  LANDMARK ("landmark", true, "A region of the page intended as a navigational landmark."),
  LINK ("link", false, "An interactive reference to an internal or external resource that, when activated, causes the user agent to navigate to that resource. See related button."),
  LIST ("list", false, "A group of non-interactive list items. See related listbox."),
  LISTBOX ("listbox", false, "A widget that allows the user to select one or more items from a list of choices. See related combobox and list."),
  LISTITEM ("listitem", false, "A single item in a list or directory."),
  LOG ("log", false, "A type of live region where new information is added in meaningful order and old information may disappear. See related marquee."),
  MAIN ("main", false, "The main content of a document."),
  MARQUEE ("marquee", false, "A type of live region where non-essential information changes frequently. See related log."),
  MATH ("math", false, "Content that represents a mathematical expression. "),
  MENU ("menu", false, "A type of widget that offers a list of choices to the user."),
  MENUBAR ("menubar", false, "A presentation of menu that usually remains visible and is usually presented horizontally."),
  MENUITEM ("menuitem", false, "An option in a group of choices contained by a menu or menubar."),
  MENUITEMCHECKBOX ("menuitemcheckbox", false, "A checkable menuitem that has three possible values: true, false, or mixed."),
  MENUITEMRADIO ("menuitemradio", false, "A checkable menuitem in a group of menuitemradio roles, only one of which can be checked at a time."),
  NAVIGATION ("navigation", false, "A collection of navigational elements (usually links) for navigating the document or related documents."),
  NOTE ("note", false, "A section whose content is parenthetic or ancillary to the main content of the resource."),
  OPTION ("option", false, "A selectable item in a select list."),
  PRESENTATION ("presentation", false, "An element whose implicit native role semantics will not be mapped to the accessibility API."),
  PROGRESSBAR ("progressbar", false, "An element that displays the progress status for tasks that take a long time."),
  RADIO ("radio", false, "A checkable input in a group of radio roles, only one of which can be checked at a time."),
  RADIOGROUP ("radiogroup", false, "A group of radio buttons."),
  RANGE ("range", true, "An input representing a range of values that can be set by the user."),
  REGION ("region", false, "A large perceivable section of a web page or document, that the author feels is important enough to be included in a page summary or table of contents, for example, an area of the page containing live sporting event statistics."),
  ROLETYPE ("roletype", true, "The base role from which all other roles in this taxonomy inherit."),
  ROW ("row", false, "A row of cells in a grid."),
  ROWGROUP ("rowgroup", false, "A group containing one or more row elements in a grid."),
  ROWHEADER ("rowheader", false, "A cell containing header information for a row in a grid."),
  SCROLLBAR ("scrollbar", false, "A graphical object that controls the scrolling of content within a viewing area, regardless of whether the content is fully displayed within the viewing area."),
  SEARCH ("search", false, "A landmark region that contains a collection of items and objects that, as a whole, combine to create a search facility. See related form."),
  SECTION ("section", true, "A renderable structural containment unit in a document or application."),
  SECTIONHEAD ("sectionhead", true, "A structure that labels or summarizes the topic of its related section."),
  SELECT ("select", true, "A form widget that allows the user to make selections from a set of choices."),
  SEPARATOR ("separator", false, "A divider that separates and distinguishes sections of content or groups of menuitems."),
  SLIDER ("slider", false, "A user input where the user selects a value from within a given range."),
  SPINBUTTON ("spinbutton", false, "A form of range that expects the user to select from among discrete choices."),
  STATUS ("status", false, "A container whose content is advisory information for the user but is not important enough to justify an alert, often but not necessarily presented as a status bar. See related alert."),
  STRUCTURE ("structure", true, "A document structural element."),
  TAB ("tab", false, "A grouping label providing a mechanism for selecting the tab content that is to be rendered to the user."),
  TABLIST ("tablist", false, "A list of tab elements, which are references to tabpanel elements."),
  TABPANEL ("tabpanel", false, "A container for the resources associated with a tab, where each tab is contained in a tablist."),
  TEXTBOX ("textbox", false, "Input that allows free-form text as its value."),
  TIMER ("timer", false, "A type of live region containing a numerical counter which indicates an amount of elapsed time from a start point, or the time remaining until an end point."),
  TOOLBAR ("toolbar", false, "A collection of commonly used function buttons represented in compact visual form."),
  TOOLTIP ("tooltip", false, "A contextual popup that displays a description for an element."),
  TREE ("tree", false, "A type of list that may contain sub-level nested groups that can be collapsed and expanded."),
  TREEGRID ("treegrid", false, "A grid whose rows can be expanded and collapsed in the same manner as for a tree."),
  TREEITEM ("treeitem", false, "An option item of a tree. This is an element within a tree that may be expanded or collapsed if it contains a sub-level group of treeitems."),
  WIDGET ("widget", true, "An interactive component of a graphical user interface (GUI)."),
  WINDOW ("window", true, "A browser or application window.");

  private final String m_sID;
  private final boolean m_bAbstract;
  private final String m_sDescription;

  private EHTMLRole (@Nonnull @Nonempty final String sID,
                     final boolean bAbstract,
                     @Nonnull @Nonempty final String sDescription)
  {
    m_sID = sID;
    m_bAbstract = bAbstract;
    m_sDescription = sDescription;
  }

  @Nonnull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  public boolean isAbstract ()
  {
    return m_bAbstract;
  }

  @Nonnull
  @Nonempty
  public String getDescription ()
  {
    return m_sDescription;
  }

  @Nullable
  public static EHTMLRole getFromIDOrNull (@Nullable final String sID)
  {
    return EnumHelper.getFromIDOrNull (EHTMLRole.class, sID);
  }
}
