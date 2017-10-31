package com.wolfpeng.comlibrary.base;

import android.app.Application;

/**
 * author：WolfWang
 * date：2017/9/26 16:58
 * e-mail：1678173987@qq.com
 * description：comlibrary application
 */

public class ComLibraryApplication {


    private static Application application;

    public static Application getApplication() {
        return application;
    }

    public static void init(Application application) {
        setApplication(application);
    }

    private static void setApplication(Application application) {
        ComLibraryApplication.application = application;
    }


}
