package com.wolfpeng.androidframework.base.mvp;

/**
 * author：WolfWang
 * date：2017/10/13 16:07
 * e-mail：1678173987@qq.com
 * description：
 */

public class BasePresenter<T extends IBaseMVPView> implements IBaseMVPPresenter<T>{

    private T mIBaseMVPView;




    @Override
    public void attachView(T mvpView) {
        this.mIBaseMVPView=mvpView;
    }

    @Override
    public void detachView() {

        this.mIBaseMVPView=null;
    }
}
