package com.bawei.network.product;

import com.bawei.data_resource.string.MyDataResource;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:34
 * 用途：
 */
class AndroidRetrofitImpl implements IProduct {

    private OkHttpClient build;
    private Retrofit build1;

    @Override
    public void destroy() {
        //销毁连接实例
        if (build != null) {
            build = null;
        }
        if (build1 != null) {
            build1 = null;
        }
    }

    public AndroidRetrofitImpl() {
        //构造时初始化连接
        build = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
    }

    @Override
    public Retrofit getRetrofit() {
        //返回网络实例
        return build1 = new Retrofit.Builder()
                .client(build)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(MyDataResource.WANANDROID_COM)
                .build();
    }
}
