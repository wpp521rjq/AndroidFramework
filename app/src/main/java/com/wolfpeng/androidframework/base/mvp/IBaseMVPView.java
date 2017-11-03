package com.wolfpeng.androidframework.base.mvp;

/**
 * author：WolfWang
 * date：2017/11/1 15:27
 * e-mail：1678173987@qq.com
 * description：
 */

public interface IBaseMVPView {

    /**
     * 通用的成功返回
     * @param flag
     */
    void onCommonSuccess(int flag);

    /**
     * 请求失败返回处理
     * @param errorCode
     * @param message
     * @param flag
     */
    void onFailure(int errorCode,String message,int flag);


    /**
     * 显示loading
     * @param message
     * @param backable
     * @param flag
     */
    void showWait(String message,boolean backable,int flag);


    /**
     * 隐藏wait
     * @param flag
     */
    void hideWait(int flag);








}
