package com.wolfpeng.androidframework.base.mvp;

/**
 * author：WolfWang
 * date：2017/11/1 15:38
 * e-mail：1678173987@qq.com
 * description：
 */

public interface IBaseMVPPresenter<V extends IBaseMVPView> {


    /**
     * 添加view
     * @param mvpView
     */
    void attachView(V mvpView);


    /**
     * 添加view
     */
    void detachView();
}
