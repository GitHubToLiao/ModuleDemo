package com.example.liao.moduleb;

import android.app.Application;
import android.util.Log;

/**
 * =======================================
 * 创建日期:2019/3/6 on 15:16
 * 作   者:张辽
 * 邮   箱:Zl13484407109@sina.com
 * 描   述:
 * =======================================
 */
public class ModuleBApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("module_demo","module B application");
    }
}
