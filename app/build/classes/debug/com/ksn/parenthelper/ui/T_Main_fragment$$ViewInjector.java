// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class T_Main_fragment$$ViewInjector {
  public static void inject(Finder finder, final com.ksn.parenthelper.ui.T_Main_fragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230813, "method 'tohomework'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.tohomework();
        }
      });
    view = finder.findRequiredView(source, 2131230812, "method 'toSecrity'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.toSecrity(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230814, "method 'toMessage'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.toMessage(p0);
        }
      });
  }

  public static void reset(com.ksn.parenthelper.ui.T_Main_fragment target) {
  }
}
