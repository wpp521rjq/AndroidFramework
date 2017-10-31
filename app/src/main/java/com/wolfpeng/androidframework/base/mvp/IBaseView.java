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







    @LayoutRes
    int getLayoutId();

    void onCreateAfter(Bundle savedInstanceState);

    void initData();


}
