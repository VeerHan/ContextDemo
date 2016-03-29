package com.leohan.demo;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication application = (MyApplication) getApplication();
        Context applicationContext = getApplicationContext();
        Context baseContext = getBaseContext();

        Log.d(TAG, "application = " + application);
        Log.d(TAG, "applicationContext = " + applicationContext);
        Log.d(TAG, "MyApplication.getInstance() = " + MyApplication.getInstance());
        Log.d(TAG, "baseContext = " + baseContext);
    }
}
