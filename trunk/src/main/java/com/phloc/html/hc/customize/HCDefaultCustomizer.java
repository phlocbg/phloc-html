/**
 * Copyright (C) 2006-2012 phloc systems
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
package com.phloc.html.hc.customize;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phloc.commons.annotations.OverrideOnDemand;
import com.phloc.commons.idfactory.GlobalIDFactory;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.css.DefaultCSSClassProvider;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.CHCParam;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCControl;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.IHCNode;
import com.phloc.html.hc.IHCNodeWithChildren;
import com.phloc.html.hc.api.IHCJSNode;
import com.phloc.html.hc.html.HCBody;
import com.phloc.html.hc.html.HCButton;
import com.phloc.html.hc.html.HCButton_Submit;
import com.phloc.html.hc.html.HCCheckBox;
import com.phloc.html.hc.html.HCEdit;
import com.phloc.html.hc.html.HCEditFile;
import com.phloc.html.hc.html.HCEditPassword;
import com.phloc.html.hc.html.HCForm;
import com.phloc.html.hc.html.HCHead;
import com.phloc.html.hc.html.HCHiddenField;
import com.phloc.html.hc.html.HCLink;
import com.phloc.html.hc.html.HCNoScript;
import com.phloc.html.hc.html.HCRadioButton;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.hc.html.HCScriptOnDocumentReady;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSInvocation;
import com.phloc.html.js.builder.jquery.JQuery;
import com.phloc.html.js.provider.CollectingJSCodeProvider;

/**
 * A helper class that centrally adds all non-common customizations
 * 
 * @author philip
 */
@Immutable
public class HCDefaultCustomizer implements IHCCustomizer
{
  protected static final ICSSClassProvider CSS_CLASS_BUTTON = DefaultCSSClassProvider.create ("button");
  protected static final ICSSClassProvider CSS_CLASS_CHECKBOX = DefaultCSSClassProvider.create ("checkbox");
  protected static final ICSSClassProvider CSS_CLASS_EDIT = DefaultCSSClassProvider.create ("edit");
  protected static final ICSSClassProvider CSS_CLASS_EDIT_FILE = DefaultCSSClassProvider.create ("edit_file");
  protected static final ICSSClassProvider CSS_CLASS_EDIT_PASSWORD = DefaultCSSClassProvider.create ("edit_password");
  protected static final ICSSClassProvider CSS_CLASS_HIDDEN = DefaultCSSClassProvider.create ("hidden");
  protected static final ICSSClassProvider CSS_CLASS_RADIO = DefaultCSSClassProvider.create ("radio");

  // For controls only
  protected static final ICSSClassProvider CSS_CLASS_DISABLED = DefaultCSSClassProvider.create ("disabled");
  protected static final ICSSClassProvider CSS_CLASS_READONLY = DefaultCSSClassProvider.create ("readonly");

  // For buttons
  protected static final ICSSClassProvider CSS_CLASS_INVISIBLE_BUTTON = DefaultCSSClassProvider.create ("pdaf_invisible_button");

  private static final Logger s_aLogger = LoggerFactory.getLogger (HCDefaultCustomizer.class);
  private static final JSInvocation JS_BLUR = JSExpr.invoke ("blur");

  public HCDefaultCustomizer ()
  {}

  @Nonnull
  protected HCButton createFakeSubmitButton ()
  {
    return new HCButton_Submit ("").addClass (CSS_CLASS_INVISIBLE_BUTTON);
  }

  public void customizeHCElement (@Nonnull final IHCNodeWithChildren <?> aParentElement,
                                  @Nonnull final IHCElement <?> aElement,
                                  @Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (aElement instanceof HCButton)
    {
      aElement.addClass (CSS_CLASS_BUTTON);
    }
    else
      if (aElement instanceof HCCheckBox)
      {
        final HCCheckBox aCheckBox = (HCCheckBox) aElement;
        aCheckBox.addClass (CSS_CLASS_CHECKBOX);

        // If no value is present, assign the default value
        if (aCheckBox.getValue () == null)
          aCheckBox.setValue (CHCParam.VALUE_CHECKED);
      }
      else
        if (aElement instanceof HCEdit)
        {
          aElement.addClass (CSS_CLASS_EDIT);
        }
        else
          if (aElement instanceof HCEditFile)
          {
            aElement.addClasses (CSS_CLASS_EDIT, CSS_CLASS_EDIT_FILE);
          }
          else
            if (aElement instanceof HCEditPassword)
            {
              aElement.addClasses (CSS_CLASS_EDIT, CSS_CLASS_EDIT_PASSWORD);
            }
            else
              if (aElement instanceof HCForm)
              {
                final HCForm aForm = (HCForm) aElement;
                if (aForm.isSubmitPressingEnter ())
                {
                  final HCButton aButton = createFakeSubmitButton ();
                  aButton.setTabIndex (aForm.getSubmitButtonTabIndex ());
                  aForm.addChild (aButton);
                }
              }
              else
                if (aElement instanceof HCHiddenField)
                {
                  aElement.addClass (CSS_CLASS_HIDDEN);
                }
                else
                  if (aElement instanceof HCRadioButton)
                  {
                    aElement.addClass (CSS_CLASS_RADIO);
                  }

    // Unfocusable?
    if (aElement.isUnfocusable ())
      aElement.setEventHandler (EJSEvent.ONFOCUS, JS_BLUR);

    if (aElement instanceof IHCControl <?>)
    {
      // Specific control stuff
      final IHCControl <?> aCtrl = (IHCControl <?>) aElement;

      // Disable
      if (aCtrl.isDisabled ())
        aCtrl.addClass (CSS_CLASS_DISABLED);

      // Read only?
      if (aCtrl.isReadonly ())
        aCtrl.addClass (CSS_CLASS_READONLY);

      if (aCtrl.isFocused ())
      {
        // for focusing we need an ID!
        if (aCtrl.getID () == null)
          aCtrl.setID (GlobalIDFactory.getNewStringID ());

        // Add this out of band node
        // Note: assuming jQuery
        aParentElement.addChild (new HCScript (JQuery.idRef (aCtrl.getID ()).focus ()));
      }
    }
  }

  @Nonnull
  @OverrideOnDemand
  protected List <IHCBaseNode> assembleOutOfBandNodes (@Nonnull final List <IHCBaseNode> aOutOfBandNodes,
                                                       @Nonnull final HCHead aHead)
  {
    // Add all existing JS nodes from the head, as <script> is known to be out
    // of band
    final List <IHCBaseNode> aNodes = new ArrayList <IHCBaseNode> ();
    aNodes.addAll (aHead.getAllJSNodes ());
    aHead.removeAllJS ();

    final CollectingJSCodeProvider aOnDocumentReadyJS = new CollectingJSCodeProvider ();
    final CollectingJSCodeProvider aInlineJS = new CollectingJSCodeProvider ();
    for (final IHCBaseNode aOOBNode : aOutOfBandNodes)
    {
      if (aOOBNode instanceof HCScriptOnDocumentReady)
        aOnDocumentReadyJS.append (((HCScriptOnDocumentReady) aOOBNode).getOnDocumentReadyCode ());
      else
        if (aOOBNode instanceof HCScript)
          aInlineJS.append ((HCScript) aOOBNode);
        else
          aNodes.add (aOOBNode);
    }

    if (!aInlineJS.isEmpty ())
      aNodes.add (new HCScript (aInlineJS));

    // on document ready always as last!
    if (!aOnDocumentReadyJS.isEmpty ())
      aNodes.add (new HCScript (JQuery.onDocumentReady (aOnDocumentReadyJS)));

    return aNodes;
  }

  @OverrideOnDemand
  protected boolean isBodyNode (@Nonnull final IHCBaseNode aOOBNode)
  {
    if (aOOBNode instanceof IHCJSNode)
      return true;

    if (aOOBNode instanceof HCNoScript)
      return true;

    return false;
  }

  public void handleOutOfBandNodes (@Nonnull final List <IHCBaseNode> aOutOfBandNodes,
                                    @Nonnull final HCHead aHead,
                                    @Nonnull final HCBody aBody)
  {
    final List <IHCBaseNode> aNodes = assembleOutOfBandNodes (aOutOfBandNodes, aHead);

    for (final IHCBaseNode aNode : aNodes)
    {
      if (isBodyNode (aNode))
        aBody.addChild (aNode);
      else
      {
        // It's a head node
        if (HCHead.isValidCSSNode (aNode))
          aHead.addCSS ((IHCNode) aNode);
        else
          if (HCHead.isValidJSNode (aNode))
            aHead.addJS ((IHCNode) aNode);
          else
            if (aNode instanceof HCLink)
              aHead.addLink ((HCLink) aNode);
            else
              s_aLogger.error ("Illegal head node: " + aNode);
      }
    }
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).toString ();
  }
}
