package com.wolfpeng.androidframework.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.androidframework.base.BaseActivity;
import com.wolfpeng.androidframework.base.BaseToolBarActivity;
import com.wolfpeng.androidframework.base.mvp.IBaseMVPView;


/**
 * author：WolfWang
 * date：2017/9/25 13:16
 * e-mail：1678173987@qq.com
 * description： a activity to begin to show
 */
public class SplashScreenActivity extends BaseToolBarActivity {

    private final Handler mdelayedToMain = new Handler();

    private final Runnable mDelayedToMainRunnable = new Runnable() {
        @Override
        public void run() {
            //jump to mainActivity
            Intent intent=new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash_screen;
    }

    private void delayedToMain(int delayMillis) {
        mdelayedToMain.postDelayed(mDelayedToMainRunnable, delayMillis);
    }

    @Override
    public void initData() {
        delayedToMain(300);
    }
}
