package com.wolfpeng.androidframework.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.wolfpeng.androidframework.R;


/**
 * author：WolfWang
 * date：2017/9/25 13:16
 * e-mail：1678173987@qq.com
 * description： a activity to begin to show
 */
public class SplashScreenActivity extends AppCompatActivity {

    private final Handler mdelayedToMain=new Handler();

    private final Runnable mDelayedToMainRunnable=new Runnable() {
        @Override
        public void run() {
            //jump to mainActivity
            Intent intent=new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };



    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //进行设置全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        setContentView(R.layout.activity_splash_screen);
        delayedToMain(300);
    }


    private void delayedToMain(int delayMillis){
        mdelayedToMain.postDelayed(mDelayedToMainRunnable,delayMillis);
    }
}
