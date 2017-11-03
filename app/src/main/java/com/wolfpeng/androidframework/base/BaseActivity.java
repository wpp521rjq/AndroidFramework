package com.wolfpeng.androidframework.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kaopiz.kprogresshud.KProgressHUD;
import com.wolfpeng.androidframework.AppManager;
import com.wolfpeng.androidframework.base.mvp.IBaseView;

import butterknife.ButterKnife;

/**
 * author：WolfWang
 * date：2017/10/31 11:47
 * e-mail：1678173987@qq.com
 * description：
 */

public abstract class BaseActivity extends AppCompatActivity implements IBaseView,IWaitDialog {




    private KProgressHUD kProgressHUD;
    private KProgressHUD kProgressHUDWithProgress;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutId() != 0) {// 设置布局,如果子类有返回布局的话
            setContentView(getLayoutId());
            ButterKnife.bind(this);
        } else {
            //没有提供ViewId
            throw new IllegalStateException(this.getClass().getSimpleName() + "没有提供正确的LayoutId");
        }
        init();
        onCreateAfter(savedInstanceState);
    }

    protected void init() {
        //将activity 放入栈中
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void onCreateAfter(Bundle savedInstanceState) {

    }


    private boolean isFirstFocused = true;
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (isFirstFocused && hasFocus) {
            isFirstFocused = false;
            initData();//此时界面渲染完毕,可以用来初始化数据等
        }

    }

    @Override
    protected void onDestroy() {
        //移除任务栈
        AppManager.getAppManager().removeActivity(this);
        super.onDestroy();
    }

    @Override
    public KProgressHUD showWaitDialog(String text, boolean backable) {
        if (kProgressHUD == null)
            kProgressHUD = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                    .setLabel("请稍等...")
                    .setAnimationSpeed(2)
                    .setDimAmount(0.5f);
        else if (kProgressHUD.isShowing()) kProgressHUD.dismiss();
        kProgressHUD.setCancellable(backable)
                .setDetailsLabel(text)
                .show();
        return kProgressHUD;
    }

    @Override
    public void hideWaitDialog() {

        if(kProgressHUD!=null&&kProgressHUD.isShowing()){
            kProgressHUD.dismiss();
        }

    }
    @Override
    public KProgressHUD showWaitDialogWithProgress(String text, boolean backable, int progress) {
        if (kProgressHUDWithProgress == null)
            kProgressHUDWithProgress = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.ANNULAR_DETERMINATE)
                    .setLabel("请稍等...")
                    .setAnimationSpeed(2)
                    .setMaxProgress(100)
                    .setDimAmount(0.5f);
        else if (kProgressHUDWithProgress.isShowing()) kProgressHUDWithProgress.dismiss();
        kProgressHUDWithProgress.setCancellable(backable)
                .setDetailsLabel(text)
                .show();
        return kProgressHUDWithProgress;
    }

    @Override
    public void hideWaitDialogWithProgress() {

        if(kProgressHUDWithProgress!=null&&kProgressHUDWithProgress.isShowing()){
            kProgressHUDWithProgress.dismiss();
        }

    }
}
