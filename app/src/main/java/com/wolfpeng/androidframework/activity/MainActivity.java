package com.wolfpeng.androidframework.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.androidframework.base.mvp.BaseActivity;

/**
 * author：WolfWang
 * date：2017/10/31 16:37
 * e-mail：1678173987@qq.com
 * description：
 */

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void onCreateAfter(Bundle savedInstanceState) {
//        showWaitDialogWithProgress(null,false,50);
//        showWaitDialog(null,false);
    }
}
