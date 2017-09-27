package com.wolfpeng.comlibrary.network;


import com.wolfpeng.comlibrary.utils.LogUtils;
import com.wolfpeng.comlibrary.utils.NetworkUtils;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * author：WolfWang
 * date：2017/6/16 10:03
 * e-mail：1678173987@qq.com
 * description：http 网络缓存拦截器
 */
public class NetworkInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (!NetworkUtils.isConnected()) {
            request = request.newBuilder()
                    .cacheControl(CacheControl.FORCE_CACHE)
                    .build();
            LogUtils.e("Okhttp", "no network");
        }

        Response originalResponse = chain.proceed(request);
        if (NetworkUtils.isConnected()) {
            //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
            String cacheControl = request.cacheControl().toString();
            return originalResponse.newBuilder()
                    .header("Cache-Control", cacheControl)
                    .removeHeader("Pragma")
                    .build();
        } else {
            return originalResponse.newBuilder()
                    .header("Cache-Control", "public, only-if-cached, max-stale=2419200")
                    .removeHeader("Pragma")
                    .build();
        }
    }
}
