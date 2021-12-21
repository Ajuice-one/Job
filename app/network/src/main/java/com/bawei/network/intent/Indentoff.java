package com.bawei.network.intent;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 16:14
 * 用途：
 */
class Indentoff {
    //判断网络连接
    public static boolean IntentIsOk(Context context){
        ConnectivityManager systemService = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = systemService.getActiveNetworkInfo();
        if (activeNetworkInfo!=null){
            return true;
        }else {
            return false;
        }
    }
}
