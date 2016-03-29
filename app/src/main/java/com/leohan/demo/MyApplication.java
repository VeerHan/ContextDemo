package com.leohan.demo;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by Leo on 16/3/29.
 */
public class MyApplication extends Application {

    private static final String TAG = "test";

    private static MyApplication app;

    /*public MyApplication() {
        String packageName = getPackageName();
        Log.d(TAG, "package name is " + packageName);
        // Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'java.lang.String android.content.Context.getPackageName()' on a null object reference
    }*/

    public static MyApplication getInstance() {
        return app;
    }

    @Override
    protected void attachBaseContext(Context base) {
        // 在这里调用Context的方法会崩溃
        super.attachBaseContext(base);
        // 在这里可以正常调用Context的方法
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
