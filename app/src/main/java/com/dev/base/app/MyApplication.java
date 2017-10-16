package com.dev.base.app;

import android.app.Application;

import com.dev.base.model.db.DaoManager;
import com.dev.base.model.net.RetrofitUtil;
import com.dev.base.util.CrashLogUtil;
import com.dev.base.util.FrescoUtil;
import com.dev.base.util.ToastUtil;
import com.dev.base.util.log.LogUtil;

/**
 * author:  ljy
 * date:    2017/9/13
 * description: 全局初始化操作
 */

public class MyApplication extends Application {
    private static MyApplication instance;
    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        ToastUtil.init(this);//初始化吐司
        LogUtil.init(true);//初始化Log打印
        CrashLogUtil.getInstance().init(this);//初始化崩溃输出
        RetrofitUtil.init(this);//初始化retrofit
        FrescoUtil.getInstance().initializeFresco(this);//初始化Fresco
        DaoManager.getInstance().init(this);//初始化数据库Dao管理类
    }





}