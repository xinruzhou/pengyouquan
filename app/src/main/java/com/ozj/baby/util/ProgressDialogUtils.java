package com.ozj.baby.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.avos.avoscloud.LogUtil;


public class ProgressDialogUtils {

    private static ProgressDialog progressDialog;

    private static void initProgressDialog(Context context) {
        progressDialog = new LoadingProgressDialog(context);
        progressDialog.setCanceledOnTouchOutside(false);
    }


    public static void showProgress(Context context) {
        try {
            initProgressDialog(context);
            progressDialog.show();
        } catch (Throwable e) {
            Log.e("111111",""+e.toString());
        }
    }

    public static void dismissProgress() {
        try {
            progressDialog.dismiss();
        } catch (Throwable e) {
        }
    }


}
