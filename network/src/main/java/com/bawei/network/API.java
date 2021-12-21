package com.bawei.network;

import com.bawei.data_resource.bean.FoodBean;
import com.bawei.data_resource.bean.GiftBean;
import com.bawei.data_resource.bean.QuickBean;
import com.bawei.data_resource.bean.WanAndroidBean;
import com.bawei.data_resource.bean.base.BaseBean;
import com.bawei.data_resource.string.MyDataResource;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 19:44
 * 用途：
 */
interface API {

    //注册
    @POST(MyDataResource.WANANDROID_REGISTER)
    @FormUrlEncoded
    Observable<BaseBean<WanAndroidBean>> register_api(
            @Field("username") String username,
            @Field("password") String password,
            @Field("repassword") String repassword);

    //登陆
    @POST(MyDataResource.WANANDROID_LOGIN)
    @FormUrlEncoded
    Observable<BaseBean<WanAndroidBean>> login_api(
            @Field("username") String username,
            @Field("password") String password);

    //大虾串
    @GET(MyDataResource.DXC_DATA)
    Observable<BaseBean<List<FoodBean>>> food_api(
            @Query("stage_id") int stage_id,
            @Query("limit") int limit,
            @Query("limit") int page);

    //快手视频
    @GET(MyDataResource.QUICK_DATA)
    Observable<BaseBean<List<QuickBean>>> quick_vedio_api(
            @Query("currentPage") int currentPage,
            @Query("pageSize") int pageSize);

    //礼物
    @GET(MyDataResource.QUICK_GIFT)
    Observable<BaseBean<List<GiftBean>>> quick_gift_api();


}
