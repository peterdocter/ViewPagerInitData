package com.along.demo.pager;

import android.app.Activity;
import android.view.View;

import com.along.demo.R;
import com.along.demo.ToastUtil;

/**
 * Created by and2long on 16-8-3.
 */
public class TopPager extends BasePager{


    private View view;

    public TopPager(Activity activity) {
        super(activity);
    }


    public void initData() {
        if (view == null) {
            view = View.inflate(mActivity, R.layout.pager_top, null);
            flContent.addView(view);
            System.out.println("Create TopPager");
        }
        ToastUtil.showToast(mActivity, getClass().getSimpleName());
    }


}
