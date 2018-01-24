package com.wolfpeng.androidframework.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.androidframework.adapter.TabLayoutFragmentStatePagerAdapter;
import com.wolfpeng.androidframework.base.BaseToolBarActivity;
import com.wolfpeng.androidframework.fragment.NewsFragment;
import com.wolfpeng.comlibrary.base.ComLibraryApplication;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 新闻activity
 */
public class NewsActivity extends BaseToolBarActivity {

    @BindView(R.id.viewPager_news)
    ViewPager viewPagerNews;

    List<Fragment> mFragmentList;
    String[] mTitles = ComLibraryApplication.getApplication().getResources().getStringArray(R.array.newtitles);
    @BindView(R.id.tabLayout_news)
    TabLayout tabLayoutNews;


    @Override
    public int getLayoutId() {
        return R.layout.activity_news;
    }


    @Override
    public void onCreateAfter(Bundle savedInstanceState) {
        mFragmentList=new ArrayList<>();

        for (int i=0;i<mTitles.length;i++){
            mFragmentList.add(NewsFragment.newInstance(mTitles[i],null));
        }
        TabLayoutFragmentStatePagerAdapter tabAdapter=new TabLayoutFragmentStatePagerAdapter(getSupportFragmentManager(),mTitles);
        //进行设置adapter
        tabAdapter.setmFragmentList(mFragmentList);
        viewPagerNews.setAdapter(tabAdapter);
        tabLayoutNews.setupWithViewPager(viewPagerNews);
        tabLayoutNews.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerNews.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPagerNews.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPagerNews.setCurrentItem(tab.getPosition());
            }
        });

    }

    @Override
    public void initData() {


    }

    @NonNull
    @Override
    protected String getTitleString() {
        return "云曦新闻";
    }
}
