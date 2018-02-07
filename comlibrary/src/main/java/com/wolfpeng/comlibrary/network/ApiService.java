package com.wolfpeng.comlibrary.network;


import com.wolfpeng.comlibrary.entity.RequestBaseEntity;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * author：WolfWang
 * date：2017/9/26 11:19
 * e-mail：1678173987@qq.com
 * description：network interfance
 */

public interface ApiService {

    /**
     * 使用post进行请求返回responsebody
     * 请求地址：http://v.juhe.cn/toutiao/index
     * 请求参数：type=&key=06c24133dcbc5d1324324ed874f3ec49
     * 请求方式：GET
     * @param type new type
     * @param key developer key
     * @return
     */
    @Headers({"Content-Type:application/json;charset=UTF-8"})
    @POST("toutiao/index")
    Observable<ResponseBody> getNews(@Query("type") String type, @Query("key") String key);


}
