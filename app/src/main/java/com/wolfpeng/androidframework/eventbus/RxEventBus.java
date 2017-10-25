package com.wolfpeng.androidframework.eventbus;

import com.wolfpeng.androidframework.R;

/**
 * author：WolfWang
 * date：2017/10/13 16:39
 * e-mail：1678173987@qq.com
 * description：use rxjava to make a eventbus
 * 使用其进行
 */

public class RxEventBus {


    private static RxEventBus instance;


    public RxEventBus getInstance() {
        if (instance == null) {
            synchronized (RxEventBus.class) {
                if (instance == null) {
                    instance = new RxEventBus();
                }
            }
        }
        return instance;
    }


    /**
     * register
     */
    public static void register(){

    }


    /**
     * subscribe
     */
    public static void subscribe(){


    }







}
