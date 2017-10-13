package com.wolfpeng.comlibrary.utils;

import android.content.Context;

import com.wolfpeng.comlibrary.base.ComLibraryApplication;

/**
 * author：WolfWang
 * date：2017/6/16 10:07
 * e-mail：1678173987@qq.com
 * description：工具类
 */
public class Utils {
    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        return ComLibraryApplication.getApplication().getApplicationContext();
    }
}