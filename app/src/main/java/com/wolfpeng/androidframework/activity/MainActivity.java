package com.wolfpeng.androidframework.activity;

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
    }

    @Override
    public void initData() {

    }


    @NonNull
    @Override
    protected String getSubtitleString() {
        return "我是副标题";
    }

    @NonNull
    @Override
    protected String getTitleString() {
        return "来啊 啊 啊";
    }


    @Override
    protected boolean hasBackButton() {
        return false;
    }
}
