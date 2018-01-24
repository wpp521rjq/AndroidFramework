package com.wolfpeng.comlibrary.network;

/**
 * author：WolfWang
 * date：2017/9/26 11:21
 * e-mail：1678173987@qq.com
 * description：network requestclient
 */

public class RequestClient {


    private static  RequestClient mRequestClient=null;
    //进行锁定双重检查
    public  static  RequestClient getInstance(){
        if(mRequestClient==null){
            synchronized (RequestClient.class){
                if(mRequestClient==null){
                    mRequestClient=new RequestClient();
                }
            }
        }
        return mRequestClient;
    }




    private void init(){
        //进行初始化请求客户端








    }




















}
