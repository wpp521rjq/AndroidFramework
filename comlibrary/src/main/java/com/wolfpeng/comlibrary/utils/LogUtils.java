/*
 * Copyright (C) 2016 venshine.cn@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wolfpeng.comlibrary.utils;


import android.util.Log;

/**
 * author：WolfWang
 * date：2017/6/16 10:07
 * e-mail：1678173987@qq.com
 * description：log日志打印操作
 */
public class LogUtils {

    private static  boolean DEBUG = true;
    public static void setDEBUG(boolean DEBUG) {
        LogUtils.DEBUG = DEBUG;
    }

    /**
     * 获取当前类名
     * @return
     */
    private static String getClassName() {
        // 这里的数组的index，即2，是根据你工具类的层级取的值，可根据需求改变
        StackTraceElement thisMethodStack = (new Exception()).getStackTrace()[2];
        String result = thisMethodStack.getClassName();
        int lastIndex = result.lastIndexOf(".");
        result = result.substring(lastIndex + 1, result.length());
        return result;
    }


    public static void w(String logString) {
        if (DEBUG) {
            Log.w(getClassName(),logString);
        }
    }

    /**
     * debug log
     *
     * @param msg
     */
    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.w(getClassName(),msg);
        }
    }

    /**
     * error log
     *
     * @param msg
     */
    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.w(getClassName(),msg);
        }
    }


}
