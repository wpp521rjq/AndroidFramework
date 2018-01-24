package com.wolfpeng.androidframework.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * author：WolfWang
 * date：2018/1/24 11:39
 * e-mail：1678173987@qq.com
 * description：横向滑动的tab 栏 与fragment 之间的适配
 */

public class TabLayoutFragmentStatePagerAdapter extends FragmentStatePagerAdapter{


    List<Fragment> mFragmentList;//fragment list 列表
    String[] mTitles;//titles


    public TabLayoutFragmentStatePagerAdapter(FragmentManager fm,String[] titles) {
        super(fm);
        this.mTitles=titles;
    }


    public List<Fragment> getmFragmentList() {
        return mFragmentList;
    }

    public void setmFragmentList(List<Fragment> mFragmentList) {
        this.mFragmentList = mFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList==null?0:mFragmentList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
