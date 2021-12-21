package com.bawei.mvp.m;

import com.bawei.network.factory.HttpManager;

public abstract
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:00
 * 用途：
 */
class BaseModel implements IModel {

    //持有网络管理者
    protected HttpManager mhttpManager;

    public BaseModel() {
        //构造时赋值
        if (mhttpManager == null) {
            mhttpManager = HttpManager.getInstance();
        }
    }

    @Override
    public void destroy() {
        if (mhttpManager != null) {
            mhttpManager.destroy();
            mhttpManager = null;
        }
    }
}
