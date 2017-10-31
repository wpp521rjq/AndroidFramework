package com.wolfpeng.androidframework.base;

import com.kaopiz.kprogresshud.KProgressHUD;

/**
 * author：WolfWang
 * date：2017/10/31 14:05
 * e-mail：1678173987@qq.com
 * description：
 */

public interface IWaitDialog {

    /**
     * 隐藏等待提示框
     */
    void hideWaitDialog();

    /**
     * 显示等待提示框，
     * @param text 等待提示框中的text ,
     * @param backable 是否能够返回
     */
    KProgressHUD showWaitDialog(String text, boolean backable);




    KProgressHUD showWaitDialogWithProgress(String text,boolean backable,int progress);


    void hideWaitDialogWithProgress();


}
