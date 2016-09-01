package com.example.hoyeon.dbtest2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hoyeon on 2016-09-01.
 */
public class customTabbar extends TabLayout{


    public customTabbar(Context context) {
        super(context);
    }

    public customTabbar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public customTabbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void addTab( Tab tab) {
        super.addTab(tab);

        ViewGroup mainView = (ViewGroup)getChildAt(0);
        ViewGroup tabView = (ViewGroup)mainView.getChildAt(tab.getPosition());

        int tabChiledCount = tabView.getChildCount();
        for(int i = 0; i <= tabChiledCount; i++){
            View tabViewChild = tabView.getChildAt(i);
        }



    }
}
