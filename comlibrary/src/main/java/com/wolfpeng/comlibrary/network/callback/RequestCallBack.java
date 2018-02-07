package com.wolfpeng.comlibrary.network.callback;

import com.wolfpeng.comlibrary.entity.RequestBaseEntity;

import io.reactivex.disposables.Disposable;

/**
 * author：WolfWang
 * date：2018/1/26 11:04
 * e-mail：1678173987@qq.com
 * description：
 */

public interface RequestCallBack<T> {

    void onSubscribe(Disposable d);

    /**
     * 成功返回的时候
     *
     * @param result
     */
    void callSuccess(T result);


    /**
     * 返回进行相应的异常处理
     * @param requestBaseEntity
     */
    void callFailed(RequestBaseEntity requestBaseEntity);


    /**
     * 根据不同异常进行不同的处理
     * @param throwable
     */
    void callException(Throwable throwable);

    /**
     * 请求完成的时候这个跟call exception方法只调用一个
     */
    void callComplete();
















}
