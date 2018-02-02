package com.wolfpeng.androidframework.view;

import com.wolfpeng.androidframework.base.mvp.IBaseMVPView;
import com.wolfpeng.comlibrary.entity.NewsEntity;


/**
 * author：WolfWang
 * date：2018/1/24 16:28
 * e-mail：1678173987@qq.com
 * description：newsfragmentview
 *
 */

public interface NewsFragmentView extends IBaseMVPView {

      int DOWN_REFRESH=1;//下拉刷新
      int UP_LOAD=2;//上啦加载



      void onLoadSuccess(NewsEntity entity);


}
