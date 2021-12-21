package com.bawei.network.factory;

import com.bawei.data_resource.network_type.Type;
import com.bawei.network.product.AndroidRetrofitImpl;
import com.bawei.network.product.FoodRetrofitImpl;
import com.bawei.network.product.IProduct;
import com.bawei.network.product.QuickRetrofitImpl;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:40
 * 用途：
 */
class HttpManager implements IFactroy {

    private static volatile HttpManager httpManager;
    private AndroidRetrofitImpl androidRetrofit;
    private FoodRetrofitImpl foodRetrofit;
    private QuickRetrofitImpl quickRetrofit;

    //双检测单例
    public static HttpManager getInstance() {
        if (httpManager == null) {
            synchronized (HttpManager.class) {
                if (httpManager == null) {
                    httpManager = new HttpManager();
                }
            }
        }
        return httpManager;
    }

    private HttpManager() {

    }

    @Override
    public void destroy() {
        //销毁所有已存在实例
        if (httpManager != null) {
            httpManager = null;
        }
        if (androidRetrofit != null) {
            androidRetrofit.destroy();
            androidRetrofit = null;
        }
        if (foodRetrofit != null) {
            foodRetrofit.destroy();
            foodRetrofit = null;
        }
        if (quickRetrofit != null) {
            quickRetrofit.destroy();
            quickRetrofit = null;
        }
    }

    @Override
    public IProduct getHttp(Type type) {
        //返回对应类型
        switch (type) {
            case A:
                if (androidRetrofit == null) {
                    androidRetrofit = new AndroidRetrofitImpl();
                }
                return androidRetrofit;
            case F:
                if (foodRetrofit == null) {
                    foodRetrofit = new FoodRetrofitImpl();
                }
                return foodRetrofit;
            case Q:
                if (quickRetrofit == null) {
                    quickRetrofit = new QuickRetrofitImpl();
                }
                return quickRetrofit;
        }
        return null;
    }
}
