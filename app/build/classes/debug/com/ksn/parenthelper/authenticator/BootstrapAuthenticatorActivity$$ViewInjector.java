// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.authenticator;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BootstrapAuthenticatorActivity$$ViewInjector {
  public static void inject(Finder finder, final com.ksn.parenthelper.authenticator.BootstrapAuthenticatorActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230795, "field 'emailText'");
    target.emailText = (android.widget.AutoCompleteTextView) view;
    view = finder.findRequiredView(source, 2131230796, "field 'passwordText'");
    target.passwordText = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131230797, "field 'signInButton'");
    target.signInButton = (android.widget.Button) view;
  }

  public static void reset(com.ksn.parenthelper.authenticator.BootstrapAuthenticatorActivity target) {
    target.emailText = null;
    target.passwordText = null;
    target.signInButton = null;
  }
}
