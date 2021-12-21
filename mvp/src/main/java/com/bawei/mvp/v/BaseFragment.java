package com.bawei.mvp.v;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.mvp.p.IPresenter;

import org.jetbrains.annotations.NotNull;

public abstract
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 15:15
 * 用途：
 */
class BaseFragment<P extends IPresenter> extends Fragment implements IView,IFragment {
    protected P mPresenter;
    private View inflate;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        //赋值布局
        return inflate= inflater.inflate(handLayout(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initPresenter();
        initData();
    }

    private void initPresenter(){
        if (mPresenter== null){
            mPresenter = createPresenter();
        }
        if (mPresenter!=null){
            mPresenter.bindView(this);
        }
    }

    protected P createPresenter(){
        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter!=null){
            mPresenter.unbindView();
            mPresenter = null;
        }
    }

    @Override
    public <V extends View> V findViewById(int id) {
        //查找布局子控件
        return inflate.findViewById(id);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        //打印日志
        Log.i("____","开始加载");
    }

    @Override
    public void hideLoading() {
        //打印日志
        Log.i("____","结束加载");
    }
}
