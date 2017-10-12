package io.evan.tinyuikit.app;

import android.app.Application;

import io.evan.uikit.lib.UIKitEntry;


/**
 * Created by yalez on 2016/11/22.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UIKitEntry.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        UIKitEntry.destory();
    }
}
