package com.along.demo;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static Toast mToast = null;

    public static void showToast(Context context, String text) {
        if (mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }
}




