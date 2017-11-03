package com.wolfpeng.comlibrary.utils;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/**
 * author：WolfWang
 * date：2017/11/2 15:26
 * e-mail：1678173987@qq.com
 * description：
 */

public class ViewUtils {


    /**
     * Set view alpha
     * 设置透明度
     *
     * @param view  view
     * @param alpha alpha value
     */
    public static void setAlpha(View view, float alpha) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            view.setAlpha(alpha);
        } else {
            Drawable drawable = view.getBackground();
            if (drawable != null) {
                drawable.setAlpha((int) (alpha * 255));
            }
        }
    }


}
