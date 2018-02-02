package com.wolfpeng.comlibrary.network.callback;

/**
 * author：WolfWang
 * date：2018/1/26 11:04
 * e-mail：1678173987@qq.com
 * description：
 */

public interface RequestCallBack<T> {

    /**
     * 成功返回的时候
     *
     * @param result
     */
    void callSuccess(T result);


    /**
     * 根据code 返回进行相应的异常处理
     * @param code
     */
    void callFailed(int code);


    /**
     * 根据不同异常进行不同的处理
     * @param throwable
     */
    void callException(Throwable throwable);
















}
