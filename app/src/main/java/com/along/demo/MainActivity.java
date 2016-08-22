package com.along.demo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import com.along.demo.pager.AsksPager;
import com.along.demo.pager.BasePager;
import com.along.demo.pager.HostPager;
import com.along.demo.pager.TopPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * ViewPager内将数据初始化分离出来；
 * 当滑动到某个界面时才进行初始化数据。
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.viewpager)
    ViewPager viewpager;
    private List<BasePager> mPagers;
    private String[] tabs = {"Host", "Top", "Asks"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mPagers = new ArrayList<>();
        mPagers.add(new HostPager(this));
        mPagers.add(new TopPager(this));
        mPagers.add(new AsksPager(this));

        viewpager.setAdapter(new MyAdapter());
        tablayout.setupWithViewPager(viewpager);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mPagers.get(position).initData();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mPagers.get(0).initData();

    }

    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mPagers.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            BasePager pager = mPagers.get(position);
            View view = pager.mRootView;

            container.addView(view);

            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }
}
