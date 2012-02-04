package com.phloc.html.hc.customize;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.phloc.commons.idfactory.GlobalIDFactory;
import com.phloc.css.DefaultCSSClassProvider;
import com.phloc.css.ICSSClassProvider;
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
import com.phloc.html.js.IJSCodeProvider;
import com.phloc.html.js.provider.CollectingJSCodeProvider;
import com.phloc.html.js.provider.JSCodeWrapper;

/**
 * A helper class that centrally adds all non-common customizations
 * 
 * @author philip
 */
@Immutable
public final class HCDefaultCustomizer
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

  private static final IJSCodeProvider JS_BLUR = JSCodeWrapper.getFunctionCall ("blur");

  private HCDefaultCustomizer ()
  {}

  @Nonnull
  private static HCButton _createFakeSubmitButton ()
  {
    return new HCButton_Submit ("").addClass (CSS_CLASS_INVISIBLE_BUTTON);
  }

  /**
   * Customize with some predefined classes etc.
   * 
   * @param aElement
   *        The element to be customized
   */
  public static void customize (@Nonnull final IHCElement <?> aElement)
  {
    if (aElement instanceof HCButton)
    {
      aElement.addClass (CSS_CLASS_BUTTON);
    }
    else
      if (aElement instanceof HCCheckBox)
      {
        aElement.addClass (CSS_CLASS_CHECKBOX);
        ((HCCheckBox) aElement).setValue (CHCParam.VALUE_CHECKED);
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
                  final int nTabIndex = aForm.getSubmitButtonTabIndex ();
                  if (nTabIndex >= 0)
                    aButton.setTabIndex (nTabIndex);
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

      // Readonly?
      if (aCtrl.isReadonly ())
        aCtrl.addClass (CSS_CLASS_READONLY);
    }
  }

  @Nullable
  public static IHCBaseNode getCustomOutOfBandNode (@Nonnull final IHCElement <?> aElement)
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
        return new HCScript (new CollectingJSCodeProvider ("$('#").appendEscaped (aCtrl.getID ())
                                                                  .append ("').focus();"));
      }
    }
    return null;
  }
}
