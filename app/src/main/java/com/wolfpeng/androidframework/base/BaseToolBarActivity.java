package com.wolfpeng.androidframework.base;

import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.comlibrary.utils.CheckUtils;
import com.wolfpeng.comlibrary.utils.Utils;
import com.wolfpeng.comlibrary.utils.ViewUtils;

import java.lang.reflect.Method;

import butterknife.BindView;

/**
 * author：WolfWang
 * date：2017/11/2 14:35
 * e-mail：1678173987@qq.com
 * description：
 */

public abstract class BaseToolBarActivity extends BaseActivity {

    @BindView(R.id.id_appbar)
    protected AppBarLayout mAppBar;
    @BindView(R.id.id_toolbar)
    protected Toolbar mToolbar;


    @Override
    protected void init() {
        super.init();
        if (mToolbar == null) // 如果布局文件没有找到toolbar,则不设置actionbar
        {
            throw new IllegalStateException(this.getClass().getSimpleName() + ":要使用BaseToolbarActivity，必须在布局里面增加id为‘id_toolbar’的Toolbar");
        }
        initToobarBar(mToolbar);
        initAppBarLayout(mAppBar);
    }

    public Toolbar getToolbar() {
        return mToolbar;
    }
    public AppBarLayout getAppBar() {
        return mAppBar;
    }


    private void initToobarBar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        if (!CheckUtils.isEmpty(getSubtitleString())) {
            toolbar.setSubtitle(getSubtitleString());
        }
        if (getTitleString() != null) {
            toolbar.setTitle(getTitleString());
        }
        if (hasBackButton()) {//如果需要返回按钮
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("gjhkml");
        }


    }

    private void initAppBarLayout(AppBarLayout appBar) {
        if (appBar == null) return;
        if (Build.VERSION.SDK_INT >= 21) {
            this.mAppBar.setElevation(getElevation());
        }

    }



    /**
     * 子类可以重写,若不重写默认为程序名字
     *
     * @return 返回主标题的资源id
     */
    @NonNull
    protected String getTitleString() {
        return BaseApplication.string(R.string.app_name);
    }

    /**
     * 子类可以重写,若不重写默认为程序名字 返回String资源
     *
     * @return 副标题的资源id
     */
    @NonNull
    protected String getSubtitleString() {
        return "";
    }


    /**
     * 是否有左上角返回按钮
     *
     * @return 返回true则表示需要左上角返回按钮
     */
    protected boolean hasBackButton() {
        return false;
    }

    /**
     * 返回阴影的高度
     * Get elevation float.
     *
     * @return the float
     */
    @FloatRange(from = 0.0)
    protected float getElevation() {
        return 0f;
    }



    private boolean isHiddenAppBar = false;
    /**
     * 切换appBarLayout的显隐
     */
    protected void hideOrShowToolbar() {
        if (mAppBar == null) return;
        mAppBar.animate()
                .translationY(isHiddenAppBar ? 0 : -mAppBar.getHeight())
                .setInterpolator(new DecelerateInterpolator(2))
                .start();
        isHiddenAppBar = !isHiddenAppBar;
    }

    /**
     * 设置appBar的透明度
     * Sets app bar alpha.
     *
     * @param alpha the alpha 0-1.0
     */
    protected void setAppBarAlpha(@FloatRange(from = 0.0, to = 1.0) float alpha) {
        if (mAppBar != null) {
            ViewUtils.setAlpha(mAppBar, alpha);
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // finish();
                onBackPressed();// 返回
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        setOverflowIconVisible(menu);
        return super.onCreateOptionsMenu(menu);
    }


    /**
     * 显示菜单图标
     *
     * @param menu menu
     */
    private void setOverflowIconVisible(Menu menu) {
        try {
            Class clazz = Class.forName("android.support.v7.view.menu.MenuBuilder");
            Method m = clazz.getDeclaredMethod("setOptionalIconsVisible", boolean.class);
            m.setAccessible(true);
            m.invoke(menu, true);
        } catch (Exception e) {
            Log.d("OverflowIconVisible", e.getMessage());
        }
    }

}
