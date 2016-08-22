package com.along.demo.pager;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.along.demo.R;
import com.along.demo.ToastUtil;

/**
 * Created by and2long on 16-8-3.
 */
public class AsksPager extends BasePager {

    private View view;

    public AsksPager(Activity activity) {
        super(activity);
    }


    public void initData() {
        if (view == null) {
            view = View.inflate(mActivity, R.layout.pager_asks, null);
            TextView tvAsks = (TextView) view.findViewById(R.id.tv_asks);
            tvAsks.setText("tvAsks");
            flContent.addView(view);
            System.out.println("Create AsksPager");
        }
        ToastUtil.showToast(mActivity, getClass().getSimpleName());

    }


}
