// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BootstrapTimerActivity$$ViewInjector {
  public static void inject(Finder finder, final com.ksn.parenthelper.ui.BootstrapTimerActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230784, "field 'chronometer'");
    target.chronometer = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131230785, "field 'start'");
    target.start = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131230786, "field 'stop'");
    target.stop = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131230787, "field 'pause'");
    target.pause = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131230788, "field 'resume'");
    target.resume = (android.widget.Button) view;
  }

  public static void reset(com.ksn.parenthelper.ui.BootstrapTimerActivity target) {
    target.chronometer = null;
    target.start = null;
    target.stop = null;
    target.pause = null;
    target.resume = null;
  }
}
