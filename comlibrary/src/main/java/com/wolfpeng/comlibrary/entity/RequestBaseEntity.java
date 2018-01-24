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
    private String error_code;//错误码


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

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }


    @Override
    public String toString() {
        return "RequestBaseEntity{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code='" + error_code + '\'' +
                '}';
    }
}
