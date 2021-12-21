package com.bawei.mvp.p;

import com.bawei.mvp.v.IView;


public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 15:01
 * 用途：
 */
interface IPresenter<V extends IView> {

    void bindView(V view);

    void unbindView();

    boolean isbingView();

    V getView();

}
