package com.wolfpeng.androidframework.base.mvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

/**
 * author：WolfWang
 * date：2017/10/13 16:08
 * e-mail：1678173987@qq.com
 * description：
 */

public interface IBaseView {


    /**
     * 加载布局id
     *
     * @return
     */
    @LayoutRes
    int getLayoutId();

    /**
     * 在oncreate方法中进行初始化创建之后执行
     *
     * @param savedInstanceState
     */
    void onCreateAfter(Bundle savedInstanceState);

    /**
     * 在页面渲染完成之后在窗口失去焦点之后进行初始化数据
     */
    void initData();


}
