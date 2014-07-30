package com.ksn.parenthelper.ui;

import android.accounts.AccountsException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ksn.parenthelper.BootstrapServiceProvider;
import com.ksn.parenthelper.R;
import com.ksn.parenthelper.core.User;
import com.ksn.parenthelper.util.Ln;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import butterknife.InjectView;

import static com.ksn.parenthelper.core.Constants.Extra.USER;

/**
 * Created by Administrator on 2014-07-29.
 */
public class HomeWorkActivity extends BootstrapActivity {

    @InjectView(R.id.homeworklist)
    protected ListView homeworlist;



    private User user;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.t_homework_view);
        ArrayList<User> users = new ArrayList<User>();
        User user=new User();
        user.setUsername("sdq");
        users.add(user);
        homeworlist.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    private List<String> getData(){

        List<String> data = new ArrayList<String>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");
        data.add("测试数据4");


        return data;
    }



}
