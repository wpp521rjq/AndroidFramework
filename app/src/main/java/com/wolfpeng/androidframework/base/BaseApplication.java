package com.wolfpeng.androidframework.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.wolfpeng.comlibrary.base.ComLibraryApplication;

/**
 * author：WolfWang
 * date：2017/10/13 10:46
 * e-mail：1678173987@qq.com
 * description：
 */

public class BaseApplication extends Application {


    private static Context context;
    private static Resources resources;



    @Override
    public void onCreate() {
        super.onCreate();
        initVariable();
        ComLibraryApplication.init(this);
    }

    /**
     * 初始化变量
     */
    private void initVariable() {
        context=getApplicationContext();
        resources=context.getResources();
    }
    /**
     * getcolor
     * @param id
     * @return
     */
    public static int color(int id){
        return resources.getColor(id);
    }

    public static String string(int id){
        return resources.getString(id);
    }

    public static Drawable drawable(int id){
        return resources.getDrawable(id);
    }








}
