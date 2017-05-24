package com.zzh.magic.global;

import android.app.Application;


public class XApplication extends Application {
    private static XApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }


    public static XApplication getInstance() {
        return instance;
    }
}
