package com.ksn.parenthelper.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ksn.parenthelper.R;
import com.ksn.parenthelper.core.Constants;
import com.ksn.parenthelper.util.Ln;
import com.viewpagerindicator.TitlePageIndicator;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


/**
 * Created by Administrator on 2014-07-25.
 */
public class T_Main_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.t_main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ButterKnife.inject(this, getView());
    }

    @OnClick(R.id.btn_toHomeWork)
    public  void tohomework(){

        Intent intent=new Intent(getActivity(),HomeWorkActivity.class);
        startActivity(intent);

    }
    @OnClick(R.id.btn_toSecurity)
    public void toSecrity(View view){
        Intent intent = new Intent(getActivity(), SecurityActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_toMessage)
    public void toMessage(View view){
        Intent intent = new Intent(getActivity(), MessageActivity.class);
        startActivity(intent);
    }
}
