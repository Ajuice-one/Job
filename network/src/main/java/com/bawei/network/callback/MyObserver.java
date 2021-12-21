package com.bawei.network.callback;

import android.util.Log;
import android.widget.Toast;

import com.bawei.data_resource.bean.base.BaseBean;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 16:07
 * 用途：
 */
class MyObserver<T> implements Observer<T>,IObserver<T> {

    @Override
    public void onNext(@org.jetbrains.annotations.NotNull T tBaseBean) {
        success(tBaseBean);
    }

    @Override
    public void onError(@org.jetbrains.annotations.NotNull Throwable e) {
        fail(e.getMessage());
    }

}
