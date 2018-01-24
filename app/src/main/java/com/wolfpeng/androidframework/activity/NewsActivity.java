package com.wolfpeng.androidframework.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.androidframework.adapter.ViewPagerAdapter;
import com.wolfpeng.androidframework.base.BaseToolBarActivity;
import com.wolfpeng.androidframework.fragment.NewsFragment;
import com.wolfpeng.comlibrary.base.ComLibraryApplication;
import com.wolfpeng.comlibrary.view.widget.NavigationBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 新闻activity
 */
public class NewsActivity extends BaseToolBarActivity {

    @BindView(R.id.navigationBar_news)
    NavigationBar navigationBarNews;
    @BindView(R.id.viewPager_news)
    ViewPager viewPagerNews;

    List<Fragment> mFragments;
    String[] mTitles = ComLibraryApplication.getApplication().getResources().getStringArray(R.array.newtitles);
    NewsFragment mNewsFragment;
    @BindView(R.id.tabLayout_news)
    TabLayout tabLayoutNews;


    @Override
    public int getLayoutId() {
        return R.layout.activity_news;
    }


    @Override
    public void onCreateAfter(Bundle savedInstanceState) {
        mFragments = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
            mNewsFragment = NewsFragment.newInstance(mTitles[i], null);
            mFragments.add(mNewsFragment);
        }
        viewPagerNews.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), mFragments));
        navigationBarNews.setmTabVisibleNumber(mTitles.length);
        navigationBarNews.setTabItemTitles(mTitles);
        navigationBarNews.setViewPager(viewPagerNews, 0);
    }

    @Override
    public void initData() {


    }

}
