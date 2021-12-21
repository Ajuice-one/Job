package com.bawei.mvp.v;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.mvp.p.IPresenter;

public abstract
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 15:09
 * 用途：
 */
class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IView,IActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(handLayout());
        overridePendingTransition(0,0);

        initView();
        initPresenter();
        initData();
    }

    //初始化p层
    private void initPresenter(){
        if (mPresenter== null){
            mPresenter = createPresenter();
        }
        if (mPresenter!=null){
            mPresenter.bindView(this);
        }
    }

    //留于实现，创建p层
    protected P createPresenter(){
        return null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //销毁时解绑
        if (mPresenter!=null){
            mPresenter.unbindView();
            mPresenter = null;
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
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
