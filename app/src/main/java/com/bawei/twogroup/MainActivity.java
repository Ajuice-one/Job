package com.bawei.twogroup;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.bawei.twogroup.weiyingqi.Test;
import com.chaychan.library.BottomBarItem;
import com.chaychan.library.BottomBarLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomBarLayout.OnItemSelectedListener {

    private FrameLayout indexActivityFramelayout;
    private BottomBarLayout indexActivityBottom;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragments = new ArrayList<>();


//        indexActivityBottom.setCurrentItem(0);
        initView();
    }

    @Override
    public void onItemSelected(BottomBarItem bottomBarItem, int previousPosition, int currentPosition) {
//        if (previousPosition == 0 && previousPosition == currentPosition && !fragments.get(currentPosition).isAdded()) {
//            getSupportFragmentManager().beginTransaction().add(R.id.index_activity_framelayout, fragments.get(currentPosition)).commit();
//        } else if (previousPosition != currentPosition && !fragments.get(currentPosition).isAdded()) {
//            getSupportFragmentManager().beginTransaction().hide(fragments.get(previousPosition)).add(R.id.index_activity_framelayout, fragments.get(currentPosition)).commit();
//        } else if (previousPosition != currentPosition) {
//            getSupportFragmentManager().beginTransaction().hide(fragments.get(previousPosition)).show(fragments.get(currentPosition)).commit();
//        }
    }

    private void initView() {
        indexActivityFramelayout = (FrameLayout) findViewById(R.id.index_activity_framelayout);
        indexActivityBottom = (BottomBarLayout) findViewById(R.id.index_activity_bottom);

        indexActivityBottom.setOnItemSelectedListener(this);

        Test.test();

    }
}