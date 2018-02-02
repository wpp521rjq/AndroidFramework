package com.wolfpeng.androidframework.model;

import com.wolfpeng.comlibrary.entity.NewsEntity;
import com.wolfpeng.comlibrary.entity.RequestBaseEntity;

import io.reactivex.Observable;

/**
 * author：WolfWang
 * date：2018/1/24 16:55
 * e-mail：1678173987@qq.com
 * description：
 */

public class NewsFragmentModel  {

    //获取数据

    public static final NewsFragmentModel newsFragmentModel=new NewsFragmentModel();


    public NewsFragmentModel() {
    }


    Observable<RequestBaseEntity<NewsEntity>> getNewsData() {



        return null;
    }
}
