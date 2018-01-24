package com.wolfpeng.comlibrary.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wolfpeng.comlibrary.R;

import java.util.List;

/**
 * author：WolfWang
 * date：2018/1/19 09:51
 * e-mail：1678173987@qq.com
 * description：自定义导航栏
 *
 */

public class NavigationBar extends LinearLayout {


    //导航栏的字体相关属性
    private String[] mTitles;//设置导航栏的title
    private int COLOR_TEXTVIEW_NORMAL = Color.parseColor("#535353");//设置默认的导航栏字体未选中的字体颜色
    private int COLOR_TEXTVIEW_SELECTED = Color.parseColor("#1b5c9e");//设置默认的导航栏字体选中的字体颜色
    private int SIZE_TEXTVIEW = 14;//导航栏字体大小

    private Paint mPaint;//用于绘制指示器的画笔
    private Path mPath;//用于绘制指示器的长条
    private int mRectangleWidth;//矩形的宽
    private int mRectangleHeight;//矩形的高
    private static final float RATIO_RECTANGLE_WIDTH = 1 / 2f;//矩形中的宽跟其tab的比例
    private int mRectangleX;//矩形的初始位置所在
    private int mRectangleSlideX;//矩形每次滑动X的距离
    private int mTabVisibleNumber;//可见的tab数量
    private static final int TAB_VISIABLE_DEFAULT_NUMBER = 4;//默认的数量


    public NavigationBar(Context context) {
        this(context, null);
    }

    public NavigationBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initTabVisibleNumber(context, attrs);//初始化tab的数量
        initPaint();//初始化画笔
    }

    public NavigationBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    /**
     * 设置可见tab的数量
     *
     * @param context
     * @param attrs
     */
    public void initTabVisibleNumber(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.NavigationBar);//
        mTabVisibleNumber = typedArray.getInt(R.styleable.NavigationBar_tabVisiableNumber, TAB_VISIABLE_DEFAULT_NUMBER);
        SIZE_TEXTVIEW=typedArray.getInt(R.styleable.NavigationBar_tabTextViewSize,SIZE_TEXTVIEW);
        if (mTabVisibleNumber <= 0) {
            mTabVisibleNumber = TAB_VISIABLE_DEFAULT_NUMBER;

        }
    }

    /**
     * 初始化画笔
     */
    private void initPaint() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);//防止边缘锯齿化
        mPaint.setColor(Color.parseColor("#1b5c9e"));//设置画笔颜色
        mPaint.setStyle(Paint.Style.FILL);//设置画笔的样式
        mPaint.setPathEffect(new CornerPathEffect(3));//设置线的样式
    }

    /**
     * 初始化长条
     */
    private void initRectangle() {

        mPath = new Path();
        mPath.moveTo(0, 0);
        mPath.lineTo(mRectangleWidth, 0);
        mPath.lineTo(mRectangleWidth, -mRectangleHeight);
        mPath.lineTo(0, -mRectangleHeight);
        mPath.close();//关闭当前的path资源

    }


    /**
     * 获取屏幕的宽度
     */
    private int getScreenWidth() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public void setTextSize(int textSize) {
        this.SIZE_TEXTVIEW = textSize;
    }

    /**
     * 动态设置tab 的数量
     *
     * @param mTabVisibleNumber
     */
    public void setmTabVisibleNumber(int mTabVisibleNumber) {
        this.mTabVisibleNumber = mTabVisibleNumber;
    }


    /**
     *
     */

    /**
     * 绘制长方形
     * 绘制VIew本身的内容，通过调用View.onDraw(canvas)函数实现,绘制自己的孩子通过dispatchDraw（canvas）实现
     * <p>
     * 画完背景后，draw过程会调用onDraw(Canvas canvas)方法，然后就是dispatchDraw(Canvas canvas)方法,
     * dispatchDraw
     * ()主要是分发给子组件进行绘制，我们通常定制组件的时候重写的是onDraw()方法。值得注意的是ViewGroup容器组件的绘制
     * ，当它没有背景时直接调用的是dispatchDraw
     * ()方法,而绕过了draw()方法，当它有背景的时候就调用draw()方法，而draw()方法里包含了
     * dispatchDraw()方法的调用。因此要在ViewGroup上绘制东西的时候往往重写的是
     * dispatchDraw()方法而不是onDraw()方法，或者自定制一个Drawable，重写它的draw(Canvas c)和
     * getIntrinsicWidth(),getIntrinsicHeight()方法，然后设为背景
     */
    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);

        /**
         * save：用来保存Canvas的状态。save之后，可以调用Canvas的平移、放缩、旋转、错切、裁剪等操作。
         *
         * restore：用来恢复Canvas之前保存的状态。防止save后对Canvas执行的操作对后续的绘制有影响。
         *
         * save和restore要配对使用（restore可以比save少，但不能多），如果restore调用次数比save多，会引发Error。
         */
        canvas.save();
        canvas.translate(mRectangleX + mRectangleSlideX, getHeight() + 2);
        canvas.drawPath(mPath, mPaint);
        canvas.restore();
    }

    /**
     * 设置三角形的大小
     * <p>
     * onSizeChanged()在控件大小发生变化的时候调用(例如第一次初始化控件的时候) 布局过程中，
     * 先调onMeasure计算每个child的大小， 然后调用onLayout对child进行布局，
     * onSizeChanged（）是在布局发生变化时的回调函数，间接回去调用onMeasure, onLayout函数重新布局
     * onSizeChanged的启动时间在onDraw之前
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        // TODO Auto-generated method stub
        super.onSizeChanged(w, h, oldw, oldh);
        mRectangleHeight = 10;//设置长条的宽度
        mRectangleWidth = (int)getScreenWidth() / mTabVisibleNumber/2;//设置长条的长度
        // 第一个长方形的偏移位置
        mRectangleX = mRectangleWidth - mRectangleWidth / 2;
        initRectangle();//初始化长条
    }



    /**
     * 动态设置tab
     *
     * @param titles
     */
    public void setTabItemTitles(String[] titles) {
        if (titles != null && titles.length > 0) {
            this.removeAllViews();
            mTitles = titles;
            for (String title : mTitles) {
                this.addView(generateTextView(title));
            }
            setItemClickEvent();
        }
    }



    /**
     * 设置Tab的点击事件
     */
    private void setItemClickEvent(){
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            final int j = i;
            View view = getChildAt(i);
            view.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    mViewPager.setCurrentItem(j);
                }
            });
        }
    }



    /**
     * 根据title创建tab
     *
     * @param title
     * @return
     */
    private View generateTextView(String title) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams params = new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        params.width = getScreenWidth() / mTabVisibleNumber;
        textView.setText(title);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) 14.7);
        textView.setTextColor(COLOR_TEXTVIEW_NORMAL);
        textView.setLayoutParams(params);
        return textView;
    }




    public interface OnPageChangeListener {

        /**
         * This method will be invoked when the current page is scrolled, either as part
         * of a programmatically initiated smooth scroll or a user initiated touch scroll.
         *
         * @param position             Position index of the first page currently being displayed.
         *                             Page position+1 will be visible if positionOffset is nonzero.
         * @param positionOffset       Value from [0, 1) indicating the offset from the page at position.
         * @param positionOffsetPixels Value in pixels indicating the offset from position.
         */
        void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

        /**
         * This method will be invoked when a new page becomes selected. Animation is not
         * necessarily complete.
         *
         * @param position Position index of the new selected page.
         */
        void onPageSelected(int position);

        /**
         * Called when the scroll state changes. Useful for discovering when the user
         * begins dragging, when the pager is automatically settling to the current page,
         * or when it is fully stopped/idle.
         *
         * @param state The new scroll state.
         * @see ViewPager#SCROLL_STATE_IDLE
         * @see ViewPager#SCROLL_STATE_DRAGGING
         * @see ViewPager#SCROLL_STATE_SETTLING
         */
        void onPageScrollStateChanged(int state);
    }

    public OnPageChangeListener mListener;
    // 接收关联的ViewPager
    private ViewPager mViewPager;

    public void setViewPagerOnPageChangeListener(OnPageChangeListener listener) {
        mListener = listener;
    }


    public void setViewPager(ViewPager viewPager, int position) {

        this.mViewPager = viewPager;

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //滑动的时候
                // 长条跟随ViewPager移动的距离就是：
                // tabWidth*positionOffset+position*tabWidth
                scroll(position, positionOffset);
                if (mListener != null) {
                    mListener.onPageScrolled(position, positionOffset
                            , positionOffsetPixels);
                }


            }

            @Override
            public void onPageSelected(int position) {

                //被选中的时候
                if (mListener != null) {
                    mListener.onPageSelected(position);
                }
                //设置字体变色
                changeTextViewColor(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

                //滑动结束之后

            }
        });
        mViewPager.setCurrentItem(position);
        changeTextViewColor(position);
    }

    /**
     * 长条随着滑动的时候
     * @param position
     * @param positionOffset
     */
    private void scroll(int position, float positionOffset) {
        int tabWidth = getWidth() / mTabVisibleNumber;
        mRectangleSlideX = (int) (tabWidth * (positionOffset + position));

        /**
         * 容器移动,在tab处于移动至最后一个时
         */
        if (position >= (mTabVisibleNumber - 2) && positionOffset > 0
                && getChildCount() > mTabVisibleNumber) {

            if (mTabVisibleNumber != 1) {
                this.scrollTo((position - (mTabVisibleNumber - 2)) * tabWidth
                        + (int) (tabWidth * positionOffset), 0);
            } else {
                this.scrollTo(position * tabWidth
                        + (int) (tabWidth * positionOffset), 0);
            }
        }

        // 位置发生改变，要进行重绘
        /**
         * invalidate的意思是“使无效”，其实就是使窗口无效。 使当前的窗口无效的目的就是让Windows知道这个窗口现在该重新绘制一下了。
         * 所以任何时候当你想 擦除 并 绘制窗口的时候，就可以在别的函数中完成功能代码之后Invalidate()一下。OnDraw马上就会被调用了。
         * 但是不要在OnDraw, OnPaint中用
         */
        invalidate();
    }

    /**
     * 当滑动到某个地方之后使某个字体变色
     *
     * @param position
     */
    private void changeTextViewColor(int position) {
        resetTextViewColor();
        View view = getChildAt(position);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(COLOR_TEXTVIEW_SELECTED);
        }
    }

    /**
     * 重置textview字体 颜色
     */
    private void resetTextViewColor() {
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(COLOR_TEXTVIEW_NORMAL);
                ((TextView) view).setTextSize(SIZE_TEXTVIEW);
            }
        }
    }



    /**
     * xml加载完成之后，回调此方法
     *
     * 设置每个tab的LayoutParams
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }

        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            LinearLayout.LayoutParams params = (LayoutParams) view
                    .getLayoutParams();
            params.weight = 0;
            params.width = getScreenWidth() / mTabVisibleNumber;
            view.setLayoutParams(params);
        }
        setItemClickEvent();
    }


}
