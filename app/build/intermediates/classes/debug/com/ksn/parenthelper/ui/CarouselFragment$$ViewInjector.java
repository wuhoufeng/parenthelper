// Generated code from Butter Knife. Do not modify!
package com.ksn.parenthelper.ui;

import android.view.View;
import butterknife.Views.Finder;

public class CarouselFragment$$ViewInjector {
  public static void inject(Finder finder, com.ksn.parenthelper.ui.CarouselFragment target, Object source) {
    View view;
    view = finder.findById(source, 2131230791);
    target.indicator = (com.viewpagerindicator.TitlePageIndicator) view;
    view = finder.findById(source, 2131230792);
    target.pager = (android.support.v4.view.ViewPager) view;
  }
}
