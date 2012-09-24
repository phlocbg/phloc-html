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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.idfactory.GlobalIDFactory;
import com.phloc.commons.string.ToStringGenerator;
import com.phloc.html.EHTMLVersion;
import com.phloc.html.css.DefaultCSSClassProvider;
import com.phloc.html.css.ICSSClassProvider;
import com.phloc.html.hc.CHCParam;
import com.phloc.html.hc.IHCBaseNode;
import com.phloc.html.hc.IHCControl;
import com.phloc.html.hc.IHCElement;
import com.phloc.html.hc.html.HCButton;
import com.phloc.html.hc.html.HCButton_Submit;
import com.phloc.html.hc.html.HCCheckBox;
import com.phloc.html.hc.html.HCEdit;
import com.phloc.html.hc.html.HCEditFile;
import com.phloc.html.hc.html.HCEditPassword;
import com.phloc.html.hc.html.HCForm;
import com.phloc.html.hc.html.HCHiddenField;
import com.phloc.html.hc.html.HCRadioButton;
import com.phloc.html.hc.html.HCScript;
import com.phloc.html.js.EJSEvent;
import com.phloc.html.js.builder.JSExpr;
import com.phloc.html.js.builder.JSInvocation;
import com.phloc.html.js.builder.jquery.JQuery;

/**
 * A helper class that centrally adds all non-common customizations
 * 
 * @author philip
 */
@Immutable
public class HCDefaultCustomizer implements IHCCustomizer
{
  private static final ICSSClassProvider CSS_CLASS_BUTTON = DefaultCSSClassProvider.create ("button");
  private static final ICSSClassProvider CSS_CLASS_CHECKBOX = DefaultCSSClassProvider.create ("checkbox");
  private static final ICSSClassProvider CSS_CLASS_EDIT = DefaultCSSClassProvider.create ("edit");
  private static final ICSSClassProvider CSS_CLASS_EDIT_FILE = DefaultCSSClassProvider.create ("edit_file");
  private static final ICSSClassProvider CSS_CLASS_EDIT_PASSWORD = DefaultCSSClassProvider.create ("edit_password");
  private static final ICSSClassProvider CSS_CLASS_HIDDEN = DefaultCSSClassProvider.create ("hidden");
  private static final ICSSClassProvider CSS_CLASS_RADIO = DefaultCSSClassProvider.create ("radio");

  // For controls only
  private static final ICSSClassProvider CSS_CLASS_DISABLED = DefaultCSSClassProvider.create ("disabled");
  private static final ICSSClassProvider CSS_CLASS_READONLY = DefaultCSSClassProvider.create ("readonly");

  // For buttons
  private static final ICSSClassProvider CSS_CLASS_INVISIBLE_BUTTON = DefaultCSSClassProvider.create ("pdaf_invisible_button");

  private static final JSInvocation JS_BLUR = JSExpr.invoke ("blur");

  public HCDefaultCustomizer ()
  {}

  @Nonnull
  private static HCButton _createFakeSubmitButton ()
  {
    return new HCButton_Submit ("").addClass (CSS_CLASS_INVISIBLE_BUTTON);
  }

  public void customizeHCElement (@Nonnull final IHCElement <?> aElement, @Nonnull final EHTMLVersion eHTMLVersion)
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
                  final HCButton aButton = _createFakeSubmitButton ();
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
    }
  }

  @Nullable
  public IHCBaseNode getCustomOutOfBandNode (@Nonnull final IHCElement <?> aElement,
                                             @Nonnull final EHTMLVersion eHTMLVersion)
  {
    if (aElement instanceof IHCControl <?>)
    {
      // Specific control stuff
      final IHCControl <?> aCtrl = (IHCControl <?>) aElement;
      if (aCtrl.isFocused ())
      {
        // for focusing we need an ID!
        if (aCtrl.getID () == null)
          aCtrl.setID (GlobalIDFactory.getNewStringID ());

        // Add this out of band node
        // Note: assuming jQuery
        return new HCScript (JQuery.idRef (aCtrl.getID ()).focus ());
      }
    }
    return null;
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).toString ();
  }
}
