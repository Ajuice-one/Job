package com.bawei.mvp.p;

import com.bawei.mvp.m.IModel;
import com.bawei.mvp.v.IView;

import java.lang.ref.WeakReference;

public abstract
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 15:02
 * 用途：
 */
class BasePresenter<V extends IView, M extends IModel> implements IPresenter<V> {
    private WeakReference<V> weakReference;
    protected M mModel;

    @Override
    public void bindView(V view) {
        //判断为空情况下将数据初始化
        if (!isbingView()) {
            weakReference = new WeakReference<>(view);
            mModel = createModel();
        }
    }

    //留于实现
    protected abstract M createModel();

    @Override
    public void unbindView() {
        //如果已经绑定就解绑
        if (isbingView()) {
            weakReference.clear();
            weakReference = null;

            mModel.destroy();
            mModel = null;

        }
    }

    @Override
    public boolean isbingView() {
        //是否绑定
        return weakReference != null && weakReference.get() != null;
    }

    @Override
    public V getView() {
        //得到v层
        if (isbingView()) {
            return weakReference.get();
        }
        return null;
    }
}
