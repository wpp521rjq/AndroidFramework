package com.wolfpeng.androidframework.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wolfpeng.androidframework.R;
import com.wolfpeng.androidframework.adapter.NewsAdapter;
import com.wolfpeng.androidframework.base.BaseFragment;
import com.wolfpeng.androidframework.presenter.NewsFragmentPresenter;
import com.wolfpeng.androidframework.view.NewsFragmentView;
import com.wolfpeng.comlibrary.entity.NewsEntity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class NewsFragment extends BaseFragment implements NewsFragmentView {

    private static final String ARG_PARAM1 = "param1";
    @BindView(R.id.tv_news_info)
    TextView tvNewsInfo;
    @BindView(R.id.recyclerView_news)
    RecyclerView recyclerViewNews;

    private String mParam1;
    NewsFragmentPresenter newsFragmentPresenter;
    private NewsAdapter newsAdapter;

    public NewsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewsFragment newInstance(String param1, String param2) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    public void initData(View view, @Nullable Bundle savedInstanceState) {
        tvNewsInfo.setText(mParam1);
        newsFragmentPresenter = new NewsFragmentPresenter();
        newsFragmentPresenter.attachView(this);
        //
        newsAdapter = new NewsAdapter();
        recyclerViewNews.setLayoutManager(new LinearLayoutManager(getContext()));
        newsFragmentPresenter.getNewsData(mParam1);

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        newsFragmentPresenter.detachView();
        if (newsFragmentPresenter != null) {
            newsFragmentPresenter.detachView();//view presenter分离
            newsFragmentPresenter = null;
        }
    }

    @Override
    public void onCommonSuccess(int flag) {
        //

    }

    @Override
    public void onFailure(int errorCode, String message, int flag) {


    }

    @Override
    public void showWait(String message, boolean backable, int flag) {

    }

    @Override
    public void hideWait(int flag) {

    }

    @Override
    public void onLoadSuccess(NewsEntity entity) {
        recyclerViewNews.setAdapter(newsAdapter);
        newsAdapter.setDataBeanList(entity.getData());
    }
}
