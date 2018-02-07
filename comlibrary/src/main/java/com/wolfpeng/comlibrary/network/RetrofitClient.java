package com.wolfpeng.comlibrary.network;

import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.wolfpeng.comlibrary.base.ComLibraryApplication;
import com.wolfpeng.comlibrary.constants.Constants;
import com.wolfpeng.comlibrary.entity.NewsEntity;
import com.wolfpeng.comlibrary.entity.RequestBaseEntity;
import com.wolfpeng.comlibrary.network.callback.RequestCallBack;
import com.wolfpeng.comlibrary.utils.LogUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
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
                //在此进行拦截



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
    public void getNewsData(String type , final RequestCallBack<RequestBaseEntity<NewsEntity>> requestCallBack){
        getApiService().getNews(type, Constants.REQUEST_KEY)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        requestCallBack.onSubscribe(d);

                    }

                    @Override
                    public void onNext(ResponseBody responseBody) {
                        //进行解析
                        try {
                            String result=responseBody.string();
                            Type type = new TypeToken<RequestBaseEntity<NewsEntity>>() {}.getType();
                            RequestBaseEntity<NewsEntity> newsEntityRequestBaseEntity=new Gson().fromJson(result,type);
                            if(newsEntityRequestBaseEntity.isSuccess()){
                                requestCallBack.callSuccess(newsEntityRequestBaseEntity);
                            }else{
                                requestCallBack.callFailed(newsEntityRequestBaseEntity);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                        requestCallBack.callException(e);


                    }

                    @Override
                    public void onComplete() {
                        requestCallBack.callComplete();
                    }
                });
    }




}
