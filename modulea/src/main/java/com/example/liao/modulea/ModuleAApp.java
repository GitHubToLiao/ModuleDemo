package com.example.liao.modulea;

import android.app.Application;
import android.util.Log;

/**
 * =======================================
 * 创建日期:2019/3/6 on 15:18
 * 作   者:张辽
 * 邮   箱:Zl13484407109@sina.com
 * 描   述:
 * =======================================
 */
public class ModuleAApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("module_demo","module a application");
    }
}
