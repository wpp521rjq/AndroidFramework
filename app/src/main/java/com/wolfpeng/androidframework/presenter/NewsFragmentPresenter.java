package com.wolfpeng.androidframework.presenter;

import com.wolfpeng.androidframework.base.mvp.BasePresenter;
import com.wolfpeng.androidframework.base.mvp.IBaseMVPPresenter;
import com.wolfpeng.androidframework.constant.Constants;
import com.wolfpeng.androidframework.view.NewsFragmentView;
import com.wolfpeng.comlibrary.entity.RequestBaseEntity;
import com.wolfpeng.comlibrary.entity.ResultEntity;
import com.wolfpeng.comlibrary.network.RequestClient;
import com.wolfpeng.comlibrary.network.RetrofitClient;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * author：WolfWang
 * date：2018/1/24 16:33
 * e-mail：1678173987@qq.com
 * description：newsPresenter
 * 关联到newsfragmentview
 *
 */

public class NewsFragmentPresenter  extends BasePresenter<NewsFragmentView>{


    private void getNewsData(String type){
        RetrofitClient.getInstance().getApiService().getNews(type, Constants.NEWS_APPKEY).compose(new ObservableTransformer() {
            @Override
            public ObservableSource apply(Observable upstream) {
                return upstream.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
            }
        }).subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {
                //转化数据


            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                //进行处理异常
            }
        });

    }











}
