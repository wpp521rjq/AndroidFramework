package com.wolfpeng.comlibrary.entity;

/**
 * author：WolfWang
 * date：2017/9/29 15:38
 * e-mail：1678173987@qq.com
 * description：数据成功返回的数据结构
 */

public class RequestBaseEntity<T> {

    private String reason;
    private T result;
    private int error_code;//错误码
    private String resultcode;//旧版本的返回的失败码


//    {"resultcode":"101","reason":"错误的请求KEY!","result":null,"error_code":10001}


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int  getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public boolean isSuccess(){
        return getError_code()==RequestErrorCode.REQUEST_NORMAL;
    }

    @Override
    public String toString() {
        return "RequestBaseEntity{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code='" + error_code + '\'' +
                ", resultcode='" + resultcode + '\'' +
                '}';
    }
}
