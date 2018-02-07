package com.wolfpeng.androidframework.presenter;

import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.wolfpeng.androidframework.base.mvp.BasePresenter;
import com.wolfpeng.androidframework.constant.Constants;
import com.wolfpeng.androidframework.view.NewsFragmentView;
import com.wolfpeng.comlibrary.base.ComLibraryApplication;
import com.wolfpeng.comlibrary.entity.NewsEntity;
import com.wolfpeng.comlibrary.entity.RequestBaseEntity;
import com.wolfpeng.comlibrary.network.RetrofitClient;
import com.wolfpeng.comlibrary.network.callback.RequestCallBack;
import com.wolfpeng.comlibrary.utils.LogUtils;

import java.io.IOException;
import java.lang.reflect.Type;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author：WolfWang
 * date：2018/1/24 16:33
 * e-mail：1678173987@qq.com
 * description：newsPresenter
 * 关联到newsfragmentview
 *
 */

public class NewsFragmentPresenter  extends BasePresenter<NewsFragmentView>{


    public  void getNewsData(String type){
        getMVPView().showWait("正在加载请稍等",true,1);
        RetrofitClient.getInstance().getNewsData(Constants.getTypeByTab(type), new RequestCallBack<RequestBaseEntity<NewsEntity>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void callSuccess(RequestBaseEntity<NewsEntity> result) {
                getMVPView().onLoadSuccess(result.getResult());
            }

            @Override
            public void callFailed(RequestBaseEntity requestBaseEntity) {
                getMVPView().hideWait(1);
                Toast.makeText(ComLibraryApplication.getApplication(),requestBaseEntity.getReason(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void callException(Throwable throwable) {
                getMVPView().hideWait(1);
            }

            @Override
            public void callComplete() {
                getMVPView().hideWait(1);
            }
        });
    }

}
