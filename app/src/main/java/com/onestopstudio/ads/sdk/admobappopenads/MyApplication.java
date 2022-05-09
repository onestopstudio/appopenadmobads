package com.onestopstudio.ads.sdk.admobappopenads;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.onestopstudio.ads.sdk.library.AppOpenManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

        new AppOpenManager(this, "ca-app-pub-3940256099942544/3419835294");

    }

}
