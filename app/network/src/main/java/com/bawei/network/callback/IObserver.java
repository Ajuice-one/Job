package com.bawei.network.callback;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 16:06
 * 用途：
 */
interface IObserver<T> {
    void success(T bean);
    void fail(String errorMsg);
}
