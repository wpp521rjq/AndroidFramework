package com.wolfpeng.comlibrary.network;

import com.wolfpeng.comlibrary.entity.RequestFailedEntity;

/**
 * author：WolfWang
 * date：2017/9/26 14:47
 * e-mail：1678173987@qq.com
 * description：
 */

public interface HttpRequestListener<T> {


    /**
     * request success result
     * @param result
     */
    void onSuccess(T result);


    /**
     * data result failed data
     * @param requestFailedEntity
     */
    void onFailed(RequestFailedEntity requestFailedEntity);


    /**
     *  request error
     * @param throwable
     */
    void onException(Throwable throwable);





}
