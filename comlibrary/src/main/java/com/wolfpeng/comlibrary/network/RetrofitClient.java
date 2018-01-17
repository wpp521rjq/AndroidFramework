package com.wolfpeng.comlibrary.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wolfpeng.comlibrary.base.ComLibraryApplication;
import com.wolfpeng.comlibrary.utils.LogUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author：WolfWang
 * date：2017/9/26 16:48
 * e-mail：1678173987@qq.com
 * description：
 */

public class RetrofitClient {


    private ApiService apiService;
    private static final int DEFAULT_TIMEOUT=10000;//毫秒
    private static final int DEFAULT_TIMEOUT_CONNET=60;//second

    private static final String Base_URL="http://v.juhe.cn/";


    public static RetrofitClient getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final RetrofitClient INSTANCE = new RetrofitClient();
    }
    /**
     * 在构造器中构造网络访问方法
     */
    private RetrofitClient() {
        //okhttp信息拦截器
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                LogUtils.w("Request---->>>"+message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        Interceptor interceptorhead=new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Request.Builder builder1 = request.newBuilder();
                Request build = builder1
                        .addHeader("Content-Type", "application/json")
                        .addHeader("charset","utf-8")
                        .build();
                return chain.proceed(build);
            }
        };
        File cacheFile = new File(ComLibraryApplication.getApplication().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 20); //20Mb
        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .connectTimeout(DEFAULT_TIMEOUT_CONNET, TimeUnit.SECONDS)
                .addInterceptor(interceptorhead)
                .addInterceptor(interceptor)
                .addNetworkInterceptor(new NetworkInterceptor())
                .cache(cache)
                .build();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
        Retrofit retrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .baseUrl(Base_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        apiService=retrofit.create(ApiService.class);
    }
    public ApiService getApiService() {
        if (apiService != null) {
            return apiService;
        }
        return null;
    }





}
