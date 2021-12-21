package com.bawei.mvp.v;

import android.view.View;

import androidx.annotation.IdRes;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 15:09
 * 用途：
 */
interface IFragment extends IActivity {
    <V extends View> V findViewById(@IdRes int id);
}
