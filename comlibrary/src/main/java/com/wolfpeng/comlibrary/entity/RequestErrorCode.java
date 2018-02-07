package com.wolfpeng.comlibrary.entity;

/**
 * author：WolfWang
 * date：2018/2/7 11:24
 * e-mail：1678173987@qq.com
 * description：
 */

public interface RequestErrorCode {


    int REQUEST_NORMAL=0;//请求正常
    int ERROR_REQUEST_KEY=10001;//错误的请求KEY
    int NO_PERMISSION_KEY=10002;//该key无请求权限
    int OUT_OF_DATE_KEY=10003;//KEY过期
    int ERROR_OPENID=10004;//错误的openid
    int CHECK_OUT_OF_DATE=10005;//	应用未审核超时，请提交认证
    int UNKNOWN_REQUEST=10007;//	未知的请求源
    int FORBID_IP=10008;//	被禁止的IP
    int FORBID_KEY=10009;//	被禁止的KEY
    int OUT_OF_REQUEST_TIMES_IP=10011;//	当前IP请求超过限制
    int OUT_OF_REQUEST_TIMES=10012;//请求超过次数限制
    int OUT_OF_TIMES_TEST_KEY=10013;//测试KEY超过请求限制
    int ERROR_SYSTEM=10014;//	系统内部异常(调用充值类业务时，请务必联系客服或通过订单查询接口检测订单，避免造成损失)
    int INTERFACE_MAINTENANCE=10020;//	接口维护
    int INTERFACE_STOP_USE=10021;//	接口停用


}
