// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class UserActivity$$ViewInjector {
  public static void inject(Finder finder, final com.ksn.parenthelper.ui.UserActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230819, "field 'avatar'");
    target.avatar = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131230789, "field 'name'");
    target.name = (android.widget.TextView) view;
  }

  public static void reset(com.ksn.parenthelper.ui.UserActivity target) {
    target.avatar = null;
    target.name = null;
  }
}
