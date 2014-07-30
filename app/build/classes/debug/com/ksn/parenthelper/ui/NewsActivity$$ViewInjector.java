// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class NewsActivity$$ViewInjector {
  public static void inject(Finder finder, final com.ksn.parenthelper.ui.NewsActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230801, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131230802, "field 'content'");
    target.content = (android.widget.TextView) view;
  }

  public static void reset(com.ksn.parenthelper.ui.NewsActivity target) {
    target.title = null;
    target.content = null;
  }
}
