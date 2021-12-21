package com.bawei.mvp.v;

import androidx.annotation.LayoutRes;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:58
 * 用途：
 */
interface IActivity {
    @LayoutRes
    int handLayout();
    void initView();
    void initData();
}
