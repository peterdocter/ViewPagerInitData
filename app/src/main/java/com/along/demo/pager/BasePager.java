package com.along.demo.pager;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

import com.along.demo.R;

/**
 * Created by and2long on 16-8-3.
 */
    public class BasePager {
        public Activity mActivity;
        public View mRootView;
        public FrameLayout flContent;

        public BasePager(Activity activity) {
            mActivity = activity;
            mRootView = initView();
        }

        public View initView() {
            View view = View.inflate(mActivity, R.layout.base_pager, null);
            flContent = (FrameLayout) view.findViewById(R.id.fl_content);
            return view;
        }

        public void initData() {

        }
    }
