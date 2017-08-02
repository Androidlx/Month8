package com.example.lixin.xutils3;

import android.app.Application;


/**
 * Created by hua on 2017/8/2.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
