package com.wolfpeng.androidframework.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.androidframework.base.BaseToolBarActivity;

/**
 * author：WolfWang
 * date：2017/10/31 16:37
 * e-mail：1678173987@qq.com
 * description：
 */

public class MainActivity extends BaseToolBarActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void onCreateAfter(Bundle savedInstanceState) {
//        showWaitDialogWithProgress(null,false,50);
//        showWaitDialog(null,false);




        startActivity(new Intent(MainActivity.this,NewsActivity.class));
    }

    @Override
    public void initData() {


    }

    @NonNull
    @Override
    protected String getTitleString() {
        return "云曦新闻";
    }


    @Override
    protected boolean hasBackButton() {
        return false;
    }
}
