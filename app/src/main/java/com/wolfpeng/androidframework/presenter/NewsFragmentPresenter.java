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
        RetrofitClient.getInstance().getNewsData(Constants.getTypeByTab(type), new Observer<ResponseBody>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(ResponseBody responseBody) {
                getMVPView().hideWait(1);
                try {
                    String result =responseBody.string();
                    //将result 进行转化
                    Type type = new TypeToken<RequestBaseEntity<NewsEntity>>() {}.getType();
                    RequestBaseEntity<NewsEntity> requestBaseEntity = new Gson().fromJson(result,type);
                    //将其转换成
//                    Toast.makeText(ComLibraryApplication.getApplication(),.toString(),Toast.LENGTH_SHORT).show();
                    getMVPView().onLoadSuccess(requestBaseEntity.getResult());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Throwable e) {
                getMVPView().hideWait(1);
                getMVPView().onFailure(0,e.getMessage(),0);
            }

            @Override
            public void onComplete() {


            }
        });
    }

}
