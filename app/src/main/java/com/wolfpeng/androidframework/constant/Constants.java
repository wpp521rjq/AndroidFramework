package com.wolfpeng.androidframework.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * author：WolfWang
 * date：2017/11/7 15:12
 * e-mail：1678173987@qq.com
 * description：
 */

public class Constants {


    /**
     * 导航栏常量
     * @return
     * top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
     */
    public static List<String> getTabNameList(){
        List<String> tabNames=new ArrayList<>();
        tabNames.add("头条");
        tabNames.add("社会");
        tabNames.add("国内");
        tabNames.add("国际");
        tabNames.add("娱乐");
        tabNames.add("体育");
        tabNames.add("军事");
        tabNames.add("科技");
        tabNames.add("财经");
        tabNames.add("时尚");
        return tabNames;
    }


    public static final String IS_FIRST="isfitst";
    public static final String FLAG_TOP="top";
    public static final String FLAG_SHEHUI="shehui";
    public static final String FLAG_GUONEI="guonei";
    public static final String FLAG_GUOJI="guoji";
    public static final String FLAG_YULE="yule";
    public static final String FLAG_TIYU="tiyu";
    public static final String FLAG_JUNSHI="junshi";
    public static final String FLAG_KEJI="keji";
    public static final String FLAG_CAIJING="caijing";
    public static final String FLAG_SHISHANG="shishang";
    public static final String NEWS_APPKEY="06c24133dcbc5d1324324ed874f3ec49";



    public static String getTypeByTab(String tab){
        if(tab.equals("头条")){
            return FLAG_TOP;
        }else if(tab.equals("社会")){
            return FLAG_SHEHUI;
        }else if(tab.equals("国内")){
            return FLAG_GUONEI;
        }else if(tab.equals("国际")){
            return FLAG_GUOJI;
        }else if(tab.equals("娱乐")){
            return FLAG_YULE;
        }else if(tab.equals("体育")){
            return FLAG_TIYU;
        }else if(tab.equals("军事")){
            return FLAG_JUNSHI;
        }else if(tab.equals("科技")){
            return FLAG_KEJI;
        }else if(tab.equals("财经")){
            return FLAG_CAIJING;
        }else if(tab.equals("时尚")){
            return FLAG_SHISHANG;
        }
        return null;
    }





}
