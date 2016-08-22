package com.along.demo.pager;

import android.app.Activity;
import android.view.View;

import com.along.demo.R;
import com.along.demo.ToastUtil;

/**
 * Created by and2long on 16-8-3.
 */
public class HostPager extends BasePager{


    private View view;

    public HostPager(Activity activity) {
        super(activity);
    }

    public void initData(){
        if (view == null) {
            view = View.inflate(mActivity, R.layout.pager_host, null);
            flContent.addView(view);
            System.out.println("Create HostPager");
        }
        ToastUtil.showToast(mActivity, getClass().getSimpleName());
    }


}
