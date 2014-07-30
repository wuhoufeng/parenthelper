// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CarouselFragment$$ViewInjector {
  public static void inject(Finder finder, final com.ksn.parenthelper.ui.CarouselFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230791, "field 'indicator'");
    target.indicator = (com.viewpagerindicator.TitlePageIndicator) view;
    view = finder.findRequiredView(source, 2131230792, "field 'pager'");
    target.pager = (android.support.v4.view.ViewPager) view;
  }

  public static void reset(com.ksn.parenthelper.ui.CarouselFragment target) {
    target.indicator = null;
    target.pager = null;
  }
}
