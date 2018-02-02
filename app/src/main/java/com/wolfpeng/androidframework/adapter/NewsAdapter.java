package com.wolfpeng.androidframework.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wolfpeng.androidframework.R;
import com.wolfpeng.comlibrary.entity.NewsEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * author：WolfWang
 * date：2018/2/1 15:21
 * e-mail：1678173987@qq.com
 * description：新闻适配器
 * 重写getItemViewType,通过其返回不同的页面
 */

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {



    private List<NewsEntity.DataBean> dataBeanList;

    private final int IMAGE_ONE = 1;//一张图片
    private final int IMAGE_TWO = 2;//两张图片
    private final int IMAGE_THREE = 3;//三张图片
    private final int IMAGE_DEFAULT = 0;//默认的

    public List<NewsEntity.DataBean> getDataBeanList() {
        return dataBeanList;
    }

    //
    public void setDataBeanList(List<NewsEntity.DataBean> dataBeanList) {
        this.dataBeanList = dataBeanList;
        notifyDataSetChanged();//notify
    }

    public void addAllDataBeanList(List<NewsEntity.DataBean> dataBeanList){
        this.dataBeanList.addAll(dataBeanList);
        notifyDataSetChanged();//notity
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //进行多重选择
        RecyclerView.ViewHolder viewHolder;
        switch (viewType) {
            case IMAGE_ONE:
                viewHolder = new NewsOnePictureViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_onepic, parent, false));
                break;
            case IMAGE_TWO:
                viewHolder = new NewsTwoPictureViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_twopic, parent, false));
                break;
            case IMAGE_THREE:
                viewHolder = new NewsThreePictureViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_threepic, parent, false));
                break;
            default:
                viewHolder = new NewsOnePictureViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_onepic, parent, false));
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (holder.getItemViewType()) {
            case IMAGE_ONE:
                NewsOnePictureViewHolder holder1= (NewsOnePictureViewHolder) holder;
                holder1.simpleDraweeViewItemNewsPic1.setImageURI(dataBeanList.get(position).getThumbnail_pic_s());
                holder1.tvItemNewsPic1Title.setText(dataBeanList.get(position).getTitle());
                holder1.tvItemNewsPic1Time.setText(dataBeanList.get(position).getDate());
                holder1.tvItemNewsPic1Authorname.setText(dataBeanList.get(position).getAuthor_name());
                break;
            case IMAGE_TWO:
                NewsTwoPictureViewHolder holder2= (NewsTwoPictureViewHolder) holder;
                holder2.simpleDraweeViewItemNewsPic201.setImageURI(dataBeanList.get(position).getThumbnail_pic_s());
                holder2.simpleDraweeViewItemNewsPic202.setImageURI(dataBeanList.get(position).getThumbnail_pic_s02());
                holder2.tvItemNewsPic2Title.setText(dataBeanList.get(position).getTitle());
                holder2.tvItemNewsPic02Time.setText(dataBeanList.get(position).getDate());
                holder2.tvItemNewsPic02Authorname.setText(dataBeanList.get(position).getAuthor_name());
                break;
            case IMAGE_THREE:
                NewsThreePictureViewHolder holder3= (NewsThreePictureViewHolder) holder;
                holder3.simpleDraweeViewItemNewsPic301.setImageURI(dataBeanList.get(position).getThumbnail_pic_s());
                holder3.simpleDraweeViewItemNewsPic302.setImageURI(dataBeanList.get(position).getThumbnail_pic_s02());
                holder3.simpleDraweeViewItemNewsPic303.setImageURI(dataBeanList.get(position).getThumbnail_pic_s03());
                holder3.tvItemNewsPic3Title.setText(dataBeanList.get(position).getTitle());
                holder3.tvItemNewsPic03Time.setText(dataBeanList.get(position).getDate());
                holder3.tvItemNewsPic03Authorname.setText(dataBeanList.get(position).getAuthor_name());
                break;
            case IMAGE_DEFAULT:
                break;
        }


    }

    @Override
    public int getItemCount() {
        return dataBeanList == null ? 0 : dataBeanList.size();
    }

    /**
     * 根据图片数量进行判断
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        if (TextUtils.isEmpty(dataBeanList.get(position).getThumbnail_pic_s())) {
            return IMAGE_DEFAULT;
        } else if (TextUtils.isEmpty(dataBeanList.get(position).getThumbnail_pic_s02())){
            return IMAGE_ONE;
        } else if (TextUtils.isEmpty(dataBeanList.get(position).getThumbnail_pic_s03())) {
            return IMAGE_TWO;
        } else {
            return IMAGE_THREE;
        }
    }

    public class NewsOnePictureViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.simpleDraweeView_item_news_pic1)
        SimpleDraweeView simpleDraweeViewItemNewsPic1;
        @BindView(R.id.tv_item_news_pic1_title)
        TextView tvItemNewsPic1Title;
        @BindView(R.id.tv_item_news_pic1_time)
        TextView tvItemNewsPic1Time;
        @BindView(R.id.tv_item_news_pic1_authorname)
        TextView tvItemNewsPic1Authorname;

        public NewsOnePictureViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public class NewsTwoPictureViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_item_news_pic2_title)
        TextView tvItemNewsPic2Title;
        @BindView(R.id.simpleDraweeView_item_news_pic2_01)
        SimpleDraweeView simpleDraweeViewItemNewsPic201;
        @BindView(R.id.simpleDraweeView_item_news_pic2_02)
        SimpleDraweeView simpleDraweeViewItemNewsPic202;
        @BindView(R.id.ll_news_pic2_pic)
        LinearLayout llNewsPic2Pic;
        @BindView(R.id.tv_item_news_pic02_time)
        TextView tvItemNewsPic02Time;
        @BindView(R.id.tv_item_news_pic02_authorname)
        TextView tvItemNewsPic02Authorname;
        @BindView(R.id.ll_news_list_bottom)
        LinearLayout llNewsListBottom;

        public NewsTwoPictureViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public class NewsThreePictureViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_item_news_pic3_title)
        TextView tvItemNewsPic3Title;
        @BindView(R.id.simpleDraweeView_item_news_pic3_01)
        SimpleDraweeView simpleDraweeViewItemNewsPic301;
        @BindView(R.id.simpleDraweeView_item_news_pic3_02)
        SimpleDraweeView simpleDraweeViewItemNewsPic302;
        @BindView(R.id.simpleDraweeView_item_news_pic3_03)
        SimpleDraweeView simpleDraweeViewItemNewsPic303;
        @BindView(R.id.ll_news_pic3_pic)
        LinearLayout llNewsPic3Pic;
        @BindView(R.id.tv_item_news_pic03_time)
        TextView tvItemNewsPic03Time;
        @BindView(R.id.tv_item_news_pic03_authorname)
        TextView tvItemNewsPic03Authorname;
        @BindView(R.id.ll_news_list_bottom3)
        LinearLayout llNewsListBottom3;
        public NewsThreePictureViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
