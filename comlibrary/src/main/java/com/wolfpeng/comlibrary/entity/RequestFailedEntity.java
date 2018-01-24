package com.wolfpeng.comlibrary.entity;

import android.widget.TextView;

/**
 * author：WolfWang
 * date：2017/9/26 15:22
 * e-mail：1678173987@qq.com
 * description：
 */

public class RequestFailedEntity<T> {

    private String reason;
    private T result;
    private String error_code;


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
}
